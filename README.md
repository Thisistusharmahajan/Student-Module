Clone the repository and follow the below instructions to run the application and ensure jdk 21 or above

i) to start the server navigate to school-server\testcases then run the following command: java -classpath lib-updated\mysql-connector-java-8.0.11.jar;lib-updated\school-server.jar;lib-updated\student_bl.jar;lib-updated\student_dbdl.jar;lib-updated\utils.jar;. com.user.name.school.main.Main

ii) open another instance of command prompt and navigate to pl\testcases and run the following command: java -classpath lib\proxy-student_bl.jar;lib\student_pl.jar;lib\utils.jar;. com.user.name.school.main.Main
this will server as client-side(presentation Layer)
