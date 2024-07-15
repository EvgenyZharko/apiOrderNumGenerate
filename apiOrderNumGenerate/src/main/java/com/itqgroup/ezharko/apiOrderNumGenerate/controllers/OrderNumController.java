package com.itqgroup.ezharko.apiOrderNumGenerate.controllers;

import com.itqgroup.ezharko.apiOrderNumGenerate.model.OrderNumber;
import com.itqgroup.ezharko.apiOrderNumGenerate.services.OrderNumService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "main_methods")
@RestController
public class OrderNumController {
    private OrderNumService orderNumService;

    public OrderNumController(OrderNumService orderNumService) {
        this.orderNumService = orderNumService;
    }

    @Operation(
            summary = "Метод возвращающий номер заказа и дату оформления",
            description = "Возвращает дату оформления закаа (время = 00.00.00), генерирует номер заказа:" +
                    " текущая дата в формате YYMMDD + 9значное случайное число"
    )
    @GetMapping("/createOrderNumber")
    public OrderNumber createOrderNumber() {
        return orderNumService.createOrderNumber();
    }
}
