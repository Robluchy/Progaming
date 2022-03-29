package campeones;

import java.util.Scanner;

public class lollillo {
    public static void main(String[] args) {
    float altura;
    float base;
    float area;
    Scanner sc = new Scanner(System.in);  
    
    System.out.println("Base del triangulo");
    base = sc.nextFloat();

    System.out.println("Altura del triangulo");
    altura = sc.nextFloat();

    area =(base*altura/2);
    
    System.out.println("el area es" + area);
    sc.close();
    }
    
}
