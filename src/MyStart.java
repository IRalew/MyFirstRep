public class MyStart {
    public static void main(String[] args) {
        for (String s :args) {
            System.out.print(s);
        }

        System.out.println("Hi All");
        System.out.println();

        DataOnly dt = new DataOnly();
        dt.setData();
        dt.sOutDate();
        System.out.println();

        ATypeName atn = new ATypeName();
        atn.sOut();
        System.out.println(atn.storage("123456789"));
        System.out.println();

        Integer i = new Integer(10);
        Integer s = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer z = 10;


        boolean bl = (s==a);
        System.out.println(bl);
    }
}
