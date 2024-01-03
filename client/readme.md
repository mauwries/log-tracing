Make sure to set the correct address for the host computer:<br/>
ipconfig getifaddr en1<br/>
set the ipaddress in the application properties<br/>
<br/>
Build the project:<br/>
mvn clean install -U<br/>
<br/>
build docker image:<br/>
docker build -t serier-it/client .<br/>
<br/>
Start the image:<br/>
docker run -p 8080:8080 serier-it/client<br/>
