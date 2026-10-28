package com.lxj.xpopup.util;

import android.annotation.SuppressLint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionConstants.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f69792a = ProtectedSandApp.s("៛\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f69793b = {ProtectedSandApp.s("ៜ\u0001"), ProtectedSandApp.s("៝\u0001")};

    /* compiled from: PermissionConstants.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static String[] a(final String permission) {
        return permission == null ? new String[0] : !permission.equals(ProtectedSandApp.s("៛\u0001")) ? new String[]{permission} : f69793b;
    }
}
