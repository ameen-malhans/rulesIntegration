# Rules Integration Project

## About

This is a project which produces a REST API(Spring/Drools/Maven/jackson/Tomcat) that allow the users to add new rule and  get output according to rules.
To get desired output simply enter the type of the payment. The  Rule Project algorithm will display what will be result of the that payment. 

For example if you enter payment type physicalProduct, you will see output :generate a packing slip for shipping  in the results.

## How To Run

1) Import the project in IDE (Eclipse/Intellij)
2) Build project using maven "mvn clean install"
3) Launch Java Application using Tomcat Server by deploying war file
5) Go to web browsers and visit : http://localhost:8080/droolProject/api/payment/{type} where type = physicalProduct  or   book 
    
## Explaination
### 1) Assumptions :
        a) This project currently give output on the basis of the few rules mentioned in the assignment.
        b) For now ,the out put for various type of payments can been seen as:
           Example for payment type :  physicalProduct
           				{  
						   "type":"physicalProduct",
						   "output":[  
						      "Generating Packing Slip",
						      "Generate Commission Payment To Agent"
						   ]
						}
		  for payment type :  book
		  				{  
						   "type":"book",
						   "output":[  
						      "Generating Duplicate Packing Slip",
						      "Generate Commission Payment To Agent"
						   ]
						}
		  for payment type :  video
						{  
						   "type":"video",
						   "output":[  
						      "Add Free Video To Packing Slip"
						   ]
						} 
                                 

### 2) The service for rule is  :
       http://localhost:8080/droolProject/api/payment/{type}} where type = physicalProduct  or   book 
       
       example : http://localhost:8080/droolProject/api/payment/membership
        
        {SUCCESS}
        
        Response: {  
				   "type":"membership",
				   "output":[  
				      "Activate Membership",
				      "Email to owner"
				   ]
				}

### 3) Improvements :
       a) Search can be done on other parameters as well.
       b) Exception handling can be added.
