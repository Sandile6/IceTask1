
package animalsapp;


import java.util.Scanner;

class Animal {
    protected int IDtag;
    protected String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal {
    private int featherColor;

    public Bird(int IDtag, String species, int featherColor) {
        super(IDtag, species);
        this.featherColor = featherColor;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather color (1=grey, 2=white, 3=black): ");
        featherColor = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Color: " + getFeatherColorString());
    }

    private String getFeatherColorString() {
        switch (featherColor) {
            case 1:
                return "grey";
            case 2:
                return "white";
            case 3:
                return "black";
            default:
                return "unknown";
        }
    }
}

class Reptile extends Animal {
    private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}

public class Main {
    public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        System.out.println("Enter Bird Information:");
        brd.input();

        System.out.println("\nEnter Reptile Information:");
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();

        System.out.println("\nReptile Information:");
        rept.output();
    }
}

