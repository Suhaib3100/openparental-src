package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: ManufacturerUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f53435a = ProtectedSandApp.s("\uf1dc");

    /* renamed from: b, reason: collision with root package name */
    private static final String f53436b = ProtectedSandApp.s("\uf1de");

    /* renamed from: c, reason: collision with root package name */
    private static final String f53437c = ProtectedSandApp.s("\uf1dd");

    private e() {
    }

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("\uf1dc"));
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("\uf1dd"));
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("\uf1de"));
    }
}
