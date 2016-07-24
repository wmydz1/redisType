<?php
/**
 * Created by PhpStorm.
 * User: samchen
 * Date: 3/11/16
 * Time: 13:58
 */

//连接本地的 Redis 服务
$redis = new Redis();
$redis->connect('127.0.0.1', 6379);
echo "Connection to server sucessfully".'<br>';
//查看服务是否运行
echo "Server is running: " . $redis->ping();

echo '<br>';
echo "Stored string in redis:: " . $redis->get("name");



