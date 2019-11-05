
# 品优购(IDEA版)-第一天
品优购IDEA版应该是2019年的新项目。目前只有视频。资料其他都还是旧的。

## 1.学习目标

1：了解电商行业特点以及理解电商的模式 
2：了解整体品优购的架构特点 
3：能够运用 Dubbo+SSM 搭建分布式应用 
4：搭建工程框架，完成品牌列表后端代码

## 2. 电商概述

## 3. 品优购需求分析与设计

### 3.1. 品优购简介 

品优购商城主要分为网站前台、网站后台、商家后台三类系统。

#### 3.1.1. 网站前台 
主要包括网站首页、商家首页、商品详情、搜索、会员中心、订单与支付相关页面、秒杀频道等。 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102231332790.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
#### 3.1.2. 网站后台 
运营该电商平台的运营人员的管理后台。 主要包括商家审核、品牌管理、规格管理、模板管理、商品分类管理、商品审核、广告类型管理、广告管理、订单查询、商家结算等。 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102231508701.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
#### 3.1.3. 商家管理后台 
加入了该电商平台的商家进行管理的后台，主要功能是对商品的管理以及订单查询统计、资金结算等功能。 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102231656346.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

### 3.2. 系统架构 
#### 3.2.1. SOA 架构 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102232507573.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102233047842.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
#### 3.2.2. 品优购架构分析 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102232546185.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
### 3.3. 数据库表结构 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102232712723.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110223273352.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
### 3.4. 项目框架 
品优购采用当前流行的前后端分离架构。后端框架采用 Spring + Spring MVC + 
Mybatis +Dubbo。前端采用 angularJS + Bootstrap。 

## 4. 分布式服务框架 Dubbo 
### 4.1. DUBBO 简介 

> DUBBO 是一个分布式服务框架，致力于提供高性能和透明化的 RPC 远程服 务调用方案，是阿里巴巴
> SOA（Service-Oriented Architecture,SOA，面向服务架构） 服务化治理方案的核心框架，每天为
> 2,000+个服务提供 3,000,000,000+次访问量
> 支持，并被广泛应用于阿里巴巴集团的各成员站点。官网地址：http://dubbo.io/

#### 4.1.1 DUBBO 架构
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102233141136.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
**节点角色说明：** 
| 英文名 | 节点角色说明  |
|--|--|
| Provider |暴露服务的服务提供方。  |
| Consumer|调用远程服务的服务消费方。   |
| Registry|服务注册与发现的注册中心。   |
| Monitor|统计服务的调用次调和调用时间的监控中心。   |
| Container|服务运行容器。   |

**调用关系说明：** 

0. 服务容器负责启动，加载，运行服务提供者。 
1. 服务提供者在启动时，向注册中心注册自己提供的服务。 
2. 服务消费者在启动时，向注册中心订阅自己所需的服务。 
3. 注册中心返回服务提供者地址列表给消费者，如果有变更，注册中心将基于长
连接推送变更数据给消费者。 
4. 服务消费者，从提供者地址列表中，基于软负载均衡算法，选一台提供者进行
调用，如果调用失败，再选另一台调用。 
5. 服务消费者和提供者，在内存中累计调用次数和调用时间，定时每分钟发送一
次统计数据到监控中心。 
 

> 【软负载均衡】软件负载均衡则是通过在服务器上安装的特定的负载均衡软件或是自带负载均衡模块完成对请求的分配派发。如：轮询法、随机法、源地址哈希 法、最小连接数法等。在消费方中声明服务的时候可以指定负载均衡的策略， dubbo 在返回的服务地址列表中使用负载均衡策略选择一个服务地址；默认是使 用随机法。

### 4.2. 注册中心 zookeeper 
#### 4.2.1. zookeeper 简介 
官方推荐使用 zookeeper 注册中心。注册中心负责服务地址的注册与查找，相当于目录服务，服务提供者和消费者只在启动时与注册中心交互，注册中心不转发请求，压力较小。 

zookeeper 是 Apacahe Hadoop 的子项目，是一个树型的目录服务，支持变更推送，适合作为 Dubbo 服务的注册中心，工业强度较高，可用于生产环境。
 
zooKeeper 用来做 dubbo 的注册中心，也即哪一个服务由哪一台机器来提供
必需让调用者知道，简单来说就是 ip 地址和服务名称的对应关系。 

