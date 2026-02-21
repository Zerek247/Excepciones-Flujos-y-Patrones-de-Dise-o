package com.academia.ejercicios.ej1;

// --- Excepciones ---
public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }
}
