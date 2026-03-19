// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// Class 1
class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image...");
    }

    public void reset_filter() {
        System.out.println("Image filters reset.");
    }
}

// Class 2
class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to dataset...");
    }

    public void reset_filter() {
        System.out.println("Data filters reset.");
    }
}

// Main class (renamed)
public class FilterProgram {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        DataAnalyzer data = new DataAnalyzer();
        data.apply_filter("Low-pass");
        data.reset_filter();
    }
}
