FROM amazoncorretto:25
LABEL authors="MSR"
# Set the working directory inside the container
#EXPOSE 8080
WORKDIR /app

# Copy your application's JAR file into the container
COPY ./target/sb-jenkins-k8s-cicd-pipeline.jar /app
EXPOSE 8282

# Define the command to run your application when the container starts
ENTRYPOINT ["java", "-jar", "sb-jenkins-k8s-cicd-pipeline.jar"]