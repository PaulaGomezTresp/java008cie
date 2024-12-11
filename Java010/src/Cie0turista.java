
public class Cie0turista {

	public static void main(String[] args) {
		Maleta m1=new Maleta("Benzi",15.3);
		Maleta m2=new Maleta("Misako",18.1);
		
		Turista t=new Turista("Luis");
		t.setMaleta1(m1);
		t.setMaleta2(m2);
		System.out.print("Una maleta es "+m1.getModelo());
		System.out.println(" y pesa "+m1.getPeso()+"Kg");
		System.out.print("La otra maleta es de "+m2.getModelo());
		System.out.println(" y pesa "+m2.getPeso()+"Kg");
		System.out.println("El señor se llama "+t.getNombre()+" y peso total de equipaje es: "+t.sumaPeso()+"Kg");
		System.out.println("Con embalaje, el equipaje pesa "+t.sumaPeso(3));
		System.out.println("En la carcasa ligera pesa "+t.sumaPeso("ligera"));
	}

}
