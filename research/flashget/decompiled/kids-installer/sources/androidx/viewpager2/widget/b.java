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
    private final List<ViewPager2.j> f10486a;

    b(int i5) {
        this.f10486a = new ArrayList(i5);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i5) {
        try {
            Iterator<ViewPager2.j> it = this.f10486a.iterator();
            while (it.hasNext()) {
                it.next().a(i5);
            }
        } catch (ConcurrentModificationException e6) {
            f(e6);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i5, float f6, @u0 int i6) {
        try {
            Iterator<ViewPager2.j> it = this.f10486a.iterator();
            while (it.hasNext()) {
                it.next().b(i5, f6, i6);
            }
        } catch (ConcurrentModificationException e6) {
            f(e6);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i5) {
        try {
            Iterator<ViewPager2.j> it = this.f10486a.iterator();
            while (it.hasNext()) {
                it.next().c(i5);
            }
        } catch (ConcurrentModificationException e6) {
            f(e6);
        }
    }

    void d(ViewPager2.j jVar) {
        this.f10486a.add(jVar);
    }

    void e(ViewPager2.j jVar) {
        this.f10486a.remove(jVar);
    }
}
