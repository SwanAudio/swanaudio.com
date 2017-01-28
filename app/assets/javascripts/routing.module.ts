import { NgModule }             from '@angular/core'
import { RouterModule, Routes } from '@angular/router'

import { LandingComponent }     from './components/landing.component'
import { ProductsComponent }    from './components/products.component'
import { NewsComponent }        from './components/news.component'
import { ServicesComponent }    from './components/services.component'

const routes: Routes = [
  { path: 'products', component: ProductsComponent },
  { path: 'products/:product', component: ProductsComponent, outlet: 'product' },
  { path: 'services', component: ServicesComponent },
  { path: 'news',     component: NewsComponent },
  { path: '',         component: LandingComponent, pathMatch: 'full' },
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})

export class RoutingModule {}
