package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.o0;
import androidx.annotation.u0;
import androidx.core.util.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: MarginPageTransformer.java */
/* loaded from: classes3.dex */
public final class e implements ViewPager2.m {

    /* renamed from: a, reason: collision with root package name */
    private final int f10496a;

    public e(@u0 int i5) {
        q.j(i5, "Margin must be non-negative");
        this.f10496a = i5;
    }

    private ViewPager2 b(@o0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@o0 View view, float f6) {
        ViewPager2 b6 = b(view);
        float f7 = this.f10496a * f6;
        if (b6.l() != 0) {
            view.setTranslationY(f7);
            return;
        }
        if (b6.r()) {
            f7 = -f7;
        }
        view.setTranslationX(f7);
    }
}
