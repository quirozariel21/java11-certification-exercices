import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ExamQuestionInputStream14 {
	
	public int getPrize(byte[] luck) throws Exception {

		try(InputStream is = new ByteArrayInputStream(luck)) {

			is.read(new byte[2]); //Read until number 2
			if(!is.markSupported())
				return -1;
			is.mark(5);    //It is going to be useful when the statement is.reset() works
			is.read();     // return 3
			is.read();     // return 4
			is.skip(3);    // return -1
			is.reset();    // reset() method until line 13 or mark() method
			return is.read();	//return 3
		}
	}


	public static void main(String... args) throws Exception {
		final ExamQuestionInputStream14 p = new ExamQuestionInputStream14();
		final var luck = new byte[] { 1, 2, 3, 4, 5, 6, 7};
		System.out.println(p.getPrize(luck));
	}
}