package polymorpisum1;

public class Forest{
public static void main(String[] args) {
	Animal[] a= {new Cat(),new Dog(),new Tiger()};
	for (int i = 0; i < a.length; i++) {
		a[i].noises();
	}
}
}
