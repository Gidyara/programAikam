package program.controller.input;

import java.util.ArrayList;
import java.util.List;

public class Stat implements Option{
    private String startDate;
    private String endDate;

    public Stat() {
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<String> getRequest() {
        List<String> list = new ArrayList<String>();
        list.add(startDate + " - " + endDate);
        return list;
    }
}
