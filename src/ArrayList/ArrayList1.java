package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    private List<String> arrayList = new ArrayList<>();

    public ArrayList1(String color){
        arrayList.add(color);
    }

    public List<String> getArrayList() {
        return arrayList;
    }
}
