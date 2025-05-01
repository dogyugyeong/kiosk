public class MenuItem {
    private String name;
    private double price;
    private String desc;

    public MenuItem(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void Info(int index) {
        System.out.println(index + ". " + name + " W " + price + " " + desc);
    }
}
