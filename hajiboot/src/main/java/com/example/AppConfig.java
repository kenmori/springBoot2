package com.example;
//Calculatorインターフェイスにインターフェイスに対してどのような実装「Bean 」を管理させるために
import com.example.app.AddCalculator;
import com.example.app.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //個のクラスがJavaConfig用のクラスであることを示す
public class AppConfig {
	@Bean//[DIコンテナ]に管理させたい「Bean」を生成するメソッドに「@Bean」アノテーションを付ける
	Calculator calculator() {
		return new AddCalculator();
	}
	//AddCalculatorインスタンスがCalculator型でcalculatorと言う名前で「DIコンテナ」に「singletone」として管理されるf
}
