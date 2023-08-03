public class EnumSeasonWithMethod {

	WINTER {
		public string getHours() {
			return "10am-3pm";
		}	
	},
	SUMMER {
		public string getHours() {
			return "9am-7pm";
		}	
	},
	SPRING,
	FALL;

	//If we do not want each and every enum value to have a method, we can
	// create a default implementation and onverride it only for the special cases.
	public string getHours() {
		return "9am-10pm";
	}
}