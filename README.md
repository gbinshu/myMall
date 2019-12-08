# myMall
1.创建myMall并测试myMall和数据库的连接

2.使用通用mapper。
    - 配置pom依赖；
    - 配置mapper继承tk.mybatis的mapper；
    - 配置mapper对应bean的主键返回策略id和generatedValue；
    - 配置启动类扫描器tk.mapper的MapperScan。

3.根据外键进行查询；使用example进行查询

4.搭建parent模块（统一管理依赖版本号），子模块pom继承parent模块

5.在parent模块中定义好项目的技术框架版本

6.创建api子模块,提供接口(XXXService)和bean文件,并修改之前文件中bean的引入路径

7.抽取util工程。
    - 项目的通用框架commonUtil，是所有应用工程需要引入的包（例如：springboot、common-langs、common-beanutils等）；
    - 项目web前端controller-->webUtil（例如：jsp、thymeleaf、cookie工具类等）；
    - 项目后端service-->serviceUtil（例如：mybatis、mysql、redis等）。
    Controller=parent+api+webUtil（包含commonUtil）；
    Service=parent+api+serviceUtil（包含commonUtil）。

