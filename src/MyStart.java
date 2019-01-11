public class MyStart {
    public static void main(String[] args) {
        System.out.println("Hi All");
        System.out.println();

        DataOnly dt = new DataOnly();
        dt.setData();
        dt.sOutDate();
        System.out.println();

        ATypeName atn = new ATypeName();
        atn.sOut();
    }
}
