package com.google.firebase.crashlytics.internal.settings;

/* compiled from: Settings.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f16368a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16369b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16370c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16372e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16373f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16374g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16375h;

    /* compiled from: Settings.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16376a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16377b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16378c;

        public a(boolean z5, boolean z6, boolean z7) {
            this.f16376a = z5;
            this.f16377b = z6;
            this.f16378c = z7;
        }
    }

    /* compiled from: Settings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16379a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16380b;

        public b(int i5, int i6) {
            this.f16379a = i5;
            this.f16380b = i6;
        }
    }

    public d(long j5, b bVar, a aVar, int i5, int i6, double d6, double d7, int i7) {
        this.f16370c = j5;
        this.f16368a = bVar;
        this.f16369b = aVar;
        this.f16371d = i5;
        this.f16372e = i6;
        this.f16373f = d6;
        this.f16374g = d7;
        this.f16375h = i7;
    }

    public boolean a(long j5) {
        return this.f16370c < j5;
    }
}
