package dao;

import database.Database;
import exception.VoterException;
import model.Vote;

public interface VoteDao {
    String addVote(Vote vote) throws VoterException;
    void deleteVoteByName(String name) throws VoterException;
    Vote getVoteByName(String name) throws VoterException;
    String countVoices(String name) throws VoterException;
    void initDb(Database db);

}
