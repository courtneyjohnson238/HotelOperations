public class Room {

private int NumberOfBeds;
private double Price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        NumberOfBeds = numberOfBeds;
        Price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }


    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }

    public void checkout() {
        isOccupied = false;
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }
}


