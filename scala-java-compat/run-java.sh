mkdir -p target/java-classes

javac -d target/java-classes \
  -classpath /usr/share/scala/lib/scala-library.jar:target/scala-classes \
   *.java

java -classpath target/scala-classes:target/java-classes \
  Companions
