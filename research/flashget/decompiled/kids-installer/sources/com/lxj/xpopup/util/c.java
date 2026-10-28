package com.lxj.xpopup.util;

import android.annotation.SuppressLint;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionConstants.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21315a = ProtectedSandApp.s("㕓");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f21316b = {ProtectedSandApp.s("㕔"), ProtectedSandApp.s("㕕")};

    /* compiled from: PermissionConstants.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static String[] a(final String permission) {
        return permission == null ? new String[0] : !permission.equals(ProtectedSandApp.s("㕖")) ? new String[]{permission} : f21316b;
    }
}
