import java.io.*;
// Which options can be inserted in the catch block to compile this program?
public class Beach {
	
	class TideException extends Exception {}

	public void surf() throws RuntimeException {
		try {
			throw new TideException();
		//} catch(TideException | Exception e) { //INCORRECT because TideException is subclass of Exception, it is redundant
		//} catch(IllegalStateException | TideException t) {	// CORRECT		
		//} catch(TideException | IOException i) { INCORRECT because IOException is never throw in the body
		} catch(Exception e){

		}
	}

}