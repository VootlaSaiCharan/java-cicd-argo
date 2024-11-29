FROM maven AS build

# Created a work directory
WORKDIR /java

# Copy files  from the current directory to the work directory
COPY . /java

# Build the  application
RUN mvn clean install

FROM tomcat

# Removing the Previous files
RUN rm -rf /usr/local/tomcat/webapps/*

#  Copy the war file to the tomcat webapps directory
COPY --from=build /java/target/app-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Start the Tomcat server
CMD ["catalina.sh", "run"]

# Exposing the Port
EXPOSE 8080
