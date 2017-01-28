import { NgModule }      from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { FormsModule }   from '@angular/forms'
import { HttpModule }    from '@angular/http'

/* Routing */
import { RoutingModule } from './routing.module'

/* Components */
import { AppComponent }             from './swanaudio.component'
import { RecentTweetsComponent }    from './recent-tweets.component'
import { RecentInstagramComponent } from './recent-instagram.component'
import { ProductsComponent }        from './products.component'
import { NewsComponent }            from './news.component'
import { ServicesComponent }        from './services.component'
import { LandingComponent }         from './landing.component'

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
