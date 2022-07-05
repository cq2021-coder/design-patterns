**本项目是学习大话设计模式时的笔记**

**本项目用的是Java编程语言，版本为jdk17所以语法可能会有所不同**

1. 简单工厂：适用于单纯解决对象创建的问题

2. 策略模式：一种定义一系列算法的方法，所有的方法完成的都是相同的工作，只是实现不同，他可以以相同的方式调用所有的算法，减少了各种算法类与使用算法之间的耦合单纯的策略模式需要在客户端处理对象的创建，所以和简单工厂结合，即让选择实现的职责交给Context去处理，减轻客户端的职责

3. 单一职责原则：就一个类而言，应该仅有一个引起他变化的原因。
   - 如果一个类承担的职责过多，就相当于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力，所以当变化发生时，设计就会遭受到意想不到的破坏，也就是咱们常说的改一个bug，出现三个bug。
   - 而我们真正要做的就是发现那些职责并将职责分离
   
4. 开放-封闭原则：软件实体（类、模块、函数等）应该可以扩展，而不可修改，即对于扩展是开放的，对于修改是封闭的。
   - 无论模块多么封闭，总会存在一些无法对其封闭的变化，设计人员则需要对哪种变化进行封闭进行选择，必须要推测出最有可能发生的变化种类，然后构造抽象隔离那些变化
   - 查明可能发生的变化所等待的时间越久，创建正确的抽象就越困难，所以说尽量不要写屎山代码，否则重构都很难扭转这代码是坨翔的事实
   - 遵循这个原则可以实现可维护，可扩展，可复用，灵活性好，但对于开发人员而言，其实最重要的是对那些频繁变化的部分进行抽象，如果程序中每个部分都刻意抽象，那将是一场灾难，拒绝不成熟的抽象和抽象本身一样重要
   
5. 里氏代换原则：子类型必须能够替换掉他们的父类型。
   - 在软件中，把父类都替换成它的子类，程序的行为没有变化
   - 只有当子类可以替换掉父类，且软件单位的功能不受到任何影响，父类才能真正被复用，而子类也能在父类的基础上增加新的行为
   
6. 依赖倒置原则：抽象不应该依赖于细节，细节应该依赖于抽象（面对抽象编程，不要面对实现编程）
   1. 高层模块不应该依赖底层模块。两个都要依赖抽象。
   2. 抽象不应该依赖细节，细节应该依赖抽象
   3. 程序中所有的依赖关系都是终止于抽象类或者接口，这就是面向对象的设计，反之则为过程化的设计
   
7. 装饰模式：动态的给一个对象添加一些额外的职责，在增加功能方面，装饰模式比生成子类更为灵活
   - 装饰模式是为已有功能动态的添加更多功能的一种方式
   - 当系统需要新功能时，向旧的类中添加新的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为
   - 如果新加入的功能仅仅是为了满足一些只在特定环境下执行的功能，那么使用装饰器功能包装原有的对象，当出现特殊情况时，可以有选择性，有顺序性的包装对象了
   - 有效的把类的核心职责和装饰功能分离开
   
8. 代理模式：为其他对象提供一种代理以控制这个对象的访问。
   - 远程代理：为一个对象在不同的地址空间提供局部代表。可以隐藏一个对象存在于不同地址空间的事实
   - 虚拟代理：根据需要创建开销很大的对象，通过代理来存放实例化需要很久的真实对象，比如说打开一个网页，里面的图片或视频等比较大的对象，就会用一个图片框来占用这个位置，等待图片或视频加载完毕，这样的话网站打开的速率以及效率将提高很多
   - 安全代理：控制真实对象访问时的权限
   - 智能指引：当调用真实的对象时，代理处理另外一些事，比如说计算真实对象的引用次数，在没有引用时可以释放掉此对象，或者是根据使用情况将对象放入JVM的不同区域（Java）。
   
9. 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
   - 工厂方法把简单工厂的内部判断逻辑移到了客户端代码来进行，在简单工厂中是修改工厂类，而工厂方法则需要修改客户端代码。
   - 为什么要用工厂方法：简单工厂违背了开放-封闭原则，将判断逻辑移到客户端后，即为工厂模式，这样就能遵循开放-封闭原则。
   
10. 原型模型：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
    - 利用一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节。
    - 不重新初始化对象，而是动态的获得对象运行时的状态。
    - 浅复制：被复制对象的所有变量都含有与原来对象相同的值，但不复制引用的对象。
    - 深复制：不光复制对象的所有变量，还会复制引用的对象。（在Java中好像类的复制都是深复制，这一点我还没搞清楚，打个标记，以后研究一下）。
    
11. 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
    - 模板方法模式提供了一个很好的代码复用平台，通过把不变行为搬移到超类，去除子类中的重复代码。
    - 要完成在某一细节层次一致的一个过程或一系列步骤，但其个别步骤在更详细的层次上的实现可能不同时，我们通常考虑用模板方法模式去处理。
    
12. 迪米特法则：也叫做最少知识原则，如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用。
    - 根本思想是强调了类之间的松耦合。
    - 类之间的耦合越弱，越有利于复用，一个处在弱耦合的类被修改，不会对有关系的类造成波及。
    
