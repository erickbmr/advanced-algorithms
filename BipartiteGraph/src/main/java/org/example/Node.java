package org.example;

public class Node
{
    private int flag;
    private String value;

    public Node(String val)
    {
        this.value = val;
        this.flag = -1;
    }

    public int getFlag()
    {
        return flag;
    }

    public void setFlag(int flag)
    {
        this.flag = flag;
    }

    public void checkAsVisited() { this.setFlag(0); }

    public void checkAsCounted() { this.setFlag(1); }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}