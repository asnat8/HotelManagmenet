import java.util.Scanner;

public class HotelManagmenetSystem {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Scanner s=new Scanner(System.in);

        System.out.println("input[1]Represents viewing a list of rooms,[2]Represents a reservation.[3]Indicates check out,[0]Indicates exit from the system");
        while (true){
            System.out.println("Please enter the number:");
            int i = s.nextInt();
            if(i==1){
                hotel.print();
            }else if (i==2){
                System.out.println("Please enter room number:");
                int j = s.nextInt();
                hotel.bookRoom(j);

            }else if (i==3){
                System.out.println("Please enter room number:");
                int j = s.nextInt();
                hotel.checkOut(j);

            }else if (i==0){
                System.out.println("See you next time!");
                return;
            }
            else {
                System.out.println("Wrong input number, please re-enter:");
            }
        }
    }
}
