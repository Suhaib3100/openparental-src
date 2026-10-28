package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.y1;
import q0.a;

/* compiled from: ItemTouchUIUtilImpl.java */
/* loaded from: classes3.dex */
class q implements p {

    /* renamed from: a, reason: collision with root package name */
    static final p f9539a = new q();

    q() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f6 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            if (childAt != view) {
                float R = y1.R(childAt);
                if (R > f6) {
                    f6 = R;
                }
            }
        }
        return f6;
    }

    @Override // androidx.recyclerview.widget.p
    public void a(View view) {
        int i5 = a.e.V;
        Object tag = view.getTag(i5);
        if (tag instanceof Float) {
            y1.N1(view, ((Float) tag).floatValue());
        }
        view.setTag(i5, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.p
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.p
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i5, boolean z5) {
    }

    @Override // androidx.recyclerview.widget.p
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i5, boolean z5) {
        if (z5) {
            int i6 = a.e.V;
            if (view.getTag(i6) == null) {
                Float valueOf = Float.valueOf(y1.R(view));
                y1.N1(view, e(recyclerView, view) + 1.0f);
                view.setTag(i6, valueOf);
            }
        }
        view.setTranslationX(f6);
        view.setTranslationY(f7);
    }
}
