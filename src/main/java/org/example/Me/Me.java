package org.example.Me;
class Clock {
    int hours;
    int minutes;

    public void next() {
        // Increment minutes by 1
        minutes += 1;

        // Check if minutes need to be reset
        if (minutes == 60) {
            minutes = 0;
            hours += 1;

            // Check if hours need to be reset
            if (hours == 13) {
                hours = 1;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        Clock clock1 = new Clock();
        clock1.hours = 14;
        clock1.minutes = 0;
        clock1.next(); // the time is 12:01
        System.out.println("Time: " + clock1.hours + ":" + String.format("%02d", clock1.minutes)); // Output: 12:01

        // Example 2
        Clock clock2 = new Clock();
        clock2.hours = 10;
        clock2.minutes = 59;
        clock2.next(); // the time is 11:00
        System.out.println("Time: " + clock2.hours + ":" + String.format("%02d", clock2.minutes)); // Output: 11:00
    }
}
