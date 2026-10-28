package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.q0;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ShapeFill.java */
/* loaded from: classes3.dex */
public class o implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39049a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f39050b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39051c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.a f39052d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.d f39053e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39054f;

    public o(String str, boolean z4, Path.FillType fillType, @q0 com.airbnb.lottie.model.animatable.a aVar, @q0 com.airbnb.lottie.model.animatable.d dVar, boolean z5) {
        this.f39051c = str;
        this.f39049a = z4;
        this.f39050b = fillType;
        this.f39052d = aVar;
        this.f39053e = dVar;
        this.f39054f = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(n0Var, bVar, this);
    }

    @q0
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f39052d;
    }

    public Path.FillType c() {
        return this.f39050b;
    }

    public String d() {
        return this.f39051c;
    }

    @q0
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f39053e;
    }

    public boolean f() {
        return this.f39054f;
    }

    public String toString() {
        return androidx.compose.animation.l.a(new StringBuilder(ProtectedSandApp.s("ŀ")), this.f39049a, '}');
    }
}