#### 4.2.2. 准备 Linux 环境
导入的虚拟机必须设置 ip 为 192.168.25.168 才可以使用 FastDFS(后面的课程会
用)；如果虚拟机不是 25 网段，需要手动设置网段，设置方式如下图： 

> 因为除了只有视频是新的，软件资源其实都还是旧的，所以其实是需要使用25网段

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102235048392.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191102235814135.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
#### 4.2.3. VMWare 中打开虚拟机 
找到下发的虚拟机文件夹“pinyougou”；导入 VMWare 内，步骤如下： 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000011432.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
如果出现弹出框；那么选择 我已移动该虚拟机 

#### 4.2.4. 启动虚拟机 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000043738.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
上述安装的 CentOS7 64 位系统； 
帐号：root，密码：itcast
 
【注意】如果启动后无法在 windows 中使用工具连接（systemctl start 
network.service 命令可以查看状态）；那么可以在 centos 中重启网络；输入如下
命令： 
systemctl stop NetworkManager 
systemctl restart network.service 

进入桌面后，右击进入terminal输入ifconfig，查看ip
```powershell
ifconfig
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000256693.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
#### 4.2.5. Linux 中安装 zookeeper 
将zookeeper-3.4.6.tar.gz上传到服务器的/root/目录下
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000438944.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
解压
```powershell
tar -zxvf zookeeper-3.4.6.tar.gz
```

进入zookeeper-3.4.6目录。创建data文件夹
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000547561.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
进入conf(配置)文件夹，重命名zoo_sample.cfg为zoo.cfg。修改zoo.cfg文件。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000708824.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/201911030007520.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
进入bin文件夹，启动zookeeper
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000808450.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103000945671.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

### 4.3. 监控中心 Monitor 
在开发时，需要知道注册中心都注册了哪些服务，以便我们开发和测试。可以通过部署一个监控中心来实现。其实监控中心就是一个 web 应用，部署到tomcat 即可。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001224737.png)
上传tomcat与dubbo-admin到服务器
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001259307.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001315827.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001332900.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001347588.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001407841.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001438527.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001508817.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
## 5. IDEA 开发环境设置 
### 5.1. 创建 IDEA 工程 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001639635.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
或者
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001659187.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001715535.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103001732401.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300180970.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

## 6. 品优购-框架搭建 
### 6.1. 工程结构说明 
开发完成后的工程结构如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300190650.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
| 模块名 |工程说明  |
|--|--|
|pinyougou-parent  | 聚合父工程  |
|pinyougou-pojo | 通用实体类  |
|pinyougou-dao  | 通用实体类 |
|pinyougou-xxx | 业务服务层工程  |
|pinyougou-xxx-interface  | 业务服务层接口  |
|pinyougou-xxx-service  | 业务服务层实现（web 工程）  |
|pinyougou-xxx-web   | 展现（控制）层工程（web 工程）  |

### 6.2. 创建数据库表 
在导入的虚拟机里面已经有使用 mysql 5.7 的数据库名称为：pinyougoudb，
mysql5.7 的用户名和密码都为：root。 
另外；也可以自行创建数据库，将“资料/database/pinyougoudb.sql”导入。 

### 6.3. 创建工程&添加依赖 
#### 6.3.1. pinyougou 
品优购聚合父工程；包括后续开发的所有品优购聚合子工程。主要功能是进行依赖、插件统一管理。 

##### 6.3.1.1. 创建 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002246414.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002258692.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002313750.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.1.2. 依赖 

> 后续的文中出现依赖表示修改当前项目的 pom.xml 文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.pinyougou</groupId>
    <artifactId>pinyougou</artifactId>
    <packaging>pom</packaging>
    <version>1.0-SNAPSHOT</version>

    <!-- 集中定义依赖版本号 -->
    <properties>
        <junit.version>4.12</junit.version>
        <spring.version>4.3.10.RELEASE</spring.version>
        <spring.security.version>4.2.3.RELEASE</spring.security.version>
        <mybatis.version>3.4.5</mybatis.version>
        <mybatis.spring.version>1.3.1</mybatis.spring.version>
        <mysql.version>5.1.32</mysql.version>
        <druid.version>1.1.5</druid.version>
        <pagehelper.version>5.1.2</pagehelper.version>
        <mapper.version>3.5.0</mapper.version>
        <dubbo.version>2.6.0</dubbo.version>
        <slf4j.version>1.7.12</slf4j.version>
        <javax.persistence.version>1.0</javax.persistence.version>
        <fastjson.version>1.2.44</fastjson.version>
        <zookeeper.version>3.4.9</zookeeper.version>
        <zkclient.version>0.1</zkclient.version>
        <jedis.version>2.9.0</jedis.version>
        <spring.data.redis.version>1.8.9.RELEASE</spring.data.redis.version>
        <servlet.api.version>2.5</servlet.api.version>
        <commons.fileupload.version>1.3.1</commons.fileupload.version>
        <fastdfs.client.version>1.25</fastdfs.client.version>
        <freemarker.version>2.3.23</freemarker.version>
        <activemq.version>5.14.3</activemq.version>
        <cas.client.core.version>3.4.1</cas.client.core.version>
        <spring.data.solr.version>1.5.5.RELEASE</spring.data.solr.version>
        <httpclient.version>4.5.3</httpclient.version>
        <wxpay.sdk.version>0.0.3</wxpay.sdk.version>
        <httpcore.version>4.4.8</httpcore.version>
        <javassist.version>3.12.1.GA</javassist.version>
        <commons.codec.version>1.11</commons.codec.version>
        <dom4j.version>1.6.1</dom4j.version>
        <xml.apis.version>2.0.2</xml.apis.version>
        <kaptcha.version>2.3.2</kaptcha.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>${junit.version}</version>
            </dependency>

            <!-- Spring -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-beans</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-web</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-aspects</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jms</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context-support</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-test</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <!-- Mybatis -->
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis</artifactId>
                <version>${mybatis.version}</version>
            </dependency>
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis-spring</artifactId>
                <version>${mybatis.spring.version}</version>
            </dependency>

            <!-- 日志 -->
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
                <version>${slf4j.version}</version>
            </dependency>

            <!-- dubbo相关 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>dubbo</artifactId>
                <version>${dubbo.version}</version>
            </dependency>
            <dependency>
                <groupId>org.apache.zookeeper</groupId>
                <artifactId>zookeeper</artifactId>
                <version>${zookeeper.version}</version>
            </dependency>
            <dependency>
                <groupId>com.github.sgroschupf</groupId>
                <artifactId>zkclient</artifactId>
                <version>${zkclient.version}</version>
            </dependency>

            <!-- json的解析 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>${fastjson.version}</version>
            </dependency>

            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>servlet-api</artifactId>
                <version>${servlet.api.version}</version>
                <scope>provided</scope>
            </dependency>

            <!-- mybaits分页助手 -->
            <dependency>
                <groupId>com.github.pagehelper</groupId>
                <artifactId>pagehelper</artifactId>
                <version>${pagehelper.version}</version>
            </dependency>

            <!-- 通用 Mapper -->
            <dependency>
                <groupId>tk.mybatis</groupId>
                <artifactId>mapper</artifactId>
                <version>${mapper.version}</version>
            </dependency>

            <!-- MySql -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <!-- 连接池 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>

            <!-- jpa 注解 -->
            <dependency>
                <groupId>javax.persistence</groupId>
                <artifactId>persistence-api</artifactId>
                <version>${javax.persistence.version}</version>
            </dependency>

            <!-- redis缓存 -->
            <dependency>
                <groupId>redis.clients</groupId>
                <artifactId>jedis</artifactId>
                <version>${jedis.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.data</groupId>
                <artifactId>spring-data-redis</artifactId>
                <version>${spring.data.redis.version}</version>
            </dependency>

            <!-- 文件上传组件 -->
            <dependency>
                <groupId>commons-fileupload</groupId>
                <artifactId>commons-fileupload</artifactId>
                <version>${commons.fileupload.version}</version>
            </dependency>

            <!--fastDFS客户端工具类包 -->
            <dependency>
                <groupId>fastdfs_client</groupId>
                <artifactId>fastdfs_client</artifactId>
                <version>${fastdfs.client.version}</version>
            </dependency>

            <!--freemarker-->
            <dependency>
                <groupId>org.freemarker</groupId>
                <artifactId>freemarker</artifactId>
                <version>${freemarker.version}</version>
            </dependency>

            <!-- ActiveMQ -->
            <dependency>
                <groupId>org.apache.activemq</groupId>
                <artifactId>activemq-client</artifactId>
                <version>${activemq.version}</version>
            </dependency>
            <!-- 身份验证 -->
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-web</artifactId>
                <version>${spring.security.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-config</artifactId>
                <version>${spring.security.version}</version>
            </dependency>

            <!-- cas -->
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-cas</artifactId>
                <version>${spring.security.version}</version>
            </dependency>
            <dependency>
                <groupId>org.jasig.cas.client</groupId>
                <artifactId>cas-client-core</artifactId>
                <version>${cas.client.core.version}</version>
                <!-- 排除 log4j包冲突 -->
                <exclusions>
                    <exclusion>
                        <groupId>org.slf4j</groupId>
                        <artifactId>log4j-over-slf4j</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>

            <!-- solr相关 -->
            <dependency>
                <groupId>org.springframework.data</groupId>
                <artifactId>spring-data-solr</artifactId>
                <version>${spring.data.solr.version}</version>
            </dependency>

            <dependency>
                <groupId>org.apache.httpcomponents</groupId>
                <artifactId>httpclient</artifactId>
                <version>${httpclient.version}</version>
            </dependency>

            <!-- 微信支付 sdk -->
            <dependency>
                <groupId>com.github.wxpay</groupId>
                <artifactId>wxpay-sdk</artifactId>
                <version>${wxpay.sdk.version}</version>
            </dependency>

            <!-- 验证码工具类包 -->
            <dependency>
                <groupId>com.github.penggle</groupId>
                <artifactId>kaptcha</artifactId>
                <version>${kaptcha.version}</version>
                <exclusions>
                    <exclusion>
                        <groupId>javax.servlet</groupId>
                        <artifactId>javax.servlet-api</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>

            <!-- 加密解密 -->
            <dependency>
                <groupId>commons-codec</groupId>
                <artifactId>commons-codec</artifactId>
                <version>${commons.codec.version}</version>
            </dependency>

            <dependency>
                <groupId>javassist</groupId>
                <artifactId>javassist</artifactId>
                <version>${javassist.version}</version>
            </dependency>

            <dependency>
                <groupId>dom4j</groupId>
                <artifactId>dom4j</artifactId>
                <version>${dom4j.version}</version>
            </dependency>

            <dependency>
                <groupId>xml-apis</groupId>
                <artifactId>xml-apis</artifactId>
                <version>${xml.apis.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <!-- java编译插件 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.6.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>UTF-8</encoding>
                </configuration>
            </plugin>
        </plugins>

        <pluginManagement>
            <plugins>
                <!-- tomcat插件 -->
                <plugin>
                    <groupId>org.apache.tomcat.maven</groupId>
                    <artifactId>tomcat7-maven-plugin</artifactId>
                    <version>2.2</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
</project>
```

