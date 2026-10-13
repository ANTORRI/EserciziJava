public class Elevator {
    private int n_floors;
    private int current_floor;
    private boolean open;

    public Elevator(int n_floors){
        this.n_floors = n_floors;
        if (n_floors < 2){
            n_floors = 2;
        }
        this.current_floor = 0;
        open = false;
    }

    public int getFloor(){
        return current_floor;
    }

    public int getFloors(){
        return n_floors;
    }

    public boolean opens(){
        return open = true;
    }

    public boolean close(){
        return open = false;
    }

    public boolean goUp(){
        if (open == false){

            if (current_floor < n_floors){
                current_floor ++;
                return true;
            }

        }
        return false;
    }

    public boolean goDown(){
        if (open == false){

            if (current_floor > 0){
                current_floor --;
                return true;
            }

        }
        return false;
    }

    public boolean goToFloor(int n){
        current_floor = n;
    }
}
