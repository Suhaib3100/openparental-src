package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.core.view.r3;

/* compiled from: DecorToolbar.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface y {
    void A(Drawable drawable);

    void B(SparseArray<Parcelable> sparseArray);

    void C(int i5);

    Menu D();

    boolean E();

    int F();

    void G(int i5);

    r3 H(int i5, long j5);

    void I(int i5);

    void J(int i5);

    void K(n.a aVar, g.a aVar2);

    ViewGroup L();

    void M(boolean z5);

    void N(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void O(SparseArray<Parcelable> sparseArray);

    CharSequence P();

    int Q();

    int R();

    void S(int i5);

    void T(View view);

    void U();

    int V();

    void W();

    void X(Drawable drawable);

    void Y(boolean z5);

    void a(Menu menu, n.a aVar);

    void b(Drawable drawable);

    int c();

    void collapseActionView();

    int d();

    void e(CharSequence charSequence);

    boolean f();

    void g();

    CharSequence getTitle();

    void h(int i5);

    boolean i();

    boolean j();

    void k(Window.Callback callback);

    Context l();

    boolean m();

    boolean n();

    boolean o();

    boolean p();

    void q(int i5);

    void r();

    View s();

    void setIcon(int i5);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i5);

    void t(r0 r0Var);

    void u(Drawable drawable);

    boolean v();

    boolean w();

    void x(int i5);

    void y(CharSequence charSequence);

    void z(CharSequence charSequence);
}
