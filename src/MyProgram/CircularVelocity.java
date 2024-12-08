package MyProgram;

class CircularVelocity extends AbstractPhysicalCalculation<Double> {
    private final double radius;
    private final double period;

    public CircularVelocity(double radius, double period) throws InvalidCalculationException {
        super((2 * Math.PI * radius) / period);
        if (period <= 0) {
            throw new InvalidCalculationException("Период должен быть положительным числом!");
        }
        this.radius = radius;
        this.period = period;
    }

    @Override
    public Double calculate() {
        return (2 * Math.PI * radius) / period;
    }

    @Override
    public String toString() {
        return String.format("Круговая скорость V = %.3f м/с", calculate());
    }
}
