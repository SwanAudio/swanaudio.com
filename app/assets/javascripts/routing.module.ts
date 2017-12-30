import { NgModule }             from '@angular/core'
import { RouterModule, Routes } from '@angular/router'

import { AboutComponent }         from './components/about.component'
import { ContactComponent }       from './components/contact.component'
import { LandingComponent }       from './components/landing.component'
import { ProductDetailComponent } from './components/product-detail.component'
import { ProductListComponent }   from './components/product-list.component'
import { PrivacyComponent }       from './components/privacy.component'
import { ServicesComponent }      from './components/services.component'
import { TermsComponent }         from './components/terms.component'

const routes: Routes = [
  { path: 'about',    component: AboutComponent, data: {title: 'About Us'} },
  { path: 'contact',  component: ContactComponent, data: {title: 'Contact Us'} },
  { path: 'products', component: ProductListComponent, data: {title: 'Products' } },
  { path: 'products/:product', component: ProductDetailComponent },
  { path: 'services', component: ServicesComponent, data: {title: 'Service'} },
  { path: 'terms',    component: TermsComponent, data: {title: 'Terms of Use'} },
  { path: 'privacy',  component: PrivacyComponent, data: {title: 'Privacy Policy'} },
  { path: '',         component: LandingComponent, pathMatch: 'full' },
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})

export class RoutingModule {}
