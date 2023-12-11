package com.zbiti.plugin.content;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class weatherUtil {

    public static String getContent(){
        try {
            RestTemplate restTemplate = new RestTemplate();
            // 获取城市天气
            ResponseEntity<Map> forEntity = restTemplate.getForEntity("https://wis.qq.com/weather/common?source=pc&weather_type=observe|forecast_24h|air&province=江苏省&city=南京市&county=雨花台区", Map.class);
            HttpStatus statusCode = forEntity.getStatusCode();
            // 获取成功
            if(statusCode.is2xxSuccessful()){
                Map body = forEntity.getBody();
                Map data = (Map) body.get("data");
                Object observe = data.get("observe");
                System.out.println(observe.toString());
                return observe.toString();
            }
        }catch (Exception e){
            System.out.println("e:" + e);
        }
       return null;
    }
}
