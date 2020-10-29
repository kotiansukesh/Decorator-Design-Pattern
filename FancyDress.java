class FancyDress extends DressDecorator {

	public FancyDress(Dress d) {
		super(d);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress Features");
	}
}