#### 6.3.2. pinyougou-common
通用工具类工程；放置其它工程经常使用的工具类或者组件。 
##### 6.3.2.1. 创建 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002715145.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002751974.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103002805318.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.2.2. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>pinyougou-common</artifactId>


</project>
```

#### 6.3.3. pinyougou-pojo 
实体类工程；统一放置品优购的所有数据库实体类或者其它领域模型。 
##### 6.3.3.1. 创建 
创建 pinyougou 的子模块工程，与 pinyougou-common 的创建方式类似；后面的若是pinyougou 的子模块工程的创建也都如此；不再每一步都截图了。 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103003001401.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103003012557.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.3.2. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>pinyougou-pojo</artifactId>

    <dependencies>
        <!-- jpa 注解 -->
        <dependency>
            <groupId>javax.persistence</groupId>
            <artifactId>persistence-api</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.data</groupId>
            <artifactId>spring-data-solr</artifactId>
        </dependency>
    </dependencies>
</project>
```

#### 6.3.4. pinyougou-dao 
数据库通用访问层工程；放置 Mybatis 中对应于数据库操作的所有 Mapper 接口类。 

##### 6.3.4.1. 创建 
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300341338.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103003426781.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.4.2. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>pinyougou-dao</artifactId>

    <dependencies>
        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-pojo</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
        </dependency>

        <!-- Mybatis -->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
        </dependency>

        <!-- mybaits分页助手 -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper</artifactId>
        </dependency>

        <!-- 通用 Mapper -->
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper</artifactId>
        </dependency>

        <!-- MySql -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!-- 连接池 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>

        <!-- 日志 -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
        </dependency>
    </dependencies>

