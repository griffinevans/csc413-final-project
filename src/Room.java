class Room {

  private String description;
  private Room northRoom;
  private Room southRoom;
  private String roomType;
  public boolean explored;

  public Room(String description) {
    this.description = description;
    explored = false;
    northRoom = new Room("A plain room", GameRNG.generateRoomType(), this);
  }

  /*
   * Create a room connected to another room. room will be the origin point, and direction is where the new room is, relative to the parent room. 
   */
  public Room(String description, String roomType, Room parentRoom) {
    this.description = description;
    this.roomType = roomType;
    southRoom = parentRoom;
  }

  public Room getNorthRoom() {
    if (northRoom != null) {
      return northRoom;
    }
    northRoom = new Room("A plain room", GameRNG.generateRoomType(), this);
    return northRoom;
  }

  public void setNorthRoom(Room r) {
    northRoom = r;
  }
  
  public Room getSouthRoom() {
    return southRoom;
  }

  public String getRoomType() {
    return roomType;
  }

  /*
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
  */
  
  public String getDescription() {
    return description;
  }

}
