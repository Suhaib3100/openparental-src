package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatLongMap.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010!J%\u0010$\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b)\u0010(J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020,2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\u00062\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b3\u0010+J\u0018\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u000204H\u0086\n¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u00020\u00062\u0006\u00105\u001a\u000208H\u0086\n¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\u00062\u0006\u00105\u001a\u00020;H\u0086\n¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b>\u0010\u0005J\r\u0010?\u001a\u00020\u0006¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006E"}, d2 = {"Landroidx/collection/p1;", "Landroidx/collection/v;", "", "initialCapacity", "<init>", "(I)V", "Lkotlin/k2;", "V", "capacity", "U", "T", "()V", "", "key", "R", "(F)I", "hash1", "Q", "(I)I", "O", "newCapacity", "j0", "g0", "index", "", "value", "m0", "(IJ)V", "Lkotlin/Function0;", "defaultValue", "S", "(FLld/a;)J", "k0", "(FJ)V", "c0", "default", "b0", "(FJJ)J", "from", "d0", "(Landroidx/collection/v;)V", "a0", "e0", "(F)V", "", "f0", "(FJ)Z", "Lkotlin/Function2;", "predicate", "h0", "(Lld/p;)V", "W", "", "keys", "Z", "([F)V", "Landroidx/collection/z;", "Y", "(Landroidx/collection/z;)V", "Landroidx/collection/t;", "X", "(Landroidx/collection/t;)V", "i0", "P", "l0", "()I", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
/* loaded from: classes.dex */
public final class p1 extends v {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public p1() {
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

    private final int R(float key) {
        int hashCode = Float.hashCode(key) * x2.f2466j;
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
        this.keys = new float[max];
        this.values = new long[max];
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
        float[] fArr;
        long[] jArr2 = this.metadata;
        float[] fArr2 = this.keys;
        long[] jArr3 = this.values;
        int i4 = this._capacity;
        V(newCapacity);
        float[] fArr3 = this.keys;
        long[] jArr4 = this.values;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                float f4 = fArr2[i5];
                int hashCode = Float.hashCode(f4) * x2.f2466j;
                int i6 = hashCode ^ (hashCode << 16);
                int Q = Q(i6 >>> 7);
                long j4 = i6 & 127;
                long[] jArr5 = this.metadata;
                int i7 = Q >> 3;
                int i10 = (Q & 7) << 3;
                jArr = jArr2;
                fArr = fArr2;
                jArr5[i7] = (jArr5[i7] & (~(255 << i10))) | (j4 << i10);
                int i11 = this._capacity;
                int i12 = ((Q - 7) & i11) + (i11 & 7);
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                jArr5[i13] = ((~(255 << i14)) & jArr5[i13]) | (j4 << i14);
                fArr3[Q] = f4;
                jArr4[Q] = jArr3[i5];
            } else {
                jArr = jArr2;
                fArr = fArr2;
            }
            i5++;
            jArr2 = jArr;
            fArr2 = fArr;
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

    public final long S(float key, @fg.l ld.a<Long> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        int i4 = i(key);
        if (i4 >= 0) {
            return this.values[i4];
        }
        long longValue = defaultValue.invoke().longValue();
        k0(key, longValue);
        return longValue;
    }

    public final void W(float key) {
        e0(key);
    }

    public final void X(@fg.l t keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        float[] fArr = keys.content;
        int i4 = keys._size;
        for (int i5 = 0; i5 < i4; i5++) {
            e0(fArr[i5]);
        }
    }

    public final void Y(@fg.l z keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        float[] fArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        e0(fArr[(i4 << 3) + i6]);
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

    public final void Z(@fg.l float[] keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        for (float f4 : keys) {
            e0(f4);
        }
    }

    public final void a0(@fg.l v from) {
        kotlin.jvm.internal.l0.p(from, "from");
        d0(from);
    }

    public final long b0(float key, long value, long r7) {
        int R = R(key);
        if (R < 0) {
            R = ~R;
        } else {
            r7 = this.values[R];
        }
        this.keys[R] = key;
        this.values[R] = value;
        return r7;
    }

    public final void c0(float key, long value) {
        k0(key, value);
    }

    public final void d0(@fg.l v from) {
        kotlin.jvm.internal.l0.p(from, "from");
        float[] fArr = from.keys;
        long[] jArr = from.values;
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
                        k0(fArr[i7], jArr[i7]);
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

    public final void e0(float key) {
        int i4 = i(key);
        if (i4 >= 0) {
            i0(i4);
        }
    }

    public final boolean f0(float key, long value) {
        int i4 = i(key);
        if (i4 < 0 || this.values[i4] != value) {
            return false;
        }
        i0(i4);
        return true;
    }

    public final void h0(@fg.l ld.p<? super Float, ? super Long, Boolean> predicate) {
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
                        if (predicate.invoke(Float.valueOf(this.keys[i7]), Long.valueOf(this.values[i7])).booleanValue()) {
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

    public final void k0(float key, long value) {
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

    public /* synthetic */ p1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 6 : i4);
    }

    public p1(int i4) {
        super(null);
        if (i4 >= 0) {
            V(x2.z(i4));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
