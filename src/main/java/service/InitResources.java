package service;

import com.google.gson.Gson;
import dao.VoteDao;
import dao.VoteDaoImpl;
import dao.VoterDao;
import dao.VoterDaoImpl;
import database.Database;

public  class InitResources {
    private static Gson gson = new Gson();
    private static VoterDao voterDao = new VoterDaoImpl();
    private static VoteDao voteDao = new VoteDaoImpl();

    public static Gson getGson() {
        return gson;
    }

    public static VoterDao getVoterDao() {
        return voterDao;
    }

    public static VoteDao getVoteDao() {
        return voteDao;
    }
}
