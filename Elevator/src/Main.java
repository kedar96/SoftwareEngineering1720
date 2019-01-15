import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
       // int floor = (int) (Math.random() * 10 + 1);
        Elevator e1=new Elevator(2);
        int elev_floor = e1.getFloor();
        System.out.print("Elevator Levels --> 0 = basement & 6 = top floor ");
        System.out.println("\nCurrent Floor Of Elevator : " + elev_floor);
        System.out.print("Enter Current Floor Level u r on : ");
        Scanner sc = new Scanner(System.in);
        int current_floor_person = sc.nextInt();

        if(elev_floor == current_floor_person )
        {
            System.out.println("Enter the elevator");
        }

        else
        {
            MoveElevator(current_floor_person,elev_floor);
        }


        System.out.println("Please Enter the floor u want to go to : ");
        int target_floor = sc.nextInt();

        MoveElevator(target_floor,elev_floor);
    }

    public static void MoveElevator(int target_floor,int elev_floor)
    {
        int direction;
        if( target_floor > elev_floor )
        {
            System.out.println("The elevator is on it's way up...");
            direction = 1;
        }else{
            System.out.println("The elevator is on it's way down...");
            direction = -1;
        }

        while(target_floor != elev_floor)
        {
            elev_floor += direction;
            System.out.println(elev_floor);
        }

        System.out.println("The Elevator Has Arrived");
    }
}