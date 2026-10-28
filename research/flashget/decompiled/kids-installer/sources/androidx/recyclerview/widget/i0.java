package androidx.recyclerview.widget;

import androidx.recyclerview.widget.j0;

/* compiled from: ThreadUtil.java */
/* loaded from: classes.dex */
interface i0<T> {

    /* compiled from: ThreadUtil.java */
    public interface a<T> {
        void a(int i5, int i6, int i7, int i8, int i9);

        void b(j0.a<T> aVar);

        void c(int i5, int i6);

        void d(int i5);
    }

    /* compiled from: ThreadUtil.java */
    public interface b<T> {
        void a(int i5, j0.a<T> aVar);

        void b(int i5, int i6);

        void c(int i5, int i6);
    }

    a<T> a(a<T> aVar);

    b<T> b(b<T> bVar);
}
