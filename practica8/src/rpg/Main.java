package rpg;

import rpg.logic.GameController;
import rpg.ui.MenuUtils;
import rpg.utils.log;

public class Main {
  public static void main(String[] args) {
    GameController gameController = new GameController();
      log log = new log();
      log.escribirLog("INFO","SE HE EJECUTADO EL MAIN");
    gameController.iniciar();
  }
}