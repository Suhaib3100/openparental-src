package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.q0;
import androidx.collection.e1;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.content.p;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* loaded from: classes3.dex */
public class i extends com.airbnb.lottie.model.layer.b {
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<com.airbnb.lottie.model.d, List<com.airbnb.lottie.animation.content.d>> M;
    private final e1<String> N;
    private final o O;
    private final n0 P;
    private final k Q;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> R;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> S;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> T;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> U;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> V;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> W;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> X;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Y;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Z;

    /* renamed from: a0, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> f39151a0;

    /* compiled from: TextLayer.java */
    class a extends Paint {
        a(int i4) {
            super(i4);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    class b extends Paint {
        b(int i4) {
            super(i4);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39154a;

        static {
            int[] iArr = new int[b.a.values().length];
            f39154a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39154a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39154a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(n0 n0Var, e eVar) {
        super(n0Var, eVar);
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new e1<>();
        this.P = n0Var;
        this.Q = eVar.b();
        o p4 = eVar.s().p();
        this.O = p4;
        p4.a(this);
        i(p4);
        com.airbnb.lottie.model.animatable.k t4 = eVar.t();
        if (t4 != null && (aVar2 = t4.f38955a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p5 = aVar2.p();
            this.R = p5;
            p5.a(this);
            i(this.R);
        }
        if (t4 != null && (aVar = t4.f38956b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p6 = aVar.p();
            this.T = p6;
            p6.a(this);
            i(this.T);
        }
        if (t4 != null && (bVar2 = t4.f38957c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> p7 = bVar2.p();
            this.V = p7;
            p7.a(this);
            i(this.V);
        }
        if (t4 == null || (bVar = t4.f38958d) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p10 = bVar.p();
        this.X = p10;
        p10.a(this);
        i(this.X);
    }

    private void O(b.a aVar, Canvas canvas, float f4) {
        int i4 = c.f39154a[aVar.ordinal()];
        if (i4 == 2) {
            canvas.translate(-f4, 0.0f);
        } else {
            if (i4 != 3) {
                return;
            }
            canvas.translate((-f4) / 2.0f, 0.0f);
        }
    }

    private String P(String str, int i4) {
        int codePointAt = str.codePointAt(i4);
        int charCount = Character.charCount(codePointAt) + i4;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j4 = codePointAt;
        if (this.N.e(j4)) {
            return this.N.i(j4);
        }
        this.H.setLength(0);
        while (i4 < charCount) {
            int codePointAt3 = str.codePointAt(i4);
            this.H.appendCodePoint(codePointAt3);
            i4 += Character.charCount(codePointAt3);
        }
        String sb = this.H.toString();
        this.N.p(j4, sb);
        return sb;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(com.airbnb.lottie.model.d dVar, Matrix matrix, float f4, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> Y = Y(dVar);
        for (int i4 = 0; i4 < Y.size(); i4++) {
            Path path = Y.get(i4).getPath();
            path.computeBounds(this.I, false);
            this.J.set(matrix);
            this.J.preTranslate(0.0f, com.airbnb.lottie.utils.j.e() * (-bVar.f38975g));
            this.J.preScale(f4, f4);
            path.transform(this.J);
            if (bVar.f38979k) {
                U(path, this.K, canvas);
                U(path, this.L, canvas);
            } else {
                U(path, this.L, canvas);
                U(path, this.K, canvas);
            }
        }
    }

    private void S(String str, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        if (bVar.f38979k) {
            Q(str, this.K, canvas);
            Q(str, this.L, canvas);
        } else {
            Q(str, this.L, canvas);
            Q(str, this.K, canvas);
        }
    }

    private void T(String str, com.airbnb.lottie.model.b bVar, Canvas canvas, float f4) {
        int i4 = 0;
        while (i4 < str.length()) {
            String P = P(str, i4);
            i4 += P.length();
            S(P, bVar, canvas);
            canvas.translate(this.K.measureText(P) + f4, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, com.airbnb.lottie.model.b bVar, Matrix matrix, com.airbnb.lottie.model.c cVar, Canvas canvas, float f4, float f5) {
        float floatValue;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.d i5 = this.Q.c().i(com.airbnb.lottie.model.d.c(str.charAt(i4), cVar.b(), cVar.d()));
            if (i5 != null) {
                R(i5, matrix, f5, bVar, canvas);
                float e4 = com.airbnb.lottie.utils.j.e() * ((float) i5.b()) * f5 * f4;
                float f6 = bVar.f38973e / 10.0f;
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Y;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.X;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate((f6 * f4) + e4, 0.0f);
                }
                f6 += floatValue;
                canvas.translate((f6 * f4) + e4, 0.0f);
            }
        }
    }

    private void W(com.airbnb.lottie.model.b bVar, Matrix matrix, com.airbnb.lottie.model.c cVar, Canvas canvas) {
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.Z;
        float floatValue = (aVar != null ? aVar.h().floatValue() : bVar.f38971c) / 100.0f;
        float g4 = com.airbnb.lottie.utils.j.g(matrix);
        String str = bVar.f38969a;
        float e4 = com.airbnb.lottie.utils.j.e() * bVar.f38974f;
        List<String> a02 = a0(str);
        int size = a02.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = a02.get(i4);
            float Z = Z(str2, cVar, floatValue, g4);
            canvas.save();
            O(bVar.f38972d, canvas, Z);
            canvas.translate(0.0f, (i4 * e4) - (((size - 1) * e4) / 2.0f));
            V(str2, bVar, matrix, cVar, canvas, g4, floatValue);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[LOOP:0: B:16:0x008d->B:17:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(com.airbnb.lottie.model.b r8, com.airbnb.lottie.model.c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f38969a
            com.airbnb.lottie.n0 r1 = r7.P
            com.airbnb.lottie.b1 r1 = r1.h0()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.c(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.K
            r1.setTypeface(r9)
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r9 = r7.Z
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f38971c
        L2f:
            android.graphics.Paint r1 = r7.K
            float r2 = com.airbnb.lottie.utils.j.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f38974f
            float r2 = com.airbnb.lottie.utils.j.e()
            float r2 = r2 * r1
            int r1 = r8.f38973e
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.Y
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6a:
            float r1 = r1 + r3
            goto L7b
        L6c:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.X
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6a
        L7b:
            float r3 = com.airbnb.lottie.utils.j.e()
            float r3 = r3 * r1
            float r3 = r3 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r1 = 0
        L8d:
            if (r1 >= r0) goto Lc3
            java.lang.Object r4 = r9.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.L
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r3
            float r6 = r6 + r5
            r10.save()
            com.airbnb.lottie.model.b$a r5 = r8.f38972d
            r7.O(r5, r10, r6)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r2
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r1
            float r6 = r6 * r2
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r3)
            r10.restore()
            int r1 = r1 + 1
            goto L8d
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.i.X(com.airbnb.lottie.model.b, com.airbnb.lottie.model.c, android.graphics.Canvas):void");
    }

    private List<com.airbnb.lottie.animation.content.d> Y(com.airbnb.lottie.model.d dVar) {
        if (this.M.containsKey(dVar)) {
            return this.M.get(dVar);
        }
        List<p> a5 = dVar.a();
        int size = a5.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.P, this, a5.get(i4)));
        }
        this.M.put(dVar, arrayList);
        return arrayList;
    }

    private float Z(String str, com.airbnb.lottie.model.c cVar, float f4, float f5) {
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.d i5 = this.Q.c().i(com.airbnb.lottie.model.d.c(str.charAt(i4), cVar.b(), cVar.d()));
            if (i5 != null) {
                f6 = (float) ((i5.b() * f4 * com.airbnb.lottie.utils.j.e() * f5) + f6);
            }
        }
        return f6;
    }

    private List<String> a0(String str) {
        String s4 = ProtectedSandApp.s("ž");
        String s5 = ProtectedSandApp.s("ſ");
        return Arrays.asList(str.replaceAll(s4, s5).replaceAll(ProtectedSandApp.s("ƀ"), s5).split(s5));
    }

    @q0
    private Typeface b0(com.airbnb.lottie.model.c cVar) {
        Typeface h4;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.f39151a0;
        if (aVar != null && (h4 = aVar.h()) != null) {
            return h4;
        }
        Typeface i02 = this.P.i0(cVar.b(), cVar.d());
        return i02 != null ? i02 : cVar.e();
    }

    private boolean c0(int i4) {
        return Character.getType(i4) == 16 || Character.getType(i4) == 27 || Character.getType(i4) == 6 || Character.getType(i4) == 28 || Character.getType(i4) == 8 || Character.getType(i4) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.f39340a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.S;
            if (aVar != null) {
                G(aVar);
            }
            if (jVar == null) {
                this.S = null;
                return;
            }
            q qVar = new q(jVar, null);
            this.S = qVar;
            qVar.a(this);
            i(this.S);
            return;
        }
        if (t4 == s0.f39341b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.U;
            if (aVar2 != null) {
                G(aVar2);
            }
            if (jVar == null) {
                this.U = null;
                return;
            }
            q qVar2 = new q(jVar, null);
            this.U = qVar2;
            qVar2.a(this);
            i(this.U);
            return;
        }
        if (t4 == s0.f39358s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.W;
            if (aVar3 != null) {
                G(aVar3);
            }
            if (jVar == null) {
                this.W = null;
                return;
            }
            q qVar3 = new q(jVar, null);
            this.W = qVar3;
            qVar3.a(this);
            i(this.W);
            return;
        }
        if (t4 == s0.f39359t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.Y;
            if (aVar4 != null) {
                G(aVar4);
            }
            if (jVar == null) {
                this.Y = null;
                return;
            }
            q qVar4 = new q(jVar, null);
            this.Y = qVar4;
            qVar4.a(this);
            i(this.Y);
            return;
        }
        if (t4 == s0.F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                G(aVar5);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            q qVar5 = new q(jVar, null);
            this.Z = qVar5;
            qVar5.a(this);
            i(this.Z);
            return;
        }
        if (t4 != s0.M) {
            if (t4 == s0.O) {
                this.O.q(jVar);
                return;
            }
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.f39151a0;
        if (aVar6 != null) {
            G(aVar6);
        }
        if (jVar == null) {
            this.f39151a0 = null;
            return;
        }
        q qVar6 = new q(jVar, null);
        this.f39151a0 = qVar6;
        qVar6.a(this);
        i(this.f39151a0);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        rectF.set(0.0f, 0.0f, this.Q.b().width(), this.Q.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
        canvas.save();
        if (!this.P.x1()) {
            canvas.concat(matrix);
        }
        com.airbnb.lottie.model.b h4 = this.O.h();
        com.airbnb.lottie.model.c cVar = this.Q.g().get(h4.f38970b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.S;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.R;
            if (aVar2 != null) {
                this.K.setColor(aVar2.h().intValue());
            } else {
                this.K.setColor(h4.f38976h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.U;
        if (aVar3 != null) {
            this.L.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.T;
            if (aVar4 != null) {
                this.L.setColor(aVar4.h().intValue());
            } else {
                this.L.setColor(h4.f38977i);
            }
        }
        int intValue = ((this.f39121x.h() == null ? 100 : this.f39121x.h().h().intValue()) * 255) / 100;
        this.K.setAlpha(intValue);
        this.L.setAlpha(intValue);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.W;
        if (aVar5 != null) {
            this.L.setStrokeWidth(aVar5.h().floatValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.V;
            if (aVar6 != null) {
                this.L.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.L.setStrokeWidth(com.airbnb.lottie.utils.j.e() * h4.f38978j * com.airbnb.lottie.utils.j.g(matrix));
            }
        }
        if (this.P.x1()) {
            W(h4, matrix, cVar, canvas);
        } else {
            X(h4, cVar, canvas);
        }
        canvas.restore();
    }
}
