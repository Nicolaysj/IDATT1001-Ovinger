import java.util.*;

public class Oving10_2 {

        public static Scanner s = new Scanner(System.in);    
    
        private static Rett osteloff = new Rett("Osteloff", "Forrett", 35, "Lag loff og stapp med ost");
        private static Rett pizza = new Rett("Pizza", "Hovedrett", 105, "Stapp pizzadeig full av dritt");
        private static Rett godteri = new Rett("Godteri", "Dessert", 70, "Velg ut dine favoritter");
        //menu with the above dishes
        private static Meny diabetes = new Meny("Diabetes", new ArrayList<>(Arrays.asList(osteloff, pizza, godteri)));

        private static Rett bufallowings = new Rett("Buffalo Wings", "Forrett", 60, "Marinate chicken wings in hot sauce");
        private static Rett steak = new Rett("T-bone steak", "Hovedrett", 250, "Marinate and use salt, grill good");
        private static Rett pancakes = new Rett("Pancakes", "Dessert", 120, "Flour, milk and eggs");
        //Menu containing the dishes above
        private static Meny american = new Meny("American", new ArrayList<>(Arrays.asList(bufallowings, steak, pancakes)));


        private static String Name;
        private static String Type;
        private static double Price;
        private static String Recipe;
    
        public static void main(String [] args) {
            meny();
        }
    
        public static void meny() {
            MenyRegister menyReg = new MenyRegister(new ArrayList<>(Arrays.asList(diabetes,american/*, mixed*/)));
    
            while(true) {
                System.out.println( "0. Avslutt\n" +
                                    "1. Antall menyer\n" +
                                    "2. Registrer en ny rett\n" +
                                    "3. Finn alle retter av en type\n" +
                                    "4. Registrere en ny meny\n" +
                                    "5. Finne alle menyer med innenfor gitt pris\n" + 
                                    "6. Antall retter registrert totalt\n" +
                                    "7. Finn en rett ut ifra navn");           
                int choice = s.nextInt();
                switch(choice) {
                    case 0:
                        System.out.println("Avslutter systemet");
                        System.exit(0);
                    case 1:
                        System.out.println("\nAntall menyer: " + menyReg.numMeny());
                        break;
                    case 2:
                        System.out.println("Navn på den nye retten: \n");
                        s.nextLine();
                        Name = s.nextLine();
                        System.out.println("Hvordan type er retten? (Appetizer, Main, Dessert)");
                        Type = s.nextLine();
                        System.out.println("Hva er oppskriften?");
                        Recipe = s.nextLine();
                        System.out.println("Hva er prisen?");
                        Price = s.nextDouble();
                        System.out.println("Registrert " + menyReg.registrerRett(Type, Name, Price, Recipe));
                        break;
                    case 3:
                        System.out.println("Finne alle retter av en type");
                        System.out.println("Hvordan type rett vil du finne? (Appetizer, Main, Dessert)");
                        s.nextLine();
                        String type = s.nextLine();
                        System.out.println("Retter med typen '" + type + "': " + menyReg.finnType(type).toString());
                        break;
                    case 4:
                        ArrayList<String> dishNames = new ArrayList<>();
                        ArrayList<Rett> dishes = new ArrayList<>();
    
                    
                        System.out.println("Registrere en ny meny");
                        System.out.println("Navn på menyen?");
                        s.nextLine();
                        String name = s.nextLine();
                        while(true) {
                            System.out.println("Navn på rett du vil legge til i menyen?");
                            String dishName = s.nextLine();
                            dishNames.add(dishName);
                            System.out.println("Vil du legge til en til rett?\n 1. Ja \n 2. Nei");
                            choice = s.nextInt();
                            if(choice == 2) {
                                break;
                                }
                        }
    
                        for(String i : dishNames) {
                            Rett dishAdd = menyReg.finnRett(i);
                            dishes.add(dishAdd);
                        }
                        System.out.println("Lagrer en ny meny" + menyReg.registrerMeny(name, dishes));
                        break;
                    case 5: 
                        System.out.println("Finne alle menyer innenfor en gitt pris");
                        System.out.println("Skriv inn laveste pris");
                        double minPrice = s.nextDouble();
                        System.out.println("Skriv inn høyeste pris");
                        double maxPrice = s.nextDouble();
                        System.out.println("Menyene er: " + menyReg.menyIntervall(minPrice, maxPrice).toString());
                        break;
                    case 6: 
                        System.out.println("Finne antall registrerte retter");
                        System.out.println("Antall retter er: " + menyReg.numDish());
                        break;
                    case 7:
                        System.out.println("Skriv inn navn på rett: ");
                        s.nextLine();
                        name = s.nextLine();
                        System.out.println(menyReg.finnRett(name).toString());
                        break;
                    default:
                        System.out.println("Du skrev noe feil...");
                        continue;
                }
            }
        }
    }