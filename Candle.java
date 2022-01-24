/*
This is supoerclass name Candle
 */
public class Candle {
    private String color;int height;double price;
    
   public String getColor()
    {
        return color;
    }
   
    public int getHeight()
    {
        return height;
    }

    public double getPrice(){
        return price;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void setHeight(int h){
        final double PER_INCH = 2;
        height =h;
        price = height * PER_INCH;
    }
}
