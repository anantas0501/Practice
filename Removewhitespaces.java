package sxd;

public class Removewhitespaces {

	public static void main(String[] args) {
		String a="Java @ 567 is Programming _ Language 123";
	String ab=	a.replaceAll("[^a-z0-9A-Z]", "");
	System.out.println(ab);
	

	}

}
