package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes3.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f38766a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f38767b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final n0 f38768c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f38769d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38770e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38771f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38772g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38773h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f38774i;

    /* renamed from: j, reason: collision with root package name */
    private d f38775j;

    public q(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this.f38768c = n0Var;
        this.f38769d = bVar;
        this.f38770e = lVar.c();
        this.f38771f = lVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = lVar.b().p();
        this.f38772g = p4;
        bVar.i(p4);
        p4.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p5 = lVar.d().p();
        this.f38773h = p5;
        bVar.i(p5);
        p5.a(this);
        com.airbnb.lottie.animation.keyframe.p b5 = lVar.e().b();
        this.f38774i = b5;
        b5.a(bVar);
        b5.b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38768c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        this.f38775j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        if (this.f38774i.c(t4, jVar)) {
            return;
        }
        if (t4 == s0.f39360u) {
            this.f38772g.n(jVar);
        } else if (t4 == s0.f39361v) {
            this.f38773h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i4, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f38775j.f(rectF, matrix, z4);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        if (this.f38775j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f38775j = new d(this.f38768c, this.f38769d, ProtectedSandApp.s("þ"), this.f38771f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38770e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        Path path = this.f38775j.getPath();
        this.f38767b.reset();
        float floatValue = this.f38772g.h().floatValue();
        float floatValue2 = this.f38773h.h().floatValue();
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            this.f38766a.set(this.f38774i.g(i4 + floatValue2));
            this.f38767b.addPath(path, this.f38766a);
        }
        return this.f38767b;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        float floatValue = this.f38772g.h().floatValue();
        float floatValue2 = this.f38773h.h().floatValue();
        float floatValue3 = this.f38774i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f38774i.e().h().floatValue() / 100.0f;
        for (int i5 = ((int) floatValue) - 1; i5 >= 0; i5--) {
            this.f38766a.set(matrix);
            float f4 = i5;
            this.f38766a.preConcat(this.f38774i.g(f4 + floatValue2));
            this.f38775j.h(canvas, this.f38766a, (int) (com.airbnb.lottie.utils.i.k(floatValue3, floatValue4, f4 / floatValue) * i4));
        }
    }
}
