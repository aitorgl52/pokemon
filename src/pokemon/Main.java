package pokemon;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		pokemones();
		Pokemon equipo1[] = new Pokemon[6];
		Pokemon equipo2[] = new Pokemon[6];
		String nombre1, nombre2;
		
		System.out.println("Cual es tu nombre bb?");
		nombre1 = scn.next();
		System.out.println("Contra quien te vas a madrear?");
		nombre2 = scn.next();
		
		for (int i = 0; i <= 6; i++) {
			
			System.out.println(nombre1 + "Elige tu poquemon nº" + i);
			
		}
		
		
	}

	public static void pokemones() {
		Pokemon arrPokemons[] = new Pokemon[12];
		arrPokemons[0]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[1]=new Pokemon("Charizard", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[2]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[3]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[4]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[5]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[6]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[7]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[8]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[9]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[10]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
		arrPokemons[11]=new Pokemon("Venusaur", 80, 83, 82, 80, 100, 8, "planta");
	}
	
}
