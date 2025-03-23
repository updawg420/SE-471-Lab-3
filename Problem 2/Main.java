import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CMM cmm = new CMM();

        // A cup of Mocha with one serve of chocolate added
        ProgramMocha programMocha = new ProgramMocha(cmm);
        CoffeeIF mocha = programMocha.makeCoffee();
        mocha = new DecoratorChocolate(mocha);
        cmm.displayPrice(mocha);
        cmm.addSale(mocha);

        System.out.println("\n");

        // Besides the cream and vanilla, a cup of Espresso with also two serves of chocolate added
        cmm.setProgram(new ProgramEspresso(cmm));
        CoffeeIF eso = new CFEspresso();
        eso = new DecoratorCream(eso);
        eso = new DecoratorVanilla(eso);
        eso = new DecoratorChocolate(eso);
        eso = new DecoratorChocolate(eso);
        cmm.makeCoffee();
        cmm.displayPrice(eso);
        cmm.addSale(eso);

        // Print Totals
        cmm.printSales();

        // Interactive Main Menu for ordering drinks
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What can I get for you?");
        while(true){
            System.out.println("1. Regular Coffee     2. Mocha     3. Latte     4. Espresso     5. Cappuccino     6. Nevermind");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1: // Regular Coffee
                    cmm.setProgram(new ProgramRegular(cmm));
                    coffee = new CFRegular();
                    break;
                case 2: // Mocha
                    cmm.setProgram(new ProgramMocha(cmm));
                    coffee = new CFMocha();
                    break;
                case 3: // Latte
                    cmm.setProgram(new ProgramLatte(cmm));
                    coffee = new CFLatte();
                    break;
                case 4: // Espresso
                    cmm.setProgram(new ProgramEspresso(cmm));
                    coffee = new CFEspresso();
                    break;
                case 5: // Cappuccino
                    cmm.setProgram(new ProgramCappuccino(cmm));
                    coffee = new CFCappuccino();
                    break;
                case 6: // Exit
                    System.out.println("Sounds good!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again!");
                    continue;
            }
            while(true){
                System.out.println("\nAnything else? Any add-ons or another drink?");
                System.out.print("\n1. Add-ons     2. Another drink     3. No Thanks");
                System.out.print("\nEnter your choice: ");
                int addOnChoice = scanner.nextInt();
                switch(addOnChoice){
                    case 1:
                        System.out.println("\n1. Cream $0.25    2. Vanilla $0.50     3. Chocolate $1.00");
                        System.out.print("\nEnter your choice: ");
                        int addOnC = scanner.nextInt();
                        switch(addOnC){
                            case 1:
                                coffee = new DecoratorCream(coffee);
                                break;
                            case 2:
                                coffee = new DecoratorVanilla(coffee);
                                break;
                            case 3:
                                coffee = new DecoratorChocolate(coffee);
                                break;
                            default:
                                System.out.println("We don't have that! Try again!");
                                continue;
                        }
                        break;
                    case 2: // Another drink
                        break;
                    case 3:
                        System.out.println("Alright! Coming right up!");
                        System.out.println("\nYou have ordered: " + coffee.getDesc());
                        System.out.println("Cost: $" + coffee.getCost());
                        cmm.addSale(coffee);
                        cmm.displayPrice(coffee);
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("We don't have that! Try again!");
                }
            }
        } */
    }
}