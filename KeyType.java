package com.logoocc.redis;

import java.util.HashSet;
import java.util.List;

import redis.clients.jedis.Jedis;

public class KeyType {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");

		// 获取数据并输出
		HashSet<String> list = (HashSet<String>) jedis.keys("*");

		System.out.println("List of stored keys:: " + list.toString());

	}
}
