public class DecimalCoordinate {
    double latitude;
    double longitude;
    
    public DecimalCoordinate() {
        latitude = 0;
        longitude = 0;
    }

    public DecimalCoordinate(String latAndLong) {
        String latStr = latAndLong.substring(0, latAndLong.indexOf(" "));
        String longStr = latAndLong.substring(latAndLong.indexOf(" ")+1);

        double parsedLat = Double.parseDouble(latStr);
        double parsedLong = Double.parseDouble(longStr);

        //TODO Student
        
        this.latitude = parsedLat;
        this.longitude = parsedLong;
    }

    public DecimalCoordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        //TODO Student

        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        //TODO Student

        this.longitude = longitude;
    }

    public String toString() {
        String str = String.format("%.4f %.4f", latitude, longitude);
        return str;
    }
}
