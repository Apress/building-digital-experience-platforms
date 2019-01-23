# To run the ABC banking Config server, follow the below step.
Step 1:  Navigate to the source code.
(\Intergartion_Framework\ABC_Bank_Integration\Microservices\integrationConfigServer)
Step 2: Execute ‘mvn spring-boot:run ’  to start the services. 
Step 3: Hit the below URL to check the configurations.
           http://localhost:9090/config/default
	           Response would be like
{"name":"config","profiles":["default"],"label":null,"version":null,"state":null,"propertySources":[]}

#  To run the ABC banking Eureka server, follow the below step.
Step 1:  Navigate to the source code.
(\Intergartion_Framework\ABC_Bank_Integration\Microservices\integrationServiceDiretory)
Step 2: Execute ‘mvn spring-boot:run ’  to start the services. 
Step 3: Hit the below URL to check the configurations.
          http://localhost:9091/


# To run the ABC banking account services, follow the below step.
Step 1:  Navigate to the source code.
D:\DXP\Code\Intergartion_Framework\ABC_Bank_Integration\Microservices\accountService)
Step 2: Execute ‘mvn spring-boot:run ’  to start the services. 
Step 3: Hit the below URL to check the configurations.

http://localhost:8083/account/findall

Response would be 
	{"list":[{"accountNumber":10001,"balanceAmount":"200"},{"accountNumber":10002,"balanceAmount":"200"},{"accountNumber":10003,"balanceAmount":"200"}]}

# To run the ABC banking transaction services, follow the below step.
Step 1:  Navigate to the source code.
(Intergartion_Framework\ABC_Bank_Integration\Microservices\transactionService)
Step 2: Execute ‘mvn spring-boot:run ’  to start the services. 
Step 3: Hit the below URL to check the configurations.

http://localhost:8082/transaction/findall

Response would be 
					{"list":[{"accountNumber":10001,"transactionId":"800","transactionAmount":"300","balanceAmount":"200"},{"accountNumber":10002,"transactionId":"800","transactionAmount":"300","balanceAmount":"200"},{"accountNumber":10003,"transactionId":"800","transactionAmount":"300","balanceAmount":"200"}]}

# To Run the Service Integrator nativate
Step 1: To Run the Service Integrator nativate to below source code location.
(\Intergartion_Framework\ABC_Bank_Integartion\Microservices\integratorService)

Step 2: Execute ‘mvn spring-boot:run ’  to start the services. 
Step 3: Hit the below URL to check the configurations.

Account: http://localhost:8081/integrator/feign/account 
Transaction: http://localhost:8081/integrator/feign/transaction
Step 4: You can open these Microservices project in Intellij idea IDE.

