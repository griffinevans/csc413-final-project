import java.lang.Math;

class GameRNG {
  public GameRNG() {

  } 

  public static String generateRoomType() {
    double rng = Math.random();
    if (rng < 0.3)
      return "combat";
    if (rng < 0.6)
      return "treasure";
    else
      return "trap";
  }
}
