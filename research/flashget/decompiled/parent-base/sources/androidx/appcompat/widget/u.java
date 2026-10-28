package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.o;

/* compiled from: DecorContentParent.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface u {
    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f(Menu menu, o.a aVar);

    void g(CharSequence charSequence);

    CharSequence getTitle();

    boolean h();

    void i();

    void j(int i4);

    void k(Window.Callback callback);

    boolean l();

    boolean m();

    void n(SparseArray<Parcelable> sparseArray);

    void o(int i4);

    void p(int i4);

    void q();

    void r(SparseArray<Parcelable> sparseArray);

    void setIcon(int i4);

    void setIcon(Drawable drawable);
}
