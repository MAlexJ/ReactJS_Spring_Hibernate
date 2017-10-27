# ReactJS + Spring + hibernate
PostgreSQL 9.2 database added.  Please make note of these credentials:

   Root User: adminptu4kvn
   Root Password: uEQej-qqlvQS
   Database Name: blog

# Properties
db.url=jdbc:postgresql://${OPENSHIFT_POSTGRESQL_DB_HOST}:${OPENSHIFT_POSTGRESQL_DB_PORT}/${OPENSHIFT_APP_NAME}
db.username=adminptu4kvn
db.password=uEQej-qqlvQS

#Command psql
\l - list database
\dt - list table database

#Logs
tail -f jbossews/logs/store-2016-05-08.0.log
Ctrl+c -> exit

# ReactJS with Babel, Gulp and Browserify
Starter pack repository for projects with ReactJS, Babel, Gulp and Browserify

## Commands

* `cd src/main/webapp/resources/pages/`

* `npm install`
* `npm run build`
* `npm run watch`
* `npm try-last-react` - will remove current react libraries (without --save-dev), install the last ones from npm and rebuild the project. In order to reverse the project you need just run `npm install`. (By the way, it wouldn't work in windows environment)

**Usefull links**
* http://egorsmirnov.me/2015/05/22/react-and-es6-part1.html


## RUN Lite Server :

https://www.npmjs.com/package/lite-server

"scripts": {
   ........
    "dev": "lite-server",
    .....
  }

  ## Commands

  * `npm run dev`

