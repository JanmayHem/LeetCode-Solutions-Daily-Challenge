/*
Runtime: 8 ms Beats 100%
*/

class ParkingSystem {
    private int[] parking;

    public ParkingSystem(int big, int medium, int small) {
        parking = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return parking[carType-1]-->0; 
    }
}
