import { Injectable }   from '@angular/core';
import { HttpClient }   from '@angular/common/http';
import { Observable  }   from 'rxjs';

import { map } from 'rxjs/operators';
import { Transaction,TransactionList } from '../models/Transaction';


@Injectable()
export class TransactionService {
  private serviceUrl = "/integration/camel/transaction";
  
  constructor(private http: HttpClient) { }
  
  getTransaction(): Observable<TransactionList> {
    
    return this.http.get<TransactionList>(this.serviceUrl)
    

  }
  
}