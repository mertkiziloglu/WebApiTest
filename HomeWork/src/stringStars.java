public class stringStars {
    public void addStar(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (i != (name.length()) - 1) {

                System.out.print(name.charAt(i) + "*");
            } else {
                System.out.print(name.charAt(i));
            }

        }
    }
}
