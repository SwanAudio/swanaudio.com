import { NgModule }             from '@angular/core'
import { RouterModule, Routes } from '@angular/router'

import { LandingComponent }     from './landing.component'
import { ProductsComponent }    from './products.component'
import { NewsComponent }        from './news.component'
import { ServicesComponent }    from './services.component'

const routes: Routes = [
  { path: 'products', component: ProductsComponent },
  { path: 'services', component: ServicesComponent },
  { path: 'news',     component: NewsComponent },
  { path: '',         component: LandingComponent, pathMatch: 'full' },
]

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})

export class RoutingModule {}
