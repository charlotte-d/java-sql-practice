# java-sql-practice


## To build:
1. `mvn package shade:shade`
2. `java -jar target\JavaSQLPractice.jar`

## Database credentials:
Locally, my database credentials can be accessed like this:
1. Start vault server: `vault server -dev`
2. Get credentials from vault: `vault kv get secret/java-sql-testing/dbCreds`

### To do: 
- Get maven to create the jar without having to specify the `shade` part