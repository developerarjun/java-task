public class TestLight{
    public static void main(String[] args){
        Light light1 = new Light();
        light1.setLightBrightness(Light.HIGH);
        light1.setLightColor("orange");
        light1.setLightSwitch(true);
        Light light2 = new Light();
        light2.setLightBrightness(Light.MEDIUM);
        light2.setLightColor("green");
        System.out.println(light1.toString());
        System.out.println(light2.toString());
    }
}