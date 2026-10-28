package com.lxj.xpopup.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SmartDivider.java */
/* loaded from: classes5.dex */
public class a extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21457d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21458e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f21459f = ProtectedSandApp.s("㗅");

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f21460g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f21461a;

    /* renamed from: b, reason: collision with root package name */
    private int f21462b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f21463c = new Rect();

    public a(Context context, int orientation) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f21460g);
        this.f21461a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        p(orientation);
    }

    private void l(Canvas canvas, RecyclerView parent) {
        int height;
        int i5;
        canvas.save();
        if (parent.getClipToPadding()) {
            i5 = parent.getPaddingTop();
            height = parent.getHeight() - parent.getPaddingBottom();
            canvas.clipRect(parent.getPaddingStart(), i5, parent.getWidth() - parent.getPaddingEnd(), height);
        } else {
            height = parent.getHeight();
            i5 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i6 = 0; i6 < childCount && i6 != childCount - 1; i6++) {
            View childAt = parent.getChildAt(i6);
            parent.H0().X(childAt, this.f21463c);
            int round = Math.round(childAt.getTranslationX()) + this.f21463c.right;
            this.f21461a.setBounds(round - this.f21461a.getIntrinsicWidth(), i5, round, height);
            this.f21461a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView parent) {
        int width;
        int i5;
        canvas.save();
        if (parent.getClipToPadding()) {
            i5 = parent.getPaddingStart();
            width = parent.getWidth() - parent.getPaddingEnd();
            canvas.clipRect(i5, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
        } else {
            width = parent.getWidth();
            i5 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i6 = 0; i6 < childCount && i6 != childCount - 1; i6++) {
            View childAt = parent.getChildAt(i6);
            parent.y0(childAt, this.f21463c);
            int round = Math.round(childAt.getTranslationY()) + this.f21463c.bottom;
            this.f21461a.setBounds(i5, round - this.f21461a.getIntrinsicHeight(), width, round);
            this.f21461a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect outRect, View view, RecyclerView parent, RecyclerView.a0 state) {
        Drawable drawable = this.f21461a;
        if (drawable == null) {
            outRect.set(0, 0, 0, 0);
        } else if (this.f21462b == 1) {
            outRect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas c6, RecyclerView parent, RecyclerView.a0 state) {
        if (parent.H0() == null || this.f21461a == null) {
            return;
        }
        if (this.f21462b == 1) {
            m(c6, parent);
        } else {
            l(c6, parent);
        }
    }

    @q0
    public Drawable n() {
        return this.f21461a;
    }

    public void o(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㗆"));
        }
        this.f21461a = drawable;
    }

    public void p(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㗇"));
        }
        this.f21462b = orientation;
    }
}
