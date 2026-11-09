package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat
{
    public boolean startHi(String str)
    {
        if (str.length() < 2)
            return false;
        String hi = str.substring(0, 2);
        if (hi.equals("hi"))
            return true;
        return false;
    }

    public boolean parrotTrouble(boolean talking, int hour)
    {
        if (talking == false)
            return false;
        if (hour >= 7 && hour <= 20)
            return false;
        return true;
    }

    public int sum3(int[] nums)
    {
        int score = 0;
        score = nums[0] + nums[1] + nums[2];
        return score;
    }

    public String helloName(String name)
    {
        return "Hello " + name + "!";
    }
    //////////////////////////////////////////////////////LAB4
    public Map <String, String> mapAB(Map<String, String> map) 
    {
        if (map.containsKey("a") && map.containsKey("b")) 
        {
            String combined = map.get("a") + map.get("b");
            map.put("ab", combined);
        }
        return map;
    }

    public Map <String, Integer> wordLen(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) 
        {
            map.put(s, s.length());
        }
        return map;
    }


    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println("startHi(\"hi there\") -> " + cb.startHi("hi there")); //true
        System.out.println("startHi(\"hello\") -> " + cb.startHi("hello"));       //false
        System.out.println("parrotTrouble(true, 6) -> " + cb.parrotTrouble(true, 6));   //true
        System.out.println("parrotTrouble(true, 7) -> " + cb.parrotTrouble(true, 7));   //false

        int[] tablica = {1, 2, 3};
        System.out.println("sum3([1, 2, 3]) -> " + cb.sum3(tablica));                 //6
        System.out.println("helloName(\"Bob\") -> " + cb.helloName("Bob"));           //Hello Bob!

        System.out.println("\n LAB4");
        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "Hi");
        testMap.put("b", "There");
        System.out.println("mapAB({'a': 'Hi', 'b': 'There'}) -> " + cb.mapAB(testMap));
        String[] slowa = {"this", "and", "that", "and"}; // dla
        System.out.println("wordLen([\"this\", \"and\", \"that\", \"and\"]) -> " + cb.wordLen(slowa));
    }
}