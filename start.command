#!/bin/bash
# 地图瓦片下载器 - 启动程序

echo "========================================"
echo "  地图瓦片下载器 - 启动程序"
echo "========================================"
echo ""

# 检查 Java
if ! command -v java &> /dev/null; then
    echo "[错误] 未安装 Java，请先安装 JDK"
    echo "下载地址：https://www.oracle.com/java/technologies/downloads/"
    read -p "按回车键退出..."
    exit 1
fi

echo "[信息] 正在启动服务器，请稍候..."
echo "[信息] 启动后请访问：http://localhost:10080/tile-loader/index"
echo ""

java -jar tile-loader.jar

read -p "按回车键退出..."
