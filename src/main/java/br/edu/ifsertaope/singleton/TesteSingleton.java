package br.edu.ifsertaope.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		System.out.println(Singleton.getInstance());
		

	}

}
