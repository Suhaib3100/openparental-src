package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020&H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006'"}, d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "readResolve", "subList", "fromIndex", "toIndex", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.m0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class EmptyList implements List, Serializable, RandomAccess, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final EmptyList f23167o = new EmptyList();

    /* renamed from: p, reason: collision with root package name */
    private static final long f23168p = -7390468764508069838L;

    private EmptyList() {
    }

    private final Object s() {
        return f23167o;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i5, Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟖"));
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟘"));
    }

    public void b(int i5, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟚"));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟛"));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return g((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@d5.d Collection elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("㟜"));
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@d5.e Object other) {
        return (other instanceof List) && ((List) other).isEmpty();
    }

    public boolean f(Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟝"));
    }

    public boolean g(@d5.d Void r22) {
        kotlin.jvm.internal.l0.p(r22, ProtectedSandApp.s("㟞"));
        return false;
    }

    @Override // java.util.List
    @d5.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void get(int i5) {
        throw new IndexOutOfBoundsException(ProtectedSandApp.s("㟟") + i5 + org.apache.commons.io.k.f32026a);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return q((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator iterator() {
        return EmptyIterator.f23163o;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return r((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @d5.d
    public ListIterator listIterator() {
        return EmptyIterator.f23163o;
    }

    public int p() {
        return 0;
    }

    public int q(@d5.d Void r22) {
        kotlin.jvm.internal.l0.p(r22, ProtectedSandApp.s("㟡"));
        return -1;
    }

    public int r(@d5.d Void r22) {
        kotlin.jvm.internal.l0.p(r22, ProtectedSandApp.s("㟢"));
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟣"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟥"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟦"));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟧"));
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.List
    @d5.d
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("㟨"), fromIndex, ProtectedSandApp.s("㟩"), toIndex));
    }

    public Void t(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟪"));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("㟬");
    }

    public Void u(int i5, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟭"));
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟗"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟙"));
    }

    @Override // java.util.List
    @d5.d
    public ListIterator listIterator(int index) {
        if (index == 0) {
            return EmptyIterator.f23163o;
        }
        throw new IndexOutOfBoundsException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("㟠"), index));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㟤"));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㟫"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
