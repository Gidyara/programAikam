package program;

import program.controller.ControllerApplication;

import java.io.*;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        ControllerApplication controller = new ControllerApplication(args);
        controller.run();








//        ObjectMapper mapper = new ObjectMapper();
//
//        //создание объекта для сериализации в JSON
//        Criterias criterias = new Criterias();
//
//        LastNameCriteria lastNameCriteria = new LastNameCriteria();
//        lastNameCriteria.setLastName("Иванов");
//        criterias.criterias.add(lastNameCriteria);
//
//        LastNameCriteria lastNameCriteria2 = new LastNameCriteria();
//        lastNameCriteria2.setLastName("Петров");
//        criterias.criterias.add(lastNameCriteria2);
//
//







        //писать результат сериализации будем во Writer(StringWriter)
//        StringWriter writer = new StringWriter();
//
//
//
//
//        //это объект Jackson, который выполняет сериализацию
//        ObjectMapper mapper = new ObjectMapper();


//        try {
//            // сама сериализация: 1-куда, 2-что
//            mapper.writeValue(writer, criterias);
//            //преобразовываем все записанное во StringWriter в строку
//            String result = writer.toString();
//            System.out.println(result);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//запись в файл

//        try {
//            FileWriter fileWriter = new FileWriter("output.json");
//            mapper.writeValue(fileWriter, criterias);
//            fileWriter.close();
//
//            mapper.writeValue(writer, criterias);
//            System.out.println(writer.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    //чтение с файла
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("input.json"));
//            String str = "";
//            while (reader.ready()){
//                str += reader.readLine();
//            }
//            reader.close();
//
//            StringReader r = new StringReader(str);
//            ObjectMapper mapperr = new ObjectMapper();
//            Criterias c = mapperr.readValue(r, Criterias.class);
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (JsonGenerationException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
