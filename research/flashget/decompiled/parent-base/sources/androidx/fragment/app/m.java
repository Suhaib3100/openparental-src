package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.a3;
import androidx.view.o1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentController.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final o<?> f30019a;

    private m(o<?> oVar) {
        this.f30019a = oVar;
    }

    @androidx.annotation.o0
    public static m b(@androidx.annotation.o0 o<?> oVar) {
        return new m((o) androidx.core.util.w.m(oVar, "callbacks == null"));
    }

    @androidx.annotation.q0
    public Fragment A(@androidx.annotation.o0 String str) {
        return this.f30019a.f30026f.t0(str);
    }

    @androidx.annotation.o0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f30019a.f30026f.z0();
    }

    public int C() {
        return this.f30019a.f30026f.y0();
    }

    @androidx.annotation.o0
    public FragmentManager D() {
        return this.f30019a.f30026f;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public androidx.loader.app.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f30019a.f30026f.n1();
    }

    @androidx.annotation.q0
    public View G(@androidx.annotation.q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return this.f30019a.f30026f.K0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@androidx.annotation.q0 Parcelable parcelable, @androidx.annotation.q0 b0 b0Var) {
        this.f30019a.f30026f.I1(parcelable, b0Var);
    }

    @Deprecated
    public void J(@androidx.annotation.q0 Parcelable parcelable, @androidx.annotation.q0 List<Fragment> list) {
        this.f30019a.f30026f.I1(parcelable, new b0(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) a3<String, androidx.loader.app.a> a3Var) {
    }

    @Deprecated
    public void L(@androidx.annotation.q0 Parcelable parcelable) {
        o<?> oVar = this.f30019a;
        if (!(oVar instanceof o1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        oVar.f30026f.L1(parcelable);
    }

    @androidx.annotation.q0
    @Deprecated
    public a3<String, androidx.loader.app.a> M() {
        return null;
    }

    @androidx.annotation.q0
    @Deprecated
    public b0 N() {
        return this.f30019a.f30026f.N1();
    }

    @androidx.annotation.q0
    @Deprecated
    public List<Fragment> O() {
        b0 N1 = this.f30019a.f30026f.N1();
        if (N1 == null || N1.b() == null) {
            return null;
        }
        return new ArrayList(N1.b());
    }

    @androidx.annotation.q0
    @Deprecated
    public Parcelable P() {
        return this.f30019a.f30026f.P1();
    }

    public void a(@androidx.annotation.q0 Fragment fragment) {
        o<?> oVar = this.f30019a;
        oVar.f30026f.s(oVar, oVar, fragment);
    }

    public void c() {
        this.f30019a.f30026f.F();
    }

    @Deprecated
    public void d(@androidx.annotation.o0 Configuration configuration) {
        this.f30019a.f30026f.H(configuration, true);
    }

    public boolean e(@androidx.annotation.o0 MenuItem menuItem) {
        return this.f30019a.f30026f.I(menuItem);
    }

    public void f() {
        this.f30019a.f30026f.J();
    }

    @Deprecated
    public boolean g(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        return this.f30019a.f30026f.K(menu, menuInflater);
    }

    public void h() {
        this.f30019a.f30026f.L();
    }

    public void i() {
        this.f30019a.f30026f.M();
    }

    @Deprecated
    public void j() {
        this.f30019a.f30026f.N(true);
    }

    @Deprecated
    public void k(boolean z4) {
        this.f30019a.f30026f.O(z4, true);
    }

    @Deprecated
    public boolean l(@androidx.annotation.o0 MenuItem menuItem) {
        return this.f30019a.f30026f.R(menuItem);
    }

    @Deprecated
    public void m(@androidx.annotation.o0 Menu menu) {
        this.f30019a.f30026f.S(menu);
    }

    public void n() {
        this.f30019a.f30026f.U();
    }

    @Deprecated
    public void o(boolean z4) {
        this.f30019a.f30026f.V(z4, true);
    }

    @Deprecated
    public boolean p(@androidx.annotation.o0 Menu menu) {
        return this.f30019a.f30026f.W(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f30019a.f30026f.Y();
    }

    public void s() {
        this.f30019a.f30026f.Z();
    }

    public void t() {
        this.f30019a.f30026f.b0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z4) {
    }

    @Deprecated
    public void y(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
    }

    public boolean z() {
        return this.f30019a.f30026f.j0(true);
    }
}
