package database;


import model.Vote;
import model.Voter;

import java.util.*;

public class Database {

   private List<Voter> voters = new ArrayList<Voter>();
   private List<Vote> votes = new ArrayList<>();

    public List<Voter> getVoters() {
        return voters;
    }

    public List<Vote> getVotes() {
        return votes;
    }



}
