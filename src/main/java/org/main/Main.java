package org.main;

import com.sun.source.tree.Tree;
import org.main.classes.A;
import org.main.classes.Account;
import org.main.classes.Airplane;
import org.main.classes.Animal;
import org.main.classes.ArrayUtils;
import org.main.classes.AverageSensor;
import org.main.classes.B;
import org.main.classes.Box;
import org.main.classes.BoxWithMaxWeight;
import org.main.classes.C;
import org.main.classes.Calculator;
import org.main.classes.Cat;
import org.main.classes.Checker;
import org.main.classes.Dog;
import org.main.classes.Flight;
import org.main.classes.FlightControl;
import org.main.classes.Hideout;
import org.main.classes.IOU;
import org.main.classes.Item;
import org.main.classes.LicensePlate;
import org.main.classes.Lists;
import org.main.classes.LiquidContainers;
import org.main.classes.LiquidContainers2;
import org.main.classes.Loops;
import org.main.classes.LotteryRow;
import org.main.classes.MisplacingBox;
import org.main.classes.NoiseCapable;
import org.main.classes.OneItemBox;
import org.main.classes.Sensor;
import org.main.classes.SquareCalculator;
import org.main.classes.StandardSensor;
import org.main.classes.StorageFacility;
import org.main.classes.TemperatureSensor;
import org.main.classes.TreePrinter;
import org.main.classes.ValueComparison;
import org.main.classes.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        SquareCalculator calculator = new SquareCalculator();
//        calculator.squaring();
//        calculator.squareRooting();
//
//        ValueComparison valueComparison = new ValueComparison();
//        valueComparison.compare();
//
//        Loops loop = new Loops();
//        loop.carryOn();
//        loop.loopTo4();
//        loop.inputCounter();
//        loop.calculateAverageOfPositive();
//        loop.countToHundred();
//        loop.factorialCalculator();
//        loop.numberStats();
//
//        Checker checker = new Checker();
//        checker.divisibleByThreeInRange();
//
//        double result = Calculator.average(4, 3, 6, 1);
//        System.out.println("Average: " + result);

        TreePrinter.christmasTree();
        Lists list = new Lists();
        list.sumOfList();
        list.checkStringInList();

        Loops loop = new Loops();
        loop.calculateAverageOfPositive();
        loop.cubeCalculator();

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println("After updating Arthur's debt: " + mattsIOU.howMuchDoIOweTo("Arthur"));

        System.out.println("Debt to unknown person: " + mattsIOU.howMuchDoIOweTo("Unknown"));

        System.out.println("\n=== LicensePlate Class Testing ===");
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        VehicleRegistry registry = new VehicleRegistry();
        System.out.println("Adding plates:");
        System.out.println("Add FI ABC-123 to Arto: " + registry.add(li1, "Arto"));
        System.out.println("Add FI UXE-465 to Pekka: " + registry.add(li2, "Pekka"));
        System.out.println("Add D B WQ-431 to Jürgen: " + registry.add(li3, "Jürgen"));
        System.out.println("Try to add FI ABC-123 again to someone else: " + registry.add(li1, "Someone"));

        System.out.println("Owner of FI ABC-123: " + registry.get(li1));
        System.out.println("Owner of unknown plate: " + registry.get(new LicensePlate("US", "XXX-000")));
        registry.printLicensePlates();

        registry.printOwners();

        LicensePlate li4 = new LicensePlate("FI", "DEF-456");
        registry.add(li4, "Arto");
        registry.printOwners();

        System.out.println("Remove FI UXE-465: " + registry.remove(li2));
        System.out.println("Try to remove same plate again: " + registry.remove(li2));
        System.out.println("Remaining license plates:");
        registry.printLicensePlates();

        Account myAccount = new Account("My account", 100.0);
        myAccount.deposit(20.0);
        System.out.println("The balance is now: " + myAccount.balance());

        StorageFacility facility = new StorageFacility();

        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println("Contents of a14: " + facility.contents("a14"));
        System.out.println("Contents of f156: " + facility.contents("f156"));
        System.out.println("Contents of g63: " + facility.contents("g63"));
        System.out.println("Contents of non-existent unit: " + facility.contents("nonexistent"));

        System.out.println("All storage units: " + facility.storageUnits());

        facility.remove("f156", "rollerblades");
        System.out.println("Contents of f156 after removing one rollerblade: " + facility.contents("f156"));

        facility.remove("f156", "rollerblades");
        System.out.println("Storage units after removing all items from f156: " + facility.storageUnits());

        facility.remove("nonexistent", "item");
        System.out.println("Storage units after trying to remove from non-existent unit: " + facility.storageUnits());

        System.out.println("Class Inheritance Testing");

        System.out.println("Testing individual classes:");
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        System.out.println("Testing inheritance - B can call A's method:");
        b.a();
        b.b();

        System.out.println("Testing inheritance - C can call all methods:");
        c.a();
        c.b();
        c.c();

        System.out.println("Testing polymorphism:");
        A polymorphicB = new B();
        A polymorphicC = new C();

        polymorphicB.a(); // Can call A's method through B object
        polymorphicC.a(); // Can call A's method through C object

        System.out.println("Item and Box Hierarchy Testing");

        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Saludo", 10);
        Item item3 = new Item("Pirkka", 5);

        System.out.println("Item equality testing:");
        System.out.println("item1.equals(item2): " + item1.equals(item2));
        System.out.println("item1.equals(item3): " + item1.equals(item3));

        System.out.println("Testing BoxWithMaxWeight:");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println("BoxWithMaxWeight results:");
        System.out.println(coffeeBox.isInBox(new Item("Saludo"))); // Should be true
        System.out.println(coffeeBox.isInBox(new Item("Pirkka"))); // Should be true
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak"))); // Should be false

        System.out.println("Testing OneItemBox:");
        OneItemBox oneBox = new OneItemBox();
        oneBox.add(new Item("Saludo", 5));
        oneBox.add(new Item("Pirkka", 5));

        System.out.println("OneItemBox results:");
        System.out.println(oneBox.isInBox(new Item("Saludo"))); // Should be true
        System.out.println(oneBox.isInBox(new Item("Pirkka"))); // Should be false

        System.out.println("Testing MisplacingBox:");
        MisplacingBox misplacingBox = new MisplacingBox();
        misplacingBox.add(new Item("Saludo", 5));
        misplacingBox.add(new Item("Pirkka", 5));

        System.out.println("MisplacingBox results:");
        System.out.println(misplacingBox.isInBox(new Item("Saludo"))); // Should be false
        System.out.println(misplacingBox.isInBox(new Item("Pirkka"))); // Should be false

        System.out.println("Testing multiple item addition:");
        BoxWithMaxWeight multiBox = new BoxWithMaxWeight(15);
        ArrayList<Item> itemsToAdd = new ArrayList<>();
        itemsToAdd.add(new Item("Coffee", 3));
        itemsToAdd.add(new Item("Tea", 2));
        itemsToAdd.add(new Item("Sugar", 4));

        multiBox.add(itemsToAdd);
        System.out.println("Items in multiBox after adding list:");
        System.out.println("Coffee: " + multiBox.isInBox(new Item("Coffee")));
        System.out.println("Tea: " + multiBox.isInBox(new Item("Tea")));
        System.out.println("Sugar: " + multiBox.isInBox(new Item("Sugar")));

        System.out.println("Animal Hierarchy Testing ");

        System.out.println("Testing Dog class:");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
        System.out.println("Dog's name: " + dog.getName());

        Dog fido = new Dog("Fido");
        fido.bark();
        fido.eat();
        System.out.println("Named dog's name: " + fido.getName());

        System.out.println("Testing Cat class:");
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        cat.sleep();
        System.out.println("Cat's name: " + cat.getName());

        Cat garfield = new Cat("Garfield");
        garfield.purr();
        garfield.eat();
        System.out.println("Named cat's name: " + garfield.getName());

        NoiseCapable noisyDog = new Dog();
        noisyDog.makeNoise();

        NoiseCapable noisyCat = new Cat("Garfield");
        noisyCat.makeNoise();

        Cat castedCat = (Cat) noisyCat;
        castedCat.purr();

        System.out.println("Testing Animal polymorphism:");
        Animal[] animals = {new Dog("Rex"), new Cat("Whiskers")};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is an animal");
            animal.eat();
            animal.sleep();

            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }

            if (animal instanceof NoiseCapable) {
                ((NoiseCapable) animal).makeNoise();
            }
        }

        System.out.println("Testing StandardSensor:");
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println("ten.read(): " + ten.read());
        System.out.println("minusFive.read(): " + minusFive.read());
        System.out.println("ten.isOn(): " + ten.isOn());
        ten.setOff();
        System.out.println("ten.isOn() after setOff(): " + ten.isOn());

        System.out.println("Testing TemperatureSensor:");
        TemperatureSensor tempSensor = new TemperatureSensor();
        System.out.println("Temperature sensor initially on: " + tempSensor.isOn());

        tempSensor.setOn();
        System.out.println("Temperature sensor after setOn(): " + tempSensor.isOn());
        System.out.println("Temperature reading: " + tempSensor.read());

        tempSensor.setOff();
        System.out.println("Temperature sensor after setOff(): " + tempSensor.isOn());

        try {
            tempSensor.read();
        } catch (IllegalStateException e) {
            System.out.println("Correctly threw IllegalStateException: " + e.getMessage());
        }

        System.out.println("Testing AverageSensor:");
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("Testing AverageSensor readings:");
        Sensor kumpula2 = new TemperatureSensor();
        Sensor kaisaniemi2 = new TemperatureSensor();
        Sensor helsinkiVantaaAirport2 = new TemperatureSensor();

        AverageSensor helsinkiRegion2 = new AverageSensor();
        helsinkiRegion2.addSensor(kumpula2);
        helsinkiRegion2.addSensor(kaisaniemi2);
        helsinkiRegion2.addSensor(helsinkiVantaaAirport2);

        helsinkiRegion2.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion2.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion2.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion2.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion2.readings());

        System.out.println("Testing AverageSensor with mixed sensors:");
        AverageSensor mixedSensor = new AverageSensor();
        mixedSensor.addSensor(new StandardSensor(20));
        mixedSensor.addSensor(new StandardSensor(30));
        TemperatureSensor tempSensor2 = new TemperatureSensor();
        tempSensor2.setOn();
        mixedSensor.addSensor(tempSensor2);

        mixedSensor.setOn();
        System.out.println("Mixed sensor average: " + mixedSensor.read());
        System.out.println("Mixed sensor readings: " + mixedSensor.readings());

        System.out.println("\nTesting AverageSensor error conditions:");
        AverageSensor emptySensor = new AverageSensor();
        try {
            emptySensor.read();
        } catch (IllegalStateException e) {
            System.out.println("Empty sensor correctly threw IllegalStateException: " + e.getMessage());
        }

        AverageSensor offSensor = new AverageSensor();
        offSensor.addSensor(new TemperatureSensor());
        try {
            offSensor.read();
        } catch (IllegalStateException e) {
            System.out.println("Off sensor correctly threw IllegalStateException: " + e.getMessage());
        }

        System.out.println("Flight Control Application");
        Scanner mainScanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl(mainScanner);
        flightControl.start();

        System.out.println("Hideout Generic Class Testing");
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        Hideout<Integer> intDen = new Hideout<>();
        System.out.println(intDen.isInHideout());
        intDen.putIntoHideout(1);
        System.out.println(intDen.isInHideout());
        System.out.println(intDen.isInHideout());
        System.out.println(intDen.takeFromHideout());
        System.out.println(intDen.isInHideout());

        System.out.println("Testing Hideout with different types:");

        Hideout<Double> doubleDen = new Hideout<>();
        doubleDen.putIntoHideout(3.14);
        System.out.println("Double hideout contains: " + doubleDen.takeFromHideout());

        Hideout<Item> itemDen = new Hideout<>();
        Item testItem = new Item("TestItem", 100);
        itemDen.putIntoHideout(testItem);
        System.out.println("Item hideout contains: " + itemDen.takeFromHideout());

        System.out.println("Testing object replacement:");
        Hideout<String> replacementTest = new Hideout<>();
        replacementTest.putIntoHideout("first");
        System.out.println("Before replacement: " + replacementTest.isInHideout());
        replacementTest.putIntoHideout("second");
        System.out.println("After replacement, contains: " + replacementTest.takeFromHideout());

        System.out.println("Testing null handling:");
        Hideout<String> nullTest = new Hideout<>();
        System.out.println("Empty hideout takeFromHideout(): " + nullTest.takeFromHideout());
        nullTest.putIntoHideout(null);
        System.out.println("After putting null, isInHideout(): " + nullTest.isInHideout());

        System.out.println("LotteryRow Class Testing");

        System.out.println("Testing LotteryRow creation and basic functionality:");
        for (int i = 0; i < 3; i++) {
            LotteryRow row = new LotteryRow();
            ArrayList<Integer> lotteryNumbers = row.numbers();

            System.out.print("Lottery numbers " + (i + 1) + ": ");
            for (int number : lotteryNumbers) {
                System.out.print(number);
            }

            System.out.println("Number count: " + lotteryNumbers.size());

            boolean allInRange = true;
            for (int number : lotteryNumbers) {
                if (number < 1 || number > 40) {
                    allInRange = false;
                    break;
                }
            }
            System.out.println("All numbers in range 1-40: " + allInRange);

            boolean allUnique = lotteryNumbers.size() == lotteryNumbers.stream().distinct().count();
            System.out.println("All numbers unique: " + allUnique);
        }

        System.out.println("Testing containsNumber method:");
        LotteryRow testRow = new LotteryRow();
        ArrayList<Integer> numbers = testRow.numbers();
        System.out.print("Test row numbers: ");
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();

        int firstNumber = numbers.get(0);
        int lastNumber = numbers.get(numbers.size() - 1);
        System.out.println("Contains " + firstNumber + testRow.containsNumber(firstNumber));
        System.out.println("Contains " + lastNumber + testRow.containsNumber(lastNumber));

        int testNumber = 1;
        while (testRow.containsNumber(testNumber)) {
            testNumber++;
        }
        System.out.println("Contains " + testNumber + " (should be false): " + testRow.containsNumber(testNumber));

        System.out.println("Testing randomizeNumbers method:");
        LotteryRow randomizeTestRow = new LotteryRow();
        ArrayList<Integer> originalNumbers = new ArrayList<>(randomizeTestRow.numbers());
        System.out.print("Original numbers: ");
        for (int number : originalNumbers) {
            System.out.print(number);
        }

        randomizeTestRow.randomizeNumbers();
        ArrayList<Integer> newNumbers = randomizeTestRow.numbers();
        System.out.print("New numbers: ");
        for (int number : newNumbers) {
            System.out.print(number);
        }

        boolean numbersChanged = !originalNumbers.equals(newNumbers);
        System.out.println("Numbers changed after randomization: " + numbersChanged);

        System.out.println("Testing equals method:");
        LotteryRow row1 = new LotteryRow();
        LotteryRow row2 = new LotteryRow();
        System.out.println("Two different random rows are equal: " + row1.equals(row2));
        System.out.println("Row equals itself: " + row1.equals(row1));
        System.out.println("Row equals null: " + row1.equals(null));
        System.out.println("Row equals different object type: " + row1.equals("not a lottery row"));

        System.out.println("ArrayUtils - arrayAsString Method Testing");

        System.out.println("Testing first example (2x3 matrix with specific values):");
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;

        System.out.println("Matrix contents:");
        System.out.println("Row 0: " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);
        System.out.println("Row 1: " + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);
        System.out.println("arrayAsString output:");
        System.out.println(ArrayUtils.arrayAsString(matrix));

        System.out.println("Testing second example (3x4 matrix with initialized values):");
        int[][] matrix2 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println("Matrix contents:");
        for (int i = 0; i < matrix2.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
        }
        System.out.println("arrayAsString output:");
        System.out.println(ArrayUtils.arrayAsString(matrix2));

        System.out.println("Testing additional cases:");

        int[][] singleRow = {{1, 2, 3, 4, 5}};
        System.out.println("Single row matrix:");
        System.out.println(ArrayUtils.arrayAsString(singleRow));

        int[][] singleColumn = {{1}, {2}, {3}};
        System.out.println("Single column matrix:");
        System.out.println(ArrayUtils.arrayAsString(singleColumn));

        int[][] largeNumbers = {
            {10, 11, 12},
            {20, 21, 22}
        };
        System.out.println("Matrix with larger numbers:");
        System.out.println(ArrayUtils.arrayAsString(largeNumbers));

        int[][] emptyMatrix = {{0}};
        System.out.println("1x1 matrix with zero:");
        System.out.println(ArrayUtils.arrayAsString(emptyMatrix));
    }
}
