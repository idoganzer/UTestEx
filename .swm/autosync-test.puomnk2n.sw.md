---
title: Autosync test
---
bla&nbsp;

<SwmSnippet path="/UTest.Ex.DAL/src/main/java/dal/conn/Connection.java" line="72">

---

&nbsp;

```java
	
	public void SaveUserToken(UserToken ut)
	{
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(ut); 
 
        session.getTransaction().commit();
        session.close();
	}
	
```

---

</SwmSnippet>

bla 2

&nbsp;

<SwmSnippet path="/UTest.Ex.DAL/src/main/java/dal/conn/Connection.java" line="155">

---

&nbsp;

```java
        
        Query query = session.createQuery(strSql);
        query.setParameter("token", token);
        
```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="ls4DA2fLasmQuEbT4ipw" repo-name="UTestEx"><sup>Powered by [Swimm](https://swimm-web-app.web.app/)</sup></SwmMeta>
