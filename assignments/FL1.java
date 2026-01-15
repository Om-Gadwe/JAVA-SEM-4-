package assignments;
class Addition {
    int a = 10;
    int b = 20;

    void add() {
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add();                      
    }
}
