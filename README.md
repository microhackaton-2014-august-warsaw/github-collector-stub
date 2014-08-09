github-collector-stub
=====================

###To test the stub itself locally:

gradle fatJar

java -jar github-collector-stub-VERSION-shadow.jar \<zooKeeperBasePath\> \<stubName\> \<stubPortNumber\> \<zookeeperPortNumber\>

java -jar build\libs\github-collector-stub-CD-000-shadow.jar /pl/pl/microhackaton github-collector 8666 2181
