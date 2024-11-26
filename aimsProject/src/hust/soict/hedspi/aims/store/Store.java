package hust.soict.hedspi.aims.store;

import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {

    public static final int MAX_NUMBER_OF_DISCS = 50;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBER_OF_DISCS];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUMBER_OF_DISCS) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            JOptionPane.showMessageDialog(null, "The Disc has been added.");
        } else {
            JOptionPane.showMessageDialog(null, "The store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int i;
        for (i = qtyInStore - 1; i >= 0; i--) {
            if (itemsInStore[i] == disc) {
                break;
            }
        }
        for (; i < qtyInStore - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        qtyInStore--;
        JOptionPane.showMessageDialog(null, "The disc has been removed.");
    }
}
