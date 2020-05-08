package planner.app;

public class Utiliy {
    public static double roundDoubleToHalf(double d){
        return ((int) (d*2 + Math.signum(d)*0.5))/2.0;
    }
}
