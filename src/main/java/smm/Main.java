package smm;

import smm.facade.SmmFacade;

public class Main {
    public static void main(String[] args) {
        SmmFacade smm = new SmmFacade();
        smm.publishPost("We have a new dessert! Come and try it.", "#coffee #dessert",
                "Instagram", "Tomorrow at 12:00");
    }
}
