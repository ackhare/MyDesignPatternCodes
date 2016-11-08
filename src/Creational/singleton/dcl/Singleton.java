package Creational.singleton.dcl;

//
// Danger!  This implementation of Creational.Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
 /*
 With double-checked locking, we first check to see if an instance is created, and if not, THEN we
synchronize. This way, we only synchronize the first time through, just what we want.
  */
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
