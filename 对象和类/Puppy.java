public class Puppy {
    private int age;
    private String name;

    public Puppy(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 获取 age 的值
    public int getAge() {
        return age;
    }
    //

    // 获取 name 的值
    public String getName() {
        return name;
    }

    /* `Shift + Alt + A` 块注释 */
    /*
     * - `Ctrl + /` 单行注释
     * - `Shift + Alt + A` 块注释
     * - `Alt + ↑ / Alt + ↓` 上下移动一行
     * - `Shift + Alt + ↑ / ↓` 复制一行
     * - `Ctrl + Shift + K` 删除当前行
     * - `Ctrl + Enter` 在下新建一行
     * - `Ctrl + Space` 代码提示补全
     * - `Ctrl + Shift + P` 命令面板（F1 也可以）
     */


    // 按 `Ctrl + Shift + L`：自动选中文档里所有 `err`，出现多个光标

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy");

        // 通过方法来设定 age
        myPuppy.setAge(2);

        // 调用另一个方法获取 age
        int age = myPuppy.getAge();
        System.out.println("小狗的年龄为 : " + age);

        // 也可以直接访问成员变量（通过 getter 方法）

// 生成一个7位彩票号码



        System.out.println("变量值 : " + myPuppy.getAge());
    }
}
