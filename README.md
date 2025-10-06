## Spring Boot

### Overview

[Spring Boot is a **Java framework**](https://spring.io/why-spring) that makes it much easier to build and run backend applications. Normally, setting up a Java project requires a lot of configuration (servers, dependencies, logging, etc.). Spring Boot removes that overhead by giving you:

- **Auto-configuration** → common setups are done for you.
- **Embedded server** → no need to install Tomcat or another server, just run the app.
- **Production-ready features** → built-in support for security, monitoring, and error handling.



### Prerequisites

- Git
    - [Github Account](https://github.com/about)
    - [git installed on machine](https://github.com/git-guides/install-git)
- IDE
    - [VS code](https://code.visualstudio.com/)?
    - I think we can use Eclipse but may need configuration to run the project properly

### Installation

- [Java version 21.x.x](https://www.java.com/en/download/help/download_options.html). check with  `java -version`
- [Gradle](https://gradle.org/install/) installed (I have 9.0.0). check with  `gradle -version`
    - I used homebrew to install gradle on mac.

### Running Project



`git clone https://github.com/derekdip/JavaBackend.git`

In the root dir of the project run

mac/linux:

`./gradlew bootRun`

windows:

`.\gradlew.bat bootRun`



![](https://slabstatic.com/prod/assets/z4g32wog/post/ba4bl7yd/preimages/nfhmZkIDECwu78K9kGSlVbWn.png?jwt=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJodHRwczovL3NsYWJzdGF0aWMuY29tIiwiZXhwIjoxNzU5OTQ0Nzc3LCJpYXQiOjE3NTg3MzUxNzcsImlzcyI6Imh0dHBzOi8vYXBwLnNsYWIuY29tIiwianRpIjoiMzFrNGdrcmFkcmo0bDBicTAzcTFjbmMxIiwibmJmIjoxNzU4NzM1MTc3LCJwYXRoIjoicHJvZC9hc3NldHMvejRnMzJ3b2cvcG9zdC9iYTRibDd5ZCJ9.IAXauuhNJbbGLycM6OOqDc56L9sDtOgYW7YCahLs85Yro1UxdeoUzwRFwQZHCTGbrIoeq4q2y-A4AGw5sxj-eUfTE6vXunsn16idImeEHc8qQ37JALwZJq7OrfAHfA8gMCNGWhWNmkqCh2K7g7fz22V09cLXswO8d2zqKLCcA7ULBTDj3El4wSbbBL3hNgsXHAnId4ak_eDt3bmvw8_f54yQBEX_-nkGBoFp-TNPcGpgKYGzoD5vILPJL5cZWrDRQ1c-_6Ps_nmPltWDO6W0bqGWI6HhAIEok6-9x2oAHKfFLwe4ZbKOshkHgBvSrwC1OBgZAxi5oLNFUrsl4HjcyA)

You should see in Tomcat started on port 8080  or something similar. Open up your browser and go to `localhost:8080/` As long as you get a webpage pack and not an error message then its running successfully
