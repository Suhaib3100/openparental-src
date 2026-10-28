package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ThreadMap.jvm.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/internal/v;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "a", "(J)I", "b", "(J)Ljava/lang/Object;", "value", "", "d", "(JLjava/lang/Object;)Z", "c", "(JLjava/lang/Object;)Landroidx/compose/runtime/internal/v;", "I", "[J", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16805d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final long[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] values;

    public v(int i4, @fg.l long[] jArr, @fg.l Object[] objArr) {
        this.size = i4;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int a(long key) {
        int i4 = this.size - 1;
        if (i4 == -1) {
            return -1;
        }
        int i5 = 0;
        if (i4 == 0) {
            long j4 = this.keys[0];
            if (j4 == key) {
                return 0;
            }
            return j4 > key ? -2 : -1;
        }
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j5 = this.keys[i6] - key;
            if (j5 < 0) {
                i5 = i6 + 1;
            } else {
                if (j5 <= 0) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    @fg.m
    public final Object b(long key) {
        int a5 = a(key);
        if (a5 >= 0) {
            return this.values[a5];
        }
        return null;
    }

    @fg.l
    public final v c(long key, @fg.m Object value) {
        int i4 = this.size;
        int i5 = 0;
        int i6 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i6++;
            }
        }
        int i7 = i6 + 1;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        if (i7 > 1) {
            int i10 = 0;
            while (true) {
                if (i5 >= i7 || i10 >= i4) {
                    break;
                }
                long j4 = this.keys[i10];
                Object obj2 = this.values[i10];
                if (j4 > key) {
                    jArr[i5] = key;
                    objArr[i5] = value;
                    i5++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i5] = j4;
                    objArr[i5] = obj2;
                    i5++;
                }
                i10++;
            }
            if (i10 == i4) {
                jArr[i6] = key;
                objArr[i6] = value;
            } else {
                while (i5 < i7) {
                    long j5 = this.keys[i10];
                    Object obj3 = this.values[i10];
                    if (obj3 != null) {
                        jArr[i5] = j5;
                        objArr[i5] = obj3;
                        i5++;
                    }
                    i10++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new v(i7, jArr, objArr);
    }

    public final boolean d(long key, @fg.m Object value) {
        int a5 = a(key);
        if (a5 < 0) {
            return false;
        }
        this.values[a5] = value;
        return true;
    }
}
