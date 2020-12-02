package branching;


/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */
public class First {
    public static void main(String[] args) {
        System.out.println(triangle(45,45));
    }

    public static boolean triangle(int x, int y){

        if((180 - (x+y)) > 0) {
            if ((x == 90) || (y == 90) || ((180 - (x+y)) == 90)) {
                System.out.println("Tреугольник прямоугольный");
            }
            return true;
        }
        return false;
    }
}
