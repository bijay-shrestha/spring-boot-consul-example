### Spring Boot with Consul

This is a simple project that demonstrates how Consul can be configured for a simple spring boot application.

# Developer note 

Before running the sample microservice run the consul agent with the following command:
[Note `-bind` must have the IP Address of your machine where tomcat server is running. In my case, it is `10.13.184.21`]

```

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=10.13.184.21

```



