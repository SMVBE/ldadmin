LD Admin
========

About
-----

LD Admin stands for 'Liquid Democary Administration'.
It provides a set of administrative functions for liquid feedback (see http://liquidfeedback.org/).
   
 
It has been developed to support the use cases related to liquid feedback:

* accreditation / opening of a user account
* quit / end of membership
* check of delegations / delegation expiry

The functions can be executed manually, using the web frontend, or semi-/automatically, following a well defined process. 
In both cases, reports on are written and/or sent via e-mail. 



Credits
-------
* Liquid Feedback is developed by the talented team of the public software group. http://www.public-software-group.org/ Thanks for sharing your impressive work.   
* LD Admin is based AppFuse Framework http://appfuse.org. Thank you, Matt!
* The database abstraction layer has been created using jooq http://www.jooq.org/



Running the app 
---------------


0. Run "mvn jetty:run" to start LD Admin locally 
1. Run "mvn compile war:war" für test deployments
2. Run "mvn compile war:war -P prod" for live deployments. This will include the configuration under  src\main\resources\packaged into the .war archive 
3. In case the database schema of liquid feedback changes, a starting point 





Implementation
--------------

LD Admin is not der güldene Sonnenschein.

Key aspects during development were

* Liquid feedback (lf) is coded in lua. Lua is not the most widespread programming language. Lf uses its own, non standard mvc. Lf is a solid implementation of a concept for decision making. The documentation is sparse.
* A community of experts meeting (https://juliareda.eu/events/liquid-democracy-meetup/) showed the demands to
** spread of understanding (!= Herrschaftswissen)
** unite and focus implementation efforts and
** achieve better usability   

Given 

* limited resources
* the concrete use cases above 
* the idea to create a more accessible code base to multiply the number of potential volunteers that could contribute to building a liquid democracy infrastructure
* the need to comply with and be adaptive towards different privacy regulations in different organizations  

the following design decisions were made

* Organizations that use liquid feedback depend on updates of the public software group. http://www.public-software-group.org/
  Branching / changing the lua code implies patching at each update. Compatibility is a must. 
  Create a remote control for liquid feedback. 
* Use standards and a widespread programming language: Java, Spring    
* Use liquid feedback code if possible. If not possible directly, do it via an abstraction layer.
** Create a java abstraction layer of the liquid feedback postgres database. This was done using jooq http://www.jooq.org/  
* Use the API. If not existing possible, be as little invasive as possible.   
** On some operations, htmlunit is (ab)used in order to remote control liquid feedback acting as an admin user to disable user accounts. http://htmlunit.sourceforge.net/  
* Have a nice and clean user interface: Appfuse Spring Web MVC with bootstrap 
** a separate database for LD Admin is needed (separation of concerns, holds nothing but the user and roles for the LD Admin itself)
** mid- to long-term, administration support for more Tools such as etherpad, mediawiki, etc. is planned 
** Appfuse, maven and postgres don't harmonize too much. As a mysql server is present on most server setups the overhead of two databases was a



