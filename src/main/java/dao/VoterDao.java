package dao;

import database.Database;
import exception.VoterException;
import model.Voter;

public interface VoterDao {

    String addVoter(Voter voter) throws VoterException;
    Voter getVoterById(String voterId) throws  VoterException;
    void vote(String voteTitle, String nameCandidate, String voterId) throws VoterException;

    void initDb(Database db);
}