</project>
```

#### 6.3.5. pinyougou-sellergoods  
商家商品服务工程；该工程主要是对应于商品、商家、品牌、规格、商品分类等
的服务提供，由 pinyougou-sellergoods-interface 和 pinyougou-sellergoods-service构成。 

##### 6.3.5.1. 创建 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103003631198.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103003647581.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.5.2. 依赖 
无需改动。 
#### 6.3.6. pinyougou-sellergoods-interface 
##### 6.3.6.1. 创建 
注意这个工程是 pinyougou-sellergoods 的聚合子工程。 
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300372582.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300382639.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
##### 6.3.6.2. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou-sellergoods</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>pinyougou-sellergoods-interface</artifactId>

    <dependencies>
        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-pojo</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```

#### 6.3.7. pinyougou-sellergoods-service 
##### 6.3.7.1. 创建 
注意这个工程是 pinyougou-sellergoods 的聚合子工程。 
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110300394983.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004002895.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004129999.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
安装插件JBLJavaToWeb

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004153435.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004212328.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004228166.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.7.3. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou-sellergoods</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>pinyougou-sellergoods-service</artifactId>
    <packaging>war</packaging>

    <dependencies>

        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-sellergoods-interface</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-dao</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aspects</artifactId>
        </dependency>

        <!-- dubbo相关 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>dubbo</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
        </dependency>
        <dependency>
            <groupId>com.github.sgroschupf</groupId>
            <artifactId>zkclient</artifactId>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
        </dependency>
        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-common</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- tomcat插件 -->
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <configuration>
                    <path>/</path>
                    <port>9000</port>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```
#### 6.3.8. pinyougou-manage-web  
##### 6.3.8.1. 创建 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004546776.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004609427.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.8.2. 转换为 web 工程 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004636937.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004648729.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

##### 6.3.8.3. 依赖 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>pinyougou</artifactId>
        <groupId>com.pinyougou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>pinyougou-manage-web</artifactId>
    <packaging>war</packaging>
    <dependencies>
        <dependency>
            <groupId>com.pinyougou</groupId>
            <artifactId>pinyougou-sellergoods-interface</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
        </dependency>

        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
        </dependency>

        <!-- dubbo相关 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>dubbo</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
        </dependency>
        <dependency>
            <groupId>com.github.sgroschupf</groupId>
            <artifactId>zkclient</artifactId>
        </dependency>

        <!-- json的解析 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
        </dependency>

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>servlet-api</artifactId>
            <scope>provided</scope>
        </dependency>

    </dependencies>
    <build>
        <plugins>
            <!-- tomcat插件 -->
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <configuration>
                    <path>/</path>
                    <port>9100</port>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```
