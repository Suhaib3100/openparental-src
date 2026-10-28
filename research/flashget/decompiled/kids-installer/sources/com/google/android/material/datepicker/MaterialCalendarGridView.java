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
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.v;
import java.util.Calendar;
import n1.a;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: o, reason: collision with root package name */
    private final Calendar f13305o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f13306p;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.Y0(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i5, Rect rect) {
        if (i5 == 33) {
            setSelection(getAdapter().i());
        } else if (i5 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i5, rect);
        }
    }

    private static int c(@o0 View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean d(@q0 Long l5, @q0 Long l6, @q0 Long l7, @q0 Long l8) {
        return l5 == null || l6 == null || l7 == null || l8 == null || l7.longValue() > l6.longValue() || l8.longValue() < l5.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k getAdapter2() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@o0 Canvas canvas) {
        int a6;
        int c6;
        int a7;
        int c7;
        int width;
        int i5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        k adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f13425p;
        b bVar = adapter.f13427r;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.i());
        for (androidx.core.util.m<Long, Long> mVar : dateSelector.z()) {
            Long l5 = mVar.f5251a;
            if (l5 != null) {
                if (mVar.f5252b != null) {
                    long longValue = l5.longValue();
                    long longValue2 = mVar.f5252b.longValue();
                    if (!d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean j5 = v.j(this);
                        if (longValue < item.longValue()) {
                            a6 = adapter.b();
                            c6 = adapter.f(a6) ? 0 : !j5 ? materialCalendarGridView.getChildAt(a6 - 1).getRight() : materialCalendarGridView.getChildAt(a6 - 1).getLeft();
                        } else {
                            materialCalendarGridView.f13305o.setTimeInMillis(longValue);
                            a6 = adapter.a(materialCalendarGridView.f13305o.get(5));
                            c6 = c(materialCalendarGridView.getChildAt(a6));
                        }
                        if (longValue2 > item2.longValue()) {
                            a7 = Math.min(adapter.i(), getChildCount() - 1);
                            c7 = adapter.g(a7) ? getWidth() : !j5 ? materialCalendarGridView.getChildAt(a7).getRight() : materialCalendarGridView.getChildAt(a7).getLeft();
                        } else {
                            materialCalendarGridView.f13305o.setTimeInMillis(longValue2);
                            a7 = adapter.a(materialCalendarGridView.f13305o.get(5));
                            c7 = c(materialCalendarGridView.getChildAt(a7));
                        }
                        int itemId = (int) adapter.getItemId(a6);
                        int itemId2 = (int) adapter.getItemId(a7);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + bVar.f13338a.e();
                            int bottom = childAt.getBottom() - bVar.f13338a.b();
                            if (j5) {
                                int i6 = a7 > numColumns2 ? 0 : c7;
                                width = numColumns > a6 ? getWidth() : c6;
                                i5 = i6;
                            } else {
                                i5 = numColumns > a6 ? 0 : c6;
                                width = a7 > numColumns2 ? getWidth() : c7;
                            }
                            canvas.drawRect(i5, top, width, bottom, bVar.f13345h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z5, int i5, Rect rect) {
        if (z5) {
            a(i5, rect);
        } else {
            super.onFocusChanged(false, i5, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (!super.onKeyDown(i5, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i5) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i5, int i6) {
        if (!this.f13306p) {
            super.onMeasure(i5, i6);
            return;
        }
        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(y1.f5757s, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i5) {
        if (i5 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i5);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof k)) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ሖ"), MaterialCalendarGridView.class.getCanonicalName(), k.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13305o = q.v();
        if (g.z(getContext())) {
            setNextFocusLeftId(a.h.B0);
            setNextFocusRightId(a.h.P0);
        }
        this.f13306p = g.A(getContext());
        y1.B1(this, new a());
    }
}
