#!/bin/bash
export JAVA_HOME="$(dirname "$(pwd)")/envs/Java/jdk-20"
export M2_HOME="$(dirname "$(pwd)")/envs/apache-maven-3.9.3"
export MAVEN_HOME="$(dirname "$(pwd)")/envs/apache-maven-3.9.3"
export PATH="$JAVA_HOME/bin:$M2_HOME/bin:$PATH"
