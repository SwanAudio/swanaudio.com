import { Injectable }     from '@angular/core'
import { Http, Response } from '@angular/http'

import 'rxjs/add/operator/toPromise'

@Injectable()
export class TwitterService {

  constructor(private http: Http)  {}

  public timeline(): Promise<any[]> {
    return this.http.get('/api/twitter/timeline')
      .toPromise()
      .then((r: Response) => r.json())
      .catch(this.handleError)
  }

  private handleError(error: any): Promise<any> {
    return Promise.reject(error.message || error)
  }

}
