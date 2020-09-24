package entity;

public class ParkingLot {

   private Spot[][] spots;

   public ParkingLot(int width, int length) {
      this.spots = new Spot[width][length];
   }

   public Spot[][] getSpots() {
      return spots;
   }

   public void setSpots(Spot[][] spots) {
      this.spots = spots;
   }
}
