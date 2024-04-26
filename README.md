How to setup RC-SIMS backend in IntelliJ?

STEPS:
1. Open your github and go the the repositories of RoCS2024.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/c88c8fc8-5a27-4e36-8833-3873833d159b)

2. Find the repository "rc-sims".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/a6f08b52-1ecb-4c46-a6be-5b08bd82773b)

3.  Open the repository. Look for the green button named "<Code>".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/05c28e82-2a54-4d75-bf61-6c4b4c5ec9a4)
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/055221b4-ec5c-4926-a956-632e683fce16)

4. Click the "Copy URL to clipboard" to copy the link of the repository.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/7f08dca0-c0a8-47ed-b273-7fd2c30f3144)

5. Once you are finish copying the URL, go to File Explorer. You can make a folder or you can just clone it directly in your desktop. In my case, I made a folder to be organized.

6. Once you find a path for the rc-sims, right-click and then click the "Open gitbash here"
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/230e1883-62b6-44a3-8124-527cd5c9bebb)

7. Once you are in the gitbash, type "git clone https://github.com/RoCS2024/rc-sims.git". Take note that the URL you will paste is the URL of the rc-sims' repository that you copied earlier in Github.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/3211c972-52ab-4b40-a9f7-08caf7dbd3d5)

8. Just click enter to have the a local copy in your folder. This is what you should see to know if cloning is successful.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/573a8eba-f6e3-4787-9ef2-e63ca9aebc15)

9. Once you have cloned it, right-click the folder and choose "Open folder as IntelliJ IDEA Project".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/e3af16fc-b5da-487a-954e-791c0835d6ff)

10. Once you have clicked it, this will appear and you will just choose "Trust the project".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/134ce62c-9f2f-4357-a46a-452db789b3e3)

11. Once you opened the project, there will be suggestions in lower-right of the screen. Just ignore it.

12. First thing you will do is click the "File" in the upper-left corner and look for "Settings" and click it.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/617014c2-e4af-4d7b-8136-6da926349355)

13. In the settings, find the "Build, Execution, Deployment"
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/05156e0b-c47b-46b3-869d-9846aaf6215d)

14. Click it and under it find the "Build Tools"
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/5f36cd42-ade0-4b8a-ad07-366a31e15988)

15. Change it to "Any Changes", click Apply and then click Ok.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/f3b94cb5-df15-4a56-aefd-e5ccd294d3cc)

16. Go to the File tab again in the upper-left corner and now look for "Project Structure" and click it.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/67380401-7560-47b7-9c8c-d37dae957784)

17. Once you clicked it, this will appear.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/e6048cec-be94-43a4-add5-36dc6b28bc0d)

18. Next thing that you will do is choose the language. In the SDK, kindly choose "jdk 17".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/f37dae63-4405-4260-a5d1-617342a5b47e)

19. Next, click the language level and choose "17" also.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/b287bcfe-8161-405a-a3df-629152e2d71f)
This is what it should look like:
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/c9fd2e68-a2b1-4f93-b503-b7754bf20377)

20. Once you are done with the language, click the "Modules" under the project structure also.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/0c6f4b49-14e6-415e-b7f9-afa094f71e5a)

21. Delete the "main" and the "test" modules.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/9ad82e3b-09e3-4d67-ba86-0cbd3a8df553)
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/02865c5d-24f1-46cb-aa8e-e992a460675b)

22. Once you have deleted the two modules, click the "rc-sims" and then click the "+" sign.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/83febbe0-fc44-4d5c-9183-4e384d76aece)

23. After that, look for ivyIDEA and click it.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/be61c85e-0717-449f-8f35-8b648957a88d)
**Note that if you can't find ivyIDEA, the steps in installing it is in the Confluence already.**

24. If you are done adding ivyIDEA. This is what you should see.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/39342878-eb7a-4fe7-9871-b8ce8b6fb18e)

25. Next, you will click the "Folder" button in here.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/b0c4537c-fdc1-4ea1-91a7-84ce34aef635)

26. Once you have click it, find the folder of your "rc-sims" and locate the ivy.xml of it.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/54aebdfa-2044-455b-a5c6-3962a7faad6e)

27. Once you have choose the ivy.xml, check the checkbox below and do this.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/dc278f8e-95e0-4ab9-aacb-31048062bfa5)

28. Once you are done setting it up, click Apply then Ok.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/f61bc675-edc8-41bc-9cb7-1a0841681012)

29. Once done, right-click the folder of the project and locate the "ivyIDEA" and choose "resolve for rc-sims module"
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/6ccaf270-9630-47c6-9472-894efc7a54f1)

30. Once done, wait for it to finish loading. To know if it is done resolving, go to "External Libraries" and check if there is "IvyIDEA" under it.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/71b9b1b6-b2c0-443f-aa31-9b8c57f22930)

31. If there is already IvyIDEA, the next thing you will do is mark every directory what type of source root it is. Click the directory "src" then "main" and you will find the directory "java".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/1d0d3ec9-e5b9-44a7-ae4b-394ed2c0f79e)

32. Right-click the "java" directory and locate the "Mark directory as" and then choose "Sources Root".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/0a69f429-1baf-4c82-97aa-5624ae459aef)

33. Do the same with the "resources" directory. Right-click, locate the "Mark directory as" and then choose "Resources Root".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/e85502ad-0247-4b14-bafb-b8d07751edea)

34. Next is Click the directory "test" and you will find the directory "java" also. Right-click the "java" directory under the "test" and locate the "Mark directory as" and then choose "Test Sources Root".
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/fd1323c0-f0a2-4cf6-8af7-1aa79ae08ebb)

35. Once done, go to the "Main" class under the "java" directory under the "src" and then try to run it.

36. If you tried to run the project and this appeared, it means that there is something wrong with your ConnectionHelper class.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/5c9a49dd-a6c5-4194-8754-4c856e8fa4c2)

37. Go to the ConnectionHelper class in src > main > java > com > student > information > management > data > connection.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/5308f1aa-b385-4cd4-a6da-bcd29bc2ab0e)

38. In the ConnectionHelper, check if you have the right URL. If not change the "oracleDB" with your registered SID in your MySQL. My SID is "rogate" so I changed it to rogate.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/9eb250ed-1ddd-42c3-8194-b5ca1f7517b7)
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/7719dfbe-0852-4927-9600-f4155d59aa82)
**Take note that you should also check the password and username if it matches your registered data in MySQL.**
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/a2265399-6346-4bdc-9d4d-b0330d11f84b)

39. Please also double check if you have the table "Student" in your database.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/4645fc1a-9491-4222-b2de-f2a2792e1ad1)

40. Once done, try to run the Main again.

41. If this appeared without any errors, it means that you have successfully set up the project.
![image](https://github.com/RoCS2024/rc-sims/assets/157860737/91601329-3a70-4e32-8c8b-3852f85a7eb1)
 





















 










