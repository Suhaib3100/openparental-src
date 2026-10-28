package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import ld.p;

/* compiled from: IdentityArrayIntMap.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0013H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0013H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0013H\u0086\b¢\u0006\u0004\b\u001b\u0010\u0017R$\u0010!\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R4\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R$\u0010+\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/b;", "", "<init>", "()V", "key", "", "d", "(Ljava/lang/Object;)I", "midIndex", "value", "valueHash", "e", "(ILjava/lang/Object;I)I", "g", "b", "(Ljava/lang/Object;I)I", "", "k", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "Lkotlin/k2;", "l", "(Lld/p;)V", "c", "(Lld/p;)Z", "block", "f", "<set-?>", "a", "I", "i", "()I", "size", "", "[Ljava/lang/Object;", "h", "()[Ljava/lang/Object;", "keys", "", "[I", "j", "()[I", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16095d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] keys = new Object[4];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private int[] values = new int[4];

    private final int d(Object key) {
        int i4 = this.size - 1;
        int identityHashCode = System.identityHashCode(key);
        Object[] objArr = this.keys;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            Object obj = objArr[i6];
            int identityHashCode2 = System.identityHashCode(obj);
            if (identityHashCode2 < identityHashCode) {
                i5 = i6 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    return obj == key ? i6 : e(i6, key, identityHashCode);
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    private final int e(int midIndex, Object value, int valueHash) {
        Object obj;
        Object[] objArr = this.keys;
        int i4 = this.size;
        for (int i5 = midIndex - 1; -1 < i5; i5--) {
            Object obj2 = objArr[i5];
            if (obj2 == value) {
                return i5;
            }
            if (System.identityHashCode(obj2) != valueHash) {
                break;
            }
        }
        do {
            midIndex++;
            if (midIndex >= i4) {
                return -(i4 + 1);
            }
            obj = objArr[midIndex];
            if (obj == value) {
                return midIndex;
            }
        } while (System.identityHashCode(obj) == valueHash);
        return -(midIndex + 1);
    }

    public final int b(@l Object key, int value) {
        int i4;
        int i5;
        int[] iArr = this.values;
        if (this.size > 0) {
            i4 = d(key);
            if (i4 >= 0) {
                int i6 = iArr[i4];
                iArr[i4] = value;
                return i6;
            }
        } else {
            i4 = -1;
        }
        int i7 = -(i4 + 1);
        Object[] objArr = this.keys;
        int i10 = this.size;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i11 = i7 + 1;
            kotlin.collections.l.B0(objArr, objArr2, i11, i7, i10);
            kotlin.collections.l.z0(iArr, iArr2, i11, i7, i10);
            i5 = i7;
            kotlin.collections.l.K0(objArr, objArr2, 0, 0, i5, 6, null);
            kotlin.collections.l.I0(iArr, iArr2, 0, 0, i7, 6, null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            i5 = i7;
            int i12 = i5 + 1;
            kotlin.collections.l.B0(objArr, objArr, i12, i5, i10);
            kotlin.collections.l.z0(iArr, iArr, i12, i5, i10);
        }
        this.keys[i5] = key;
        this.values[i5] = value;
        this.size++;
        return -1;
    }

    public final boolean c(@l p<Object, ? super Integer, Boolean> predicate) {
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            if (predicate.invoke(obj, Integer.valueOf(iArr[i5])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void f(@l p<Object, ? super Integer, k2> block) {
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, Integer.valueOf(iArr[i5]));
        }
    }

    public final int g(@l Object key) {
        int d5 = d(key);
        if (d5 >= 0) {
            return this.values[d5];
        }
        throw new IllegalStateException("Key not found");
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* renamed from: i, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final int[] getValues() {
        return this.values;
    }

    public final boolean k(@l Object key) {
        int d5 = d(key);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i4 = this.size;
        if (d5 < 0) {
            return false;
        }
        int i5 = i4 - 1;
        if (d5 < i5) {
            int i6 = d5 + 1;
            kotlin.collections.l.B0(objArr, objArr, d5, i6, i4);
            kotlin.collections.l.z0(iArr, iArr, d5, i6, i4);
        }
        objArr[i5] = null;
        this.size = i5;
        return true;
    }

    public final void l(@l p<Object, ? super Integer, Boolean> predicate) {
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i4 = this.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            int i7 = iArr[i6];
            if (!predicate.invoke(obj, Integer.valueOf(i7)).booleanValue()) {
                if (i5 != i6) {
                    objArr[i5] = obj;
                    iArr[i5] = i7;
                }
                i5++;
            }
        }
        for (int i10 = i5; i10 < i4; i10++) {
            objArr[i10] = null;
        }
        this.size = i5;
    }
}
