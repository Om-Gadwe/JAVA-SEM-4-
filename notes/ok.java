package notes;
class ok{
    static int a = 10;
    public static void main(String[] args) {
        ok t1 = new ok();
        t1.a = 20;
        ok t2 = new ok();
        System.out.println(t2.a);
    }
}
