一、 以tcp方式启动，覆盖率会实时更新
java -javaagent:C:\Users\Administrator\IdeaProjects\jacoco\lib\jacocoagent.jar=includes=*,output=tcpserver,port=7001,address=127.0.0.1,append=true -jar target\jacoco-1.0.0.jar

二、启动tcp服务器用于接收jacoco的覆盖率统计
java -jar lib/jacococli.jar dump --address 127.0.0.1 --port 7001 --destfile C:\Users\Administrator\IdeaProjects\jacoco\report\jacoco-demo.exec

三、用idea打开覆盖率文件
打开菜单Run/Show Code Coverage Data，在弹出框中选中report目录中的exec文件，比如jacoco-demo.exec，打开后可以看到覆盖率

