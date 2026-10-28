package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.request.target.p;
import java.util.List;
import java.util.Queue;

/* compiled from: ListPreloader.java */
/* loaded from: classes3.dex */
public class g<T> implements AbsListView.OnScrollListener {

    /* renamed from: b, reason: collision with root package name */
    private final int f42896b;

    /* renamed from: c, reason: collision with root package name */
    private final d f42897c;

    /* renamed from: d, reason: collision with root package name */
    private final n f42898d;

    /* renamed from: e, reason: collision with root package name */
    private final a<T> f42899e;

    /* renamed from: f, reason: collision with root package name */
    private final b<T> f42900f;

    /* renamed from: g, reason: collision with root package name */
    private int f42901g;

    /* renamed from: h, reason: collision with root package name */
    private int f42902h;

    /* renamed from: j, reason: collision with root package name */
    private int f42904j;

    /* renamed from: i, reason: collision with root package name */
    private int f42903i = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42905k = true;

    /* compiled from: ListPreloader.java */
    public interface a<U> {
        @o0
        List<U> a(int i4);

        @q0
        m<?> b(@o0 U u4);
    }

    /* compiled from: ListPreloader.java */
    public interface b<T> {
        @q0
        int[] a(@o0 T t4, int i4, int i5);
    }

    /* compiled from: ListPreloader.java */
    private static final class c implements p<Object> {

        /* renamed from: b, reason: collision with root package name */
        int f42906b;

        /* renamed from: c, reason: collision with root package name */
        int f42907c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private com.bumptech.glide.request.e f42908d;

        c() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void a(@o0 com.bumptech.glide.request.target.o oVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void g(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        @q0
        public com.bumptech.glide.request.e h() {
            return this.f42908d;
        }

        @Override // com.bumptech.glide.request.target.p
        public void i(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void j(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void l(@q0 com.bumptech.glide.request.e eVar) {
            this.f42908d = eVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void p(@o0 com.bumptech.glide.request.target.o oVar) {
            oVar.d(this.f42907c, this.f42906b);
        }
    }

    /* compiled from: ListPreloader.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Queue<c> f42909a;

        d(int i4) {
            this.f42909a = com.bumptech.glide.util.o.g(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f42909a.offer(new c());
            }
        }

        public c a(int i4, int i5) {
            c poll = this.f42909a.poll();
            this.f42909a.offer(poll);
            poll.f42907c = i4;
            poll.f42906b = i5;
            return poll;
        }
    }

    public g(@o0 n nVar, @o0 a<T> aVar, @o0 b<T> bVar, int i4) {
        this.f42898d = nVar;
        this.f42899e = aVar;
        this.f42900f = bVar;
        this.f42896b = i4;
        this.f42897c = new d(i4 + 1);
    }

    private void a() {
        for (int i4 = 0; i4 < this.f42897c.f42909a.size(); i4++) {
            this.f42898d.y(this.f42897c.a(0, 0));
        }
    }

    private void b(int i4, int i5) {
        int min;
        int i6;
        if (i4 < i5) {
            i6 = Math.max(this.f42901g, i4);
            min = i5;
        } else {
            min = Math.min(this.f42902h, i4);
            i6 = i5;
        }
        int min2 = Math.min(this.f42904j, min);
        int min3 = Math.min(this.f42904j, Math.max(0, i6));
        if (i4 < i5) {
            for (int i7 = min3; i7 < min2; i7++) {
                d(this.f42899e.a(i7), i7, true);
            }
        } else {
            for (int i10 = min2 - 1; i10 >= min3; i10--) {
                d(this.f42899e.a(i10), i10, false);
            }
        }
        this.f42902h = min3;
        this.f42901g = min2;
    }

    private void c(int i4, boolean z4) {
        if (this.f42905k != z4) {
            this.f42905k = z4;
            a();
        }
        b(i4, (z4 ? this.f42896b : -this.f42896b) + i4);
    }

    private void d(List<T> list, int i4, boolean z4) {
        int size = list.size();
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                e(list.get(i5), i4, i5);
            }
            return;
        }
        for (int i6 = size - 1; i6 >= 0; i6--) {
            e(list.get(i6), i4, i6);
        }
    }

    private void e(@q0 T t4, int i4, int i5) {
        int[] a5;
        m<?> b5;
        if (t4 == null || (a5 = this.f42900f.a(t4, i4, i5)) == null || (b5 = this.f42899e.b(t4)) == null) {
            return;
        }
        b5.z1(this.f42897c.a(a5[0], a5[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (this.f42904j == 0 && i6 == 0) {
            return;
        }
        this.f42904j = i6;
        int i7 = this.f42903i;
        if (i4 > i7) {
            c(i5 + i4, true);
        } else if (i4 < i7) {
            c(i4, false);
        }
        this.f42903i = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }
}
