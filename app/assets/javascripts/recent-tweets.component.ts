import { Component, OnInit } from '@angular/core'

import { TwitterService } from './services/twitter.service'

@Component({
  selector: 'recent-tweets',
  templateUrl: 'assets/templates/recent-tweets.html',
  styleUrls: [ 'assets/stylesheets/recent-tweets.min.css' ],
})
export class RecentTweetsComponent implements OnInit {

  public tweets: any[]

  constructor(private twitterService: TwitterService) {}

  public ngOnInit(): void {
    this.twitterService.timeline()
      .then(tweets => this.tweets = tweets)
  }

}
