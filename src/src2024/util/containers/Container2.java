package adventofcode.src2024.util.containers;

import java.util.ArrayList;
import java.util.List;

public class Container2 extends Container {
    List<List<Integer>> list = new ArrayList<>();

    public Container2(List<List<Integer>> list) {
        this.list = list;
    }

    public List<List<Integer>> getList() {
        return list;
    }
}
