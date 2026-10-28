package yd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v;

/* compiled from: TargetPlatform.kt */
/* loaded from: classes8.dex */
public class c implements Collection<b>, md.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final Set<b> f93404b;

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    public boolean b(@l b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ꍐ\u0001"));
        return this.f93404b.contains(bVar);
    }

    @l
    public final Set<b> c() {
        return this.f93404b;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return b((b) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        l0.p(collection, ProtectedSandApp.s("ꍑ\u0001"));
        return this.f93404b.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && l0.g(this.f93404b, ((c) obj).f93404b);
    }

    public int f() {
        return this.f93404b.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f93404b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f93404b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l
    public Iterator<b> iterator() {
        return this.f93404b.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ꍏ\u0001"));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @l
    public String toString() {
        return a.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        l0.p(tArr, ProtectedSandApp.s("ꍒ\u0001"));
        return (T[]) v.b(this, tArr);
    }
}
