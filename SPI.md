
## SPI
- 没有用JDK SPI，重写了SPI
- 可以按需加载接口实现类，而不是全部加载
- 增加了AOP和IOC的特性

## 测试代码
- org.jim.spi

## 源码分析
- 模块：common
- 包：org.apache.dubbo.common.extension

技术文章：http://dubbo.apache.org/zh-cn/docs/source_code_guide/dubbo-spi.html

## 实现类
- ExtensionLoader

