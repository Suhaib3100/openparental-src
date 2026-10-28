package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.c1;

/* compiled from: AbsListViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @androidx.databinding.g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
/* loaded from: classes.dex */
public class a {

    /* compiled from: AbsListViewBindingAdapter.java */
    /* renamed from: androidx.databinding.adapters.a$a, reason: collision with other inner class name */
    class C0066a implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f6033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6034b;

        C0066a(c cVar, b bVar) {
            this.f6033a = cVar;
            this.f6034b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
            b bVar = this.f6034b;
            if (bVar != null) {
                bVar.onScroll(absListView, i5, i6, i7);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i5) {
            c cVar = this.f6033a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i5);
            }
        }
    }

    /* compiled from: AbsListViewBindingAdapter.java */
    public interface b {
        void onScroll(AbsListView absListView, int i5, int i6, int i7);
    }

    /* compiled from: AbsListViewBindingAdapter.java */
    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i5);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C0066a(cVar, bVar));
    }
}
