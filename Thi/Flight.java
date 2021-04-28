package Thi;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }
    public String getDestination() {
        return destination;
    }

    public void display(){
        System.out.println("Chuyến bay mang số hiệu và điểm đến là:\n");
        System.out.println("Số hiệu:" + number);
        System.out.println("Địa điểm:"+ destination);
    }
}
