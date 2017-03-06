如何创建自己的Github代码仓库

1、注册并登录自己的Github账号。

2、进入Repositories，点击右侧“new”，输入一个仓库名称，创建当前仓库。

3、创建后仓库后，就有对应的仓库地址，在VCS中checkout from version contorl检出代码

如何创建自己的Github代码仓库并可以被其他人作为库引用

1、新建一个工程获取new Module

2、在VCS---inport into version contorl---share project on Gitbub，填上仓库名称，点击share

3、选择要加入到库中 的文件

4、登录Github，找到 release,创建一个release,选择publish release

5、接下来需要登录到JitPack.io网站，输入项目地址，点击get it。

6、如果是Maven引用，则在根目录下配置：https://jitpack.io,如果是Gradle,则compile '仓库的完整地址：'

示例参考：https://jitpack.io/#clycheng2015/GithubUpload/v1.0，这里有详细的说明。