import { Component, OnInit } from '@angular/core'

import { InstagramService } from '../services/instagram.service'

@Component({
  selector: 'recent-instagram',
  templateUrl: 'assets/templates/recent-instagram.html',
  styleUrls: [ 'assets/stylesheets/recent-instagram.min.css' ],
})
export class RecentInstagramComponent implements OnInit {
  public images: any[]

  constructor(private instagramService: InstagramService) {}

  public ngOnInit(): void {
    this.instagramService.recent()
      .then(images => this.images = images)
  }
}
