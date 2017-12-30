import { Component, OnInit } from '@angular/core'
import { ActivatedRoute, Params } from '@angular/router'

import { ProductService } from '../services/product.service'
import { Product } from '../models/product'

import 'rxjs/add/operator/switchMap'

@Component({
  selector: 'product',
  templateUrl: 'assets/templates/product.html',
  styleUrls: [ 'assets/stylesheets/product.min.css' ],
})
export class ProductDetailComponent implements OnInit {

  public product: Product

  public constructor(
    private route: ActivatedRoute,
    private productService: ProductService,
  ) {
    this.product = <Product> { }
  }

  public ngOnInit(): void {
    let idField = 'product'
    this.route.params
      .switchMap((params: Params) => this.productService.getProduct(params[idField]))
      .subscribe(product => this.product = product)
  }

}
