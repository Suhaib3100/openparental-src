package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.resource.bitmap.p;

/* compiled from: RequestOptions.java */
/* loaded from: classes3.dex */
public class i extends a<i> {

    /* renamed from: j0, reason: collision with root package name */
    @q0
    private static i f12003j0;

    /* renamed from: k0, reason: collision with root package name */
    @q0
    private static i f12004k0;

    /* renamed from: l0, reason: collision with root package name */
    @q0
    private static i f12005l0;

    /* renamed from: m0, reason: collision with root package name */
    @q0
    private static i f12006m0;

    /* renamed from: n0, reason: collision with root package name */
    @q0
    private static i f12007n0;

    /* renamed from: o0, reason: collision with root package name */
    @q0
    private static i f12008o0;

    /* renamed from: p0, reason: collision with root package name */
    @q0
    private static i f12009p0;

    /* renamed from: q0, reason: collision with root package name */
    @q0
    private static i f12010q0;

    @androidx.annotation.j
    @o0
    public static i A1(@g0(from = 0) long j5) {
        return new i().I(j5);
    }

    @androidx.annotation.j
    @o0
    public static i B1() {
        if (f12010q0 == null) {
            f12010q0 = new i().w().b();
        }
        return f12010q0;
    }

    @androidx.annotation.j
    @o0
    public static i C1() {
        if (f12009p0 == null) {
            f12009p0 = new i().x().b();
        }
        return f12009p0;
    }

    @androidx.annotation.j
    @o0
    public static <T> i D1(@o0 com.bumptech.glide.load.h<T> hVar, @o0 T t5) {
        return new i().S0(hVar, t5);
    }

    @androidx.annotation.j
    @o0
    public static i E1(int i5) {
        return F1(i5, i5);
    }

    @androidx.annotation.j
    @o0
    public static i F1(int i5, int i6) {
        return new i().J0(i5, i6);
    }

    @androidx.annotation.j
    @o0
    public static i G1(@v int i5) {
        return new i().K0(i5);
    }

    @androidx.annotation.j
    @o0
    public static i H1(@q0 Drawable drawable) {
        return new i().L0(drawable);
    }

    @androidx.annotation.j
    @o0
    public static i I1(@o0 com.bumptech.glide.i iVar) {
        return new i().M0(iVar);
    }

    @androidx.annotation.j
    @o0
    public static i J1(@o0 com.bumptech.glide.load.f fVar) {
        return new i().U0(fVar);
    }

    @androidx.annotation.j
    @o0
    public static i K1(@x(from = 0.0d, to = 1.0d) float f6) {
        return new i().V0(f6);
    }

    @androidx.annotation.j
    @o0
    public static i L1(boolean z5) {
        if (z5) {
            if (f12003j0 == null) {
                f12003j0 = new i().W0(true).b();
            }
            return f12003j0;
        }
        if (f12004k0 == null) {
            f12004k0 = new i().W0(false).b();
        }
        return f12004k0;
    }

    @androidx.annotation.j
    @o0
    public static i M1(@g0(from = 0) int i5) {
        return new i().Y0(i5);
    }

    @androidx.annotation.j
    @o0
    public static i j1(@o0 m<Bitmap> mVar) {
        return new i().a1(mVar, true);
    }

    @androidx.annotation.j
    @o0
    public static i k1() {
        if (f12007n0 == null) {
            f12007n0 = new i().k().b();
        }
        return f12007n0;
    }

    @androidx.annotation.j
    @o0
    public static i l1() {
        if (f12006m0 == null) {
            f12006m0 = new i().n().b();
        }
        return f12006m0;
    }

    @androidx.annotation.j
    @o0
    public static i m1() {
        if (f12008o0 == null) {
            f12008o0 = new i().o().b();
        }
        return f12008o0;
    }

    @androidx.annotation.j
    @o0
    public static i o1(@o0 Class<?> cls) {
        return new i().q(cls);
    }

    @androidx.annotation.j
    @o0
    public static i p1(@o0 com.bumptech.glide.load.engine.j jVar) {
        return new i().v(jVar);
    }

    @androidx.annotation.j
    @o0
    public static i r1(@o0 p pVar) {
        return new i().y(pVar);
    }

    @androidx.annotation.j
    @o0
    public static i t1(@o0 Bitmap.CompressFormat compressFormat) {
        return new i().z(compressFormat);
    }

    @androidx.annotation.j
    @o0
    public static i u1(@g0(from = 0, to = 100) int i5) {
        return new i().A(i5);
    }

    @androidx.annotation.j
    @o0
    public static i v1(@v int i5) {
        return new i().B(i5);
    }

    @androidx.annotation.j
    @o0
    public static i x1(@q0 Drawable drawable) {
        return new i().C(drawable);
    }

    @androidx.annotation.j
    @o0
    public static i y1() {
        if (f12005l0 == null) {
            f12005l0 = new i().F().b();
        }
        return f12005l0;
    }

    @androidx.annotation.j
    @o0
    public static i z1(@o0 com.bumptech.glide.load.b bVar) {
        return new i().G(bVar);
    }
}
