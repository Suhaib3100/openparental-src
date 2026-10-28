package com.tencent.cos.xml.utils;

/* loaded from: classes7.dex */
public class ThrowableUtils {
    public static Throwable getRootCause(Throwable th) {
        Throwable cause = th.getCause();
        return cause == null ? th : getRootCause(cause);
    }
}
