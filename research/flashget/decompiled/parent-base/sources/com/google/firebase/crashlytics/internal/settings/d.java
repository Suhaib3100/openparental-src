package com.google.firebase.crashlytics.internal.settings;

/* compiled from: Settings.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f59494a;

    /* renamed from: b, reason: collision with root package name */
    public final a f59495b;

    /* renamed from: c, reason: collision with root package name */
    public final long f59496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59497d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59498e;

    /* renamed from: f, reason: collision with root package name */
    public final double f59499f;

    /* renamed from: g, reason: collision with root package name */
    public final double f59500g;

    /* renamed from: h, reason: collision with root package name */
    public final int f59501h;

    /* compiled from: Settings.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f59502a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f59503b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f59504c;

        public a(boolean z4, boolean z5, boolean z6) {
            this.f59502a = z4;
            this.f59503b = z5;
            this.f59504c = z6;
        }
    }

    /* compiled from: Settings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f59505a;

        /* renamed from: b, reason: collision with root package name */
        public final int f59506b;

        public b(int i4, int i5) {
            this.f59505a = i4;
            this.f59506b = i5;
        }
    }

    public d(long j4, b bVar, a aVar, int i4, int i5, double d5, double d6, int i6) {
        this.f59496c = j4;
        this.f59494a = bVar;
        this.f59495b = aVar;
        this.f59497d = i4;
        this.f59498e = i5;
        this.f59499f = d5;
        this.f59500g = d6;
        this.f59501h = i6;
    }

    public boolean a(long j4) {
        return this.f59496c < j4;
    }
}
