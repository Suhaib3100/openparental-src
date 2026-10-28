package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes3.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: h, reason: collision with root package name */
    private static final int f27507h = 500;

    /* renamed from: i, reason: collision with root package name */
    private static final int f27508i = 500;

    /* renamed from: b, reason: collision with root package name */
    long f27509b;

    /* renamed from: c, reason: collision with root package name */
    boolean f27510c;

    /* renamed from: d, reason: collision with root package name */
    boolean f27511d;

    /* renamed from: e, reason: collision with root package name */
    boolean f27512e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f27513f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f27514g;

    public ContentLoadingProgressBar(@o0 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l1
    public void f() {
        this.f27512e = true;
        removeCallbacks(this.f27514g);
        this.f27511d = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.f27509b;
        long j5 = currentTimeMillis - j4;
        if (j5 >= 500 || j4 == -1) {
            setVisibility(8);
        } else {
            if (this.f27510c) {
                return;
            }
            postDelayed(this.f27513f, 500 - j5);
            this.f27510c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f27510c = false;
        this.f27509b = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f27511d = false;
        if (this.f27512e) {
            return;
        }
        this.f27509b = System.currentTimeMillis();
        setVisibility(0);
    }

    private void i() {
        removeCallbacks(this.f27513f);
        removeCallbacks(this.f27514g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l1
    public void k() {
        this.f27509b = -1L;
        this.f27512e = false;
        removeCallbacks(this.f27513f);
        this.f27510c = false;
        if (this.f27511d) {
            return;
        }
        postDelayed(this.f27514g, 500L);
        this.f27511d = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.f();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: androidx.core.widget.g
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
        this.f27509b = -1L;
        this.f27510c = false;
        this.f27511d = false;
        this.f27512e = false;
        this.f27513f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.g();
            }
        };
        this.f27514g = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.h();
            }
        };
    }
}
