# JAVA第三次作业第一次实验

# 程序介绍
设计一个动物声音模拟器,希望模拟器可以模拟许多动物的叫声

# 类
这个程序由三个部分组成，分别是`Animal` `Simulator` `Application`
## `Animal`类
第一个部分是抽象类 `Animal`，包含了动物的属性（哭声和名称）
### 子类·
增加了Cat和Dog名的两个子类，使用**extends**来增加子类，用于显示Cat和Dog的属性。
## `Simulator`类
定义了一个方法 `playSound`,并定义`animal` 变量，类型是`Animal`，用来调用`Animal`类中的`cry()`和`getAnimalName`，即显示动物名字和动作，模拟场景。
## `Application`类
此类是主类，是程序的入口，此类新建了 `Dog` 类的一个新实例,和`Cat` 类的一个新实例，调用 `Simulator` 对象的 `playSound` 方法，并将新创建的实例作为参数传递
# 输出示例
wang

Dog is crying.

miao

Cat is crying.
# 注意事项
使用javac语句进行编译，使用java语句运行。
