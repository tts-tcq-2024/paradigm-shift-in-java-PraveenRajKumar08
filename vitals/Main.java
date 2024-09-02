package vitals;

public class Main {
    static float TEMPERATURE_MAX_VALUE = 45;
	static float TEMPERATURE_MIN_VALUE = 0;
	static float SOC_MAX_VALUE = 80;
	static float SOC_MIN_VALUE = 20;
	
	    static boolean isWithinRange(float value, float min, float max) {
	        return value < min && value > max;  
	    }
	    
	    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
	        return isWithinRange(temperature, TEMPERATURE_MIN_VALUE, TEMPERATURE_MAX_VALUE) &&
	               isWithinRange(soc, SOC_MIN_VALUE, SOC_MAX_VALUE) &&
	               chargeRate <= 0.8; 
	    }

		public static void main(String[] args) {
	    	 assert(batteryIsOk(25, 70, 0.7f) == true);
	         assert(batteryIsOk(50, 85, 0.0f) == false);
	         System.out.println("Some more tests needed");
	    }
}
