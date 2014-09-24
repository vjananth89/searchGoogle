searchGoogle
============

README
!Hi! You have reached the readme file for the 1st Java Application (searchGoogle) that was required to be created for the exercise.
!This readme file has 3 parts: 1)Overview
2)Requirements
3)Installation
4)How to run the application
5)What happens in the code why it was implemented this way
!Overview
!This java application searches a keyword given by the user to search Google and return the first relevant title and the corresponding url associated with it. The application can be run from the command line. The application’s components were built and tested in a Mac OS X 10.9 Mavericks machine running on a Java SE 1.7 runtime environment.
￼!The remaining sections in this document clearly explain the requirements, instructions to run and test the application, and why the code was implemented this way.
!
Requirements
!Java SE 1.7
Mac OS X 10.7 or above
Terminal
Internet Connection
Eclipse IDE (If the source code is to be tested from an IDE) - Not necessary to test the application.
￼!Installation
!Running this application is a relatively simple procedure. The steps are as
￼follows:
!1) Open Terminal
2) Go to the path where the jar file is present (eg: /Downloads/)
3) Use the command “java -jar searchGoogle.jar” (Picture shown below)
￼
!Note: Please allow a few seconds for the results to appear !Why the application was created this way:
!The requirement and focus of this particular application is to find the first Title and URL associated with a keyword given by the user when prompted.
￼!Google AJAX API, though deprecated by Google, allows users to test and receive 4 results for any query. The AJAX API provides this data in JSON format while looks exactly like the picture below.
!
￼Our focus is to collect the first Title and Url alone from this API data. For this, we need to convert the JSON format into Java objects. This is beautifully done by the GSON jar (https://code.google.com/p/google-gson/downloads/list). However, this is only special case for using this deprecated API by Google, since we are fully aware that we are not going to search and pull large amounts of data. In such a case, using the Custom Search API would have become the appropriate would be the right approach, which allows 100 hits/day for a user’s API key.
!
￼Another interesting factor that makes the Custom Search API a little less efficient to pull the first Title and Url is that the data format in JSON is different and we will require a different logic to pull the Title, and a different one for URL. So, in order to maintain simplicity and reduce the complexity of the task, I decided to use the Google AJAX API and the GSON jar to complete this task.
!Note: The picture below shows the illustration of the Title and URL corresponding to a query given by the user.
