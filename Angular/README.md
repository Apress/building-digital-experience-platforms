# Building UI Layer

Step 1:  Navigate to source code location (Angular\ABC Bank\angular6-material).

Step 2:  Execute the "npm install" command; it would download dependency modules from
 remote to local repository .

Step 3:  Check the (proxy.conf.json) file to implement revere proxy for integrating web services while doing development
{
    "/integration/*": {
      "target": "http://localhost:8001",
      "secure": false,
      "logLevel": "debug",
      "changeOrigin": true
    }
  }

Step 4:  Run "npm start", it would start the application at below Endpoint.
(http://localhost:4200/first-page)
