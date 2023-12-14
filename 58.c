#include <stdio.h>
#include <math.h>

// Constants
#define CAR_RATE_1 0.00
#define CAR_RATE_2 1.5
#define BUS_RATE_1 1.00
#define BUS_RATE_2 2.30
#define BUS_RATE_3 3.70
#define TRUCK_RATE_1 2.00
#define TRUCK_RATE_2 3.70

// Function declarations
double calculateTotalTime(int enterHour, int enterMinute, int leaveHour, int leaveMinute);
double calculateFare(char vehicleType, double totalTime);
void printReceipt(char vehicleType, int enterHour, int enterMinute, int leaveHour, int leaveMinute, double totalTime, double totalFare, int roundedTime);
int isValidTime(int hour, int minute);

int main() {
    char vehicleType;
    int enterHour, enterMinute, leaveHour, leaveMinute, roundedTime;
    double totalFare;

    // Input vehicle type
    printf("Enter type of vehicle? (C for Car, B for Bus, T for Truck): ");
    scanf(" %c", &vehicleType);

    // Validate vehicle type
    if (vehicleType != 'C' && vehicleType != 'B' && vehicleType != 'T') {
        printf("Invalid vehicle type.\n");
        return 1; // Exit with an error code
    }

    // Input and validate time values
    printf("Hour vehicle entered parking lot(0 - 24)? ");
    scanf("%d", &enterHour);

    printf("Minute vehicle entered parking lot(0 - 60)? ");
    scanf("%d", &enterMinute);

    printf("Hour vehicle left parking lot(0 - 24)? ");
    scanf("%d", &leaveHour);

    printf("Minute vehicle left parking lot(0 - 60)? ");
    scanf("%d", &leaveMinute);

    if (!isValidTime(enterHour, enterMinute) || !isValidTime(leaveHour, leaveMinute)) {
        printf("Invalid time values.\n");
        return 1; // Exit with an error code
    }

    // Calculate total time in hours
    double totalTime = calculateTotalTime(enterHour, enterMinute, leaveHour, leaveMinute);

    // Calculate total fare based on vehicle type and time
    totalFare = calculateFare(vehicleType, totalTime);

    // Calculate rounded time
    roundedTime = (int)ceil(totalTime);

    // Output receipt
    printReceipt(vehicleType, enterHour, enterMinute, leaveHour, leaveMinute, totalTime, totalFare, roundedTime);

    return 0;
}

// Calculates total time in hours
double calculateTotalTime(int enterHour, int enterMinute, int leaveHour, int leaveMinute) {
    int hoursDiff = leaveHour - enterHour;
    int minutesDiff = leaveMinute - enterMinute;

    if (minutesDiff < 0) {
        hoursDiff--;
        minutesDiff += 60;
    }

    return hoursDiff + minutesDiff / 60.0;
}

// Calculates parking fare based on vehicle type and total time
double calculateFare(char vehicleType, double totalTime) {
    if (vehicleType == 'C') { // Car
        return (totalTime <= 3) ? CAR_RATE_1 : CAR_RATE_2 * (totalTime - 3);
    } else if (vehicleType == 'B') { // Bus
        if (totalTime <= 2) {
            return BUS_RATE_1 * totalTime;
        } else if (totalTime <= 3) {
            return BUS_RATE_2 * (totalTime - 2);
        } else {
            return BUS_RATE_2 + BUS_RATE_3 * (totalTime - 3);
        }
    } else if (vehicleType == 'T') { // Truck 
        return (totalTime <= 1) ? TRUCK_RATE_1 * totalTime : TRUCK_RATE_2 * (totalTime - 1);
    } else {
        printf("Invalid vehicle type.\n");
        return -1;
    }
}


// Prints a receipt
void printReceipt(char vehicleType, int enterHour, int enterMinute, int leaveHour, int leaveMinute, double totalTime, double totalFare, int roundedTime) {
    printf("\n\tPARKING RECEIPT\n\n");
    printf("Type of vehicle:\t%c\n", vehicleType);
    printf("TIME-IN:\t\t%02d : %02d\n", enterHour, enterMinute);
    printf("TIME-OUT:\t\t%02d : %02d\n", leaveHour, leaveMinute);
    printf("\t\t\t-------\n");
    printf("PARKING TIME:\t\t%.2f\n", totalTime);
    printf("ROUNDED TIME:\t\t%d\n", roundedTime);
    printf("\t\t\t-------\n");
    printf("TOTAL CHARGE:\t\t$%.2lf\n", totalFare);
}

// Input validation for time values
int isValidTime(int hour, int minute) {
    return (hour >= 0 && hour <= 24 && minute >= 0 && minute <= 60);
}
