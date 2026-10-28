package com.google.android.material.slider;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;

/* compiled from: BasicLabelFormatter.java */
/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final long f14178d = 1000000000000L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f14179e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f14180f = 1000000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f14181g = 1000;

    @Override // com.google.android.material.slider.d
    @o0
    public String a(float f6) {
        return f6 >= 1.0E12f ? String.format(Locale.US, ProtectedSandApp.s("✝"), Float.valueOf(f6 / 1.0E12f)) : f6 >= 1.0E9f ? String.format(Locale.US, ProtectedSandApp.s("✞"), Float.valueOf(f6 / 1.0E9f)) : f6 >= 1000000.0f ? String.format(Locale.US, ProtectedSandApp.s("✟"), Float.valueOf(f6 / 1000000.0f)) : f6 >= 1000.0f ? String.format(Locale.US, ProtectedSandApp.s("✠"), Float.valueOf(f6 / 1000.0f)) : String.format(Locale.US, ProtectedSandApp.s("✡"), Float.valueOf(f6));
    }
}
