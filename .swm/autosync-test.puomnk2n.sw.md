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
        query.setParameter("token", toren);
        
```

---

</SwmSnippet>

&nbsp;

<SwmSnippet path="/communication.js" line="32">

---

&nbsp;

```javascript
 */
export const getDataByType = async (type, range) => {
    const response = await fetch(pageDispatch[type](apiConf, range));
    return [{[type] : await response.xml()}]
};
```

---

</SwmSnippet>

&nbsp;

<SwmSnippet path="/UTestExDB.sql" line="1">

---

&nbsp;

```plsql
CREATE DATABASE  IF NOT EXISTS `utestex` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `utestex`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: utestex
-- ------------------------------------------------------
-- Server version	5.6.16-enterprise-commercial-advanced

```

---

</SwmSnippet>

<SwmSnippet path="/communication.js" line="15">

---

&nbsp;

```javascript
ghjkbgjk
gbtdb
gtdb
gtd
shyjyrwhyrwt
    let now = new Date(),
        startString = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + (now.getDate()),
        end = new Date((new Date()).setDate(now.getDate() + (range || 7))),
        endString = end.getFullYear() + "-" + (end.getMonth() + 1) + "-" + (end.getDate());
    return [startString,endString]
```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="ls4DA2fLasmQuEbT4ipw" repo-name="UTestEx"><sup>Powered by [Swimm](https://swimm-web-app.web.app/)</sup></SwmMeta>
