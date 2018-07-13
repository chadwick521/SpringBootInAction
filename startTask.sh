#!/bin/sh
nohup java -Xms512m -Xmx1024m -jar $1 & echo $! > ./pid.file &
