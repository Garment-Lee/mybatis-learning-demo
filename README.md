# mybatis-learning-demo
mybatis框架的使用demo，主要是使用xml配置的方式。这个项目时使用Maven构建的，依赖库都是配置在pom.xml文件中。

## 技术点

### 1、依赖库配置<br>
使用的依赖库有mybatis依赖库、mysql依赖库、单元测试依赖库、log4j依赖库，这几个依赖库都是在pom.xml中配置。

### 2、多个接口参数的使用

1）使用JavaBean
可以创建一个JavaBean类，所有的参数作为类的成员，成员变量的名称和xml中SQL使用的参数值名称一致，接口中传递参数时传递的是JavaBean对象。

2）使用Map类型作为参数
在Map中通过key来映射xml中SQL使用的参数值名称，value用来存储值，多个参数时，使用Map的key-value方式传递参数。

3）使用@Param注解
给接口参数添加@Param注解之后，MyBatis会自动将参数封装成Map类型，@Param注解值会作为Map的key，即注解值要与映射xml中SQL使用的参数值名称相同。

在demo中使用的是第三种方法。

### 3、高级结果映射之嵌套映射

1）自动映射处理一对一关系，包括嵌套映射(使用别名)

2）使用resultMap配置一对一映射（包括嵌套映射）

3)使用resultMap的association标签配置一对一映射

4)association标签的嵌套查询

