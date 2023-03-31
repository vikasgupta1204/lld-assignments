package registrydesignpattern;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Notebook notebook1=new Notebook();
        notebook1.no_of_pages=350;
        notebook1.type="Ruled";
        notebook1.size="A4";
        notebook1.mrp=100;
        notebook1.facts=new ArrayList<>();
        notebook1.facts.add(Facts.fact1);
        notebook1.facts.add(Facts.fact2);
        notebook1.frontCoverDesign=new ArrayList<>();
        notebook1.frontCoverDesign.add(Designs.DESIGN_CAIPTAN_AMERICA);
        
        NotebookRegistry registry=NotebookRegistry.getInstance();
        registry.register("original_notebook", notebook1);
        
        List<Notebook> order=new ArrayList<>();
        for(int i=0;i<100;i++){
            Notebook copy=registry.get("original_notebook");        
            copy.facts=new ArrayList<>();
            copy.facts.add(Facts.facts[i%8]);        
            copy.frontCoverDesign=new ArrayList<>();
            copy.frontCoverDesign.add(Designs.designs[i%10]);;
            order.add(copy);
        }
        order.stream().forEach(System.out::println);
    }
}
