package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.n;

/* compiled from: DecorContentParent.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface x {
    void a(Menu menu, n.a aVar);

    void e(CharSequence charSequence);

    boolean f();

    void g();

    CharSequence getTitle();

    void h(int i5);

    boolean i();

    boolean j();

    void k(Window.Callback callback);

    boolean m();

    boolean n();

    boolean o();

    boolean p();

    void q(int i5);

    void r(SparseArray<Parcelable> sparseArray);

    void s(int i5);

    void setIcon(int i5);

    void setIcon(Drawable drawable);

    void t();

    void u(SparseArray<Parcelable> sparseArray);
}
