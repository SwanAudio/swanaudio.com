import { NgModule }      from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { FormsModule }   from '@angular/forms'
import { HttpModule }    from '@angular/http'

/* Routing */
import { RoutingModule } from './routing.module'

/* Components */
import { AppComponent }             from './components/swanaudio.component'
import { RecentTweetsComponent }    from './components/recent-tweets.component'
import { RecentInstagramComponent } from './components/recent-instagram.component'
import { ProductsComponent }        from './components/products.component'
import { NewsComponent }            from './components/news.component'
import { ServicesComponent }        from './components/services.component'
import { LandingComponent }         from './components/landing.component'

/* Services */
import { TwitterService }           from './services/twitter.service'

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RoutingModule,
  ],
  declarations: [
    AppComponent,
    RecentTweetsComponent,
    RecentInstagramComponent,
    LandingComponent,
    ProductsComponent,
    NewsComponent,
    ServicesComponent,
  ],
  providers: [
    TwitterService,
  ],
  bootstrap: [ AppComponent ],
})
export class AppModule { }
