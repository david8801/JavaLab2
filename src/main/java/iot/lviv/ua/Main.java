package iot.lviv.ua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    static final String fileName = "C:/Users/David/IdeaProjects/JavaLab7/text.txt";
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String searchingText = in.nextLine();
        List wordsList = StringProcessor.txtToList(fileName);
        List<String> resultList = searchInFile(wordsList, searchingText);
        System.out.println(resultList);
    }
    public static List<String> searchInFile(List worldsList, String searchingText){
        List<String> foundWords = new ArrayList<>();
        for(Object name : worldsList) {
            String strName = (String) name;
            if (strName.contains(searchingText) && (strName.contains(".png") || strName.contains(".jpeg") || strName.contains(".jpg") || strName.contains(".gif"))) {
                foundWords.add(strName);
            }
        }
    return foundWords;
    }
}