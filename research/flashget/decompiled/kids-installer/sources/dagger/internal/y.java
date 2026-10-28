package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: SetBuilder.java */
/* loaded from: classes5.dex */
public final class y<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f22381b = ProtectedSandApp.s("㛓");

    /* renamed from: a, reason: collision with root package name */
    private final List<T> f22382a;

    private y(int i5) {
        this.f22382a = new ArrayList(i5);
    }

    public static <T> y<T> d(int i5) {
        return new y<>(i5);
    }

    public y<T> a(T t5) {
        this.f22382a.add(s.c(t5, ProtectedSandApp.s("㛑")));
        return this;
    }

    public y<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            s.c(it.next(), ProtectedSandApp.s("㛒"));
        }
        this.f22382a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        return this.f22382a.isEmpty() ? Collections.emptySet() : this.f22382a.size() == 1 ? Collections.singleton(this.f22382a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f22382a));
    }
}
