/**
 * Bruce Gavins
 * MSI-5030
 * Programming Assignment 2.2
 */

import java.util.Scanner;

/**
 * This program calculates the volume and surface area of a sphere based on user input
 * for the radius.
 */

public class SphereCalculator {

    public static void main(String[] args) {
	//Creates scanner object for user input
	Scanner input = new Scanner(System.in);

	//Ask user for the radius of the sphere
	System.out.print("Enter the radius of the sphere: ");
	double radius = input.nextDouble();

	//Calculate the volume using given formula: (4/3) * pi * r^3
	double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

	//Calculate the surface area using the given formula: 4 * pi * r^2
	double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

	//Print results to user
	System.out.println("Volume: " + volume);
	System.out.println("Surface Area: " + surfaceArea);

	//close scanner utility
	input.close();
    }
}
