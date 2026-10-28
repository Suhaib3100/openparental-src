package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: MenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface n {

    /* compiled from: MenuPresenter.java */
    public interface a {
        void b(@o0 g gVar, boolean z5);

        boolean c(@o0 g gVar);
    }

    void b(g gVar, boolean z5);

    void d(boolean z5);

    boolean e();

    boolean f(g gVar, j jVar);

    boolean g(g gVar, j jVar);

    int getId();

    void h(a aVar);

    void i(Context context, g gVar);

    void j(Parcelable parcelable);

    boolean l(t tVar);

    o m(ViewGroup viewGroup);

    Parcelable n();
}
