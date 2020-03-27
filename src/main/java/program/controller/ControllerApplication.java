package program.controller;

import com.google.gson.Gson;
import program.controller.input.Option;
import program.controller.input.Stat;
import program.controller.input.criteria.Criterias;

import java.io.*;

public class ControllerApplication {
    private String optionArg;
    private String inputFileName;
    private String outputFileName;

    private static final String OPTIONS_SEARCH = "search";
    private static final String OPTIONS_STAT = "stat";

    public ControllerApplication(String[] args) {
        try {
            this.optionArg = args[0];
            this.inputFileName = args[1];
            this.outputFileName = args[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            new Err("недостаточно аргументов");
        }
    }

    static class Err {
        public final String type = "error";
        public String message;

        public Err(String message) {
            this.message = message;
        }
    }

    public void run() throws FileNotFoundException {
        Option option;
        if (optionArg.equals(OPTIONS_SEARCH)) {
            option = getOptions(Criterias.class);
        } else if (optionArg.equals(OPTIONS_STAT)) {
            option = getOptions(Stat.class);
        } else {
            new Err("недопустимая опция");
            return;
        }

        for (String str: option.getRequest()) {
            System.out.println(str);
        }

    }

    public <T> T getOptions(Class<T> clazz) throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader(inputFileName), clazz);
    }
}
