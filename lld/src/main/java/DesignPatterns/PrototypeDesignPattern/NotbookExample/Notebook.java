package PrototypeDesignPattern;

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


    public Notebook copy(Notebook notebook){
            notebook.no_of_pages=this.no_of_pages;
            notebook.facts=this.facts;
            notebook.mrp=this.mrp;
            notebook.frontCoverDesign=this.frontCoverDesign;
            notebook.size=this.size;
            notebook.type=this.type;
            return  notebook;
    }

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
