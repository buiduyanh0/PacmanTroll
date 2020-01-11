package PacMangame;

//source code tham khảo:
//https://sharecode.vn/source-code/share-full-code-9-game-bang-java-19358.htm

public class Pacman {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new MainMenu().setVisible(true); // main menu

            }
        });
    }
}