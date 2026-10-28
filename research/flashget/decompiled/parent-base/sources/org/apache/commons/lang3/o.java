package org.apache.commons.lang3;

import java.net.URLClassLoader;
import java.util.Arrays;

/* compiled from: ClassLoaderUtils.java */
/* loaded from: classes6.dex */
public class o {
    public static String a(ClassLoader classLoader) {
        return classLoader instanceof URLClassLoader ? b((URLClassLoader) classLoader) : classLoader.toString();
    }

    public static String b(URLClassLoader uRLClassLoader) {
        return uRLClassLoader + Arrays.toString(uRLClassLoader.getURLs());
    }
}
