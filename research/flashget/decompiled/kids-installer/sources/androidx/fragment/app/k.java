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
import android.view.i1;
import androidx.annotation.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final m<?> f8302a;

    private k(m<?> mVar) {
        this.f8302a = mVar;
    }

    @androidx.annotation.o0
    public static k b(@androidx.annotation.o0 m<?> mVar) {
        return new k((m) androidx.core.util.q.m(mVar, "callbacks == null"));
    }

    @q0
    public Fragment A(@androidx.annotation.o0 String str) {
        return this.f8302a.f8324s.t0(str);
    }

    @androidx.annotation.o0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f8302a.f8324s.z0();
    }

    public int C() {
        return this.f8302a.f8324s.y0();
    }

    @androidx.annotation.o0
    public FragmentManager D() {
        return this.f8302a.f8324s;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public androidx.loader.app.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f8302a.f8324s.m1();
    }

    @q0
    public View G(@q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return this.f8302a.f8324s.K0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@q0 Parcelable parcelable, @q0 v vVar) {
        this.f8302a.f8324s.H1(parcelable, vVar);
    }

    @Deprecated
    public void J(@q0 Parcelable parcelable, @q0 List<Fragment> list) {
        this.f8302a.f8324s.H1(parcelable, new v(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) androidx.collection.i<String, androidx.loader.app.a> iVar) {
    }

    @Deprecated
    public void L(@q0 Parcelable parcelable) {
        m<?> mVar = this.f8302a;
        if (!(mVar instanceof i1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        mVar.f8324s.K1(parcelable);
    }

    @q0
    @Deprecated
    public androidx.collection.i<String, androidx.loader.app.a> M() {
        return null;
    }

    @q0
    @Deprecated
    public v N() {
        return this.f8302a.f8324s.M1();
    }

    @q0
    @Deprecated
    public List<Fragment> O() {
        v M1 = this.f8302a.f8324s.M1();
        if (M1 == null || M1.b() == null) {
            return null;
        }
        return new ArrayList(M1.b());
    }

    @q0
    @Deprecated
    public Parcelable P() {
        return this.f8302a.f8324s.O1();
    }

    public void a(@q0 Fragment fragment) {
        m<?> mVar = this.f8302a;
        mVar.f8324s.s(mVar, mVar, fragment);
    }

    public void c() {
        this.f8302a.f8324s.F();
    }

    @Deprecated
    public void d(@androidx.annotation.o0 Configuration configuration) {
        this.f8302a.f8324s.e1(configuration);
    }

    public boolean e(@androidx.annotation.o0 MenuItem menuItem) {
        return this.f8302a.f8324s.I(menuItem);
    }

    public void f() {
        this.f8302a.f8324s.J();
    }

    @Deprecated
    public boolean g(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        return this.f8302a.f8324s.K(menu, menuInflater);
    }

    public void h() {
        this.f8302a.f8324s.L();
    }

    public void i() {
        this.f8302a.f8324s.M();
    }

    @Deprecated
    public void j() {
        this.f8302a.f8324s.N();
    }

    @Deprecated
    public void k(boolean z5) {
        this.f8302a.f8324s.O(z5);
    }

    @Deprecated
    public boolean l(@androidx.annotation.o0 MenuItem menuItem) {
        return this.f8302a.f8324s.R(menuItem);
    }

    @Deprecated
    public void m(@androidx.annotation.o0 Menu menu) {
        this.f8302a.f8324s.S(menu);
    }

    public void n() {
        this.f8302a.f8324s.U();
    }

    @Deprecated
    public void o(boolean z5) {
        this.f8302a.f8324s.V(z5);
    }

    @Deprecated
    public boolean p(@androidx.annotation.o0 Menu menu) {
        return this.f8302a.f8324s.W(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f8302a.f8324s.Y();
    }

    public void s() {
        this.f8302a.f8324s.Z();
    }

    public void t() {
        this.f8302a.f8324s.b0();
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
    public void x(boolean z5) {
    }

    @Deprecated
    public void y(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
    }

    public boolean z() {
        return this.f8302a.f8324s.j0(true);
    }
}
