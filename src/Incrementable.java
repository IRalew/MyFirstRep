public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
    public void sOutInc(){
        System.out.println(StaticTest.i);
    }

}

class StaticTest {
    static int i = 47;
}
