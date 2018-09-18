# jme-template
A sample jMonkeyEngine template project with basic configuration

## How to build ##
This library uses [gradle](https://gradle.org/gradle-download/) as build system, and comes with the gradle wrapper included.
So no prior installation on your computer is required! You can just use the `gradlew` or `gradlew.bat` executables in the root of the sources.

To start the application you just need to run the command:
```
gradlew run
```
![alt text](https://i.imgur.com/bwjXRbR.png "jMonkeyEngine template")

To run a full build, use:
```
gradlew build
```

To get an overview of all gradle tasks use:
```
gradlew tasks
```

## Running on OpenGL3.3 and higher
When you want to use OpenGL3.3 or higher, you need to include the `jme3-lwjgl3` library in your project.
Adapt this line in the `build.gradle` file:

> compile "org.jmonkeyengine:jme3-lwjgl:${jmeVersion}"

to

> compile "org.jmonkeyengine:jme3-lwjgl3:${jmeVersion}"

Make sure that other libraries aren't including older versions of lwjgl! This could lead to sealing exceptions thrown by java.lang.Security. 

### Known issues
The following are known issues and a way solve them.

**Error:**
java.lang.IllegalStateException: Please run the JVM with -XstartOnFirstThread and make sure a window toolkit other than GLFW (e.g. AWT or JavaFX) is not initialized.

**Solution:** 
Add `org.lwjgl.system.Configuration.GLFW_CHECK_THREAD0.set(false);` before calling the `application.start()` method.