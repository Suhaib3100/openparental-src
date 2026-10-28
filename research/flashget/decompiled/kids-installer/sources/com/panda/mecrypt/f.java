package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* compiled from: CheckUtils.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21486a = ProtectedSandApp.s("㗫");

    public static void a(Object obj, String str) {
        String s5 = ProtectedSandApp.s("㗪");
        if (obj == null) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, s5));
        }
        if ((obj instanceof String) && obj.toString().trim().length() == 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, s5));
        }
        if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, s5));
        }
        if ((obj instanceof Collection) && ((Collection) obj).isEmpty()) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, s5));
        }
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, s5));
        }
    }
}
