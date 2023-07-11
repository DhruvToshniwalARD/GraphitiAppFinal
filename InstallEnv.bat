@echo off
set "JAVA_HOME=%~dp0\envs\Java\jdk-20"
set "M2_HOME=%~dp0\envs\apache-maven-3.9.3"
set "MAVEN_HOME=%~dp0\envs\apache-maven-3.9.3"
set "PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%"