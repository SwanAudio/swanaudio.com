import { Component, OnInit } from '@angular/core'

import { ProductService } from '../services/product.service'
import { Product } from '../models/product'

@Component({
  selector: 'product-nav',
  templateUrl: 'assets/templates/product-nav.html',
})
export class ProductNavComponent implements OnInit {

  public products: Product[]

  public constructor(private productService: ProductService) {}

  public ngOnInit(): void {
    this.productService.getProducts()
      .then(products => this.products = products)
  }

}
