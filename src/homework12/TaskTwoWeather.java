package homework12;

//Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
// In this method you have to verify variables and if it’s raining,
// temperature is below 10, and is not sunny then throw Exception("Weather is not good")

public class TaskTwoWeather {

    public static void main(String[] args) {

        try {
            isWeatherGood(true, -25, false);
        } catch (Exception e) {
            System.out.println("Weather is not good");
            e.printStackTrace();
        }

    }

    static boolean isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny) throws Exception {
        if (isItRaining && temperature < 10 && !isItSunny)
            throw new Exception();
        else return true;
    }
}
