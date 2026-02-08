package seng2050.lab2;

public class HtmlGen
{
    public static String doctype()
    {
        return "<!DOCTYPE html >\n<html lang=\"en \" >";
    }
        public static String head(String title)
    {
        return "<head><title>" + title + "</title></head>";
    }
        public static String h1 (String heading1)
    {
        return "<h1>" + heading1 + "</h1>";
    }
    public static String h2 (String heading2)
    {
        return "<h2>" + heading2 + "</h2>";
    }
    public static String h3 (String heading3)
    {
        return "<h3>" + heading3 + "</h3>";
    }
    public static String css(String href)
    {
        return "<link rel=\"stylesheet\" href=\"" + href + "\">";
    }
    public static String script(String src)
    {
        return "<script src=\"" + src + "\"></script>";
    }
    // Other methods to generate frequently used tags
    // maybe generate a table
    // ...
    // ...
}