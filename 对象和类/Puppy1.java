public class Puppy1 {
    private int age;
    private String name;
    public Puppy1(String name){
        this.name=name;
        System.out.println(name);
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 获取 age 的值
    public int getAge() {
        return age;
    }
    
    // 获取 name 的值
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // 创建对象
        Puppy1 myPuppy = new Puppy1("Tommy");

        // 通过方法来设定 age
        myPuppy.setAge(2);

        // 调用另一个方法获取 age
        int age = myPuppy.getAge();
        System.out.println("小狗的年龄为 : " + age);

        // 也可以直接访问成员变量（通过 getter 方法）
        System.out.println("变量值 : " + myPuppy.getAge());
    }
}


