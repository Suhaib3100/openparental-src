package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.m;

/* compiled from: BarLineScatterCandleBubbleRenderer.java */
/* loaded from: classes5.dex */
public abstract class c extends g {

    /* renamed from: g, reason: collision with root package name */
    protected a f50516g;

    /* compiled from: BarLineScatterCandleBubbleRenderer.java */
    protected class a {

        /* renamed from: a, reason: collision with root package name */
        public int f50517a;

        /* renamed from: b, reason: collision with root package name */
        public int f50518b;

        /* renamed from: c, reason: collision with root package name */
        public int f50519c;

        protected a() {
        }

        public void a(e8.b bVar, f8.b bVar2) {
            float max = Math.max(0.0f, Math.min(1.0f, c.this.f50535b.h()));
            float f4 = bVar.f();
            float g4 = bVar.g();
            T Q0 = bVar2.Q0(f4, Float.NaN, m.a.DOWN);
            T Q02 = bVar2.Q0(g4, Float.NaN, m.a.UP);
            this.f50517a = Q0 == 0 ? 0 : bVar2.g(Q0);
            this.f50518b = Q02 != 0 ? bVar2.g(Q02) : 0;
            this.f50519c = (int) ((r2 - this.f50517a) * max);
        }
    }

    public c(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50516g = new a();
    }

    protected boolean l(Entry entry, f8.b bVar) {
        if (entry == null) {
            return false;
        }
        return ((float) bVar.g(entry)) < this.f50535b.h() * ((float) bVar.h1());
    }

    protected boolean m(f8.e eVar) {
        return eVar.isVisible() && (eVar.S() || eVar.q0());
    }
}
