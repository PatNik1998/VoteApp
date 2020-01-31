package service;

import database.Database;
import exception.VoterException;
import model.Voter;


public class VoterService {



    public String registerVoter(String requestJsonString){
       Voter voter = InitResources.getGson().fromJson(requestJsonString,Voter.class);

        try{
            return InitResources.getVoterDao().addVoter(voter);
        }

        catch (VoterException ex){
            return InitResources.getGson().toJson(ex.getErrorCode());
        }
    }

    public void initDb(Database db){
        InitResources.getVoterDao().initDb(db);
    }
}
