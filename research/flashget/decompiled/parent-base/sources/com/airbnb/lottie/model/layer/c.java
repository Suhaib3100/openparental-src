package com.airbnb.lottie.model.layer;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.collection.e1;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes3.dex */
public class c extends b {

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> H;
    private final List<b> I;
    private final RectF J;
    private final RectF K;
    private final Paint L;

    @q0
    private Boolean M;

    @q0
    private Boolean N;
    private boolean O;

    /* compiled from: CompositionLayer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39126a;

        static {
            int[] iArr = new int[e.b.values().length];
            f39126a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39126a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(n0 n0Var, e eVar, List<e> list, k kVar) {
        super(n0Var, eVar);
        int i4;
        b bVar;
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.O = true;
        com.airbnb.lottie.model.animatable.b u4 = eVar.u();
        if (u4 != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = u4.p();
            this.H = p4;
            i(p4);
            this.H.a(this);
        } else {
            this.H = null;
        }
        e1 e1Var = new e1(kVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b u5 = b.u(this, eVar2, n0Var, kVar);
            if (u5 != null) {
                e1Var.p(u5.y().d(), u5);
                if (bVar2 != null) {
                    bVar2.I(u5);
                    bVar2 = null;
                } else {
                    this.I.add(0, u5);
                    int i5 = a.f39126a[eVar2.h().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        bVar2 = u5;
                    }
                }
            }
            size--;
        }
        for (i4 = 0; i4 < e1Var.z(); i4++) {
            b bVar3 = (b) e1Var.i(e1Var.o(i4));
            if (bVar3 != null && (bVar = (b) e1Var.i(bVar3.y().j())) != null) {
                bVar3.K(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        for (int i5 = 0; i5 < this.I.size(); i5++) {
            this.I.get(i5).e(eVar, i4, list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(boolean z4) {
        super.J(z4);
        Iterator<b> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().J(z4);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void L(@x(from = 0.0d, to = 1.0d) float f4) {
        super.L(f4);
        if (this.H != null) {
            f4 = ((this.f39114q.b().i() * this.H.h().floatValue()) - this.f39114q.b().r()) / (this.f39113p.Q().e() + 0.01f);
        }
        if (this.H == null) {
            f4 -= this.f39114q.r();
        }
        if (this.f39114q.v() != 0.0f) {
            if (!ProtectedSandApp.s("Ŧ").equals(this.f39114q.i())) {
                f4 /= this.f39114q.v();
            }
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).L(f4);
        }
    }

    public boolean O() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                b bVar = this.I.get(size);
                if (bVar instanceof g) {
                    if (bVar.z()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).O()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean P() {
        if (this.M == null) {
            if (A()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).A()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void Q(boolean z4) {
        this.O = z4;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.H;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar, null);
            this.H = qVar;
            qVar.a(this);
            i(this.H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).f(this.J, this.f39112o, true);
            rectF.union(this.J);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.flashget.parentalcontrol.ProtectedSandApp.s("Ŧ").equals(r6.f39114q.i()) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[SYNTHETIC] */
    @Override // com.airbnb.lottie.model.layer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t(android.graphics.Canvas r7, android.graphics.Matrix r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "ŧ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.airbnb.lottie.e.a(r0)
            android.graphics.RectF r1 = r6.K
            com.airbnb.lottie.model.layer.e r2 = r6.f39114q
            int r2 = r2.l()
            float r2 = (float) r2
            com.airbnb.lottie.model.layer.e r3 = r6.f39114q
            int r3 = r3.k()
            float r3 = (float) r3
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.graphics.RectF r1 = r6.K
            r8.mapRect(r1)
            com.airbnb.lottie.n0 r1 = r6.f39113p
            boolean r1 = r1.o0()
            r2 = 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 == 0) goto L39
            java.util.List<com.airbnb.lottie.model.layer.b> r1 = r6.I
            int r1 = r1.size()
            if (r1 <= r3) goto L39
            if (r9 == r2) goto L39
            r1 = r3
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 == 0) goto L49
            android.graphics.Paint r4 = r6.L
            r4.setAlpha(r9)
            android.graphics.RectF r4 = r6.K
            android.graphics.Paint r5 = r6.L
            com.airbnb.lottie.utils.j.n(r7, r4, r5)
            goto L4c
        L49:
            r7.save()
        L4c:
            if (r1 == 0) goto L4f
            r9 = r2
        L4f:
            java.util.List<com.airbnb.lottie.model.layer.b> r1 = r6.I
            int r1 = r1.size()
            int r1 = r1 - r3
        L56:
            if (r1 < 0) goto L8f
            boolean r2 = r6.O
            if (r2 != 0) goto L6f
            com.airbnb.lottie.model.layer.e r2 = r6.f39114q
            java.lang.String r2 = r2.i()
            java.lang.String r4 = "Ŧ"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L6f
            goto L7e
        L6f:
            android.graphics.RectF r2 = r6.K
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L7e
            android.graphics.RectF r2 = r6.K
            boolean r2 = r7.clipRect(r2)
            goto L7f
        L7e:
            r2 = r3
        L7f:
            if (r2 == 0) goto L8c
            java.util.List<com.airbnb.lottie.model.layer.b> r2 = r6.I
            java.lang.Object r2 = r2.get(r1)
            com.airbnb.lottie.model.layer.b r2 = (com.airbnb.lottie.model.layer.b) r2
            r2.h(r7, r8, r9)
        L8c:
            int r1 = r1 + (-1)
            goto L56
        L8f:
            r7.restore()
            com.airbnb.lottie.e.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.c.t(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
