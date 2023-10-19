import java.util.Random;

interface ReservationInterface {
    void RandomDay();
    void Code();
}

class Reservation implements ReservationInterface {
    private String code;
    private String day;

    public Reservation(){
        RandomDay();
        Code();
    }

    @Override
    public void RandomDay() {
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        Random random = new Random();
        int randomIndex = random.nextInt(days.length);
        this.day = days[randomIndex];
    } 

    @Override
    public void Code() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            if (random.nextBoolean()) {
                code += random.nextInt(10);
            } else {
                code += (char)(random.nextInt(26) + 'A');
            }
        }
    }

    public void printBooking() {
        System.out.println("Booking# " + code + " for " + day);
    }
}



public class ReservationClass {
    public static void main(String[] args) {
        Reservation foglalas = new Reservation();
        foglalas.printBooking();
    }
}
