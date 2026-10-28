package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.o0;
import androidx.annotation.u0;
import androidx.core.util.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: MarginPageTransformer.java */
/* loaded from: classes3.dex */
public final class e implements ViewPager2.m {

    /* renamed from: a, reason: collision with root package name */
    private final int f35659a;

    public e(@u0 int i4) {
        w.j(i4, "Margin must be non-negative");
        this.f35659a = i4;
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
    public void a(@o0 View view, float f4) {
        ViewPager2 b5 = b(view);
        float f5 = this.f35659a * f4;
        if (b5.l() != 0) {
            view.setTranslationY(f5);
            return;
        }
        if (b5.r()) {
            f5 = -f5;
        }
        view.setTranslationX(f5);
    }
}
