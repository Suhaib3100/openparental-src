package kotlin.collections;

import androidx.compose.animation.core.a2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0012¨\u00066"}, d2 = {"Lkotlin/collections/j0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "", "m", "()Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "f", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "h", "(I)Ljava/lang/Void;", "j", "(Ljava/lang/Void;)I", "l", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "c", "J", "serialVersionUID", "i", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j0 implements List, Serializable, RandomAccess, md.a {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final j0 f74919b = new j0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long serialVersionUID = -7390468764508069838L;

    private j0() {
    }

    private final Object m() {
        return f74919b;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    public void b(int i4, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    public boolean c(Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return f((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@fg.l Collection elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("慾\u0001"));
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@fg.m Object other) {
        return (other instanceof List) && ((List) other).isEmpty();
    }

    public boolean f(@fg.l Void element) {
        kotlin.jvm.internal.l0.p(element, ProtectedSandApp.s("慿\u0001"));
        return false;
    }

    @Override // java.util.List
    @fg.l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void get(int index) {
        throw new IndexOutOfBoundsException(a2.a(ProtectedSandApp.s("憀\u0001"), index, '.'));
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int i() {
        return 0;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return j((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator iterator() {
        return i0.f74913b;
    }

    public int j(@fg.l Void element) {
        kotlin.jvm.internal.l0.p(element, ProtectedSandApp.s("慿\u0001"));
        return -1;
    }

    public int l(@fg.l Void element) {
        kotlin.jvm.internal.l0.p(element, ProtectedSandApp.s("慿\u0001"));
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return l((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @fg.l
    public ListIterator listIterator() {
        return i0.f74913b;
    }

    public Void p(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    public Void q(int i4, Void r22) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.List
    @fg.l
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("憂\u0001"), fromIndex, ProtectedSandApp.s("憃\u0001"), toIndex));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("憅\u0001");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List
    @fg.l
    public ListIterator listIterator(int index) {
        if (index == 0) {
            return i0.f74913b;
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.a(ProtectedSandApp.s("憁\u0001"), index));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("慽\u0001"));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憄\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
