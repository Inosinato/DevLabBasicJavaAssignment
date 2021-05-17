package lab8;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
		String ex = "This is an example";
		
		sb.append(ex);
		sb.append(" of a String Builder");
		
		sbf.append(sb.substring(0, 31) + "Buffer");
		
		System.out.println(sb);
		System.out.println(sbf);
	}

}
