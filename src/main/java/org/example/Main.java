package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("XXX");
        // person2 に person1の参照を渡します
        Person person2 = person1;
        // person2のメンバ変数を変更します。
        person2.name = "BBB";
        System.out.println(person1.name);

        String str1 = "AAA";
        String str2 = str1;
        str2 = "BBB";
        System.out.println(str1);
    }
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}