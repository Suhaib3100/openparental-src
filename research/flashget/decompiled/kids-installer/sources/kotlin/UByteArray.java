package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UByteArray.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "size", "", "constructor-impl", "(I)[B", "storage", "", "([B)[B", "getSize-impl", "([B)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-7apg3OU", "([BB)Z", "containsAll", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([BLjava/lang/Object;)Z", "get", "index", "get-w2LRezQ", "([BI)B", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([B)Z", "iterator", "", "iterator-impl", "([B)Ljava/util/Iterator;", "set", "", "value", "set-VurrAj0", "([BIB)V", "toString", "", "toString-impl", "([B)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@p3.g
@SourceDebugExtension({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.v1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UByteArray implements Collection<UByte>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final byte[] f27224o;

    /* compiled from: UByteArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "array", "", "([B)V", "index", "", "hasNext", "", "next", "next-w2LRezQ", "()B", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.v1$a */
    private static final class a implements Iterator<UByte>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final byte[] f27225o;

        /* renamed from: p, reason: collision with root package name */
        private int f27226p;

        public a(@d5.d byte[] bArr) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("屳"));
            this.f27225o = bArr;
        }

        public byte a() {
            int i5 = this.f27226p;
            byte[] bArr = this.f27225o;
            if (i5 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27226p));
            }
            this.f27226p = i5 + 1;
            return UByte.r(bArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27226p < this.f27225o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.h(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("屴"));
        }
    }

    @PublishedApi
    private /* synthetic */ UByteArray(byte[] bArr) {
        this.f27224o = bArr;
    }

    public static boolean A(byte[] bArr) {
        return bArr.length == 0;
    }

    @d5.d
    public static Iterator<UByte> B(byte[] bArr) {
        return new a(bArr);
    }

    public static final void C(byte[] bArr, int i5, byte b6) {
        bArr[i5] = b6;
    }

    public static String E(byte[] bArr) {
        return ProtectedSandApp.s("屵") + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ UByteArray f(byte[] bArr) {
        return new UByteArray(bArr);
    }

    @d5.d
    public static byte[] g(int i5) {
        byte[] bArr = new byte[i5];
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("屶"));
        return bArr;
    }

    @PublishedApi
    @d5.d
    public static byte[] h(@d5.d byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("屷"));
        return bArr;
    }

    public static boolean q(byte[] bArr, byte b6) {
        boolean m8;
        m8 = kotlin.collections.t.m8(bArr, b6);
        return m8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0015->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(byte[] r4, @d5.d java.util.Collection<kotlin.UByte> r5) {
        /*
            java.lang.String r0 = "屸"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto L11
            goto L36
        L11:
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof kotlin.UByte
            r3 = 0
            if (r2 == 0) goto L32
            kotlin.u1 r0 = (kotlin.UByte) r0
            byte r0 = r0.getF27223o()
            boolean r0 = kotlin.collections.l.m8(r4, r0)
            if (r0 == 0) goto L32
            r0 = r1
            goto L33
        L32:
            r0 = r3
        L33:
            if (r0 != 0) goto L15
            r1 = r3
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UByteArray.r(byte[], java.util.Collection):boolean");
    }

    public static boolean s(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && kotlin.jvm.internal.l0.g(bArr, ((UByteArray) obj).f27224o);
    }

    public static final boolean t(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.l0.g(bArr, bArr2);
    }

    public static final byte u(byte[] bArr, int i5) {
        return UByte.r(bArr[i5]);
    }

    public static int x(byte[] bArr) {
        return bArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void y() {
    }

    public static int z(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: H, reason: from getter */
    public final /* synthetic */ byte[] getF27224o() {
        return this.f27224o;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屹"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屺"));
    }

    public boolean b(byte b6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屻"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屼"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return p(((UByte) obj).getF27223o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("屽"));
        return r(this.f27224o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return s(this.f27224o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f27224o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return A(this.f27224o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<UByte> iterator() {
        return new a(this.f27224o);
    }

    public boolean p(byte b6) {
        boolean m8;
        m8 = kotlin.collections.t.m8(this.f27224o, b6);
        return m8;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屾"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("屿"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岀"));
    }

    @Override // java.util.Collection
    public int size() {
        return this.f27224o.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return E(this.f27224o);
    }

    public int v() {
        return this.f27224o.length;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("岁"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
