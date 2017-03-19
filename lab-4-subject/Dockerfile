FROM java:8-jre
RUN         apt-get update && apt-get install -y redis-server
RUN useradd -ms /bin/bash admin
USER admin
# EXPOSE      6379
#ENTRYPOINT  ["/usr/bin/redis-server"]
ADD ./target/lab-4-subject-1.0-SNAPSHOT.jar /app/
#CMD ["/usr/bin/redis-server"]
CMD ["java", "-Xmx200m", "-jar", "/app/lab-4-subject-1.0-SNAPSHOT.jar"]
EXPOSE 6000