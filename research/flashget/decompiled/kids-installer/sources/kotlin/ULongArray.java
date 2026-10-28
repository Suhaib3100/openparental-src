package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ULongArray.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "size", "", "constructor-impl", "(I)[J", "storage", "", "([J)[J", "getSize-impl", "([J)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-VKZWuLQ", "([JJ)Z", "containsAll", "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([JLjava/lang/Object;)Z", "get", "index", "get-s-VKNKU", "([JI)J", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([J)Z", "iterator", "", "iterator-impl", "([J)Ljava/util/Iterator;", "set", "", "value", "set-k8EXiF4", "([JIJ)V", "toString", "", "toString-impl", "([J)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
@p3.g
@SourceDebugExtension({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.d2, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class ULongArray implements Collection<ULong>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final long[] f23328o;

    /* compiled from: ULongArray.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0013\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/ULongArray$Iterator;", "", "Lkotlin/ULong;", "array", "", "([J)V", "index", "", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.d2$a */
    private static final class a implements Iterator<ULong>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final long[] f23329o;

        /* renamed from: p, reason: collision with root package name */
        private int f23330p;

        public a(@d5.d long[] jArr) {
            kotlin.jvm.internal.l0.p(jArr, ProtectedSandApp.s("㻺"));
            this.f23329o = jArr;
        }

        public long a() {
            int i5 = this.f23330p;
            long[] jArr = this.f23329o;
            if (i5 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f23330p));
            }
            this.f23330p = i5 + 1;
            return ULong.r(jArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23330p < this.f23329o.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.h(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㻻"));
        }
    }

    @PublishedApi
    private /* synthetic */ ULongArray(long[] jArr) {
        this.f23328o = jArr;
    }

    public static boolean A(long[] jArr) {
        return jArr.length == 0;
    }

    @d5.d
    public static Iterator<ULong> B(long[] jArr) {
        return new a(jArr);
    }

    public static final void C(long[] jArr, int i5, long j5) {
        jArr[i5] = j5;
    }

    public static String E(long[] jArr) {
        return ProtectedSandApp.s("㻼") + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ ULongArray f(long[] jArr) {
        return new ULongArray(jArr);
    }

    @d5.d
    public static long[] g(int i5) {
        long[] jArr = new long[i5];
        kotlin.jvm.internal.l0.p(jArr, ProtectedSandApp.s("㻽"));
        return jArr;
    }

    @PublishedApi
    @d5.d
    public static long[] h(@d5.d long[] jArr) {
        kotlin.jvm.internal.l0.p(jArr, ProtectedSandApp.s("㻾"));
        return jArr;
    }

    public static boolean q(long[] jArr, long j5) {
        boolean r8;
        r8 = kotlin.collections.t.r8(jArr, j5);
        return r8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0015->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(long[] r6, @d5.d java.util.Collection<kotlin.ULong> r7) {
        /*
            java.lang.String r0 = "㻿"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 1
            if (r0 == 0) goto L11
            goto L36
        L11:
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r7.next()
            boolean r2 = r0 instanceof kotlin.ULong
            r3 = 0
            if (r2 == 0) goto L32
            kotlin.c2 r0 = (kotlin.ULong) r0
            long r4 = r0.getF23071o()
            boolean r0 = kotlin.collections.l.r8(r6, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULongArray.r(long[], java.util.Collection):boolean");
    }

    public static boolean s(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && kotlin.jvm.internal.l0.g(jArr, ((ULongArray) obj).f23328o);
    }

    public static final boolean t(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.l0.g(jArr, jArr2);
    }

    public static final long u(long[] jArr, int i5) {
        return ULong.r(jArr[i5]);
    }

    public static int x(long[] jArr) {
        return jArr.length;
    }

    @PublishedApi
    public static /* synthetic */ void y() {
    }

    public static int z(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: H, reason: from getter */
    public final /* synthetic */ long[] getF23328o() {
        return this.f23328o;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼀"));
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼁"));
    }

    public boolean b(long j5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼂"));
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼃"));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return p(((ULong) obj).getF23071o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@d5.d Collection<? extends Object> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㼄"));
        return r(this.f23328o, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return s(this.f23328o, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f23328o);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return A(this.f23328o);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<ULong> iterator() {
        return new a(this.f23328o);
    }

    public boolean p(long j5) {
        boolean r8;
        r8 = kotlin.collections.t.r8(this.f23328o, j5);
        return r8;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼅"));
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼆"));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㼇"));
    }

    @Override // java.util.Collection
    public int size() {
        return this.f23328o.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return E(this.f23328o);
    }

    public int v() {
        return this.f23328o.length;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㼈"));
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
