package androidx.recyclerview.widget;

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

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes3.dex */
public class l extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9401d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9402e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9403f = "DividerItem";

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f9404g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f9405a;

    /* renamed from: b, reason: collision with root package name */
    private int f9406b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f9407c = new Rect();

    public l(Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f9404g);
        this.f9405a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        p(i5);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i5;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i5 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i5, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i5 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            recyclerView.H0().X(childAt, this.f9407c);
            int round = Math.round(childAt.getTranslationX()) + this.f9407c.right;
            this.f9405a.setBounds(round - this.f9405a.getIntrinsicWidth(), i5, round, height);
            this.f9405a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i5;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i5 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i5, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i5 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            recyclerView.y0(childAt, this.f9407c);
            int round = Math.round(childAt.getTranslationY()) + this.f9407c.bottom;
            this.f9405a.setBounds(i5, round - this.f9405a.getIntrinsicHeight(), width, round);
            this.f9405a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Drawable drawable = this.f9405a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f9406b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.H0() == null || this.f9405a == null) {
            return;
        }
        if (this.f9406b == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    @q0
    public Drawable n() {
        return this.f9405a;
    }

    public void o(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f9405a = drawable;
    }

    public void p(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f9406b = i5;
    }
}
