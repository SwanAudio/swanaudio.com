import play.api.http.{ContentTypes,ContentTypeOf,Writeable}
import play.api.mvc.Codec

import io.circe.{Json,Printer}

package object controllers {

  implicit def cicreContent(implicit codec: Codec): ContentTypeOf[Json] =
    ContentTypeOf(Some(ContentTypes.JSON))

  implicit def cicreWrites(implicit codec: Codec, printer: Printer = Printer.noSpaces): Writeable[Json] =
    Writeable(json => codec.encode(json.pretty(printer)))

}
