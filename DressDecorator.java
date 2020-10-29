class DressDecorator implements Dress {
	protected Dress dress;

	public DressDecorator (Dress d) {
		this.dress = d;
	}

	@Override
	public void assemble() {
		this.dress.assemble();
	}
}