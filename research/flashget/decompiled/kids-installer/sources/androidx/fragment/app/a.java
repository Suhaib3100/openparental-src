package androidx.fragment.app;

import android.view.t;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f0;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: BackStackRecord.java */
/* loaded from: classes3.dex */
final class a extends f0 implements FragmentManager.j, FragmentManager.p {
    private static final String R = "FragmentManager";
    final FragmentManager N;
    boolean O;
    int P;
    boolean Q;

    a(@androidx.annotation.o0 FragmentManager fragmentManager) {
        super(fragmentManager.G0(), fragmentManager.J0() != null ? fragmentManager.J0().j().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 K(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 t.c cVar) {
        if (fragment.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        }
        if (cVar == t.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != t.c.DESTROYED) {
            return super.K(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 L(@q0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.N) {
            return super.L(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 P(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.P(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void Q(int i5) {
        if (this.f8244i) {
            if (FragmentManager.W0(2)) {
                toString();
            }
            int size = this.f8238c.size();
            for (int i6 = 0; i6 < size; i6++) {
                f0.a aVar = this.f8238c.get(i6);
                Fragment fragment = aVar.f8256b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i5;
                    if (FragmentManager.W0(2)) {
                        Objects.toString(aVar.f8256b);
                        int i7 = aVar.f8256b.mBackStackNesting;
                    }
                }
            }
        }
    }

    void R() {
        int size = this.f8238c.size() - 1;
        while (size >= 0) {
            f0.a aVar = this.f8238c.get(size);
            if (aVar.f8257c) {
                if (aVar.f8255a == 8) {
                    aVar.f8257c = false;
                    this.f8238c.remove(size - 1);
                    size--;
                } else {
                    int i5 = aVar.f8256b.mContainerId;
                    aVar.f8255a = 2;
                    aVar.f8257c = false;
                    for (int i6 = size - 1; i6 >= 0; i6--) {
                        f0.a aVar2 = this.f8238c.get(i6);
                        if (aVar2.f8257c && aVar2.f8256b.mContainerId == i5) {
                            this.f8238c.remove(i6);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int S(boolean z5) {
        if (this.O) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.W0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
            U("  ", printWriter, true);
            printWriter.close();
        }
        this.O = true;
        if (this.f8244i) {
            this.P = this.N.r();
        } else {
            this.P = -1;
        }
        this.N.h0(this, z5);
        return this.P;
    }

    public void T(String str, PrintWriter printWriter) {
        U(str, printWriter, true);
    }

    public void U(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8246k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.f8243h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8243h));
            }
            if (this.f8239d != 0 || this.f8240e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8239d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8240e));
            }
            if (this.f8241f != 0 || this.f8242g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8241f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8242g));
            }
            if (this.f8247l != 0 || this.f8248m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8247l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8248m);
            }
            if (this.f8249n != 0 || this.f8250o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8249n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8250o);
            }
        }
        if (this.f8238c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8238c.size();
        for (int i5 = 0; i5 < size; i5++) {
            f0.a aVar = this.f8238c.get(i5);
            switch (aVar.f8255a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f8255a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f8256b);
            if (z5) {
                if (aVar.f8258d != 0 || aVar.f8259e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8258d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8259e));
                }
                if (aVar.f8260f != 0 || aVar.f8261g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8260f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8261g));
                }
            }
        }
    }

