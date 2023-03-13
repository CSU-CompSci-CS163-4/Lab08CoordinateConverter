import java.lang.Math;

public class DecimalConverter implements Converter{

    DecimalCoordinate decimalObj;

    DMSCoordinate convertedObj;
    
    public DecimalConverter() {
        this.decimalObj = new DecimalCoordinate();
    }

    public DecimalConverter(DecimalCoordinate decimalObj) {
        this.decimalObj = decimalObj;
    }

    public DMSCoordinate getConvertedObj() {
        return convertedObj;
    }

    public void convert() {
        //TODO Student
        convertedObj = new DMSCoordinate(); //This line will also be changed.
    }
}
