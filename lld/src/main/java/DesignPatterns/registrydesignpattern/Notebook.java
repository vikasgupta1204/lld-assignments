package registrydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    int no_of_pages;
    String size;
    int mrp;
    String type;
    List<String> facts;;
    List<String> frontCoverDesign;
    Notebook(){}
    
    @Override
    public String toString() {
        return "Notebook{" +
                "no_of_pages=" + no_of_pages +
                ", size='" + size + '\'' +
                ", mrp=" + mrp +
                ", type='" + type + '\'' +
                ", facts=" + facts +
                ", frontCoverDesign=" + frontCoverDesign +
                '}';
    }
}
