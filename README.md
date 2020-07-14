# java_practice
Create a directory / folder

Create some directory where can you can store your Java code, for example jxwork. I will call this <work dir>
Now create a directory where you can store this application. <work dir>/helloapp
Under helloapp create a directory src and under src a directory hello. So in the end you are sitting in the directory
<work dir>/helloapp/src/hello
<work dir> - is just a directory for us to store all of our Java work
helloapp - the name of our application
src - where we put our source code. The JDK requires this to be called src
hello - the name of our package. All Java code is organized into packages. We will learn more about these through out the course.
Now create a text file in that directory called HelloWorld.java and enter the following Java code:
Some comments on this code first
We will be explaining this code in detail in future lessons
By habit, I put my opening curly braces { on a new line. This is common among older Java programmers.
You are welcome to put the { at the end of the previously line
Both positioning will be acceptable in class; just be consistent. Follow their programming style standards for the company you work for.
The class name must match the file name. In this code the class name is HelloWord and the file name is HelloWorld with a .java extension.
package hello;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
Create another text file called Greeter.java and enter the following code

package hello;

public class Greeter
{
    public String sayHello ()
    {
        return "Hello World!";
    }
}
Now that we have our source code in place, we need to convert that source code to bytecode so we can execute it using the Java Virtual Machine (JVM)

Go to a command / terminal prompt and change directories to the src directory you created above. Run the following commands from the <work dir>/helloapp/src/ directory:
javac hello/*.java
This created a series of *.class files in the hello directory; one *.class file for each *.java file. These *.class files contain the bytecode the will be run on the JVM.

If all works, you should get nothing for an output - just a return to the prompt. If something does not work, the normal mistake is to have a typo in the source code. If this is the case, you will see output similar to:

hello/Greeter.java:7: error: ';' expected
        return "Hello World!"
                             ^
1 error
The error message tells you

the file where the compiler found the error, in our case hello/Greeter.java
the line number where the compiler thinks the error is located, in our case :7:
a comment on what the compiler thinks the error is, in our case
';' expected
        return "Hello World!"
If this happens, go back and review the source code, fix the error, and redo the compiling statement javac hello/*.java. Keep cycling through until you have no more errors.

Next: Distributing a directory of *.class files is clunky. Normally we archive the class files into a *.jar file and then distribute that *.jar file. Again issue the following command from the <work dir>/helloapp/src/ directory.

jar cvfe hellothere.jar hello.HelloWorld hello/*.class
where cvfe are options meaning

c - create a new archive file with a given name
v - generate verbose output
f - specific the jar output file to be created, in our case hellothere.jar
e - sets the main class also called the Entry point, in our case hello.HelloWord
You should get output similar to

added manifest
adding: hello/Greeter.class(in = 287) (out= 220)(deflated 23%)
adding: hello/HelloWorld.class(in = 496) (out= 327)(deflated 34%)
And finally - Now we are ready to execute the program. Again issue the following command from the <work dir>/helloapp/src/ directory.

java -jar hellothere.jar
java launches the JVM
-jar says we are using a *.jar file, the most common type of Java archived file
hellothere.jar is the name of application
You should get the following output

Hello World!
If you do not, go back and fix your original code. Each time you change something in the source code, you will have to redo all three steps to see the effects of your change:

javac hello/*.java
jar cvfe hellothere.jar hello.HelloWorld hello/*.class
java -jar hellothere.jar
Congratulations. You just wrote a Java application!!!