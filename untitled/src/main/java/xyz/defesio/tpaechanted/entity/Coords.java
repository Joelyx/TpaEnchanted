package xyz.defesio.tpaechanted.entity;

public class Coords {
    double x;
    double y;
    double z;
    String world;

    public Coords(double x, double y, double z, String world) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.world = world;
    }

    public Coords() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public void add (Coords coords) {
        this.x += coords.getX();
        this.y += coords.getY();
        this.z += coords.getZ();
    }

    public void sub (Coords coords) {
        this.x -= coords.getX();
        this.y -= coords.getY();
        this.z -= coords.getZ();
    }
}
