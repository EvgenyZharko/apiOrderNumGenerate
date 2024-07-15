package com.itqgroup.ezharko.apiOrderNumGenerate.services;

import com.itqgroup.ezharko.apiOrderNumGenerate.model.OrderNumber;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class OrderNumService {

    public OrderNumber createOrderNumber() {
        //я б вместо случайного девятизначного числа использовал new Date().getTime - время в миллисекундах. Вероятность дубля минимизируется
        //Недавно роботизировал работу с чатами в майкрософт тимс, там в качестве id сообщения использовалась как раз такая временная метка
        SimpleDateFormat formater = new SimpleDateFormat("YYMMdd");
        Date date = new Date();
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);

        Random random = new Random();

        String orderNumber = formater.format(date);
        int randomNum = random.nextInt(900000000) + 100000000;

        orderNumber = orderNumber + randomNum;

        OrderNumber orderNum = new OrderNumber(Long.parseLong(orderNumber), date);

        return orderNum;
    }

}
