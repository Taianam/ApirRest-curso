package br.com.serratec.ApirRestcurso.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.serratec.ApirRestcurso.error.ErrorMessage;
import br.com.serratec.ApirRestcurso.exception.ResourceBadRequestException;
import br.com.serratec.ApirRestcurso.exception.ResourceNotFoundException;

@ControllerAdvice
public class ApiHandlerException {
    
    @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException exception){
		
		//Crio um obj do tipo ErrorMessage que será devolvido ao cliente em caso de erros.
		ErrorMessage errorMessage = new ErrorMessage(
				"Not Found",
				HttpStatus.NOT_FOUND.value(),
				exception.getMessage(),
				exception.getClass().getName(),
				new Date().getTime());
		
		
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ResourceBadRequestException.class)
	public ResponseEntity<?> handlerResourceBadRequestException(ResourceBadRequestException exception){
		ErrorMessage errorMessage = new ErrorMessage(
				"Bad Request",
				HttpStatus.BAD_REQUEST.value(),
				exception.getMessage(),
				exception.getClass().getName(),
				new Date().getTime());
		
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	}
}
