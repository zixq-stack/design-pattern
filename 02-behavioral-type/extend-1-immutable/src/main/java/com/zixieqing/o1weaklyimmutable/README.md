**定义：指的是一个类的实例的状态是不可变化的，但这个类的子类的实例具有可能会变化的状态，这种类必须满足如下的条件：**

1. 所考虑的对象没有任何方法会修改对象的状态，这样一来，当对象的构造函数将对象的状态初始化之后，对象的状态便不再改变
2. 所有的属性都应当是私有的（不要声明任何的public的属性，是为了以防客户端对象直接修改任何的内部状态）
3. 这个对象所引用到的其他对象如果是可变对象的话，则必须设法限制外界对这些可变对象的访问，以防止外界修改这些对象。如果可能，应当尽量在不变对象内部初始化这些被引用到的对象，而不要在客户端初始化，然后再传入到不变对象内部中；如果某个可变对象必须在客户端初始化，然后再传入到不变对象中的话，就应当考虑在不变对象初始化时将这个可变对象复制一份，而不要使用原来的拷贝

**弱不变模式的缺点：**

1. 一个弱不变对象的子对象可以是可变对象，即：一个弱不变对象的子对象可能是可变的
2. 这个可变的子对象可能可以修改父对象的状态，从而可能会允许外界修改父对象的状态