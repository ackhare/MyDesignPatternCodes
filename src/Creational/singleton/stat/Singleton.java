package Creational.singleton.stat;

public class Singleton {

	/*
	Move to an eagerly created instance rather than a lazily created one
	If your application always creates and uses an instance of the Creational.Singleton or the overhead of
creation and runtime aspects of the Creational.Singleton are not onerous, you may want to create your
Creational.Singleton eagerly, like this:

Using this approach, we rely on the JVM to create the unique instance of the Creational.Singleton when
the class is loaded. The JVM guarantees that the instance will be created before any thread
accesses the static uniqueInstance variable.
	 */
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Creational.Singleton!";
	}
}
