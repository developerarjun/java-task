public class Light {
   //Static property
   public static final int LOW = 1;
   public static final int MEDIUM = 2;
   public static final int HIGH = 3;
   //Private property
   private int light_brightness;
   private boolean light_switch;
   private String light_color;
   //Default Constructor
   public Light(){
       this.light_brightness = LOW;
       this.light_switch = false;
       this.light_color = "red";
   }
   //Accessors Methods
   public int getLightBrightness(){
        return this.light_brightness;
   }
   public boolean getLightSwitch(){
        return this.light_switch;
   }
   public String getLightColor(){
        return this.light_color;
   }
   //Mutators Methods
   public void setLightBrightness(int light_brightness){
        this.light_brightness = light_brightness;
   }
   public void setLightSwitch(boolean light_switch){
        this.light_switch = light_switch;
   }
   public void setLightColor(String light_color){
        this.light_color = light_color;
   }
   @Override
    public String toString() {
        if(this.light_switch){
            return "Light Brightness = " +getLightBrightness() + " and Color = " +getLightColor();
        }
        return "Light Color: "+getLightColor() + "and  Light is off";
    }
}