[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/92arv5Vv)
#Campsite Commander

## 👤 Student Information

**Student Name:** Siyamthanda April Ngcobo  
**Student Number:** ST10530817  

---

## 🔗 GitHub Repository

**GitHub Repository Link:**  
https://github.com/EMKNPM/imad5112-exam-link-Siyamthanda-Ngcobo.git

---

## 📌 Purpose of the Application

The purpose of the **Commander Campsite** application is to allow users to  manage , calculate , and allow users to store item details while categorizing them in a simple and user-friendly Android application.

The application was developed using **Kotlin** in **Android Studio**. It demonstrates the use of arrays, loops, functions, screen navigation, data classes, input validation, and error handling.

The application allows users to:

- Enter the Gear that they will use such as : store item details , category quantity and comments.
- Calculate the total number of of items.
- View the list and add items.
- View detailed information for eaqch item.
- 🧹 Clear incorrect data and re-enter gear information.
- 🔄 Navigate between the Splash Screen, Home Screen, and Detailed View Screen.

---

## 📱 Application Overview

The application contains three main screens:

---

### 1. 🌤️ Splash Screen

The **Splash Screen** is the first screen displayed when the application launches.

It includes:

- Application name
- Campsite logo
- Start button
- Exit button

The **Start** button allows the user to navigate to the Home Screen, while the **Exit** button closes the application.

---

### 2. 🏠 Home Screen

The **Home Screen** is the main working screen of the application.

It includes:

- A Spinner to select the needed items.
- An input field for item name.
- An input field for category.
- An input field for the quantity.
- An input field for the comments
- A add gear button.
- A View Gear button.
  

The Home Screen stores the user's weather information using an array of objects. 

---

### 3. 📋 Detailed Weather Screen
displays  information entered by the user.

It displays:

- Day name
- Minimum temperature
- Maximum temperature
- Weather condition

The screen also includes a **Back** button, allowing the user to return to the Home Screen.

---

## 🧠 Programming Concepts Used

| Concept | Explanation |
|---|---|
| Kotlin | Used as the main programming language |
| Android Studio | Used as the development environment |
| ConstraintLayout | Used to design the app screens |
| Spinner | Used to allow the user to select a day of the week |
| EditText | Used to capture user input |
| Button | Used to trigger app actions |
| TextView | Used to display headings, average temperature, and weather details |
| Data Class | Used to store information for each day |
| Arrays | Used to store weekly weather objects |
| Loops | Used to calculate averages and display detailed data |
| Functions | Used to organise app logic |
| Toast Messages | Used to display error and confirmation messages |
| Intents | Used to navigate between screens |
| ScrollView | Used to allow scrolling on the detailed weather screen |

---

## 💾 Data Storage

The application uses a `WeatherDay` data class to store weather information for each day.

Each `WeatherDay` object stores:

- Day name
- Minimum temperature
- Maximum temperature
- Weather condition
- Whether data was captured for that day

The seven days of the week are stored in an array of `WeatherDay` objects.

---

# 🧾 Pseudocode

## 1. 🌤️ Splash Screen Pseudocode

```text
START

Display Splash Screen

Display application logo
Display application name
Display student name
Display student number

IF Start button is clicked THEN
    Navigate to Home Screen
ENDIF

IF Exit button is clicked THEN
    Close the application
ENDIF

STOP
```

---

## 2. 🏠 Home Screen Pseudocode

```text
START

Display Home Screen

Create array of WeatherDay objects
Populate array with Monday to Sunday

Display spinner with days of the week

Display input fields for:
    Minimum temperature
    Maximum temperature
    Weather condition

Display buttons for:
    Save Weather
    Calculate Average
    View Detailed Weather
    Clear Data
    Exit

IF Save Weather button is clicked THEN
    Run Save Weather Data process
ENDIF

IF Calculate Average button is clicked THEN
    Run Calculate Average Temperature process
ENDIF

IF View Detailed Weather button is clicked THEN
    IF all seven days have data THEN
        Navigate to Detailed Weather Screen
    ELSE
        Display error message
    ENDIF
ENDIF

IF Clear Data button is clicked THEN
    Run Clear Weather Data process
ENDIF

IF Exit button is clicked THEN
    Close the application
ENDIF

STOP
```

---

## 3. 💾 Save Weather Data Pseudocode

