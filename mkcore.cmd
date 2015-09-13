javac src\com.tsi.lifegame.core\Universe.java -d bin  1> log.txt 2>&1

javac -cp .;bin;bin\org\junit\junit-4.12.jar test\com.tsi.lifegame.core\UniverseTest.java -d bin 1>> log.txt 2>&1

java -cp .;bin;bin\org\junit\junit-4.12.jar;bin\org\hamcrest\hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.tsi.lifegame.core.UniverseTest  1>> log.txt 2>&1
