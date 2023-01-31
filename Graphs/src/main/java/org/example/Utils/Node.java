package org.example.Utils;

public class Node
{
    private int flag;
    private String value;
    private Node parent;
    private int discoveredTime;
    private int lastValue;
    private int grade;

    public Node(String val)
    {
        this.value = val;
        this.flag = -1;
        this.grade = -1;
    }

    public Node(int val, String ne)
    {
        this.value = ne;
        this.flag = val;
        this.grade = -1;
    }

    public Node()
    {
        this.flag = -1;
        this.grade = -1;
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
    public boolean isVisited() { return this.flag == 0; }

    public void checkAsCounted() { this.setFlag(1); }
    public boolean isCounted() { return this.flag == 1; }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getDiscoveredTime() {
        return discoveredTime;
    }

    public void setDiscoveredTime(int discoveredTime) {
        this.discoveredTime = discoveredTime;
    }

    public int getLastValue() {
        return lastValue;
    }

    public void setLastValue(int lastValue) {
        this.lastValue = lastValue;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getColor() {
        return grade;
    }

    public boolean isColored() { return grade > -1; }
    public void color(int color) { this.grade = color; }
}