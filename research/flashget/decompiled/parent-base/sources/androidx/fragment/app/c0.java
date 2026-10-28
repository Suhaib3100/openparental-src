package androidx.fragment.app;

import androidx.view.h1;
import androidx.view.k1;
import androidx.view.n1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes3.dex */
final class c0 extends h1 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f29873h = "FragmentManager";

    /* renamed from: i, reason: collision with root package name */
    private static final k1.b f29874i = new a();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29878d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Fragment> f29875a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, c0> f29876b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, n1> f29877c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f29879e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29880f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29881g = false;

    /* compiled from: FragmentManagerViewModel.java */
    class a implements k1.b {
        a() {
        }

        @Override // androidx.lifecycle.k1.b
        @androidx.annotation.o0
        public <T extends h1> T create(@androidx.annotation.o0 Class<T> cls) {
            return new c0(true);
        }
    }

    c0(boolean z4) {
        this.f29878d = z4;
    }

    private void e(@androidx.annotation.o0 String str) {
        c0 c0Var = this.f29876b.get(str);
        if (c0Var != null) {
            c0Var.onCleared();
            this.f29876b.remove(str);
        }
        n1 n1Var = this.f29877c.get(str);
        if (n1Var != null) {
            n1Var.a();
            this.f29877c.remove(str);
        }
    }

    @androidx.annotation.o0
    static c0 h(n1 n1Var) {
        return (c0) new k1(n1Var, f29874i).a(c0.class);
    }

    void b(@androidx.annotation.o0 Fragment fragment) {
        if (this.f29881g) {
            FragmentManager.W0(2);
        } else {
            if (this.f29875a.containsKey(fragment.mWho)) {
                return;
            }
            this.f29875a.put(fragment.mWho, fragment);
            if (FragmentManager.W0(2)) {
                fragment.toString();
            }
        }
    }

    void c(@androidx.annotation.o0 Fragment fragment) {
        if (FragmentManager.W0(3)) {
            Objects.toString(fragment);
        }
        e(fragment.mWho);
    }

    void d(@androidx.annotation.o0 String str) {
        FragmentManager.W0(3);
        e(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f29875a.equals(c0Var.f29875a) && this.f29876b.equals(c0Var.f29876b) && this.f29877c.equals(c0Var.f29877c);
    }

    @androidx.annotation.q0
    Fragment f(String str) {
        return this.f29875a.get(str);
    }

    @androidx.annotation.o0
    c0 g(@androidx.annotation.o0 Fragment fragment) {
        c0 c0Var = this.f29876b.get(fragment.mWho);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this.f29878d);
        this.f29876b.put(fragment.mWho, c0Var2);
        return c0Var2;
    }

    public int hashCode() {
        return this.f29877c.hashCode() + ((this.f29876b.hashCode() + (this.f29875a.hashCode() * 31)) * 31);
    }

    @androidx.annotation.o0
    Collection<Fragment> i() {
        return new ArrayList(this.f29875a.values());
    }

    @androidx.annotation.q0
    @Deprecated
    b0 j() {
        if (this.f29875a.isEmpty() && this.f29876b.isEmpty() && this.f29877c.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, c0> entry : this.f29876b.entrySet()) {
            b0 j4 = entry.getValue().j();
            if (j4 != null) {
                hashMap.put(entry.getKey(), j4);
            }
        }
        this.f29880f = true;
        if (this.f29875a.isEmpty() && hashMap.isEmpty() && this.f29877c.isEmpty()) {
            return null;
        }
        return new b0(new ArrayList(this.f29875a.values()), hashMap, new HashMap(this.f29877c));
    }

    @androidx.annotation.o0
    n1 k(@androidx.annotation.o0 Fragment fragment) {
        n1 n1Var = this.f29877c.get(fragment.mWho);
        if (n1Var != null) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        this.f29877c.put(fragment.mWho, n1Var2);
        return n1Var2;
    }

    boolean l() {
        return this.f29879e;
    }

    void m(@androidx.annotation.o0 Fragment fragment) {
        if (this.f29881g) {
            FragmentManager.W0(2);
        } else {
            if (this.f29875a.remove(fragment.mWho) == null || !FragmentManager.W0(2)) {
                return;
            }
            fragment.toString();
        }
    }

    @Deprecated
    void n(@androidx.annotation.q0 b0 b0Var) {
        this.f29875a.clear();
        this.f29876b.clear();
        this.f29877c.clear();
        if (b0Var != null) {
            Collection<Fragment> b5 = b0Var.b();
            if (b5 != null) {
                for (Fragment fragment : b5) {
                    if (fragment != null) {
                        this.f29875a.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, b0> a5 = b0Var.a();
            if (a5 != null) {
                for (Map.Entry<String, b0> entry : a5.entrySet()) {
                    c0 c0Var = new c0(this.f29878d);
                    c0Var.n(entry.getValue());
                    this.f29876b.put(entry.getKey(), c0Var);
                }
            }
            Map<String, n1> c5 = b0Var.c();
            if (c5 != null) {
                this.f29877c.putAll(c5);
            }
        }
        this.f29880f = false;
    }

    void o(boolean z4) {
        this.f29881g = z4;
    }

    @Override // androidx.view.h1
    protected void onCleared() {
        if (FragmentManager.W0(3)) {
            toString();
        }
        this.f29879e = true;
    }

    boolean p(@androidx.annotation.o0 Fragment fragment) {
        if (this.f29875a.containsKey(fragment.mWho)) {
            return this.f29878d ? this.f29879e : !this.f29880f;
        }
        return true;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f29875a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f29876b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f29877c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
