
public class Elevator1 {
    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    Integer currentFloor,no;

    public Elevator1(){
        currentFloor=0;
    }
    public Elevator1(int no){
        System.out.println(no);
    }

    public void goTo(int Floor){
        if(currentFloor==Floor) {
            System.out.println("Elevator already on floor " + Floor);
        }else
        if(currentFloor<Floor){
            for(int i=currentFloor;i<=Floor;i++){
                System.out.println("Elevator on " + i + " Floor");
                currentFloor=i;
            }
            System.out.println("Elevator Reached on " + currentFloor + " Floor");
        }else
        if(currentFloor>Floor) {
            for (int i = currentFloor; i >= Floor; i--) {
                System.out.println("Elevator on " + i + " Floor");
                currentFloor = i;
            }

            System.out.println("Elevator Reached on " + currentFloor + " Floor");
        }
    }

}
