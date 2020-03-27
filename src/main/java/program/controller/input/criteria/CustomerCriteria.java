package program.controller.input.criteria;

public class CustomerCriteria implements Criteria {
    private int badCustomers;

    public CustomerCriteria() {
    }

    public int getBadCustomers() {
        return badCustomers;
    }

    public void get() {
    }

    public void print() {
        System.out.println(badCustomers);
    }
}
