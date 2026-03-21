package inheritance;

public class HRmanager extends Employee{
    @Override
    public void work() {
        super.work();
    }

    public void addEmployee(){
        System.out.println("Adding employee");
    }
}
