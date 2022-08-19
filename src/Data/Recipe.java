package Data;

import java.util.List;

public class Recipe implements java.io.Serializable{
    private final int ID;
    private final String name;
    private final List<String> ingredients;
    private final List<String> steps;


    public Recipe(int id, String name, List<String> ingredients, List<String> steps) {
        ID = id;
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public int getID() {
        return ID;
    }
    public List<String> getIngredients(){
        return this.ingredients;
    }
    public List<String> getSteps(){
        return this.steps;
    }
    public String getName() {
        return name;
    }

}
