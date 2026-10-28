package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
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
    public static final int f33292d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f33293e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f33294f = "DividerItem";

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f33295g = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f33296a;

    /* renamed from: b, reason: collision with root package name */
    private int f33297b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f33298c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public l(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f33295g);
        this.f33296a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        g(i4);
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i4, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i4 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f33298c);
            int round = Math.round(childAt.getTranslationX()) + this.f33298c.right;
            this.f33296a.setBounds(round - this.f33296a.getIntrinsicWidth(), i4, round, height);
            this.f33296a.draw(canvas);
        }
        canvas.restore();
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i4 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i4, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i4 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f33298c);
            int round = Math.round(childAt.getTranslationY()) + this.f33298c.bottom;
            this.f33296a.setBounds(i4, round - this.f33296a.getIntrinsicHeight(), width, round);
            this.f33296a.draw(canvas);
        }
        canvas.restore();
    }

    @q0
    public Drawable e() {
        return this.f33296a;
    }

    public void f(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f33296a = drawable;
    }

    public void g(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f33297b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        Drawable drawable = this.f33296a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f33297b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (recyclerView.getLayoutManager() == null || this.f33296a == null) {
            return;
        }
        if (this.f33297b == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }
}
