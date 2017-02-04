import 'rxjs/add/operator/filter'
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/mergeMap'

import { Component, OnInit } from '@angular/core'
import { Router, NavigationEnd, ActivatedRoute } from '@angular/router'
import { Title } from '@angular/platform-browser'

@Component({
  selector: 'swanaudio',
  templateUrl: 'assets/templates/swanaudio.html',
  styleUrls: [ 'assets/stylesheets/swanaudio.min.css' ],
})
export class AppComponent implements OnInit {
  public constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private titleService: Title,
  ) {}

  public ngOnInit() {
    this.router.events
      .filter(evt => evt instanceof NavigationEnd)
      .map(() => this.activatedRoute)
      .map(route => {
        while (route.firstChild) {
          route = route.firstChild
        }
        return route
      })
      .filter(route => route.outlet === 'primary')
      .mergeMap(route => route.data)
      .subscribe(evt => {
        let title = 'Swan Audio'
        if (evt.title) {
          title += ' | '
          title += evt.title
        }
        this.titleService.setTitle(title)
      })
  }

}
