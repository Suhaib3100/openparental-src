package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.q0;
import androidx.content.preferences.protobuf.o1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44736b = ProtectedSandApp.s("\u0a46");

    /* renamed from: c, reason: collision with root package name */
    private static final String f44737c = ProtectedSandApp.s("ੇ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f44738a;

    public e(Context context) {
        this.f44738a = context;
    }

    @q0
    private ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f44738a.getPackageManager().getApplicationInfo(this.f44738a.getPackageName(), 128);
    }

    private static c c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e4) {
                d(cls, e4);
            } catch (InstantiationException e5) {
                d(cls, e5);
            } catch (NoSuchMethodException e6) {
                d(cls, e6);
            } catch (InvocationTargetException e7) {
                d(cls, e7);
            }
            if (obj instanceof c) {
                return (c) obj;
            }
            throw new RuntimeException(androidx.databinding.a.a(ProtectedSandApp.s("\u0a43"), obj));
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a44"), e10);
        }
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException(o1.a(ProtectedSandApp.s("\u0a45"), cls), exc);
    }

    public List<c> b() {
        ApplicationInfo a5;
        String s4 = ProtectedSandApp.s("\u0a46");
        Log.isLoggable(s4, 3);
        ArrayList arrayList = new ArrayList();
        try {
            a5 = a();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable(s4, 6);
        }
        if (a5 != null && a5.metaData != null) {
            if (Log.isLoggable(s4, 2)) {
                Objects.toString(a5.metaData);
            }
            for (String str : a5.metaData.keySet()) {
                if (ProtectedSandApp.s("ੇ").equals(a5.metaData.get(str))) {
                    arrayList.add(c(str));
                    Log.isLoggable(s4, 3);
                }
            }
            Log.isLoggable(s4, 3);
            return arrayList;
        }
        Log.isLoggable(s4, 3);
        return arrayList;
    }
}
