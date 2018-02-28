public class Manager extends Person {
    private int managerId;

    public Manager (int managerId){
        this.managerId = managerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
}
