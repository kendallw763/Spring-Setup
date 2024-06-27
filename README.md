# Spring-Setup
After setting the environment. The first picture below will be what your application should look like. All IDE's are different. I personally love intelliJ IDEA becuase it makes my life easier.
For the application to run properly (I am running Mac OS so, your situation may not be fixed by the following...) One will need to make a small change in the build.gradle file. 
For your editor if you are using IntelliJ IDEA you will want to navigate to the build.gradle file then, double click to open.
Next, towords the bottom of the screen there is an object look-alike. Directly next to implementation will be a snippet of code... ['org.springframework.boot:spring-boot-starter']. 

![Spring3](https://github.com/kendallw763/Spring-Setup/assets/63067332/80c87c24-db8d-4a9d-9ee6-c2084ac693a5)

The reason this does not work is because in the main program, the imports that have ['.web.bind.annotation.something'] are not being read because the dependancy does not have "web" within it.
To fix this, simple types ['org.springframework.boot:spring-boot-starter-web']. Add the "-web". After this change has been made, save the program and update your IDE if need be. 
Your gradle file will look like the picture below.

![Spring2](https://github.com/kendallw763/Spring-Setup/assets/63067332/c3ff0af7-c2c5-4e0c-889c-6821eed32ca3)

The end result will be exactly what is displayed in the picture below...

![Spring](https://github.com/kendallw763/Spring-Setup/assets/63067332/5afee614-9c3f-470e-b9fd-b91266c822b6)




