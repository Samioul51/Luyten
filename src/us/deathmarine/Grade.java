package us.deathmarine.luyten;

public class Grade {
    public static String gradeScore(int score){
        if(score>=90) 
            return "A";
        if(score>=80) 
            return "B";
        if(score>=70) 
            return "C";
        if(score>=60) 
            return "D";
        return "F";
    }
}
