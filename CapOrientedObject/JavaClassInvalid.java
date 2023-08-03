import java.util.*; 
package test; //The package declaration can never occur after an import statement
public class JavaClassInvalid {
	public OtherClass oc = new OtherClass();
}

class OtherClass {
	int value;
}