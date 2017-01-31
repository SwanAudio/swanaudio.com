import { Injectable }     from '@angular/core'
import { Http, Response } from '@angular/http'

import 'rxjs/add/operator/toPromise'

import { Product } from '../models/product'

@Injectable()
export class ProductService {

  constructor(private http: Http)  {}

  public getProducts(): Promise<Product[]> {
    return this.http.get('/api/products/list')
      .toPromise()
      .then(response => response.json() as Product[])
      .catch(this.handleError)
  }

  public getProduct(id: number): Promise<Product> {
    return this.getProducts()
      .then(products => products.find(product => product.id === id))
  }

  private handleError(error: any): Promise<any> {
    return Promise.reject(error.message || error)
  }

}
