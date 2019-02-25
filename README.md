# Typer

<img src="/image/roboto.png" width="400" align="right" hspace = "20">

*A calligraphy library for Android that supports Roboto fonts.*

This library wraps the complexity of adding font resources in your project. Fonts are also lazy loaded so that it will not be recreated again while also preventing loading those unused fonts (which helps preventing an unexpected Out of Memory Error!).

## Usage

Add this dependency to your Gradle file

```gradle
dependencies {
    implementation 'com.rhexgomez.typer:typer-roboto:2.0.0'
}
```

#### Java

```java
    TextView regularTextView = findViewById(R.id.regular_textview);
    regularTextView.setTypeface(TyperRoboto.ROBOTO_REGULAR());

    TextView italicTextView = findViewById(R.id.italic_textview);
    italicTextView.setTypeface(TyperRoboto.ROBOTO_ITALIC());

    TextView boldTextView = findViewById(R.id.bold_textview);
    boldTextView.setTypeface(TyperRoboto.ROBOTO_BOLD());

    TextView thinTextView = findViewById(R.id.thin_textview);
    thinTextView.setTypeface(TyperRoboto.ROBOTO_THIN());
```
#### Kotlin

```kotlin
    regular_textview.apply { typeface = TyperRoboto.ROBOTO_REGULAR }
    italic_textview.apply { typeface = TyperRoboto.ROBOTO_ITALIC }
    bold_textview.apply { typeface = TyperRoboto.ROBOTO_BOLD }
    thin_textview.apply { typeface = TyperRoboto.ROBOTO_THIN }
```
Tip:
To view all available fonts use Android Studio Auto complete after the class "TyperRoboto." by pressing [ctrl] + [space].

## So what if I want to apply the Roboto font in my entire app?

The typer library provides a `<style>` which you can use in your AndroidManifest. The simple example below will demonstrate
    on how to do that:

But first you need to be aware that this will only works if you're using `AppCompatTextView` and `AppCompatEditText` and the `minSdkVersion` is 16.

```gradle
dependencies {
    implementation 'com.rhexgomez.typer:typer-roboto:2.0.0'
    implementation 'com.android.support:appcompat-v7:{latest version here}'
}
```

AndroidManifest
```xml
<application
        android:label="@string/app_name"
        android:theme="@style/TyperLib.Theme.Roboto.ThinItalic"
        ... >
```
The above theme will set the `AppCompatTextView` and `AppCompatEditText` default font to `ThinItalic` off course we have other fonts provided in the box too and not just italic.

 - TyperLib.Theme.Roboto.Regular (recommended)
 - TyperLib.Theme.Roboto.Bold
 - TyperLib.Theme.Roboto.BoldItalic
 - TyperLib.Theme.Roboto.Italic
 - TyperLib.Theme.Roboto.Light
 - TyperLib.Theme.Roboto.LightItalic
 - TyperLib.Theme.Roboto.Thin
 - TyperLib.Theme.Roboto.ThinItalic

## Feedbacks, Comments and Suggestions are appreciated!

Feel free to use the Issue tracker or message me in Twitter @rhexgomez

## License

```
Copyright 2015 Rhex Gomez

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
