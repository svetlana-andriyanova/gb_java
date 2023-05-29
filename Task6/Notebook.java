package Task6;
import java.util.Objects;

public class Notebook {
    private String brand;
    private String model;
    private String operativeMemory;
    private String ssd;
    private String os;
    private String color;

    public Notebook(String brand, String model, String operativeMemory, String ssd, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.operativeMemory = operativeMemory;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

     public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getSSD() {
        return ssd;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook noteBook = (Notebook) o;
        return Objects.equals(brand, noteBook.brand) && Objects.equals(model, noteBook.model) && Objects.equals(operativeMemory, noteBook.operativeMemory) && Objects.equals(ssd, noteBook.ssd) && Objects.equals(os, noteBook.os) && Objects.equals(color, noteBook.color);
    }

   // @Override
   // public int hashCode() {
    //    return Objects.hash(brand, model, operativeMemory, ssd, os, color);
    //}

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operativeMemory='" + operativeMemory + '\'' +
                ", ssd='" + ssd + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}