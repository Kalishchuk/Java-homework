package ua.vodafone.vkalishchuk.homework.homework_14_Burgers;

public class Burgers {

    private String bun;
    private String meat;
    private String cheese;
    private String lettuce;
    private String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        setBun(bun + " bun");
        setMeat(meat + " meat");
        setCheese(cheese + " cheese");
        setLettuce(lettuce);
        setMayonnaise(mayonnaise);
        System.out.println("You ordered a regular burger. It consists of: " + getBun() + ", " + getMeat() + ", "
                + getCheese() + ", " + getLettuce() + ", " + getMayonnaise() + ".");
    }

    public Burgers(String bun, String meat, String additionalMeat, String cheese, String lettuce, String mayonnaise) {
        setBun(bun + " bun");
        setMeat(meat + " and " + additionalMeat + " meat");
        setCheese(cheese + " cheese");
        setLettuce(lettuce);
        setMayonnaise(mayonnaise);
        System.out.println("You ordered a double meat burger. It consists of: " + getBun() + ", " + getMeat() + ", "
                + getCheese() + ", " + getLettuce() + ", " + getMayonnaise() + ".");
    }

    public Burgers(String bun, String meat, String cheese, String lettuce) {
        setBun(bun + " bun");
        setMeat(meat + " meat");
        setCheese(cheese + " cheese");
        setLettuce(lettuce);
        System.out.println("You ordered a diet burger. It consists of: " + getBun() + ", " + getMeat() + ", "
                + getCheese() + ", " + getLettuce() + ".");
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getMayonnaise() {
        return mayonnaise;
    }

    public void setMayonnaise(String mayonnaise) {
        this.mayonnaise = mayonnaise;
    }
}
