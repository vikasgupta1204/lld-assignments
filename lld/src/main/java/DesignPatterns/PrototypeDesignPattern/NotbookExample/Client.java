package PrototypeDesignPattern;

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

        List<Notebook> order=new ArrayList<>();
        for(int i=0;i<100;i++){
            Notebook copy=new Notebook();
            notebook1.copy(copy);
            copy.facts=new ArrayList<>();
            int rand1=(int)Math.random()*90;
            System.out.println(rand1);
            copy.facts.add(Facts.facts[rand1]);
            int rand2=(int)Math.random()*100;
            System.out.println(rand2);
            copy.frontCoverDesign=new ArrayList<>();
            copy.frontCoverDesign.add(Designs.designs[rand2]);;
            order.add(copy);
        }
        order.stream().forEach(System.out::println);
    }
}
