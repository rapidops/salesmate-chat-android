[![](https://jitpack.io/v/salesmate/salesmate-chat-android-sdk.svg)](https://github.com/salesmate/salesmate-chat-android)
[![Languages](https://img.shields.io/badge/languages-Kotlin%20%7C%20%20Java-green.svg?maxAge=2592000)](https://github.com/salesmate/salesmate-chat-android)

# Salesmate Chat Android
The Salesmate Chat Android SDK enables you to use Salesmate Messenger in your app, have conversations with your customers, and track events.

<img width="903" alt="Chat SDK@2x" src="https://user-images.githubusercontent.com/11227333/188421700-ac0da285-5ee1-4118-88f4-0035a3bbd088.png">

Add a chat widget to your app, and:

* Start talking to your visitors in minutes.
* Engage your customers during their buying process and help them make a purchase.
* Resolve your customer support queries quickly to increase customer satisfaction.

Salesmate Chats is an add-on and its pricing is based on the number of user seats you wish to add for users who will be managing chat communication.

You need to be an admin to install the Chats.
Learn about installing the Chats.

## Installation
Salesmate Chat for Android supports API 21 and above.

There are 2 options for installing Salesmate Chat SDK on your Android app.

### Option 1: Install Salesmate Chat SDK with Firebase Cloud Messaging (FCM)
Add the following dependency to your app's `build.gradle` file:
```groovy
dependencies {
    implementation 'com.github.salesmate:salesmate-chat-android-sdk:1.0.5'
    implementation 'com.google.firebase:firebase-messaging:23.0.6'
}
```

### Option 2: Install Salesmate Chat without Push Messaging

If you'd rather not have push notifications in your app, you can use this dependency:
```groovy
dependencies {
    implementation 'com.github.salesmate:salesmate-chat-android-sdk:1.0.5'
}
```

### JitPack
Add the following to your root build.gradle file
```groovy
allprojects {
    repositories {
      maven { url 'https://jitpack.io' }
      jcenter() // if required
    }
}
```
## Customer Support
👋 Contact us with any issues at [Salesmate available here](https://www.salesmate.io/). If you bump into any problems or need more support, just start a conversation using Android Chat SDK there and it will be immediately routed to our Customer Support Engineers.

## Sample Apps
A project with some basic example integrations is provided [here](https://github.com/salesmate/salesmate-chat-android).

## Setup and Configuration

* Our [installation guide](https://support.salesmate.io/hc/en-us/articles/9618350375193-Android-SDK-Installation) contains full setup and initialisation instructions.
* The [configuration guide](https://support.salesmate.io/hc/en-us/articles/9809670603417-Android-SDK-Configuration) provides info on how to configure Salesmate Chat for Android.
* Read our guide on Push Notifications for [FCM](https://support.salesmate.io/hc/en-us/articles/9810725938713-Android-SDK-Push-Notifications-FCM-).
* Please contact us on [Salesmate](https://www.salesmate.io/) with any questions you may have, we're only a message away!