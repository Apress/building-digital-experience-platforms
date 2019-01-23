# Run Integration application 

1.)	Ensure that Swagger Mock API is working as shown in API Specification and API Mocking Section 
2.)	Navigated to the below location in the sample source code.
Intergartion_Framework\ABC_Bank_Integartion\Apache_Camel_Based_Integration\integration
3.)	Ensure that latest maven version is installed on your machine by executing below command.
(mvn  -v).
4.)	Execute the below cmd to test and run  application on local jetty server,
(mvn jetty:run -Djetty.port=8001) .
5.)	Below serves would be up and running. 
o	http://localhost:8001/integration/camel/account
o	http://localhost:8001/integration/camel/transaction

6.)	In production environment, one can deploy application war file available at location
 (\integration\target\ integration-0.0.1.war) in the application server.
7.)	You can open this application in Intellij idea IDE.
