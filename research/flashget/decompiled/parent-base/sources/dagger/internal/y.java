package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: SetBuilder.java */
/* loaded from: classes7.dex */
public final class y<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f73695b = ProtectedSandApp.s("往\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final List<T> f73696a;

    private y(int i4) {
        this.f73696a = new ArrayList(i4);
    }

    public static <T> y<T> d(int i4) {
        return new y<>(i4);
    }

    public y<T> a(T t4) {
        this.f73696a.add(s.c(t4, ProtectedSandApp.s("往\u0001")));
        return this;
    }

    public y<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            s.c(it.next(), ProtectedSandApp.s("往\u0001"));
        }
        this.f73696a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        return this.f73696a.isEmpty() ? Collections.emptySet() : this.f73696a.size() == 1 ? Collections.singleton(this.f73696a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f73696a));
    }
}
