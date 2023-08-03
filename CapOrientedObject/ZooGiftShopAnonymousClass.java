public class ZooGiftShopAnonymousClass {

    //It can be an abstract class or an interface
	abstract class SaleTodayOnly {
       abstract int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			int dollarsOff() {
				return 3;
			}
		};

		return basePrice - sale.dollarsOff();
	}

	public static void main(String args[]) {
		ZooGiftShopAnonymousClass outer = new ZooGiftShopAnonymousClass();
		var admission = outer.admission(5);
		System.out.println(admission); // print 2
	}
}