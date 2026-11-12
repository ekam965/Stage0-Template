/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

void main() {
    // Create an integer array named `driveMotors` that holds the values
    // 1, 2, 3, 4 and print out the third value in the array.

    int[] driveMotors = {1, 2, 3, 4};
    System.out.println(driveMotors[2]);

    // Create another integer array named `distance` that holds the values
    // 10,20,30,40. Iterate through the array using the integer i and
    // print out the value of i.

    int[] distance = {10, 20, 30, 40};

    for (int i = 0; i < distance.length; i++) {
        System.out.println(distance[i]);
    }

    // Same as above but enhanced for loop. Goes through every element in distance
    for (int i: distance) {
        System.out.println(i);
    }

    //Create a double array named `motorSpeeds` that holds the values
    // 0.1, 0.2, 0.3, 0.4, 0.5, Then print out the length of the
    // motorSpeeds array

    double[] motorSpeeds = {0.1, 0.2, 0.3, 0.4, 0.5};

    double total = 0;

    for (int i = 0; i < motorSpeeds.length; i++) {
        total += motorSpeeds[i];
    }
    System.out.println(total);

    // Same as above but enhanced for loop. Goes through every element in motorSpeeds

    double total2 = 0;

    for (double motorSpeed : motorSpeeds) {
        total2 += motorSpeed;
    }
    System.out.println(total2);
}
