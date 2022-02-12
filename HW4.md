**1** – What is JPA?

JPA is the connection between Object and Database. When we want to get object from database, we can call the object with JPA query.  The JPA query seems the SQL query but some of difference. Actually, JPA is standardization of connection between Program and relational database.

**2**- What is the naming convention for finder methods in the Spring data repository interface?

The naming convention for finder methods are camelCase structure. 

“The first part — such as *find* — is the *introducer*, and the rest — such as *ByName* — is the *criteria”*


**3** - What is PagingAndSortingRepository?

Extension of [CrudRepository](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html "interface in org.springframework.data.repository") to provide additional methods to retrieve entities using the pagination and sorting abstraction.


**4** - Differentiate between findById () and getOne () ?

findByID is returns article if searching object is exist, if it is not it returns null.

getOne is returns article if searching object is exist, if it is not it throws the UnexpectedSitutation.

**5** - What is @Query used for?

@Query uses for the accessing database in the Spring. We can filter, find or manipulate the data with @Query.

**6** - What is lazy loading in hibernate?

Hibernation can now "lazy load" children, which means that when loading the parent, it does not actually load all the children. Instead, it loads them when prompted. You can explicitly request this, and this is much more common, hibernation automatically loads them when you try to access a child.

**7** – What is SQL injection attack? Is Hibernate open to SQL injection attack?

In some situations, an attacker can escalate an SQL injection attack to compromise the underlying server or other back-end infrastructure, or perform a denial-of-service attack. That is SQL injection attack.

SQL injection attack can happen each code. It related with coding. So we can use ReadyStatement to protecting from the SQL injection attack.


**8** - What is criteria API in hibernate?

Hibernate provides alternate ways of manipulating objects and in turn data available in RDBMS tables. One of the methods is Criteria API, which allows you to build up a criteria query object programmatically where you can apply filtration rules and logical conditions.


**9** - What Is Erlang? Why Is It Required for Rabbitmq?

Erlang is a programming language used to build massively scalable soft real-time systems with requirements on high availability. Some of its uses are in telecoms, banking, e-commerce, computer telephony and instant messaging.

RabbitMQ will check for internal protocol versions of Erlang and its distributed libraries when a node joins a cluster, refusing to cluster if there's a potentially incompatible combination detected

**10** – What is the JPQL?

JPQL is the query method in JPA. We can write similar type of SQL query in the JPA with JPQL. Thus, we can add ready-made queries in addition to the already existing Select queries, Table relations, Data insertion, Data deletion, Data update.

**11** – What are the steps to persist an entity object?

Creating an entity manager from factory.

Obtaining an entity manager from factory.

Initializing an entity manager.

Persisting a data into relational database.

Closing the transaction.

Releasing the factory resources.

**12** – What are the different types of entity mapping?

One-to-One, for example, personal oxygen mask in the mining area, 1 mask using for 1 employee and 1 employee can have 1 mask.

One-to-Many, for example, 1 company has many employees but 1 employee work for 1 company.

Many-to-Many, for example, 1 person has many addresses in the e-commerce, and 1 address has many users.

**13** - What are the properties of an entity?

The data values associated with an entity consist of one or more properties. Each property has a name and one or more values. A property can have values of more than one type, and two entities can have values of different types for the same property.


**14** - Difference between CrudRepository and JpaRepository in Spring Data JPA?

CrudRepositroy is interface and extended by JPA. JPA has many methods but CrudRepository provides CRUD methods(findOne,save,etc.).


