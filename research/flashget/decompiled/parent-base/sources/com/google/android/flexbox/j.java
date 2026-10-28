package com.google.android.flexbox;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: FlexboxItemDecoration.java */
/* loaded from: classes5.dex */
public class j extends RecyclerView.o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f52452c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f52453d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f52454e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f52455f = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f52456a;

    /* renamed from: b, reason: collision with root package name */
    private int f52457b;

    public j(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f52455f);
        this.f52456a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        k(3);
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int top2;
        int intrinsicHeight;
        int left;
        int right;
        int i4;
        int i5;
        int i6;
        if (f()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int c5 = flexboxLayoutManager.c();
            int left2 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (c5 == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    top2 = this.f52456a.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    intrinsicHeight = top2 - this.f52456a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.A()) {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    right = childAt.getRight();
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                } else if (flexboxLayoutManager.b0()) {
                    i5 = Math.min(this.f52456a.getIntrinsicWidth() + childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, paddingRight);
                    i6 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    this.f52456a.setBounds(i6, intrinsicHeight, i5, top2);
                    this.f52456a.draw(canvas);
                } else {
                    left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52456a.getIntrinsicWidth(), left2);
                    right = childAt.getRight();
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                int i10 = left;
                i5 = right + i4;
                i6 = i10;
                this.f52456a.setBounds(i6, intrinsicHeight, i5, top2);
                this.f52456a.draw(canvas);
            }
        }
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i4;
        int i5;
        if (g()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount = recyclerView.getChildCount();
            int c5 = flexboxLayoutManager.c();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerView.getChildAt(i6);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.b0()) {
                    intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    left = this.f52456a.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    intrinsicWidth = left - this.f52456a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.A()) {
                    max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom = childAt.getBottom();
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else if (c5 == 3) {
                    int min = Math.min(this.f52456a.getIntrinsicHeight() + childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, paddingBottom);
                    max = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i5 = min;
                    this.f52456a.setBounds(intrinsicWidth, max, left, i5);
                    this.f52456a.draw(canvas);
                } else {
                    max = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52456a.getIntrinsicHeight(), top2);
                    bottom = childAt.getBottom();
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                i5 = bottom + i4;
                this.f52456a.setBounds(intrinsicWidth, max, left, i5);
                this.f52456a.draw(canvas);
            }
        }
    }

    private boolean e(int i4, List<f> list, FlexboxLayoutManager flexboxLayoutManager) {
        int Y = flexboxLayoutManager.Y(i4);
        if ((Y == -1 || Y >= flexboxLayoutManager.i().size() || flexboxLayoutManager.i().get(Y).f52433o != i4) && i4 != 0) {
            return list.size() != 0 && ((f) androidx.appcompat.view.menu.d.a(list, 1)).f52434p == i4 - 1;
        }
        return true;
    }

    private boolean f() {
        return (this.f52457b & 1) > 0;
    }

    private boolean g() {
        return (this.f52457b & 2) > 0;
    }

    private void i(Rect rect, int i4, FlexboxLayoutManager flexboxLayoutManager, List<f> list) {
        if (list.size() == 0 || flexboxLayoutManager.Y(i4) == 0) {
            return;
        }
        if (flexboxLayoutManager.A()) {
            if (f()) {
                rect.top = this.f52456a.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if (g()) {
            if (flexboxLayoutManager.b0()) {
                rect.right = this.f52456a.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.f52456a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void j(Rect rect, int i4, FlexboxLayoutManager flexboxLayoutManager, List<f> list, int i5) {
        if (e(i4, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.A()) {
            if (!g()) {
                rect.left = 0;
                rect.right = 0;
                return;
            } else if (flexboxLayoutManager.b0()) {
                rect.right = this.f52456a.getIntrinsicWidth();
                rect.left = 0;
                return;
            } else {
                rect.left = this.f52456a.getIntrinsicWidth();
                rect.right = 0;
                return;
            }
        }
        if (!f()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i5 == 3) {
            rect.bottom = this.f52456a.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.f52456a.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@o0 Rect rect, @o0 View view, RecyclerView recyclerView, @o0 RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!f() && !g()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<f> g4 = flexboxLayoutManager.g();
        j(rect, childAdapterPosition, flexboxLayoutManager, g4, flexboxLayoutManager.c());
        i(rect, childAdapterPosition, flexboxLayoutManager, g4);
    }

    public void h(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("웊"));
        }
        this.f52456a = drawable;
    }

    public void k(int i4) {
        this.f52457b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.a0 a0Var) {
        c(canvas, recyclerView);
        d(canvas, recyclerView);
    }
}
