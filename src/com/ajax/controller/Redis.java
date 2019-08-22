package com.ajax.controller;

import redis.clients.jedis.Jedis;

public class Redis {
	public static void main(String[] args) {
		  //连接本地的 Redis 服务
	    Jedis jedis = new Jedis("192.168.168.128",6379);
	     jedis.auth("123456");
	     jedis.del("username");
	    //jedis.set("username", "123");
	    System.out.println("连接成功");
	    //查看服务是否运行
	   System.out.println(jedis.get("username")); 
	    
	    System.out.println("服务正在运行: "+jedis.ping());
	}
  
}

