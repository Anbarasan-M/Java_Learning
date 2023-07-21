class addition{
    int num1 = 100;
    int num2 = 120;
    public int add(){
        return (num1+num2);
    }
}

class below{
    public static void main(String[] args){
        addition ans = new addition();
        int result = ans.add();
        System.out.println(result);
    }
}