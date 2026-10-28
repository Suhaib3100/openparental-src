package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CombinedChartRenderer.java */
/* loaded from: classes5.dex */
public class f extends g {

    /* renamed from: g, reason: collision with root package name */
    protected List<g> f50531g;

    /* renamed from: h, reason: collision with root package name */
    protected WeakReference<Chart> f50532h;

    /* renamed from: i, reason: collision with root package name */
    protected List<com.github.mikephil.charting.highlight.d> f50533i;

    /* compiled from: CombinedChartRenderer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50534a;

        static {
            int[] iArr = new int[CombinedChart.a.values().length];
            f50534a = iArr;
            try {
                iArr[CombinedChart.a.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50534a[CombinedChart.a.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50534a[CombinedChart.a.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50534a[CombinedChart.a.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50534a[CombinedChart.a.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(CombinedChart combinedChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50531g = new ArrayList(5);
        this.f50533i = new ArrayList();
        this.f50532h = new WeakReference<>(combinedChart);
        l();
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        Iterator<g> it = this.f50531g.iterator();
        while (it.hasNext()) {
            it.next().b(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
        Iterator<g> it = this.f50531g.iterator();
        while (it.hasNext()) {
            it.next().c(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        Chart chart = this.f50532h.get();
        if (chart == null) {
            return;
        }
        for (g gVar : this.f50531g) {
            Object v4 = gVar instanceof b ? ((b) gVar).f50510h.v() : gVar instanceof j ? ((j) gVar).f50551i.r() : gVar instanceof e ? ((e) gVar).f50525i.z() : gVar instanceof p ? ((p) gVar).f50590i.e() : gVar instanceof d ? ((d) gVar).f50521h.c() : null;
            int indexOf = v4 == null ? -1 : ((com.github.mikephil.charting.data.l) chart.b()).Q().indexOf(v4);
            this.f50533i.clear();
            for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
                if (dVar.c() == indexOf || dVar.c() == -1) {
                    this.f50533i.add(dVar);
                }
            }
            List<com.github.mikephil.charting.highlight.d> list = this.f50533i;
            gVar.d(canvas, (com.github.mikephil.charting.highlight.d[]) list.toArray(new com.github.mikephil.charting.highlight.d[list.size()]));
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        Iterator<g> it = this.f50531g.iterator();
        while (it.hasNext()) {
            it.next().f(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
        Iterator<g> it = this.f50531g.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public void l() {
        this.f50531g.clear();
        CombinedChart combinedChart = (CombinedChart) this.f50532h.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.a aVar : combinedChart.X2()) {
            int i4 = a.f50534a[aVar.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5 && combinedChart.e() != null) {
                                this.f50531g.add(new p(combinedChart, this.f50535b, this.f50589a));
                            }
                        } else if (combinedChart.z() != null) {
                            this.f50531g.add(new e(combinedChart, this.f50535b, this.f50589a));
                        }
                    } else if (combinedChart.r() != null) {
                        this.f50531g.add(new j(combinedChart, this.f50535b, this.f50589a));
                    }
                } else if (combinedChart.c() != null) {
                    this.f50531g.add(new d(combinedChart, this.f50535b, this.f50589a));
                }
            } else if (combinedChart.v() != null) {
                this.f50531g.add(new b(combinedChart, this.f50535b, this.f50589a));
            }
        }
    }

    public g m(int i4) {
        if (i4 >= this.f50531g.size() || i4 < 0) {
            return null;
        }
        return this.f50531g.get(i4);
    }

    public List<g> n() {
        return this.f50531g;
    }

    public void o(List<g> list) {
        this.f50531g = list;
    }
}
