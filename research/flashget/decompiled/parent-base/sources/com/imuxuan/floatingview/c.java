package com.imuxuan.floatingview;

import android.R;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.j0;
import androidx.annotation.v;
import androidx.core.view.x1;
import com.google.android.material.badge.BadgeDrawable;
import com.imuxuan.floatingview.f;
import java.lang.ref.WeakReference;

/* compiled from: FloatingView.java */
/* loaded from: classes6.dex */
public class c implements d {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f64144f;

    /* renamed from: a, reason: collision with root package name */
    private FloatingMagnetView f64145a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<FrameLayout> f64146b;

    /* renamed from: c, reason: collision with root package name */
    @j0
    private int f64147c = f.i.A;

    /* renamed from: d, reason: collision with root package name */
    @v
    private int f64148d = f.C0972f.f64442t0;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup.LayoutParams f64149e = s();

    /* compiled from: FloatingView.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f64145a == null) {
                return;
            }
            if (x1.R0(c.this.f64145a) && c.this.r() != null) {
                c.this.r().removeView(c.this.f64145a);
            }
            c.this.f64145a = null;
        }
    }

    private c() {
    }

    private void n(View view) {
        if (r() == null) {
            return;
        }
        r().addView(view);
    }

    private void o() {
        synchronized (this) {
            try {
                if (this.f64145a != null) {
                    return;
                }
                b bVar = new b(bb.a.a(), this.f64147c);
                this.f64145a = bVar;
                bVar.setLayoutParams(this.f64149e);
                bVar.q(this.f64148d);
                n(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static c p() {
        if (f64144f == null) {
            synchronized (c.class) {
                try {
                    if (f64144f == null) {
                        f64144f = new c();
                    }
                } finally {
                }
            }
        }
        return f64144f;
    }

    private FrameLayout q(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FrameLayout r() {
        WeakReference<FrameLayout> weakReference = this.f64146b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private FrameLayout.LayoutParams s() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.f52616u;
        layoutParams.setMargins(13, layoutParams.topMargin, layoutParams.rightMargin, 500);
        return layoutParams;
    }

    @Override // com.imuxuan.floatingview.d
    public c a(Activity activity) {
        d(q(activity));
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c b(@j0 int i4) {
        this.f64147c = i4;
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c c(FloatingMagnetView floatingMagnetView) {
        this.f64145a = floatingMagnetView;
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c d(FrameLayout frameLayout) {
        FloatingMagnetView floatingMagnetView;
        if (frameLayout == null || (floatingMagnetView = this.f64145a) == null) {
            this.f64146b = new WeakReference<>(frameLayout);
            return this;
        }
        if (floatingMagnetView.getParent() == frameLayout) {
            return this;
        }
        if (this.f64145a.getParent() != null) {
            ((ViewGroup) this.f64145a.getParent()).removeView(this.f64145a);
        }
        this.f64146b = new WeakReference<>(frameLayout);
        frameLayout.addView(this.f64145a);
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c e(@v int i4) {
        this.f64148d = i4;
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c f(FrameLayout frameLayout) {
        FloatingMagnetView floatingMagnetView = this.f64145a;
        if (floatingMagnetView != null && frameLayout != null && x1.R0(floatingMagnetView)) {
            frameLayout.removeView(this.f64145a);
        }
        if (r() == frameLayout) {
            this.f64146b = null;
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c g() {
        o();
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public FloatingMagnetView getView() {
        return this.f64145a;
    }

    @Override // com.imuxuan.floatingview.d
    public c h(Activity activity) {
        f(q(activity));
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c i(e eVar) {
        FloatingMagnetView floatingMagnetView = this.f64145a;
        if (floatingMagnetView != null) {
            floatingMagnetView.n(eVar);
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c j(ViewGroup.LayoutParams layoutParams) {
        this.f64149e = layoutParams;
        FloatingMagnetView floatingMagnetView = this.f64145a;
        if (floatingMagnetView != null) {
            floatingMagnetView.setLayoutParams(layoutParams);
        }
        return this;
    }

    @Override // com.imuxuan.floatingview.d
    public c remove() {
        new Handler(Looper.getMainLooper()).post(new a());
        return this;
    }
}
