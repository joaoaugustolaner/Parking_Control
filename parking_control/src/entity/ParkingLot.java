package entity;

import java.io.Serializable;

public class ParkingLot implements Serializable {

   private Spot[][] spots;

   public ParkingLot(int width, int length) {
      this.spots = new Spot[width][length];
      populateMatrix();
   }

   private void populateMatrix() {
      for (int i = 0; i < spots.length; i++) {
         for (int j = 0; j < spots[i].length; j++) {
            getSpots()[i][j] = new Spot();
         }
      }
   }

   public Spot[][] getSpots() {
      return spots;
   }

   public void setSpots(Spot[][] spots) {
      this.spots = spots;
   }


}
