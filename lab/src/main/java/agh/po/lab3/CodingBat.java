package agh.po.lab3;

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

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println("startHi(\"hi there\") -> " + cb.startHi("hi there")); //true
        System.out.println("startHi(\"hello\") -> " + cb.startHi("hello"));       //false
        System.out.println("parrotTrouble(true, 6) -> " + cb.parrotTrouble(true, 6));   //true
        System.out.println("parrotTrouble(true, 7) -> " + cb.parrotTrouble(true, 7));   //false

        int[] tablica = {1, 2, 3};
        System.out.println("sum3([1, 2, 3]) -> " + cb.sum3(tablica));                 //6

        System.out.println("helloName(\"Bob\") -> " + cb.helloName("Bob"));           //Hello Bob!
    }

}