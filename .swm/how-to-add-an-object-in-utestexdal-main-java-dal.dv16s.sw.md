---
id: dv16s
name: How to Add an Object in Utest.ex.dal Main Java Dal
file_version: 1.0.2
app_version: 0.9.5-0
file_blobs:
  UTest.Ex.DAL/src/main/java/dal/objects/Message.java: 4df2d6a367e8332e2f3b46de1c14797f68e95c41
  UTest.Ex.DAL/src/main/java/dal/conn/Connection.java: df90d3a999988d56635aea35d779f74c51dd0e82
  UTest.Ex.DAL/src/main/java/dal/conn/IConnection.java: 5af61bfad13931ff870ad7e7ecf3789b057b7e88
  UTest.Ex.DAL/src/main/resources/hibernate.cfg.xml: b8227c80527662381ad98eebdbd4f67e88a8afa1
  UTest.Ex.DAL/target/classes/hibernate.cfg.xml: b8227c80527662381ad98eebdbd4f67e88a8afa1
  UTest.Ex/src/main/java/Mail/Service/MailService.java: 4bc3d01f8aea0da69940b97ed0cb74b85eab0014
---

Understanding Objects, how they work, and how to add new ones, is important - and this document will describe just that.

Hello

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimm-dev-content/o/repositories%2Fls4DA2fLasmQuEbT4ipw%2Fd910e020-9992-4fd1-bbf8-b225ff7e9b7d.png?alt=media&token=6510d4b8-a674-4c17-984f-643438fe1e26" style="width:'100%'"/></div>

<br/>

Some examples of `📄 UTest.Ex.DAL/src/main/java/dal/objects` are `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`, `📄 UTest.Ex.DAL/src/main/java/dal/objects/User.java`, and `📄 UTest.Ex.DAL/src/main/java/dal/objects/UserToken.java`.

## TL;DR - How to add `📄 UTest.Ex.DAL/src/main/java/dal/objects`

1.  Create a new file under `📄 UTest.Ex.DAL/src/main/java/dal/objects` 
    
    *   e.g. `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`
        
