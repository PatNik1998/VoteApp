package service;
import database.Database;
import exception.VoterException;
import model.Vote;



public class VoteService {

    public String createVote(String requestJsonString){
        Vote vote = InitResources.getGson().fromJson(requestJsonString, Vote.class);

        try{
            return InitResources.getVoteDao().addVote(vote);
        }

        catch (VoterException ex){
            return InitResources.getGson().toJson(ex.getErrorCode());
        }
    }

public String deleteVote(String requestJsonString){
        Vote vote = InitResources.getGson().fromJson(requestJsonString,Vote.class);

        try {
            InitResources.getVoteDao().deleteVoteByName(vote.getTitle());
        }

        catch (VoterException ex){
            return InitResources.getGson().toJson(ex.getErrorCode());
        }

        return "{}";
}


   public String countVoices(String requestJsonString){

       Vote vote = InitResources.getGson().fromJson(requestJsonString,Vote.class);

       try {
          return InitResources.getVoteDao().countVoices(vote.getTitle());
       }

       catch (VoterException ex){
           return InitResources.getGson().toJson(ex.getErrorCode());
       }

   }



    public void initDb(Database db){
        InitResources.getVoteDao().initDb(db);
    }
}