```text
START

Get selected day from spinner
Get minimum temperature input
Get maximum temperature input
Get weather condition input

IF minimum temperature is empty OR maximum temperature is empty OR weather condition is empty THEN
    Display error message: "Please complete all fields"
    STOP process
ENDIF

Convert minimum temperature to number
Convert maximum temperature to number

IF minimum temperature is not a valid number OR maximum temperature is not a valid number THEN
    Display error message: "Temperatures must be valid numbers"
    STOP process
ENDIF

IF minimum temperature is greater than maximum temperature THEN
    Display error message: "Minimum temperature cannot be greater than maximum temperature"
    STOP process
ENDIF

Store minimum temperature in selected WeatherDay object
Store maximum temperature in selected WeatherDay object
Store weather condition in selected WeatherDay object
Mark selected WeatherDay object as captured

Display confirmation message

Clear minimum temperature input
Clear maximum temperature input
Clear weather condition input

STOP
```

---

## 4. 📊 Calculate Average Temperature Pseudocode

```text
START

Check if all seven days have weather data

IF any day does not have weather data THEN
    Display error message: "Please enter all data for the 7 days before calculating"
    STOP process
ENDIF

Set total to 0

FOR each WeatherDay object in weekly weather array
    Add maximum temperature to total
ENDFOR

Calculate average = total / number of days

Display average temperature

STOP
```

---

## 5. ✅ Check All Data Entered Pseudocode

```text
START

FOR each WeatherDay object in weekly weather array
    IF dataCaptured is false THEN
        Return false
    ENDIF
ENDFOR

Return true

STOP
```

---

## 6. 🧹 Clear Weather Data Pseudocode

```text
START

FOR each WeatherDay object in weekly weather array
    Set minimum temperature to 0
    Set maximum temperature to 0
    Set weather condition to empty
    Set dataCaptured to false
ENDFOR

Clear minimum temperature input field
Clear maximum temperature input field
Clear weather condition input field

Reset average temperature display

Display message: "All weather data has been cleared"

STOP
```

---

## 7. 📋 Detailed Weather Screen Pseudocode

```text
START

Display Detailed Weather Screen

Create empty weather report string

FOR each WeatherDay object in weekly weather array
    Add day name to weather report
    Add minimum temperature to weather report
    Add maximum temperature to weather report
    Add weather condition to weather report
ENDFOR

Display weather report on screen

IF Back button is clicked THEN
    Return to Home Screen
ENDIF

STOP
```

---

# 📸 Screenshots

## Screenshot 1: Splash Screen

[Insert Screenshot 1 Here]
<img width="1908" height="1067" alt="Screenshot 2026-06-10 142346" src="https://github.com/user-attachments/assets/ed7c7f22-054e-4286-abf1-afbbc874d867" />



---

## Screenshot 2: Home Screen

[Insert Screenshot 2 Here]
<img width="1918" height="1068" alt="Screenshot 2026-06-10 142331" src="https://github.com/user-attachments/assets/867ee10b-2160-4efd-9523-3bbcc92695d1" />


---

## Screenshot 3: Detailed Weather Screen

[Insert Screenshot 3 Here]
<img width="1919" height="1071" alt="Screenshot 2026-06-10 142316" src="https://github.com/user-attachments/assets/e95e1d98-3b33-4c1a-9134-b596ed40fd1a" />

---

## Screenshot 4: Error Message Example

[Insert Screenshot 4 Here]
<img width="1908" height="1067" alt="Screenshot 2026-06-10 142346" src="https://github.com/user-attachments/assets/f6d22ed2-79ea-4ae5-a4c7-51dbaf6a19c8" />


---

# ⚠️ Error Handling

The application includes error handling for the following situations:

| Error | Message Displayed |
|---|---|
| Empty fields | Please complete all the fields |
| Invalid numbers | Temperatures must be valid numbers |
| Minimum temperature greater than maximum temperature | Minimum temperature cannot be greater than the maximum temperature |
| Attempting to calculate before all days are entered | Please enter all the data for the 7 days before calculating |
| Attempting to view details before all days are entered | Please enter data for all 7 days first |

---

# ✅ Conclusion

The **WeatherWay** application successfully meets the requirements of the task by allowing users to enter, save, calculate, clear, and view weekly weather information.

The app demonstrates the use of **Kotlin**, arrays, loops, functions, data classes, input validation, error handling, and screen navigation. It also includes a professional user interface with three main screens and a structured user experience.
v
