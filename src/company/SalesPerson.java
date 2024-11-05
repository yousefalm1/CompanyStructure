package company;

public class SalesPerson extends Employee {

    int saleTarget;

    public SalesPerson(String name, String department, double salary, int saleTarget) {
        super(name, department, salary);
        this.saleTarget = saleTarget;
    }

    @Override
    public String toString() {
        return super.toString() + ", sale Target: " + saleTarget;
    }

}
