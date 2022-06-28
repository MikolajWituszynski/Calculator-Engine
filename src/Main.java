public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d,15.0d, 85.0d};
        double[] rightVals = {75.0d, 10.0d, 66.0d, 14.0d};
        char[] opCodes = {'a', 'm', 'd','s'};
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);}
        else if(args.length ==3 )
            handleCommandLine(args);
        else
            System.out.println("Please provide operation code and 2 numeric values");
    }

    private static void handleCommandLine(String[] args) {

        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a' -> result = leftVal + rightVal;
            case 's' -> result = leftVal - rightVal;
            case 'm' -> result = leftVal * rightVal;
            case 'd' -> result = rightVal != 0 ? leftVal / rightVal : 0.0d;
            default -> {
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            }
        }
        return result;
    }
}
