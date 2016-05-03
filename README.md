# 设计模式
##原则
   1. 开闭原则（Open Close Principle）

     开闭原则就是说对扩展开放,对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
     所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后
     面的具体设计中我们会提到这点。

   2. 里氏代换原则（Liskov Substitution Principle）

     里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基
     类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到
     影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。
     实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现
     抽象化的具体步骤的规范。

   3. 依赖倒转原则（Dependence Inversion Principle）

     这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。

   4. 接口隔离原则（Interface Segregation Principle）

    这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，
    其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。

   5. 迪米特法则（最少知道原则）（Demeter Principle）

    为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

   6. 合成复用原则（Composite Reuse Principle）

    原则是尽量使用合成/聚合的方式，而不是使用继承。

##总览
   ![启动界面](/img/desgin.jpg)
   ![](/img/Summary.jpg)

##A创建型
###1单例模式
  >确保一个类只有一个实例,并提供一个全局访问点.


  ![](/img/Singleton.jpg)

    使用场景
    例如线程池,缓存,日志对象,驱动程序等,我们只需要一个对象.(用java全局变量比如静态变量也可以实现,但是如果一个对象非常消耗资源,
    程序一开始就要初始化它,而后程序执行过程中,可能没有用.)
    适用
    当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。
    当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。

###2工厂模式


####2.1工厂方法模式
 >定义一个用于创建对象的接口,让子类决定实例化哪一个类,工厂方法使一个类的实例化延迟到其子类

  ![](/img/Factory.jpg)

    使用场景
     1日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
     2数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
     3设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
    适用
    当一个类不知道它所必须创建的对象的类的时候。

    当一个类希望由它的子类来指定它所创建的对象的时候。

    当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。


####2.2抽象工厂模式

 >提供一个创建一系列相关或者相互依赖的对象接口,而无需指定它们具体的类

  ![](/img/AbstractFactory.jpg)

     使用场景
     一个系统要独立于它的产品的创建、组合和表示时。

     一个系统要由多个产品系列中的一个来配置时。

     当你要强调一系列相关的产品对象的设计以便进行联合使用时。

     当你提供一个产品类库，而只想显示它们的接口而不是实现时。

     0. 工厂方法分简单工厂(事实上不是23种设计模式),多个工厂方法模式和静态工厂,在普通工厂方法模式中，如果传递的字符串出错，则不
     能正确创建对象,而多个工厂方法模式是提供多个工厂方法，分别创建对象。静态工厂模式,把多个工厂方法模式里的方法置为静态的，不需
     要创建实例，直接调用即可
     1. 工厂用来处理创建对象的细节.解决的问题是,对象的初始化经常造成耦合,工厂模式主要处理复杂的依赖.
     2. 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则.抽象
     工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码.

     3.工厂方法和抽象工厂的区别
     3.1工厂方法使用继承,把对象的创建委托给子类,子类实现工厂方法来创建对象.抽象工厂使用对象组合,对象的创建被实现在工厂接口暴露
      出来的方法中
     4.工厂方法和抽象工厂的优缺点
     4.1工厂方法
     4.1.1优点,易于添加新的产品,相比较简单工厂符合开-闭原则.
     4.1.2缺点,新产品的添加,需要新建大量的类,客户端部分仍然违反开闭原则
     4.2抽象工厂
     4.2.1优点,分离了具体的类,工厂封装了创建产品对象的责任和过程,将客户端和类的实现分离,通过抽象接口操纵实例
              易于交换产品系列,一个具体的工厂类在一个应用中只有初始化时出现.
              有利于产品的一致性,一个系列的产品中的产品对象被设计成一起工作时,一个应用只能同时使用同一系列的对象
     4.2.2缺点,难以支持新种类的产品,抽象工厂接口确定了可以被创建的产品集合,新种类的产品加入需要扩展抽象工厂接口,这就涉及所有实现
              类的改变
     反射技术可以改变客户端违反开闭原则的问题.

###建造者模式
>将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

 ![](/img/Builder.jpg)

     适用

     当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
     当构造过程必须允许被构造的对象有不同的表示时。
     与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。

     适用场景
     1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。
     2、JAVA 中的 StringBuilder。
     3.一些基本部件不会变，而其组合经常变化的时候。

     建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。(可以理解为导演指导演员去演戏,
     导演管理着演员,演员去演戏)

###原型模式

>用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

![](/img/Prototype.jpg)

    应用场景
    1、细胞分裂。 2、JAVA 中的 Object clone() 方法。

    适用性：
    当要实例化的类是在运行时刻指定时，例如，通过动态装载；或者

    为了避免创建一个与产品类层次平行的工厂类层次时；或者

    当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。

 **所谓原型模式,就是依托一个已经实例化的对象去创建另外一个可以进行定制的对象,而不需要知道创建过程中的具体细节**

    原型模式的优点
    使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，
    它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
    使用原型模式的另一个好处是简化对象的创建，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。
    因为以上优点，所以在需要重复地创建相似对象时可以考虑使用原型模式。比如需要在一个循环体内创建对象，
    假如对象创建过程比较复杂或者循环次数很多的话，使用原型模式不但可以简化创建过程，而且可以使系统的整体性能提高很多。

**使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，
因此不会调用到类的构造方法。不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。还记得单例模式吗？单例模式中，
只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的
，在使用时要特别注意。
深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。**


##结构型

###桥接模式


>将抽象部分与它的实现部分分离，使它们都可以独立地变化。

![](/img/Bridge.jpg)

     适用性：

     你不希望在抽象和它的实现部分之间有一个固定的绑定关系。例如这种情况可能是因为，在程序运行时刻实现部分应可以被选择或者切换。

     类的抽象以及它的实现都应该可以通过生成子类的方法加以扩充。这时Bridge 模式使你可以对不同的抽象接口和实现部分进行组合，
     并分别对它们进行扩充。

     对一个抽象的实现部分的修改应对客户不产生影响，即客户的代码不必重新编译。


**合成与聚合**

         尽量使用合成与聚合,不要使用继承.
         合成:表示一种强的"拥有",是严格意义的部分和整体的关系.聚合表示一种弱"拥有关系"比如对象A可以包含对象B,
         但对象B不一定是A的一部分.
         合成一个重要的特点是,部分和整体具有相同的生命周期.


 桥连接模式的抽象与实现分离,实现是指抽象类和派生类用来实现自己的对象,桥连接适用于多重分类并且每种分类都需要独立变化.

##适配器模式

>将一个类的接口转换成客户希望的另一个接口

 ![](/img/Adapter.jpg)


    主要用在系统的后期维护,和第三方组件与系统接口不同.

    应用场景
    1、美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。
    2、JAVA JDK 1.1 提供了 Enumeration 接口，而在 1.2 中提供了 Iterator 接口，想要使用 1.2 的 JDK，
    则要将以前系统的 Enumeration 接口转化为 Iterator 接口，这时就需要适配器模式。
    3、在 LINUX 上运行 WINDOWS 程序。
    4、JAVA 中的 jdbc。

    优点： 1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。
    缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，
    其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，
    可以不使用适配器，而是直接对系统进行重构。
    2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。

 ##装饰模式
 >动态的给对象添加一些额外的职责,就增加功能来说,装饰模式比生成子类更为灵活.(子类方式无法在程序运行中添加职责)

 ![](/img/Decorator.jpg)

   jdk中的I/O用的就是装饰者模式


 ##组合模式

 >将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

 ![](/img/Composite.jpg)

       优点： 1、高层模块调用简单。 2、节点自由增加。
       缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
       使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
       注意事项：定义时为具体类。









