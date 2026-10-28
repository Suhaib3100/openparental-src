package android.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, c1> f8581a = new HashMap<>();

    public final void a() {
        Iterator<c1> it = this.f8581a.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f8581a.clear();
    }

    final c1 b(String str) {
        return this.f8581a.get(str);
    }

    Set<String> c() {
        return new HashSet(this.f8581a.keySet());
    }

    final void d(String str, c1 c1Var) {
        c1 put = this.f8581a.put(str, c1Var);
        if (put != null) {
            put.e();
        }
    }
}
