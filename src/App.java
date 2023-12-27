import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read variable names from the first line
        String[] variableNames = scanner.nextLine().split(" ");
        int numVariables = variableNames.length - 1; // Ignore the last token

        // Ignore the second line
        scanner.nextLine();

        StringBuilder dnfFormula = new StringBuilder();
        StringBuilder cnfFormula = new StringBuilder();

        int n = (int) Math.pow(2, numVariables);

        // Iterate through the input lines
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] inputValues = line.split(" ");
            int output = Integer.parseInt(inputValues[numVariables]);

            if (output == 1) {
                for (int j = 0; j < numVariables; j++) {
                    if (inputValues[j].equals("1")) {
                        dnfFormula.append(variableNames[j] + " ");
                    } else {
                        dnfFormula.append(variableNames[j] + "' ");
                    }
                }
                dnfFormula.append("+ ");
            } else {
                cnfFormula.append("(");
                for (int j = 0; j < numVariables; j++) {
                    if (inputValues[j].equals("0")) {
                        cnfFormula.append(variableNames[j] + " ");
                    } else {
                        cnfFormula.append(variableNames[j] + "' ");
                    }
                    cnfFormula.append("+ ");
                }
                cnfFormula.replace(cnfFormula.length() - " + ".length(), cnfFormula.length(), "");
                cnfFormula.append(")");
            }
        }
        String dnf = dnfFormula.substring(0, dnfFormula.length() - "+ ".length());
        System.out.println("DNF: " + dnf);
        System.out.println("CNF: " + cnfFormula);

        // Close the scanner
        scanner.close();
    }
}
