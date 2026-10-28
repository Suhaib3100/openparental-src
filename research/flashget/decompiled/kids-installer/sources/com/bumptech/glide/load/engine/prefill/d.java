package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.bumptech.glide.util.l;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: PreFillType.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @m1
    static final Bitmap.Config f11448e = Bitmap.Config.RGB_565;

    /* renamed from: a, reason: collision with root package name */
    private final int f11449a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11450b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f11451c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11452d;

    /* compiled from: PreFillType.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11453a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11454b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f11455c;

        /* renamed from: d, reason: collision with root package name */
        private int f11456d;

        public a(int i5) {
            this(i5, i5);
        }

        d a() {
            return new d(this.f11453a, this.f11454b, this.f11455c, this.f11456d);
        }

        Bitmap.Config b() {
            return this.f11455c;
        }

        public a c(@q0 Bitmap.Config config) {
            this.f11455c = config;
            return this;
        }

        public a d(int i5) {
            if (i5 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ŗ"));
            }
            this.f11456d = i5;
            return this;
        }

        public a(int i5, int i6) {
            this.f11456d = 1;
            if (i5 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Ŗ"));
            }
            if (i6 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ŕ"));
            }
            this.f11453a = i5;
            this.f11454b = i6;
        }
    }

    d(int i5, int i6, Bitmap.Config config, int i7) {
        this.f11451c = (Bitmap.Config) l.e(config, ProtectedSandApp.s("Ř"));
        this.f11449a = i5;
        this.f11450b = i6;
        this.f11452d = i7;
    }

    Bitmap.Config a() {
        return this.f11451c;
    }

    int b() {
        return this.f11450b;
    }

    int c() {
        return this.f11452d;
    }

    int d() {
        return this.f11449a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11450b == dVar.f11450b && this.f11449a == dVar.f11449a && this.f11452d == dVar.f11452d && this.f11451c == dVar.f11451c;
    }

    public int hashCode() {
        return ((this.f11451c.hashCode() + (((this.f11449a * 31) + this.f11450b) * 31)) * 31) + this.f11452d;
    }

    public String toString() {
        return ProtectedSandApp.s("ř") + this.f11449a + ProtectedSandApp.s("Ś") + this.f11450b + ProtectedSandApp.s("ś") + this.f11451c + ProtectedSandApp.s("Ŝ") + this.f11452d + '}';
    }
}
