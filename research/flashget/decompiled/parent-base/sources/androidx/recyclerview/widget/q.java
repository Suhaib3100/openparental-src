package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.o0;
import androidx.core.view.x1;
import z2.a;

/* compiled from: ItemTouchUIUtilImpl.java */
/* loaded from: classes3.dex */
class q implements p {

    /* renamed from: a, reason: collision with root package name */
    static final p f33422a = new q();

    q() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (childAt != view) {
                float T = x1.T(childAt);
                if (T > f4) {
                    f4 = T;
                }
            }
        }
        return f4;
    }

    @Override // androidx.recyclerview.widget.p
    public void a(@o0 View view) {
        int i4 = a.c.f93799a;
        Object tag = view.getTag(i4);
        if (tag instanceof Float) {
            x1.V1(view, ((Float) tag).floatValue());
        }
        view.setTag(i4, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.p
    public void b(@o0 View view) {
    }

    @Override // androidx.recyclerview.widget.p
    public void c(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 View view, float f4, float f5, int i4, boolean z4) {
        if (z4) {
            int i5 = a.c.f93799a;
            if (view.getTag(i5) == null) {
                Float valueOf = Float.valueOf(x1.T(view));
                x1.V1(view, e(recyclerView, view) + 1.0f);
                view.setTag(i5, valueOf);
            }
        }
        view.setTranslationX(f4);
        view.setTranslationY(f5);
    }

    @Override // androidx.recyclerview.widget.p
    public void d(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 View view, float f4, float f5, int i4, boolean z4) {
    }
}
