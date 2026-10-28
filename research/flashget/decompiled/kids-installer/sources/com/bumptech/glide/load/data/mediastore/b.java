package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MediaStoreUtil.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11091a = 512;

    /* renamed from: b, reason: collision with root package name */
    private static final int f11092b = 384;

    private b() {
    }

    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && ProtectedSandApp.s("ą").equals(uri.getScheme()) && ProtectedSandApp.s("Ć").equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i5, int i6) {
        return i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && i5 <= 512 && i6 <= f11092b;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(ProtectedSandApp.s("ć"));
    }
}
