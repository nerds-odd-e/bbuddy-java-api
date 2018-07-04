# BBuddy Java Api

## Database
Installing MySQL
Or using Docker
```
docker run -d -p 3306:3306 -e "MYSQL_ALLOW_EMPTY_PASSWORD=yes" -e "MYSQL_USER=nerd" -e "MYSQL_PASSWORD=dbs3cr3t" -e "MYSQL_DATABASE=bbuddy" --name "bbuddy_mysql" mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --max-allowed-packet=67108864
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

