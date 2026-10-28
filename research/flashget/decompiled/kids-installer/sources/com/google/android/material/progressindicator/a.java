package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AnimatorDurationScaleProvider.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static float f13811a = 1.0f;

    @m1
    public static void b(float f6) {
        f13811a = f6;
    }

    public float a(@o0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, ProtectedSandApp.s("ቈ"), 1.0f);
    }
}