### 6.4. 整合工程 
#### 6.4.1. pinyougou-dao 
##### 6.4.1.1. applicationContext-dao.xml 
添加 
pinyougou\pinyougou-dao\src\main\resources\spring\applicationContext-dao.xml 
内容如下： 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103004948722.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 加载配置文件 -->
    <context:property-placeholder location="classpath*:properties/*.properties"/>

    <!-- 数据库连接池 -->
    <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource" 
          destroy-method="close">
        <property name="url" value="${jdbc.url}"/>
        <property name="username" value="${jdbc.username}"/>
        <property name="password" value="${jdbc.password}"/>
        <property name="driverClassName" value="${jdbc.driver}"/>
        <property name="maxActive" value="10"/>
        <property name="minIdle" value="5"/>
    </bean>

    <!-- 配置 sqlSessionFactory -->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <!-- 数据源 -->
        <property name="dataSource" ref="dataSource"/>
        <!-- mybatis总配置文件 -->
        <property name="configLocation" value="classpath:mybatis/mybatis-config.xml"/>
        <!-- 配置实体类别名 -->
        <property name="typeAliasesPackage" value="com.pinyougou.pojo"/>
        <!--配置扫描xml文件-->
        <property name="mapperLocations" value="classpath:com/pinyougou/mapper/*.xml"/>
    </bean>

    <!-- 扫描 mapper -->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.pinyougou.mapper"/>
    </bean>

