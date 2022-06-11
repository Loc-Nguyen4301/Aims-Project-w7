import java.util.*;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application");
        System.out.println("------------------------");
        System.out.println("1.Create new order");
        System.out.println("2.Add item to the order");
        System.out.println("3.Delete item by id");
        System.out.println("4.Display the items list of order");
        System.out.println("0.Exit");
        System.out.println("------------------------");
        System.out.println("Please choose a number 0-1-2-3-4");
    }

    public static void main(String args[]) {
        Order anOrder = new Order();
        while (true) {
            System.out.println("\n\n");
            showMenu();
            Scanner myObj = new Scanner(System.in);
            Integer myChoose = myObj.nextInt();
            if (myChoose == 1) {
                System.out.println("An order is created");
            } else if (myChoose == 2) {
                System.out.println("BOOK || CD || DVD ???");
                Scanner myObj1 = new Scanner(System.in);
                String myChoose1 = myObj1.nextLine();
                if (myChoose1.toUpperCase().equals("BOOK")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Nguyen Gia Loc");
                    list.add("Ngo Thua An");
                    Book book1 = new Book("Tay du ki", "Tieu thuyet", 100.3f, list);
                    anOrder.addMedia(book1);
                } else if (myChoose1.toUpperCase().equals("DVD")) {
                    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Vien Da Nho", "Music", 100.44f, "Hai Bang",
                            150);
                    anOrder.addMedia(dvd1);
                } else if (myChoose1.toUpperCase().equals("CD")) {
                    ArrayList<Track> tracks = new ArrayList<Track>();
                    tracks.add(new Track("Boi tin loi the 1", 25));
                    tracks.add(new Track("Boi tin loi the 2", 25));
                    tracks.add(new Track("Boi tin loi the 3", 25));
                    CompactDisc cd1 = new CompactDisc("Van Quang Long 1", "Music", 100.44f, "Van Quang Long", 150,
                            "Van Quang Long", tracks);
                    anOrder.addMedia(cd1);
                } else
                    System.out.println("Can't add this item in Order");
            } else if (myChoose == 3) {
                System.out.println("ID of item want to remove:");
                Scanner myObj2 = new Scanner(System.in);
                Integer ID = myObj2.nextInt();
                anOrder.removeMediaById(ID);
            } else if (myChoose == 4) {
                for (Media item : anOrder.itemsOrdered) {
                    System.out.println("Title:" + item.getTitle() + "\t" + "Cost:"
                            + item.getCost() + "\t" + "Category:" + item.getCategory());
                }
            } else
                break;
        }

        Thread thread = new Thread(new MemoryDaemon());
        thread.setDaemon(true);
        thread.start();
        thread.run();
    }
}
