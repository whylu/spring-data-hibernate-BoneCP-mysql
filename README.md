# spring-data-hibernate-BoneCP-mysql
JPA by spring-data + hibernate + bonecp + mysql


Download and maven install
----
>git clone https://github.com/whylu/spring-data-hibernate-BoneCP-mysql.git

>cd spring-data-hibernate-BoneCP-mysql.git

>mvn install


Prepare
----
prepare a mysql DB named "spring-data-jpa" (you can name it if you like)


Configuration
----
change the conf at
> src\main\resources\db.properties

change the jdbc.driver, jdbc.url, jdbc.username, jdbc.password


Run
----
run the example
>mvn exec:java -Dexec.mainClass="demo.run.jpa.JpaExampleRunner01"

The tables "fourm", "post", "recommend", "crawlrecord" should be created and insert some data.

