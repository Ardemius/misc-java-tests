package tsc.draft.misc;

enum CoffeeSize3 {
	BIG(8), HUGE(10), OVERWHELMING(16) { // start a code block that defines
		// the "body" for this constant
		public String getLidCode() { // override the method
			// defined in CoffeeSize
			return "A";
		}
	}; // <-- the semicolon is REQUIRED when you have a body
	
	
	CoffeeSize3(int ounces) {
		this.ounces = ounces;
	}

	private int ounces;

	public int getOunces() {
		return ounces;
	}

	public String getLidCode() { // this method is overridden
		// by the OVERWHELMING constant
		return "B"; // the default value we want to return for
		// CoffeeSize constants
	}
}
