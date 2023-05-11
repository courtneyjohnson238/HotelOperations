public class Reservation {
    private String roomType;
    private double  pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;




    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if(roomType.equalsIgnoreCase("king")){
            this.pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")){
            this.pricePerNight = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double totalPrice = pricePerNight*numberOfNights;
        if (isWeekend){
            totalPrice = totalPrice*=1.1;

        }
        return totalPrice;

    }



    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal() {
        return getPrice();
    }


    }




