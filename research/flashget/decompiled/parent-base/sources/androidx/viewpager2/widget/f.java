package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes3.dex */
final class f extends ViewPager2.j {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f35660a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager2.m f35661b;

    f(LinearLayoutManager linearLayoutManager) {
        this.f35660a = linearLayoutManager;
    }

    ViewPager2.m a() {
        return this.f35661b;
    }

    void b(@q0 ViewPager2.m mVar) {
        this.f35661b = mVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrolled(int i4, float f4, int i5) {
        if (this.f35661b == null) {
            return;
        }
        float f5 = -f4;
        for (int i6 = 0; i6 < this.f35660a.getChildCount(); i6++) {
            View childAt = this.f35660a.getChildAt(i6);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i6), Integer.valueOf(this.f35660a.getChildCount())));
            }
            this.f35661b.a(childAt, (this.f35660a.getPosition(childAt) - i4) + f5);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i4) {
    }
}
