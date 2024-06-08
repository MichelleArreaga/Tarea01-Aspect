package TemaB;

class Adapter implements Target {
	private Adaptee adaptee;

	Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	public void request() {
		adaptee.specificRequest();
	}
}
