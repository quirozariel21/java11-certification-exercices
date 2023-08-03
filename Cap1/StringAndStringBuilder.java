public class StringAndStringBuilder {

	public void testRefs(String str, StringBuilder sb) {
		str = str + sb.toString();
		sb.append(str);
		str = null;
		sb = null;
	}

	public static void main(String args[]) {
		String s = "aaa";
		StringBuilder sb = new StringBuilder("bbb");
		new StringAndStringBuilder().testRefs(s, sb);
		System.out.println("s="+s+ " sb="+sb);

	}
}