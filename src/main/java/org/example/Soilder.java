package org.example;

public class Soilder {
    private int rank;
    private String name;

    public Soilder(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soilder{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }
}
