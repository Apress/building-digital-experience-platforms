import { Injectable }   from '@angular/core';
import { HttpClient }   from '@angular/common/http';
import { Observable  }   from 'rxjs';

import { map } from 'rxjs/operators';
import { Account,AccountList } from '../models/Account';


@Injectable()
export class AccountService {
  private serviceUrl = "/integration/camel/account";
  
  constructor(private http: HttpClient) { }
  
  getAccount(): Observable<AccountList> {
    
    return this.http.get<AccountList>(this.serviceUrl)
    

  }

  

 
  
}