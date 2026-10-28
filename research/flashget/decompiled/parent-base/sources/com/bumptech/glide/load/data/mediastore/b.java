package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MediaStoreUtil.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f43797a = 512;

    /* renamed from: b, reason: collision with root package name */
    private static final int f43798b = 384;

    private b() {
    }

    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains(ProtectedSandApp.s("ࡷ"));
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && ProtectedSandApp.s("ࡸ").equals(uri.getScheme()) && ProtectedSandApp.s("ࡹ").equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i4, int i5) {
        return i4 != Integer.MIN_VALUE && i5 != Integer.MIN_VALUE && i4 <= 512 && i5 <= f43798b;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains(ProtectedSandApp.s("ࡺ"));
    }
}
