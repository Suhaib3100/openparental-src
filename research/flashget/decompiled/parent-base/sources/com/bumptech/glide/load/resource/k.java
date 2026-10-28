package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* compiled from: UnitTransformation.java */
/* loaded from: classes3.dex */
public final class k<T> implements m<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final m<?> f44663c = new k();

    private k() {
    }

    @o0
    public static <T> k<T> c() {
        return (k) f44663c;
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<T> a(@o0 Context context, @o0 u<T> uVar, int i4, int i5) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
    }
}
