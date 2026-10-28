package com.nostra13.universalimageloader.core.assist;

/* compiled from: FailReason.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f70260a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f70261b;

    /* compiled from: FailReason.java */
    public enum a {
        IO_ERROR,
        DECODING_ERROR,
        NETWORK_DENIED,
        OUT_OF_MEMORY,
        UNKNOWN
    }

    public b(a aVar, Throwable th) {
        this.f70260a = aVar;
        this.f70261b = th;
    }

    public Throwable a() {
        return this.f70261b;
    }

    public a b() {
        return this.f70260a;
    }
}
