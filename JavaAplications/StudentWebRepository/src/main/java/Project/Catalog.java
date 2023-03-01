package Project;

public class Catalog {
    private int BiologuGrade;
    private int MathGrade;

    private int EngGrade;
    private int PhisicsGrade;

    public Catalog(int a, int b, int c,int d) {
        this.BiologuGrade =a;
        this.MathGrade =b;
        this.EngGrade =c;
        this.PhisicsGrade =d;
    }

    public String getFirstGrade(){
        return " "+ String.valueOf(BiologuGrade);
    }
    public String getSecondGrade(){
        return" "+ String.valueOf(MathGrade);
    }
    public String getThirdGrade(){
        return" "+ String.valueOf(EngGrade);
    }
    public String getForthGrade(){
        return" "+ String.valueOf(PhisicsGrade);
    }

    public String getAverage(){
        int avg=(BiologuGrade + MathGrade + EngGrade + PhisicsGrade)/4;
        return" Average: "+ avg;
    }
}
