'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.accountPOST = function accountPOST (req, res, next) {
  var account = req.swagger.params['account'].value;
  Default.accountPOST(account)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.transactionPOST = function transactionPOST (req, res, next) {
  var account = req.swagger.params['account'].value;
  Default.transactionPOST(account)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
