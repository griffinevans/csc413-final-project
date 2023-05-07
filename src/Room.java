class Room {

  private String description;
  private Room northRoom;
  private Room southRoom;
  private Room eastRoom;
  private Room westRoom;

  public Room(String description) {
    this.description = description;
    northRoom = new Room("An empty room", this, "north");
  }

  /*
   * Create a room connected to another room. room will be the origin point, and direction is where the new room is, relative to the parent room. For example, to create a room north of the current room you would call new Room(desc, this, north).
   */
  public Room(String description, Room room, String direction) {
    this.description = description;
    switch(direction) {
      case "north":
        southRoom = room;
      case "south":
        northRoom = room;
      case "east":
        westRoom = room;
      case "west":
        eastRoom = room;
      default:
        break;
    }
  }

  public Room getNorthRoom() {
    return northRoom;
  }

  public void setNorthRoom(Room r) {
    northRoom = r;
  }
  
  public Room getSouthRoom() {
    return southRoom;
  }

  public void setSouthRoom(Room r) {
    southRoom = r;
  }
  
  public Room getEastRoom() {
    return eastRoom;
  }

  public void setEastRoom(Room r) {
    eastRoom = r;
  }
  
  public Room getWestRoom() {
    return westRoom;
  }

  public void setWestRoom(Room r) {
    westRoom = r;
  }
  
  public String getDescription() {
    return description;
  }

}
