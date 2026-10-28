package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.resource.bitmap.q;

/* compiled from: RequestOptions.java */
/* loaded from: classes3.dex */
public class i extends a<i> {

    @q0
    private static i L2;

    @q0
    private static i M2;

    @q0
    private static i N2;

    @q0
    private static i O2;

    @q0
    private static i P2;

    @q0
    private static i Q2;

    @q0
    private static i R2;

    @q0
    private static i V1;

    @androidx.annotation.j
    @o0
    public static i A1(@v int i4) {
        return new i().G0(i4);
    }

    @androidx.annotation.j
    @o0
    public static i C1(@q0 Drawable drawable) {
        return new i().H0(drawable);
    }

    @androidx.annotation.j
    @o0
    public static i E1(@o0 com.bumptech.glide.j jVar) {
        return new i().I0(jVar);
    }

    @androidx.annotation.j
    @o0
    public static i F1(@o0 com.bumptech.glide.load.f fVar) {
        return new i().R0(fVar);
    }

    @androidx.annotation.j
    @o0
    public static i G1(@x(from = 0.0d, to = 1.0d) float f4) {
        return new i().S0(f4);
    }

    @androidx.annotation.j
    @o0
    public static i I1(boolean z4) {
        if (z4) {
            if (V1 == null) {
                V1 = new i().T0(true).i();
            }
            return V1;
        }
        if (L2 == null) {
            L2 = new i().T0(false).i();
        }
        return L2;
    }

    @androidx.annotation.j
    @o0
    public static i J1(@g0(from = 0) int i4) {
        return new i().V0(i4);
    }

    @androidx.annotation.j
    @o0
    public static i f1(@o0 m<Bitmap> mVar) {
        return new i().X0(mVar, true);
    }

    @androidx.annotation.j
    @o0
    public static i g1() {
        if (O2 == null) {
            O2 = new i().l().i();
        }
        return O2;
    }

    @androidx.annotation.j
    @o0
    public static i h1() {
        if (N2 == null) {
            N2 = new i().m().i();
        }
        return N2;
    }

    @androidx.annotation.j
    @o0
    public static i i1() {
        if (P2 == null) {
            P2 = new i().p().i();
        }
        return P2;
    }

    @androidx.annotation.j
    @o0
    public static i j1(@o0 Class<?> cls) {
        return new i().r(cls);
    }

    @androidx.annotation.j
    @o0
    public static i k1(@o0 com.bumptech.glide.load.engine.j jVar) {
        return new i().t(jVar);
    }

    @androidx.annotation.j
    @o0
    public static i m1(@o0 q qVar) {
        return new i().w(qVar);
    }

    @androidx.annotation.j
    @o0
    public static i o1(@o0 Bitmap.CompressFormat compressFormat) {
        return new i().y(compressFormat);
    }

    @androidx.annotation.j
    @o0
    public static i p1(@g0(from = 0, to = 100) int i4) {
        return new i().z(i4);
    }

    @androidx.annotation.j
    @o0
    public static i q1(@v int i4) {
        return new i().A(i4);
    }

    @androidx.annotation.j
    @o0
    public static i r1(@q0 Drawable drawable) {
        return new i().B(drawable);
    }

    @androidx.annotation.j
    @o0
    public static i s1() {
        if (M2 == null) {
            M2 = new i().E().i();
        }
        return M2;
    }

    @androidx.annotation.j
    @o0
    public static i t1(@o0 com.bumptech.glide.load.b bVar) {
        return new i().F(bVar);
    }

    @androidx.annotation.j
    @o0
    public static i u1(@g0(from = 0) long j4) {
        return new i().G(j4);
    }

    @androidx.annotation.j
    @o0
    public static i v1() {
        if (R2 == null) {
            R2 = new i().u().i();
        }
        return R2;
    }

    @androidx.annotation.j
    @o0
    public static i w1() {
        if (Q2 == null) {
            Q2 = new i().v().i();
        }
        return Q2;
    }

    @androidx.annotation.j
    @o0
    public static <T> i x1(@o0 com.bumptech.glide.load.h<T> hVar, @o0 T t4) {
        return new i().Q0(hVar, t4);
    }

    @androidx.annotation.j
    @o0
    public static i y1(int i4) {
        return z1(i4, i4);
    }

    @androidx.annotation.j
    @o0
    public static i z1(int i4, int i5) {
        return new i().F0(i4, i5);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }
}
