package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
class d0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f8222e = "FragmentManager";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f8223a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, b0> f8224b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, FragmentState> f8225c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private w f8226d;

    d0() {
    }

    @q0
    ArrayList<String> A() {
        synchronized (this.f8223a) {
            if (this.f8223a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f8223a.size());
            Iterator<Fragment> it = this.f8223a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.W0(2)) {
                    next.toString();
                }
            }
            return arrayList;
        }
    }

    void B(@androidx.annotation.o0 w wVar) {
        this.f8226d = wVar;
    }

    @q0
    FragmentState C(@androidx.annotation.o0 String str, @q0 FragmentState fragmentState) {
        return fragmentState != null ? this.f8225c.put(str, fragmentState) : this.f8225c.remove(str);
    }

    void a(@androidx.annotation.o0 Fragment fragment) {
        if (this.f8223a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f8223a) {
            this.f8223a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f8224b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@androidx.annotation.o0 String str) {
        return this.f8224b.get(str) != null;
    }

    void d(int i5) {
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                b0Var.u(i5);
            }
        }
    }

    void e(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
        String a6 = androidx.concurrent.futures.b.a(str, "    ");
        if (!this.f8224b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : this.f8224b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    Fragment k5 = b0Var.k();
                    printWriter.println(k5);
                    k5.dump(a6, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f8223a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size; i5++) {
                Fragment fragment = this.f8223a.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @q0
    Fragment f(@androidx.annotation.o0 String str) {
        b0 b0Var = this.f8224b.get(str);
        if (b0Var != null) {
            return b0Var.k();
        }
        return null;
    }

    @q0
    Fragment g(@androidx.annotation.d0 int i5) {
        for (int size = this.f8223a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f8223a.get(size);
            if (fragment != null && fragment.mFragmentId == i5) {
                return fragment;
            }
        }
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                Fragment k5 = b0Var.k();
                if (k5.mFragmentId == i5) {
                    return k5;
                }
            }
        }
        return null;
    }

    @q0
    Fragment h(@q0 String str) {
        if (str != null) {
            for (int size = this.f8223a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f8223a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                Fragment k5 = b0Var.k();
                if (str.equals(k5.mTag)) {
                    return k5;
                }
            }
        }
        return null;
    }

    @q0
    Fragment i(@androidx.annotation.o0 String str) {
        Fragment findFragmentByWho;
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null && (findFragmentByWho = b0Var.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    int j(@androidx.annotation.o0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f8223a.indexOf(fragment);
        for (int i5 = indexOf - 1; i5 >= 0; i5--) {
            Fragment fragment2 = this.f8223a.get(i5);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f8223a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f8223a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f8224b.size();
    }

    @androidx.annotation.o0
    List<b0> l() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    ArrayList<FragmentState> n() {
        return new ArrayList<>(this.f8225c.values());
    }

    @q0
    b0 o(@androidx.annotation.o0 String str) {
        return this.f8224b.get(str);
    }

    @androidx.annotation.o0
    List<Fragment> p() {
        ArrayList arrayList;
        if (this.f8223a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f8223a) {
            arrayList = new ArrayList(this.f8223a);
        }
        return arrayList;
    }

    w q() {
        return this.f8226d;
    }

    @q0
    FragmentState r(@androidx.annotation.o0 String str) {
        return this.f8225c.get(str);
    }

    void s(@androidx.annotation.o0 b0 b0Var) {
        Fragment k5 = b0Var.k();
        if (c(k5.mWho)) {
            return;
        }
        this.f8224b.put(k5.mWho, b0Var);
        if (k5.mRetainInstanceChangedWhileDetached) {
            if (k5.mRetainInstance) {
                this.f8226d.g(k5);
            } else {
                this.f8226d.r(k5);
            }
            k5.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.W0(2)) {
            k5.toString();
        }
    }

    void t(@androidx.annotation.o0 b0 b0Var) {
        Fragment k5 = b0Var.k();
        if (k5.mRetainInstance) {
            this.f8226d.r(k5);
        }
        if (this.f8224b.put(k5.mWho, null) != null && FragmentManager.W0(2)) {
            k5.toString();
        }
    }

    void u() {
        Iterator<Fragment> it = this.f8223a.iterator();
        while (it.hasNext()) {
            b0 b0Var = this.f8224b.get(it.next().mWho);
            if (b0Var != null) {
                b0Var.m();
            }
        }
        for (b0 b0Var2 : this.f8224b.values()) {
            if (b0Var2 != null) {
                b0Var2.m();
                Fragment k5 = b0Var2.k();
                if (k5.mRemoving && !k5.isInBackStack()) {
                    if (k5.mBeingSaved && !this.f8225c.containsKey(k5.mWho)) {
                        b0Var2.s();
                    }
                    t(b0Var2);
                }
            }
        }
    }

    void v(@androidx.annotation.o0 Fragment fragment) {
        synchronized (this.f8223a) {
            this.f8223a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void w() {
        this.f8224b.clear();
    }

    void x(@q0 List<String> list) {
        this.f8223a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f6 = f(str);
                if (f6 == null) {
                    throw new IllegalStateException(androidx.constraintlayout.solver.widgets.analyzer.e.a("No instantiated fragment for (", str, ")"));
                }
                if (FragmentManager.W0(2)) {
                    f6.toString();
                }
                a(f6);
            }
        }
    }

    void y(@androidx.annotation.o0 ArrayList<FragmentState> arrayList) {
        this.f8225c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f8225c.put(next.f8120p, next);
        }
    }

    @androidx.annotation.o0
    ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f8224b.size());
        for (b0 b0Var : this.f8224b.values()) {
            if (b0Var != null) {
                Fragment k5 = b0Var.k();
                b0Var.s();
                arrayList.add(k5.mWho);
                if (FragmentManager.W0(2)) {
                    k5.toString();
                    Objects.toString(k5.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
