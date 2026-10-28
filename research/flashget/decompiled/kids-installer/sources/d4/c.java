package d4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v;

/* compiled from: TargetPlatform.kt */
/* loaded from: classes5.dex */
public class c implements Collection<b>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Set<b> f22335o;

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚙"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚚"));
    }

    public boolean b(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㚛"));
        return this.f22335o.contains(bVar);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚜"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return b((b) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> collection) {
        l0.p(collection, ProtectedSandApp.s("㚝"));
        return this.f22335o.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && l0.g(this.f22335o, ((c) obj).f22335o);
    }

    @d5.d
    public final Set<b> f() {
        return this.f22335o;
    }

    public int g() {
        return this.f22335o.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f22335o.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f22335o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<b> iterator() {
        return this.f22335o.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚞"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚟"));
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚠"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㚡"));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @d5.d
    public String toString() {
        return a.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        l0.p(tArr, ProtectedSandApp.s("㚢"));
        return (T[]) v.b(this, tArr);
    }
}
