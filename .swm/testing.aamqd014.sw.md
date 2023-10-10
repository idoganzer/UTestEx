---
id: aamqd014
title: Testing
file_version: 1.1.3
app_version: 1.18.0
---

## How the login page works?

<br/>

The `LoginPage.vue` file contains the Vue component for the login page. It includes a form for the user to input their email and password, and options to log in with Google or SSO. The `login`<swm-token data-swm-token=":UTest.Ex/src/main/java/Mail/MailController.java:28:8:8:`    public @ResponseBody String login(`"/> method is triggered when the form is submitted, which handles the authentication process

This piece of code is responsible for rendering the login page and handling the login process.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
<!-- NOTE-swimm-repo ::veezvxCuzpPrRLLXWD2E:: -->
### 📄 apps/web/src/common/pages/LoginPage.vue
```vue
1      <template>
2        <AuthBaseLayout :title="title" :subtitle="subtitle" class="card-container">
3          <div class="content">
4            <form class="form" @keydown.enter.prevent="login" @submit.prevent="login">
5              <TextField
6                class="input"
7                data-testid="email-field"
8                v-model.trim="email"
9                :error="emailError"
10               label="Work Email"
11               type="email"
12               focus-first
13               required
14             />
15             <TextField
16               v-model="password"
17               :error="passwordError"
18               label="Password"
19               type="password"
20               class="input"
21               data-testid="password-field"
```

<br/>

The `login`<swm-token data-swm-token=":UTest.Ex/src/main/java/Mail/MailController.java:28:8:8:`    public @ResponseBody String login(`"/> function in `welcome.ts` sends a 'login' message using the `postMessage`<swm-token data-swm-token="veezvxCuzpPrRLLXWD2E:ide/extensions/vscode/src/welcomePanel.ts:80:5:5:`    async function postMessage(message: WelcomeIncomingMessage) {`"/> function. This is part of the communication between the webview and the IDE extension

This piece of code is responsible for initiating the login process from the IDE extension's welcome panel.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
<!-- NOTE-swimm-repo ::veezvxCuzpPrRLLXWD2E:: -->
### 📄 ide/webviews/src/stores/welcome.ts
```typescript
152      function login() {
153        postMessage({ type: 'login' });
154      }
```

<br/>

The `login`<swm-token data-swm-token=":UTest.Ex/src/main/java/Mail/MailController.java:28:8:8:`    public @ResponseBody String login(`"/> function in `AuthService.kt` retrieves the user's credentials from a secure storage and initiates the login process. If the user's credentials are not found, it shows a login notification

This piece of code is responsible for initiating the login process from the `IntelliJ`<swm-token data-swm-token="veezvxCuzpPrRLLXWD2E:apps/cli/commands/log-message.ts:7:1:1:`  IntelliJ = &#39;INTELLIJ&#39;,`"/> IDE extension.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
<!-- NOTE-swimm-repo ::veezvxCuzpPrRLLXWD2E:: -->
### 📄 ide/extensions/intellij/src/main/kotlin/io/swimm/intellij/services/AuthService.kt
```kotlin
47         private fun login() {
48             val userResponse: ExchangeFirebaseCustomTokenResponseUser? =
49                 service<PasswordSafeService>().getUserResponseFromSafe()
50             if (userResponse != null) {
51                 setSwimmTokenAndInitServer(userResponse)
52             } else {
53                 showLoginNotification()
54             }
55         }
```

<br/>

The `login`<swm-token data-swm-token=":UTest.Ex/src/main/java/Mail/MailController.java:28:8:8:`    public @ResponseBody String login(`"/> function in `WelcomePanel.vue` triggers the `login`<swm-token data-swm-token=":UTest.Ex/src/main/java/Mail/MailController.java:28:8:8:`    public @ResponseBody String login(`"/> method from the `welcomeStore`, which sends a 'login' message to the IDE extension

This piece of code is responsible for initiating the login process when the login button is clicked in the welcome panel of the webview.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
<!-- NOTE-swimm-repo ::veezvxCuzpPrRLLXWD2E:: -->
### 📄 ide/webviews/src/components/WelcomePanel.vue
```vue
11     function login() {
12       welcomeStore.login();
13     }
```

<br/>

The `IDELoginPage.vue` file contains the Vue component for the IDE login page. It includes a button to continue the authentication process, which triggers the `redirectToIDE` method. This method retrieves the user's token and redirects to the IDE authentication URL

This piece of code is responsible for handling the IDE login process.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
<!-- NOTE-swimm-repo ::veezvxCuzpPrRLLXWD2E:: -->
### 📄 apps/web/src/common/pages/IDELoginPage.vue
```vue
1      <template>
2        <div class="wrapper">
3          <div class="authorization-wrapper">
4            <div class="connection-wrapper">
5              <img v-if="isVscode" class="logo pushed-logo" src="@/assets/vscode-icon.svg" />
6              <img v-else-if="isJetbrains" class="logo" height="100" width="100" src="@/assets/Jetbrains-logo.svg" />
7              <img
8                v-if="isVscode || isJetbrains"
9                class="logo connection-logo pushed-logo"
10               src="@/assets/connection-icon.svg"
11             />
12             <img class="logo logo-swimm" src="@/assets/logocolored.svg" />
13           </div>
14           <div class="authorize-title">Authorize {{ getIdeName }} to access Swimm</div>
15           <div class="authorize-info">
16             If you initiated this authorization from {{ getIdeName }}, click 'Continue' to authorize access to Swimm
17           </div>
18           <Action button-type="button" @click="redirectToIDE">Continue</Action>
19           <div class="cancel-link" @click="closeWindow">Do not authorize</div>
20         </div>
21       </div>
```

<br/>

This file was generated by Swimm. [Click here to view it in the app](http://localhost:5001/repos/ls4DA2fLasmQuEbT4ipw/docs/aamqd014).
