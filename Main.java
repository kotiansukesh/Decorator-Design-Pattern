class Main {
  public static void main(String[] args) {
    
	Dress sportyDress = new SportyDress(new BasicDress());
	sportyDress.assemble();

	Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
	sportyFancyDress.assemble();

  }
}