package MyProgram;

class CentripetalAcceleration extends AbstractPhysicalCalculation<Double> {
    private final double speed;
    private final double radius;

    public CentripetalAcceleration(double speed, double radius) throws InvalidCalculationException {
        super(Math.pow(speed, 2) / radius);
        if (radius <= 0) {
            throw new InvalidCalculationException("Радиус должен быть положительным числом!");
        }
        this.speed = speed;
        this.radius = radius;
    }

    @Override
    public Double calculate() {
        return Math.pow(speed, 2) / radius;
    }

    @Override
    public String toString() {
        return String.format("Центростремительное ускорение a = %.3f м/с^2", calculate());
    }
}
