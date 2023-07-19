public class increment_decrement {
    public static void main(String[] args){
        int num = 7;
        int result = 0;

        num = num +1;

        num += 1;

        num ++; //post increment - first fetch and then increase

        ++ num; //pre increment - first increase and then fetch

        result += num;
        System.out.println(result);
    }
}
