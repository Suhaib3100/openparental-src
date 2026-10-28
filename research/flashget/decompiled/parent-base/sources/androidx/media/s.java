package androidx.media;

import androidx.annotation.c1;
import androidx.media.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f30930f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f30931g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f30932h = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f30933a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30934b;

    /* renamed from: c, reason: collision with root package name */
    private int f30935c;

    /* renamed from: d, reason: collision with root package name */
    private b f30936d;

    /* renamed from: e, reason: collision with root package name */
    private Object f30937e;

    /* compiled from: VolumeProviderCompat.java */
    class a implements t.b {
        a() {
        }

        @Override // androidx.media.t.b
        public void a(int i4) {
            s.this.f(i4);
        }

        @Override // androidx.media.t.b
        public void b(int i4) {
            s.this.e(i4);
        }
    }

    /* compiled from: VolumeProviderCompat.java */
    public static abstract class b {
        public abstract void onVolumeChanged(s sVar);
    }

    /* compiled from: VolumeProviderCompat.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public s(int i4, int i5, int i6) {
        this.f30933a = i4;
        this.f30934b = i5;
        this.f30935c = i6;
    }

    public final int a() {
        return this.f30935c;
    }

    public final int b() {
        return this.f30934b;
    }

    public final int c() {
        return this.f30933a;
    }

    public Object d() {
        if (this.f30937e == null) {
            this.f30937e = new t.a(this.f30933a, this.f30934b, this.f30935c, new a());
        }
        return this.f30937e;
    }

    public void e(int i4) {
    }

    public void f(int i4) {
    }

    public void g(b bVar) {
        this.f30936d = bVar;
    }

    public final void h(int i4) {
        this.f30935c = i4;
        Object d5 = d();
        if (d5 != null) {
            t.b(d5, i4);
        }
        b bVar = this.f30936d;
        if (bVar != null) {
            bVar.onVolumeChanged(this);
        }
    }
}
