package xyz.defesio.tpaechanted.entity;

import org.bukkit.entity.Player;

import java.io.Serializable;

public class User implements Serializable {
    Player player;
    Player requester;
    Coords currentCoords;
    Coords lastCoords;

    public User(Player player, Coords currentCoords, Coords lastCoords) {
        this.player = player;
        this.currentCoords = currentCoords;
        this.lastCoords = lastCoords;
    }

    public User() {}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Coords getCurrentCoords() {
        return currentCoords;
    }

    public Player getRequester() {
        return requester;
    }

    public void setRequester(Player requester) {
        this.requester = requester;
    }

    public void setCurrentCoords(Coords currentCoords) {
        this.currentCoords = currentCoords;
    }

    public Coords getLastCoords() {
        return lastCoords;
    }

    public void setLastCoords(Coords lastCoords) {
        this.lastCoords = lastCoords;
    }
}
