package by.bntu.fitr.povt.sunRevival.Logic;

import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Logic {
    public static Stack<Integer> emptyNumber = new Stack<>();

    public static int getCountNow() {
        return countNow;
    }

    private static int countNow;
    private static int maxCount =9;
    private static int count  ;
    private static int countSearch =1;

    public static Map<Integer, Decoration> getDictionary() {
        return dictionary;
    }

    public static Map<Integer, Decoration> getDictionarySearch() {
        return dictionarySearch;
    }

    private static Map<Integer,Decoration> dictionary = new HashMap<Integer,Decoration>();
    private static Map<Integer,Decoration> dictionarySearch = new HashMap<Integer,Decoration>();


    public Logic(){


        for (int i = 9;i>=1;i--)
        {
            emptyNumber.push(i);


        }
    }

    public void remove(int key)
    {

        emptyNumber.pop();

    }
    public void addEmpty(int count)
    {
        emptyNumber.push(count);
        dictionary.remove(count);
        Logic.count = maxCount- emptyNumber.size();

    }
    public static void reInsert()
    {
        emptyNumber.clear();
        for (int i = 9;i>=1;i--)
        {
            emptyNumber.push(i);


        }
    }


    public static int getMaxCount() {
        return maxCount;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Logic.count = count;
    }



    public static String getElement(int  count) {
        String str= null;
        if(dictionary.get(count)!=null) {
            str = dictionary.get(count).getName();
        }
        return str;
    }

    public static String getElementSearch(int  count) {
        String str= null;
        if(dictionarySearch.get(count)!=null) {
            str = dictionarySearch.get(count).getName();
        }
        return str;
    }

    public static void add(Decoration value)
    {
        count = emptyNumber.pop();
        countNow = count;
        Logic.dictionary.put(count,value);
       count = maxCount- emptyNumber.size();





    }

    public static void addSearch(int count,Decoration value)
    {

        Logic.dictionarySearch.put(count,value);
        Logic.countSearch++;
    }
    public static void clearDictionary(){
        dictionary.clear();
    }
    public static void clearSearchDictionary(){
        dictionarySearch.clear();
    }



}
