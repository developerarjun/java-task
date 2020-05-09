
public class startProgram extends ProcessMarks{
    public static void main(String[] args){
        ProcessMarks pm = new ProcessMarks();
        System.out.println("Range : " +pm.range());
        System.out.println("Mean : "  +pm.mean());
        System.out.println("Median: " +pm.median());
        //pm.mode();
        pm.gradeDistn();
    }
}