package Constructor;

import org.testng.annotations.Test;

public class PS {

	@Test
	public void testRun() {
		PS1 p = new PS1(3);
		int a=3;
		System.out.println(p.increment());
		System.out.println(p.decrement());

		PS2 p2 = new PS2(3);
System.out.println(p2.multiplyTwo());
System.out.println(	p2.multiplyThree());
	}
}
