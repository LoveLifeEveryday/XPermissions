# XPermissions 👋

![XPermission](https://cdn.jsdelivr.net/gh/LoveLifeEveryday/FigureBed@master/typora202004/24/111347-434501.png)

[![](https://jitpack.io/v/LoveLifeEveryday/XPermissions.svg)](https://jitpack.io/#LoveLifeEveryday/XPermissions)![Hex.pm badge](https://img.shields.io/badge/license-Apache%202-blue)![GitHub release (latest by date)](https://img.shields.io/github/v/release/LoveLifeEveryday/XPermissions)

An easy to use open source library using in the kotlin

一个基于 `Kotlin` 的简单易用的权限申请库

# How to Use

## **Step 1.** Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## **Step 2.** Add the dependency

```groovy
	dependencies {
		implementation 'com.github.LoveLifeEveryday:XPermissions:1.0.0'
	}
```

## Step 3.Use it in your project

```kotlin
XPermission.request(
    this,
    // 这里的权限可以是单个或者多个，权限之间用逗号『，』隔开即可
    Manifest.permission.XXX1,
    Manifest.permission.XXX2
    // allGranted 是一个 boolean 类型的变量，若为 true ,则所有权限申请通过
    // deniedList 是一个 List 类型的变量，表示用户拒绝权限列表
) { allGranted, deniedList ->
    if (allGranted) {
        Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
    }
}
```



## Demo

> 测试用的 `Demo`

- `Github`：

## Author

👤 **许朋友爱玩**

- `Github` ： https://github.com/LoveLifeEveryday/
- 个人博客：http://xcynice.xyz/
- 掘金：https://juejin.im/user/5e429bbc5188254967066d1b/posts

## Show your support

Give a ⭐️ if this project helped you!

求星星⭐️，求赞👍