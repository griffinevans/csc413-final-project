import java.util.Scanner;
import java.util.Set;
/*
 * InputManager's job is to parse the text given by the player, and decide if it corresponds to a valid action
 */
class InputManager {
  private static InputManager im_instance;

  private Scanner sc;

  private static final Set<String> LOOK_COMMANDS = Set.of( 
      "look", "look around", "explore", "see"
  ); 

  private static final Set<String> ADVANCE_COMMANDS = Set.of( 
      "go forwards", "enter", "continue", "explore", "advance", "go north"
  ); 

  private static final Set<String> RETREAT_COMMANDS = Set.of( 
      "go back", "leave", "exit", "retreat", "go south"
  ); 

  private InputManager() {
    sc = new Scanner(System.in);
  }

  public static InputManager getInstance() {
    if (im_instance == null)
      im_instance = new InputManager();
    return im_instance;
  }

  public String getInput() {
    System.out.print(">");
    String input = sc.nextLine();
    //input is case-agnostic
    input = input.toLowerCase();

    if(LOOK_COMMANDS.contains(input)) {
      return "look";
    }
    if(ADVANCE_COMMANDS.contains(input)) {
      return "advance";
    }
    if(RETREAT_COMMANDS.contains(input)) {
      return "retreat";
    }

    //if no valid match found, return
    System.out.println("I don't know the word " + input);
    return "invalid";

    /*
    switch(input) {
      case "look":
        System.out.println("You see a room");
        break;
      default:
        System.out.println("I don't know the word " + input);
        break;
    }
  */
  }
}
