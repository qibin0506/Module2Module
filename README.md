# Module2Module
Android模块化开发小demo

内置Android路由， 支持注解设置路由

如果你只想使用内置的Android路由模块，可以按照以下步骤完成。
1. 在你的项目的build.gradle文件中添加一下代码
``` java
 dependencies {
        // 默认配置
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
```

2. 在你的lib的build.gradle中添加

``` java
apply plugin: 'com.neenbedankt.android-apt'
```
并且在dependencies中添加
``` java
compile 'org.loader:annotation:1.0.0'
compile 'org.loader:router:1.0.0'
apt 'org.loader:router-helper:1.0.0'
```

3. 在lib项目中添加一个空类，并使用
``` java
@Component("libName")
```
表示该lib的名称。

4. 在需要注册路由的地方使用
``` java
@AutoRouter
```
或者
``` java
@StaticRouter(Scheme + "routerName")
```
进行路由注册

5. 在壳工程的中添加如下配置

``` java
apply plugin: 'com.neenbedankt.android-apt'
```
并在dependencies中添加
```
compile 'org.loader:annotation:1.0.0'
compile 'org.loader:router-helper:1.0.0'
apt 'org.loader:router-helper:1.0.0'
```

6. 自定义Application，并且添加一下代码
``` java
@Components({"components", "name"})
```
将上面定义的component的配置到这里。

7. 在Application中调用如下代码，进行路由安装
``` java
RouterHelper.install();
```
具体使用方式可以见该项目。
