package p1;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("конструктор этого же пакета");
		System.out.println("n = " + p.n);

		System.out.println("n_pri доступен только в базовом классе");

		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
