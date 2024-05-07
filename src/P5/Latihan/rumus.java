package P5.Latihan;

public class rumus {
    String merk, tipe;
    int tahun, top_acceleration, top_power;

    public rumus(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
   
    int minAcceleration(rumus[] cars, int low, int high) {
        if (low == high) {
            return cars[low].top_acceleration;
        }

        int mid = (low + high) / 2;
        int leftMin = minAcceleration(cars, low, mid);
        int rightMin = minAcceleration(cars, mid + 1, high);
        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }
   
    double averagePower(rumus[] cars) {
        if (cars.length == 0) {
            return 0;
        }

        double totalPower = 0;
        for (rumus car : cars) {
            totalPower += car.top_power;
        }
        return totalPower / cars.length;
    }
   
    int maxAcceleration(rumus[] cars, int low, int high) {
        if (low == high) {
            return cars[low].top_acceleration;
        }

        int mid = (low + high) / 2;
        int leftMax = maxAcceleration(cars, low, mid);
        int rightMax = maxAcceleration(cars, mid + 1, high);
        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }
}