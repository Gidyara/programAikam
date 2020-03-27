package program.controller.input.criteria;

public class ExpenseCriteria implements Criteria {
    private int minExpenses;
    private int maxExpenses;

    public ExpenseCriteria() {
    }

    public int getMinExpenses() {
        return minExpenses;
    }

    public int getMaxExpenses() {
        return maxExpenses;
    }

    public void get() {

    }

    public void print() {
        System.out.println(minExpenses);
        System.out.println(maxExpenses);
    }
}
