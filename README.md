---
title：Zero 中文教程
---

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.vertxup/vertx-zero/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/cn.vertxup/vertx-zero/)  [![Apache License 2](https://img.shields.io/badge/license-ASF2-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)  [![Build Status](https://travis-ci.org/silentbalanceyh/vertx-zero.svg?branch=master)](https://travis-ci.org/silentbalanceyh/vertx-zero)

> 云原生版本在重新制作和开发，所以以前规划的 Zero Ui 和 Zero Extension框架文档全部转移到云端白皮书中：
>
> * [《Zero云平台白皮书》](https://www.vertx-cloud.cn/document/doc-web/index.html)
>
> 后续所有和工程开发强相关的教程部分会直接转移到白皮书中进行介绍，中文教程中不再提供，白皮书中包括工程规范、环境搭建、运维部署、开发技巧、配置实施手册等全方位开发手册。

# 0.楔子

Zero，又称为：“零”，最初的名字起源于高达W中的“飞翼零式”，其实那时想写个框架，最好是：零编码、零配置、零BUG——也许这只是个遥远的梦。从正式官方网站的英文教程问世后，就再也没有更新过教程了，于是重新开启“零”的大门，只是我依旧在尝试将教程写得更加梦幻，最初的落笔点就是名字，包括项目名字、章节名字。

# 1. 资源

Zero相关的资源表

- （后端）Zero Ecotope：<https://www.zerows.io>
- （前端）Zero UI：<https://www.vertxui.cn>
- （工具）Zero AI：<https://www.vertxai.cn>
- （标准、白皮书）Zero Schema：<https://www.vertx-cloud.cn>

Zero公众号（申请微信群先加微信号：445191171）：

![](./_image/2020-03-07/2020-03-07-13-24-07.jpg)

如果您喜欢Zero，帮忙点个Star，谢谢：

* GitHub：<https://github.com/zero-ws/zero-ecotope>
* Gitee：<https://gitee.com/zero-ws/zero-ecotope>

# 2. 教程

> 我一直在思考使用什么样的方式来写教程，如果告别了曾经那种概念，是不是会写成空中楼阁一样只有代码和“招式”的东西，沉淀下来，还是简单点吧（图、代码、解说一步到位），不过项目名称还是沿用希腊神话中的诸神之名，含义为：以诸神之名开启零之誓约。

Zero目前的版本中仅支持Maven，最新版为`1.0-SNAPSHOT`，一直以`0`前缀做版本号，是因为我在收集生产环境的运行数据，当然我希望它的`1.0`是经过了生产环境验证的框架，成为一个真正可用的框架，而不是简单的样子货而已。

## 环境

在您的Maven项目的 `pom.xml` 文件中引入以下配置：

```xml
<!-- 1.0-SNAPSHOT -->
<dependency>
    <artifactId>zero-ams</artifactId>
    <groupId>io.zerows</groupId>
    <version>${ZERO_VERSION}</version>
</dependency>
```

> 您可以使用最新版，支持JDK 17，1.0-SNAPSHOT 版本。

**特殊说明**：写这套教程的过程中，我会验证所有的演示代码，验证过程的BUG以及最新的版本会在[BUG表](document/bug.md)
中公布，不过由于教程先于框架，最终的框架版本以主页的最新版为主，而正文中所有的版本号都是写教程时的版本号。

然后书写主程序：

```java
package cn.vertxup;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

@Up
public class ApolloUp {

    public static void main(final String[] args) {
        VertxApplication.run(ApolloUp.class);
    }
}
```

启动该程序，您将在控制台看到如下信息，就证明Zero系统成功启动：

```shell
[ ZERO ] ( Http Server ) ZeroHttpAgent Http Server has been started successfully. 
         Endpoint: http://198.18.21.28:6083/.
```

**最新版模块**

最新版模块以Zero开发中心**模块化**后的功能表（包含前后端）：

![](./_image/2022-03-27-15-19-02.png)

# 3. 教程（Zero）

## 零之遥（Απόλλων）

> Zero Framework

* [1.1.启航：Zero](document/zero/001.first.md)
* [1.2.曲径通幽：@Path](document/zero/002.uri.md)
* [1.3.四叶葎：Http方法](document/zero/003.method.md)
* [1.4.思无邪：入参](document/zero/004.param.md)
* [1.5.孤城暗雪：验证](document/zero/005.validation.md)
* [1.6.潘多拉魔盒：异步](document/zero/006.async.md)
* [1.7.珠玉在侧：容错](document/zero/007.error.md)
* [1.8.铁马冰河：细谈Worker](document/zero/008.worker.md)
* [1.9.虚之墙：安全](document/zero/009.security.md)
* [1.10.珷玞：Jooq](document/zero/010.jooq.md)
* [1.11.笙歌散：JSR330/JSR340](document/zero/011.jsr330.md)
* [1.12.阡陌：Ux编排](document/zero/012.function.md)
* [1.13.始源之地：Vert.x集成](document/zero/013.native.md)
* [1.14.俯瞰：配置地图](document/zero/014.configuration.md)
* [1.15.鼚乎：Shell](document/zero/015.devops.md)
* [1.16.二向箔：Excel](document/zero/016.excel.md)
* [1.17.隐匿者：Job](document/zero/017.job.md)
* [1.18.天下：集成](document/zero/018.integration.md)
* [1.19.冰刀：部署](document/zero/019.deployment.md)

## 花撷（Συλλογή λουλουδιών）

> Java Programming，带 * 号章节可能超纲，您可以等到整体章节完成后再回头来阅读。

* 2.1.漆木：基础
  * [01.环境变量](/document/java-programming/ch001/01.environment.md)
  * [02.JDK](/document/java-programming/ch001/02.jdk.md)
  * [03.命令工具](/document/java-programming/ch001/03.command.md)
  * [04.入口](/document/java-programming/ch001/04.entry.md)
  * [05.类加载器 *](/document/java-programming/ch001/05.cl.md)
  * [06.注释 & 文档](/document/java-programming/ch001/06.comment.md)

## 氷る世界（Ψυχρός κόσμος）

> Aeon System

* [4.1.贪婪岛：Aeon](document/zero-cloud/001.aeon.md)
* [4.2.盖亚：Ceph](document/zero-cloud/002.ceph.md)
* [4.3.零步进：Harbor](document/zero-cloud/003.harbor.md)
* [4.4.执子之手：Ceph RBD](document/zero-cloud/004.rbd.md)

# COPYRIGHT IN CHINA




