package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l0;
import androidx.view.AbstractC1450w;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: BackStackRecord.java */
/* loaded from: classes3.dex */
final class b extends l0 implements FragmentManager.j, FragmentManager.p {
    private static final String R = "FragmentManager";
    final FragmentManager N;
    boolean O;
    int P;
    boolean Q;

    b(@androidx.annotation.o0 FragmentManager fragmentManager) {
        super(fragmentManager.G0(), fragmentManager.J0() != null ? fragmentManager.J0().f().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    @Override // androidx.fragment.app.l0
    public boolean B() {
        return this.f29993c.isEmpty();
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 C(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.C(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 P(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 AbstractC1450w.b bVar) {
        if (fragment.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        }
        if (bVar == AbstractC1450w.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC1450w.b.DESTROYED) {
            return super.P(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 Q(@androidx.annotation.q0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.N) {
            return super.Q(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 U(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.U(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void V(int i4) {
        if (this.f29999i) {
            if (FragmentManager.W0(2)) {
                toString();
            }
            int size = this.f29993c.size();
            for (int i5 = 0; i5 < size; i5++) {
                l0.a aVar = this.f29993c.get(i5);
                Fragment fragment = aVar.f30011b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i4;
                    if (FragmentManager.W0(2)) {
                        Objects.toString(aVar.f30011b);
                        int i6 = aVar.f30011b.mBackStackNesting;
                    }
                }
            }
        }
    }

    void W() {
        int size = this.f29993c.size() - 1;
        while (size >= 0) {
            l0.a aVar = this.f29993c.get(size);
            if (aVar.f30012c) {
                if (aVar.f30010a == 8) {
                    aVar.f30012c = false;
                    this.f29993c.remove(size - 1);
                    size--;
                } else {
                    int i4 = aVar.f30011b.mContainerId;
                    aVar.f30010a = 2;
                    aVar.f30012c = false;
                    for (int i5 = size - 1; i5 >= 0; i5--) {
                        l0.a aVar2 = this.f29993c.get(i5);
                        if (aVar2.f30012c && aVar2.f30011b.mContainerId == i4) {
                            this.f29993c.remove(i5);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int X(boolean z4) {
        if (this.O) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.W0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new t0("FragmentManager"));
            Z("  ", printWriter, true);
            printWriter.close();
        }
        this.O = true;
        if (this.f29999i) {
            this.P = this.N.r();
        } else {
            this.P = -1;
        }
        this.N.h0(this, z4);
        return this.P;
    }

    public void Y(String str, PrintWriter printWriter) {
        Z(str, printWriter, true);
    }

    public void Z(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f30001k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.f29998h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f29998h));
            }
            if (this.f29994d != 0 || this.f29995e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29994d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29995e));
            }
            if (this.f29996f != 0 || this.f29997g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29996f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29997g));
            }
            if (this.f30002l != 0 || this.f30003m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f30002l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f30003m);
            }
            if (this.f30004n != 0 || this.f30005o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f30004n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f30005o);
            }
        }
        if (this.f29993c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f29993c.size();
        for (int i4 = 0; i4 < size; i4++) {
            l0.a aVar = this.f29993c.get(i4);
            switch (aVar.f30010a) {
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
                    str2 = "cmd=" + aVar.f30010a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f30011b);
            if (z4) {
                if (aVar.f30013d != 0 || aVar.f30014e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f30013d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f30014e));
                }
                if (aVar.f30015f != 0 || aVar.f30016g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f30015f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f30016g));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int a() {
        return this.P;
    }

    void a0() {
        int size = this.f29993c.size();
        for (int i4 = 0; i4 < size; i4++) {
            l0.a aVar = this.f29993c.get(i4);
            Fragment fragment = aVar.f30011b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f29998h);
                fragment.setSharedElementNames(this.f30006p, this.f30007q);
            }
            switch (aVar.f30010a) {
                case 1:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, false);
                    this.N.n(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f30010a);
                case 3:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.C1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.T0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, false);
                    this.N.c2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.E(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, false);
                    this.N.t(fragment);
                    break;
                case 8:
                    this.N.Y1(fragment);
                    break;
                case 9:
                    this.N.Y1(null);
                    break;
                case 10:
                    this.N.X1(fragment, aVar.f30018i);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public boolean b(@androidx.annotation.o0 ArrayList<b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.W0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f29999i) {
            return true;
        }
        this.N.m(this);
        return true;
    }

    void b0() {
        for (int size = this.f29993c.size() - 1; size >= 0; size--) {
            l0.a aVar = this.f29993c.get(size);
            Fragment fragment = aVar.f30011b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.O1(this.f29998h));
                fragment.setSharedElementNames(this.f30007q, this.f30006p);
            }
            switch (aVar.f30010a) {
                case 1:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, true);
                    this.N.C1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f30010a);
                case 3:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.c2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, true);
                    this.N.T0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f30013d, aVar.f30014e, aVar.f30015f, aVar.f30016g);
                    this.N.V1(fragment, true);
                    this.N.E(fragment);
                    break;
                case 8:
                    this.N.Y1(null);
                    break;
                case 9:
                    this.N.Y1(fragment);
                    break;
                case 10:
                    this.N.X1(fragment, aVar.f30017h);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.q0
    public CharSequence c() {
        return this.f30002l != 0 ? this.N.J0().f().getText(this.f30002l) : this.f30003m;
    }

    Fragment c0(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i4 = 0;
        while (i4 < this.f29993c.size()) {
            l0.a aVar = this.f29993c.get(i4);
            int i5 = aVar.f30010a;
            if (i5 != 1) {
                if (i5 == 2) {
                    Fragment fragment3 = aVar.f30011b;
                    int i6 = fragment3.mContainerId;
                    boolean z4 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i6) {
                            if (fragment4 == fragment3) {
                                z4 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f29993c.add(i4, new l0.a(9, fragment4, true));
                                    i4++;
                                    fragment2 = null;
                                }
                                l0.a aVar2 = new l0.a(3, fragment4, true);
                                aVar2.f30013d = aVar.f30013d;
                                aVar2.f30015f = aVar.f30015f;
                                aVar2.f30014e = aVar.f30014e;
                                aVar2.f30016g = aVar.f30016g;
                                this.f29993c.add(i4, aVar2);
                                arrayList.remove(fragment4);
                                i4++;
                            }
                        }
                    }
                    if (z4) {
                        this.f29993c.remove(i4);
                        i4--;
                    } else {
                        aVar.f30010a = 1;
                        aVar.f30012c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i5 == 3 || i5 == 6) {
                    arrayList.remove(aVar.f30011b);
                    Fragment fragment5 = aVar.f30011b;
                    if (fragment5 == fragment2) {
                        this.f29993c.add(i4, new l0.a(9, fragment5));
                        i4++;
                        fragment2 = null;
                    }
                } else if (i5 != 7) {
                    if (i5 == 8) {
                        this.f29993c.add(i4, new l0.a(9, fragment2, true));
                        aVar.f30012c = true;
                        i4++;
                        fragment2 = aVar.f30011b;
                    }
                }
                i4++;
            }
            arrayList.add(aVar.f30011b);
            i4++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int d() {
        return this.f30004n;
    }

    public void d0() {
        if (this.f30009s != null) {
            for (int i4 = 0; i4 < this.f30009s.size(); i4++) {
                this.f30009s.get(i4).run();
            }
            this.f30009s = null;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int e() {
        return this.f30002l;
    }

    Fragment e0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f29993c.size() - 1; size >= 0; size--) {
            l0.a aVar = this.f29993c.get(size);
            int i4 = aVar.f30010a;
            if (i4 != 1) {
                if (i4 != 3) {
                    switch (i4) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f30011b;
                            break;
                        case 10:
                            aVar.f30018i = aVar.f30017h;
                            break;
                    }
                }
                arrayList.add(aVar.f30011b);
            }
            arrayList.remove(aVar.f30011b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.q0
    public CharSequence f() {
        return this.f30004n != 0 ? this.N.J0().f().getText(this.f30004n) : this.f30005o;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @androidx.annotation.q0
    public String getName() {
        return this.f30001k;
    }

    @Override // androidx.fragment.app.l0
    public int r() {
        return X(false);
    }

    @Override // androidx.fragment.app.l0
    public int s() {
        return X(true);
    }

    @Override // androidx.fragment.app.l0
    public void t() {
        x();
        this.N.k0(this, false);
    }

    public String toString() {
        StringBuilder a5 = a.a(128, "BackStackEntry{");
        a5.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            a5.append(" #");
            a5.append(this.P);
        }
        if (this.f30001k != null) {
            a5.append(" ");
            a5.append(this.f30001k);
        }
        a5.append("}");
        return a5.toString();
    }

    @Override // androidx.fragment.app.l0
    public void u() {
        x();
        this.N.k0(this, true);
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 w(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.w(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.l0
    void y(int i4, Fragment fragment, @androidx.annotation.q0 String str, int i5) {
        super.y(i4, fragment, str, i5);
        fragment.mFragmentManager = this.N;
    }

    @Override // androidx.fragment.app.l0
    @androidx.annotation.o0
    public l0 z(@androidx.annotation.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.z(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    b(@androidx.annotation.o0 b bVar) {
        super(bVar.N.G0(), bVar.N.J0() != null ? bVar.N.J0().f().getClassLoader() : null, bVar);
        this.P = -1;
        this.Q = false;
        this.N = bVar.N;
        this.O = bVar.O;
        this.P = bVar.P;
        this.Q = bVar.Q;
    }
}
