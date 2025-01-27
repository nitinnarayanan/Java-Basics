public class conditional {
    int i=15, j=10;
    public void ifelse(){
        System.out.println("IF ELSE CONDITIONAL STATEMENT OUTPUT:");
         if (i>j)
             System.out.println("Its IF condition");
         else if (i<j)
             System.out.println("Its ELSE IF condition");
         else
             System.out.println("Its ELSE statement");
    }
    public void switchCase(){
        System.out.println("\nSWITCH CONDITIONAL STATEMENT OUTPUT:");
        switch (j) {
            case 15:
                System.out.println("Case 15");
                break;
            case 20:
                System.out.println("Case 20");
                break;
            case 25:
                System.out.println("Case 25");
                break;
            default:
                System.out.println("default");
                break;
        }

    }
     public static void main (String[] args){
        conditional obj = new conditional();
        obj.ifelse();
        obj.switchCase();
     }
}
