package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: FragmentStore.java */
/* loaded from: classes3.dex */
class j0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f29972e = "FragmentManager";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f29973a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, h0> f29974b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, FragmentState> f29975c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private c0 f29976d;

    j0() {
    }

    @androidx.annotation.q0
    ArrayList<String> A() {
        synchronized (this.f29973a) {
            try {
                if (this.f29973a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f29973a.size());
                Iterator<Fragment> it = this.f29973a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.W0(2)) {
                        next.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void B(@androidx.annotation.o0 c0 c0Var) {
        this.f29976d = c0Var;
    }

    @androidx.annotation.q0
    FragmentState C(@androidx.annotation.o0 String str, @androidx.annotation.q0 FragmentState fragmentState) {
        return fragmentState != null ? this.f29975c.put(str, fragmentState) : this.f29975c.remove(str);
    }

    void a(@androidx.annotation.o0 Fragment fragment) {
        if (this.f29973a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f29973a) {
            this.f29973a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f29974b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@androidx.annotation.o0 String str) {
        return this.f29974b.get(str) != null;
    }

    void d(int i4) {
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                h0Var.u(i4);
            }
        }
    }

    void e(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
        String a5 = androidx.compose.runtime.changelist.j.a(str, "    ");
        if (!this.f29974b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : this.f29974b.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    Fragment k4 = h0Var.k();
                    printWriter.println(k4);
                    k4.dump(a5, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f29973a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = this.f29973a.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @androidx.annotation.q0
    Fragment f(@androidx.annotation.o0 String str) {
        h0 h0Var = this.f29974b.get(str);
        if (h0Var != null) {
            return h0Var.k();
        }
        return null;
    }

    @androidx.annotation.q0
    Fragment g(@androidx.annotation.d0 int i4) {
        for (int size = this.f29973a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f29973a.get(size);
            if (fragment != null && fragment.mFragmentId == i4) {
                return fragment;
            }
        }
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                Fragment k4 = h0Var.k();
                if (k4.mFragmentId == i4) {
                    return k4;
                }
            }
        }
        return null;
    }

    @androidx.annotation.q0
    Fragment h(@androidx.annotation.q0 String str) {
        if (str != null) {
            for (int size = this.f29973a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f29973a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                Fragment k4 = h0Var.k();
                if (str.equals(k4.mTag)) {
                    return k4;
                }
            }
        }
        return null;
    }

    @androidx.annotation.q0
    Fragment i(@androidx.annotation.o0 String str) {
        Fragment findFragmentByWho;
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null && (findFragmentByWho = h0Var.k().findFragmentByWho(str)) != null) {
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
        int indexOf = this.f29973a.indexOf(fragment);
        for (int i4 = indexOf - 1; i4 >= 0; i4--) {
            Fragment fragment2 = this.f29973a.get(i4);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f29973a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f29973a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f29974b.size();
    }

    @androidx.annotation.o0
    List<h0> l() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    ArrayList<FragmentState> n() {
        return new ArrayList<>(this.f29975c.values());
    }

    @androidx.annotation.q0
    h0 o(@androidx.annotation.o0 String str) {
        return this.f29974b.get(str);
    }

    @androidx.annotation.o0
    List<Fragment> p() {
        ArrayList arrayList;
        if (this.f29973a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f29973a) {
            arrayList = new ArrayList(this.f29973a);
        }
        return arrayList;
    }

    c0 q() {
        return this.f29976d;
    }

    @androidx.annotation.q0
    FragmentState r(@androidx.annotation.o0 String str) {
        return this.f29975c.get(str);
    }

    void s(@androidx.annotation.o0 h0 h0Var) {
        Fragment k4 = h0Var.k();
        if (c(k4.mWho)) {
            return;
        }
        this.f29974b.put(k4.mWho, h0Var);
        if (k4.mRetainInstanceChangedWhileDetached) {
            if (k4.mRetainInstance) {
                this.f29976d.b(k4);
            } else {
                this.f29976d.m(k4);
            }
            k4.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.W0(2)) {
            k4.toString();
        }
    }

    void t(@androidx.annotation.o0 h0 h0Var) {
        Fragment k4 = h0Var.k();
        if (k4.mRetainInstance) {
            this.f29976d.m(k4);
        }
        if (this.f29974b.put(k4.mWho, null) != null && FragmentManager.W0(2)) {
            k4.toString();
        }
    }

    void u() {
        Iterator<Fragment> it = this.f29973a.iterator();
        while (it.hasNext()) {
            h0 h0Var = this.f29974b.get(it.next().mWho);
            if (h0Var != null) {
                h0Var.m();
            }
        }
        for (h0 h0Var2 : this.f29974b.values()) {
            if (h0Var2 != null) {
                h0Var2.m();
                Fragment k4 = h0Var2.k();
                if (k4.mRemoving && !k4.isInBackStack()) {
                    if (k4.mBeingSaved && !this.f29975c.containsKey(k4.mWho)) {
                        h0Var2.s();
                    }
                    t(h0Var2);
                }
            }
        }
    }

    void v(@androidx.annotation.o0 Fragment fragment) {
        synchronized (this.f29973a) {
            this.f29973a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void w() {
        this.f29974b.clear();
    }

    void x(@androidx.annotation.q0 List<String> list) {
        this.f29973a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f4 = f(str);
                if (f4 == null) {
                    throw new IllegalStateException(android.support.v4.media.d.a("No instantiated fragment for (", str, ")"));
                }
                if (FragmentManager.W0(2)) {
                    f4.toString();
                }
                a(f4);
            }
        }
    }

    void y(@androidx.annotation.o0 ArrayList<FragmentState> arrayList) {
        this.f29975c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f29975c.put(next.f29844c, next);
        }
    }

    @androidx.annotation.o0
    ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f29974b.size());
        for (h0 h0Var : this.f29974b.values()) {
            if (h0Var != null) {
                Fragment k4 = h0Var.k();
                h0Var.s();
                arrayList.add(k4.mWho);
                if (FragmentManager.W0(2)) {
                    k4.toString();
                    Objects.toString(k4.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
