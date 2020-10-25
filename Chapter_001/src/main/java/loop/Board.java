package loop;

public class Board {
    public static void main(String[] args) {
        System.out.println(paint(5, 4));
    }

        public static String paint(int width, int height) {
            StringBuilder screen = new StringBuilder();
            String ln = System.lineSeparator();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i + j) % 2 == 0) {
                        screen.append("X");
                    } else {
                        screen.append(" ");
                    }
                }
                screen.append(ln);
            }
            return screen.toString();
        }
    }
