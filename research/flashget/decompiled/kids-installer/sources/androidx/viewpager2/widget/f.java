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
    private final LinearLayoutManager f10497a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager2.m f10498b;

    f(LinearLayoutManager linearLayoutManager) {
        this.f10497a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i5) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i5, float f6, int i6) {
        if (this.f10498b == null) {
            return;
        }
        float f7 = -f6;
        for (int i7 = 0; i7 < this.f10497a.Q(); i7++) {
            View P = this.f10497a.P(i7);
            if (P == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i7), Integer.valueOf(this.f10497a.Q())));
            }
            this.f10498b.a(P, (this.f10497a.s0(P) - i5) + f7);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i5) {
    }

    ViewPager2.m d() {
        return this.f10498b;
    }

    void e(@q0 ViewPager2.m mVar) {
        this.f10498b = mVar;
    }
}
