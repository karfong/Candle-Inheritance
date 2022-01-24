/*
this is object of Candle
 */
public class DemoCandles {
  
    public static void main(String[] args) {
        Candle c = new Candle();
        ScentedCandle sc = new ScentedCandle();
        
        c.setColor("yellow");
        c.setHeight(3);
        
        sc.setColor("orange");
        sc.setScent("Lavender");
        sc.setHeight(6);
        
        System.out.println("This is superclass object's details");
        System.out.println("==========================================");
        System.out.println("The color : " + c.getColor() + "\n" + "The height : " + c.getHeight() + " inches \n"  + "The price : RM " + c.getPrice() + "\n");
        
        System.out.println("This is subclass object's details");
        System.out.println("==========================================");
        System.out.println("The color : " + sc.getColor() + "\n" + "The height : " + sc.getHeight() + " inches \n"  + "The price : RM " + sc.getPrice() + "\n" + "The scent is " + sc.getScent());
    }  
}
