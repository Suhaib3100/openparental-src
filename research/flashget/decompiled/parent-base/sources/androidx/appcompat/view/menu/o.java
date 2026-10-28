package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: MenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o {

    /* compiled from: MenuPresenter.java */
    public interface a {
        void d(@o0 h hVar, boolean z4);

        boolean e(@o0 h hVar);
    }

    int a();

    void d(h hVar, boolean z4);

    boolean e(h hVar, k kVar);

    void f(a aVar);

    void g(Parcelable parcelable);

    boolean h(t tVar);

    p i(ViewGroup viewGroup);

    Parcelable j();

    void k(boolean z4);

    boolean l();

    boolean m(h hVar, k kVar);

    void n(Context context, h hVar);
}
