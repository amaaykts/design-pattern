package command;

/**
 * Created by aandreev on 05.04.2017.
 */
public class CommandExample {
    public static void main(String[] args) {
        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}
