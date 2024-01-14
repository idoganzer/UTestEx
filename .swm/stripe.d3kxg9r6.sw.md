---
title: Stripe
---
# Setting up the Stripe API keys

To integrate with the Stripe API, we need to set up the necessary API keys. This section will guide you through the process of obtaining and configuring the Stripe API keys in our codebase.

## Obtaining the API keys

To obtain the Stripe API keys, follow these steps:

1. Log in to the Stripe Dashboard.
2. Navigate to the API section.
3. Generate a new set of API keys for your integration.

Once you have obtained the API keys, we need to configure them in our codebase.

## Configuring the API keys

To configure the Stripe API keys in our codebase, follow these steps:

1. Open the `config.js` file in the root directory of our project.
2. Locate the section where the Stripe API keys are defined.
3. Replace the placeholder values with the actual API keys obtained from the Stripe Dashboard.

```javascript
// config.js

module.exports = {
  stripe: {
    apiKey: '
```

&nbsp;

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

' } };

```

Make sure to save the changes after updating the API keys.

## Verifying the configuration

To verify that the Stripe API keys are correctly configured, you can run a test transaction in our application. If the transaction goes through successfully, it means that the API keys are set up correctly.

Congratulations! You have successfully set up the Stripe API keys in our codebase. Now we can
```

# Creating a payment with Stripe

In our codebase, we have implemented a seamless integration with the Stripe payment gateway. This section will explain how we create a payment using Stripe and the design decisions made during the integration process.

To interact with Stripe, we utilize a wrapper module that provides a simplified interface for accessing the Stripe API. This wrapper module can be found in `path/to/stripeWrapper.js` (see snippet).

To create a payment with Stripe, we follow the steps outlined below:

1. **Initialize the Stripe client**: Before creating a payment, we need to initialize the Stripe client by providing our API keys. This is done in the `initStripeClient` function in `path/to/stripeWrapper.js` (see snippet).

2. **Create a payment intent**: To initiate a payment, we create a payment intent using the `createPaymentIntent` function in `path/to/stripeWrapper.js` (see snippet). This function takes the necessary parameters such as the amount, currency, and customer information.

3. **Collect payment details**: Once the payment intent is created, we collect the necessary payment details from the user. This can include credit card information, billing address, and any additional required information.

4. **Confirm the payment**: After collecting the payment details, we confirm the payment by calling the `confirmPayment` function in `path/to/stripeWrapper.js` (see snippet). This function takes the payment intent ID and the collected payment details as parameters.

&nbsp;

<SwmMeta version="3.0.0" repo-id="ls4DA2fLasmQuEbT4ipw" repo-name="UTestEx"><sup>Powered by [Swimm](https://swimm-web-app.web.app/)</sup></SwmMeta>