2.  Create `dal.objects`[<sup id="Z1tG0Rl">↓</sup>](#f-Z1tG0Rl)
    
3.  Implement the object class (e.g. `Message`[<sup id="2kddmI">↓</sup>](#f-2kddmI))
    
    1.  Create `id`[<sup id="Z1eaaFk">↓</sup>](#f-Z1eaaFk)
        
    2.  Implement `getId`[<sup id="jkYgg">↓</sup>](#f-jkYgg) and `setId`[<sup id="1DEyU7">↓</sup>](#f-1DEyU7)
        
    3.  Update `📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java` with the new class
        
    4.  Update `📄 UTest.Ex.DAL/src/main/java/dal/conn/IConnection.java` with the new class
        
    5.  Update `📄 UTest.Ex.DAL/src/main/resources/hibernate.cfg.xml` with the new class
        
    6.  Update `📄 UTest.Ex.DAL/target/classes/hibernate.cfg.xml` with the new class
        
    7.  Update `📄 UTest.Ex/src/main/java/Mail/Service/MailService.java` with the new class
        
4.  **Profit** 💰
    

# Full walkthrough

Start by creating a new file under `📄 UTest.Ex.DAL/src/main/java/dal/objects`. We'll follow `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java` as an example.




## Implement `dal.objects`[<sup id="Z1tG0Rl">↓</sup>](#f-Z1tG0Rl)

Here is how we do it for `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`:

<br/>



<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java
```java
🟩 1      package dal.objects;
⬜ 2      
⬜ 3      public class Message 
⬜ 4      {
```

<br/>

## Implement the object class

Here is how we do it for `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`:

<br/>



<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java
```java
⬜ 1      package dal.objects;
⬜ 2      
🟩 3      public class Message 
🟩 4      {
🟩 5      	private int id;
🟩 6      	private String subject;
🟩 7      	private String content;
🟩 8      	private int sourceId;
🟩 9      	private int destinationId;
🟩 10     	private boolean isRead;
🟩 11     	private String sourceEmail;
🟩 12     	private String destinationEmail;
🟩 13     
🟩 14         public Message(String subject, String content, int sourceId, int destinationId) 
🟩 15         {
🟩 16         	this.subject = subject;
🟩 17         	this.content = content;
🟩 18         	this.sourceId = sourceId;
🟩 19         	this.destinationId = destinationId;
🟩 20         	isRead = false;
🟩 21         }
🟩 22         
🟩 23         public Message()
🟩 24         {
🟩 25         	
🟩 26         }
🟩 27         
🟩 28         public int getId() 
🟩 29         {
🟩 30             return id;
🟩 31         }
🟩 32         
🟩 33         public void setId(int id) 
🟩 34         {
🟩 35             this.id = id;
🟩 36         }
🟩 37     
🟩 38         public String getSubject() 
🟩 39         {
🟩 40             return subject;
🟩 41         }
🟩 42         
🟩 43         public void setSubject(String subject) 
⬜ 44         {
⬜ 45         	this.subject = subject;
⬜ 46         }
```

<br/>

### Implement `id`[<sup id="Z1eaaFk">↓</sup>](#f-Z1eaaFk)

Here is how we do it for `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`:

<br/>



<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java
```java
⬜ 2      
⬜ 3      public class Message 
⬜ 4      {
🟩 5      	private int id;
⬜ 6      	private String subject;
⬜ 7      	private String content;
⬜ 8      	private int sourceId;
```

<br/>

### Implement `getId`[<sup id="jkYgg">↓</sup>](#f-jkYgg) and `setId`[<sup id="1DEyU7">↓</sup>](#f-1DEyU7)

Here is how we do it for `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java`:

<br/>



<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java
```java
⬜ 25         	
⬜ 26         }
⬜ 27         
🟩 28         public int getId() 
🟩 29         {
🟩 30             return id;
🟩 31         }
⬜ 32         
⬜ 33         public void setId(int id) 
⬜ 34         {
```

<br/>



<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java
```java
⬜ 30             return id;
⬜ 31         }
⬜ 32         
🟩 33         public void setId(int id) 
🟩 34         {
🟩 35             this.id = id;
🟩 36         }
⬜ 37     
⬜ 38         public String getSubject() 
⬜ 39         {
```

<br/>

### Update additional files with the new class

Every time we add new `📄 UTest.Ex.DAL/src/main/java/dal/objects`, we reference them in a few locations.

We will still look at `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java` as our example.

<br/>

Don't forget to add the new class to `📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java`, like so:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java
```java
⬜ 59             return (User)lst.get(0);
⬜ 60     	}
⬜ 61     	
🟩 62     	public void SaveMessage(Message msg)
⬜ 63     	{
⬜ 64     		Session session = sessionFactory.openSession();
⬜ 65             session.beginTransaction();
```

<br/>

In addition, in the same file:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java
```java
⬜ 81             session.close();
⬜ 82     	}
⬜ 83     	
🟩 84     	public List<Message> GetUnreadMessages(int userId)
⬜ 85     	{
⬜ 86     		Session session = sessionFactory.openSession();
⬜ 87             
🟩 88             String strSql ="from Message msg " +
⬜ 89                            "where destinationId = :destinationId"
⬜ 90                            + " and isRead = FALSE";
⬜ 91             
```

<br/>

Also in the same file:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java
```java
⬜ 96     
⬜ 97             session.close();
⬜ 98             
🟩 99             List<Message> msgList = new LinkedList<Message>();
⬜ 100            msgList.addAll(lst);
⬜ 101            
⬜ 102            return msgList;
⬜ 103    	}
⬜ 104    	
⬜ 105    	// Search text in subject or content of the user messages
🟩 106    	public List<Message> Find(int userId, String text)
⬜ 107    	{
⬜ 108    		Session session = sessionFactory.openSession();
⬜ 109            
🟩 110            String strSql ="from Message msg " +
⬜ 111                           "where destinationId = :userId " +
⬜ 112            		       "and (subject like :text"+
⬜ 113                           " or content like :text)";
```

<br/>

Also notice in the same file:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/conn/Connection.java
```java
⬜ 120    
⬜ 121            session.close();
⬜ 122            
🟩 123            List<Message> msgList = new LinkedList<Message>();
⬜ 124            msgList.addAll(lst);
⬜ 125            
⬜ 126            return msgList;
```

<br/>

Add the new class to `📄 UTest.Ex.DAL/src/main/java/dal/conn/IConnection.java`, for example:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/java/dal/conn/IConnection.java
```java
⬜ 8      {
⬜ 9      	public void init();
⬜ 10     	public User GetUser(String emailAddress, String password);
🟩 11     	public void SaveMessage(Message msg);
🟩 12     	public List<Message> GetUnreadMessages(int userId);
🟩 13     	public List<Message> Find(int userId, String query);
⬜ 14     	public UserToken GetUserToken(int userId);
⬜ 15     	public UserToken GetUserToken(String token);
⬜ 16     	public void SaveUserToken(UserToken ut);
```

<br/>

We modify `📄 UTest.Ex.DAL/src/main/resources/hibernate.cfg.xml`, for instance:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/src/main/resources/hibernate.cfg.xml
```xml
⬜ 24     
⬜ 25        <!-- List of XML mapping files -->
⬜ 26        <mapping resource="User.hbm.xml"/>
🟩 27        <mapping resource="Message.hbm.xml"/>
⬜ 28        <mapping resource="UserToken.xml"/>
⬜ 29     
⬜ 30     </session-factory>
```

<br/>

Update `📄 UTest.Ex.DAL/target/classes/hibernate.cfg.xml`, as we do with `📄 UTest.Ex.DAL/src/main/java/dal/objects/Message.java` here:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex.DAL/target/classes/hibernate.cfg.xml
```xml
⬜ 24     
⬜ 25        <!-- List of XML mapping files -->
⬜ 26        <mapping resource="User.hbm.xml"/>
🟩 27        <mapping resource="Message.hbm.xml"/>
⬜ 28        <mapping resource="UserToken.xml"/>
⬜ 29     
⬜ 30     </session-factory>
```

<br/>

Add the new class to `📄 UTest.Ex/src/main/java/Mail/Service/MailService.java`, as seen here:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex/src/main/java/Mail/Service/MailService.java
```java
⬜ 51     		
⬜ 52     		if(destUser != null)
⬜ 53     		{
🟩 54     			Message newMsg = new Message(subject, content, sourceId,destUser.getId());
⬜ 55     			connection.SaveMessage(newMsg);
⬜ 56     		}
⬜ 57     		else
```

<br/>

Additionally in the same file:
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 UTest.Ex/src/main/java/Mail/Service/MailService.java
```java
⬜ 60     		}
⬜ 61     	}
⬜ 62     	
🟩 63         public List<Message> getUnreadMessages(int userId)
⬜ 64         {
⬜ 65             return connection.GetUnreadMessages(userId);
⬜ 66         }
⬜ 67         
🟩 68         public List<Message> Find(int userId, String query)
⬜ 69         {
⬜ 70         	return connection.Find(userId, query);
⬜ 71         }
```

<br/>

<!-- THIS IS AN AUTOGENERATED SECTION. DO NOT EDIT THIS SECTION DIRECTLY -->
### Swimm Note

<span id="f-Z1tG0Rl">dal.objects</span>[^](#Z1tG0Rl) - "UTest.Ex.DAL/src/main/java/dal/objects/Message.java" L1
```java
package dal.objects;
```

<span id="f-jkYgg">getId</span>[^](#jkYgg) - "UTest.Ex.DAL/src/main/java/dal/objects/Message.java" L28
```java
    public int getId() 
```

<span id="f-Z1eaaFk">id</span>[^](#Z1eaaFk) - "UTest.Ex.DAL/src/main/java/dal/objects/Message.java" L5
```java
	private int id;
```

<span id="f-2kddmI">Message</span>[^](#2kddmI) - "UTest.Ex.DAL/src/main/java/dal/objects/Message.java" L3
```java
public class Message 
```

<span id="f-1DEyU7">setId</span>[^](#1DEyU7) - "UTest.Ex.DAL/src/main/java/dal/objects/Message.java" L33
```java
    public void setId(int id) 
```

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://swimm-web-app.web.app/repos/ls4DA2fLasmQuEbT4ipw/docs/dv16s).