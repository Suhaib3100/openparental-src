package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.view.e;
import com.bumptech.glide.util.m;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PreFillType.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @m1
    static final Bitmap.Config f44188e = Bitmap.Config.RGB_565;

    /* renamed from: a, reason: collision with root package name */
    private final int f44189a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44190b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f44191c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44192d;

    /* compiled from: PreFillType.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f44193a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44194b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f44195c;

        /* renamed from: d, reason: collision with root package name */
        private int f44196d;

        public a(int i4) {
            this(i4, i4);
        }

        d a() {
            return new d(this.f44193a, this.f44194b, this.f44195c, this.f44196d);
        }

        Bitmap.Config b() {
            return this.f44195c;
        }

        public a c(@q0 Bitmap.Config config) {
            this.f44195c = config;
            return this;
        }

        public a d(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("श"));
            }
            this.f44196d = i4;
            return this;
        }

        public a(int i4, int i5) {
            this.f44196d = 1;
            if (i4 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("व"));
            }
            if (i5 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ऴ"));
            }
            this.f44193a = i4;
            this.f44194b = i5;
        }
    }

    d(int i4, int i5, Bitmap.Config config, int i6) {
        this.f44191c = (Bitmap.Config) m.f(config, ProtectedSandApp.s("ष"));
        this.f44189a = i4;
        this.f44190b = i5;
        this.f44192d = i6;
    }

    Bitmap.Config a() {
        return this.f44191c;
    }

    int b() {
        return this.f44190b;
    }

    int c() {
        return this.f44192d;
    }

    int d() {
        return this.f44189a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f44190b == dVar.f44190b && this.f44189a == dVar.f44189a && this.f44192d == dVar.f44192d && this.f44191c == dVar.f44191c;
    }

    public int hashCode() {
        return ((this.f44191c.hashCode() + (((this.f44189a * 31) + this.f44190b) * 31)) * 31) + this.f44192d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("स"));
        sb.append(this.f44189a);
        sb.append(ProtectedSandApp.s("ह"));
        sb.append(this.f44190b);
        sb.append(ProtectedSandApp.s("ऺ"));
        sb.append(this.f44191c);
        sb.append(ProtectedSandApp.s("ऻ"));
        return e.a(sb, this.f44192d, '}');
    }
}