</beans>
```

##### 6.4.1.2. mybatis-config.xml 
添加 
pinyougou\pinyougou-dao\src\main\resources\mybatis\mybatis-config.xml 
内容如下：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <settings>
        <!-- 开启驼峰规则自动映射字段属性值；如字段为 user_name的可以映射到 userName属性中 -->
        <setting name="mapUnderscoreToCamelCase" value="true"/>
    </settings>
</configuration>
```

##### 6.4.1.3. db.properties 
添加 
pinyougou\pinyougou-dao\src\main\resources\properties\db.properties 
内容如下： 
```js
jdbc.driver=com.mysql.jdbc.Driver
#下面的按照自己实际的填写。如果连接服务器的mysql，就填写你服务器的ip。如果连接的是本地的mysql，就填写localhost
jdbc.url=jdbc:mysql://192.168.25.128:3306/pinyougoudb?useUnicode=true&characterEncoding=utf8&autoReconnect=true
jdbc.username=root
jdbc.password=root
```
##### 6.4.1.4. log4j.properties 
添加 
pinyougou\pinyougou-dao\src\main\resources\log4j.properties 
内容如下：
```js
log4j.rootLogger=DEBUG,stdout
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%-d{yyyy-MM-dd HH:mm:ss,SSS} [%t] [%c]-[%p] %m%n
```

#### 6.4.2. pinyougou-sellergoods-service 
##### 6.4.2.1. applicationContext-service.xml 
添加 
pinyougou-sellergoods-service\src\main\resources\spring\applicationContext
service.xml 
内容如下： 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
        http://code.alibabatech.com/schema/dubbo
        http://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <dubbo:protocol name="dubbo" port="20881"/>
    <dubbo:application name="pinyougou-sellergoods-service"/>
    <!--根据服务器实际ip填写-->
    <dubbo:registry address="zookeeper://192.168.25.128:2181"/>
    <dubbo:annotation package="com.pinyougou.sellergoods.service.impl"/>

</beans>
```

##### 6.4.2.2. web.xml 
修改pinyougou-sellergoods-service\src\main\webapp\WEB-INF\web.xml内容如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://java.sun.com/xml/ns/javaee"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
         http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" 
         version="2.5">
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath*:spring/applicationContext*.xml</param-value>
    </context-param>
</web-app>
```
#### 6.4.3. pinyougou-manage-web 
##### 6.4.3.1. springmvc.xml 
添加 
pinyougou\pinyougou-manage-web\src\main\resources\spring\springmvc.xml 
内容如下： 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/mvc
       http://www.springframework.org/schema/mvc/spring-mvc.xsd
       http://code.alibabatech.com/schema/dubbo
       http://code.alibabatech.com/schema/dubbo/dubbo.xsd">

    <mvc:annotation-driven>
        <mvc:message-converters register-defaults="true">
            <bean class="com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter">
                <property name="supportedMediaTypes" value="application/json"/>
            </bean>
        </mvc:message-converters>
    </mvc:annotation-driven>

    <!-- 引用 dubbo 服务 -->
    <dubbo:application name="pinyougou-manage-web"/>
    <!-- 根据实际ip填写 -->
    <dubbo:registry address="zookeeper://192.168.25.128:2181"/>
    <dubbo:annotation package="com.pinyougou.manage.controller"/>
</beans>
```

##### 6.4.3.2. log4j.properties 
添加 
pinyougou\pinyougou-manage-web\src\main\resources\log4j.properties 
内容如下： 
```js
log4j.rootLogger=DEBUG,stdout
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%-d{yyyy-MM-dd HH:mm:ss,SSS} [%t] [%c]-[%p] %m%n
```
##### 6.4.3.3. web.xml 
修改 
pinyougou\pinyougou-manage-web\src\main\webapp\WEB-INF\web.xml 
内容如下: 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://java.sun.com/xml/ns/javaee"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
         http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         version="2.5">
    <!-- 解决 post乱码 -->
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter
        </filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>utf-8</param-value>
        </init-param>
        <init-param>
            <param-name>forceEncoding</param-name>
            <param-value>true</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>

    <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <!-- 指定加载的配置文件 ，通过参数 contextConfigLocation加载 -->
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:spring/springmvc.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>*.do</url-pattern>
    </servlet-mapping>

</web-app>
```

