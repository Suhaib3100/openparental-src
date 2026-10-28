package com.google.android.material.slider;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: BasicLabelFormatter.java */
/* loaded from: classes6.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final long f54046d = 1000000000000L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f54047e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f54048f = 1000000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f54049g = 1000;

    @Override // com.google.android.material.slider.d
    @o0
    public String a(float f4) {
        if (f4 >= 1.0E12f) {
            return String.format(Locale.US, ProtectedSandApp.s("\uf223"), Float.valueOf(f4 / 1.0E12f));
        }
        if (f4 >= 1.0E9f) {
            return String.format(Locale.US, ProtectedSandApp.s("\uf224"), Float.valueOf(f4 / 1.0E9f));
        }
        if (f4 >= 1000000.0f) {
            return String.format(Locale.US, ProtectedSandApp.s("\uf225"), Float.valueOf(f4 / 1000000.0f));
        }
        if (f4 >= 1000.0f) {
            return String.format(Locale.US, ProtectedSandApp.s("\uf226"), Float.valueOf(f4 / 1000.0f));
        }
        return String.format(Locale.US, ProtectedSandApp.s("\uf227"), Float.valueOf(f4));
    }
}
