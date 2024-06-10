# IMADPracticum-ST10450492-
IMAD5112
// Link
https://github.com/Azemahle/IMADPracticum-ST10450492-.git

WeatherApp
Purpose
The WeatherApp is a simple Android application designed to display a week's weather forecast. It provides users with an overview of daily temperatures for a week and calculates the average temperature for the week. Additionally, it allows users to view detailed daily temperatures on a separate screen and includes functionality to clear the displayed average temperature and exit the app.

Features
Display daily temperatures for a week.
Calculate and display the average temperature for the week.
Navigate to a detailed view of daily temperatures.
Clear the displayed average temperature.
Exit the application.
Pseudocode
MainActivity
Initialize Variables:

Declare TextViews for daily temperatures (tvDay1 to tvDay7) and average temperature (tvAverageTemp).
Declare an array sampleTemperatures with 7 float values representing daily temperatures.
onCreate Method:

Call super.onCreate and set the content view to activity_main.xml.
Initialize TextViews using findViewById.
Call populateTemperatures to display daily temperatures.
Set onClickListeners for buttons:
btnCalculateAverage to call calculateAverageTemperature.
btnViewDetails to call viewDetails.
btnClear to call clearData.
btnExit to call finish.
populateTemperatures Method:

Set text for each TextView (tvDay1 to tvDay7) with corresponding values from sampleTemperatures.
calculateAverageTemperature Method:

Calculate the average of sampleTemperatures.
Display the average temperature in tvAverageTemp.
viewDetails Method:

Create an Intent to navigate to DetailedActivity.
Pass sampleTemperatures to DetailedActivity.
Start the activity.
clearData Method:

Clear the text of tvAverageTemp.
DetailedActivity
Initialize Variables:

Declare TextViews for daily temperatures (tvDay1 to tvDay7).
onCreate Method:

Call super.onCreate and set the content view to activity_detailed.xml.
Initialize TextViews using findViewById.
Retrieve the array temperatures passed from MainActivity.
Set text for each TextView (tvDay1 to tvDay7) with corresponding values from temperatures.
How to Run
Clone the repository to your local machine.
Open the project in Android Studio.
Build and run the project on an Android device or emulator.
