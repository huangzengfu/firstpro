package main;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class hello   {
    public static void main(String[] args) {
//        Teacher t1 = new Teacher("张三", 25);
//        Teacher t2 = new Teacher("张四", 19);
//        Teacher t3 = new Teacher("王五", 23);
//        Teacher t4 = new Teacher("赵子龙", 20);
//        List<Teacher> list = new ArrayList<>();
//        list.add(t1);
//        list.add(t2);
//        list.add(t3);
//        list.add(t4);
//        System.out.println(list.stream().filter(e->e.getAge()>=20).map(Teacher::getName).limit(2).collect(Collectors.toList()));
//    }
        print(3);

}
    public static void print(int value){
        if(value!=0){
            for (int i = 1; i <= value; i++) {
                System.out.println(value);

            }
            print(value-1);
        }

    }
}


class Teacher{
    private String name;
    private Integer age;

    public Teacher(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}
