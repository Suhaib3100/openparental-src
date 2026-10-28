package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.v0;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes3.dex */
public class m<TranscodeType> extends com.bumptech.glide.request.a<m<TranscodeType>> implements Cloneable, i<m<TranscodeType>> {
    protected static final com.bumptech.glide.request.i Y2 = new com.bumptech.glide.request.i().t(com.bumptech.glide.load.engine.j.f44087c).I0(j.LOW).T0(true);
    private final n L2;
    private final Class<TranscodeType> M2;
    private final c N2;
    private final e O2;

    @o0
    private o<?, ? super TranscodeType> P2;

    @q0
    private Object Q2;

    @q0
    private List<com.bumptech.glide.request.h<TranscodeType>> R2;

    @q0
    private m<TranscodeType> S2;

    @q0
    private m<TranscodeType> T2;

    @q0
    private Float U2;
    private final Context V1;
    private boolean V2;
    private boolean W2;
    private boolean X2;

    /* compiled from: RequestBuilder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44675a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44676b;

        static {
            int[] iArr = new int[j.values().length];
            f44676b = iArr;
            try {
                iArr[j.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44676b[j.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44676b[j.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44676b[j.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f44675a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44675a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44675a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44675a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44675a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44675a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44675a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44675a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected m(@o0 c cVar, n nVar, Class<TranscodeType> cls, Context context) {
        this.V2 = true;
        this.N2 = cVar;
        this.L2 = nVar;
        this.M2 = cls;
        this.V1 = context;
        this.P2 = nVar.F(cls);
        this.O2 = cVar.k();
        x1(nVar.D());
        g(nVar.E());
    }

    private <Y extends p<TranscodeType>> Y A1(@o0 Y y4, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.util.m.e(y4);
        if (!this.W2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਫ"));
        }
        com.bumptech.glide.request.e i12 = i1(y4, hVar, aVar, executor);
        com.bumptech.glide.request.e h4 = y4.h();
        if (i12.g(h4) && !F1(aVar, h4)) {
            if (!((com.bumptech.glide.request.e) com.bumptech.glide.util.m.f(h4, ProtectedSandApp.s("ਪ"))).isRunning()) {
                h4.h();
            }
            return y4;
        }
        this.L2.y(y4);
        y4.l(i12);
        this.L2.Z(y4, i12);
        return y4;
    }

    private boolean F1(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar) {
        return !aVar.h0() && eVar.isComplete();
    }

    @o0
    private m<TranscodeType> R1(@q0 Object obj) {
        if (d0()) {
            return clone().R1(obj);
        }
        this.Q2 = obj;
        this.W2 = true;
        return P0();
    }

    private m<TranscodeType> S1(@q0 Uri uri, m<TranscodeType> mVar) {
        return (uri == null || !ProtectedSandApp.s("ਬ").equals(uri.getScheme())) ? mVar : h1(mVar);
    }

    private com.bumptech.glide.request.e T1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.f fVar, o<?, ? super TranscodeType> oVar, j jVar, int i4, int i5, Executor executor) {
        Context context = this.V1;
        e eVar = this.O2;
        return com.bumptech.glide.request.k.x(context, eVar, obj, this.Q2, this.M2, aVar, i4, i5, jVar, pVar, hVar, this.R2, fVar, eVar.f(), oVar.d(), executor);
    }

    private m<TranscodeType> h1(m<TranscodeType> mVar) {
        return mVar.U0(this.V1.getTheme()).R0(com.bumptech.glide.signature.a.c(this.V1));
    }

    private com.bumptech.glide.request.e i1(p<TranscodeType> pVar, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return j1(new Object(), pVar, hVar, null, this.P2, aVar.U(), aVar.R(), aVar.P(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.e j1(Object obj, p<TranscodeType> pVar, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, @q0 com.bumptech.glide.request.f fVar, o<?, ? super TranscodeType> oVar, j jVar, int i4, int i5, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.f fVar2;
        com.bumptech.glide.request.f fVar3;
        if (this.T2 != null) {
            fVar3 = new com.bumptech.glide.request.b(obj, fVar);
            fVar2 = fVar3;
        } else {
            fVar2 = null;
            fVar3 = fVar;
        }
        com.bumptech.glide.request.e k12 = k1(obj, pVar, hVar, fVar3, oVar, jVar, i4, i5, aVar, executor);
        if (fVar2 == null) {
            return k12;
        }
        int R = this.T2.R();
        int P = this.T2.P();
        if (com.bumptech.glide.util.o.x(i4, i5) && !this.T2.t0()) {
            R = aVar.R();
            P = aVar.P();
        }
        m<TranscodeType> mVar = this.T2;
        com.bumptech.glide.request.b bVar = fVar2;
        bVar.n(k12, mVar.j1(obj, pVar, hVar, bVar, mVar.P2, mVar.U(), R, P, this.T2, executor));
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.request.a] */
    private com.bumptech.glide.request.e k1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.h<TranscodeType> hVar, @q0 com.bumptech.glide.request.f fVar, o<?, ? super TranscodeType> oVar, j jVar, int i4, int i5, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        m<TranscodeType> mVar = this.S2;
        if (mVar == null) {
            if (this.U2 == null) {
                return T1(obj, pVar, hVar, aVar, fVar, oVar, jVar, i4, i5, executor);
            }
            com.bumptech.glide.request.l lVar = new com.bumptech.glide.request.l(obj, fVar);
            lVar.m(T1(obj, pVar, hVar, aVar, lVar, oVar, jVar, i4, i5, executor), T1(obj, pVar, hVar, aVar.clone().S0(this.U2.floatValue()), lVar, oVar, w1(jVar), i4, i5, executor));
            return lVar;
        }
        if (this.X2) {
            throw new IllegalStateException(ProtectedSandApp.s("ਭ"));
        }
        o<?, ? super TranscodeType> oVar2 = mVar.V2 ? oVar : mVar.P2;
        j U = mVar.i0() ? this.S2.U() : w1(jVar);
        int R = this.S2.R();
        int P = this.S2.P();
        if (com.bumptech.glide.util.o.x(i4, i5) && !this.S2.t0()) {
            R = aVar.R();
            P = aVar.P();
        }
        com.bumptech.glide.request.l lVar2 = new com.bumptech.glide.request.l(obj, fVar);
        com.bumptech.glide.request.e T1 = T1(obj, pVar, hVar, aVar, lVar2, oVar, jVar, i4, i5, executor);
        this.X2 = true;
        m<TranscodeType> mVar2 = this.S2;
        com.bumptech.glide.request.e j12 = mVar2.j1(obj, pVar, hVar, lVar2, oVar2, U, R, P, mVar2, executor);
        this.X2 = false;
        lVar2.m(T1, j12);
        return lVar2;
    }

    private m<TranscodeType> o1() {
        return clone().r1(null).Z1(null);
    }

    @o0
    private j w1(@o0 j jVar) {
        int i4 = a.f44676b[jVar.ordinal()];
        if (i4 == 1) {
            return j.NORMAL;
        }
        if (i4 == 2) {
            return j.HIGH;
        }
        if (i4 == 3 || i4 == 4) {
            return j.IMMEDIATE;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ਮ") + U());
    }

    @SuppressLint({"CheckResult"})
    private void x1(List<com.bumptech.glide.request.h<Object>> list) {
        Iterator<com.bumptech.glide.request.h<Object>> it = list.iterator();
        while (it.hasNext()) {
            f1((com.bumptech.glide.request.h) it.next());
        }
    }

    @o0
    <Y extends p<TranscodeType>> Y C1(@o0 Y y4, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, Executor executor) {
        return (Y) A1(y4, hVar, this, executor);
    }

    @o0
    public r<ImageView, TranscodeType> E1(@o0 ImageView imageView) {
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.util.o.b();
        com.bumptech.glide.util.m.e(imageView);
        if (!s0() && p0() && imageView.getScaleType() != null) {
            switch (a.f44675a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().w0();
                    break;
                case 2:
                    aVar = clone().x0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().z0();
                    break;
                case 6:
                    aVar = clone().x0();
                    break;
            }
            return (r) A1(this.O2.a(imageView, this.M2), null, aVar, com.bumptech.glide.util.f.b());
        }
        aVar = this;
        return (r) A1(this.O2.a(imageView, this.M2), null, aVar, com.bumptech.glide.util.f.b());
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> G1(@q0 com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (d0()) {
            return clone().G1(hVar);
        }
        this.R2 = null;
        return f1(hVar);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> k(@q0 Bitmap bitmap) {
        return R1(bitmap).g(com.bumptech.glide.request.i.k1(com.bumptech.glide.load.engine.j.f44086b));
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> f(@q0 Drawable drawable) {
        return R1(drawable).g(com.bumptech.glide.request.i.k1(com.bumptech.glide.load.engine.j.f44086b));
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> c(@q0 Uri uri) {
        return S1(uri, R1(uri));
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> e(@q0 File file) {
        return R1(file);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> o(@q0 @v0 @v Integer num) {
        return h1(R1(num));
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: N1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> n(@q0 Object obj) {
        return R1(obj);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> load(@q0 String str) {
        return R1(str);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @Deprecated
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> b(@q0 URL url) {
        return R1(url);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> d(@q0 byte[] bArr) {
        m<TranscodeType> R1 = R1(bArr);
        if (!R1.e0()) {
            R1 = R1.g(com.bumptech.glide.request.i.k1(com.bumptech.glide.load.engine.j.f44086b));
        }
        return !R1.o0() ? R1.g(com.bumptech.glide.request.i.I1(true)) : R1;
    }

    @o0
    public p<TranscodeType> U1() {
        return V1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @o0
    public p<TranscodeType> V1(int i4, int i5) {
        return z1(com.bumptech.glide.request.target.m.c(this.L2, i4, i5));
    }

    @o0
    public com.bumptech.glide.request.d<TranscodeType> W1() {
        return X1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @o0
    public com.bumptech.glide.request.d<TranscodeType> X1(int i4, int i5) {
        com.bumptech.glide.request.g gVar = new com.bumptech.glide.request.g(i4, i5);
        return (com.bumptech.glide.request.d) C1(gVar, gVar, com.bumptech.glide.util.f.a());
    }

    @androidx.annotation.j
    @o0
    @Deprecated
    public m<TranscodeType> Y1(float f4) {
        if (d0()) {
            return clone().Y1(f4);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਯ"));
        }
        this.U2 = Float.valueOf(f4);
        return P0();
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> Z1(@q0 m<TranscodeType> mVar) {
        if (d0()) {
            return clone().Z1(mVar);
        }
        this.S2 = mVar;
        return P0();
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> a2(@q0 List<m<TranscodeType>> list) {
        m<TranscodeType> mVar = null;
        if (list == null || list.isEmpty()) {
            return Z1(null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            m<TranscodeType> mVar2 = list.get(size);
            if (mVar2 != null) {
                mVar = mVar == null ? mVar2 : mVar2.Z1(mVar);
            }
        }
        return Z1(mVar);
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> b2(@q0 m<TranscodeType>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? Z1(null) : a2(Arrays.asList(mVarArr));
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> c2(@o0 o<?, ? super TranscodeType> oVar) {
        if (d0()) {
            return clone().c2(oVar);
        }
        this.P2 = (o) com.bumptech.glide.util.m.f(oVar, ProtectedSandApp.s("ਪ"));
        this.V2 = false;
        return P0();
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return super.equals(mVar) && Objects.equals(this.M2, mVar.M2) && this.P2.equals(mVar.P2) && Objects.equals(this.Q2, mVar.Q2) && Objects.equals(this.R2, mVar.R2) && Objects.equals(this.S2, mVar.S2) && Objects.equals(this.T2, mVar.T2) && Objects.equals(this.U2, mVar.U2) && this.V2 == mVar.V2 && this.W2 == mVar.W2;
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> f1(@q0 com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (d0()) {
            return clone().f1(hVar);
        }
        if (hVar != null) {
            if (this.R2 == null) {
                this.R2 = new ArrayList();
            }
            this.R2.add(hVar);
        }
        return P0();
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    @o0
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> g(@o0 com.bumptech.glide.request.a<?> aVar) {
        com.bumptech.glide.util.m.e(aVar);
        return (m) super.g(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return com.bumptech.glide.util.o.q(this.W2 ? 1 : 0, com.bumptech.glide.util.o.q(this.V2 ? 1 : 0, com.bumptech.glide.util.o.r(this.U2, com.bumptech.glide.util.o.r(this.T2, com.bumptech.glide.util.o.r(this.S2, com.bumptech.glide.util.o.r(this.R2, com.bumptech.glide.util.o.r(this.Q2, com.bumptech.glide.util.o.r(this.P2, com.bumptech.glide.util.o.r(this.M2, super.hashCode())))))))));
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> clone() {
        m<TranscodeType> mVar = (m) super.clone();
        mVar.P2 = (o<?, ? super TranscodeType>) mVar.P2.clone();
        if (mVar.R2 != null) {
            mVar.R2 = new ArrayList(mVar.R2);
        }
        m<TranscodeType> mVar2 = mVar.S2;
        if (mVar2 != null) {
            mVar.S2 = mVar2.clone();
        }
        m<TranscodeType> mVar3 = mVar.T2;
        if (mVar3 != null) {
            mVar.T2 = mVar3.clone();
        }
        return mVar;
    }

    @androidx.annotation.j
    @Deprecated
    public com.bumptech.glide.request.d<File> p1(int i4, int i5) {
        return t1().X1(i4, i5);
    }

    @androidx.annotation.j
    @Deprecated
    public <Y extends p<File>> Y q1(@o0 Y y4) {
        return (Y) t1().z1(y4);
    }

    @o0
    public m<TranscodeType> r1(@q0 m<TranscodeType> mVar) {
        if (d0()) {
            return clone().r1(mVar);
        }
        this.T2 = mVar;
        return P0();
    }

    @androidx.annotation.j
    @o0
    public m<TranscodeType> s1(Object obj) {
        return obj == null ? r1(null) : r1(o1().n(obj));
    }

    @androidx.annotation.j
    @o0
    protected m<File> t1() {
        return new m(File.class, this).g(Y2);
    }

    Object u1() {
        return this.Q2;
    }

    n v1() {
        return this.L2;
    }

    @Deprecated
    public com.bumptech.glide.request.d<TranscodeType> y1(int i4, int i5) {
        return X1(i4, i5);
    }

    @o0
    public <Y extends p<TranscodeType>> Y z1(@o0 Y y4) {
        return (Y) C1(y4, null, com.bumptech.glide.util.f.b());
    }

    @SuppressLint({"CheckResult"})
    protected m(Class<TranscodeType> cls, m<?> mVar) {
        this(mVar.N2, mVar.L2, cls, mVar.V1);
        this.Q2 = mVar.Q2;
        this.W2 = mVar.W2;
        g(mVar);
    }
}
