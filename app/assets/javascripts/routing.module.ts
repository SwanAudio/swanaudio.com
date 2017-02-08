import { NgModule }             from '@angular/core'
import { RouterModule, Routes } from '@angular/router'

import { ContactComponent }     from './components/contact.component'
import { LandingComponent }     from './components/landing.component'
import { ProductsComponent }    from './components/products.component'
import { PrivacyComponent }     from './components/privacy.component'
import { ServicesComponent }    from './components/services.component'
import { TermsComponent }       from './components/terms.component'

const routes: Routes = [
  { path: 'contact',  component: ContactComponent, data: {title: 'Contact Us'} },
  { path: 'products', component: ProductsComponent },
  { path: 'products/:product', component: ProductsComponent, outlet: 'product' },
  { path: 'services', component: ServicesComponent },
  { path: 'terms',    component: TermsComponent, data: {title: 'Terms of Use'} },
  { path: 'privacy',  component: PrivacyComponent, data: {title: 'Privacy Policy'} },
  { path: '',         component: LandingComponent, pathMatch: 'full' },
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})

export class RoutingModule {}
