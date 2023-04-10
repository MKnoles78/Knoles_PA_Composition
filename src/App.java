public class App {
    public static void main(String[] args) throws Exception {
        
        //Create list of the first five tire types
        Tire t1 = new Tire("Pirelli", "205/55R16", 35, 30, "All Season Plus");
        Tire t2 = new Tire("Pirellie", "205/5516", 35, 30, "All Seaon Plus");
        Tire t3 = new Tire("Falken", "205/55R16", 35, 30, "All Season");
        Tire t4 = new Tire("Falken", "205/55R16", 35, 30, "All Season");
        Tire t5 = new Tire("Dorman", "135/80R17", 65, 55, "Spare");

        //Create Automoble objects
        Automobile auto1 = new Automobile("BMW", "325i", "Black", "Luxury Sedan", 
            new Engine(6, "Premium Unleaded Only", true));

        Engine engine = new Engine(6, "Unleaded", true);
        Automobile auto2 = new Automobile("Toyoto", "4-Runner", "Red","SUV", engine);

        auto1.addTire(t1);
        auto1.addTire(t2);
        auto1.addTire(t3);
        auto1.addTire(t4);
        auto1.addTire(t5);

        auto2.addTire("Bridgestone", "2656/70R17", 40, 44, "All Terraine");
        auto2.addTire("Bridgestone", "2656/70R17", 40, 44, "All Terraine");
        auto2.addTire("Bridgestone", "2656/70R17", 40, 44, "All Terraine");
        auto2.addTire("Bridgestone", "2656/70R17", 40, 44, "All Terraine");
        auto2.addTire("Cooper", "265/70R17", 40, 44, "Spare");

        System.out.println("\nMike Knoles - Composition Performance Assessment");
        System.out.println("Automobile 1 - Using to String");
        System.out.println(auto1);
        System.out.println(engine);
        System.out.println("Tire 1");
        System.out.println(t1);
        System.out.println("Tire 2");
        System.out.println(t2);
        System.out.println("Tire 3");
        System.out.println(t3);
        System.out.println("Tire 4");
        System.out.println(t4);
        System.out.println("Tire 5");
        System.out.println(t5);

        System.out.println("\nAutomobile 2 = Using get Basic Info()");
        System.out.print(auto2.getInfo());


    }
}
