public class ExpressionCalculator {
    private static int x;
    private static int y;

    private static ExpressionCalculator instance = null;

    public ExpressionCalculator() {
    }

    public static ExpressionCalculator getInstance() {
        if (instance == null) {
            instance = new ExpressionCalculator();
        }
        return instance;
    }

    public void setValues(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public void calculateExpression() {
        if (y != 0) {
            double result = 2 * x + 3.0 / y;
            System.out.println("Результат выражения 2x + 3/y: " + result);
        } else {
            System.out.println("Ошибка: Деление на ноль!");
        }
    }

    public static void main(String[] args) {
        ExpressionCalculator calculator = ExpressionCalculator.getInstance();
        ExpressionCalculator calculator1 = ExpressionCalculator.getInstance();
        calculator.setValues(5, 2);
        calculator.calculateExpression();
    }
}