package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.n5;
import kotlin.Metadata;

/* compiled from: SnapshotWeakSet.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&0%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/h0;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "Lkotlin/k2;", "h", "(Lld/l;)V", "g", "()Z", "I", "e", "()I", "j", "(I)V", "size", "", "[I", "d", "()[I", "i", "([I)V", "hashes", "", "Landroidx/compose/runtime/n5;", "[Landroidx/compose/runtime/n5;", "f", "()[Landroidx/compose/runtime/n5;", "k", "([Landroidx/compose/runtime/n5;)V", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17089d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] hashes = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private n5<T>[] values = new n5[16];

    private final int b(T value, int hash) {
        int i4 = this.size - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = this.hashes[i6];
            if (i7 < hash) {
                i5 = i6 + 1;
            } else {
                if (i7 <= hash) {
                    n5<T> n5Var = this.values[i6];
                    return value == (n5Var != null ? n5Var.get() : null) ? i6 : c(i6, value, hash);
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.n5<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.n5<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.h0.c(int, java.lang.Object, int):int");
    }

    public final boolean a(@fg.l T value) {
        int i4;
        int i5 = this.size;
        int identityHashCode = System.identityHashCode(value);
        if (i5 > 0) {
            i4 = b(value, identityHashCode);
            if (i4 >= 0) {
                return false;
            }
        } else {
            i4 = -1;
        }
        int i6 = -(i4 + 1);
        n5<T>[] n5VarArr = this.values;
        int length = n5VarArr.length;
        if (i5 == length) {
            int i7 = length * 2;
            n5<T>[] n5VarArr2 = new n5[i7];
            int[] iArr = new int[i7];
            int i10 = i6 + 1;
            kotlin.collections.l.B0(n5VarArr, n5VarArr2, i10, i6, i5);
            kotlin.collections.l.K0(this.values, n5VarArr2, 0, 0, i6, 6, null);
            kotlin.collections.l.z0(this.hashes, iArr, i10, i6, i5);
            kotlin.collections.l.I0(this.hashes, iArr, 0, 0, i6, 6, null);
            this.values = n5VarArr2;
            this.hashes = iArr;
        } else {
            int i11 = i6 + 1;
            kotlin.collections.l.B0(n5VarArr, n5VarArr, i11, i6, i5);
            int[] iArr2 = this.hashes;
            kotlin.collections.l.z0(iArr2, iArr2, i11, i6, i5);
        }
        this.values[i6] = new n5<>(value);
        this.hashes[i6] = identityHashCode;
        this.size++;
        return true;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @fg.l
    public final n5<T>[] f() {
        return this.values;
    }

    @fg.p
    public final boolean g() {
        n5<T> n5Var;
        int i4 = this.size;
        n5<T>[] n5VarArr = this.values;
        int[] iArr = this.hashes;
        int length = n5VarArr.length;
        if (i4 > length) {
            return false;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = iArr[i6];
            if (i7 < i5 || (n5Var = n5VarArr[i6]) == null) {
                return false;
            }
            T t4 = n5Var.get();
            if (t4 != null && i7 != System.identityHashCode(t4)) {
                return false;
            }
            i6++;
            i5 = i7;
        }
        while (i4 < length) {
            if (iArr[i4] != 0 || n5VarArr[i4] != null) {
                return false;
            }
            i4++;
        }
        return true;
    }

    public final void h(@fg.l ld.l<? super T, Boolean> block) {
        int i4 = this.size;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            n5<T> n5Var = this.values[i5];
            T t4 = n5Var != null ? n5Var.get() : null;
            if (t4 != null && !block.invoke(t4).booleanValue()) {
                if (i6 != i5) {
                    this.values[i6] = n5Var;
                    int[] iArr = this.hashes;
                    iArr[i6] = iArr[i5];
                }
                i6++;
            }
            i5++;
        }
        for (int i7 = i6; i7 < i4; i7++) {
            this.values[i7] = null;
            this.hashes[i7] = 0;
        }
        if (i6 != i4) {
            this.size = i6;
        }
    }

    public final void i(@fg.l int[] iArr) {
        this.hashes = iArr;
    }

    public final void j(int i4) {
        this.size = i4;
    }

    public final void k(@fg.l n5<T>[] n5VarArr) {
        this.values = n5VarArr;
    }
}
