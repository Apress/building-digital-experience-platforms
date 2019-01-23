export interface Transaction {
    accountNumber: string;
    balanceAmount: string;
    transactionId: string;
    transactionAmount: string;
}

export interface TransactionList {
    List: Transaction[];
}