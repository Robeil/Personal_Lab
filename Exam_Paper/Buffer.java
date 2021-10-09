package Experiment.Personal_Lab.Exam_Paper;

public class Buffer {
    public static void main(String[] args) {
//
//        String name = "Robeil";
//        StringBuffer buffer = new StringBuffer(name);
//
//        buffer.setCharAt(2,'@');
//        System.out.println(buffer + " setCharAt");
//        int length = name.length();
//        System.out.println(name.replace("Rob", "Bor"));
//
//        buffer.append("Keleab");
//        buffer.append(" ");
//        buffer.append("Brhanemeskel");
//        buffer.append(" ");
//        buffer.append("Aregawi");
//        System.out.println(buffer);
//
//        String name1 = "Robeil Brhanemeskel Aregawi";
//      //  String modified = name1.replace(["a"] "$");
//       // System.out.println(modified);

        StringBuffer buffer = new StringBuffer("Robeil");
        buffer.append(" ");
        buffer.append("Brhanemeskel");
        buffer.append(" ");
        buffer.append("Aregawi");
        System.out.println(buffer);
        buffer.setCharAt(0,  '@');
        System.out.println(buffer);
        StringBuffer newBuffer = new StringBuffer("");
        newBuffer.append("Keleab");
        newBuffer.append(" ");
        newBuffer.append("Brhanemeskel");
        newBuffer.append(" ");
        newBuffer.append("Aregawi");
        System.out.println(newBuffer);
        int index = newBuffer.indexOf("Robeil");
        newBuffer.replace(0, 6,"Meresha");
        System.out.println(newBuffer);
    }
}