13. 外观模式：为子系统中的一组接口提个一个一致的界面，此模块定义了一个高层接口，这个接口是的这一子系统更加容易使用
    1. 设计初期阶段，应该要有意识的将不同的两个层分离，就比如经典的三层架构，就需要在数据访问层和业务逻辑层，业务逻辑层和表示层的层与层之间简历外观Facade，这样可以为复杂的子系统提供一个简单的接口，使得耦合程度降低。
    2. 大多数模式在使用过程中会产生很多小的子类，虽然是好事，但是外部调用时带来了使用上的困难，增加外观Facade可以提供一个简单的接口，减少他们之间的依赖。
    3. 在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了，但因为它包含非常重要的功能，新的需求开发必须依赖于它。此时使用外观模式是十分合适的。可以为新系统开发一个外观Facade类，用于提供设计粗糙或者高度复杂的遗留代码的比较清晰简单的接口，让新系统与Facade对象交互，Facade与遗留代码交互所有复杂的工作。
    
14. 建造者模式：将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示。
    - 建造者模式（又称生成器模式），可以将一个产品的内部表象与产品的生成过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
    - 用户只需要制定需要建造的类型就可以得到它们，而具体建造的过程和细节就不必知道。
    
15. 观察者模式：也叫做发布-订阅模式，此模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，使它们能够自动更新自己。
    - 将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间的一致性，我们不希望为了维护性而使得各类紧密耦合，而观察者模式的的关键对象是Subject和Observe，一个Subject可以有任意数量依赖于这个Subject的Observe，一旦Subject的状态发生了改变，所有的Observe都可以得到通知。
    - 观察者模式所做的工作其实就是在解除耦合，让耦合的双方都依赖于抽象，而不是依赖于具体，从而使得各自的变化都不会影响另一边的变化。
    
16. 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
    - 便于交换产品系列，由于具体工厂类在一个应用中只需要在初始化的时候出现一次，这就使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。
    - 可以让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分别库，不会出现在客户代码中。
    - 所有在用简单工厂的地方，都可以考虑用反射去除if和switch，解除分支判断带来的耦合。
    
17. 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来好像是改变了这个类。
    - 当控制一个对象状态转换的条件表达式过于复杂时，把状态的判断逻辑转移到不同状态的一系列类中，可以将复杂的判断逻辑简化。
    - 将与特定状态相关的行为局部化，并且将不同状态的行为分割开来。
    - 将特定的状态相关的行为都放入一个对象中
    - 目的是消除庞大的分支条件分支语句
    - 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式了
    
18. 适配器模式：将一个类的接口转换成客户端希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以可以一起工作。
    - 系统的数据和行为都正确，但是接口不符时，应该考虑使用适配器。
    - 目的是使控制范围之外的一个原有对象与某个对象匹配。
    - 希望复用一些现存的类，但是接口由于复用环境要求不一致的情况。
    
19. 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态，这样以后就可以将对象恢复到原先保存的状态。
    - 适用于功能比较复杂，但是需要维护或记录历史的类，或者需要保存的属性知识众多属性中的一小部分。
    - 使用备忘录可以把复杂的对象内部信息对其他的对象屏蔽起来。
    - 当角色的状态改变的时候，有可能这个状态无效，这个时候就可以使用暂时存储起来的备忘录将状态复原。
    
20. 组合模式：将对象组合成树形结构以表示'部分-整体'的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。

    ​	当需求中是体现部分与整体层次的结构时，以及希望用户可以忽略组合对象与单个对象的不同，统一的使用组合结构中的所有对象时，就应该考虑用组合模式了。

21. 迭代器模式：提供一种方法顺序访问一个聚合对象中各个元素，而不是暴露对象的内部表示。

    - 当需要一个聚集对象，而且不管这些对象是什么都需要遍历的时候，就应该考虑迭代器模式。
    - 需要为遍历不同的聚集结构提供如开始、下一个、是否结束、当前哪一项等统一的接口。

22. 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

    1. 将该类的实例化方法私有化来防止程序通过其他方式创建该类的实例。

    2. 提供一个全局唯一获取该类实例的方法帮助用户获取类的实例。

    3. 用户只需调用该方法获取类的实例。

       单例模式的设计保证了一个类在整个系统中同一时刻只有一个实例存在。单例模式的常见写法有懒汉模式（ 线程安全）、饿汉模式、静态内部类、双重校验锁。

23. 合成/聚合复用原则（CARP）：尽量使用合成/聚合。尽量不要使用类继承。

    - 聚合表示一种弱的拥有关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分。
    - 合成则是一种强的拥有关系，体现了严格的部分和整体的关系，部分和整体的生命周期一样。
    - 优先使用合成/聚合将有助于保持每个类被封装，并被集中在单个任务上。这样类和类继承层次会保持较小规模，并且不太可能增长为不可控制的庞然大物。

24. 桥接模式：通过抽象及其实现解耦，使二者可以根据需求独立变化。

    - 桥接模式主要用于解决需求多变的情况下使用继承造成类爆炸的问题，扩展起来不够灵活。可以通过桥接模式将抽象部分与实现部分分离，使其能独立变化而相互之间的功能不受影响。具体做法是通过定义一个桥接接口，使得实体类的功能独立于接口实现类，降低它们直接的耦合度。
    - 常用的JDBC和DriverManager就使用了桥接模式，JDBC在连接数据库的时候，在各个数据库之间进行切换而不需要修改代码，因为JDBC提供了统一的接口，每个数据库都提供了各自的实现，通过一个叫做数据库驱动的程序来桥接即可。

25. 命令模式：将一个请求封装为一个对象，从而使你可以使用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。

    1. 可较容易的设计一个命令队列。
    2. 在需要的情况下，可以较容易的将命令记入日志。
    3. 允许接收请求的一方决定是否要否决请求。
    4. 较容易的实现对请求的撤销和重做。
    5. 由于加进新的具体命令类不影响其他的类，因此增加新的具体命令类很容易。

26. 职责链模式：
