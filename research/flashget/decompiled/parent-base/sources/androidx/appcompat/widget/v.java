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
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.core.view.i2;

/* compiled from: DecorToolbar.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface v {
    void A(int i4);

    void B();

    int C();

    void D(boolean z4);

    void E(int i4);

    void F();

    View G();

    void H(l0 l0Var);

    void I(Drawable drawable);

    void J(Drawable drawable);

    void K(SparseArray<Parcelable> sparseArray);

    boolean L();

    void M(int i4);

    void N(int i4);

    void O(o.a aVar, h.a aVar2);

    void P(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void Q(SparseArray<Parcelable> sparseArray);

    CharSequence R();

    int S();

    void T(View view);

    void U();

    void V(Drawable drawable);

    void a(Drawable drawable);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f(Menu menu, o.a aVar);

    void g(CharSequence charSequence);

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    void i();

    void j(int i4);

    void k(Window.Callback callback);

    boolean l();

    boolean m();

    boolean n();

    boolean o();

    void p(int i4);

    void q(CharSequence charSequence);

    void r(CharSequence charSequence);

    void s(int i4);

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i4);

    Menu t();

    int u();

    i2 v(int i4, long j4);

    void w(int i4);

    ViewGroup x();

    void y(boolean z4);

    int z();
}
