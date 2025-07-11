import java.util.Random;

public class vidadi_fakhraziev_hw_2 {
    public static void permission(int age, int temperature) {
        if((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Можно идти гулять");
        } else if(age < 20 && (temperature >= 0 && temperature <= 28)) {
            System.out.println("Можно идти гулять");
        } else if(age > 45 && (temperature >= -10 && temperature <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }

    public static int generateRandomAge(){
        Random rand = new Random();
        int randomAge = rand.nextInt(100);
        return randomAge;
    }

    public static void main(String[] args){
        permission(21, 17);
        permission(8, -10);
        permission(47, -30);
        permission(50, 5);
        permission(60, 60);

        permission(generateRandomAge(), 15);
    }
}
