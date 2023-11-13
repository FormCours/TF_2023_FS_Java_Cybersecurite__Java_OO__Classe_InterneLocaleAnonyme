package models;

import listenners.IHouseListenner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class House {

    public static class Room {

        private double area;
        private int nbDoor;
        private boolean hasWindow;

        public Room(double area, int nbDoor, boolean hasWindow) {
            this.area = area;
            this.nbDoor = nbDoor;
            this.hasWindow = hasWindow;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public int getNbDoor() {
            return nbDoor;
        }

        public void setNbDoor(int nbDoor) {
            this.nbDoor = nbDoor;
        }

        public boolean isHasWindow() {
            return hasWindow;
        }

        public void setHasWindow(boolean hasWindow) {
            this.hasWindow = hasWindow;
        }
    }

    private String wallColor;
    private List<Room> rooms;
    private IHouseListenner houseListenner;


    public House(String wallColor) {
        this.wallColor = wallColor;
        this.rooms = new ArrayList<>();
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public List<Room> getRooms() {
        return Collections.unmodifiableList(this.rooms);
    }

    public void setHouseListenner(IHouseListenner houseListenner) {
        this.houseListenner = houseListenner;
    }


    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void HaveVisite() {
        boolean presente = new Random().nextBoolean();

        if(presente && houseListenner != null) {
            houseListenner.open();
        }
    }

}
