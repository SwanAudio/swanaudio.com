import { NgModule }      from '@angular/core'
import { BrowserModule, Title } from '@angular/platform-browser'
import { FormsModule }   from '@angular/forms'
import { HttpModule }    from '@angular/http'

/* Routing */
import { RoutingModule } from './routing.module'

/* Analytics */
import { Angulartics2Module, Angulartics2GoogleAnalytics } from 'angulartics2'

/* Components */
import { AboutComponent }           from './components/about.component'
import { AppComponent }             from './components/swanaudio.component'
import { ContactComponent }         from './components/contact.component'
import { RecentTweetsComponent }    from './components/recent-tweets.component'
import { RecentInstagramComponent } from './components/recent-instagram.component'
import { PrivacyComponent }         from './components/privacy.component'
import { ProductNavComponent }      from './components/product-nav.component'
import { ProductDetailComponent }   from './components/product-detail.component'
import { ProductListComponent }     from './components/product-list.component'
import { NewsletterSignupComponent} from './components/newsletter-signup.component'
import { ServicesComponent }        from './components/services.component'
import { LandingComponent }         from './components/landing.component'
import { TermsComponent }           from './components/terms.component'

/* Services */
import { InstagramService }         from './services/instagram.service'
import { ProductService }           from './services/product.service'
import { TwitterService }           from './services/twitter.service'

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RoutingModule,
    Angulartics2Module.forRoot([Angulartics2GoogleAnalytics]),
  ],
  declarations: [
    AboutComponent,
    AppComponent,
    ContactComponent,
    RecentTweetsComponent,
    RecentInstagramComponent,
    LandingComponent,
    ProductNavComponent,
    ProductDetailComponent,
    ProductListComponent,
    NewsletterSignupComponent,
    ServicesComponent,
    PrivacyComponent,
    TermsComponent,
  ],
  providers: [
    Title,
    InstagramService,
    ProductService,
    TwitterService,
  ],
  bootstrap: [ AppComponent ],
})
export class AppModule { }
