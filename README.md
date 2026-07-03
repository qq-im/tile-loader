# 地图瓦片下载器 (tile-loader)

> 基于 lhq-github/tile-loader 优化部署

支持百度、高德、谷歌地图的瓦片下载，内置三大厂家的离线地图 API。

## 系统要求

- **JDK 8 或更高版本**（推荐 JDK 11+）
- **不需要 MongoDB**（默认使用本地文件存储）
- **不需要数据库**
- Windows / Mac / Linux 均可

## 快速启动（小白教程）

### 第一步：安装 Java

1. 下载 JDK：https://www.oracle.com/java/technologies/downloads/
2. 安装后打开命令行/终端验证：
   ```
   java -version
   ```

### 第二步：下载本仓库

**方式一（推荐）**：点击页面右上角绿色按钮 `Code` → `Download ZIP` → 解压

**方式二**：克隆仓库
```
git clone https://github.com/你的用户名/tile-loader.git
```

### 第三步：启动程序

**Windows 用户**：双击 `start.bat`
**Mac/Linux 用户**：双击 `start.command`，或终端运行 `bash start.command`

如果一切正常，命令行会显示：
```
Started TileLoaderApplication in 3.1 seconds
```

### 第四步：打开网页

浏览器访问：
```
http://localhost:10080/tile-loader/index
```

### 离线地图 API（无需联网即可查看地图）

- 百度离线地图：http://localhost:10080/tile-loader/bmap/index.html
- 高德离线地图：http://localhost:10080/tile-loader/amap/index.html
- 谷歌离线地图：http://localhost:10080/tile-loader/gmap/index.html

## 使用说明

1. 选择地图源（高德/百度/谷歌）
2. 设置下载区域（经纬度范围）
3. 选择缩放级别（1-18级，级别越高越清晰）
4. 点击"开始下载"
5. 下载完成后，瓦片文件保存在 `download` 目录中

## 配置说明

编辑 `application.yml` 文件可以修改：

| 配置项 | 说明 | 默认值 |
|--------|------|--------|
| server.port | 服务端口 | 10080 |
| config.downPoolSize | 下载任务数 | 3 |
| config.retryNum | 失败重试次数 | 3 |
| config.tilePoolSize | 下载线程数 | 5 |
| config.mongoStore | 是否用MongoDB(0=本地) | 0 |
| config.openClient | 是否用桌面客户端(0=网页) | 0 |

## 常见问题

**Q: 启动后网页打不开？**
A: 确认命令行没有报错，然后检查 http://localhost:10080/tile-loader/index

**Q: 提示端口被占用？**
A: 修改 `application.yml` 中的 `server.port` 为其他端口（如 8080）

**Q: 下载的瓦片在哪？**
A: 默认在当前目录的 `download/` 文件夹中

**Q: 需要安装数据库吗？**
A: 不需要，默认使用本地文件存储
