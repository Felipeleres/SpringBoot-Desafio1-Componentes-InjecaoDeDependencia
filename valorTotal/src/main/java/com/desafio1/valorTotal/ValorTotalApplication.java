package com.desafio1.valorTotal;

import com.desafio1.valorTotal.model.Order;
import com.desafio1.valorTotal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ValorTotalApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(ValorTotalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("Digite os dados do pedido: ");
		System.out.println();
		System.out.print("Digite o código do produto? ");
		Integer code = sc.nextInt();
		System.out.print("Digite o valor básico? ");
		Double basic = sc.nextDouble();
		System.out.print("Digite a porcentagem de desconto? ");
		Double discount = sc.nextDouble();

		Order order = new Order(code,basic,discount);

		System.out.println();
		System.out.println("Pedido codigo "+order.getCode());
		System.out.println("Valor total: R$ "+ String.format("%.2f",orderService.total(order)));
	}
}
