package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    //Jesus
    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 1L;
    float floatP = 1.1F;
    double doubleP = 2.2;
    char charP = 'P';
    boolean booleanP = true;

    Byte byteW = 1;
    Short shortW = 1;
    Integer intW = 1; //Auto boxing
    Long longW = 1L;
    Float floatW = 1.1F;
    Double doubleW = 2.2;
    Character charW = 'P';
    Boolean booleanW = true;

    int num = intW; //Unboxing
    Integer intW2 = Integer.parseInt("12");
}
