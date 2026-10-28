package androidx.compose.ui.text.font;

import androidx.compose.ui.graphics.l6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00062"}, d2 = {"Landroidx/compose/ui/text/font/f0;", "Landroidx/compose/ui/text/font/w;", "", "Landroidx/compose/ui/text/font/x;", "fonts", "<init>", "(Ljava/util/List;)V", "element", "", "q", "(Landroidx/compose/ui/text/font/x;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "r", "(I)Landroidx/compose/ui/text/font/x;", "w", "(Landroidx/compose/ui/text/font/x;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "x", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "l", "Ljava/util/List;", "s", "()Ljava/util/List;", "v", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
/* loaded from: classes.dex */
public final class f0 extends w implements List<x>, md.a {

    /* renamed from: m, reason: collision with root package name */
    public static final int f20711m = 0;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ List<x> f20712k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@fg.l List<? extends x> list) {
        super(null);
        this.f20712k = list;
        List<? extends x> list2 = list;
        if (list2.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
        this.fonts = new ArrayList(list2);
    }

    public x A(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public x D(int i4, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i4, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f20712k.contains((x) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        return this.f20712k.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof f0) && kotlin.jvm.internal.l0.g(this.fonts, ((f0) other).fonts);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof x)) {
            return -1;
        }
        return this.f20712k.indexOf((x) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f20712k.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<x> iterator() {
        return this.f20712k.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof x)) {
            return -1;
        }
        return this.f20712k.lastIndexOf((x) obj);
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<x> listIterator() {
        return this.f20712k.listIterator();
    }

    public void m(int i4, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean p(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean q(@fg.l x element) {
        return this.f20712k.contains(element);
    }

    @Override // java.util.List
    @fg.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public x get(int index) {
        return this.f20712k.get(index);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ x remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<x> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @fg.l
    public final List<x> s() {
        return this.fonts;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ x set(int i4, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f20712k.size();
    }

    @Override // java.util.List
    public void sort(Comparator<? super x> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @fg.l
    public List<x> subList(int fromIndex, int toIndex) {
        return this.f20712k.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @fg.l
    public String toString() {
        return l6.a(new StringBuilder("FontListFontFamily(fonts="), this.fonts, ')');
    }

    public int v() {
        return this.f20712k.size();
    }

    public int w(@fg.l x element) {
        return this.f20712k.indexOf(element);
    }

    public int x(@fg.l x element) {
        return this.f20712k.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<x> listIterator(int index) {
        return this.f20712k.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
