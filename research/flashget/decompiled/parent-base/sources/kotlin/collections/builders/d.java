package kotlin.collections.builders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
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
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import md.g;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0006\b\u0000\u0018\u0000 =*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0007\u008e\u0001cefhiBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0002\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001dJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010$J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u001f\u00103\u001a\u00020\u001c2\u000e\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u001c2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002¢\u0006\u0004\b7\u00108J)\u0010;\u001a\u00020\u001c2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010509H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001c2\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bC\u0010BJ\u001a\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\u00172\u0014\u0010:\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010EJ\u000f\u0010K\u001a\u00020\u0017H\u0016¢\u0006\u0004\bK\u0010\u0011J\u001a\u0010L\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\bL\u0010BJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0017H\u0000¢\u0006\u0004\bR\u0010\u0011J\u0017\u0010S\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010$J\u0017\u0010T\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010$J#\u0010U\u001a\u00020\u001c2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bU\u00108J\u001b\u0010V\u001a\u00020\u001c2\n\u0010 \u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bV\u0010<J#\u0010W\u001a\u00020\u001c2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bW\u00108J\u0017\u0010Y\u001a\u00020\u001c2\u0006\u0010X\u001a\u00028\u0001H\u0000¢\u0006\u0004\bY\u0010BJ\u001b\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010ZH\u0000¢\u0006\u0004\b[\u0010\\J\u001b\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0004\b^\u0010_J\u001b\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`H\u0000¢\u0006\u0004\ba\u0010bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010n\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010jR$\u0010r\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bp\u0010j\u001a\u0004\bq\u0010NR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010xR$\u0010|\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010{R$\u0010~\u001a\u00020\u001c2\u0006\u0010o\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010}\u001a\u0004\bj\u0010@R\u0015\u0010\u0080\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010NR\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u008b\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0089\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0083\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010N¨\u0006\u008f\u0001"}, d2 = {"Lkotlin/collections/builders/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "X", "()Ljava/lang/Object;", "Lkotlin/k2;", "O", "n", "w", "extraCapacity", "", "(I)Z", "minCapacity", "v", "m", "()[Ljava/lang/Object;", "key", "H", "(Ljava/lang/Object;)I", "q", "newHashSize", "P", "i", "N", "y", "value", "z", "index", "T", "removedHash", "R", "", "other", "u", "(Ljava/util/Map;)Z", "", "entry", "M", "(Ljava/util/Map$Entry;)Z", "", "from", "L", "(Ljava/util/Collection;)Z", "o", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p", "l", "S", "t", "r", "Q", "element", "U", "Lkotlin/collections/builders/d$e;", "J", "()Lkotlin/collections/builders/d$e;", "Lkotlin/collections/builders/d$f;", "W", "()Lkotlin/collections/builders/d$f;", "Lkotlin/collections/builders/d$b;", "x", "()Lkotlin/collections/builders/d$b;", "b", "[Ljava/lang/Object;", "c", "d", "[I", "e", "f", "I", "g", "h", "hashShift", "modCount", "<set-?>", "j", "E", "size", "Lkotlin/collections/builders/f;", "k", "Lkotlin/collections/builders/f;", "keysView", "Lkotlin/collections/builders/g;", "Lkotlin/collections/builders/g;", "valuesView", "Lkotlin/collections/builders/e;", "Lkotlin/collections/builders/e;", "entriesView", "Z", "isReadOnly", "C", "hashSize", "", "D", "()Ljava/util/Set;", "keys", "", "F", "()Ljava/util/Collection;", "values", "", "B", "entries", "A", "capacity", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
/* loaded from: classes7.dex */
public final class d<K, V> implements Map<K, V>, Serializable, md.g {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: p, reason: collision with root package name */
    private static final int f74847p = -1640531527;

    /* renamed from: q, reason: collision with root package name */
    private static final int f74848q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final int f74849r = 2;