    void V() {
        int size = this.f8238c.size();
        for (int i5 = 0; i5 < size; i5++) {
            f0.a aVar = this.f8238c.get(i5);
            Fragment fragment = aVar.f8256b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f8243h);
                fragment.setSharedElementNames(this.f8251p, this.f8252q);
            }
            switch (aVar.f8255a) {
                case 1:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, false);
                    this.N.n(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8255a);
                case 3:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.B1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.T0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, false);
                    this.N.b2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.E(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, false);
                    this.N.t(fragment);
                    break;
                case 8:
                    this.N.X1(fragment);
                    break;
                case 9:
                    this.N.X1(null);
                    break;
                case 10:
                    this.N.W1(fragment, aVar.f8263i);
                    break;
            }
        }
    }

    void W() {
        for (int size = this.f8238c.size() - 1; size >= 0; size--) {
            f0.a aVar = this.f8238c.get(size);
            Fragment fragment = aVar.f8256b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.N1(this.f8243h));
                fragment.setSharedElementNames(this.f8252q, this.f8251p);
            }
            switch (aVar.f8255a) {
                case 1:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, true);
                    this.N.B1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8255a);
                case 3:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.b2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, true);
                    this.N.T0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f8258d, aVar.f8259e, aVar.f8260f, aVar.f8261g);
                    this.N.U1(fragment, true);
                    this.N.E(fragment);
                    break;
                case 8:
                    this.N.X1(null);
                    break;
                case 9:
                    this.N.X1(fragment);
                    break;
                case 10:
                    this.N.W1(fragment, aVar.f8262h);
                    break;
            }
        }
    }

    Fragment X(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i5 = 0;
        while (i5 < this.f8238c.size()) {
            f0.a aVar = this.f8238c.get(i5);
            int i6 = aVar.f8255a;
            if (i6 != 1) {
                if (i6 == 2) {
                    Fragment fragment3 = aVar.f8256b;
                    int i7 = fragment3.mContainerId;
                    boolean z5 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i7) {
                            if (fragment4 == fragment3) {
                                z5 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f8238c.add(i5, new f0.a(9, fragment4, true));
                                    i5++;
                                    fragment2 = null;
                                }
                                f0.a aVar2 = new f0.a(3, fragment4, true);
                                aVar2.f8258d = aVar.f8258d;
                                aVar2.f8260f = aVar.f8260f;
                                aVar2.f8259e = aVar.f8259e;
                                aVar2.f8261g = aVar.f8261g;
                                this.f8238c.add(i5, aVar2);
                                arrayList.remove(fragment4);
                                i5++;
                            }
                        }
                    }
                    if (z5) {
                        this.f8238c.remove(i5);
                        i5--;
                    } else {
                        aVar.f8255a = 1;
                        aVar.f8257c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i6 == 3 || i6 == 6) {
                    arrayList.remove(aVar.f8256b);
                    Fragment fragment5 = aVar.f8256b;
                    if (fragment5 == fragment2) {
                        this.f8238c.add(i5, new f0.a(9, fragment5));
                        i5++;
                        fragment2 = null;
                    }
                } else if (i6 != 7) {
                    if (i6 == 8) {
                        this.f8238c.add(i5, new f0.a(9, fragment2, true));
                        aVar.f8257c = true;
                        i5++;
                        fragment2 = aVar.f8256b;
                    }
                }
                i5++;
            }
            arrayList.add(aVar.f8256b);
            i5++;
        }
        return fragment2;
    }

    public void Y() {
        if (this.f8254s != null) {
            for (int i5 = 0; i5 < this.f8254s.size(); i5++) {
                this.f8254s.get(i5).run();
            }
            this.f8254s = null;
        }
    }

    Fragment Z(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f8238c.size() - 1; size >= 0; size--) {
            f0.a aVar = this.f8238c.get(size);
            int i5 = aVar.f8255a;
            if (i5 != 1) {
                if (i5 != 3) {
                    switch (i5) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f8256b;
                            break;
                        case 10:
                            aVar.f8263i = aVar.f8262h;
                            break;
                    }
                }
                arrayList.add(aVar.f8256b);
            }
            arrayList.remove(aVar.f8256b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public boolean a(@androidx.annotation.o0 ArrayList<a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.W0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8244i) {
            return true;
        }
        this.N.m(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @q0
    public CharSequence getBreadCrumbShortTitle() {
        return this.f8249n != 0 ? this.N.J0().j().getText(this.f8249n) : this.f8250o;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbShortTitleRes() {
        return this.f8249n;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @q0
    public CharSequence getBreadCrumbTitle() {
        return this.f8247l != 0 ? this.N.J0().j().getText(this.f8247l) : this.f8248m;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getBreadCrumbTitleRes() {
        return this.f8247l;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getId() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @q0
    public String getName() {
        return this.f8246k;
    }

    @Override // androidx.fragment.app.f0
    public int m() {
        return S(false);
    }

    @Override // androidx.fragment.app.f0
    public int n() {
        return S(true);
    }

    @Override // androidx.fragment.app.f0
    public void o() {
        s();
        this.N.k0(this, false);
    }

    @Override // androidx.fragment.app.f0
    public void p() {
        s();
        this.N.k0(this, true);
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 r(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.r(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.f0
    void t(int i5, Fragment fragment, @q0 String str, int i6) {
        super.t(i5, fragment, str, i6);
        fragment.mFragmentManager = this.N;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            sb.append(" #");
            sb.append(this.P);
        }
        if (this.f8246k != null) {
            sb.append(" ");
            sb.append(this.f8246k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 u(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.u(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.f0
    public boolean w() {
        return this.f8238c.isEmpty();
    }

    @Override // androidx.fragment.app.f0
    @androidx.annotation.o0
    public f0 x(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.x(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    a(@androidx.annotation.o0 a aVar) {
        super(aVar.N.G0(), aVar.N.J0() != null ? aVar.N.J0().j().getClassLoader() : null, aVar);
        this.P = -1;
        this.Q = false;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }
}
