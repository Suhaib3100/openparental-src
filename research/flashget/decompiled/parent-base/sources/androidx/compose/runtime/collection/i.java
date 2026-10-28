package androidx.compose.runtime.collection;

import androidx.collection.j2;
import androidx.collection.k2;
import androidx.collection.x2;
import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ScopeMap.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00072#\b\u0004\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u000eH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/collection/i;", "", "T", "<init>", "()V", "key", "scope", "Lkotlin/k2;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V", "element", "", "c", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "block", "d", "(Ljava/lang/Object;Lld/l;)V", "b", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "i", "(Lld/l;)V", "h", "(Ljava/lang/Object;)V", "Landroidx/collection/j2;", "Landroidx/collection/j2;", "e", "()Landroidx/collection/j2;", "map", "", "f", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,148:1\n124#1:246\n125#1,5:262\n130#1,5:296\n138#1:311\n874#2,18:149\n1047#2:194\n1049#2:208\n1050#2,3:236\n1053#2:245\n1047#2:247\n1049#2:261\n1050#2,3:301\n1053#2:310\n267#3,4:167\n237#3,7:171\n248#3,3:179\n251#3,2:183\n272#3,2:185\n254#3,6:187\n274#3:193\n237#3,7:211\n248#3,3:219\n251#3,2:223\n254#3,6:229\n237#3,16:269\n254#3,6:289\n1810#4:178\n1672#4:182\n1810#4:201\n1672#4:205\n1810#4:218\n1672#4:222\n1810#4:254\n1672#4:258\n363#5,6:195\n373#5,3:202\n376#5,2:206\n379#5,6:239\n363#5,6:248\n373#5,3:255\n376#5,2:259\n379#5,6:304\n842#6,2:209\n845#6,4:225\n849#6:235\n842#6,2:267\n845#6,4:285\n849#6:295\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n145#1:246\n145#1:262,5\n145#1:296,5\n145#1:311\n37#1:149,18\n124#1:194\n124#1:208\n124#1:236,3\n124#1:245\n145#1:247\n145#1:261\n145#1:301,3\n145#1:310\n74#1:167,4\n74#1:171,7\n74#1:179,3\n74#1:183,2\n74#1:185,2\n74#1:187,6\n74#1:193\n129#1:211,7\n129#1:219,3\n129#1:223,2\n129#1:229,6\n145#1:269,16\n145#1:289,6\n74#1:178\n74#1:182\n124#1:201\n124#1:205\n129#1:218\n129#1:222\n145#1:254\n145#1:258\n124#1:195,6\n124#1:202,3\n124#1:206,2\n124#1:239,6\n145#1:248,6\n145#1:255,3\n145#1:259,2\n145#1:304,6\n129#1:209,2\n129#1:225,4\n129#1:235\n145#1:267,2\n145#1:285,4\n145#1:295\n*E\n"})
/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16142b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final j2<Object, Object> map = x2.t();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.k2] */
    public final void a(@l Object key, @l T scope) {
        j2<Object, Object> j2Var = this.map;
        int N = j2Var.N(key);
        boolean z4 = N < 0;
        T t4 = z4 ? null : j2Var.values[N];
        if (t4 != null) {
            if (t4 instanceof k2) {
                l0.n(t4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((k2) t4).C(scope);
            } else if (t4 != scope) {
                ?? k2Var = new k2(0, 1, null);
                l0.n(t4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                k2Var.C(t4);
                k2Var.C(scope);
                scope = k2Var;
            }
            scope = t4;
        }
        if (!z4) {
            j2Var.values[N] = scope;
            return;
        }
        int i4 = ~N;
        j2Var.keys[i4] = key;
        j2Var.values[i4] = scope;
    }

    public final void b() {
        this.map.K();
    }

    public final boolean c(@l Object element) {
        return this.map.g(element);
    }

    public final void d(@l Object key, @l ld.l<? super T, kotlin.k2> block) {
        Object p4 = this.map.p(key);
        if (p4 == null) {
            return;
        }
        if (!(p4 instanceof k2)) {
            block.invoke(p4);
            return;
        }
        k2 k2Var = (k2) p4;
        Object[] objArr = k2Var.elements;
        long[] jArr = k2Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        block.invoke(objArr[(i4 << 3) + i6]);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    @l
    public final j2<Object, Object> e() {
        return this.map;
    }

    public final int f() {
        return this.map._size;
    }

    public final boolean g(@l Object key, @l T scope) {
        Object p4 = this.map.p(key);
        if (p4 == null) {
            return false;
        }
        if (!(p4 instanceof k2)) {
            if (!l0.g(p4, scope)) {
                return false;
            }
            this.map.k0(key);
            return true;
        }
        k2 k2Var = (k2) p4;
        boolean c02 = k2Var.c0(scope);
        if (c02 && k2Var.r()) {
            this.map.k0(key);
        }
        return c02;
    }

    public final void h(@l T scope) {
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        long j4;
        long j5;
        int i7;
        boolean z4;
        j2<Object, Object> j2Var = this.map;
        long[] jArr3 = j2Var.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr3[i10];
            long j7 = -9187201950435737472L;
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j6 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = j2Var.keys[i14];
                        Object obj2 = j2Var.values[i14];
                        if (obj2 instanceof k2) {
                            l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            k2 k2Var = (k2) obj2;
                            Object[] objArr = k2Var.elements;
                            long[] jArr4 = k2Var.metadata;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i5 = length;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j10 = jArr4[i15];
                                    i6 = i10;
                                    j4 = j6;
                                    j5 = -9187201950435737472L;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j10 & 255) < 128) {
                                                int i18 = (i15 << 3) + i17;
                                                if (objArr[i18] == scope) {
                                                    k2Var.j0(i18);
                                                }
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                    i10 = i6;
                                    j6 = j4;
                                }
                            } else {
                                i6 = i10;
                                j4 = j6;
                                j5 = -9187201950435737472L;
                            }
                            z4 = k2Var.r();
                        } else {
                            jArr2 = jArr3;
                            i5 = length;
                            i6 = i10;
                            j4 = j6;
                            j5 = j7;
                            l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            z4 = obj2 == scope;
                        }
                        if (z4) {
                            j2Var.o0(i14);
                        }
                        i7 = 8;
                    } else {
                        jArr2 = jArr3;
                        i5 = length;
                        i6 = i10;
                        j4 = j6;
                        j5 = j7;
                        i7 = i11;
                    }
                    j6 = j4 >> i7;
                    i13++;
                    i11 = i7;
                    j7 = j5;
                    jArr3 = jArr2;
                    length = i5;
                    i10 = i6;
                }
                jArr = jArr3;
                int i19 = length;
                int i20 = i10;
                if (i12 != i11) {
                    return;
                }
                length = i19;
                i4 = i20;
            } else {
                jArr = jArr3;
                i4 = i10;
            }
            if (i4 == length) {
                return;
            }
            i10 = i4 + 1;
            jArr3 = jArr;
        }
    }

    public final void i(@l ld.l<? super T, Boolean> predicate) {
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        long j4;
        long j5;
        int i7;
        boolean booleanValue;
        j2<Object, Object> j2Var = this.map;
        long[] jArr3 = j2Var.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr3[i10];
            long j7 = -9187201950435737472L;
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j6 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = j2Var.keys[i14];
                        Object obj2 = j2Var.values[i14];
                        if (obj2 instanceof k2) {
                            l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            k2 k2Var = (k2) obj2;
                            Object[] objArr = k2Var.elements;
                            long[] jArr4 = k2Var.metadata;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i5 = length;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j10 = jArr4[i15];
                                    i6 = i10;
                                    j4 = j6;
                                    j5 = -9187201950435737472L;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j10 & 255) < 128) {
                                                int i18 = (i15 << 3) + i17;
                                                if (predicate.invoke(objArr[i18]).booleanValue()) {
                                                    k2Var.j0(i18);
                                                }
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                    i10 = i6;
                                    j6 = j4;
                                }
                            } else {
                                i6 = i10;
                                j4 = j6;
                                j5 = -9187201950435737472L;
                            }
                            booleanValue = k2Var.r();
                        } else {
                            jArr2 = jArr3;
                            i5 = length;
                            i6 = i10;
                            j4 = j6;
                            j5 = j7;
                            l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            booleanValue = predicate.invoke(obj2).booleanValue();
                        }
                        if (booleanValue) {
                            j2Var.o0(i14);
                        }
                        i7 = 8;
                    } else {
                        jArr2 = jArr3;
                        i5 = length;
                        i6 = i10;
                        j4 = j6;
                        j5 = j7;
                        i7 = i11;
                    }
                    j6 = j4 >> i7;
                    i13++;
                    i11 = i7;
                    j7 = j5;
                    jArr3 = jArr2;
                    length = i5;
                    i10 = i6;
                }
                jArr = jArr3;
                int i19 = length;
                int i20 = i10;
                if (i12 != i11) {
                    return;
                }
                length = i19;
                i4 = i20;
            } else {
                jArr = jArr3;
                i4 = i10;
            }
            if (i4 == length) {
                return;
            }
            i10 = i4 + 1;
            jArr3 = jArr;
        }
    }
}
