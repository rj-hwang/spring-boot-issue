# spring-boot-issue

[spring-boot/issues/20996](https://github.com/spring-projects/spring-boot/issues/20996)

Run bellow command to test:

```shell
# failed with 'embwdded-h2 + spring-boot-2.2.6.RELEASE'
mvn test -P embedded-h2 -D spring-boot.version=2.2.6.RELEASE

# passed with 'postgres + spring-boot-2.2.6.RELEASE'
# default connect to database: db.name=testdb, db.username=tester, db.password=password
# can change by `-D db.xxx=yyy`
mvn test -P postgres -D spring-boot.version=2.2.6.RELEASE
```

> If use spring-boot 2.2.0~2.2.5 all passed.