# Wechat Assistant Plugin templates

Wechat Assistant 支持通过 [OpenFaaS](https://www.openfaas.com) 完成远程插件功能的实现。

本项目提供基于OpenFaaS模版改造的各类语言插件模版，同样使用 [faas-cli](https://github.com/openfaas/faas-cli) 进行操作.

### 模版列表

目前支持的模版如下.关于模版的更多使用方法请参阅[doc](https://docs.openfaas.com/cli/templates/)

| Name        | Language | Version | Linux base   | Link    
|:------------|:---------|:--------|:-------------|:--------
| go-plugin   | Go       | 1.21    | Alpine Linux | [Go template](./template/go-plugin)
| node-plugin | Node     | 18      | Alpine Linux |  [Node template](./template/node-plugin)

### 使用

***请先确保已安装 [faas-cli](https://github.com/openfaas/faas-cli)***

一键脚本：`curl -sSL https://cli.openfaas.com | sudo -E sh`

HomeBrew: `brew install faas-cli`

文档：https://docs.openfaas.com/cli/install/

- 拉取模版: `faas template pull https://github.com/Cheivin/wechat-assistant-plugin-templates `

- 创建Function: `faas template pull https://github.com/Cheivin/wechat-assistant-plugin-templates`

#### 创建 go-plugin 项目

在`template`同级目录执行命令：`faas new --lang go-plugin Function名称`

例如：`faas new --lang go-plugin go-echo`，此时会自动生成`go-echo`目录和`go-echo.yml`文件

进入`go-echo`目录，在`handler.go`的`Handler`方法中编写业务逻辑。

#### 构建项目

在`go-echo.yml`文件同级目录，执行`faas build -f go-echo.yml`可以启动项目构建，生成镜像

构建完成后执行`faas push -f go-echo.yml`,将镜像推送至docker仓库或私有仓库



