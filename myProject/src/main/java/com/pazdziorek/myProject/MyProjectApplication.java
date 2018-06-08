package com.pazdziorek.myProject;

import com.pazdziorek.myProject.dataModel.FinancialData;
import com.pazdziorek.myProject.domain.dataModel.DataRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {

    DataRepository dataRepository;
    FinancialData financialData;

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	public void run (){
        financialData = new FinancialData(1L,"Basic");
        dataRepository.save(financialData);
	}
}
