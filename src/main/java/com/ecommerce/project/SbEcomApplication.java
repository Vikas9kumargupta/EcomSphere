package com.ecommerce.project;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class  SbEcomApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DEV_DB_URL", Objects.requireNonNull(dotenv.get("DEV_DB_URL")));
		System.setProperty("DEV_DB_USERNAME", Objects.requireNonNull(dotenv.get("DEV_DB_USERNAME")));
		System.setProperty("DEV_DB_PASSWORD", Objects.requireNonNull(dotenv.get("DEV_DB_PASSWORD")));
		System.setProperty("DEV_JWT_SECRET", Objects.requireNonNull(dotenv.get("DEV_JWT_SECRET")));
		System.setProperty("DEV_JWT_EXPIRATION_MS", Objects.requireNonNull(dotenv.get("DEV_JWT_EXPIRATION_MS")));
		System.setProperty("DEV_JWT_COOKIE_NAME", Objects.requireNonNull(dotenv.get("DEV_JWT_COOKIE_NAME")));

		System.setProperty("PROD_DB_URL", Objects.requireNonNull(dotenv.get("PROD_DB_URL")));
		System.setProperty("PROD_DB_USERNAME", Objects.requireNonNull(dotenv.get("PROD_DB_USERNAME")));
		System.setProperty("PROD_DB_PASSWORD", Objects.requireNonNull(dotenv.get("PROD_DB_PASSWORD")));
		System.setProperty("PROD_JWT_SECRET", Objects.requireNonNull(dotenv.get("PROD_JWT_SECRET")));
		System.setProperty("PROD_JWT_EXPIRATION_MS", Objects.requireNonNull(dotenv.get("PROD_JWT_EXPIRATION_MS")));
		System.setProperty("PROD_JWT_COOKIE_NAME", Objects.requireNonNull(dotenv.get("PROD_JWT_COOKIE_NAME")));

		System.setProperty("QA_DB_URL", Objects.requireNonNull(dotenv.get("QA_DB_URL")));
		System.setProperty("QA_DB_USERNAME", Objects.requireNonNull(dotenv.get("QA_DB_USERNAME")));
		System.setProperty("QA_DB_PASSWORD", Objects.requireNonNull(dotenv.get("QA_DB_PASSWORD")));
		System.setProperty("QA_JWT_SECRET", Objects.requireNonNull(dotenv.get("QA_JWT_SECRET")));
		System.setProperty("QA_JWT_EXPIRATION_MS", Objects.requireNonNull(dotenv.get("QA_JWT_EXPIRATION_MS")));
		System.setProperty("QA_JWT_COOKIE_NAME", Objects.requireNonNull(dotenv.get("QA_JWT_COOKIE_NAME")));

		SpringApplication.run(SbEcomApplication.class, args);
	}
}
