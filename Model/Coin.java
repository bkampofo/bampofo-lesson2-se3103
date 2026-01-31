package Model;

public abstract class Coin { // abstract class representing a coin is not real but a concept
   private int value;
   private int size; // 0 for heads, 1 for tails
   private int x;
    private int y;

   public Coin (int value, int size) {
       this.value = value;
       this.size = size;
   }

   public void setLocation(int x, int y) {
       this.x = x;
       this.y = y;  
   }

   public int getX() {
       return x;
   }
    public int getY() {
         return y;
    }

    public int getValue() {
         return value;
    }

    public void setValue(int newValue) {
         this.value = newValue;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
