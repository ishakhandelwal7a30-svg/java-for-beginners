/*Let's create a program to decide if it's a good day for solar panel energy production

Initialize these variables:

isSunny with the value true
windSpeed with the value 5.4
temperature with the value 23
solarPanelOutput with the value 9
isCloudy with the value false
Create one logical expression that checks ALL of these conditions:

It's sunny
The wind speed is less than 10
The solar panel output is less than 15
The temperature is above 20 OR there are no clouds */

public class operator7{
    public static void main(String[] args) {
        boolean isSunny = true;
        double windSpeed = 5.4;
        int temperature = 23;
        int solarPanelOutput = 9;
        boolean isCloudy = false;
        boolean result = isSunny && windSpeed < 10 && solarPanelOutput < 15 && (temperature > 20 || !isCloudy);
        System.out.println("Checking conditions for solar energy production...");
        System.out.println("1. Is it sunny? " + isSunny);
        System.out.println("2. Is wind speed safe? " + (windSpeed < 10));
        System.out.println("3. Can panels produce more? " + (solarPanelOutput < 15));
        System.out.println("4. Is temperature good OR no clouds? " + (temperature > 20 || !isCloudy));
        System.out.println("\nFinal result - Good day for solar energy production: " + result);
    }
}