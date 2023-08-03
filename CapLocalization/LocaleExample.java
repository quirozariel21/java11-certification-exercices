import java.util.Locale;

public class LocaleExample {
	
	public static void main(String... args){

		System.out.println("===>>> Default <<<===");
		Locale locale = Locale.getDefault();
		System.out.println(locale);

		System.out.println("===>>> Custom <<<===");
		System.out.println(Locale.GERMAN); //de
		System.out.println(Locale.GERMANY); //de_DE

		System.out.println(Locale.ITALIAN); //Languaje
		System.out.println(Locale.ITALY); //Languaje_Country

		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi", "IN"));
		System.out.println(new Locale("es", "PE"));

		Locale l1 = new Locale.Builder()
						  .setLanguage("en")
						  .setRegion("US")
						  .build();

		System.out.println(l1);

		System.out.println("===>>> Changing the Default Localization <<<===");
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("fr"));
		System.out.println(Locale.getDefault());

	}
}