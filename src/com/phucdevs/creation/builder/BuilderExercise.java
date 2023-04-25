package com.phucdevs.creation.builder;

import java.util.ArrayList;

public class BuilderExercise {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}

class CodeBuilder
{
    public ArrayList<Field> fields = new ArrayList<>();
    public String className;

    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        Field field = new Field (name, type);
        fields.add(field);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(printClassName() + "\n");
        sb.append("{\n");
        for (Field field : fields)
        {
            sb.append(field.toString() + "\n");
        }
        sb.append("}\n");

        return sb.toString();
    }

    private String printClassName() {
        return "public class " + className;
    }
}

class Field
{
    public String name;
    public String type;

    public Field()
    {

    }

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "  public " + type + " " + name + ";";
    }
}