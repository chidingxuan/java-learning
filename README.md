# Java 后端实习速通（7 天）

## 背景与目标

- 下周去南京润内克西信息科技有限公司做后端实习；据公司自述，技术栈为 Java/J2EE/SSM/JSP + Tomcat，数据库 MySQL/Oracle/SQL Server，团队后端 Java 约 5 人。
- 目标不是"七天学完 Java"，而是入职后能：看懂一个请求从接口到数据库的调用链；在指导下改接口、修简单 Bug、写基础 SQL；用 IDE 调试并验证修改。
- 起点：Python / FastAPI 已熟，Java 零基础 —— 全部内容按"从 Python 迁移"的方式讲。

## 七天路线（每天 5～6 小时）

| 天 | 主题 | 产出 |
|---|---|---|
| D1 | Java 语法 + IDE 调试 | 客户管理控制台（List<Customer> 增删改查 + 空指针断点定位） |
| D2 | SQL 与 JDBC | customer/orders 两表查询、新增订单、PreparedStatement |
| D3 | Spring Boot 与接口 | 把客户管理改成 REST 接口，Controller→Service→DAO 分层 |
| D4 | MyBatis | 用 Mapper 替换 JDBC，模糊查询 + 订单列表 |
| D5 | 老项目阅读（SSM/JSP/Tomcat） | 从浏览器请求追到 Controller→Service→SQL→JSP |
| D6 | 测试、排错、Git | 修两个预设 Bug + 加"按日期查订单" |
| D7 | 闭卷模拟入职 | 建项目→加接口→接 SQL→修异常→curl 验证→看 diff |

## 环境

- OpenJDK 17.0.21.0.3（Homebrew，`/opt/homebrew/opt/openjdk@17/bin`）已可用
- VS Code + Java 扩展包（vscjava.vscode-java-pack / java-debug / java-dependency / java-test）
- 缺 `redhat.java`（Language Support for Java）：装上之前**没有补全和语法提示**
- Maven 尚未安装（D3 之前装）

## 进度

- [x] lesson01-java-basics：`Main.java` 编译运行通过，输出「小明学习Java第1天」
- [x] 装 `redhat.java`（1.58.0，自带 JRE）
- [x] lesson02-customer-console：`Customer` 类（字段/构造/toString）+ `List<Customer>` + 四个方法（内联 add、`findByID`、`updatePhone`、`remove`）+ 空指针判空
- [ ] D1 补：VS Code 断点调试实操、字段改 `private` + getter
- [ ] D2 SQL/JDBC（用系统自带 sqlite3 练，公司实际是 MySQL/Oracle）

## 目录约定

每节课一个独立文件夹：`lessonNN-主题/`，源码放在里面，不跨课混放。

## 交接说明

- 本目录由 DSH 会话（session-c9c08287…）从 Kimi Code 会话 `session_8eb4ab4b-2823-48c9-8b38-d95f835b16f1`（工作区 `Desktop/kimi/kimi学习`）接手后建立，原目录保留不动。
- 接手时间：2026-10-29。
