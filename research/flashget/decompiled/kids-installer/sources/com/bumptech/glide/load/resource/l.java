package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* compiled from: UnitTransformation.java */
/* loaded from: classes3.dex */
public final class l<T> implements m<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final m<?> f11884c = new l();

    private l() {
    }

    @o0
    public static <T> l<T> c() {
        return (l) f11884c;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<T> b(@o0 Context context, @o0 u<T> uVar, int i5, int i6) {
        return uVar;
    }
}
