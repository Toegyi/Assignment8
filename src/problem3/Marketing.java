package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marketing)) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesAmount, salesAmount) == 0 &&
                Objects.equals(employeeName, marketing.employeeName) &&
                Objects.equals(productName, marketing.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    public static List<Marketing> getEmpwWithSaleGreater1000(List<Marketing> marketingList) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : marketingList) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("John", "Product A", 500));
        marketingList.add(new Marketing("Mary", "Product B", 1500));
        marketingList.add(new Marketing("Peter", "Product C", 1000));
        marketingList.add(new Marketing("Paul", "Product D", 2000));

        System.out.println("Size of marketing list: " + marketingList.size());

        System.out.println("Marketing List:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }
    }
}
