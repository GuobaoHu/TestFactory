package guyue.hu;
/**
 * @author guyue
 * @date 2017��11��24�� ����8:13:44
 * @class describ:
 */
public class TestFactory {
	public static void main(String[] args) {
		new BMW320();
		new BMW523();
	}
}

class BMW320 {
	public BMW320() {
		System.out.println("����--->BMW320");
	}
}

class BMW523 {
	public BMW523() {
		System.out.println("����--->BMW523");
	}
}