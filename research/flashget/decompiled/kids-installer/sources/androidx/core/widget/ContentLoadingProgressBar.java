package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: u, reason: collision with root package name */
    private static final int f5829u = 500;

    /* renamed from: v, reason: collision with root package name */
    private static final int f5830v = 500;

    /* renamed from: o, reason: collision with root package name */
    long f5831o;

    /* renamed from: p, reason: collision with root package name */
    boolean f5832p;

    /* renamed from: q, reason: collision with root package name */
    boolean f5833q;

    /* renamed from: r, reason: collision with root package name */
    boolean f5834r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f5835s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f5836t;

    public ContentLoadingProgressBar(@o0 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l1
    public void f() {
        this.f5834r = true;
        removeCallbacks(this.f5836t);
        this.f5833q = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = this.f5831o;
        long j6 = currentTimeMillis - j5;
        if (j6 >= 500 || j5 == -1) {
            setVisibility(8);
        } else {
            if (this.f5832p) {
                return;
            }
            postDelayed(this.f5835s, 500 - j6);
            this.f5832p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f5832p = false;
        this.f5831o = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f5833q = false;
        if (this.f5834r) {
            return;
        }
        this.f5831o = System.currentTimeMillis();
        setVisibility(0);
    }

    private void i() {
        removeCallbacks(this.f5835s);
        removeCallbacks(this.f5836t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l1
    public void k() {
        this.f5831o = -1L;
        this.f5834r = false;
        removeCallbacks(this.f5835s);
        this.f5832p = false;
        if (this.f5833q) {
            return;
        }
        postDelayed(this.f5836t, 500L);
        this.f5833q = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.f();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.k();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public ContentLoadingProgressBar(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5831o = -1L;
        this.f5832p = false;
        this.f5833q = false;
        this.f5834r = false;
        this.f5835s = new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.g();
            }
        };
        this.f5836t = new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.h();
            }
        };
    }
}
