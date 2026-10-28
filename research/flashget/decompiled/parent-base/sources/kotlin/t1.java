package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: UByteArray.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"\u0088\u0001\b\u0092\u0001\u00020\u0007\u0082\u0002\u0004\n\u0002\b!¨\u0006-"}, d2 = {"Lkotlin/t1;", "", "Lkotlin/s1;", "", "size", "f", "(I)[B", "", "storage", "h", "([B)[B", "index", "q", "([BI)B", "value", "Lkotlin/k2;", "D", "([BIB)V", "", "A", "([B)Ljava/util/Iterator;", "element", "", "j", "([BB)Z", "elements", "l", "([BLjava/util/Collection;)Z", "x", "([B)Z", "", "F", "([B)Ljava/lang/String;", "w", "([B)I", "", "other", "m", "([BLjava/lang/Object;)Z", "b", "[B", "v", "()V", "s", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@t
@kd.g
@c1(version = "1.3")
@kotlin.jvm.internal.r1({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes7.dex */
public final class t1 implements Collection<s1>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final byte[] storage;

    /* compiled from: UByteArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/t1$a;", "", "Lkotlin/s1;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "b", "()B", "[B", "", "c", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Iterator<s1>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final byte[] array;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(@fg.l byte[] bArr) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("荤\u0001"));
            this.array = bArr;
        }

        public byte b() {
            int i4 = this.index;
            byte[] bArr = this.array;
            if (i4 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i4 + 1;
            return s1.h(bArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ s1 next() {
            return s1.b(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("荥\u0001"));
        }
    }

    @w0
    private /* synthetic */ t1(byte[] bArr) {
        this.storage = bArr;
    }

    @fg.l
    public static Iterator<s1> A(byte[] bArr) {
        return new a(bArr);
    }

    public static final void D(byte[] bArr, int i4, byte b5) {
        bArr[i4] = b5;
    }

    public static String F(byte[] bArr) {
        return ProtectedSandApp.s("荦\u0001") + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ t1 c(byte[] bArr) {
        return new t1(bArr);
    }

    @fg.l
    public static byte[] f(int i4) {
        byte[] bArr = new byte[i4];
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("荧\u0001"));
        return bArr;
    }

    @fg.l
    @w0
    public static byte[] h(@fg.l byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("荧\u0001"));
        return bArr;
    }

    public static boolean j(byte[] bArr, byte b5) {
        return kotlin.collections.l.m8(bArr, b5);
    }

    public static boolean l(byte[] bArr, @fg.l Collection<s1> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("荨\u0001"));
        Collection<s1> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof s1) || !kotlin.collections.l.m8(bArr, ((s1) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(byte[] bArr, Object obj) {
        return (obj instanceof t1) && kotlin.jvm.internal.l0.g(bArr, ((t1) obj).storage);
    }

    public static final boolean p(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.l0.g(bArr, bArr2);
    }

    public static final byte q(byte[] bArr, int i4) {
        return s1.h(bArr[i4]);
    }

    public static int s(byte[] bArr) {
        return bArr.length;
    }

    @w0
    public static /* synthetic */ void v() {
    }

    public static int w(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean x(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: G, reason: from getter */
    public final /* synthetic */ byte[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(s1 s1Var) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends s1> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    public boolean b(byte b5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        return kotlin.collections.l.m8(this.storage, ((s1) obj).getData());
    }

    @Override // java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("荨\u0001"));
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

    public boolean i(byte b5) {
        return kotlin.collections.l.m8(this.storage, b5);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return x(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<s1> iterator() {
        return new a(this.storage);
    }

    public int r() {
        return this.storage.length;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("荩\u0001"));
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
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("荪\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
