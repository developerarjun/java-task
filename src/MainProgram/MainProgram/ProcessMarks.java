import java.util.*; 
public class ProcessMarks extends Marks{
    int[] marks;
    public ProcessMarks (){
        this.marks = getMarks();
    }
    public int getMarksCount(){
        return marks.length;
    }
    //This method calculate max
    public int max(){
      int max = 0;
      for(int i=0; i < getMarksCount(); i++ ) {
         if(marks[i]>max) {
            max = marks[i];
         }
      }
      return max;
    }
    //This method calculate min
    public int min(){
      int min = marks[0];
      for(int i=0; i < getMarksCount(); i++ ) {
         if(marks[i]<min) {
            min = marks[i];
         }
      }
      return min;
    }
    //This method calculate range
    public int range(){
        int max = this.max();
        int min = this.min();
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);
        int range = max - min;
        return range;
    }
    //This method calculate mean
    public double mean(){
        double sum = 0;
        int len = getMarksCount();
        for (int i = 0; i < len; i++) {
            sum += marks[i];
        }
        return sum / len;
    }
    //This method calculate median
    public double median(){
        int[] sortMarks = marks.clone();
        Arrays.sort(sortMarks);
        int len = sortMarks.length;
        int middle = len / 2;
        double median = 0;
        if (len % 2 == 0){
            int left = sortMarks[middle - 1];
            int right = sortMarks[middle];
            median =  (left + right) / 2;
        }else
        {
            median = sortMarks[middle];
        }
        return median;
    }
    //This method calculate mode
    public void mode(){
        List<Integer> lstMode = new ArrayList<Integer>();
        int len = getMarksCount();
        int[] counterArray = new int[len];
        for (int x : marks) {
            counterArray[x]++;
        }
        int maxCount = counterArray[0];
        for(int i = 0; i < len; i++) {
            if (maxCount < counterArray[i]) {
                maxCount = counterArray[i];
            }
        }
        for(int i = 0; i < len; i++) {
            if (maxCount == counterArray[i]) {
                lstMode.add(new Integer(i));
            }
        }
        for(int i=0; i < lstMode.size(); i++){            
            System.out.println(lstMode.get(i));
        }
    }
    public HashMap<String,Integer> grade(){
        HashMap<String, Integer> grades = new HashMap<String,Integer>();
        for(int x : marks){
            if(x >= 85 && x < 100){
                grades.put("A", x);
            }else if(x >= 75 && x < 85){
                grades.put("B", x);
            }else if(x >= 65 && x < 75){
                grades.put("C", x);
            }else if(x >= 50 && x < 65){
                grades.put("D", x);
            }else if( x <= 50){
                grades.put("F", x);
            }
        }
        return grades;
    }
    public void gradeDistn(){
        System.out.println("Grade");
        grade().entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " : " + entry.getValue());  
        });
    }
}