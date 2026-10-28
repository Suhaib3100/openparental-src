package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ObjectFloatMap.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001d¢\u0006\u0004\b#\u0010\"J%\u0010%\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001d¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\u00072\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020-00H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b4\u0010,J \u00107\u001a\u00020\u00072\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u000005H\u0086\n¢\u0006\u0004\b7\u00108J\u001e\u0010:\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0086\n¢\u0006\u0004\b:\u0010;J\u001e\u0010=\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\n¢\u0006\u0004\b=\u0010>J\u001e\u0010@\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\n¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\bB\u0010\u0006J\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010\fJ\r\u0010D\u001a\u00020\u0003¢\u0006\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, d2 = {"Landroidx/collection/f2;", "K", "Landroidx/collection/l2;", "", "initialCapacity", "<init>", "(I)V", "Lkotlin/k2;", "V", "capacity", "U", "T", "()V", "key", "R", "(Ljava/lang/Object;)I", "hash1", "Q", "(I)I", "O", "newCapacity", "k0", "h0", "index", "", "value", "n0", "(IJ)V", "Lkotlin/Function0;", "", "defaultValue", "S", "(Ljava/lang/Object;Lld/a;)F", "l0", "(Ljava/lang/Object;F)V", "d0", "default", "c0", "(Ljava/lang/Object;FF)F", "from", "e0", "(Landroidx/collection/l2;)V", "b0", "f0", "(Ljava/lang/Object;)V", "", "g0", "(Ljava/lang/Object;F)Z", "Lkotlin/Function2;", "predicate", "i0", "(Lld/p;)V", "Y", "", "keys", "a0", "([Ljava/lang/Object;)V", "", "X", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/m;", "Z", "(Lkotlin/sequences/m;)V", "Landroidx/collection/y2;", "W", "(Landroidx/collection/y2;)V", "j0", "P", "m0", "()I", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1074:1\n1064#1,2:1155\n1068#1,5:1163\n1064#1,2:1194\n1068#1,5:1202\n1064#1,2:1219\n1068#1,5:1227\n1064#1,2:1233\n1068#1,5:1241\n1#2:1075\n1672#3,6:1076\n1826#3:1092\n1688#3:1096\n1826#3:1114\n1688#3:1118\n1826#3:1139\n1688#3:1143\n1672#3,6:1157\n1672#3,6:1168\n1605#3,3:1174\n1615#3:1177\n1619#3:1178\n1795#3,3:1179\n1809#3,3:1182\n1733#3:1185\n1721#3:1186\n1715#3:1187\n1728#3:1188\n1818#3:1189\n1682#3:1190\n1661#3:1191\n1680#3:1192\n1661#3:1193\n1672#3,6:1196\n1795#3,3:1207\n1826#3:1210\n1715#3:1211\n1685#3:1212\n1661#3:1213\n1605#3,3:1214\n1615#3:1217\n1619#3:1218\n1672#3,6:1221\n1661#3:1232\n1672#3,6:1235\n1672#3,6:1246\n1672#3,6:1252\n401#4,4:1082\n373#4,6:1086\n383#4,3:1093\n386#4,2:1097\n406#4,2:1099\n389#4,6:1101\n408#4:1107\n373#4,6:1108\n383#4,3:1115\n386#4,9:1119\n267#5,4:1128\n237#5,7:1132\n248#5,3:1140\n251#5,2:1144\n272#5,2:1146\n254#5,6:1148\n274#5:1154\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n*L\n900#1:1155,2\n900#1:1163,5\n960#1:1194,2\n960#1:1202,5\n1034#1:1219,2\n1034#1:1227,5\n1050#1:1233,2\n1050#1:1241,5\n728#1:1076,6\n804#1:1092\n804#1:1096\n843#1:1114\n843#1:1118\n889#1:1139\n889#1:1143\n900#1:1157,6\n911#1:1168,6\n925#1:1174,3\n926#1:1177\n927#1:1178\n934#1:1179,3\n935#1:1182,3\n936#1:1185\n937#1:1186\n937#1:1187\n941#1:1188\n944#1:1189\n953#1:1190\n953#1:1191\n959#1:1192\n959#1:1193\n960#1:1196,6\n975#1:1207,3\n976#1:1210\n978#1:1211\n1029#1:1212\n1029#1:1213\n1031#1:1214,3\n1032#1:1217\n1034#1:1218\n1034#1:1221,6\n1048#1:1232\n1050#1:1235,6\n1065#1:1246,6\n1071#1:1252,6\n804#1:1082,4\n804#1:1086,6\n804#1:1093,3\n804#1:1097,2\n804#1:1099,2\n804#1:1101,6\n804#1:1107\n843#1:1108,6\n843#1:1115,3\n843#1:1119,9\n889#1:1128,4\n889#1:1132,7\n889#1:1140,3\n889#1:1144,2\n889#1:1146,2\n889#1:1148,6\n889#1:1154\n*E\n"})
/* loaded from: classes.dex */
public final class f2<K> extends l2<K> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public f2() {
        this(0, 1, null);
    }

    private final void O() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare((kotlin.a2.h(this._size) * 32) ^ Long.MIN_VALUE, (this._capacity * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                h0();
                return;
            }
        }
        k0(x2.w(this._capacity));
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

    private final int R(K key) {
        int hashCode = (key != null ? key.hashCode() : 0) * x2.f2466j;
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
            int i14 = i6;
            long j6 = j4 ^ (j5 * x2.f2467k);
            for (long j7 = (~j6) & (j6 - x2.f2467k) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                if (kotlin.jvm.internal.l0.g(this.keys[numberOfTrailingZeros], key)) {
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
            i11 += 8;
            i10 = (i10 + i11) & i7;
            i6 = i14;
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
        this.keys = new Object[max];
        this.values = new float[max];
    }

    private final void h0() {
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

    private final void k0(int newCapacity) {
        int i4;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i5 = this._capacity;
        V(newCapacity);
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
        int i6 = 0;
        while (i6 < i5) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * x2.f2466j;
                int i7 = hashCode ^ (hashCode << 16);
                int Q = Q(i7 >>> 7);
                long j4 = i7 & 127;
                long[] jArr2 = this.metadata;
                int i10 = Q >> 3;
                int i11 = (Q & 7) << 3;
                i4 = i6;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j4 << i11);
                int i12 = this._capacity;
                int i13 = ((Q - 7) & i12) + (i12 & 7);
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j4 << i15);
                objArr2[Q] = obj;
                fArr2[Q] = fArr[i4];
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }

    private final void n0(int index, long value) {
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
        kotlin.collections.l.M1(this.keys, null, 0, this._capacity);
        T();
    }

    public final float S(K key, @fg.l ld.a<Float> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        int i4 = i(key);
        if (i4 >= 0) {
            return this.values[i4];
        }
        float floatValue = defaultValue.invoke().floatValue();
        l0(key, floatValue);
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(@fg.l y2<K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Object[] objArr = keys.elements;
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
                        f0(objArr[(i4 << 3) + i6]);
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

    public final void X(@fg.l Iterable<? extends K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            f0(it.next());
        }
    }

    public final void Y(K key) {
        f0(key);
    }

    public final void Z(@fg.l kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            f0(it.next());
        }
    }

    public final void a0(@fg.l K[] keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        for (K k4 : keys) {
            f0(k4);
        }
    }

    public final void b0(@fg.l l2<K> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        e0(from);
    }

    public final float c0(K key, float value, float r5) {
        int R = R(key);
        if (R < 0) {
            R = ~R;
        } else {
            r5 = this.values[R];
        }
        this.keys[R] = key;
        this.values[R] = value;
        return r5;
    }

    public final void d0(K key, float value) {
        l0(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(@fg.l l2<K> from) {
        kotlin.jvm.internal.l0.p(from, "from");
        Object[] objArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.metadata;
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
                        l0(objArr[i7], fArr[i7]);
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

    public final void f0(K key) {
        int i4 = i(key);
        if (i4 >= 0) {
            j0(i4);
        }
    }

    public final boolean g0(K key, float value) {
        int i4 = i(key);
        if (i4 < 0 || this.values[i4] != value) {
            return false;
        }
        j0(i4);
        return true;
    }

    public final void i0(@fg.l ld.p<? super K, ? super Float, Boolean> predicate) {
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
                        if (predicate.invoke(this.keys[i7], Float.valueOf(this.values[i7])).booleanValue()) {
                            j0(i7);
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
    public final void j0(int index) {
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
        this.keys[index] = null;
    }

    public final void l0(K key, float value) {
        int R = R(key);
        if (R < 0) {
            R = ~R;
        }
        this.keys[R] = key;
        this.values[R] = value;
    }

    public final int m0() {
        int i4 = this._capacity;
        int x4 = x2.x(x2.z(this._size));
        if (x4 >= i4) {
            return 0;
        }
        k0(x4);
        return i4 - this._capacity;
    }

    public /* synthetic */ f2(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 6 : i4);
    }

    public f2(int i4) {
        super(null);
        if (i4 >= 0) {
            V(x2.z(i4));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
