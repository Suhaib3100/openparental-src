package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.z4;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.b;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;

/* compiled from: PieRadarChartTouchListener.java */
/* loaded from: classes5.dex */
public class g extends b<PieRadarChartBase<?>> {

    /* renamed from: n, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50496n;

    /* renamed from: o, reason: collision with root package name */
    private float f50497o;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList<a> f50498p;

    /* renamed from: q, reason: collision with root package name */
    private long f50499q;

    /* renamed from: r, reason: collision with root package name */
    private float f50500r;

    /* compiled from: PieRadarChartTouchListener.java */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        public long f50501a;

        /* renamed from: b, reason: collision with root package name */
        public float f50502b;

        public a(long j4, float f4) {
            this.f50501a = j4;
            this.f50502b = f4;
        }
    }

    public g(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.f50496n = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.f50497o = 0.0f;
        this.f50498p = new ArrayList<>();
        this.f50499q = 0L;
        this.f50500r = 0.0f;
    }

    private float h() {
        if (this.f50498p.isEmpty()) {
            return 0.0f;
        }
        a aVar = this.f50498p.get(0);
        a aVar2 = (a) z4.a(this.f50498p, 1);
        a aVar3 = aVar;
        for (int size = this.f50498p.size() - 1; size >= 0; size--) {
            aVar3 = this.f50498p.get(size);
            if (aVar3.f50502b != aVar2.f50502b) {
                break;
            }
        }
        float f4 = (aVar2.f50501a - aVar.f50501a) / 1000.0f;
        if (f4 == 0.0f) {
            f4 = 0.1f;
        }
        boolean z4 = aVar2.f50502b >= aVar3.f50502b;
        if (Math.abs(r1 - r6) > 270.0d) {
            z4 = !z4;
        }
        float f5 = aVar2.f50502b;
        float f6 = aVar.f50502b;
        if (f5 - f6 > 180.0d) {
            aVar.f50502b = (float) (f6 + 360.0d);
        } else if (f6 - f5 > 180.0d) {
            aVar2.f50502b = (float) (f5 + 360.0d);
        }
        float abs = Math.abs((aVar2.f50502b - aVar.f50502b) / f4);
        return !z4 ? -abs : abs;
    }

    private void j() {
        this.f50498p.clear();
    }

    private void k(float f4, float f5) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f50498p.add(new a(currentAnimationTimeMillis, ((PieRadarChartBase) this.f50495f).s1(f4, f5)));
        for (int size = this.f50498p.size(); size - 2 > 0 && currentAnimationTimeMillis - this.f50498p.get(0).f50501a > 1000; size--) {
            this.f50498p.remove(0);
        }
    }

    public void i() {
        if (this.f50500r == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f50500r = ((PieRadarChartBase) this.f50495f).V() * this.f50500r;
        T t4 = this.f50495f;
        ((PieRadarChartBase) t4).F1((this.f50500r * ((currentAnimationTimeMillis - this.f50499q) / 1000.0f)) + ((PieRadarChartBase) t4).C1());
        this.f50499q = currentAnimationTimeMillis;
        if (Math.abs(this.f50500r) >= 0.001d) {
            k.K(this.f50495f);
        } else {
            m();
        }
    }

    public void l(float f4, float f5) {
        this.f50497o = ((PieRadarChartBase) this.f50495f).s1(f4, f5) - ((PieRadarChartBase) this.f50495f).z1();
    }

    public void m() {
        this.f50500r = 0.0f;
    }

    public void n(float f4, float f5) {
        T t4 = this.f50495f;
        ((PieRadarChartBase) t4).F1(((PieRadarChartBase) t4).s1(f4, f5) - this.f50497o);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f50491b = b.a.LONG_PRESS;
        c j02 = ((PieRadarChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.g(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f50491b = b.a.SINGLE_TAP;
        c j02 = ((PieRadarChartBase) this.f50495f).j0();
        if (j02 != null) {
            j02.c(motionEvent);
        }
        if (!((PieRadarChartBase) this.f50495f).D0()) {
            return false;
        }
        e(((PieRadarChartBase) this.f50495f).a0(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f50494e.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.f50495f).D1()) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                g(motionEvent);
                m();
                j();
                if (((PieRadarChartBase) this.f50495f).z0()) {
                    k(x4, y4);
                }
                l(x4, y4);
                com.github.mikephil.charting.utils.g gVar = this.f50496n;
                gVar.f50636d = x4;
                gVar.f50637e = y4;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.f50495f).z0()) {
                    m();
                    k(x4, y4);
                    float h4 = h();
                    this.f50500r = h4;
                    if (h4 != 0.0f) {
                        this.f50499q = AnimationUtils.currentAnimationTimeMillis();
                        k.K(this.f50495f);
                    }
                }
                ((PieRadarChartBase) this.f50495f).Q();
                this.f50492c = 0;
                b(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.f50495f).z0()) {
                    k(x4, y4);
                }
                if (this.f50492c == 0) {
                    com.github.mikephil.charting.utils.g gVar2 = this.f50496n;
                    if (b.a(x4, gVar2.f50636d, y4, gVar2.f50637e) > k.e(8.0f)) {
                        this.f50491b = b.a.ROTATE;
                        this.f50492c = 6;
                        ((PieRadarChartBase) this.f50495f).N();
                        b(motionEvent);
                    }
                }
                if (this.f50492c == 6) {
                    n(x4, y4);
                    ((PieRadarChartBase) this.f50495f).invalidate();
                }
                b(motionEvent);
            }
        }
        return true;
    }
}
