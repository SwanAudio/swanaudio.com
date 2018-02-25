FROM openjdk:8-jdk

ENV SBT_VERSION 1.1.0

RUN apt-get update && apt-get install apt-transport-https

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823

RUN apt-get update && \
    apt-get install -y sbt nodejs && \
    ln -s /usr/bin/nodejs /usr/bin/node

# Pre-download and cache scala
RUN sbt version

# ---

WORKDIR /src/app
COPY . /src/app

RUN sbt stage

# ---

FROM openjdk:8-jre-slim

RUN useradd -ms /bin/bash swanaudio

WORKDIR /home/swanaudio

COPY --from=0 --chown=swanaudio:swanaudio /src/app/target/universal/stage .

USER swanaudio

EXPOSE 9443

ENTRYPOINT ["bin/swanaudio"]
CMD ["-Dhttps.port=9443", "-Dconfig.file=/home/swanaudio/conf/application.conf"]
