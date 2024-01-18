public class Main {
    public static void main(String[] args) {
        String biography = String.format("My name is %s and my age is %s","sahar","28");
        System.out.println(biography);
        String capsBiography = biography.toUpperCase();
        System.out.println(capsBiography);
        String replase = capsBiography.replaceAll("SAHAR","FANAP");
        System.out.println(replase);
        String str = replase.substring(0,16);
        System.out.println(str);
        System.out.println(str.toLowerCase());
    }
}