import { Component, OnInit, trigger, state, transition, animate, style } from '@angular/core'
import { Router, NavigationEnd, ActivatedRoute } from '@angular/router'
import { Title } from '@angular/platform-browser'

import { Angulartics2GoogleAnalytics } from 'angulartics2'

import 'rxjs/add/operator/filter'
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/mergeMap'

@Component({
  selector: 'swanaudio',
  templateUrl: 'assets/templates/swanaudio.html',
  styleUrls: [ 'assets/stylesheets/swanaudio.min.css' ],
})
export class AppComponent implements OnInit {

  public menuState: boolean

  public constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private titleService: Title,
    //private analytics: Angulartics2GoogleAnalytics,
  ) {
    this.menuState = false
  }

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
        if ((evt as any).title) {
          title += ' | '
          title += (evt as any).title
        }
        this.titleService.setTitle(title)
      })
  }

}
