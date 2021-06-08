package br.com.serratec.ApirRestcurso.error;

public class ErrorMessage {
    
    private String title;
	private Integer status;
	private String detail;
	private String developerMessage;
	private Long timestamp;
		
	public ErrorMessage(String title, Integer status, String detail, String developerMessage, Long timestamp) {
		this.title = title;
		this.status = status;
		this.detail = detail;
		this.developerMessage = developerMessage;
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public String getDeveloperMessage() {
		return developerMessage;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
}
