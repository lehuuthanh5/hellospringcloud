# hellospringcloud
This is hello world program uses Spring Cloud. </br>
**configserver**: Spring Cloud config -> need to run first (https://github.com/lehuuthanh5/springconfig - git config)</br>
**eurekaserver**: Eureka Server -> eureka clients will register to this server</br>
**restfullservice**: Eureka client -> can start 3 instances with existing config</br>
**ribbonclient**: Client to load balenced Eureka client</br>
Eureka Server with 3 instances of **ribbonclient** on ports: 9092, 9999, 8090
![alt text](https://image.ibb.co/juUoT9/eurekaserver.jpg)
Call restfullservice and will get result likes bellow:
![alt text](https://image.ibb.co/cDsWgU/restfulforfirstcall.jpg)
![alt text](https://image.ibb.co/gRjoT9/restfulfor2ndcall.jpg)
![alt text](https://image.ibb.co/czOnMU/restfulfor3rdcall.jpg)
