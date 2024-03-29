package es.upm.miw.iwvg.ecosystem.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double multiply() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).reduce(1, (a, b) -> a * b);
    }

    public double average() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    private void validateIsNullOrEmpty() {
        if ((this.collection == null) || this.collection.isEmpty()) {
            throw new ArithmeticException("Null or Empty collection");
        }
    }

    public double higher() {
        this.validateIsNullOrEmpty();
        return Collections.max(this.collection);
    }

}
