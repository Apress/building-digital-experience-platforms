# Swagger Mocking.

#### Instal dependency by running below command 
npm install -g http-server

#### Run swager UI by running below command.
http-server swagger-editor

#### ABC Banking API specification
ABC Banking API specification folder would contains the Swagger API documentation for the application.


#### Swagger-UI
You can access the API specification by using Swagger-UI.

Step 0: 	Open (Mocking_Services\swagger-ui) folder in the source code.
Clone Swagger UI: https://github.com/swagger-api/swagger-ui
Step 1: 	Clone Swagger UI using below command.
git clone https://github.com/swagger-api/swagger-ui.git)
Step 2: 	Run ‘npm install’, you need open internet connection because this command will copy the dependency from NPM repository to you local machine.
Step 3: 	Run ‘npm start’, when server starts, it will be running on port number (3002), access the below URL.
(http://localhost:3002)

#### Swagger-Editor
You can change the API specification by editing the API specification file in the Swagger editor.

Step 1: 	Unzip swagger-editor available inside (Mocking_Services) folder in the source code.
Step 2: 	Run ‘npm install -g http-server, NPM would install the http-server modules in the local repository. 
Step 3:	 Run swagger-editor by running below command.
	“http-server swagger-editor”
Step 4:	It would run on port Number (8080) or check the log of above command and access the URL.
(http://localhost:8080/)


	