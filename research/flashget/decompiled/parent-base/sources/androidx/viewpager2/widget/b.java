package androidx.viewpager2.widget;

import androidx.annotation.o0;
import androidx.annotation.u0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes3.dex */
final class b extends ViewPager2.j {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final List<ViewPager2.j> f35649a;

    b(int i4) {
        this.f35649a = new ArrayList(i4);
    }

    private void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void a(ViewPager2.j jVar) {
        this.f35649a.add(jVar);
    }

    void b(ViewPager2.j jVar) {
        this.f35649a.remove(jVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrollStateChanged(int i4) {
        try {
            Iterator<ViewPager2.j> it = this.f35649a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i4);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrolled(int i4, float f4, @u0 int i5) {
        try {
            Iterator<ViewPager2.j> it = this.f35649a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i4, f4, i5);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i4) {
        try {
            Iterator<ViewPager2.j> it = this.f35649a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i4);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }
}
