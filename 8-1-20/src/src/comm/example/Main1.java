package comm.example;

public class Main1 {

	public static void main(String[] args) {
		new Main1().doThework();

	}

	public void doThework() {
		Object o = null;
		for (int i = 0; i < 5; i++) {
			try {
				o = makeObj(i);

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.err.println("IllegalArgumentException is caught:(+e.getMessage()+).");
				return;
			}
		}
	}

	private Object makeObj(int type) throws IllegalArgumentException {
		if (type == 1)
			throw new IllegalArgumentException("Don't like type " + type);
		return new Object();

	}

}
