package model;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Vote {
    private String title;
    Map<String,Integer> candidates;
    private Voter creator;

    public Vote(String title, Voter creator, Map<String,Integer> candidates) {
        this.candidates = candidates;
        this.title = title;
        this.creator = creator;
    }

    public Vote(String title){
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Integer> getCandidates() {
        return candidates;
    }

    public void setCandidates(Map<String, Integer> candidates) {
        this.candidates = candidates;
    }

    public Voter getCreator() {
        return creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return title.equals(vote.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "title='" + title + '\'' +
                ", candidates=" + candidates +
                ", creator=" + creator +
                '}';
    }
}
