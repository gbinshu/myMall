# myMall
1.创建myMall并测试myMall和数据库的连接

2.使用通用mapper。
    - 配置pom依赖；
    - 配置mapper继承tk.mybatis的mapper；
    - 配置mapper对应bean的主键返回策略id和generatedValue；
    - 配置启动类扫描器tk.mapper的MapperScan。

3.根据外键进行查询；使用example进行查询

4.搭建parent模块（统一管理依赖版本号），子模块pom继承parent模块
