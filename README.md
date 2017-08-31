## 一、Maven打包
### 1. mvnw.sh配置环境变量

```shell
JAVA_HOME=/usr/java/jdk1.8.0_60/
export JAVA_HOME

M3_HOME=/global/sww/apache-maven-3.0.3/
export M3_HOME
```
### 2. 运行

```
./mvnw.sh clean install
./startTask.sh target/****.jar
./stopTask.sh
```

## 二、Ant打包

### 1. 打包
```
./antBuild.sh
```

### 2. 运行/停止

```
./startTask.sh target/****.jar
./stopTask.sh
```


