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
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SmartDivider.java */
/* loaded from: classes6.dex */
public class a extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f69958d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f69959e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f69960f = ProtectedSandApp.s("ᠪ\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f69961g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f69962a;

    /* renamed from: b, reason: collision with root package name */
    private int f69963b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f69964c = new Rect();

    public a(Context context, int orientation) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f69961g);
        this.f69962a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        g(orientation);
    }

    private void c(Canvas canvas, RecyclerView parent) {
        int height;
        int i4;
        canvas.save();
        if (parent.getClipToPadding()) {
            i4 = parent.getPaddingTop();
            height = parent.getHeight() - parent.getPaddingBottom();
            canvas.clipRect(parent.getPaddingStart(), i4, parent.getWidth() - parent.getPaddingEnd(), height);
        } else {
            height = parent.getHeight();
            i4 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i5 = 0; i5 < childCount && i5 != childCount - 1; i5++) {
            View childAt = parent.getChildAt(i5);
            parent.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f69964c);
            int round = Math.round(childAt.getTranslationX()) + this.f69964c.right;
            this.f69962a.setBounds(round - this.f69962a.getIntrinsicWidth(), i4, round, height);
            this.f69962a.draw(canvas);
        }
        canvas.restore();
    }

    private void d(Canvas canvas, RecyclerView parent) {
        int width;
        int i4;
        canvas.save();
        if (parent.getClipToPadding()) {
            i4 = parent.getPaddingStart();
            width = parent.getWidth() - parent.getPaddingEnd();
            canvas.clipRect(i4, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
        } else {
            width = parent.getWidth();
            i4 = 0;
        }
        int childCount = parent.getChildCount();
        for (int i5 = 0; i5 < childCount && i5 != childCount - 1; i5++) {
            View childAt = parent.getChildAt(i5);
            parent.getDecoratedBoundsWithMargins(childAt, this.f69964c);
            int round = Math.round(childAt.getTranslationY()) + this.f69964c.bottom;
            this.f69962a.setBounds(i4, round - this.f69962a.getIntrinsicHeight(), width, round);
            this.f69962a.draw(canvas);
        }
        canvas.restore();
    }

    @q0
    public Drawable e() {
        return this.f69962a;
    }

    public void f(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᠫ\u0001"));
        }
        this.f69962a = drawable;
    }

    public void g(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᠬ\u0001"));
        }
        this.f69963b = orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.a0 state) {
        Drawable drawable = this.f69962a;
        if (drawable == null) {
            outRect.set(0, 0, 0, 0);
        } else if (this.f69963b == 1) {
            outRect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas c5, RecyclerView parent, RecyclerView.a0 state) {
        if (parent.getLayoutManager() == null || this.f69962a == null) {
            return;
        }
        if (this.f69963b == 1) {
            d(c5, parent);
        } else {
            c(c5, parent);
        }
    }
}
