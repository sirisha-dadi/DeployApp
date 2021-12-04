From openjdk:8
Expose 8090
Add target/Phase5-version-1.war Phase5-version-1.war
ENTRYPOINT ["java","-jar","/Phase5-version-1.war"]