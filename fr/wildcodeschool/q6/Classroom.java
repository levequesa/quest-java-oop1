package fr.wildcodeschool.q6;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder element1 = new Wilder("toto", false);
		System.out.println( element1.whoAmI() );
		
		Wilder element2 = new Wilder ("titi", true);
		System.out.println( element2.whoAmI());
	}

}
