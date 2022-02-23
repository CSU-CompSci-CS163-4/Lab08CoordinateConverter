public class DMSConverter implements Converter{

    DMSCoordinate DMSObj;

    DecimalCoordinate convertedObj;

    public DMSConverter() {
        this.DMSObj = new DMSCoordinate();
    }

    public DMSConverter(DMSCoordinate DMSObj) {
        this.DMSObj = DMSObj;
    }

    public DMSConverter(String latAndLong) {
        DMSObj = new DMSCoordinate(latAndLong);
    }

    public DecimalCoordinate getConvertedObj() {
        return convertedObj;
    }

    public void convert() {
        //TODO Student
        convertedObj = new DecimalCoordinate(); //This line will also be changed.
    }
}