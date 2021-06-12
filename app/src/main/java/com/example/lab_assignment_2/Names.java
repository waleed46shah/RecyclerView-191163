package com.example.lab_assignment_2;

public class Names {
    int PP;
    String name;
    public Names(String name,int pp) {
        this.name = name;
        PP=pp;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPp()
    {
        return PP;
    }

    public void setPp(int pp)
    {
        PP = pp;
    }
}
