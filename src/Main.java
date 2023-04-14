public class Main {
    public static void main(String[] args) {

        String str1 = " Shailesh  ";
        String str2 = new String("  Kanjibhai ");

        StringBuffer name = new StringBuffer("  Shailesh   ");
        name = new StringBuffer(name.toString().trim());
        name.append(",Mihir")
                .append(",Parth")
                .append(",Nimit")
                .append(",Arpit")
                .append(",Yash")
                .append(",Likita");

        StringBuilder college = new StringBuilder("     LD College of Engineering  ");
        college=new StringBuilder(college.toString().trim());
        college.append(",VGEC")
                .append(",Marvadi University")
                .append(",L.J. Institute of Engineering & Technology")
                .append(",Silver Oak University")
                .append(",Charotar University of Science and Technology    ");

        str1 = str1.toUpperCase().trim();
        str2 = str2.toUpperCase().trim();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(name);
        System.out.println(college);

    }
}