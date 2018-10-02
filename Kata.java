public class Kata {

	public static void main(String[] args) {
		
		String value;
		for(int i=1;i<=100;i++) {
			
			value = (i%3 == 0) ? "foo" : "";
			value += (i%5 == 0) ? "bar" : "";
			
			value = String.valueOf(value + i)
						.replaceAll("3", "foo")
						.replaceAll("5", "bar")
						.replaceAll("7", "qix");
						
			System.out.println(value.matches("\\d+") ? value : value.replaceAll("\\d", ""));
		}
	}

}