    /* renamed from: s, reason: collision with root package name */
    private static final int f74850s = -1;

    /* renamed from: t, reason: collision with root package name */
    @l
    private static final d f74851t;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private K[] keysArray;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private V[] valuesArray;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private int[] presenceArray;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private int[] hashArray;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxProbeDistance;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int hashShift;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @m
    private kotlin.collections.builders.f<K> keysView;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @m
    private g<V> valuesView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @m
    private kotlin.collections.builders.e<K, V> entriesView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/collections/builders/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "Lkotlin/collections/builders/d;", "", "Empty", "Lkotlin/collections/builders/d;", "e", "()Lkotlin/collections/builders/d;", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int capacity) {
            if (capacity < 1) {
                capacity = 1;
            }
            return Integer.highestOneBit(capacity * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        @l
        public final d e() {
            return d.f74851t;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/d$b;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "Lkotlin/collections/builders/d$c;", "j", "()Lkotlin/collections/builders/d$c;", "", "m", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lkotlin/k2;", "l", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<K, V> extends C1048d<K, V> implements Iterator<Map.Entry<K, V>>, md.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, ProtectedSandApp.s("惡\u0001"));
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            c<K, V> cVar = new c<>(e(), getLastIndex());
            f();
            return cVar;
        }

        public final void l(@l StringBuilder sb) {
            l0.p(sb, ProtectedSandApp.s("惢\u0001"));
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object obj = ((d) e()).keysArray[getLastIndex()];
            d<K, V> e4 = e();
            String s4 = ProtectedSandApp.s("惣\u0001");
            if (obj == e4) {
                sb.append(s4);
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((d) e()).valuesArray;
            l0.m(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == e()) {
                sb.append(s4);
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int m() {
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object obj = ((d) e()).keysArray[getLastIndex()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((d) e()).valuesArray;
            l0.m(objArr);
            Object obj2 = objArr[getLastIndex()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return hashCode2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lkotlin/collections/builders/d$c;", "K", "V", "", "Lkotlin/collections/builders/d;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/d;I)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/collections/builders/d;", "c", "I", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final d<K, V> map;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int index;

        public c(@l d<K, V> dVar, int i4) {
            l0.p(dVar, ProtectedSandApp.s("惤\u0001"));
            this.map = dVar;
            this.index = i4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@m Object other) {
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
            return (K) ((d) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.map).valuesArray;
            l0.m(objArr);
            return (V) objArr[this.index];
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
            this.map.p();
            Object[] m4 = this.map.m();
            int i4 = this.index;
            V v4 = (V) m4[i4];
            m4[i4] = newValue;
            return v4;
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u001e"}, d2 = {"Lkotlin/collections/builders/d$d;", "K", "V", "", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "Lkotlin/k2;", "f", "()V", "", "hasNext", "()Z", "remove", "b", "Lkotlin/collections/builders/d;", "e", "()Lkotlin/collections/builders/d;", "", "c", "I", "()I", "h", "(I)V", "index", "d", "i", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    /* renamed from: kotlin.collections.builders.d$d, reason: collision with other inner class name */
    public static class C1048d<K, V> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final d<K, V> map;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public C1048d(@l d<K, V> dVar) {
            l0.p(dVar, ProtectedSandApp.s("惟\u0001"));
            this.map = dVar;
            this.lastIndex = -1;
            this.expectedModCount = ((d) dVar).modCount;
            f();
        }

        public final void b() {
            if (((d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: d, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        @l
        public final d<K, V> e() {
            return this.map;
        }

        public final void f() {
            while (this.index < ((d) this.map).length) {
                int[] iArr = ((d) this.map).presenceArray;
                int i4 = this.index;
                if (iArr[i4] >= 0) {
                    return;
                } else {
                    this.index = i4 + 1;
                }
            }
        }

        public final void h(int i4) {
            this.index = i4;
        }

        public final boolean hasNext() {
            return this.index < ((d) this.map).length;
        }

        public final void i(int i4) {
            this.lastIndex = i4;
        }

        public final void remove() {
            b();
            if (this.lastIndex == -1) {
                throw new IllegalStateException(ProtectedSandApp.s("惠\u0001"));
            }
            this.map.p();
            this.map.T(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((d) this.map).modCount;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/d$e;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e<K, V> extends C1048d<K, V> implements Iterator<K>, md.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@l d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, ProtectedSandApp.s("惥\u0001"));
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            K k4 = (K) ((d) e()).keysArray[getLastIndex()];
            f();
            return k4;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/d$f;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f<K, V> extends C1048d<K, V> implements Iterator<V>, md.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@l d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, ProtectedSandApp.s("惦\u0001"));
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            i(index);
            Object[] objArr = ((d) e()).valuesArray;
            l0.m(objArr);
            V v4 = (V) objArr[getLastIndex()];
            f();
            return v4;
        }
    }

    static {
        d dVar = new d(0);
        dVar.isReadOnly = true;
        f74851t = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i4, int i5) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i4;
        this.length = i5;
        this.hashShift = INSTANCE.d(iArr2.length);
    }

    private final int C() {
        return this.hashArray.length;
    }

    private final int H(K key) {
        return ((key != null ? key.hashCode() : 0) * f74847p) >>> this.hashShift;
    }

    private final boolean L(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z4 = false;
        if (from.isEmpty()) {
            return false;
        }
        w(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (M(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    private final boolean M(Map.Entry<? extends K, ? extends V> entry) {
        int l4 = l(entry.getKey());
        V[] m4 = m();
        if (l4 >= 0) {
            m4[l4] = entry.getValue();
            return true;
        }
        int i4 = (-l4) - 1;
        if (l0.g(entry.getValue(), m4[i4])) {
            return false;
        }
        m4[i4] = entry.getValue();
        return true;
    }

    private final boolean N(int i4) {
        int H = H(this.keysArray[i4]);
        int i5 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[H] == 0) {
                iArr[H] = i4 + 1;
                this.presenceArray[i4] = H;
                return true;
            }
            i5--;
            if (i5 < 0) {
                return false;
            }
            H = H == 0 ? iArr.length - 1 : H - 1;
        }
    }

    private final void O() {
        this.modCount++;
    }

    private final void P(int newHashSize) {
        O();
        if (this.length > this.size) {
            q();
        }
        int[] iArr = this.hashArray;
        int i4 = 0;
        if (newHashSize != iArr.length) {
            this.hashArray = new int[newHashSize];
            this.hashShift = INSTANCE.d(newHashSize);
        } else {
            kotlin.collections.l.K1(iArr, 0, 0, iArr.length);
        }
        while (i4 < this.length) {
            int i5 = i4 + 1;
            if (!N(i4)) {
                throw new IllegalStateException(ProtectedSandApp.s("惧\u0001"));
            }
            i4 = i5;
        }
    }

    private final void R(int removedHash) {
        int i4 = this.maxProbeDistance * 2;
        int length = this.hashArray.length / 2;
        if (i4 > length) {
            i4 = length;
        }
        int i5 = i4;
        int i6 = 0;
        int i7 = removedHash;
        do {
            removedHash = removedHash == 0 ? this.hashArray.length - 1 : removedHash - 1;
            i6++;
            if (i6 > this.maxProbeDistance) {
                this.hashArray[i7] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i10 = iArr[removedHash];
            if (i10 == 0) {
                iArr[i7] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i7] = -1;
            } else {
                int i11 = i10 - 1;
                int H = H(this.keysArray[i11]) - removedHash;
                int[] iArr2 = this.hashArray;
                if ((H & (iArr2.length - 1)) >= i6) {
                    iArr2[i7] = i10;
                    this.presenceArray[i11] = i7;
                }
                i5--;
            }
            i7 = removedHash;
            i6 = 0;
            i5--;
        } while (i5 >= 0);
        this.hashArray[i7] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int index) {
        kotlin.collections.builders.c.f(this.keysArray, index);
        R(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size--;
        O();
    }

    private final boolean V(int extraCapacity) {
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i4 = this.length;
        int i5 = length - i4;
        int i6 = i4 - this.size;
        return i5 < extraCapacity && i5 + i6 >= extraCapacity && i6 >= kArr.length / 4;
    }

    private final Object X() {
        if (this.isReadOnly) {
            return new i(this);
        }
        throw new NotSerializableException(ProtectedSandApp.s("惨\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] m() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.c.d(this.keysArray.length);
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void q() {
        int i4;
        V[] vArr = this.valuesArray;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.length;
            if (i5 >= i4) {
                break;
            }
            if (this.presenceArray[i5] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i6] = kArr[i5];
                if (vArr != null) {
                    vArr[i6] = vArr[i5];
                }
                i6++;
            }
            i5++;
        }
        kotlin.collections.builders.c.g(this.keysArray, i6, i4);
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, i6, this.length);
        }
        this.length = i6;
    }

    private final boolean u(Map<?, ?> other) {
        return this.size == other.size() && r(other.entrySet());
    }

    private final void v(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        K[] kArr = this.keysArray;
        if (minCapacity > kArr.length) {
            int e4 = kotlin.collections.c.INSTANCE.e(kArr.length, minCapacity);
            this.keysArray = (K[]) kotlin.collections.builders.c.e(this.keysArray, e4);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) kotlin.collections.builders.c.e(vArr, e4) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, e4);
            l0.o(copyOf, ProtectedSandApp.s("惩\u0001"));
            this.presenceArray = copyOf;
            int c5 = INSTANCE.c(e4);
            if (c5 > this.hashArray.length) {
                P(c5);
            }
        }
    }

    private final void w(int n4) {
        if (V(n4)) {
            P(this.hashArray.length);
        } else {
            v(this.length + n4);
        }
    }

    private final int y(K key) {
        int H = H(key);
        int i4 = this.maxProbeDistance;
        while (true) {
            int i5 = this.hashArray[H];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (l0.g(this.keysArray[i6], key)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            H = H == 0 ? this.hashArray.length - 1 : H - 1;
        }
    }

    private final int z(V value) {
        int i4 = this.length;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.presenceArray[i4] >= 0) {
                V[] vArr = this.valuesArray;
                l0.m(vArr);
                if (l0.g(vArr[i4], value)) {
                    return i4;
                }
            }
        }
    }

    public final int A() {
        return this.keysArray.length;
    }

    @l
    public Set<Map.Entry<K, V>> B() {
        kotlin.collections.builders.e<K, V> eVar = this.entriesView;
        if (eVar != null) {
            return eVar;
        }
        kotlin.collections.builders.e<K, V> eVar2 = new kotlin.collections.builders.e<>(this);
        this.entriesView = eVar2;
        return eVar2;
    }

    @l
    public Set<K> D() {
        kotlin.collections.builders.f<K> fVar = this.keysView;
        if (fVar != null) {
            return fVar;
        }
        kotlin.collections.builders.f<K> fVar2 = new kotlin.collections.builders.f<>(this);
        this.keysView = fVar2;
        return fVar2;
    }

    /* renamed from: E, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @l
    public Collection<V> F() {
        g<V> gVar = this.valuesView;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.valuesView = gVar2;
        return gVar2;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @l
    public final e<K, V> J() {
        return new e<>(this);
    }

    public final boolean Q(@l Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, ProtectedSandApp.s("惪\u0001"));
        p();
        int y4 = y(entry.getKey());
        if (y4 < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        if (!l0.g(vArr[y4], entry.getValue())) {
            return false;
        }
        T(y4);
        return true;
    }

    public final int S(K key) {
        p();
        int y4 = y(key);
        if (y4 < 0) {
            return -1;
        }
        T(y4);
        return y4;
    }

    public final boolean U(V element) {
        p();
        int z4 = z(element);
        if (z4 < 0) {
            return false;
        }
        T(z4);
        return true;
    }

    @l
    public final f<K, V> W() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        p();
        u0 it = new kotlin.ranges.l(0, this.length - 1, 1).iterator();
        while (it.hasNext()) {
            int c5 = it.c();
            int[] iArr = this.presenceArray;
            int i4 = iArr[c5];
            if (i4 >= 0) {
                this.hashArray[i4] = 0;
                iArr[c5] = -1;
            }
        }
        kotlin.collections.builders.c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return y(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return z(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(@m Object other) {
        return other == this || ((other instanceof Map) && u((Map) other));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V get(Object key) {
        int y4 = y(key);
        if (y4 < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        return vArr[y4];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVar = new b(this);
        int i4 = 0;
        while (bVar.hasNext()) {
            i4 += bVar.m();
        }
        return i4;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    public final int l(K key) {
        p();
        while (true) {
            int H = H(key);
            int i4 = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i6 = iArr[H];
                if (i6 <= 0) {
                    int i7 = this.length;
                    K[] kArr = this.keysArray;
                    if (i7 < kArr.length) {
                        int i10 = i7 + 1;
                        this.length = i10;
                        kArr[i7] = key;
                        this.presenceArray[i7] = H;
                        iArr[H] = i10;
                        this.size++;
                        O();
                        if (i5 > this.maxProbeDistance) {
                            this.maxProbeDistance = i5;
                        }
                        return i7;
                    }
                    w(1);
                } else {
                    if (l0.g(this.keysArray[i6 - 1], key)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > i4) {
                        P(this.hashArray.length * 2);
                        break;
                    }
                    H = H == 0 ? this.hashArray.length - 1 : H - 1;
                }
            }
        }
    }

    @l
    public final Map<K, V> o() {
        p();
        this.isReadOnly = true;
        if (this.size > 0) {
            return this;
        }
        d dVar = f74851t;
        l0.n(dVar, ProtectedSandApp.s("惫\u0001"));
        return dVar;
    }

    public final void p() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    @m
    public V put(K key, V value) {
        p();
        int l4 = l(key);
        V[] m4 = m();
        if (l4 >= 0) {
            m4[l4] = value;
            return null;
        }
        int i4 = (-l4) - 1;
        V v4 = m4[i4];
        m4[i4] = value;
        return v4;
    }

    @Override // java.util.Map
    public void putAll(@l Map<? extends K, ? extends V> from) {
        l0.p(from, ProtectedSandApp.s("惬\u0001"));
        p();
        L(from.entrySet());
    }

    public final boolean r(@l Collection<?> m4) {
        l0.p(m4, ProtectedSandApp.s("惭\u0001"));
        for (Object obj : m4) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V remove(Object key) {
        int S = S(key);
        if (S < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        V v4 = vArr[S];
        kotlin.collections.builders.c.f(vArr, S);
        return v4;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final boolean t(@l Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, ProtectedSandApp.s("惪\u0001"));
        int y4 = y(entry.getKey());
        if (y4 < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        return l0.g(vArr[y4], entry.getValue());
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append(ProtectedSandApp.s("惮\u0001"));
        b bVar = new b(this);
        int i4 = 0;
        while (bVar.hasNext()) {
            if (i4 > 0) {
                sb.append(ProtectedSandApp.s("惯\u0001"));
            }
            bVar.l(sb);
            i4++;
        }
        sb.append(ProtectedSandApp.s("惰\u0001"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("惱\u0001"));
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return F();
    }

    @l
    public final b<K, V> x() {
        return new b<>(this);
    }

    public d() {
        this(8);
    }

    public d(int i4) {
        this(kotlin.collections.builders.c.d(i4), null, new int[i4], new int[INSTANCE.c(i4)], 2, 0);
    }
}
