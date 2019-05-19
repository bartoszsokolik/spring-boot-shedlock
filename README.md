## About

Example Gradle project with Spring-Boot and Shedlock. Purpose of this project is to show Shedlock configuration for Spring-Boot application.

## Usage

To run this project build it from root with command `./gradlew clean build` and then run `docker-compose up`

After that scheduled task will be executed every minute. To be sure that postgres database is started before services shell script [wait-for-it](https://github.com/vishnubob/wait-for-it) is used. 