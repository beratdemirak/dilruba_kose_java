
public class Test {
    public static void main(String[] args){
        //İnsan object= new İnsan(182,95);
        Bina object = new Bina();
        System.out.println(object.heightMeters());
        System.out.println(object.heightCentimeters());
        System.out.println(object.heightKilometers());
    }
}

interface Boy{
    int variable = 0;
    static String definition() {
        return "Bu İnterface İmplement Eden Class İçin "
                + "Boy Bilgileri Dönülmesini Sağlar.";
    }
    int heightCentimeters();
    double heightMeters();
    default double heightKilometers() {
        return 0;
    }
}


abstract class Animal implements Boy{
    private int height;
    private int weight;
    public abstract boolean isAlive();


    public int heightCentimeters() {
        return this.getBoy();
    }

    public int getBoy() {
        return height;
    }
    public void setBoy(int height) {
        this.height = height;
    }

    public int getKilo() {
        return height;
    }

    public void setKilo(int height) {
        this.height = height;
    }
}

class Person extends Animal{

    public Person(int height, int weight) {
        this.setBoy(height);
        this.setKilo(weight);
    }

    public boolean isAlive(){
        return true;
    }


    public double heightMeters() {
        return this.getBoy()/100.0;
    }
}

class Bina implements Boy{

    public int heightCentimeters() {
        return 1000;
    }
    public double heightMeters() {
        return 10;
    }
    public double heightKilometers() {
        return 0.01;
    }

}
