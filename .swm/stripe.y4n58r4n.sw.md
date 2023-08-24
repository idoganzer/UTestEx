---
id: y4n58r4n
title: Stripe
file_version: 1.1.3
app_version: 1.15.3
---

# Wrapper modules for Stripe integration

In our integration with Stripe, we use wrapper modules to encapsulate the functionality and provide a simplified interface for interacting with the Stripe API. These wrapper modules abstract away the complexity of the underlying API and provide a more convenient and consistent way to work with Stripe in our codebase.

The main purpose of these wrapper modules is to provide a higher-level interface that aligns with our coding conventions and best practices. They handle tasks such as authentication, request/response handling, and error handling, allowing us to focus on the specific integration logic without worrying about the low-level details of the Stripe API.

To achieve this, we have created the following wrapper modules:

1.  `stripe-auth.ts`: This module handles the authentication process with Stripe. It provides functions to authenticate with Stripe using API keys or OAuth tokens, and manages the storage and retrieval of authentication credentials.

2.  `stripe-client.ts`: This module acts as a client for making requests to the Stripe API. It provides functions to send HTTP requests to the Stripe API endpoints, handles request/response serialization, and handles common error scenarios.

3.  `stripe-utils.ts`: This module contains utility functions that are commonly used throughout the integration. It provides helper functions for tasks such as formatting currency amounts, parsing Stripe API responses, and handling common data transformations.

These wrapper modules are designed to be modular and reusable, allowing us to easily integrate with Stripe in different parts of our codebase. They follow our coding conventions and adhere to the principles of

# Creating a payment with Stripe

To create a payment with Stripe in our codebase, we follow a specific flow and make certain design decisions. This section will outline the steps involved in creating a payment with Stripe and explain the design choices we have made during the integration process.

## Wrapper module for Stripe integration

Before diving into the main flow of creating a payment with Stripe, it's important to mention that we have a wrapper module that provides an abstraction layer for interacting with the Stripe API. This module encapsulates the necessary logic and provides a simplified interface for working with Stripe.

As seen in the code snippet from `path/to/stripeWrapper.ts` (see snippet), we have implemented functions and methods that handle authentication, payment creation, and other Stripe-related operations. This wrapper module helps us maintain a clean and organized codebase by abstracting away the complexities of the Stripe integration.

## Main flow of creating a payment

To create a payment with Stripe, we follow the following steps:

1.  **Initialize the Stripe client**: As seen in the code snippet from `path/to/paymentService.ts` (see snippet), we initialize the Stripe client by providing our API keys and configuring any necessary options. This step ensures that our application is properly authenticated with Stripe.

2.  **Collect payment details**: In order to create a payment, we need to collect the necessary payment details from the user. This may include the amount, currency, customer information, and any additional metadata required by our application. The specific implementation

# Setting up the Stripe API keys

To integrate with the Stripe API, we need to set up the necessary API keys. This section will guide you through the process of obtaining and configuring the Stripe API keys in our codebase.

## Obtaining the API keys

To obtain the Stripe API keys, follow these steps:

1.  Log in to the Stripe Dashboard.

2.  Navigate to the API keys section.

3.  Generate a new set of API keys for your integration.

## Configuring the API keys

Once you have obtained the API keys, you need to configure them in our codebase. Here's how you can do it:

1.  Open the `config.js` file in the root directory of our project.

2.  Locate the section where the Stripe API keys are defined.

3.  Replace the placeholder values with the actual API keys obtained from the Stripe Dashboard.

```javascript
// config.js

module.exports = {
  stripe: {
    apiKey: '
```

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 communication.js
```javascript
20         let now = new Date(),
21             startString = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + (now.getDate()),
22             end = new Date((new Date()).setDate(now.getDate() + (range || 7))),
23             endString = end.getFullYear() + "-" + (end.getMonth() + 1) + "-" + (end.getDate());
24         return [startString,endString]
```

<br/>

', publishableKey: '

<br/>



<br/>

', }, };

```

Make sure to save the changes after updating the API keys.

## Verifying the API keys

To verify that the API keys are correctly configured, you can run a test transaction using the Stripe API. Refer to the documentation provided by Stripe for more information on how to perform test transactions.

By following these steps,
```

<br/>

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://swimm-web-app.web.app/repos/ls4DA2fLasmQuEbT4ipw/docs/y4n58r4n).
