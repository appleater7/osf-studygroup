package study;

public class C19StringMethods {

	public static void main(String[] args) {
		String str ="나는 Stringe type의 자료다.";
		System.out.println("str.length() :"+str.length());
		System.out.println("str.substring(3) : "+str.substring(3));
		System.out.println("str.substring(4,15) : "+str.substring(4,14));
		System.out.println("str.charAt(5) : "+str.charAt(5));
		char ch = str.charAt(5);
		System.out.println("str.charAt(5) : "+ch);
		System.out.println("str.contains(\"String\") : "+str.contains("String"));
		System.out.println("str.contains(\"str\") : "+str.contains("str"));
		String date = String.join("///","25","06","메롱");   
		System.out.println("String.join(\"///\",\"25\",\"06\",\"메롱\") : "+date);
		System.out.println("\"나는\".equals(str) : "+"나는".equals(str));
		System.out.println("equals는 완전히 같아야함.");
		System.out.println("str.isEmpty() : "+str.isEmpty());
		String s1="java string";  
		s1.concat("은 변하지 않는다.");  
		System.out.println(s1);
		s1=s1.concat("은 변하지 않는다. 하지만 재정의하면 변한다.");  
		System.out.println("s1=s1.concat(\"은 변하지 않는다. 하지만 재정의하면 변한다.\")"+s1);
		System.out.println(str.replace("나는","너는"));
		System.out.println(str);
		System.out.println("\"DDD\".equalsIgnoreCase(\"ddd\") : "+"DDD".equalsIgnoreCase("ddd"));
		
		for (String index : str.split(" ")) {
			System.out.print(index+",");
		}
		System.out.println();
		
		for (String index : str.split(" ",2)) {
			System.out.print(index+",");
		}
		System.out.println();
		for (String index : str.split(" ",3)) {
			System.out.print(index+",");
		}
		System.out.println();
		String s4 = "hello";
		String s5 = new String("hello");
		String s6 = "hello";
		System.out.println(s4==s5);
		System.out.println(s5);
		s6 = s5.intern();
		System.out.println("str.indexOf(\"e\",10) : "+str.indexOf("e",10));
		System.out.println("\"HELLO\".toLowerCase() : "+"HELLO".toLowerCase());
		System.out.println("\"hello\".toUpperCase() : "+"hello".toUpperCase());
		String str2="  hello string   ";  
		System.out.println(str2);
		System.out.println(str2.trim());
		String str3=null;
		System.out.println(String.valueOf('a'+'b'));
		
	}
}

