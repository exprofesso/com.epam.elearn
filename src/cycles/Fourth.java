package cycles;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Fourth {
    public static void main(String[] args) {
        System.out.println(twoHundred());
    }

    public static long twoHundred(){
        long squadMult = 1;
        for(int i = 1; i <= 200; i++) {
            squadMult = (long) (squadMult * Math.pow(i, 2));
        }
        return squadMult;
    }
    }

