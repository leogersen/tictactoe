package br.com.softblue.tictactoe.core;

@SuppressWarnings("serial")
public class InvalideMoveException extends Exception {
	
	public InvalideMoveException(String message) {
		super(message);
		
	}

}
