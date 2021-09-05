# MyNotes

This project aims to create an Android app, linked to a web service, to take notes and save them on the web service.

## Installation

Firstly, you need to install the web service, composed of a Java application using Spring Framework and a Postgres Database.
Then, you will generate the Android app with the right URL to your web service.

### Requirements

- Docker
- Docker compose
- Android SmartPhone (>=V6.0)
- Android Studio
- [Download the last release of MyNotes](https://github.com/valm13/MyNotes/releases/tag/v1.0)

### Web service

Thanks to containerization, your web service can go up within minutes.

- [Copy the directory Docker where you want to launch the web service](./Docker)
- To create your containers, run the following command in the Docker directory :

    ```shell
    docker-compose build
    ```

- To run your containers, execute :

    ```shell
    docker-compose up
    ```

- And to stop them :

    ```shell
    docker-compose down
    ```

- Finally, authorize the port 8080 in your Firewall

Now your web service is accessible through your home network.

### Android

It's time to generate the user interface:

- Import [MyNotesClient](MyNotesClient) into Android Studio
- Sync Gradle to retrieve all the dependencies
- Modify the URL "192.168.0.74" in [ApiClient.kt](MyNotesClient/app/src/main/java/com/dilitrust/recruitement/magnan/mynotes/client/api/ApiClient.kt) to point to your web service's host IP
- Generate your signed APK
  - You will need to create a Keystore and fill multiple entries
- Install the app on your Android SmartPhone

Enjoy taking notes and retrieving them from the same App!  
