package com.phucdevs.creation.prototype;

public class PrototypeExercise {

    public static void main(String[] args) {

    }
}

class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point point)
    {
        this(point.x, point.y);
    }
}

class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line(Line line)
    {
        start = new Point(line.start);
        end = new Point(line.end);
    }

    public Line deepCopy()
    {
        Line copiedLine = new Line(this);
        return copiedLine;
    }
}