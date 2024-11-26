package aimsProject.src;

import javax.swing.JOptionPane;

public class Cart {
  public static final int MAX_NUMBERS_ORDERED = 20;
  private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  private int qtyOrdered = 0;

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
      itemsOrdered[qtyOrdered++] = disc;
      JOptionPane.showMessageDialog(null, "The Disc has been added.");
    } else
      JOptionPane.showConfirmDialog(null, "The cart is full!");
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    int i;
    for (i = qtyOrdered - 1; i >= 0; i--) {
      if (itemsOrdered[i] == disc)
        break;
    }
    for (; i < qtyOrdered - 1; i++)
      itemsOrdered[i] = itemsOrdered[i + 1];
    qtyOrdered--;
    JOptionPane.showMessageDialog(null, "The disc has been removed.");
  }

  public float totalCost() {
    float sum = 0;
    for (int i = 0; i < qtyOrdered; i++)
      sum += itemsOrdered[i].getCost();
    return sum;
  }
}
