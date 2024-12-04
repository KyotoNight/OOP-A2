public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        System.out.println("\n============= Part 3: Queue Interface Test =============");
        assignment.partThree();

        System.out.println("\n============= Part 4A: History Collection Test =============");
        assignment.partFourA();

        System.out.println("\n============= Part 4B: History Sorting Test =============");
        assignment.partFourB();

        System.out.println("\n============= Part 5: Ride Operation Test =============");
        assignment.partFive();

        System.out.println("\n============= Part 6: History Export Test =============");
        assignment.partSix();

        System.out.println("\n============= Part 7: History Import Test =============");
        assignment.partSeven();
    }

    public void partThree() {
        Employee operator = new Employee("Dick", 25, "E001", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 140, operator, 2);

        Visitor v1 = new Visitor("David", 20, "V001", "Regular", false);
        Visitor v2 = new Visitor("Shelby", 25, "V002", "VIP", true);
        Visitor v3 = new Visitor("Ben", 30, "V003", "Regular", false);
        Visitor v4 = new Visitor("Lee", 35, "V004", "Regular", false);
        Visitor v5 = new Visitor("Mag", 28, "V005", "VIP", true);

        System.out.println("\n=== Testing Add Visitor to Queue ===");
        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        System.out.println("\n=== Print Current Queue Status ===");
        rollerCoaster.printQueue();

        System.out.println("\n=== Testing Remove Visitor ===");
        rollerCoaster.removeVisitorFromQueue();

        System.out.println("\n=== Print Updated Queue Status ===");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        Employee operator = new Employee("Dick", 25, "E001", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 140, operator, 2);

        Visitor v1 = new Visitor("David", 20, "V001", "Regular", false);
        Visitor v2 = new Visitor("Shelby", 25, "V002", "VIP", true);
        Visitor v3 = new Visitor("Ben", 30, "V003", "Regular", false);
        Visitor v4 = new Visitor("Lee", 35, "V004", "Regular", false);
        Visitor v5 = new Visitor("Mag", 28, "V005", "VIP", true);

        System.out.println("\n=== Testing Add Visitor to History ===");
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);

        System.out.println("\n=== Testing Check Visitor in History ===");
        rollerCoaster.checkVisitorFromHistory(v1);
        rollerCoaster.checkVisitorFromHistory(new Visitor());

        System.out.println("\n=== Print Number of Visitors in History ===");
        System.out.println("Number of visitors in history: " + rollerCoaster.numberOfVisitors());

        System.out.println("\n=== Print All History Records ===");
        rollerCoaster.printRideHistory();
    }

    public void partFourB() {
        Employee operator = new Employee("Dick", 25, "E001", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 140, operator, 2);

        Visitor v1 = new Visitor("David", 20, "V001", "Regular", false);
        Visitor v2 = new Visitor("Shelby", 25, "V002", "VIP", true);
        Visitor v3 = new Visitor("Ben", 30, "V003", "Regular", false);
        Visitor v4 = new Visitor("Lee", 35, "V004", "VIP", true);
        Visitor v5 = new Visitor("Mag", 28, "V005", "Regular", false);

        System.out.println("\n=== Add Visitors to History ===");
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);

        System.out.println("\n=== History Before Sorting ===");
        rollerCoaster.printRideHistory();

        System.out.println("\n=== Executing Sort ===");
        rollerCoaster.sortVisitorHistory();

        System.out.println("\n=== History After Sorting ===");
        rollerCoaster.printRideHistory();
    }

    public void partFive() {
        Employee operator = new Employee("Dick", 25, "E001", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 140, operator, 4);

        Visitor[] visitors = {
            new Visitor("David", 20, "V001", "Regular", false),
            new Visitor("Shelby", 25, "V002", "VIP", true),
            new Visitor("Ben", 30, "V003", "Regular", false),
            new Visitor("Lee", 35, "V004", "Regular", false),
            new Visitor("Mag", 28, "V005", "VIP", true),
            new Visitor("Night", 22, "V006", "Regular", false),
            new Visitor("Jane", 27, "V007", "VIP", true),
            new Visitor("Lucky", 31, "V008", "Regular", false),
            new Visitor("Elma", 29, "V009", "Regular", false),
            new Visitor("Park", 33, "V010", "VIP", true)
        };

        System.out.println("\n=== Adding 10 Visitors to Queue ===");
        for (Visitor visitor : visitors) {
            rollerCoaster.addVisitorToQueue(visitor);
        }

        System.out.println("\n=== Queue Status Before Operation ===");
        rollerCoaster.printQueue();

        System.out.println("\n=== Running One Cycle ===");
        rollerCoaster.runOneCycle();

        System.out.println("\n=== Queue Status After Operation ===");
        rollerCoaster.printQueue();

        System.out.println("\n=== View Ride History ===");
        rollerCoaster.printRideHistory();

        Ride brokenRide = new Ride("Broken Ride", 140, null, 4);
        brokenRide.addVisitorToQueue(visitors[0]);
        brokenRide.runOneCycle();

        Ride emptyRide = new Ride("Empty Ride", 140, operator, 4);
        emptyRide.runOneCycle();
    }

    public void partSix() {
        Employee operator = new Employee("Dick", 25, "E001", "Ride Operator", 50000);
        Ride rollerCoaster = new Ride("Roller Coaster", 140, operator, 4);

        Visitor v1 = new Visitor("David", 20, "V001", "Regular", false);
        Visitor v2 = new Visitor("Shelby", 25, "V002", "VIP", true);
        Visitor v3 = new Visitor("Ben", 30, "V003", "Regular", false);
        Visitor v4 = new Visitor("Lee", 35, "V004", "Regular", false);
        Visitor v5 = new Visitor("Mag", 28, "V005", "VIP", true);

        System.out.println("\n=== Adding Visitors to History ===");
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);

        System.out.println("\n=== History Before Export ===");
        rollerCoaster.printRideHistory();

        System.out.println("\n=== Exporting History to File ===");
        rollerCoaster.exportRideHistory("ride_history.csv");
    }

    public void partSeven() {
        Ride rollerCoaster = new Ride("Roller Coaster", 140, null, 4);

        System.out.println("\n=== History Before Import ===");
        rollerCoaster.printRideHistory();

        System.out.println("\n=== Importing History from File ===");
        rollerCoaster.importRideHistory("ride_history.csv");

        System.out.println("\n=== History After Import ===");
        rollerCoaster.printRideHistory();

        System.out.println("\n=== Verify Imported Visitor Count ===");
        System.out.println("Number of visitors in history: " + rollerCoaster.numberOfVisitors());
    }
}
