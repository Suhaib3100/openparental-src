package kotlin.collections.builders;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.IntIterator;
import kotlin.collections.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.IntRange;
import r3.g;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0080\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0000¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00108J\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020<H\u0016J\b\u0010?\u001a\u00020<H\u0002J\u0019\u0010@\u001a\u00020!2\n\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0000¢\u0006\u0002\bCJ!\u0010D\u001a\u00020!2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020!2\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010IJ\u0015\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010IJ\u0018\u0010L\u001a\u00020!2\u000e\u0010M\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030:H\u0002J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020\bH\u0002J\u0010\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020\bH\u0002J\u0019\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0000¢\u0006\u0002\bTJ\u0013\u0010U\u001a\u00020!2\b\u0010M\u001a\u0004\u0018\u00010VH\u0096\u0002J\u0015\u0010W\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00106J\u0015\u0010X\u001a\u00020\b2\u0006\u0010K\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00106J\u0018\u0010Y\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010ZJ\u0015\u0010[\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00106J\b\u0010\\\u001a\u00020\bH\u0016J\b\u0010]\u001a\u00020!H\u0016J\u0019\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_H\u0000¢\u0006\u0002\b`J\u001f\u0010a\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u00002\u0006\u0010K\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010bJ\u001e\u0010c\u001a\u00020<2\u0014\u0010d\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:H\u0016J\"\u0010e\u001a\u00020!2\u0018\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F0BH\u0002J\u001c\u0010f\u001a\u00020!2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0002J\u0010\u0010g\u001a\u00020!2\u0006\u0010h\u001a\u00020\bH\u0002J\b\u0010i\u001a\u00020<H\u0002J\u0010\u0010j\u001a\u00020<2\u0006\u0010k\u001a\u00020\bH\u0002J\u0017\u0010l\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010ZJ!\u0010m\u001a\u00020!2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020<2\u0006\u0010p\u001a\u00020\bH\u0002J\u0017\u0010q\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0000¢\u0006\u0004\br\u00106J\u0010\u0010s\u001a\u00020<2\u0006\u0010t\u001a\u00020\bH\u0002J\u0017\u0010u\u001a\u00020!2\u0006\u0010v\u001a\u00028\u0001H\u0000¢\u0006\u0004\bw\u0010IJ\u0010\u0010x\u001a\u00020!2\u0006\u0010y\u001a\u00020\bH\u0002J\b\u0010z\u001a\u00020{H\u0016J\u0019\u0010|\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010}H\u0000¢\u0006\u0002\b~J\b\u0010\u007f\u001a\u00020VH\u0002R\u0014\u0010\u0013\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00101\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0086\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity$kotlin_stdlib", "()I", "entries", "", "", "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "modCount", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", "key", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", "", "checkIsMutable", "", "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", "", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "registerModification", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", "index", "removeValue", "element", "removeValue$kotlin_stdlib", "shouldCompact", "extraCapacity", "toString", "", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
/* renamed from: kotlin.collections.builders.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, r3.g {

    @d5.d
    public static final a B = new a(null);
    private static final int C = -1640531527;
    private static final int D = 8;
    private static final int E = 2;
    private static final int F = -1;

    @d5.d
    private static final MapBuilder G;
    private boolean A;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private K[] f23093o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private V[] f23094p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private int[] f23095q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private int[] f23096r;

    /* renamed from: s, reason: collision with root package name */
    private int f23097s;

    /* renamed from: t, reason: collision with root package name */
    private int f23098t;

    /* renamed from: u, reason: collision with root package name */
    private int f23099u;

    /* renamed from: v, reason: collision with root package name */
    private int f23100v;

    /* renamed from: w, reason: collision with root package name */
    private int f23101w;

    /* renamed from: x, reason: collision with root package name */
    @d5.e
    private MapBuilderKeys<K> f23102x;

    /* renamed from: y, reason: collision with root package name */
    @d5.e
    private MapBuilderValues<V> f23103y;

    /* renamed from: z, reason: collision with root package name */
    @d5.e
    private MapBuilderEntries<K, V> f23104z;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "INITIAL_CAPACITY", "", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i5) {
            if (i5 < 1) {
                i5 = 1;
            }
            return Integer.highestOneBit(i5 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i5) {
            return Integer.numberOfLeadingZeros(i5) + 1;
        }

        @d5.d
        public final MapBuilder e() {
            return MapBuilder.G;
        }

        public a(w wVar) {
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$b */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, r3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l0.p(mapBuilder, ProtectedSandApp.s("殛"));
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (getF23108p() >= ((MapBuilder) g()).f23098t) {
                throw new NoSuchElementException();
            }
            int f23108p = getF23108p();
            j(f23108p + 1);
            k(f23108p);
            c<K, V> cVar = new c<>(g(), getF23109q());
            h();
            return cVar;
        }

        public final void m(@d5.d StringBuilder sb) {
            l0.p(sb, ProtectedSandApp.s("殜"));
            if (getF23108p() >= ((MapBuilder) g()).f23098t) {
                throw new NoSuchElementException();
            }
            int f23108p = getF23108p();
            j(f23108p + 1);
            k(f23108p);
            Object obj = ((MapBuilder) g()).f23093o[getF23109q()];
            MapBuilder<K, V> g5 = g();
            String s5 = ProtectedSandApp.s("殝");
            if (obj == g5) {
                sb.append(s5);
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) g()).f23094p;
            l0.m(objArr);
            Object obj2 = objArr[getF23109q()];
            if (obj2 == g()) {
                sb.append(s5);
            } else {
                sb.append(obj2);
            }
            h();
        }

        public final int n() {
            if (getF23108p() >= ((MapBuilder) g()).f23098t) {
                throw new NoSuchElementException();
            }
            int f23108p = getF23108p();
            j(f23108p + 1);
            k(f23108p);
            Object obj = ((MapBuilder) g()).f23093o[getF23109q()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) g()).f23094p;
            l0.m(objArr);
            Object obj2 = objArr[getF23109q()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            h();
            return hashCode2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "(Lkotlin/collections/builders/MapBuilder;I)V", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", "", "other", "", "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$c */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final MapBuilder<K, V> f23105o;

        /* renamed from: p, reason: collision with root package name */
        private final int f23106p;

        public c(@d5.d MapBuilder<K, V> mapBuilder, int i5) {
            l0.p(mapBuilder, ProtectedSandApp.s("殞"));
            this.f23105o = mapBuilder;
            this.f23106p = i5;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@d5.e Object other) {
            if (other instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) other;
                if (l0.g(entry.getKey(), getKey()) && l0.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.f23105o).f23093o[this.f23106p];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.f23105o).f23094p;
            l0.m(objArr);
            return (V) objArr[this.f23106p];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            this.f23105o.r();
            Object[] p5 = this.f23105o.p();
            int i5 = this.f23106p;
            V v5 = (V) p5[i5];
            p5[i5] = newValue;
            return v5;
        }

        @d5.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\r\u0010\u0018\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "expectedModCount", "", "index", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "checkForComodification", "", "checkForComodification$kotlin_stdlib", "hasNext", "", "initNext", "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    /* renamed from: kotlin.collections.builders.d$d */
    /* loaded from: classes5.dex */
    public static class d<K, V> {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final MapBuilder<K, V> f23107o;

        /* renamed from: p, reason: collision with root package name */
        private int f23108p;

        /* renamed from: q, reason: collision with root package name */
        private int f23109q;

        /* renamed from: r, reason: collision with root package name */
        private int f23110r;

        public d(@d5.d MapBuilder<K, V> mapBuilder) {
            l0.p(mapBuilder, ProtectedSandApp.s("㝿"));
            this.f23107o = mapBuilder;
            this.f23109q = -1;
            this.f23110r = ((MapBuilder) mapBuilder).f23100v;
            h();
        }

        public final void a() {
            if (((MapBuilder) this.f23107o).f23100v != this.f23110r) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: d, reason: from getter */
        public final int getF23108p() {
            return this.f23108p;
        }

        /* renamed from: f, reason: from getter */
        public final int getF23109q() {
            return this.f23109q;
        }

        @d5.d
        public final MapBuilder<K, V> g() {
            return this.f23107o;
        }

        public final void h() {
            while (this.f23108p < ((MapBuilder) this.f23107o).f23098t) {
                int[] iArr = ((MapBuilder) this.f23107o).f23095q;
                int i5 = this.f23108p;
                if (iArr[i5] >= 0) {
                    return;
                } else {
                    this.f23108p = i5 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f23108p < ((MapBuilder) this.f23107o).f23098t;
        }

        public final void j(int i5) {
            this.f23108p = i5;
        }

        public final void k(int i5) {
            this.f23109q = i5;
        }

        public final void remove() {
            a();
            if (!(this.f23109q != -1)) {
                throw new IllegalStateException(ProtectedSandApp.s("㞀").toString());
            }
            this.f23107o.r();
            this.f23107o.S(this.f23109q);
            this.f23109q = -1;
            this.f23110r = ((MapBuilder) this.f23107o).f23100v;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$e */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, r3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@d5.d MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l0.p(mapBuilder, ProtectedSandApp.s("殟"));
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (getF23108p() >= ((MapBuilder) g()).f23098t) {
                throw new NoSuchElementException();
            }
            int f23108p = getF23108p();
            j(f23108p + 1);
            k(f23108p);
            K k5 = (K) ((MapBuilder) g()).f23093o[getF23109q()];
            h();
            return k5;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$f */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, r3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@d5.d MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l0.p(mapBuilder, ProtectedSandApp.s("殠"));
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (getF23108p() >= ((MapBuilder) g()).f23098t) {
                throw new NoSuchElementException();
            }
            int f23108p = getF23108p();
            j(f23108p + 1);
            k(f23108p);
            Object[] objArr = ((MapBuilder) g()).f23094p;
            l0.m(objArr);
            V v5 = (V) objArr[getF23109q()];
            h();
            return v5;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.A = true;
        G = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i5, int i6) {
        this.f23093o = kArr;
        this.f23094p = vArr;
        this.f23095q = iArr;
        this.f23096r = iArr2;
        this.f23097s = i5;
        this.f23098t = i6;
        this.f23099u = B.d(iArr2.length);
    }

    private final int A(V v5) {
        int i5 = this.f23098t;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.f23095q[i5] >= 0) {
                V[] vArr = this.f23094p;
                l0.m(vArr);
                if (l0.g(vArr[i5], v5)) {
                    return i5;
                }
            }
        }
    }

    private final int D() {
        return this.f23096r.length;
    }

    private final int H(K k5) {
        return ((k5 != null ? k5.hashCode() : 0) * C) >>> this.f23099u;
    }

    private final boolean K(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z5 = false;
        if (collection.isEmpty()) {
            return false;
        }
        x(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (L(it.next())) {
                z5 = true;
            }
        }
        return z5;
    }

    private final boolean L(Map.Entry<? extends K, ? extends V> entry) {
        int n5 = n(entry.getKey());
        V[] p5 = p();
        if (n5 >= 0) {
            p5[n5] = entry.getValue();
            return true;
        }
        int i5 = (-n5) - 1;
        if (l0.g(entry.getValue(), p5[i5])) {
            return false;
        }
        p5[i5] = entry.getValue();
        return true;
    }

    private final boolean M(int i5) {
        int H = H(this.f23093o[i5]);
        int i6 = this.f23097s;
        while (true) {
            int[] iArr = this.f23096r;
            if (iArr[H] == 0) {
                iArr[H] = i5 + 1;
                this.f23095q[i5] = H;
                return true;
            }
            i6--;
            if (i6 < 0) {
                return false;
            }
            H = H == 0 ? iArr.length - 1 : H - 1;
        }
    }

    private final void N() {
        this.f23100v++;
    }

    private final void O(int i5) {
        N();
        if (this.f23098t > this.f23101w) {
            s();
        }
        int[] iArr = this.f23096r;
        int i6 = 0;
        if (i5 != iArr.length) {
            this.f23096r = new int[i5];
            this.f23099u = B.d(i5);
        } else {
            p.K1(iArr, 0, 0, iArr.length);
        }
        while (i6 < this.f23098t) {
            int i7 = i6 + 1;
            if (!M(i6)) {
                throw new IllegalStateException(ProtectedSandApp.s("殡"));
            }
            i6 = i7;
        }
    }

    private final void Q(int i5) {
        int i6 = this.f23097s * 2;
        int length = this.f23096r.length / 2;
        if (i6 > length) {
            i6 = length;
        }
        int i7 = i6;
        int i8 = 0;
        int i9 = i5;
        do {
            i5 = i5 == 0 ? this.f23096r.length - 1 : i5 - 1;
            i8++;
            if (i8 > this.f23097s) {
                this.f23096r[i9] = 0;
                return;
            }
            int[] iArr = this.f23096r;
            int i10 = iArr[i5];
            if (i10 == 0) {
                iArr[i9] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                int H = H(this.f23093o[i11]) - i5;
                int[] iArr2 = this.f23096r;
                if ((H & (iArr2.length - 1)) >= i8) {
                    iArr2[i9] = i10;
                    this.f23095q[i11] = i9;
                }
                i7--;
            }
            i9 = i5;
            i8 = 0;
            i7--;
        } while (i7 >= 0);
        this.f23096r[i9] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(int i5) {
        kotlin.collections.builders.c.f(this.f23093o, i5);
        Q(this.f23095q[i5]);
        this.f23095q[i5] = -1;
        this.f23101w--;
        N();
    }

    private final boolean U(int i5) {
        K[] kArr = this.f23093o;
        int length = kArr.length;
        int i6 = this.f23098t;
        int i7 = length - i6;
        int i8 = i6 - this.f23101w;
        return i7 < i5 && i7 + i8 >= i5 && i8 >= kArr.length / 4;
    }

    private final Object W() {
        if (this.A) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException(ProtectedSandApp.s("殢"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] p() {
        V[] vArr = this.f23094p;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.c.d(this.f23093o.length);
        this.f23094p = vArr2;
        return vArr2;
    }

    private final void s() {
        int i5;
        V[] vArr = this.f23094p;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i5 = this.f23098t;
            if (i6 >= i5) {
                break;
            }
            if (this.f23095q[i6] >= 0) {
                K[] kArr = this.f23093o;
                kArr[i7] = kArr[i6];
                if (vArr != null) {
                    vArr[i7] = vArr[i6];
                }
                i7++;
            }
            i6++;
        }
        kotlin.collections.builders.c.g(this.f23093o, i7, i5);
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, i7, this.f23098t);
        }
        this.f23098t = i7;
    }

    private final boolean v(Map<?, ?> map) {
        return this.f23101w == map.size() && t(map.entrySet());
    }

    private final void w(int i5) {
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        K[] kArr = this.f23093o;
        if (i5 > kArr.length) {
            int e6 = AbstractList.f23126o.e(kArr.length, i5);
            this.f23093o = (K[]) kotlin.collections.builders.c.e(this.f23093o, e6);
            V[] vArr = this.f23094p;
            this.f23094p = vArr != null ? (V[]) kotlin.collections.builders.c.e(vArr, e6) : null;
            int[] copyOf = Arrays.copyOf(this.f23095q, e6);
            l0.o(copyOf, ProtectedSandApp.s("殣"));
            this.f23095q = copyOf;
            int c6 = B.c(e6);
            if (c6 > this.f23096r.length) {
                O(c6);
            }
        }
    }

    private final void x(int i5) {
        if (U(i5)) {
            O(this.f23096r.length);
        } else {
            w(this.f23098t + i5);
        }
    }

    private final int z(K k5) {
        int H = H(k5);
        int i5 = this.f23097s;
        while (true) {
            int i6 = this.f23096r[H];
            if (i6 == 0) {
                return -1;
            }
            if (i6 > 0) {
                int i7 = i6 - 1;
                if (l0.g(this.f23093o[i7], k5)) {
                    return i7;
                }
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            H = H == 0 ? this.f23096r.length - 1 : H - 1;
        }
    }

    public final int B() {
        return this.f23093o.length;
    }

    @d5.d
    public Set<Map.Entry<K, V>> C() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.f23104z;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.f23104z = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @d5.d
    public Set<K> E() {
        MapBuilderKeys<K> mapBuilderKeys = this.f23102x;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.f23102x = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* renamed from: F, reason: from getter */
    public int getF23101w() {
        return this.f23101w;
    }

    @d5.d
    public Collection<V> G() {
        MapBuilderValues<V> mapBuilderValues = this.f23103y;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.f23103y = mapBuilderValues2;
        return mapBuilderValues2;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    @d5.d
    public final e<K, V> J() {
        return new e<>(this);
    }

    public final boolean P(@d5.d Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, ProtectedSandApp.s("殤"));
        r();
        int z5 = z(entry.getKey());
        if (z5 < 0) {
            return false;
        }
        V[] vArr = this.f23094p;
        l0.m(vArr);
        if (!l0.g(vArr[z5], entry.getValue())) {
            return false;
        }
        S(z5);
        return true;
    }

    public final int R(K k5) {
        r();
        int z5 = z(k5);
        if (z5 < 0) {
            return -1;
        }
        S(z5);
        return z5;
    }

    public final boolean T(V v5) {
        r();
        int A = A(v5);
        if (A < 0) {
            return false;
        }
        S(A);
        return true;
    }

    @d5.d
    public final f<K, V> V() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        r();
        IntIterator it = new IntRange(0, this.f23098t - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f23095q;
            int i5 = iArr[nextInt];
            if (i5 >= 0) {
                this.f23096r[i5] = 0;
                iArr[nextInt] = -1;
            }
        }
        kotlin.collections.builders.c.g(this.f23093o, 0, this.f23098t);
        V[] vArr = this.f23094p;
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, 0, this.f23098t);
        }
        this.f23101w = 0;
        this.f23098t = 0;
        N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return z(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return A(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return C();
    }

    @Override // java.util.Map
    public boolean equals(@d5.e Object other) {
        return other == this || ((other instanceof Map) && v((Map) other));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @d5.e
    public V get(Object key) {
        int z5 = z(key);
        if (z5 < 0) {
            return null;
        }
        V[] vArr = this.f23094p;
        l0.m(vArr);
        return vArr[z5];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVar = new b(this);
        int i5 = 0;
        while (bVar.hasNext()) {
            i5 += bVar.n();
        }
        return i5;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f23101w == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return E();
    }

    public final int n(K k5) {
        r();
        while (true) {
            int H = H(k5);
            int i5 = this.f23097s * 2;
            int length = this.f23096r.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f23096r;
                int i7 = iArr[H];
                if (i7 <= 0) {
                    int i8 = this.f23098t;
                    K[] kArr = this.f23093o;
                    if (i8 < kArr.length) {
                        int i9 = i8 + 1;
                        this.f23098t = i9;
                        kArr[i8] = k5;
                        this.f23095q[i8] = H;
                        iArr[H] = i9;
                        this.f23101w++;
                        N();
                        if (i6 > this.f23097s) {
                            this.f23097s = i6;
                        }
                        return i8;
                    }
                    x(1);
                } else {
                    if (l0.g(this.f23093o[i7 - 1], k5)) {
                        return -i7;
                    }
                    i6++;
                    if (i6 > i5) {
                        O(this.f23096r.length * 2);
                        break;
                    }
                    H = H == 0 ? this.f23096r.length - 1 : H - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    @d5.e
    public V put(K key, V value) {
        r();
        int n5 = n(key);
        V[] p5 = p();
        if (n5 >= 0) {
            p5[n5] = value;
            return null;
        }
        int i5 = (-n5) - 1;
        V v5 = p5[i5];
        p5[i5] = value;
        return v5;
    }

    @Override // java.util.Map
    public void putAll(@d5.d Map<? extends K, ? extends V> from) {
        l0.p(from, ProtectedSandApp.s("殥"));
        r();
        K(from.entrySet());
    }

    @d5.d
    public final Map<K, V> q() {
        r();
        this.A = true;
        if (this.f23101w > 0) {
            return this;
        }
        MapBuilder mapBuilder = G;
        l0.n(mapBuilder, ProtectedSandApp.s("殦"));
        return mapBuilder;
    }

    public final void r() {
        if (this.A) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @d5.e
    public V remove(Object key) {
        int R = R(key);
        if (R < 0) {
            return null;
        }
        V[] vArr = this.f23094p;
        l0.m(vArr);
        V v5 = vArr[R];
        kotlin.collections.builders.c.f(vArr, R);
        return v5;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23101w;
    }

    public final boolean t(@d5.d Collection<?> collection) {
        l0.p(collection, ProtectedSandApp.s("殧"));
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!u((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder((this.f23101w * 3) + 2);
        sb.append(ProtectedSandApp.s("殨"));
        b bVar = new b(this);
        int i5 = 0;
        while (bVar.hasNext()) {
            if (i5 > 0) {
                sb.append(ProtectedSandApp.s("殩"));
            }
            bVar.m(sb);
            i5++;
        }
        sb.append(ProtectedSandApp.s("殪"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("殫"));
        return sb2;
    }

    public final boolean u(@d5.d Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, ProtectedSandApp.s("殬"));
        int z5 = z(entry.getKey());
        if (z5 < 0) {
            return false;
        }
        V[] vArr = this.f23094p;
        l0.m(vArr);
        return l0.g(vArr[z5], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return G();
    }

    @d5.d
    public final b<K, V> y() {
        return new b<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i5) {
        this(kotlin.collections.builders.c.d(i5), null, new int[i5], new int[B.c(i5)], 2, 0);
    }
}
