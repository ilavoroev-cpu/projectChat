package org.example.clientPackage;

import org.example.clientPackage.UI.Identification;
import org.example.clientPackage.UI.mainMenu;

public class Client {
    public static boolean isIdentification = false;
    public static void main(String[] args){
        if (!isIdentification){
            Identification.goUI(args);
        }
        else {
            mainMenu.goUI(args);
        }
    }
}
