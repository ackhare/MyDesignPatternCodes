package Behavioural.TemplateMethod;

/*


*/

//So How Does It Work In Java?
// For our Java example, we'll use a cross compiler as an example.
// First, we'll create a generic cross compiler base class,
// with it's crossCompile() method being the glue for the whole algorithm to run.
abstract class CrossCompiler {
    /*The AbstractClass contains the templateMethod(), which should be made final so that it cannot be overridden.
    This template method makes use of other operations available in order to run the algorithm,
    but is decoupled for the actual implementation of these methods.
    All operations used by this template method are made abstract, so their implementation is deferred to subclasses.*/
    public final void crossCompile() {
        collectSource();
        compileToTarget();
    }
    //Template methods
    protected abstract void collectSource();
    protected abstract void compileToTarget();
}
//Next we'll create two specific implementations of our cross compiler, for iPhone and for Android:

/*
The ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class.
There can be many different ConcreteClasses.
The template method in the parent class controls the overall process, "calling" subclass methods when necessary.
The Template Method pattern makes use of the Hollywood Principle: Don't call us, we'll call you.
The Hollywood principle avoids low level components depending on high level components,
 and instead give these low level classes
(ConcreteClass) a way of hooking into the parent class (AbstractClass).
        */
class IPhoneCompiler extends CrossCompiler {
    protected void collectSource() {
        //anything specific to this class
    }
    protected void compileToTarget() {
        //iphone specific compilation
    }
}
class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        //anything specific to this class
    }
    protected void compileToTarget() {
        //android specific compilation
    }
}


//To complete this example, here is how you would use your cross compilers
public class Client {
    public static void main(String[] args) {
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}

