# Typer

<img src="/image/roboto.png" width="400" align="right" hspace = "20">

*A Roboto font Gradle base dependency.*

Super easy to use font library in Android. It offers the most popular fonts used by developers today, and it solves the leak issues that is commonly done by developers.

This library wraps the complexity of adding a font resource in your project and recycle those recently created font inorder to maximize your app's perfromance.

## Usage

Add the this dependency to your Gradle file

```gradle
dependencies {
    compile 'com.elmargomez.typer:typerlib:1.0.0'
}
```

To use the library in your project

```java
TextView txtView1 = (TextView) findViewById(R.id.yourTxtView1);
TextView txtView2 = (TextView) findViewById(R.id.yourTxtView2);
TextView txtView3 = (TextView) findViewById(R.id.yourTxtView3);
TextView txtView4 = (TextView) findViewById(R.id.yourTxtView4);

txtView1.setTypeface(Typer.set(yourContext).getFont(Font.ROBOTO_REGULAR));
txtView2.setTypeface(Typer.set(yourContext).getFont(Font.ROBOTO_CONDENSED_ITALIC));
txtView3.setTypeface(Typer.set(yourContext).getFont(Font.ROBOTO_THIN));
txtView4.setTypeface(Typer.set(yourContext).getFont(Font.ROBOTO_BOLD));
```

Tip:
To view all available fonts use Android Studio Auto complete after the class "Font." by pressing [ctrl] + [space].

## License

```
Copyright 2015 Elmar Rhex Gomez

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
