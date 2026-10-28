package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010 \u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019\"\u0014\u0010\"\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006#"}, d2 = {"", "index", "shift", "f", "(II)I", "K", "V", "", "", "keyIndex", "key", "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "newNode", "j", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "h", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", "a", "I", "MAX_BRANCHING_FACTOR", "b", "LOG_MAX_BRANCHING_FACTOR", "c", "MAX_BRANCHING_FACTOR_MINUS_ONE", "d", "ENTRY_SIZE", "e", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16288a = 32;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16289b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16290c = 31;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16291d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16292e = 30;

    public static final int f(int i4, int i5) {
        return (i4 >> i5) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i4, K k4, V v4) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4 + 2, i4, objArr.length);
        objArr2[i4] = k4;
        objArr2[i4 + 1] = v4;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4, i4 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4, i4 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i4, int i5, u<?, ?> uVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.l.K0(objArr, objArr2, 0, 0, i4, 6, null);
        kotlin.collections.l.B0(objArr, objArr2, i4, i4 + 2, i5);
        objArr2[i5 - 2] = uVar;
        kotlin.collections.l.B0(objArr, objArr2, i5 - 1, i5, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i4, int i5, K k4, V v4) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        l0.o(copyOf, "copyOf(this, newSize)");
        kotlin.collections.l.B0(copyOf, copyOf, i4 + 2, i4 + 1, objArr.length);
        kotlin.collections.l.B0(copyOf, copyOf, i5 + 2, i5, i4);
        copyOf[i5] = k4;
        copyOf[i5 + 1] = v4;
        return copyOf;
    }
}
