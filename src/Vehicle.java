

public abstract class Vehicle {

    private final String brand;
    private final String vehicleType;

    private  final String id;

    private int totalAvailableSpace;

    private int totalParkingSpace;

    public Vehicle(String brand,String vehicleType, String id) {
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.id = id;
        this.totalAvailableSpace = (int) (Math.random() * 50 +1);
        this.totalParkingSpace = (int) (50);
    }


    public int getTotalParkingSpace(int totalParkingSpace) {
        return totalParkingSpace;
    }

    public int getTotalAvailableSpace() {
        return totalAvailableSpace;
    }

    public void setTotalAvailableSpace(int totalAvailableSpace) {

        if (totalAvailableSpace > 0  && totalAvailableSpace <= 50){
            this.totalAvailableSpace = totalAvailableSpace;
        }

    }

    public String getId() {
        return id;
    }



    @Override
    public String toString() {
        return String.format("\nBrand :  %s\nVehicleType :  %s\nId :  %s",brand,vehicleType, id);
    }









}
