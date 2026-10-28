package androidx.fragment.app;

import android.view.c1;
import android.view.f1;
import android.view.h1;
import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes3.dex */
final class w extends c1 {

    /* renamed from: k, reason: collision with root package name */
    private static final String f8368k = "FragmentManager";

    /* renamed from: l, reason: collision with root package name */
    private static final f1.b f8369l = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8373g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Fragment> f8370d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, w> f8371e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, h1> f8372f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f8374h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8375i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8376j = false;

    /* compiled from: FragmentManagerViewModel.java */
    class a implements f1.b {
        a() {
        }

        @Override // androidx.lifecycle.f1.b
        @androidx.annotation.o0
        public <T extends c1> T a(@androidx.annotation.o0 Class<T> cls) {
            return new w(true);
        }
    }

    w(boolean z5) {
        this.f8373g = z5;
    }

    private void j(@androidx.annotation.o0 String str) {
        w wVar = this.f8371e.get(str);
        if (wVar != null) {
            wVar.e();
            this.f8371e.remove(str);
        }
        h1 h1Var = this.f8372f.get(str);
        if (h1Var != null) {
            h1Var.a();
            this.f8372f.remove(str);
        }
    }

    @androidx.annotation.o0
    static w m(h1 h1Var) {
        return (w) new f1(h1Var, f8369l).a(w.class);
    }

    @Override // android.view.c1
    protected void e() {
        if (FragmentManager.W0(3)) {
            toString();
        }
        this.f8374h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f8370d.equals(wVar.f8370d) && this.f8371e.equals(wVar.f8371e) && this.f8372f.equals(wVar.f8372f);
    }

    void g(@androidx.annotation.o0 Fragment fragment) {
        if (this.f8376j) {
            FragmentManager.W0(2);
        } else {
            if (this.f8370d.containsKey(fragment.mWho)) {
                return;
            }
            this.f8370d.put(fragment.mWho, fragment);
            if (FragmentManager.W0(2)) {
                fragment.toString();
            }
        }
    }

    void h(@androidx.annotation.o0 Fragment fragment) {
        if (FragmentManager.W0(3)) {
            Objects.toString(fragment);
        }
        j(fragment.mWho);
    }

    public int hashCode() {
        return this.f8372f.hashCode() + ((this.f8371e.hashCode() + (this.f8370d.hashCode() * 31)) * 31);
    }

    void i(@androidx.annotation.o0 String str) {
        FragmentManager.W0(3);
        j(str);
    }

    @q0
    Fragment k(String str) {
        return this.f8370d.get(str);
    }

    @androidx.annotation.o0
    w l(@androidx.annotation.o0 Fragment fragment) {
        w wVar = this.f8371e.get(fragment.mWho);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f8373g);
        this.f8371e.put(fragment.mWho, wVar2);
        return wVar2;
    }

    @androidx.annotation.o0
    Collection<Fragment> n() {
        return new ArrayList(this.f8370d.values());
    }

    @q0
    @Deprecated
    v o() {
        if (this.f8370d.isEmpty() && this.f8371e.isEmpty() && this.f8372f.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, w> entry : this.f8371e.entrySet()) {
            v o5 = entry.getValue().o();
            if (o5 != null) {
                hashMap.put(entry.getKey(), o5);
            }
        }
        this.f8375i = true;
        if (this.f8370d.isEmpty() && hashMap.isEmpty() && this.f8372f.isEmpty()) {
            return null;
        }
        return new v(new ArrayList(this.f8370d.values()), hashMap, new HashMap(this.f8372f));
    }

    @androidx.annotation.o0
    h1 p(@androidx.annotation.o0 Fragment fragment) {
        h1 h1Var = this.f8372f.get(fragment.mWho);
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1Var2 = new h1();
        this.f8372f.put(fragment.mWho, h1Var2);
        return h1Var2;
    }

    boolean q() {
        return this.f8374h;
    }

    void r(@androidx.annotation.o0 Fragment fragment) {
        if (this.f8376j) {
            FragmentManager.W0(2);
            return;
        }
        if ((this.f8370d.remove(fragment.mWho) != null) && FragmentManager.W0(2)) {
            fragment.toString();
        }
    }

    @Deprecated
    void s(@q0 v vVar) {
        this.f8370d.clear();
        this.f8371e.clear();
        this.f8372f.clear();
        if (vVar != null) {
            Collection<Fragment> b6 = vVar.b();
            if (b6 != null) {
                for (Fragment fragment : b6) {
                    if (fragment != null) {
                        this.f8370d.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, v> a6 = vVar.a();
            if (a6 != null) {
                for (Map.Entry<String, v> entry : a6.entrySet()) {
                    w wVar = new w(this.f8373g);
                    wVar.s(entry.getValue());
                    this.f8371e.put(entry.getKey(), wVar);
                }
            }
            Map<String, h1> c6 = vVar.c();
            if (c6 != null) {
                this.f8372f.putAll(c6);
            }
        }
        this.f8375i = false;
    }

    void t(boolean z5) {
        this.f8376j = z5;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f8370d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f8371e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f8372f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    boolean u(@androidx.annotation.o0 Fragment fragment) {
        if (this.f8370d.containsKey(fragment.mWho)) {
            return this.f8373g ? this.f8374h : !this.f8375i;
        }
        return true;
    }
}
