package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LottieImageAsset.java */
/* loaded from: classes3.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f39191a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39192b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39193c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39194d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39195e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.q0
    private Bitmap f39196f;

    @c1({c1.a.LIBRARY})
    public o0(int i4, int i5, String str, String str2, String str3) {
        this.f39191a = i4;
        this.f39192b = i5;
        this.f39193c = str;
        this.f39194d = str2;
        this.f39195e = str3;
    }

    @androidx.annotation.q0
    public Bitmap a() {
        return this.f39196f;
    }

    public String b() {
        return this.f39195e;
    }

    public String c() {
        return this.f39194d;
    }

    public int d() {
        return this.f39192b;
    }

    public String e() {
        return this.f39193c;
    }

    public int f() {
        return this.f39191a;
    }

    public boolean g() {
        return this.f39196f != null || (this.f39194d.startsWith(ProtectedSandApp.s("Ʈ")) && this.f39194d.indexOf(ProtectedSandApp.s("Ư")) > 0);
    }

    public void h(@androidx.annotation.q0 Bitmap bitmap) {
        this.f39196f = bitmap;
    }
}
