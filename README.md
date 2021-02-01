### JDK1.8源码分析

------

相关的源码分析结果会以注解的形式体现到源码中

#### 已完成部分：

- [x] ReentrantLock   [逐行源码分析AbstractQueuedSynchronizer(AQS)中ReentrantLock的源码实现](http://www.zcswl7961.com/index.php/2020/12/03/abstractqueuedsynchronizer/)
- [x] CountDownLatch [逐行源码分析AbstractQueuedSynchronizer(AQS)中CountDownLatch的源码实现](http://www.zcswl7961.com/index.php/2020/12/09/aqs-countdownlatch/)
- [x] Semaphore [逐行源码分析AbstractQueuedSynchronizer(AQS)中Semaphore的源码实现](http://www.zcswl7961.com/index.php/2020/12/09/aqs-semaphore/)
- [x] HashMap [Java包-HashMap](https://www.processon.com/view/link/60139ed4079129652cdf9c93)
- [x] TreeMap [Java包-TreeMap](https://www.processon.com/view/link/60139ed4079129652cdf9c93)
- [x] LinkedHashMap [Java包-LinkedHashMap](https://www.processon.com/view/link/60139ed4079129652cdf9c93)
- [x] ConcurrentHashMap [Java包-ConcurrentHashMap](https://www.processon.com/view/link/60139ed4079129652cdf9c93)
- [x] Executor [线程池](https://www.processon.com/view/link/60139f617d9c08426cf87106)
- [x] ThreadPoolExecutor [线程池-ThreadPoolExecutor](https://www.processon.com/view/link/60139f617d9c08426cf87106)
- [x] ScheduledThreadPoolExecutor [线程池-ScheduledThreadPoolExecutor](https://www.processon.com/view/link/60139f617d9c08426cf87106)
- [x] ArrayList [Java包-ArrayList](https://www.processon.com/view/link/60139f617d9c08426cf87106)
- [x] LinkedArrayList [Java包-LinkedList](https://www.processon.com/view/link/60139f617d9c08426cf87106)
- [x] Queue 

  |                        | 抛异常      | 不抛异常   | 阻塞     | 超时                         |
  | ---------------------- | ----------- | ---------- | -------- | ---------------------------- |
  | 插入[队列尾部]         | add(E e)    | offer(E e) | put(E e) | offer(E e,timtout, timeunit) |
  | 移除（删除）[队列头部] | E remove()  | E poll()   | take()   | poll(timeout, timeunit)      |
  | 检查                   | E element() | E peek()   | 无       | 无                           |

  Queue：单向队列

  Deque：双端队列

  |          | 抛异常        | 不抛异常        | 阻塞          | 超时                                |
  | -------- | ------------- | --------------- | ------------- | ----------------------------------- |
  | 插入头部 | addFirst(E e) | offerFirst(E e) | putFirst(E e) | offerFirst（E e,timeout, timeunit） |
  | 插入尾部 | addLast(E e)  | offerLast(E e)  | putLast(E e)  | offerLast（E e,timeout, timeunit）  |
  | 移除头部 | removeFirst() | pollFirst()     | takeFirst()   | pollFirst(timeout,timeunit)         |
  | 移除尾部 | removeLast()  | pollLast()      | takeLast()    | pollLast(timeout,timeunit)          |
  | 检查头部 | getFirst()    | peekFirst()     | 无            | 无                                  |
  | 检查尾部 | getLast()     | peekLast()      | 无            | 无                                  |