package javarush.RobotFight;

public class Robot extends AbstractRobot  {
    private static int hitCount;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
