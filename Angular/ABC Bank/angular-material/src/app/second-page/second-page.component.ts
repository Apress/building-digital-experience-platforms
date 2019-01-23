import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {DataSource} from '@angular/cdk/collections';
import {AccountService} from '.././services/account.service';
import { Transaction, TransactionList } from '../models/Transaction';
import {MatTableDataSource} from '@angular/material';
import { TransactionService } from '../services/transaction.service';

@Component({
  selector: 'app-second-page',
  templateUrl: './second-page.component.html',
  styleUrls: ['./second-page.component.css']
})
export class SecondPageComponent implements OnInit{

  transactionList;
  handleError;
  public dataSource;
  displayedColumns: string[] = ['accountNumber', 'balanceAmount','transactionId','transactionAmount'];
  public dataSourceList:Transaction[];
 
  
  constructor(private http: HttpClient, private transactionService:TransactionService) {
    
   }

  ngOnInit() {
    this.getAccount();
   
  }
  getAccount(){
    this.transactionService.getTransaction()
    .subscribe(
      (data) => {
        data.List.map(transaction => console.log(transaction)
        
        );
        this.transactionList =data.List
        this.dataSource  = new  MatTableDataSource(this.transactionList);
      },
      error => console.log(error)
      
    ); 
  }

  onRowClicked(row) {
    console.log('Row clicked: ', row);
}
  

}


