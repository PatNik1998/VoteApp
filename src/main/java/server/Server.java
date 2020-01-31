package server;

import database.Database;
import service.VoteService;
import service.VoterService;

import java.io.*;

public class Server {

    private VoterService voterService = new VoterService();
    private VoteService voteService = new VoteService();

    Database db = null;

    public void startServer(String savedDataFileName) throws IOException, ClassNotFoundException {
        if (savedDataFileName == null) {
            db = new Database();
        } else {

            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(savedDataFileName)))) {
                db = (Database) objectInputStream.readObject();
            } catch (FileNotFoundException ex) {
                db = new Database();
                System.out.println("Created new DataBase");
            }
        }
        voterService.initDb(db);
        voteService.initDb(db);
    }

    public void stopServer(String savedDataFileName) throws IOException {
        if (savedDataFileName == null) {
            return;
        }
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(savedDataFileName)))) {
            objectOutputStream.writeObject(db);
        }
    }

}
