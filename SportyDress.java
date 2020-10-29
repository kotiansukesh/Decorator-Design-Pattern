class SportyDress extends DressDecorator {

	public SportyDress(Dress d) {
		super(d);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sporty Dress Features");
	}
}