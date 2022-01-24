/*
this is subclass of a candle superclass
 */

public class ScentedCandle extends Candle{
     private String scent;
 
     String getScent(){
         return scent;
     }
     public void setScent(String scent){
         this.scent = scent;
     }
     
     public void setHeight(int h){
         final double PER_INCH = 3;
         super.setHeight(h);
         price = h* PER_INCH;
     }
}
