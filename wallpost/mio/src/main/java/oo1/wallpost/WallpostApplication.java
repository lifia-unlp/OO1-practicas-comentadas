package oo1.wallpost;

import javax.swing.SwingUtilities;

public class WallpostApplication {

  public static void main(String[] args) {

    // https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/package-summary.html
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new WallPostUI();
      }
    });
  }

}
