package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UIntArray.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "size", "", "constructor-impl", "(I)[I", "storage", "", "([I)[I", "getSize-impl", "([I)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-WZ4Q5Ns", "([II)Z", "containsAll", "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "get", "index", "get-pVg5ArA", "([II)I", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([I)Z", "iterator", "", "iterator-impl", "([I)Ljava/util/Iterator;", "set", "", "value", "set-VXSXFK8", "([III)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@p3.g
@SourceDebugExtension({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.z1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UIntArray implements Collection<UInt>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final int[] f27245o;

    /* compiled from: UIntArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UIntArray$Iterator;", "", "Lkotlin/UInt;", "array", "", "([I)V", "index", "", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.z1$a */
    private static final class a implements Iterator<UInt>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final int[] f27246o;

        /* renamed from: p, reason: collision with root package name */
        private int f27247p;

        public a(@d5.d int[] iArr) {
            kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("岍"));
            this.f27246o = iArr;
        }

        public int a() {
            int i5 = this.f27247p;
            int[] iArr = this.f27246o;
            if (i5 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f27247p));
            }
            this.f27247p = i5 + 1;
            return UInt.r(iArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27247p < this.f27246o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.h(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("岎"));
        }
    }

    @PublishedApi
    private /* synthetic */ UIntArray(int[] iArr) {
        this.f27245o = iArr;
    }

    public static boolean A(int[] iArr) {
        return iArr.length == 0;
    }

    @d5.d
    public static Iterator<UInt> B(int[] iArr) {
        return new a(iArr);
    }

    public static final void C(int[] iArr, int i5, int i6) {
        iArr[i5] = i6;
    }

    public static String E(int[] iArr) {
        return ProtectedSandApp.s("岏") + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ UIntArray f(int[] iArr) {
        return new UIntArray(iArr);
    }

    @d5.d
    public static int[] g(int i5) {
        int[] iArr = new int[i5];
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("岐"));
        return iArr;
    }

    @PublishedApi
    @d5.d
    public static int[] h(@d5.d int[] iArr) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("岑"));
        return iArr;
    }

    public static boolean q(int[] iArr, int i5) {
        boolean q8;
        q8 = kotlin.collections.t.q8(iArr, i5);
        return q8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0015->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(int[] r4, @d5.d java.util.Collection<kotlin.UInt> r5) {
        /*
            java.lang.String r0 = "岒"
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
            boolean r2 = r0 instanceof kotlin.UInt
            r3 = 0
            if (r2 == 0) goto L32
            kotlin.y1 r0 = (kotlin.UInt) r0
            int r0 = r0.getF27240o()
            boolean r0 = kotlin.collections.l.q8(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UIntArray.r(int[], java.util.Collection):boolean");
    }

    public static boolean s(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && kotlin.jvm.internal.l0.g(iArr, ((UIntArray) obj).f27245o);
    }

    public static final boolean t(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.l0.g(iArr, iArr2);
    }

    public static final int u(int[] iArr, int i5) {
        return UInt.r(iArr[i5]);
    }

    public static int x(int[] iArr) {
        return iArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void y() {
    }

    public static int z(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: H, reason: from getter */
    public final /* synthetic */ int[] getF27245o() {
        return this.f27245o;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岓"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岔"));
    }

    public boolean b(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岕"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岖"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return p(((UInt) obj).getF27240o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("岗"));
        return r(this.f27245o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return s(this.f27245o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f27245o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return A(this.f27245o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<UInt> iterator() {
        return new a(this.f27245o);
    }

    public boolean p(int i5) {
        boolean q8;
        q8 = kotlin.collections.t.q8(this.f27245o, i5);
        return q8;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岘"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岙"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("岚"));
    }

    @Override // java.util.Collection
    public int size() {
        return this.f27245o.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return E(this.f27245o);
    }

    public int v() {
        return this.f27245o.length;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("岛"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
