package tsc.draft.misc;

class InSync extends Thread {
	StringBuffer letter;

	public InSync(StringBuffer letter) {
		this.letter = letter;
	}

	public void run() {
		synchronized (letter) { // #1
			for (int i = 1; i <= 100; ++i) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(letter);
			}
			System.out.println();
			char temp = letter.charAt(0);
			++temp; // Increment the letter in StringBuffer:
			letter.setCharAt(0, temp);
		} // #2
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new InSync(sb).start();
		new InSync(sb).start();
		new InSync(sb).start();
	}
}
