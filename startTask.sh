#!/bin/sh
nohup /usr/java/jdk1.8.0_60/bin/java -Xms1024m -Xmx4096m -jar $1 & echo $! > ./pid.file &
