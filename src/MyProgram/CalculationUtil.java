package MyProgram;

import java.util.List;

class CalculationUtil {
    public static <T extends Number> double calculateAverage(List<AbstractPhysicalCalculation<T>> calculations) {
        if (calculations == null || calculations.isEmpty()) {
            throw new IllegalArgumentException("Список расчетов не может быть пустым!");
        }
        double sum = 0;
        for (AbstractPhysicalCalculation<T> calculation : calculations) {
            sum += calculation.calculate().doubleValue();
        }
        return sum / calculations.size();
    }
}
