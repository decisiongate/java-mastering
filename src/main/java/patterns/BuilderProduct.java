package patterns;

import java.util.ArrayList;
import java.util.List;

public class BuilderProduct {
    private List<String> parts;
    private int id;

    public BuilderProduct(int id) {
        this.parts  = new ArrayList<String>();
        this.id     = id;
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void showResult() {
        System.out.println(String.format("Product %d parts:",this.id));
        for(String p: parts) {
            System.out.println("part: "+p);
        }
    }
}
