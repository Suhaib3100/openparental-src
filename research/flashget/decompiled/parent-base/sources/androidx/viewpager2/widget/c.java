package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.o0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositePageTransformer.java */
/* loaded from: classes3.dex */
public final class c implements ViewPager2.m {

    /* renamed from: a, reason: collision with root package name */
    private final List<ViewPager2.m> f35650a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@o0 View view, float f4) {
        Iterator<ViewPager2.m> it = this.f35650a.iterator();
        while (it.hasNext()) {
            it.next().a(view, f4);
        }
    }

    public void b(@o0 ViewPager2.m mVar) {
        this.f35650a.add(mVar);
    }

    public void c(@o0 ViewPager2.m mVar) {
        this.f35650a.remove(mVar);
    }
}
