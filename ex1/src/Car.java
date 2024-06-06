public class Car implements Comparable<Car> {
    String name;
    int productionYear;

    public Car(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public int compareTo(Car each) {
        return Integer.compare(this.productionYear, each.productionYear);
    }


    @Override
    public String toString() {
        return "Model: " + name + ", Year: " + productionYear;
    }
}
