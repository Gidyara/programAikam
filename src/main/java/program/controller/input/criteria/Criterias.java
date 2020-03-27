package program.controller.input.criteria;

import program.controller.input.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Criterias implements Option {
    private List<Map<String, String>> criterias;

    public Criterias() {
    }

    public List<Map<String, String>> getCriterias() {
        return criterias;
    }

    public void print(){
        for (int i = 0; i < criterias.size(); i++) {
            System.out.println(i + " :");
            for (Map.Entry<String, String> pair : criterias.get(i).entrySet()) {
                System.out.println(pair.getKey() + " - " + pair.getValue());
            }
        }
    }

    public List<String> getRequest() {
        List<String> list = new ArrayList<String>();

        for (Map<String, String> criteria : criterias)
            for (Map.Entry<String, String> pair : criteria.entrySet())
                list.add(pair.getKey() + " - " + pair.getValue());
        return list;
    }
}
