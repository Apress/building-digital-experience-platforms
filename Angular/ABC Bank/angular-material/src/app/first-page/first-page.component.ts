import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {DataSource} from '@angular/cdk/collections';
import {AccountService} from '.././services/account.service';
import { Account } from '../models/Account';
import {MatTableDataSource,MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {

  handleError;
  public dataSource;
  displayedColumns: string[] = ['accountNumber', 'balanceAmount'];
  public dataSourceList:Account[];
 
  
  constructor(private http: HttpClient, private accountService:AccountService) {
    
   }

  ngOnInit() {
    this.getAccount();
   
  }
  getAccount(){
    this.accountService.getAccount()
    .subscribe(
      (data) => {
        data.List.map(account => console.log(account)
        
        );
        this.dataSourceList =data.List
        this.dataSource  = new  MatTableDataSource(this.dataSourceList);
      },
      error => console.log(error)
      
    ); 
  }

  onRowClicked(row) {
    console.log('Row clicked: ', row);
}
  

}


