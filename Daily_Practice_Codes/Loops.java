class loops{
    public static void main(String[] args){
//      While loop - Check if the condition is true then execute the statements
        int i = 1;
        while (i<=10)
        {
            System.out.println(i);
            i ++;
        }
//      do while - Runs properly if the condition is true else run only once
        int j = 1;
        do {
            System.out.println(j);
            j ++;
        }while (j<1);
//      for loop - Used to minimise the code and helps to write code in single line
        for (int k = 1; k <= 10; k++)
        {
            System.out.println("For Loop");
        }
    }
}
