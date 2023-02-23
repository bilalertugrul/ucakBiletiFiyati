import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilometer, ticketPrice;
        int old, passengerType;
        boolean isValid = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe(KM) : ");
        kilometer = input.nextInt();
        if(kilometer<=0){
            isValid = false;
        }
        System.out.print("Yaş : ");
        old = input.nextInt();
        if(old<=0){
            isValid = false;
        }
        System.out.print("Tek Yön(1), Gidiş-Dnüş(2) : ");
        passengerType = input.nextInt();
        if(!(passengerType>0 && passengerType<3)){
            isValid = false;
        }
        ticketPrice = (kilometer*0.10);

        if(isValid){

            if(old<=12){
                ticketPrice -= (ticketPrice * 0.50);

            } else if (old>12 && old<=24) {

                ticketPrice -= (ticketPrice* 0.10);

            } else if (old>=65) {

                ticketPrice -= (ticketPrice*0.30);
            }
            if(passengerType==2){
                ticketPrice -= (ticketPrice*0.20);
            }

        }else{
            System.out.println("geçersiz işlem");
        }

        System.out.println("Bilet Fiyatı : " + ticketPrice);

    }
}