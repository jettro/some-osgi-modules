some-osgi-modules
=================

This is a project that contains some OSGi modules that I am using to try out amdatu and other OSGi tools/frameworks.

# run client
java -Dagent.identification.agentid=webpi -Dagent.discovery.serverurls=http://192.168.178.27:8080 -jar target.jar


http://www.gradle.org/docs/current/userguide/multi_project_builds.html

# Help using tmax for keep processes running on the pi when logging off
http://www.jeffstory.org/wordpress/?p=132

sudo apt-get install tmux

tmux new -s osgi
tmux attach-session -t osgi

