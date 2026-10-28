package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f39046a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f39047b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39048c;

    public n(PointF pointF, boolean z4, List<com.airbnb.lottie.model.a> list) {
        this.f39047b = pointF;
        this.f39048c = z4;
        this.f39046a = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f39046a;
    }

    public PointF b() {
        return this.f39047b;
    }

    public void c(n nVar, n nVar2, @x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f39047b == null) {
            this.f39047b = new PointF();
        }
        this.f39048c = nVar.d() || nVar2.d();
        if (nVar.a().size() != nVar2.a().size()) {
            com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("ļ") + nVar.a().size() + ProtectedSandApp.s("Ľ") + nVar2.a().size());
        }
        int min = Math.min(nVar.a().size(), nVar2.a().size());
        if (this.f39046a.size() < min) {
            for (int size = this.f39046a.size(); size < min; size++) {
                this.f39046a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f39046a.size() > min) {
            for (int size2 = this.f39046a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f39046a;
                list.remove(list.size() - 1);
            }
        }
        PointF b5 = nVar.b();
        PointF b6 = nVar2.b();
        f(com.airbnb.lottie.utils.i.k(b5.x, b6.x, f4), com.airbnb.lottie.utils.i.k(b5.y, b6.y, f4));
        for (int size3 = this.f39046a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = nVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = nVar2.a().get(size3);
            PointF a5 = aVar.a();
            PointF b7 = aVar.b();
            PointF c5 = aVar.c();
            PointF a6 = aVar2.a();
            PointF b10 = aVar2.b();
            PointF c6 = aVar2.c();
            this.f39046a.get(size3).d(com.airbnb.lottie.utils.i.k(a5.x, a6.x, f4), com.airbnb.lottie.utils.i.k(a5.y, a6.y, f4));
            this.f39046a.get(size3).e(com.airbnb.lottie.utils.i.k(b7.x, b10.x, f4), com.airbnb.lottie.utils.i.k(b7.y, b10.y, f4));
            this.f39046a.get(size3).g(com.airbnb.lottie.utils.i.k(c5.x, c6.x, f4), com.airbnb.lottie.utils.i.k(c5.y, c6.y, f4));
        }
    }

    public boolean d() {
        return this.f39048c;
    }

    public void e(boolean z4) {
        this.f39048c = z4;
    }

    public void f(float f4, float f5) {
        if (this.f39047b == null) {
            this.f39047b = new PointF();
        }
        this.f39047b.set(f4, f5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ľ"));
        sb.append(this.f39046a.size());
        sb.append(ProtectedSandApp.s("Ŀ"));
        return androidx.compose.animation.l.a(sb, this.f39048c, '}');
    }

    public n() {
        this.f39046a = new ArrayList();
    }
}
