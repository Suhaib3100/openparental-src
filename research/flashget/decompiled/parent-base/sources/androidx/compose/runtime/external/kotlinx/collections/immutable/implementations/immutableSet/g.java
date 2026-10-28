package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import ld.l;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001aN\u0010\u0013\u001a\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u001c"}, d2 = {"", "index", "shift", "f", "(II)I", "E", "", "", "element", "c", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "cellIndex", "g", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "newArray", "newArrayOffset", "Lkotlin/Function1;", "", "predicate", "d", "([Ljava/lang/Object;[Ljava/lang/Object;ILld/l;)I", "a", "I", "MAX_BRANCHING_FACTOR", "b", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16324a = 32;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16325b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16326c = 31;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16327d = 30;

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,851:1\n*E\n"})
    public static final class a extends n0 implements l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16328b = new a(1);

        public a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@m Object obj) {
            e.INSTANCE.getClass();
            return Boolean.valueOf(obj != e.f16317f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] c(Object[] objArr, int i4, E e4) {
        Object[] objArr2 = new Object[objArr.length + 1];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4 + 1, i4, objArr.length);
        objArr2[i4] = e4;
        return objArr2;
    }

    private static final int d(Object[] objArr, Object[] objArr2, int i4, l<Object, Boolean> lVar) {
        int i5 = 0;
        for (int i6 = 0; i6 < objArr.length; i6++) {
            if (lVar.invoke(objArr[i6]).booleanValue()) {
                objArr2[i4 + i5] = objArr[i6];
                i5++;
            }
        }
        return i5;
    }

    static int e(Object[] objArr, Object[] objArr2, int i4, l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            lVar = a.f16328b;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (((Boolean) lVar.invoke(objArr[i7])).booleanValue()) {
                objArr2[i4 + i6] = objArr[i7];
                i6++;
            }
        }
        return i6;
    }

    public static final int f(int i4, int i5) {
        return (i4 >> i5) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4, i4 + 1, objArr.length);
        return objArr2;
    }
}
