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
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes3.dex */
public class k<TranscodeType> extends com.bumptech.glide.request.a<k<TranscodeType>> implements Cloneable, h<k<TranscodeType>> {

    /* renamed from: x0, reason: collision with root package name */
    protected static final com.bumptech.glide.request.i f11018x0 = new com.bumptech.glide.request.i().v(com.bumptech.glide.load.engine.j.f11362c).M0(i.LOW).W0(true);

    /* renamed from: j0, reason: collision with root package name */
    private final Context f11019j0;

    /* renamed from: k0, reason: collision with root package name */
    private final l f11020k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Class<TranscodeType> f11021l0;

    /* renamed from: m0, reason: collision with root package name */
    private final b f11022m0;

    /* renamed from: n0, reason: collision with root package name */
    private final d f11023n0;

    /* renamed from: o0, reason: collision with root package name */
    @o0
    private m<?, ? super TranscodeType> f11024o0;

    /* renamed from: p0, reason: collision with root package name */
    @q0
    private Object f11025p0;

    /* renamed from: q0, reason: collision with root package name */
    @q0
    private List<com.bumptech.glide.request.h<TranscodeType>> f11026q0;

    /* renamed from: r0, reason: collision with root package name */
    @q0
    private k<TranscodeType> f11027r0;

    /* renamed from: s0, reason: collision with root package name */
    @q0
    private k<TranscodeType> f11028s0;

    /* renamed from: t0, reason: collision with root package name */
    @q0
    private Float f11029t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f11030u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f11031v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f11032w0;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11033a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11034b;

