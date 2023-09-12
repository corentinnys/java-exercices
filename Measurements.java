public class measurements {
    public static   void main(String[] args) {
        //System.out.println(getWrite("TOYO"));
    }

    public enum MeasurementUnit {
        METERS, CENTIMETERS, MILLIMETERS,m,cm,mm
    }

    public static boolean getWrite(String metric) {
        boolean isExist = false;

        try {

            MeasurementUnit desiredUnit = MeasurementUnit.valueOf(metric);
            for (MeasurementUnit val : MeasurementUnit.values()) {
                if (val == desiredUnit) {
                    isExist = true;

                    break;
                } else {
                    isExist = false;

                }

            }
        }catch (Exception e)
        {
            isExist = false;
        }
        return isExist;
    }
}
