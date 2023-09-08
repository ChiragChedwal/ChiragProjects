package Constructor;

public class ReverseSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "I am employee";
StringBuilder str2 = new StringBuilder();
str2.append(str);
str2 = str2.reverse();
System.out.println(str2);

char chars[] = str.toCharArray();
for(int i =0;i<chars.length;i--) {
	System.out.println(chars[i]);
}

		
	}

}
