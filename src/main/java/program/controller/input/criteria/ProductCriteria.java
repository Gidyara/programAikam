package program.controller.input.criteria;

public class ProductCriteria implements Criteria {
    private String productName;
    private int minTimes;

    public ProductCriteria() {
    }

    public String getProductName() {
        return productName;
    }

    public int getMinTimes() {
        return minTimes;
    }

    public void get() {

    }

    public void print() {
        System.out.println(productName);
        System.out.println(minTimes);
    }


}
