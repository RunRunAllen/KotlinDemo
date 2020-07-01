package com.example.kotlinDemo.Test;

import java.io.File;
import java.nio.charset.Charset;

import kotlin.io.FilesKt;

public class TestOneJa {

    public static void main(String[] args) {
        File file = new File("/sdcard");
        //java 调用 kotlin
        FilesKt.readText(file, Charset.defaultCharset());
    }
}
