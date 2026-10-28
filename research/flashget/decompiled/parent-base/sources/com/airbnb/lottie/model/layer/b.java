package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.view.x1;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.content.n;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* loaded from: classes3.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, com.airbnb.lottie.model.f {
    private static final int D = 2;
    private static final int E = 16;
    private static final int F = 1;
    private static final int G = 19;

    @q0
    private Paint A;
    float B;

    @q0
    BlurMaskFilter C;

    /* renamed from: a, reason: collision with root package name */
    private final Path f39098a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f39099b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f39100c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f39101d = new com.airbnb.lottie.animation.a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f39102e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f39103f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f39104g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f39105h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f39106i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f39107j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f39108k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f39109l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f39110m;

    /* renamed from: n, reason: collision with root package name */
    private final String f39111n;

    /* renamed from: o, reason: collision with root package name */
    final Matrix f39112o;

    /* renamed from: p, reason: collision with root package name */
    final n0 f39113p;

    /* renamed from: q, reason: collision with root package name */
    final e f39114q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.h f39115r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.d f39116s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private b f39117t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private b f39118u;

    /* renamed from: v, reason: collision with root package name */
    private List<b> f39119v;

    /* renamed from: w, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f39120w;

    /* renamed from: x, reason: collision with root package name */
    final p f39121x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f39122y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f39123z;

    /* compiled from: BaseLayer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39124a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39125b;

        static {
            int[] iArr = new int[h.a.values().length];
            f39125b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39125b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39125b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39125b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f39124a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39124a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39124a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39124a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39124a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39124a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39124a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(n0 n0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f39102e = new com.airbnb.lottie.animation.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f39103f = new com.airbnb.lottie.animation.a(1, mode2);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f39104g = aVar;
        this.f39105h = new com.airbnb.lottie.animation.a(PorterDuff.Mode.CLEAR);
        this.f39106i = new RectF();
        this.f39107j = new RectF();
        this.f39108k = new RectF();
        this.f39109l = new RectF();
        this.f39110m = new RectF();
        this.f39112o = new Matrix();
        this.f39120w = new ArrayList();
        this.f39122y = true;
        this.B = 0.0f;
        this.f39113p = n0Var;
        this.f39114q = eVar;
        this.f39111n = android.support.v4.media.c.a(new StringBuilder(), eVar.i(), ProtectedSandApp.s("Ŝ"));
        if (eVar.h() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b5 = eVar.w().b();
        this.f39121x = b5;
        b5.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(eVar.g());
            this.f39115r = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a<n, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 : this.f39115r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        N();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.f39108k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f39115r.b().size();
            for (int i4 = 0; i4 < size; i4++) {
                com.airbnb.lottie.model.content.h hVar = this.f39115r.b().get(i4);
                Path h4 = this.f39115r.a().get(i4).h();
                if (h4 != null) {
                    this.f39098a.set(h4);
                    this.f39098a.transform(matrix);
                    int i5 = a.f39125b[hVar.a().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        return;
                    }
                    if ((i5 == 3 || i5 == 4) && hVar.d()) {
                        return;
                    }
                    this.f39098a.computeBounds(this.f39110m, false);
                    if (i4 == 0) {
                        this.f39108k.set(this.f39110m);
                    } else {
                        RectF rectF2 = this.f39108k;
                        rectF2.set(Math.min(rectF2.left, this.f39110m.left), Math.min(this.f39108k.top, this.f39110m.top), Math.max(this.f39108k.right, this.f39110m.right), Math.max(this.f39108k.bottom, this.f39110m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f39108k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (A() && this.f39114q.h() != e.b.INVERT) {
            this.f39109l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f39117t.f(this.f39109l, matrix, true);
            if (rectF.intersect(this.f39109l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.f39113p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        M(this.f39116s.p() == 1.0f);
    }

    private void F(float f4) {
        this.f39113p.Q().o().e(this.f39114q.i(), f4);
    }

    private void M(boolean z4) {
        if (z4 != this.f39122y) {
            this.f39122y = z4;
            D();
        }
    }

    private void N() {
        if (this.f39114q.e().isEmpty()) {
            M(true);
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f39114q.e());
        this.f39116s = dVar;
        dVar.l();
        this.f39116s.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.a.b
            public final void a() {
                b.this.E();
            }
        });
        M(this.f39116s.h().floatValue() == 1.0f);
        i(this.f39116s);
    }

    private void j(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        this.f39101d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f39098a, this.f39101d);
    }

    private void k(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f39106i, this.f39102e);
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        this.f39101d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f39098a, this.f39101d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f39106i, this.f39101d);
        canvas.drawRect(this.f39106i, this.f39101d);
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        this.f39101d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f39098a, this.f39103f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f39106i, this.f39102e);
        canvas.drawRect(this.f39106i, this.f39101d);
        this.f39103f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        canvas.drawPath(this.f39098a, this.f39103f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f39106i, this.f39103f);
        canvas.drawRect(this.f39106i, this.f39101d);
        this.f39103f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        canvas.drawPath(this.f39098a, this.f39103f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        String s4 = ProtectedSandApp.s("ŝ");
        com.airbnb.lottie.e.a(s4);
        com.airbnb.lottie.utils.j.o(canvas, this.f39106i, this.f39102e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.e.b(s4);
        for (int i4 = 0; i4 < this.f39115r.b().size(); i4++) {
            com.airbnb.lottie.model.content.h hVar = this.f39115r.b().get(i4);
            com.airbnb.lottie.animation.keyframe.a<n, Path> aVar = this.f39115r.a().get(i4);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f39115r.c().get(i4);
            int i5 = a.f39125b[hVar.a().ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (i4 == 0) {
                        this.f39101d.setColor(x1.f27484y);
                        this.f39101d.setAlpha(255);
                        canvas.drawRect(this.f39106i, this.f39101d);
                    }
                    if (hVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        if (hVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f39101d.setAlpha(255);
                canvas.drawRect(this.f39106i, this.f39101d);
            }
        }
        String s5 = ProtectedSandApp.s("Ş");
        com.airbnb.lottie.e.a(s5);
        canvas.restore();
        com.airbnb.lottie.e.b(s5);
    }

    private void p(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<n, Path> aVar) {
        this.f39098a.set(aVar.h());
        this.f39098a.transform(matrix);
        canvas.drawPath(this.f39098a, this.f39103f);
    }

    private boolean q() {
        if (this.f39115r.a().isEmpty()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f39115r.b().size(); i4++) {
            if (this.f39115r.b().get(i4).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f39119v != null) {
            return;
        }
        if (this.f39118u == null) {
            this.f39119v = Collections.emptyList();
            return;
        }
        this.f39119v = new ArrayList();
        for (b bVar = this.f39118u; bVar != null; bVar = bVar.f39118u) {
            this.f39119v.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        String s4 = ProtectedSandApp.s("ş");
        com.airbnb.lottie.e.a(s4);
        RectF rectF = this.f39106i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f39105h);
        com.airbnb.lottie.e.b(s4);
    }

    @q0
    static b u(c cVar, e eVar, n0 n0Var, k kVar) {
        switch (a.f39124a[eVar.f().ordinal()]) {
            case 1:
                return new g(n0Var, eVar, cVar);
            case 2:
                return new c(n0Var, eVar, kVar.p(eVar.m()), kVar);
            case 3:
                return new h(n0Var, eVar);
            case 4:
                return new d(n0Var, eVar);
            case 5:
                return new f(n0Var, eVar);
            case 6:
                return new i(n0Var, eVar);
            default:
                com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Š") + eVar.f());
                return null;
        }
    }

    boolean A() {
        return this.f39117t != null;
    }

    public void G(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f39120w.remove(aVar);
    }

    void H(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
    }

    void I(@q0 b bVar) {
        this.f39117t = bVar;
    }

    void J(boolean z4) {
        if (z4 && this.A == null) {
            this.A = new com.airbnb.lottie.animation.a();
        }
        this.f39123z = z4;
    }

    void K(@q0 b bVar) {
        this.f39118u = bVar;
    }

    void L(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f39121x.j(f4);
        if (this.f39115r != null) {
            for (int i4 = 0; i4 < this.f39115r.a().size(); i4++) {
                this.f39115r.a().get(i4).m(f4);
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f39116s;
        if (dVar != null) {
            dVar.m(f4);
        }
        b bVar = this.f39117t;
        if (bVar != null) {
            bVar.L(f4);
        }
        for (int i5 = 0; i5 < this.f39120w.size(); i5++) {
            this.f39120w.get(i5).m(f4);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        D();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.f
    @androidx.annotation.i
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        this.f39121x.c(t4, jVar);
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        b bVar = this.f39117t;
        if (bVar != null) {
            com.airbnb.lottie.model.e a5 = eVar2.a(bVar.getName());
            if (eVar.c(this.f39117t.getName(), i4)) {
                list.add(a5.j(this.f39117t));
            }
            if (eVar.i(getName(), i4)) {
                this.f39117t.H(eVar, eVar.e(this.f39117t.getName(), i4) + i4, list, a5);
            }
        }
        if (eVar.h(getName(), i4)) {
            if (!ProtectedSandApp.s("š").equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i4)) {
                    list.add(eVar2.j(this));
                }
            }
            if (eVar.i(getName(), i4)) {
                H(eVar, eVar.e(getName(), i4) + i4, list, eVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    @androidx.annotation.i
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f39106i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f39112o.set(matrix);
        if (z4) {
            List<b> list = this.f39119v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f39112o.preConcat(this.f39119v.get(size).f39121x.f());
                }
            } else {
                b bVar = this.f39118u;
                if (bVar != null) {
                    this.f39112o.preConcat(bVar.f39121x.f());
                }
            }
        }
        this.f39112o.preConcat(this.f39121x.f());
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f39114q.i();
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        Paint paint;
        com.airbnb.lottie.e.a(this.f39111n);
        if (!this.f39122y || this.f39114q.x()) {
            com.airbnb.lottie.e.b(this.f39111n);
            return;
        }
        r();
        String s4 = ProtectedSandApp.s("Ţ");
        com.airbnb.lottie.e.a(s4);
        this.f39099b.reset();
        this.f39099b.set(matrix);
        for (int size = this.f39119v.size() - 1; size >= 0; size--) {
            this.f39099b.preConcat(this.f39119v.get(size).f39121x.f());
        }
        com.airbnb.lottie.e.b(s4);
        int intValue = (int) ((((i4 / 255.0f) * (this.f39121x.h() == null ? 100 : this.f39121x.h().h().intValue())) / 100.0f) * 255.0f);
        boolean A = A();
        String s5 = ProtectedSandApp.s("ţ");
        if (!A && !z()) {
            this.f39099b.preConcat(this.f39121x.f());
            com.airbnb.lottie.e.a(s5);
            t(canvas, this.f39099b, intValue);
            com.airbnb.lottie.e.b(s5);
            F(com.airbnb.lottie.e.b(this.f39111n));
            return;
        }
        String s6 = ProtectedSandApp.s("Ť");
        com.airbnb.lottie.e.a(s6);
        f(this.f39106i, this.f39099b, false);
        C(this.f39106i, matrix);
        this.f39099b.preConcat(this.f39121x.f());
        B(this.f39106i, this.f39099b);
        this.f39107j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f39100c);
        if (!this.f39100c.isIdentity()) {
            Matrix matrix2 = this.f39100c;
            matrix2.invert(matrix2);
            this.f39100c.mapRect(this.f39107j);
        }
        if (!this.f39106i.intersect(this.f39107j)) {
            this.f39106i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.e.b(s6);
        if (this.f39106i.width() >= 1.0f && this.f39106i.height() >= 1.0f) {
            String s7 = ProtectedSandApp.s("ŝ");
            com.airbnb.lottie.e.a(s7);
            this.f39101d.setAlpha(255);
            com.airbnb.lottie.utils.j.n(canvas, this.f39106i, this.f39101d);
            com.airbnb.lottie.e.b(s7);
            s(canvas);
            com.airbnb.lottie.e.a(s5);
            t(canvas, this.f39099b, intValue);
            com.airbnb.lottie.e.b(s5);
            if (z()) {
                o(canvas, this.f39099b);
            }
            boolean A2 = A();
            String s10 = ProtectedSandApp.s("Ş");
            if (A2) {
                String s11 = ProtectedSandApp.s("ť");
                com.airbnb.lottie.e.a(s11);
                com.airbnb.lottie.e.a(s7);
                com.airbnb.lottie.utils.j.o(canvas, this.f39106i, this.f39104g, 19);
                com.airbnb.lottie.e.b(s7);
                s(canvas);
                this.f39117t.h(canvas, matrix, intValue);
                com.airbnb.lottie.e.a(s10);
                canvas.restore();
                com.airbnb.lottie.e.b(s10);
                com.airbnb.lottie.e.b(s11);
            }
            com.airbnb.lottie.e.a(s10);
            canvas.restore();
            com.airbnb.lottie.e.b(s10);
        }
        if (this.f39123z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f39106i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f39106i, this.A);
        }
        F(com.airbnb.lottie.e.b(this.f39111n));
    }

    public void i(@q0 com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f39120w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i4);

    @q0
    public com.airbnb.lottie.model.content.a v() {
        return this.f39114q.a();
    }

    public BlurMaskFilter w(float f4) {
        if (this.B == f4) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f4 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f4;
        return blurMaskFilter;
    }

    @q0
    public com.airbnb.lottie.parser.j x() {
        return this.f39114q.c();
    }

    e y() {
        return this.f39114q;
    }

    boolean z() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f39115r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }
}
