'use strict';


/**
 * Get Accounts
 *
 * account Account Return account holded by User. (optional)
 * returns ArrayOfAccountandBalance
 **/
exports.accountPOST = function(account) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "List" : [ {
    "accountNumber" : 10001,
    "balanceAmount" : 400
  }, {
    "accountNumber" : 10098,
    "balanceAmount" : 200
  }, {
    "accountNumber" : 12346,
    "balanceAmount" : 200
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get transaction
 *
 * account Account_1 Return transaction holded by account. (optional)
 * returns ArrayOfTransaction
 **/
exports.transactionPOST = function(account) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "List" : [ {
    "accountNumber" : 10001,
    "transactionId" : 1233121341,
    "transactionAmount" : 100,
    "balanceAmount" : 200
  }, {
    "accountNumber" : 10001,
    "transactionId" : 123223222411,
    "transactionAmount" : 100,
    "balanceAmount" : 200
  }, {
    "accountNumber" : 10001,
    "transactionId" : 123382211,
    "transactionAmount" : 1200,
    "balanceAmount" : 400
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

