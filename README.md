# javaagent-example
Example of how to instrument the java class files on class loading.
You can change(instrument) the byte code without changing the java source file and recompiling. 
# Usage
Package the agent jar file.
```
mvn clean package
```

Find the packaged jar file in target directory and add it to the java command line options.
For example.
```$xslt
 旧的
java -javaagent:/Users/liuzhengyang/Code/opensource/github/javaagent/target/javaagent-1.0-SNAPSHOT-jar-with-dependencies.jar Test
新的
 -javaagent:/home/liangqq/github/javaagent-example/target/javaagent-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Most processing happens in `com.lzy.javaagent.AgentMain`, you can change it and add your own logic.

Have Fun!