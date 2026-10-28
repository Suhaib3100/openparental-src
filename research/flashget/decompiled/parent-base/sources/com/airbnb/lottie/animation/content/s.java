package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes3.dex */
public class s implements n, a.b {

    /* renamed from: b, reason: collision with root package name */
    private final String f38782b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38783c;

    /* renamed from: d, reason: collision with root package name */
    private final n0 f38784d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.m f38785e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private List<t> f38786f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38787g;

    /* renamed from: a, reason: collision with root package name */
    private final Path f38781a = new Path();

    /* renamed from: h, reason: collision with root package name */
    private final b f38788h = new b();

    public s(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.q qVar) {
        this.f38782b = qVar.b();
        this.f38783c = qVar.d();
        this.f38784d = n0Var;
        com.airbnb.lottie.animation.keyframe.m p4 = qVar.c().p();
        this.f38785e = p4;
        bVar.i(p4);
        p4.a(this);
    }

    private void d() {
        this.f38787g = false;
        this.f38784d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        d();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f38788h.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof t) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((t) cVar);
            }
        }
        this.f38785e.q(arrayList);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38782b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f38787g) {
            return this.f38781a;
        }
        this.f38781a.reset();
        if (this.f38783c) {
            this.f38787g = true;
            return this.f38781a;
        }
        Path h4 = this.f38785e.h();
        if (h4 == null) {
            return this.f38781a;
        }
        this.f38781a.set(h4);
        this.f38781a.setFillType(Path.FillType.EVEN_ODD);
        this.f38788h.b(this.f38781a);
        this.f38787g = true;
        return this.f38781a;
    }
}
