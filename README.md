# litres-catalog-import
Spring Boot application to import publicly avaibale litres catalog from XML to postgreDB.

1. To compile application use mvn clean install.
application.properties file available at src\resources folder have to be updated with a valid link and credentials to access postgre DB.
2. To run application on windows please use bat file provided.
It is required to specify a path to litres catalog in xml format using "filepath" property.
The file can be downloaded from litres site using the following link: https://www.litres.ru/static/ds/detailed_data.xml.gz
The file must be extracted from an archive before importing.
3. By default application import all data to DB. It is possible to import only Authors: to do this it is required to specify "importAuthors" as an argument for "mode" property on startup.
"importBooks" value for the "mode" property means only books will be imported, meanwhile authors must be imported before books.
