# BBuddy Java Api

## Database
Installing MySQL
Or using Docker
```zsh
docker run -d -p 3306:3306 -e "MYSQL_ALLOW_EMPTY_PASSWORD=yes" --name "bbuddy_mysql" mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --max-allowed-packet=67108864
```

### Create dba with privileges
Wait for mysql has been fully initialized.
```zsh
 mysql -u root -h 127.0.0.1 -P 3306 < sql/create_default_dba.sql
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

## Lombok plugin
If you are using IntelliJ, install lombok plugin and enable annotation processing
![lombok](/../screenshots/images/lombok.jpg "Enable Annotation Processing")

