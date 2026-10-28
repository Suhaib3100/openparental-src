package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AnimatorDurationScaleProvider.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static float f53634a = 1.0f;

    @m1
    public static void b(float f4) {
        f53634a = f4;
    }

    public float a(@o0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, ProtectedSandApp.s("\uf201"), 1.0f);
    }
}
