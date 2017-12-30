import { Component, OnInit } from '@angular/core'

import { ProductService } from '../services/product.service'
import { Product } from '../models/product'

@Component({
  selector: 'product-list',
  templateUrl: 'assets/templates/product-list.html',
  styleUrls: [ 'assets/stylesheets/product-list.min.css' ],
})
export class ProductListComponent implements OnInit {

  public products: Product[]

  public constructor(private productService: ProductService) {}

  public ngOnInit(): void {
    this.productService.getProducts()
      .then(products => this.products = products)
  }

}
