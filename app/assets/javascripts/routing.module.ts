import { NgModule }             from '@angular/core'
import { RouterModule, Routes } from '@angular/router'

import { ContactComponent }     from './components/contact.component'
import { LandingComponent }     from './components/landing.component'
import { ProductsComponent }    from './components/products.component'
import { PrivacyComponent }     from './components/privacy.component'
import { NewsComponent }        from './components/news.component'
import { ServicesComponent }    from './components/services.component'
import { TermsComponent }       from './components/terms.component'

const routes: Routes = [
  { path: 'contact',  component: ContactComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'products/:product', component: ProductsComponent, outlet: 'product' },
  { path: 'services', component: ServicesComponent },
  { path: 'news',     component: NewsComponent },
  { path: 'terms',    component: TermsComponent },
  { path: 'privacy',  component: PrivacyComponent },
  { path: '',         component: LandingComponent, pathMatch: 'full' },
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})

export class RoutingModule {}
