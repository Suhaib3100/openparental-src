package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UShortArray.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "size", "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", "index", "get-Mh2AYeg", "([SI)S", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", "set", "", "value", "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@p3.g
@SourceDebugExtension({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.j2, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UShortArray implements Collection<UShort>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final short[] f23515o;

    /* compiled from: UShortArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", "index", "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.j2$a */
    private static final class a implements Iterator<UShort>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final short[] f23516o;

        /* renamed from: p, reason: collision with root package name */
        private int f23517p;

        public a(@d5.d short[] sArr) {
            kotlin.jvm.internal.l0.p(sArr, ProtectedSandApp.s("䄻"));
            this.f23516o = sArr;
        }

        public short a() {
            int i5 = this.f23517p;
            short[] sArr = this.f23516o;
            if (i5 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23517p));
            }
            this.f23517p = i5 + 1;
            return UShort.r(sArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23517p < this.f23516o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.h(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䄼"));
        }
    }

    @PublishedApi
    private /* synthetic */ UShortArray(short[] sArr) {
        this.f23515o = sArr;
    }

    public static boolean A(short[] sArr) {
        return sArr.length == 0;
    }

    @d5.d
    public static Iterator<UShort> B(short[] sArr) {
        return new a(sArr);
    }

    public static final void C(short[] sArr, int i5, short s5) {
        sArr[i5] = s5;
    }

    public static String E(short[] sArr) {
        return ProtectedSandApp.s("䄽") + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ UShortArray f(short[] sArr) {
        return new UShortArray(sArr);
    }

    @d5.d
    public static short[] g(int i5) {
        short[] sArr = new short[i5];
        kotlin.jvm.internal.l0.p(sArr, ProtectedSandApp.s("䄾"));
        return sArr;
    }

    @PublishedApi
    @d5.d
    public static short[] h(@d5.d short[] sArr) {
        kotlin.jvm.internal.l0.p(sArr, ProtectedSandApp.s("䄿"));
        return sArr;
    }

    public static boolean q(short[] sArr, short s5) {
        boolean t8;
        t8 = kotlin.collections.t.t8(sArr, s5);
        return t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0015->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(short[] r4, @d5.d java.util.Collection<kotlin.UShort> r5) {
        /*
            java.lang.String r0 = "䅀"
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
            boolean r2 = r0 instanceof kotlin.UShort
            r3 = 0
            if (r2 == 0) goto L32
            kotlin.i2 r0 = (kotlin.UShort) r0
            short r0 = r0.getF23343o()
            boolean r0 = kotlin.collections.l.t8(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UShortArray.r(short[], java.util.Collection):boolean");
    }

    public static boolean s(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && kotlin.jvm.internal.l0.g(sArr, ((UShortArray) obj).f23515o);
    }

    public static final boolean t(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.l0.g(sArr, sArr2);
    }

    public static final short u(short[] sArr, int i5) {
        return UShort.r(sArr[i5]);
    }

    public static int x(short[] sArr) {
        return sArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void y() {
    }

    public static int z(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: H, reason: from getter */
    public final /* synthetic */ short[] getF23515o() {
        return this.f23515o;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅁"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅂"));
    }

    public boolean b(short s5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅃"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅄"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return p(((UShort) obj).getF23343o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("䅅"));
        return r(this.f23515o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return s(this.f23515o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f23515o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return A(this.f23515o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<UShort> iterator() {
        return new a(this.f23515o);
    }

    public boolean p(short s5) {
        boolean t8;
        t8 = kotlin.collections.t.t8(this.f23515o, s5);
        return t8;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅆"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅇"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("䅈"));
    }

    @Override // java.util.Collection
    public int size() {
        return this.f23515o.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return E(this.f23515o);
    }

    public int v() {
        return this.f23515o.length;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("䅉"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
