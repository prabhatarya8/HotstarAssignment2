# HotstarAssignment2(API Creation)
Creation of mysql based RestAPI

**This project require LAMP, so first install everything before running it**

This projects uses SpringBoot for Api development

Entity
   ** -HotStar class -> this class define the structure of DB table ,I have assume that DB table name is Hotstar and it has 2 
                      fields naming storename and trayname.**
Repository
     -HotStarRepository interface -> this extends Repository interface which provide query based extraction, it has a method 
                                     which will fetch the details on the basis of a query
     
Controller
      -Hotstar Controller -> this contain the method to fetch data from mysql(using repository method)
     
 Application class -> this class basically run the project
 
 resources
      -application.properties : This property file consists property for db username, password and URL
    
    
 **Run**
 Just import the project and click on run
 
 Once it starts showing **Started Application in 6.705 seconds (JVM running for 7.752)**
 
 Open postman and hit api for Post
 
POST /hotstar HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Basic YWRtaW46YWRtaW4=
cache-control: no-cache
Postman-Token: 3750663a-14c7-436a-872c-c8f4260ee18a
{
	"showname":"admin2",
	"trayname":"admin2"
  
  
Now hit the get request
GET /hotstar/details/admin2 HTTP/1.1
Host: localhost:8080




      
      
      
 
 
    
    
