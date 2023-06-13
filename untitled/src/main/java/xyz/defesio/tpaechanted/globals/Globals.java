package xyz.defesio.tpaechanted.globals;

import xyz.defesio.tpaechanted.entity.User;
import xyz.defesio.tpaechanted.model.FileManager;

import java.util.ArrayList;

public class Globals {
    private Globals() {}
    public static FileManager fm;

    public static ArrayList<User> players = new ArrayList<>();

}
