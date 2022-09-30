package Head4.Task1_2_3;

public class Lab1_2_3 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        Point p3 = null;
        Point p4 = new Point(1, 2);

        LabeledPoint lp1 = new LabeledPoint("Piter", 1, 1);
        LabeledPoint lp2 = new LabeledPoint("Jake", 2, 2);
        LabeledPoint lp3 = null;
        LabeledPoint lp4 = new LabeledPoint("Jake", 1, 1);
        LabeledPoint lp5 = new LabeledPoint("Piter", 1, 1);

        System.out.println(p1 + "==" + p2 + " : " + p1.equals(p2) + '\n' +
                p1 + "==" + p3 + " : " + p1.equals(p3) + '\n' +
                p1 + "==" + p4 + " : " + p1.equals(p4) + '\n' +
                p1 + "==" + lp5 + " : " + p1.equals(lp5) + '\n'
        );

        System.out.println(lp1 + "==" + lp2 + " : " + lp1.equals(lp2) + '\n' +
                lp1 + "==" + lp3 + " : " + lp1.equals(lp3) + '\n' +
                lp1 + "==" + lp4 + " : " + lp1.equals(lp4) + '\n' +
                lp1 + "==" + p2 + " : " + lp1.equals(p2) + '\n' +
                lp1 + "==" + lp5 + " : " + lp1.equals(lp5)
        );
    }
}
