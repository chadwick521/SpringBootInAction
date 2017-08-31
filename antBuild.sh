#!/bin/sh
JAVA_HOME=/usr/java/jdk1.8.0_60/;
export JAVA_HOME
ant -lib lib/ivy-2.3.0.jar:clean manual
