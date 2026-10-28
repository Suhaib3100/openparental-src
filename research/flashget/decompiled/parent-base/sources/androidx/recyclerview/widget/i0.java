package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.j0;

/* compiled from: ThreadUtil.java */
/* loaded from: classes3.dex */
interface i0<T> {

    /* compiled from: ThreadUtil.java */
    public interface a<T> {
        void a(int i4, int i5, int i6, int i7, int i10);

        void b(int i4, int i5);

        void c(int i4);

        @SuppressLint({"UnknownNullness"})
        void d(j0.a<T> aVar);
    }

    /* compiled from: ThreadUtil.java */
    public interface b<T> {
        void a(int i4, int i5);

        @SuppressLint({"UnknownNullness"})
        void b(int i4, j0.a<T> aVar);

        void c(int i4, int i5);
    }

    a<T> a(a<T> aVar);

    b<T> b(b<T> bVar);
}
