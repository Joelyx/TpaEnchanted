package xyz.defesio.tpaechanted.model;

import xyz.defesio.tpaechanted.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    File path;

    public FileManager(File path) {
        this.path = path;
    }

    public void write(File file, ArrayList<User> info) {
        try (
                FileOutputStream fos = new FileOutputStream(file); BufferedOutputStream bos = new BufferedOutputStream(fos); ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            oos.writeObject(info);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<User> read(File file) {
        ArrayList<User> users = new ArrayList();

        try (
                FileInputStream fos = new FileInputStream(file); BufferedInputStream bos = new BufferedInputStream(fos); ObjectInputStream oos = new ObjectInputStream(bos);) {
            users = (ArrayList<User>) oos.readObject();
            System.out.println(users);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }
}