6.4.4. 引入品优购实体类 
在 pinyougou-pojo 工程创建 com.pinyougou.pojo 包；然后将“资料/pojo”下的所有
实体类复制到上述创建的包中。 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010114783.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

## 7. 查询品牌列表数据 
### 7.1. 需求分析 
在浏览器上访问：http://localhost:9100/brand/findAll.do 把品牌数据(json 格式字
符串)加载并显示。 
### 7.2. 数据库表 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010138726.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
### 7.3. 后端代码 
#### 7.3.1. BrandMapper 接口 
添加 
pinyougou-dao\src\main\java\com\pinyougou\mapper\BrandMapper.java 
内容如下： 
```java
package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandMapper {

    List<TbBrand> queryAll();

}
```

#### 7.3.2. BrandMapper.xml 配置文件 
添加 
pinyougou-dao\src\main\resources\com\pinyougou\mapper\BrandMapper.xml 
内容如下： 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="com.pinyougou.mapper.BrandMapper">
    <select id="queryAll" resultType="com.pinyougou.pojo.TbBrand">
        SELECT *
        FROM tb_brand
    </select>
</mapper>
```

#### 7.3.3. BrandService 接口 
添加 
pinyougou-sellergoods\pinyougou-sellergoods
interface\src\main\java\com\pinyougou\sellergoods\service\BrandService.java 
内容如下： 

```java
package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {

	public List<TbBrand> queryAll();
	
}
```

#### 7.3.4. BrandServiceImpl 实现类 
添加 
pinyougou-sellergoods\pinyougou-sellergoods
service\src\main\java\com\pinyougou\sellergoods\service\impl\BrandServiceImpl.ja
va 
内容如下： 
```java
package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.pojo.TbBrand;

/**
 * 注意：该Service注解是alibaba的，不是spring的
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {

        return brandMapper.queryAll();
    }

}
```

#### 7.3.5. BrandController 处理器 
添加 
pinyougou-manage
web\src\main\java\com\pinyougou\manage\controller\BrandController.java 
内容如下： 
```java
package com.pinyougou.manage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.queryAll();
	}
	
}
```

### 7.4. 安装工程 
点击 IDEA 最右边的“Maven Projects” 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010544825.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010600539.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

### 7.5. 启动 
#### 7.5.1. 启动 pinyougou-sellergoods-service 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010621652.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010635703.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110301064871.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)

#### 7.5.2. 启动 pinyougou-manage-web 
这个启动与 pinyougou-sellergoods-service 的启动配置是一样的；不在赘述图。 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010714286.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
7.6. 测试 
打开 chrome 浏览器；输入：http://localhost:9100/brand/findAll.do 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103010851592.png)
## 8. Git 管理代码 
## 9. 常见问题 
### 9.2. Mybatis 中查询语句找不到 
org.springframework.web.util.NestedServletException: Request processing failed; 
nested exception is java.lang.RuntimeException: 
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): 
com.pinyougou.mapper.BrandMapper.queryAll 
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): 
com.pinyougou.mapper.BrandMapper.queryAll 
 
在 IDEA 中检查 resources 文件夹中 com.pinyougou.mapper 是不是已经变成了
一个目录；真正的是三级目录，只是在 IDEA 上看不太出区别。请创建的时候
创建 package 方 式 创 建 则 不 会 出 现 了 ； 不 管 如 何 请 保 证
resources/com/pinyougou/mapper 目录的存在

> 以上为第一天内容，视频参考[Java 品优购互联网商城 项目实战（基于IDEA）新版](https://www.bilibili.com/video/av55022610)。因为第一天是没有视频的，是基于这份pdf讲义实现的。然而这份pdf讲义也有很多错误，有的是因为资源是旧的，不兼容，还有的是直接是里面代码的错误导致的bug。以上我博客的内容基本是花了时间排除了错误后的实现。所以有些地方会与讲义不同。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191103011644494.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTIxMzg2MDU=,size_16,color_FFFFFF,t_70)
第一天内容我写了[思维导图](https://www.xmind.net/m/iPGKp9/)，打开会有些慢。
博客内容中，如果我有哪些没有讲清楚或者实现中遇到了哪些问题，请在评论中留言，我看到会尽快回复的，或者其他小伙伴看到也会帮忙解决的。