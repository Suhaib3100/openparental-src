package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.c1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;

/* compiled from: ManufacturerUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13653a = ProtectedSandApp.s("ሶ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f13654b = ProtectedSandApp.s("ሷ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f13655c = ProtectedSandApp.s("ሸ");

    private e() {
    }

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("ሳ"));
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("ሴ"));
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(ProtectedSandApp.s("ስ"));
    }
}
