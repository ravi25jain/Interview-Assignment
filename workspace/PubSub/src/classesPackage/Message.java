package classesPackage;

import java.util.Date;

public class Message {
	String publisher, msgContent,topic;
	Date date;
	
	//Set All the message Details with  the Constructor
	public Message(String user,String msg, String subject ){
		this.publisher=user;
		this.msgContent=msg;
		this.topic=subject;
		this.date=new Date();
	}
	
	// method to add the message to the message repository
	public void sendMessage(){
		MsgRepository msgRepo=new MsgRepository();
		msgRepo.addMessage(this);
	}

	// getters method to get the message attributes
	public String getPublisher() {
		return publisher;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public String getTopic() {
		return topic;
	}
	public Date getDate() {
		return date;
	}
}
