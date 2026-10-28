package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import fg.m;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0016"}, d2 = {"E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "b", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "element", "", "c", "(Ljava/lang/Object;)[Ljava/lang/Object;", "", "index", "shift", "a", "(II)I", "vectorSize", "d", "(I)I", "I", "MAX_BUFFER_SIZE", "LOG_MAX_BUFFER_SIZE", "MAX_BUFFER_SIZE_MINUS_ONE", "MUTABLE_BUFFER_SIZE", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16220a = 32;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16221b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16222c = 31;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16223d = 33;

    public static final int a(int i4, int i5) {
        return (i4 >> i5) & 31;
    }

    @fg.l
    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> b() {
        j.INSTANCE.getClass();
        return j.f16214h;
    }

    @fg.l
    public static final Object[] c(@m Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i4) {
        return (i4 - 1) & (-32);
    }
}
