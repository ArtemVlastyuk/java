public class TestBall {
    public static void main(String[] args) {
        Ball a=new Ball(1,2);
        System.out.println(a.toString());
        a.move(0.5,0.6);
        System.out.println(a.toString());
        a.setXY(2.4,0);
        System.out.println(a.toString());
    }
}
