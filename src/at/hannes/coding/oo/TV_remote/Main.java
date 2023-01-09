package at.hannes.coding.oo.TV_remote;

public class Main
{
    public static void main(String[] args){
        Battery b1 = new Battery(68.98,true);
        Battery b2 = new Battery(71.56,true);

        Remote TVRemote = new Remote(b1,b2);

        TVRemote.getStatus();
        TVRemote.turnOn();
        TVRemote.turnOff();
    }
}
