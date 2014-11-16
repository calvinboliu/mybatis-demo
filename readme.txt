mybatis缓存：
一级缓存：就是SqlSession级别的缓存，session一旦close或flush，或进行了增删改，则缓存清空。默认是开启的。
二级缓存：映射文件中的<cache/>标签，默认是关闭的。