# java-sql-practice

## Database credentials:
Locally, my database credentials can be accessed like this:
1. Start vault server: `vault server -dev`
2. Get credentials from vault: `vault kv get secret/java-sql-testing/dbCreds`
3. Make sure to add the database credentials (dbUrl, dbUsername, and dbPassword) to a new file java-sql-practice/config/databaseconfig.conf

## To build:
`mvn package`

## To run:
`java -jar target\JavaSQLPractice.jar`


