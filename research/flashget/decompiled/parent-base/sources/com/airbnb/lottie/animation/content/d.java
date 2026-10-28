package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes3.dex */
public class d implements e, n, a.b, com.airbnb.lottie.model.f {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f38666a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f38667b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f38668c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f38669d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f38670e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38671f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f38672g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f38673h;

    /* renamed from: i, reason: collision with root package name */
    private final n0 f38674i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private List<n> f38675j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.p f38676k;

    public d(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.p pVar) {
        this(n0Var, bVar, pVar.c(), pVar.d(), g(n0Var, bVar, pVar.b()), i(pVar.b()));
    }

    private static List<c> g(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            c a5 = list.get(i4).a(n0Var, bVar);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        return arrayList;
    }

    @q0
    static com.airbnb.lottie.model.animatable.l i(List<com.airbnb.lottie.model.content.c> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i4);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean l() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f38673h.size(); i5++) {
            if ((this.f38673h.get(i5) instanceof e) && (i4 = i4 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38674i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(this.f38673h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f38673h.size() - 1; size >= 0; size--) {
            c cVar = this.f38673h.get(size);
            cVar.b(arrayList, this.f38673h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f38676k;
        if (pVar != null) {
            pVar.c(t4, jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        boolean h4 = eVar.h(getName(), i4);
        String s4 = ProtectedSandApp.s("û");
        if (h4 || s4.equals(getName())) {
            if (!s4.equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i4)) {
                    list.add(eVar2.j(this));
                }
            }
            if (eVar.i(getName(), i4)) {
                int e4 = eVar.e(getName(), i4) + i4;
                for (int i5 = 0; i5 < this.f38673h.size(); i5++) {
                    c cVar = this.f38673h.get(i5);
                    if (cVar instanceof com.airbnb.lottie.model.f) {
                        ((com.airbnb.lottie.model.f) cVar).e(eVar, e4, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f38668c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f38676k;
        if (pVar != null) {
            this.f38668c.preConcat(pVar.f());
        }
        this.f38670e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f38673h.size() - 1; size >= 0; size--) {
            c cVar = this.f38673h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f38670e, this.f38668c, z4);
                rectF.union(this.f38670e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38671f;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f38668c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f38676k;
        if (pVar != null) {
            this.f38668c.set(pVar.f());
        }
        this.f38669d.reset();
        if (this.f38672g) {
            return this.f38669d;
        }
        for (int size = this.f38673h.size() - 1; size >= 0; size--) {
            c cVar = this.f38673h.get(size);
            if (cVar instanceof n) {
                this.f38669d.addPath(((n) cVar).getPath(), this.f38668c);
            }
        }
        return this.f38669d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f38672g) {
            return;
        }
        this.f38668c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f38676k;
        if (pVar != null) {
            this.f38668c.preConcat(pVar.f());
            i4 = (int) (((((this.f38676k.h() == null ? 100 : this.f38676k.h().h().intValue()) / 100.0f) * i4) / 255.0f) * 255.0f);
        }
        boolean z4 = this.f38674i.o0() && l() && i4 != 255;
        if (z4) {
            this.f38667b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f38667b, this.f38668c, true);
            this.f38666a.setAlpha(i4);
            com.airbnb.lottie.utils.j.n(canvas, this.f38667b, this.f38666a);
        }
        if (z4) {
            i4 = 255;
        }
        for (int size = this.f38673h.size() - 1; size >= 0; size--) {
            c cVar = this.f38673h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).h(canvas, this.f38668c, i4);
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    List<n> j() {
        if (this.f38675j == null) {
            this.f38675j = new ArrayList();
            for (int i4 = 0; i4 < this.f38673h.size(); i4++) {
                c cVar = this.f38673h.get(i4);
                if (cVar instanceof n) {
                    this.f38675j.add((n) cVar);
                }
            }
        }
        return this.f38675j;
    }

    Matrix k() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f38676k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f38668c.reset();
        return this.f38668c;
    }

    d(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, String str, boolean z4, List<c> list, @q0 com.airbnb.lottie.model.animatable.l lVar) {
        this.f38666a = new com.airbnb.lottie.animation.a();
        this.f38667b = new RectF();
        this.f38668c = new Matrix();
        this.f38669d = new Path();
        this.f38670e = new RectF();
        this.f38671f = str;
        this.f38674i = n0Var;
        this.f38672g = z4;
        this.f38673h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p b5 = lVar.b();
            this.f38676k = b5;
            b5.a(bVar);
            this.f38676k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}
