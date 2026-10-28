package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.List;

/* compiled from: BaseIndicatorController.java */
/* loaded from: classes6.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private View f66611a;

    /* renamed from: b, reason: collision with root package name */
    private List<Animator> f66612b;

    /* compiled from: BaseIndicatorController.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66613a;

        static {
            int[] iArr = new int[b.values().length];
            f66613a = iArr;
            try {
                iArr[b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66613a[b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66613a[b.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: BaseIndicatorController.java */
    public enum b {
        START,
        END,
        CANCEL
    }

    private void i() {
        List<Animator> list = this.f66612b;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = this.f66612b.get(i4);
            animator.cancel();
            animator.removeAllListeners();
        }
        this.f66612b.clear();
        this.f66612b = null;
    }

    public abstract List<Animator> a();

    public void b() {
        this.f66611a = null;
        i();
        this.f66612b = null;
    }

    public abstract void c(Canvas canvas, Paint paint);

    public int d() {
        View view = this.f66611a;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public View e() {
        return this.f66611a;
    }

    public int f() {
        View view = this.f66611a;
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public void g() {
        this.f66612b = a();
    }

    public void h() {
        View view = this.f66611a;
        if (view != null) {
            view.postInvalidate();
        }
    }

    public void j(b bVar) {
        List<Animator> list = this.f66612b;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = this.f66612b.get(i4);
            boolean isRunning = animator.isRunning();
            int i5 = a.f66613a[bVar.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3 && isRunning) {
                        animator.cancel();
                    }
                } else if (isRunning) {
                    animator.end();
                }
            } else if (!isRunning) {
                animator.start();
            }
        }
    }

    public void k(View view) {
        this.f66611a = view;
    }
}
