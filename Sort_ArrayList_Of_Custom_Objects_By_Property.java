package JavaPraticeQuestions;

import java.util.ArrayList;

public class Sort_ArrayList_Of_Custom_Objects_By_Property {
    private String customProperty;
    public Sort_ArrayList_Of_Custom_Objects_By_Property(String property) {
        this.customProperty = property;
    }
    public String getCustomProperty() {
        return this.customProperty;
    }
    public static void main(String[] args) {
        ArrayList<Sort_ArrayList_Of_Custom_Objects_By_Property> list = new ArrayList<>();
        list.add(new Sort_ArrayList_Of_Custom_Objects_By_Property("Z"));
        list.add(new Sort_ArrayList_Of_Custom_Objects_By_Property("A"));
        list.add(new Sort_ArrayList_Of_Custom_Objects_By_Property("B"));
        list.add(new Sort_ArrayList_Of_Custom_Objects_By_Property("X"));
        list.add(new Sort_ArrayList_Of_Custom_Objects_By_Property("Aa"));

        list.sort(((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty())));
        for (Sort_ArrayList_Of_Custom_Objects_By_Property obj : list) {
            System.out.println(obj.getCustomProperty());
        }


    }
}
