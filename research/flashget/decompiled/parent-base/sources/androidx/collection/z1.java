package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongIntMap.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b!\u0010 J%\u0010#\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J-\u00100\u001a\u00020\u00062\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0.H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b2\u0010*J\u0018\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0086\n¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020\u00062\u0006\u00104\u001a\u000207H\u0086\n¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020\u00062\u0006\u00104\u001a\u00020:H\u0086\n¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b=\u0010\u0005J\r\u0010>\u001a\u00020\u0006¢\u0006\u0004\b>\u0010\u000bJ\r\u0010?\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006D"}, d2 = {"Landroidx/collection/z1;", "Landroidx/collection/s0;", "", "initialCapacity", "<init>", "(I)V", "Lkotlin/k2;", "V", "capacity", "U", "T", "()V", "", "key", "R", "(J)I", "hash1", "Q", "(I)I", "O", "newCapacity", "j0", "g0", "index", "value", "m0", "(IJ)V", "Lkotlin/Function0;", "defaultValue", "S", "(JLld/a;)I", "k0", "(JI)V", "c0", "default", "b0", "(JII)I", "from", "d0", "(Landroidx/collection/s0;)V", "a0", "e0", "(J)V", "", "f0", "(JI)Z", "Lkotlin/Function2;", "predicate", "h0", "(Lld/p;)V", "W", "", "keys", "Z", "([J)V", "Landroidx/collection/c1;", "Y", "(Landroidx/collection/c1;)V", "Landroidx/collection/u0;", "X", "(Landroidx/collection/u0;)V", "i0", "P", "l0", "()I", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongIntMap.kt\nandroidx/collection/LongIntMap\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongList.kt\nandroidx/collection/LongList\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
/* loaded from: classes.dex */
public final class z1 extends s0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public z1() {
        this(0, 1, null);
    }

    private final void O() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare((kotlin.a2.h(this._size) * 32) ^ Long.MIN_VALUE, (this._capacity * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                g0();
                return;
            }
        }
        j0(x2.w(this._capacity));
    }

    private final int Q(int hash1) {
        int i4 = this._capacity;
        int i5 = hash1 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i10 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i7] >>> i10);
            long j5 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final int R(long key) {
        int hashCode = Long.hashCode(key) * x2.f2466j;
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this._capacity;
        int i10 = i5 & i7;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j4 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j5 = i6;
            int i14 = i11;
            long j6 = j4 ^ (j5 * x2.f2467k);
            for (long j7 = (~j6) & (j6 - x2.f2467k) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i7;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int Q = Q(i5);
                if (this.growthLimit == 0 && ((this.metadata[Q >> 3] >> ((Q & 7) << 3)) & 255) != 254) {
                    O();
                    Q = Q(i5);
                }
                this._size++;
                int i15 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i16 = Q >> 3;
                long j10 = jArr2[i16];
                int i17 = (Q & 7) << 3;
                this.growthLimit = i15 - (((j10 >> i17) & 255) == 128 ? 1 : 0);
                jArr2[i16] = (j10 & (~(255 << i17))) | (j5 << i17);
                int i18 = this._capacity;
                int i19 = ((Q - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j5 << i21);
                return ~Q;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i7;
        }
    }

    private final void T() {
        this.growthLimit = x2.o(this._capacity) - this._size;
    }

    private final void U(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = x2.f2461e;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            kotlin.collections.l.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i4 = capacity >> 3;
        long j4 = 255 << ((capacity & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        T();
    }

    private final void V(int initialCapacity) {
        int max = initialCapacity > 0 ? Math.max(7, x2.x(initialCapacity)) : 0;
        this._capacity = max;
        U(max);
        this.keys = new long[max];
        this.values = new int[max];
    }

    private final void g0() {
        long[] jArr = this.metadata;
        int i4 = this._capacity;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 >> 3;
            int i10 = (i6 & 7) << 3;
            if (((jArr[i7] >> i10) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i7] = (128 << i10) | (jArr2[i7] & (~(255 << i10)));
                int i11 = this._capacity;
                int i12 = ((i6 - 7) & i11) + (i11 & 7);
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                jArr2[i13] = ((~(255 << i14)) & jArr2[i13]) | (128 << i14);
                i5++;
            }
        }
        this.growthLimit += i5;
    }

    private final void j0(int newCapacity) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.keys;
        int[] iArr = this.values;
        int i4 = this._capacity;
        V(newCapacity);
        long[] jArr5 = this.keys;
        int[] iArr2 = this.values;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr3[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j4 = jArr4[i5];
                int hashCode = Long.hashCode(j4) * x2.f2466j;
                int i6 = hashCode ^ (hashCode << 16);
                int Q = Q(i6 >>> 7);
                long j5 = i6 & 127;
                long[] jArr6 = this.metadata;
                int i7 = Q >> 3;
                int i10 = (Q & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i7] = (jArr6[i7] & (~(255 << i10))) | (j5 << i10);
                int i11 = this._capacity;
                int i12 = ((Q - 7) & i11) + (i11 & 7);
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                jArr6[i13] = (jArr6[i13] & (~(255 << i14))) | (j5 << i14);
                jArr5[Q] = j4;
                iArr2[Q] = iArr[i5];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i5++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    private final void m0(int index, long value) {
        long[] jArr = this.metadata;
        int i4 = index >> 3;
        int i5 = (index & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (value << i5);
        int i6 = this._capacity;
        int i7 = ((index - 7) & i6) + (i6 & 7);
        int i10 = i7 >> 3;
        int i11 = (i7 & 7) << 3;
        jArr[i10] = (value << i11) | (jArr[i10] & (~(255 << i11)));
    }

    public final void P() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != x2.f2461e) {
            kotlin.collections.l.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i4 = this._capacity;
            int i5 = i4 >> 3;
            long j4 = 255 << ((i4 & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j4)) | j4;
        }
        T();
    }

    public final int S(long key, @fg.l ld.a<Integer> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        int i4 = i(key);
        if (i4 >= 0) {
            return this.values[i4];
        }
        int intValue = defaultValue.invoke().intValue();
        k0(key, intValue);
        return intValue;
    }

    public final void W(long key) {
        e0(key);
    }

    public final void X(@fg.l u0 keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        long[] jArr = keys.content;
        int i4 = keys._size;
        for (int i5 = 0; i5 < i4; i5++) {
            e0(jArr[i5]);
        }
    }

    public final void Y(@fg.l c1 keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr2[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        e0(jArr[(i4 << 3) + i6]);
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

    public final void Z(@fg.l long[] keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        for (long j4 : keys) {
            e0(j4);
        }
    }

    public final void a0(@fg.l s0 from) {
        kotlin.jvm.internal.l0.p(from, "from");
        d0(from);
    }

    public final int b0(long key, int value, int r6) {
        int R = R(key);
        if (R < 0) {
            R = ~R;
        } else {
            r6 = this.values[R];
        }
        this.keys[R] = key;
        this.values[R] = value;
        return r6;
    }

    public final void c0(long key, int value) {
        k0(key, value);
    }

    public final void d0(@fg.l s0 from) {
        kotlin.jvm.internal.l0.p(from, "from");
        long[] jArr = from.keys;
        int[] iArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr2[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i4 << 3) + i6;
                        k0(jArr[i7], iArr[i7]);
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

    public final void e0(long key) {
        int i4 = i(key);
        if (i4 >= 0) {
            i0(i4);
        }
    }

    public final boolean f0(long key, int value) {
        int i4 = i(key);
        if (i4 < 0 || this.values[i4] != value) {
            return false;
        }
        i0(i4);
        return true;
    }

    public final void h0(@fg.l ld.p<? super Long, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        long[] jArr = this.metadata;
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
                        int i7 = (i4 << 3) + i6;
                        if (predicate.invoke(Long.valueOf(this.keys[i7]), Integer.valueOf(this.values[i7])).booleanValue()) {
                            i0(i7);
                        }
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

    @kotlin.w0
    public final void i0(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i4 = index >> 3;
        int i5 = (index & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        int i6 = this._capacity;
        int i7 = ((index - 7) & i6) + (i6 & 7);
        int i10 = i7 >> 3;
        int i11 = (i7 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
    }

    public final void k0(long key, int value) {
        int R = R(key);
        if (R < 0) {
            R = ~R;
        }
        this.keys[R] = key;
        this.values[R] = value;
    }

    public final int l0() {
        int i4 = this._capacity;
        int x4 = x2.x(x2.z(this._size));
        if (x4 >= i4) {
            return 0;
        }
        j0(x4);
        return i4 - this._capacity;
    }

    public /* synthetic */ z1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 6 : i4);
    }

    public z1(int i4) {
        super(null);
        if (i4 >= 0) {
            V(x2.z(i4));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
