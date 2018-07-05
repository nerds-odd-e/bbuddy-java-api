# BBuddy Java Api

## Database
Installing MySQL
Or using Docker
```zsh
docker run -d -p 3306:3306 -e "MYSQL_ALLOW_EMPTY_PASSWORD=yes" -e "MYSQL_USER=nerd" -e "MYSQL_PASSWORD=dbs3cr3t" -e "MYSQL_DATABASE=bbuddy" --name "bbuddy_mysql" mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --max-allowed-packet=67108864
```

### Create dba with privileges
```zsh
mysql -uroot -h localhost -P 3306 --protocol=tcp < sql/create_default_dba.sql
```

## Run
Use this command to run
```zsh
./gradlew bootRun
```
Add SPRING_PROFILES_ACTIVE=test environment variable to run for test purpose (cucumber)
```zsh
SPRING_PROFILES_ACTIVE=test ./gradlew bootRun 
```

