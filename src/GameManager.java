/*
 * GameManager is the dungeon master. It contains the top level of logic in the game's structure
 * The game is played in a series of turns. Each turn begins by waiting for text input
 * from the player. The input is parsed, and any according actions are taken. Then, the game checks to make sure the player is still alive, and continues to the next turn.
 */

class GameManager {

  private static GameManager gm_instance = null;

  private boolean gameRunning;
  private Player player;
  private InputManager inputManager;
  private Room currentRoom;


  private GameManager() {
    gameRunning = true;
    player = Player.getInstance();
    inputManager = InputManager.getInstance();
    //first room description
    currentRoom = new Room("You stand at the entrance of a dark catacomb. The heavy iron gate is slightly ajar, revealing a dimly lit passage leading downwards. Behind you, a gentle carries the scent of fresh grass from outside.");
  }

  public static GameManager getInstance() {
    if (gm_instance == null) 
      gm_instance = new GameManager();
    return gm_instance;
  }

  public void startGame() {
    System.out.println(currentRoom.getDescription());
    while(gameRunning) {
      startTurn();
      endTurn();
    }
  }

  /*
   * At the start of the turn, the player is prompted for input
   */
  private void startTurn() {
    String input = inputManager.getInput();
    switch(input) {
      case "look":
        System.out.println(currentRoom.getDescription());
        break;
      case "advance":
        moveRooms("north");
        break;
      case "retreat":
        moveRooms("south");
        break;
      default:
        break;
    }
  }

  private void endTurn() {
    System.out.println();
    if(player.getHealth() <= 0) {
      endGame();
    }
  }

  //When we move to a new room, generate a room to the north of that room
  private void moveRooms(String direction) {
    System.out.println("You enter the " + direction + " door.");
    if (direction == "north"){
      currentRoom = currentRoom.getNorthRoom();
      currentRoom.explored = true;
      exploreRoom(currentRoom);
    }

    else if (direction == "south")
      currentRoom = currentRoom.getSouthRoom();

  }

  private void exploreRoom(Room room) {
    if (room.getRoomType().equals("treasue")) {
      System.out.println("entered treasure room");
    }
    if (room.getRoomType().equals("combat")) {
      
      System.out.println("entered combat room");
    }
    if (room.getRoomType().equals("trap")) {
      System.out.println("entered trap room");
    }
  }

  /*
   * Display game over message, etc. Could include saving high scores or something similar
   */
  private void endGame() {
    System.out.println("Game over");
    gameRunning = false;
  }
}
