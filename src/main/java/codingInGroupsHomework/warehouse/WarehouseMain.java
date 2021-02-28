//package codingInGroupsHomework.warehouse;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Warehouse
// * a. User should be able to: add, display all of the details, update, delete an item
// * b. Use composition and collections (The warehouse has products/items)
// * c. Add possibility to display summaries, like sum of all of the products, their prices.
// * d. *Add possibility to update number of items in a specific way, e.g.: “pliers:30” “scissors:+4”
// */
//
//public class WarehouseMain {
//
//    public static void main(String[] args) {
//
//        Car audi = new Car(26999.9, "A3", "Red");
//        Computer mac = new Computer(1999.9, "Leopard", 1024);
//        Furniture bed = new Furniture(500, "Wood", "bedroom");
//        Paper paper = new Paper(3, "Orion", "A2");
//        PaperClip paperClip = new PaperClip(1, "Orion", "Iron");
//        Pencil pencil = new Pencil(1, "Schneider", "Black");
//
//        List<Gadget> gadgets = new ArrayList<>();
//        gadgets.add(paper);
//        gadgets.add(paperClip);
//        gadgets.add(pencil);
//
//        Warehouse warehouse = new Warehouse(audi, mac, bed, gadgets);
//
//        System.out.println(warehouse.getTotalPrice());
//        System.out.println(warehouse);
//
//        runMe();
//    }
//
//
//    private static void runMe() {
//        System.out.println("Choose from menu: ");
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        String chose = "";
//        while (!chose.equalsIgnoreCase("x")) {
//            menu();
//            chose = scanner.nextLine();
//            switch (chose) {
//                case "1":
//                    menuAddItem();
//                    String selectedMenu = scanner.nextLine();
//                    if (selectedMenu.equalsIgnoreCase("A1")) {
//                        menuItemType();
//                        String menuItemType = scanner.nextLine();
//                        switch (menuItemType) {
//                            case "A1":
//                                System.out.println("Please enter car price: ");
//                                double price = scanner1.nextDouble();
//                                System.out.println("Please enter car brand: ");
//                                String brand = scanner.nextLine();
//                                System.out.println("Please enter car color: ");
//                                String color = scanner.nextLine();
//                                Car carName = new Car(price, brand, color);
//                                addCarToWarehouse(carName);
//                                printAllCars();
//                                break;
//                            default:
//                                System.out.println(" ");
//                                break;
//
//                        }
//                    } else if (selectedMenu == "B1") {
//                        // addNewGadget();
//                    } else {
//                        System.out.println("Wrong selection. ");
//                    }
//                    break;
//                case "2":
//                    break;
//                case "3":
//                    System.out.println(" ");
//                    break;
//                default:
//                    System.out.println(" ");
//                    break;
//            }
//        }
//    }
//
//    private static ArrayList<Car> printAllCars() {
//        System.out.println();
//        return
//    }
//
//    public static ArrayList<Car> addCarToWarehouse(Car carName) {
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(carName);
//
//
//        return cars;
//    }
//
//
//    private static void menu() {
//        System.out.println("[1]- Add new item to warehouse");
//        System.out.println("[2]- Show all details of warehouse");
//        System.out.println("[3]- Update Item");
//        System.out.println("[4]- Delete Item");
//        System.out.println("[x]- Exit");
//    }
//
//    private static void menuAddItem() {
//        System.out.println("Please select what to add: ");
//        System.out.println("[A1]- Add new Item");
//        System.out.println("[B1]- Add new Gadget");
//
//    }
//
//    private static void menuItemType() {
//        System.out.println("[A1]- Add Car");
//        System.out.println("[A2]- Add Furniture");
//        System.out.println("[A3]- Add Computerr");
//
//
//    }
//
//    private static void menuGadgetType() {
//        System.out.println("[A1]- Add Paper");
//        System.out.println("[A2]- Add Paper Clip");
//        System.out.println("[A3]- Add Pencil");
//
//    }
//}