        static {
            int[] iArr = new int[i.values().length];
            f11034b = iArr;
            try {
                iArr[i.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11034b[i.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11034b[i.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11034b[i.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f11033a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11033a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11033a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11033a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11033a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11033a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11033a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11033a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected k(@o0 b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.f11030u0 = true;
        this.f11022m0 = bVar;
        this.f11020k0 = lVar;
        this.f11021l0 = cls;
        this.f11019j0 = context;
        this.f11024o0 = lVar.E(cls);
        this.f11023n0 = bVar.k();
        A1(lVar.C());
        a(lVar.D());
    }

    @SuppressLint({"CheckResult"})
    private void A1(List<com.bumptech.glide.request.h<Object>> list) {
        Iterator<com.bumptech.glide.request.h<Object>> it = list.iterator();
        while (it.hasNext()) {
            j1((com.bumptech.glide.request.h) it.next());
        }
    }

    private <Y extends p<TranscodeType>> Y D1(@o0 Y y5, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.util.l.d(y5);
        if (!this.f11031v0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᱥ"));
        }
        com.bumptech.glide.request.e l12 = l1(y5, hVar, aVar, executor);
        com.bumptech.glide.request.e o5 = y5.o();
        if (l12.d(o5) && !G1(aVar, o5)) {
            if (!((com.bumptech.glide.request.e) com.bumptech.glide.util.l.d(o5)).isRunning()) {
                o5.h();
            }
            return y5;
        }
        this.f11020k0.z(y5);
        y5.h(l12);
        this.f11020k0.Y(y5, l12);
        return y5;
    }

    private boolean G1(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar) {
        return !aVar.m0() && eVar.i();
    }

    @o0
    private k<TranscodeType> R1(@q0 Object obj) {
        if (j0()) {
            return clone().R1(obj);
        }
        this.f11025p0 = obj;
        this.f11031v0 = true;
        return R0();
    }

    private com.bumptech.glide.request.e S1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, i iVar, int i5, int i6, Executor executor) {
        Context context = this.f11019j0;
        d dVar = this.f11023n0;
        return com.bumptech.glide.request.k.x(context, dVar, obj, this.f11025p0, this.f11021l0, aVar, i5, i6, iVar, pVar, hVar, this.f11026q0, fVar, dVar.f(), mVar.c(), executor);
    }

    private com.bumptech.glide.request.e l1(p<TranscodeType> pVar, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return m1(new Object(), pVar, hVar, null, this.f11024o0, aVar.a0(), aVar.V(), aVar.T(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.e m1(Object obj, p<TranscodeType> pVar, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, @q0 com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, i iVar, int i5, int i6, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.f fVar2;
        com.bumptech.glide.request.f fVar3;
        if (this.f11028s0 != null) {
            fVar3 = new com.bumptech.glide.request.b(obj, fVar);
            fVar2 = fVar3;
        } else {
            fVar2 = null;
            fVar3 = fVar;
        }
        com.bumptech.glide.request.e o12 = o1(obj, pVar, hVar, fVar3, mVar, iVar, i5, i6, aVar, executor);
        if (fVar2 == null) {
            return o12;
        }
        int V = this.f11028s0.V();
        int T = this.f11028s0.T();
        if (n.w(i5, i6) && !this.f11028s0.w0()) {
            V = aVar.V();
            T = aVar.T();
        }
        k<TranscodeType> kVar = this.f11028s0;
        com.bumptech.glide.request.b bVar = fVar2;
        bVar.o(o12, kVar.m1(obj, pVar, hVar, bVar, kVar.f11024o0, kVar.a0(), V, T, this.f11028s0, executor));
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.request.a] */
    private com.bumptech.glide.request.e o1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.h<TranscodeType> hVar, @q0 com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, i iVar, int i5, int i6, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        k<TranscodeType> kVar = this.f11027r0;
        if (kVar == null) {
            if (this.f11029t0 == null) {
                return S1(obj, pVar, hVar, aVar, fVar, mVar, iVar, i5, i6, executor);
            }
            com.bumptech.glide.request.l lVar = new com.bumptech.glide.request.l(obj, fVar);
            lVar.n(S1(obj, pVar, hVar, aVar, lVar, mVar, iVar, i5, i6, executor), S1(obj, pVar, hVar, aVar.p().V0(this.f11029t0.floatValue()), lVar, mVar, z1(iVar), i5, i6, executor));
            return lVar;
        }
        if (this.f11032w0) {
            throw new IllegalStateException(ProtectedSandApp.s("ᱦ"));
        }
        m<?, ? super TranscodeType> mVar2 = kVar.f11030u0 ? mVar : kVar.f11024o0;
        i a02 = kVar.n0() ? this.f11027r0.a0() : z1(iVar);
        int V = this.f11027r0.V();
        int T = this.f11027r0.T();
        if (n.w(i5, i6) && !this.f11027r0.w0()) {
            V = aVar.V();
            T = aVar.T();
        }
        com.bumptech.glide.request.l lVar2 = new com.bumptech.glide.request.l(obj, fVar);
        com.bumptech.glide.request.e S1 = S1(obj, pVar, hVar, aVar, lVar2, mVar, iVar, i5, i6, executor);
        this.f11032w0 = true;
        k<TranscodeType> kVar2 = this.f11027r0;
        com.bumptech.glide.request.e m12 = kVar2.m1(obj, pVar, hVar, lVar2, mVar2, a02, V, T, kVar2, executor);
        this.f11032w0 = false;
        lVar2.n(S1, m12);
        return lVar2;
    }

    private k<TranscodeType> r1() {
        return clone().v1(null).Y1(null);
    }

    @o0
    private i z1(@o0 i iVar) {
        int i5 = a.f11034b[iVar.ordinal()];
        if (i5 == 1) {
            return i.NORMAL;
        }
        if (i5 == 2) {
            return i.HIGH;
        }
        if (i5 == 3 || i5 == 4) {
            return i.IMMEDIATE;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᱧ") + a0());
    }

    @Deprecated
    public com.bumptech.glide.request.d<TranscodeType> B1(int i5, int i6) {
        return W1(i5, i6);
    }

    @o0
    public <Y extends p<TranscodeType>> Y C1(@o0 Y y5) {
        return (Y) E1(y5, null, com.bumptech.glide.util.f.b());
    }

    @o0
    <Y extends p<TranscodeType>> Y E1(@o0 Y y5, @q0 com.bumptech.glide.request.h<TranscodeType> hVar, Executor executor) {
        return (Y) D1(y5, hVar, this, executor);
    }

    @o0
    public r<ImageView, TranscodeType> F1(@o0 ImageView imageView) {
        com.bumptech.glide.request.a<?> aVar;
        n.b();
        com.bumptech.glide.util.l.d(imageView);
        if (!v0() && t0() && imageView.getScaleType() != null) {
            switch (a.f11033a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = p().A0();
                    break;
                case 2:
                    aVar = p().B0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = p().D0();
                    break;
                case 6:
                    aVar = p().B0();
                    break;
            }
            return (r) D1(this.f11023n0.a(imageView, this.f11021l0), null, aVar, com.bumptech.glide.util.f.b());
        }
        aVar = this;
        return (r) D1(this.f11023n0.a(imageView, this.f11021l0), null, aVar, com.bumptech.glide.util.f.b());
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> H1(@q0 com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (j0()) {
            return clone().H1(hVar);
        }
        this.f11026q0 = null;
        return j1(hVar);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> j(@q0 Bitmap bitmap) {
        return R1(bitmap).a(com.bumptech.glide.request.i.p1(com.bumptech.glide.load.engine.j.f11361b));
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> i(@q0 Drawable drawable) {
        return R1(drawable).a(com.bumptech.glide.request.i.p1(com.bumptech.glide.load.engine.j.f11361b));
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> d(@q0 Uri uri) {
        return R1(uri);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> f(@q0 File file) {
        return R1(file);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> m(@q0 @v0 @v Integer num) {
        return R1(num).a(com.bumptech.glide.request.i.J1(com.bumptech.glide.signature.a.c(this.f11019j0)));
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: N1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> l(@q0 Object obj) {
        return R1(obj);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> s(@q0 String str) {
        return R1(str);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @Deprecated
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> c(@q0 URL url) {
        return R1(url);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> e(@q0 byte[] bArr) {
        k<TranscodeType> R1 = R1(bArr);
        if (!R1.k0()) {
            R1 = R1.a(com.bumptech.glide.request.i.p1(com.bumptech.glide.load.engine.j.f11361b));
        }
        return !R1.s0() ? R1.a(com.bumptech.glide.request.i.L1(true)) : R1;
    }

    @o0
    public p<TranscodeType> T1() {
        return U1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @o0
    public p<TranscodeType> U1(int i5, int i6) {
        return C1(com.bumptech.glide.request.target.m.d(this.f11020k0, i5, i6));
    }

    @o0
    public com.bumptech.glide.request.d<TranscodeType> V1() {
        return W1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @o0
    public com.bumptech.glide.request.d<TranscodeType> W1(int i5, int i6) {
        com.bumptech.glide.request.g gVar = new com.bumptech.glide.request.g(i5, i6);
        return (com.bumptech.glide.request.d) E1(gVar, gVar, com.bumptech.glide.util.f.a());
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> X1(float f6) {
        if (j0()) {
            return clone().X1(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᱨ"));
        }
        this.f11029t0 = Float.valueOf(f6);
        return R0();
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> Y1(@q0 k<TranscodeType> kVar) {
        if (j0()) {
            return clone().Y1(kVar);
        }
        this.f11027r0 = kVar;
        return R0();
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> Z1(@q0 List<k<TranscodeType>> list) {
        k<TranscodeType> kVar = null;
        if (list == null || list.isEmpty()) {
            return Y1(null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            k<TranscodeType> kVar2 = list.get(size);
            if (kVar2 != null) {
                kVar = kVar == null ? kVar2 : kVar2.Y1(kVar);
            }
        }
        return Y1(kVar);
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> a2(@q0 k<TranscodeType>... kVarArr) {
        return (kVarArr == null || kVarArr.length == 0) ? Y1(null) : Z1(Arrays.asList(kVarArr));
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> b2(@o0 m<?, ? super TranscodeType> mVar) {
        if (j0()) {
            return clone().b2(mVar);
        }
        this.f11024o0 = (m) com.bumptech.glide.util.l.d(mVar);
        this.f11030u0 = false;
        return R0();
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> j1(@q0 com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (j0()) {
            return clone().j1(hVar);
        }
        if (hVar != null) {
            if (this.f11026q0 == null) {
                this.f11026q0 = new ArrayList();
            }
            this.f11026q0.add(hVar);
        }
        return R0();
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    @o0
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> a(@o0 com.bumptech.glide.request.a<?> aVar) {
        com.bumptech.glide.util.l.d(aVar);
        return (k) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    /* renamed from: p1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k<TranscodeType> p() {
        k<TranscodeType> kVar = (k) super.p();
        kVar.f11024o0 = (m<?, ? super TranscodeType>) kVar.f11024o0.clone();
        if (kVar.f11026q0 != null) {
            kVar.f11026q0 = new ArrayList(kVar.f11026q0);
        }
        k<TranscodeType> kVar2 = kVar.f11027r0;
        if (kVar2 != null) {
            kVar.f11027r0 = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.f11028s0;
        if (kVar3 != null) {
            kVar.f11028s0 = kVar3.clone();
        }
        return kVar;
    }

    @androidx.annotation.j
    @Deprecated
    public com.bumptech.glide.request.d<File> t1(int i5, int i6) {
        return y1().W1(i5, i6);
    }

    @androidx.annotation.j
    @Deprecated
    public <Y extends p<File>> Y u1(@o0 Y y5) {
        return (Y) y1().C1(y5);
    }

    @o0
    public k<TranscodeType> v1(@q0 k<TranscodeType> kVar) {
        if (j0()) {
            return clone().v1(kVar);
        }
        this.f11028s0 = kVar;
        return R0();
    }

    @androidx.annotation.j
    @o0
    public k<TranscodeType> x1(Object obj) {
        return obj == null ? v1(null) : v1(r1().l(obj));
    }

    @androidx.annotation.j
    @o0
    protected k<File> y1() {
        return new k(File.class, this).a(f11018x0);
    }

    @SuppressLint({"CheckResult"})
    protected k(Class<TranscodeType> cls, k<?> kVar) {
        this(kVar.f11022m0, kVar.f11020k0, cls, kVar.f11019j0);
        this.f11025p0 = kVar.f11025p0;
        this.f11031v0 = kVar.f11031v0;
        a(kVar);
    }
}
