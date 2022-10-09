package edu.sdccd.cisc191;

public class Exercise03_13 {
    public static void main(String[] args) {

        //takes input from user for filing status and income
        java.util.Scanner input = new java.util.Scanner(System.in);

        // request input for filing status
        System.out.print(
                "Please choose a number from the following to indicate your filing status then hit 'Enter':\n" +
                        "0 - Single Filer\n" +
                        "1 - Married Filing Jointly\n" +
                        "2 - Married Filing Separately\n" +
                        "3 - Head Of Household\n" +
                "I am filing as number = ");
        int status = input.nextInt();

        //verify status input is between 0 - 3. prompt error if not.
        while (status >= 4 || status <= -1){
            System.out.print("Error! Please verify you chose a status number between 0 and 3 and try again.\n" +
                    "I am filing as number = ");
        status = input.nextInt();
        }

        // request input for income
        System.out.print("You chose to file as " + status + ".\n" +
                "Now please enter your taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;
        if (status == 0) { // Compute tax for single filers
            if (income <= 8350) {
                tax = income * 0.10;
            }
            else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            }
            else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (income - 33950) * 0.25;
            }
            else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            }
            else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (income - 171550) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        }
        else if (status == 1) { // Compute tax for married file jointly
            if (income <= 16700) {
                tax = income * 0.10;
            }
            else if (income <= 67900) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            }
            else if (income <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (income - 67900) * 0.25;
            }
            else if (income <= 171950) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            }
            else if (income <= 372950) {
                tax = 16700 * 0.10 + (67900 - 16701) * 0.15 +
                        (137050 - 67901) * 0.25 + (208850 - 137051) * 0.28 +
                        (income - 208851) * 0.33;
            }
            else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (171950 - 137050) * 0.28 +
                        (372950 - 171950) * 0.33 + (income - 372950) * 0.35;
            }
        }
        else if (status == 2) { // Compute tax for married separately
            if (income <= 8350) {
                tax = income * 0.10;
            }
            else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            }
            else if (income <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (income - 33950) * 0.25;
            }
            else if (income <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            }
            else if (income <= 186475) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (income - 104425) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        }
        else if (status == 3) { // Compute tax for head of household
            if (income <= 11950) {
                tax = income * 0.10;
            }
            else if (income <= 45500) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            }
            else if (income <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (income - 45500) * 0.25;
            }
            else if (income <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            }
            else if (income <= 372950) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (income - 190200) * 0.33;
            }
            else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        }

        System.out.println("You are filing as #" + status + " with an income of " + income +
                "\n" + "Your tax is: " + (int)(tax * 100) / 100.0);
    }
}
