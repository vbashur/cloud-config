package com.vbashur.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PreDestroy;

//@Repository
public class RedisDatasource {


    private JedisPool pool;

    RedisDatasource() {
        pool = new JedisPool(new JedisPoolConfig(), "localhost");
        String[] wordArray = {"Man", "Girl", "Lady", "Superhero" };
        for (int iter = 0; iter < wordArray.length; ++iter) {
            pool.getResource().set(wordArray[iter], wordArray[iter]);
        }

    }

    public Jedis getJedis() {
        return pool.getResource();
    }

    @PreDestroy
    private void onDestroyBean() {
        pool.close();
        pool.destroy();
    }
}
