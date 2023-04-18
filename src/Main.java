public class Main {
    public static void main(String[] args) {

        String str1 = " Shailesh  ";
        String str2 = new String("  Kanjibhai ");
        System.out.println(str1.toUpperCase().trim());
        System.out.println(str2.toUpperCase().trim());

        StringBuffer name = new StringBuffer("  Shailesh");
        name.append(",Mihir")
                .append(",Parth")
                .append(",Nimit")
                .append(",Arpit")
                .append(",Yash")
                .append(",Likita  ");
        System.out.println(name.toString().toUpperCase().trim());

        StringBuilder college = new StringBuilder("     LD College of Engineering");
        college.append(",VGEC")
                .append(",Marvadi University")
                .append(",L.J. Institute of Engineering & Technology")
                .append(",Silver Oak University")
                .append(",Charotar University of Science and Technology    ");
        System.out.println(college.toString().toUpperCase().trim());

    }
}