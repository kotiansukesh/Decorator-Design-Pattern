class CasualDress extends DressDecorator {

	public CasualDress(Dress d) {
		super(d);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Casual Dress Features");
	}
}