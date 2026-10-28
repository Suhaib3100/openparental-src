package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.s;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.v;
import java.util.Calendar;
import s8.a;

/* loaded from: classes6.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f53058b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f53059c;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.l1(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i4, Rect rect) {
        if (i4 == 33) {
            setSelection(((k) super.getAdapter()).i());
        } else if (i4 == 130) {
            setSelection(((k) super.getAdapter()).b());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    private static int c(@o0 View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean d(@q0 Long l4, @q0 Long l5, @q0 Long l6, @q0 Long l7) {
        return l4 == null || l5 == null || l6 == null || l7 == null || l6.longValue() > l5.longValue() || l7.longValue() < l4.longValue();
    }

    @o0
    public k b() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @o0
    public ListAdapter getAdapter() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((k) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@o0 Canvas canvas) {
        int a5;
        int c5;
        int a6;
        int c6;
        int width;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        k kVar = (k) super.getAdapter();
        DateSelector<?> dateSelector = kVar.f53201c;
        b bVar = kVar.f53203e;
        Long item = kVar.getItem(kVar.b());
        Long item2 = kVar.getItem(kVar.i());
        for (s<Long, Long> sVar : dateSelector.g2()) {
            Long l4 = sVar.f26881a;
            if (l4 != null) {
                if (sVar.f26882b != null) {
                    Long l5 = l4;
                    long longValue = l5.longValue();
                    Long l6 = sVar.f26882b;
                    long longValue2 = l6.longValue();
                    if (!d(item, item2, l5, l6)) {
                        boolean j4 = v.j(this);
                        if (longValue < item.longValue()) {
                            a5 = kVar.b();
                            c5 = kVar.f(a5) ? 0 : !j4 ? materialCalendarGridView.getChildAt(a5 - 1).getRight() : materialCalendarGridView.getChildAt(a5 - 1).getLeft();
                        } else {
                            materialCalendarGridView.f53058b.setTimeInMillis(longValue);
                            a5 = kVar.a(materialCalendarGridView.f53058b.get(5));
                            c5 = c(materialCalendarGridView.getChildAt(a5));
                        }
                        if (longValue2 > item2.longValue()) {
                            a6 = Math.min(kVar.i(), getChildCount() - 1);
                            c6 = kVar.g(a6) ? getWidth() : !j4 ? materialCalendarGridView.getChildAt(a6).getRight() : materialCalendarGridView.getChildAt(a6).getLeft();
                        } else {
                            materialCalendarGridView.f53058b.setTimeInMillis(longValue2);
                            a6 = kVar.a(materialCalendarGridView.f53058b.get(5));
                            c6 = c(materialCalendarGridView.getChildAt(a6));
                        }
                        int itemId = (int) kVar.getItemId(a5);
                        int itemId2 = (int) kVar.getItemId(a6);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top2 = childAt.getTop() + bVar.f53091a.e();
                            int bottom = childAt.getBottom() - bVar.f53091a.b();
                            if (j4) {
                                int i5 = a6 > numColumns2 ? 0 : c6;
                                width = numColumns > a5 ? getWidth() : c5;
                                i4 = i5;
                            } else {
                                i4 = numColumns > a5 ? 0 : c5;
                                width = a6 > numColumns2 ? getWidth() : c6;
                            }
                            canvas.drawRect(i4, top2, width, bottom, bVar.f53098h);
                            itemId++;
                            materialCalendarGridView = this;
                            kVar = kVar;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z4, int i4, Rect rect) {
        if (z4) {
            a(i4, rect);
        } else {
            super.onFocusChanged(false, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((k) super.getAdapter()).b()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(((k) super.getAdapter()).b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i4, int i5) {
        if (!this.f53059c) {
            super.onMeasure(i4, i5);
            return;
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i4) {
        if (i4 < ((k) super.getAdapter()).b()) {
            super.setSelection(((k) super.getAdapter()).b());
        } else {
            super.setSelection(i4);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @o0
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public ListAdapter getAdapter2() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof k) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf194"), MaterialCalendarGridView.class.getCanonicalName(), k.class.getCanonicalName()));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53058b = q.v();
        if (g.K(getContext())) {
            setNextFocusLeftId(a.h.B0);
            setNextFocusRightId(a.h.P0);
        }
        this.f53059c = g.N(getContext(), a.c.Ra);
        x1.H1(this, new a());
    }
}
