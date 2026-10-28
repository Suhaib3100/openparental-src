package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.util.List;
import java.util.Queue;

/* compiled from: ListPreloader.java */
/* loaded from: classes.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f10797a;

    /* renamed from: b, reason: collision with root package name */
    private final d f10798b;

    /* renamed from: c, reason: collision with root package name */
    private final l f10799c;

    /* renamed from: d, reason: collision with root package name */
    private final a<T> f10800d;

    /* renamed from: e, reason: collision with root package name */
    private final b<T> f10801e;

    /* renamed from: f, reason: collision with root package name */
    private int f10802f;

    /* renamed from: g, reason: collision with root package name */
    private int f10803g;

    /* renamed from: i, reason: collision with root package name */
    private int f10805i;

    /* renamed from: h, reason: collision with root package name */
    private int f10804h = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10806j = true;

    /* compiled from: ListPreloader.java */
    public interface a<U> {
        @o0
        List<U> a(int i5);

        @q0
        k<?> b(@o0 U u5);
    }

    /* compiled from: ListPreloader.java */
    public interface b<T> {
        @q0
        int[] a(@o0 T t5, int i5, int i6);
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: classes3.dex */
    private static final class c implements p<Object> {

        /* renamed from: o, reason: collision with root package name */
        int f10807o;

        /* renamed from: p, reason: collision with root package name */
        int f10808p;

        /* renamed from: q, reason: collision with root package name */
        @q0
        private com.bumptech.glide.request.e f10809q;

        c() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void a(@o0 o oVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void b(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@q0 com.bumptech.glide.request.e eVar) {
            this.f10809q = eVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void k(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void n(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        @q0
        public com.bumptech.glide.request.e o() {
            return this.f10809q;
        }

        @Override // com.bumptech.glide.manager.m
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.m
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.m
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void p(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void q(@o0 o oVar) {
            oVar.e(this.f10808p, this.f10807o);
        }
    }

    /* compiled from: ListPreloader.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Queue<c> f10810a;

        d(int i5) {
            this.f10810a = n.f(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                this.f10810a.offer(new c());
            }
        }

        public c a(int i5, int i6) {
            c poll = this.f10810a.poll();
            this.f10810a.offer(poll);
            poll.f10808p = i5;
            poll.f10807o = i6;
            return poll;
        }
    }

    public f(@o0 l lVar, @o0 a<T> aVar, @o0 b<T> bVar, int i5) {
        this.f10799c = lVar;
        this.f10800d = aVar;
        this.f10801e = bVar;
        this.f10797a = i5;
        this.f10798b = new d(i5 + 1);
    }

    private void a() {
        for (int i5 = 0; i5 < this.f10798b.f10810a.size(); i5++) {
            this.f10799c.z(this.f10798b.a(0, 0));
        }
    }

    private void b(int i5, int i6) {
        int min;
        int i7;
        if (i5 < i6) {
            i7 = Math.max(this.f10802f, i5);
            min = i6;
        } else {
            min = Math.min(this.f10803g, i5);
            i7 = i6;
        }
        int min2 = Math.min(this.f10805i, min);
        int min3 = Math.min(this.f10805i, Math.max(0, i7));
        if (i5 < i6) {
            for (int i8 = min3; i8 < min2; i8++) {
                d(this.f10800d.a(i8), i8, true);
            }
        } else {
            for (int i9 = min2 - 1; i9 >= min3; i9--) {
                d(this.f10800d.a(i9), i9, false);
            }
        }
        this.f10803g = min3;
        this.f10802f = min2;
    }

    private void c(int i5, boolean z5) {
        if (this.f10806j != z5) {
            this.f10806j = z5;
            a();
        }
        b(i5, (z5 ? this.f10797a : -this.f10797a) + i5);
    }

    private void d(List<T> list, int i5, boolean z5) {
        int size = list.size();
        if (z5) {
            for (int i6 = 0; i6 < size; i6++) {
                e(list.get(i6), i5, i6);
            }
            return;
        }
        for (int i7 = size - 1; i7 >= 0; i7--) {
            e(list.get(i7), i5, i7);
        }
    }

    private void e(@q0 T t5, int i5, int i6) {
        int[] a6;
        k<?> b6;
        if (t5 == null || (a6 = this.f10801e.a(t5, i5, i6)) == null || (b6 = this.f10800d.b(t5)) == null) {
            return;
        }
        b6.C1(this.f10798b.a(a6[0], a6[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
        this.f10805i = i7;
        int i8 = this.f10804h;
        if (i5 > i8) {
            c(i6 + i5, true);
        } else if (i5 < i8) {
            c(i5, false);
        }
        this.f10804h = i5;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i5) {
    }
}
