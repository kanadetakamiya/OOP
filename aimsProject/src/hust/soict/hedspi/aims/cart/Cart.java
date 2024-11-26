package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import javax.swing.JOptionPane;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            JOptionPane.showMessageDialog(null, "The Disc has been added.");
        } else {
            JOptionPane.showMessageDialog(null, "The cart is full!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvdList1 : dvdList) {
            addDigitalVideoDisc(dvdList1);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        for (i = qtyOrdered - 1; i >= 0; i--) {
            if (itemsOrdered[i] == disc) {
                break;
            }
        }
        for (; i < qtyOrdered - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        qtyOrdered--;
        JOptionPane.showMessageDialog(null, "The disc has been removed.");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
                    + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " minutes: "
                    + itemsOrdered[i].getCost() + " $");
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    public void search(int id) {
        int i;
        boolean found = false;
        for (i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
                        + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " minutes: "
                        + itemsOrdered[i].getCost() + " $");
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No result found.");
        }
    }

    public void search(String title) {
        int i;
        boolean found = false;
        for (i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
                        + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " minutes: "
                        + itemsOrdered[i].getCost() + " $");
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No result found.");
        }
    }
}
