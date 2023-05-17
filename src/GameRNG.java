import java.util.List;
import java.util.Collections;
import java.util.Arrays;

class GameRNG {

  private static final List<String> roomTypes = Arrays.asList( 
      "combat", "treasure", "trap"
      );

  private static final List<String> enemyTypes = Arrays.asList(
      "bulgasari", "dokkaebi", "gumiho", "jangsanbeom", "jioggwi"
      );

  /*
   * Shuffle the list and return the first element.
   */
  public static String generateRoomType() {
    Collections.shuffle(roomTypes);
    return roomTypes.get(0);
  }

  /*
   * Shuffle the list and return the first element.
   */
  public static Enemy randomEnemy() {
    Collections.shuffle(enemyTypes);
    String s = enemyTypes.get(0);
    switch(s) {
      case "bulgasari":
        return new Bulgasari();
      case "dokkaebi":
        return new Dokkaebi();
      case "gumiho":
        return new Gumiho();
      case "jangsanbeom":
        return new Jangsanbeom();
      case "jioggwi":
        return new Jioggwi();
      default:
        break;
    }
    return new Dokkaebi();
  }
}
