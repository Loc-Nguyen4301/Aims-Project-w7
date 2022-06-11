import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added");
            System.out.println(itemsOrdered.size());
        } else {
            System.out.println("ERROR!!! Vuot qua so luong MAX_NUMBER_ORDERED");
            System.out.println("Can't add media have title \"" + media.getTitle() + "\" in Order");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        } else
            System.out.println("List don't have this item");
    }

    public void removeMediaById(int ID) {
        if (ID<itemsOrdered.size()) {
            itemsOrdered.remove(ID);
        } else
            System.out.println("List don't have this item");
    }

    public float totalCost() {
        float total = 0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

}
