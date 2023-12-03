public class humanbeing {
    private double height;
    private double weight;
    private double bmi;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBMI() {
        this.bmi = calculateBMI();
    }

    public double getBMI() {
        return bmi;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    private double calculateBMI() {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive values");
        }

        return weight / Math.pow(height / 100, 2);
    }
}

public class HealthAnalyzer {
    public boolean isFit(humanbeing person) {
        return person.getBMI() < 25;
    }

    public boolean isTall(humanbeing) {
        return person.getHeight() > 180;
    }

    public static void main(String[] args) {
        humanbeing person = new humanbeing();
        person.setHeight(175);
        person.setWeight(70);
        person.setBMI();

        HealthAnalyzer healthAnalyzer = new HealthAnalyzer();

        System.out.println("BMI: " + person.getBMI());
        System.out.println("Is Fit: " + healthAnalyzer.isFit(person));
        System.out.println("Is Tall: " + healthAnalyzer.isTall());
    }
}
