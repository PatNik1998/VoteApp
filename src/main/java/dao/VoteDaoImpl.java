package dao;

import database.Database;
import database.MyComporator;
import exception.VoterErrorCode;
import exception.VoterException;
import model.Vote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class VoteDaoImpl implements VoteDao {
    private Database db;

    public String addVote(Vote vote) throws VoterException {
        if(!db.getVotes().contains(vote)){
            throw new VoterException(VoterErrorCode.EXISTS_VOTE);
        }
        db.getVotes().add(vote);
        return vote.getTitle();

    }

    public void deleteVoteByName(String name) throws VoterException{
        for(Vote vote : db.getVotes()){
            if(vote.getTitle().equals(name)){
                db.getVotes().remove(vote);
                return;
            }
        }
        throw new VoterException(VoterErrorCode.NOT_EXISTS_VOTE);


    }

   public Vote getVoteByName(String name) throws VoterException{
       for(Vote vote : db.getVotes()){
           if(vote.getTitle().equals(name)){
               return vote;
           }
       }
       throw new VoterException(VoterErrorCode.NOT_EXISTS_VOTE);
    }



    public String countVoices(String name) throws VoterException{
        Vote vote = getVoteByName(name);
        ArrayList<Map.Entry<String, Integer>> val =new ArrayList<>(vote.getCandidates().entrySet());
        Collections.sort(val, new MyComporator());
        Collections.reverse(val);

        return val.toString();

    }

    public void initDb(Database db){
        this.db = db;
    }
}
