package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: UIntArray.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!¨\u0006-"}, d2 = {"Lkotlin/x1;", "", "Lkotlin/w1;", "", "size", "f", "(I)[I", "", "storage", "h", "([I)[I", "index", "q", "([II)I", "value", "Lkotlin/k2;", "D", "([III)V", "", "A", "([I)Ljava/util/Iterator;", "element", "", "j", "([II)Z", "elements", "l", "([ILjava/util/Collection;)Z", "x", "([I)Z", "", "F", "([I)Ljava/lang/String;", "w", "([I)I", "", "other", "m", "([ILjava/lang/Object;)Z", "b", "[I", "v", "()V", "s", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@t
@kd.g
@c1(version = "1.3")
@kotlin.jvm.internal.r1({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes7.dex */
public final class x1 implements Collection<w1>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] storage;

    /* compiled from: UIntArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/x1$a;", "", "Lkotlin/w1;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "b", "()I", "[I", "", "c", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Iterator<w1>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final int[] array;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(@fg.l int[] iArr) {
            kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("蕧\u0001"));
            this.array = iArr;
        }

        public int b() {
            int i4 = this.index;
            int[] iArr = this.array;
            if (i4 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i4 + 1;
            return w1.h(iArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ w1 next() {
            return w1.b(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蕨\u0001"));
        }
    }

    @w0
    private /* synthetic */ x1(int[] iArr) {
        this.storage = iArr;
    }

    @fg.l
    public static Iterator<w1> A(int[] iArr) {
        return new a(iArr);
    }

    public static final void D(int[] iArr, int i4, int i5) {
        iArr[i4] = i5;
    }

    public static String F(int[] iArr) {
        return ProtectedSandApp.s("蕩\u0001") + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ x1 c(int[] iArr) {
        return new x1(iArr);
    }

    @fg.l
    public static int[] f(int i4) {
        int[] iArr = new int[i4];
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("蕪\u0001"));
        return iArr;
    }

    @fg.l
    @w0
    public static int[] h(@fg.l int[] iArr) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("蕪\u0001"));
        return iArr;
    }

    public static boolean j(int[] iArr, int i4) {
        return kotlin.collections.l.q8(iArr, i4);
    }

    public static boolean l(int[] iArr, @fg.l Collection<w1> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("蕫\u0001"));
        Collection<w1> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof w1) || !kotlin.collections.l.q8(iArr, ((w1) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr, Object obj) {
        return (obj instanceof x1) && kotlin.jvm.internal.l0.g(iArr, ((x1) obj).storage);
    }

    public static final boolean p(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.l0.g(iArr, iArr2);
    }

    public static final int q(int[] iArr, int i4) {
        return w1.h(iArr[i4]);
    }

    public static int s(int[] iArr) {
        return iArr.length;
    }

    @w0
    public static /* synthetic */ void v() {
    }

    public static int w(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean x(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: G, reason: from getter */
    public final /* synthetic */ int[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(w1 w1Var) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends w1> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    public boolean b(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        return kotlin.collections.l.q8(this.storage, ((w1) obj).getData());
    }

    @Override // java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("蕫\u0001"));
        return l(this.storage, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.storage, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.storage);
    }

    public boolean i(int i4) {
        return kotlin.collections.l.q8(this.storage, i4);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return x(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<w1> iterator() {
        return new a(this.storage);
    }

    public int r() {
        return this.storage.length;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蕬\u0001"));
    }

    @Override // java.util.Collection
    public int size() {
        return this.storage.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return F(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("蕭\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
