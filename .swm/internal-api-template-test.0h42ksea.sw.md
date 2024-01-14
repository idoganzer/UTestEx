---
title: Internal API - template test
---
## Introduction

In this doc we will describe the API for {{API Name (e.g., sending Analytic Events)}} and how to use it correctly.

We use this API when {{use cases}}.

## API definition

## Simple usage

<SwmSnippetPlaceholder>

Select snippets of the various function's definition, so the reader can understand where the API is implemented

</SwmSnippetPlaceholder>

## 

<SwmSnippet path="/communication.js" line="20">

---

&nbsp;

```javascript
    let now = new Date(),
        startString = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + (now.getDate()),
        end = new Date((new Date()).setDate(now.getDate() + (range || 7))),
        endString = end.getFullYear() + "-" + (end.getMonth() + 1) + "-" + (end.getDate());
    return [startString,endString]
```

---

</SwmSnippet>

## Advanced usage: {{explain a scenario where this is needed}}

## Best practices and additional notes

When using this API, it is important to follow a few best practices and avoid some common mistakes.

<SwmSnippetPlaceholder>

Show an example of a best practice and explain why it is important to implement the API this way

</SwmSnippetPlaceholder>

<SwmMeta version="3.0.0" repo-id="ls4DA2fLasmQuEbT4ipw" repo-name="UTestEx"><sup>Powered by [Swimm](https://swimm-web-app.web.app/)</sup></SwmMeta>
