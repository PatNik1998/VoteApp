package dao;

import database.Database;
import exception.VoterErrorCode;
import exception.VoterException;
import model.Vote;
import model.Voter;
import service.InitResources;

public class VoterDaoImpl implements VoterDao{
    private Database db;

     public String addVoter(Voter voter) throws VoterException {
             if(!db.getVoters().contains(voter)){
                 throw new VoterException(VoterErrorCode.EXISTS_VOTER);
             }
             db.getVoters().add(voter);
             return voter.getVoterId();
         }

         public Voter getVoterById(String voterId) throws VoterException{
             for(Voter voter : db.getVoters()){
                 if(voter.getVoterId().equals(voterId)){
                     return voter;
                 }
             }

             throw new VoterException(VoterErrorCode.NOT_EXISTS_VOTER);

         }

         public void vote(String voteTitle, String nameCandidate, String voterId) throws VoterException{
           Vote vote = InitResources.getVoteDao().getVoteByName(voteTitle);

           Integer value = vote.getCandidates().get(nameCandidate);
           value++;
           vote.getCandidates().put(nameCandidate,value);

     }

         public void initDb(Database db){
           this.db = db;
         }
    }

