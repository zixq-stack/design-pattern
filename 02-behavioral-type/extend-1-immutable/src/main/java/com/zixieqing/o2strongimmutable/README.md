**定义：指的是一个类的实例的状态不会改变，同时它的子类的实例也具有不可变化的状态**

**强不变类需要满足的条件：**

1. 满足若不变类的所有条件
2. 所考虑的类所有的方法都应当是`final`，这样这个类的子类就不能置换掉此类的方法
3. 这个咧本身就是`final`修饰的，那么这个类就不可能会有子类，从而也就不可能有被子类修改的问题



强不变模式在Java中的应用最典型的例子就是：`java.lang.String`，如下面的代码：

```java
String s = "紫邪情";
String b = "紫邪情";
  
```

Java 虚拟机其实只会创建这样--个字符串的实例，而这三个 String 对象都在共享这个值。如果程序所处理的字符串有频繁的内容变化时，就不宜使用 String 类型，所以使用 `StringBuffer` 或`StringBuilder`

Java中还有` Integer、Float、Double、Byte、Long、Short、Boolean 和 Character`，使用包装类的作用之一是： Long 类型的对象所起的作用在于它把--个 long 原始类型的值包装在--个对象里。比如：存放在 Vector 对象里面的必须是对象，而不可以是原始类型。有了封装类，就可以把原始数据类型包装起来作为对象处理。如果要将一个long 类型的值存放到一个 Vector 对象里面，就可以把这个 long 类型的值包装到 Long对象里面，然后再存放到 Vector 对象里，例子如下：

```java
Vector y = new Vector();
v.addElement(new Long(100L));
v.addElement(new Long(101L));

```

这些封装类实际上都是强不变类，因为在这些类都是 `final `的，而且在对象被创建时它们所蕴含的值(也就是它们的状态)就确定了，即：根本没有提供修改内部值的方法