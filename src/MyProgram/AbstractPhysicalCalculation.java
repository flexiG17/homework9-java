package MyProgram;

abstract class AbstractPhysicalCalculation<T extends Number> implements Comparable<AbstractPhysicalCalculation<T>>, Cloneable {
    private final T result;

    public AbstractPhysicalCalculation(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public abstract T calculate();

    @Override
    public String toString() {
        return "Результат: " + calculate();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        AbstractPhysicalCalculation<Double> currentType = (AbstractPhysicalCalculation<Double>) object;
        return Double.compare(result.doubleValue(), currentType.result.doubleValue()) == 0;
    }

    @Override
    public int compareTo(AbstractPhysicalCalculation<T> other) {
        return Double.compare(this.result.doubleValue(), other.result.doubleValue());
    }

    @Override
    public AbstractPhysicalCalculation<T> clone() {
        try {
            return (AbstractPhysicalCalculation<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование невозможно");
        }
    }
}
