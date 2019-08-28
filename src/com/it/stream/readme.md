#### 1.parallelStream方法内部要使用线程安全的集合和类。

#### 2.什么时候要用stream或者parallelStream呢？可以从以下三点入手考虑.  
       1.是否需要并行？  
       2.任务之间是否是独立的？是否会引起任何竞态条件？  
       3.结果是否取决于任务的调用顺序？
       
#### 3.什么是竞态条件&临界区
答：当两个线程竞争同一资源时，如果对资源的访问顺序敏感，就称存在竞态条件。  
导致竞态条件发生的代码区称作临界区。上例中ArrayList的add()方法就是一个临界区,它会产生竞态条件。  
在临界区中使用适当的同步就可以避免竞态条件。

#### 4.CountDownLatch、CyclicBarrier和Semaphore
CountDownLatch类位于java.util.concurrent包下，利用它可以实现类似计数器的功能。比如有一个任务A，它要等待其他4个任务执行完毕之后才能执行，此时就可以利用CountDownLatch来实现这种功能了。  
CountDownLatch类只提供了一个构造器：  
public CountDownLatch(int count) {  };  //参数count为计数值    
然后下面这3个方法是CountDownLatch类中最重要的方法：  
1.public void await() throws InterruptedException { };   //调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行  
2.public boolean await(long timeout, TimeUnit unit) throws InterruptedException { };  //和await()类似，只不过等待一定的时间后count值还没变为0的话就会继续执行  
3.public void countDown() { };  //将count值减1

#### 5.java8四大函数式接口  
Consumner ： 消费型接口   有入参
Supplier ：供给型接口     有返回值
Function：函数式接口      既有入参又有返回值
Predicate：断言型接口     有入参返回值为boolean