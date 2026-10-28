package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\b\u0000\u0018\u0000 K*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J5\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010&JG\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010\u0014J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J)\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010<J)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\bB\u0010@J3\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bF\u0010GJ/\u0010H\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010IJ/\u0010J\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010IJ\u000f\u0010K\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010PJ%\u00105\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b5\u0010RJ=\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bS\u0010TJ9\u0010U\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bU\u0010VJ9\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010E\u001a\u00020D2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bW\u0010VJ#\u0010X\u001a\u00020\r2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bX\u0010YJ+\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\bZ\u0010[J7\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\b\\\u0010]J+\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b^\u0010[J7\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\b\u0001\u0010]R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u001f\u001a\u0004\b`\u0010L\"\u0004\ba\u0010bR*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006m"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "E", "", "", "bitmap", "", "buffer", "Lf0/f;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Lf0/f;)V", "(I[Ljava/lang/Object;)V", "positionMask", "", "p", "(I)Z", "index", "k", "(I)Ljava/lang/Object;", "J", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "element", "c", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "owner", "w", "(ILjava/lang/Object;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "nodeIndex", "newNode", "P", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "I", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "elementIndex", "newElementHash", "newElement", "shift", "s", "(IILjava/lang/Object;ILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "t", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "D", "elementHash1", "element1", "elementHash2", "element2", "r", "(ILjava/lang/Object;ILjava/lang/Object;ILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "cellIndex", "L", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "G", "(IILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "i", "h", "B", "(ILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "f", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "mutator", "x", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "g", "z", "otherNode", "Lf0/b;", "intersectionSizeRef", "y", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;Lf0/b;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "C", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;Lf0/b;Lf0/f;)Ljava/lang/Object;", "A", "d", "()I", "l", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;)Z", "q", "(I)I", "elementHash", "(ILjava/lang/Object;I)Z", "v", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;ILf0/b;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "H", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;ILf0/b;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Ljava/lang/Object;", "F", "j", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;I)Z", "b", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "u", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "K", "a", "m", "M", "(I)V", "[Ljava/lang/Object;", "n", "()[Ljava/lang/Object;", "N", "([Ljava/lang/Object;)V", "Lf0/f;", "o", "()Lf0/f;", "O", "(Lf0/f;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/* loaded from: classes.dex */
public final class e<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16316e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int bitmap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private f0.f ownedBy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final e f16317f = new e(0, new Object[0], null);

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e$a;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final e a() {
            return e.f16317f;
        }

        public Companion(w wVar) {
        }
    }

    public e(int i4, @l Object[] objArr, @m f0.f fVar) {
        this.bitmap = i4;
        this.buffer = objArr;
        this.ownedBy = fVar;
    }

    private final Object A(e<E> otherNode, f0.b intersectionSizeRef, f0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return f16317f;
        }
        Object[] objArr = l0.g(owner, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr2.length; i5++) {
            if (!kotlin.collections.l.s8(otherNode.buffer, objArr2[i5])) {
                objArr[i4] = objArr2[i5];
                i4++;
            }
        }
        intersectionSizeRef.e(this.buffer.length - i4);
        if (i4 == 0) {
            return f16317f;
        }
        if (i4 == 1) {
            return objArr[0];
        }
        if (i4 == this.buffer.length) {
            return this;
        }
        if (i4 == objArr.length) {
            return new e(0, objArr, owner);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i4);
        l0.o(copyOf, "copyOf(this, newSize)");
        return new e(0, copyOf, owner);
    }

    private final e<E> B(int i4, f0.f owner) {
        Object[] g4;
        Object[] g5;
        if (this.ownedBy != owner) {
            g4 = g.g(this.buffer, i4);
            return new e<>(0, g4, owner);
        }
        g5 = g.g(this.buffer, i4);
        this.buffer = g5;
        return this;
    }

    private final Object C(e<E> otherNode, f0.b intersectionSizeRef, f0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return this;
        }
        Object[] objArr = l0.g(owner, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr2.length; i5++) {
            if (kotlin.collections.l.s8(otherNode.buffer, objArr2[i5])) {
                objArr[i4] = objArr2[i5];
                i4++;
            }
        }
        intersectionSizeRef.e(i4);
        if (i4 == 0) {
            return f16317f;
        }
        if (i4 == 1) {
            return objArr[0];
        }
        if (i4 == this.buffer.length) {
            return this;
        }
        if (i4 == otherNode.buffer.length) {
            return otherNode;
        }
        if (i4 == objArr.length) {
            return new e(0, objArr, owner);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i4);
        l0.o(copyOf, "copyOf(this, newSize)");
        return new e(0, copyOf, owner);
    }

    private final e<E> D(int elementIndex, int newElementHash, E newElement, int shift, f0.f owner) {
        if (this.ownedBy == owner) {
            this.buffer[elementIndex] = s(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[elementIndex] = s(elementIndex, newElementHash, newElement, shift, owner);
        return new e<>(this.bitmap, copyOf, owner);
    }

    private final e<E> G(int cellIndex, int positionMask, f0.f owner) {
        Object[] g4;
        Object[] g5;
        if (this.ownedBy != owner) {
            g4 = g.g(this.buffer, cellIndex);
            return new e<>(positionMask ^ this.bitmap, g4, owner);
        }
        g5 = g.g(this.buffer, cellIndex);
        this.buffer = g5;
        this.bitmap ^= positionMask;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final e<E> I(int nodeIndex, e<E> newNode, f0.f owner) {
        ?? r02 = newNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof e)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r03;
            }
        }
        if (this.ownedBy == owner) {
            this.buffer[nodeIndex] = newNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[nodeIndex] = newNode;
        return new e<>(this.bitmap, copyOf, owner);
    }

    private final e<E> J(int index) {
        Object obj = this.buffer[index];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (e) obj;
    }

    private final e<E> L(int cellIndex, int positionMask) {
        Object[] g4;
        g4 = g.g(this.buffer, cellIndex);
        return new e<>(positionMask ^ this.bitmap, g4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final e<E> P(int nodeIndex, e<E> newNode) {
        ?? r02 = newNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof e)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r03;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[nodeIndex] = newNode;
        return new e<>(this.bitmap, copyOf, null);
    }

    private final e<E> c(int positionMask, E element) {
        Object[] c5;
        c5 = g.c(this.buffer, q(positionMask), element);
        return new e<>(positionMask | this.bitmap, c5, null);
    }

    private final int d() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i4 = 0;
        for (Object obj : this.buffer) {
            i4 += obj instanceof e ? ((e) obj).d() : 1;
        }
        return i4;
    }

    private final e<E> e(E element) {
        Object[] c5;
        if (kotlin.collections.l.s8(this.buffer, element)) {
            return this;
        }
        c5 = g.c(this.buffer, 0, element);
        return new e<>(0, c5, null);
    }

    private final boolean f(E element) {
        return kotlin.collections.l.s8(this.buffer, element);
    }

    private final e<E> g(E element) {
        int If = kotlin.collections.l.If(this.buffer, element);
        return If != -1 ? h(If) : this;
    }

    private final e<E> h(int i4) {
        Object[] g4;
        g4 = g.g(this.buffer, i4);
        return new e<>(0, g4, null);
    }

    private final E k(int index) {
        return (E) this.buffer[index];
    }

    private final boolean l(e<E> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.buffer[i4] != otherNode.buffer[i4]) {
                return false;
            }
        }
        return true;
    }

    private final boolean p(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    private final e<E> r(int elementHash1, E element1, int elementHash2, E element2, int shift, f0.f owner) {
        if (shift > 30) {
            return new e<>(0, new Object[]{element1, element2}, owner);
        }
        int f4 = g.f(elementHash1, shift);
        int f5 = g.f(elementHash2, shift);
        if (f4 != f5) {
            return new e<>((1 << f4) | (1 << f5), f4 < f5 ? new Object[]{element1, element2} : new Object[]{element2, element1}, owner);
        }
        return new e<>(1 << f4, new Object[]{r(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final e<E> s(int elementIndex, int newElementHash, E newElement, int shift, f0.f owner) {
        Object obj = this.buffer[elementIndex];
        return r(obj != null ? obj.hashCode() : 0, obj, newElementHash, newElement, shift + 5, owner);
    }

    private final e<E> t(int elementIndex, int newElementHash, E newElement, int shift) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[elementIndex] = s(elementIndex, newElementHash, newElement, shift, null);
        return new e<>(this.bitmap, copyOf, null);
    }

    private final e<E> w(int positionMask, E element, f0.f owner) {
        Object[] c5;
        Object[] c6;
        int q4 = q(positionMask);
        if (this.ownedBy != owner) {
            c5 = g.c(this.buffer, q4, element);
            return new e<>(positionMask | this.bitmap, c5, owner);
        }
        c6 = g.c(this.buffer, q4, element);
        this.buffer = c6;
        this.bitmap = positionMask | this.bitmap;
        return this;
    }

    private final e<E> x(E element, b<?> mutator) {
        Object[] c5;
        Object[] c6;
        if (kotlin.collections.l.s8(this.buffer, element)) {
            return this;
        }
        mutator.j(mutator.b() + 1);
        if (this.ownedBy != mutator.i()) {
            c5 = g.c(this.buffer, 0, element);
            return new e<>(0, c5, mutator.i());
        }
        c6 = g.c(this.buffer, 0, element);
        this.buffer = c6;
        return this;
    }

    private final e<E> y(e<E> otherNode, f0.b intersectionSizeRef, f0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        l0.o(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr2.length; i5++) {
            if (!kotlin.collections.l.s8(this.buffer, objArr2[i5])) {
                copyOf[length + i4] = objArr2[i5];
                i4++;
            }
        }
        int length2 = i4 + this.buffer.length;
        intersectionSizeRef.e(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            l0.o(copyOf, "copyOf(this, newSize)");
        }
        if (!l0.g(this.ownedBy, owner)) {
            return new e<>(0, copyOf, owner);
        }
        this.buffer = copyOf;
        return this;
    }

    private final e<E> z(E element, b<?> mutator) {
        int If = kotlin.collections.l.If(this.buffer, element);
        if (If == -1) {
            return this;
        }
        mutator.j(mutator.b() - 1);
        return B(If, mutator.i());
    }

    @l
    public final e<E> E(int elementHash, E element, int shift, @l b<?> mutator) {
        int f4 = 1 << g.f(elementHash, shift);
        if (p(f4)) {
            return this;
        }
        int q4 = q(f4);
        Object obj = this.buffer[q4];
        if (obj instanceof e) {
            e<E> J = J(q4);
            e<E> z4 = shift == 30 ? J.z(element, mutator) : J.E(elementHash, element, shift + 5, mutator);
            return (this.ownedBy == mutator.i() || J != z4) ? I(q4, z4, mutator.i()) : this;
        }
        if (!l0.g(element, obj)) {
            return this;
        }
        mutator.j(mutator.b() - 1);
        return G(q4, f4, mutator.i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e) == false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e<E> r17, int r18, @fg.l f0.b r19, @fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b<?> r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e.F(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e, int, f0.b, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final Object H(@l e<E> otherNode, int shift, @l f0.b intersectionSizeRef, @l b<?> mutator) {
        e eVar;
        if (this == otherNode) {
            intersectionSizeRef.e(d());
            return this;
        }
        if (shift > 30) {
            return C(otherNode, intersectionSizeRef, mutator.i());
        }
        int i4 = this.bitmap & otherNode.bitmap;
        if (i4 == 0) {
            return f16317f;
        }
        e<E> eVar2 = (l0.g(this.ownedBy, mutator.i()) && i4 == this.bitmap) ? this : new e<>(i4, new Object[Integer.bitCount(i4)], mutator.i());
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int q4 = q(lowestOneBit);
            int q5 = otherNode.q(lowestOneBit);
            Object obj = this.buffer[q4];
            Object obj2 = otherNode.buffer[q5];
            boolean z4 = obj instanceof e;
            boolean z5 = obj2 instanceof e;
            if (z4 && z5) {
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                obj = ((e) obj).H((e) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z4) {
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((e) obj).i(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5)) {
                    intersectionSizeRef.e(1);
                    obj = obj2;
                } else {
                    obj = f16317f;
                }
            } else if (z5) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((e) obj2).i(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.e(1);
                } else {
                    obj = f16317f;
                }
            } else if (l0.g(obj, obj2)) {
                intersectionSizeRef.e(1);
            } else {
                obj = f16317f;
            }
            if (obj != f16317f) {
                i6 |= lowestOneBit;
            }
            eVar2.buffer[i7] = obj;
            i7++;
            i5 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i6);
        if (i6 == 0) {
            return f16317f;
        }
        if (i6 == i4) {
            return eVar2.l(this) ? this : eVar2.l(otherNode) ? otherNode : eVar2;
        }
        if (bitCount != 1 || shift == 0) {
            Object[] objArr = new Object[bitCount];
            Object[] objArr2 = eVar2.buffer;
            int i10 = 0;
            for (int i11 = 0; i11 < objArr2.length; i11++) {
                Object obj3 = objArr2[i11];
                INSTANCE.getClass();
                if (obj3 != f16317f) {
                    objArr[i10] = objArr2[i11];
                    i10++;
                }
            }
            eVar = new e(i6, objArr, mutator.i());
        } else {
            Object obj4 = eVar2.buffer[eVar2.q(i6)];
            if (!(obj4 instanceof e)) {
                return obj4;
            }
            eVar = new e(i6, new Object[]{obj4}, mutator.i());
        }
        return eVar;
    }

    @l
    public final e<E> K(int elementHash, E element, int shift) {
        int f4 = 1 << g.f(elementHash, shift);
        if (p(f4)) {
            return this;
        }
        int q4 = q(f4);
        Object obj = this.buffer[q4];
        if (!(obj instanceof e)) {
            return l0.g(element, obj) ? L(q4, f4) : this;
        }
        e<E> J = J(q4);
        e<E> g4 = shift == 30 ? J.g(element) : J.K(elementHash, element, shift + 5);
        return J == g4 ? this : P(q4, g4);
    }

    public final void M(int i4) {
        this.bitmap = i4;
    }

    public final void N(@l Object[] objArr) {
        this.buffer = objArr;
    }

    public final void O(@m f0.f fVar) {
        this.ownedBy = fVar;
    }

    @l
    public final e<E> b(int elementHash, E element, int shift) {
        int f4 = 1 << g.f(elementHash, shift);
        if (p(f4)) {
            return c(f4, element);
        }
        int q4 = q(f4);
        Object obj = this.buffer[q4];
        if (!(obj instanceof e)) {
            return l0.g(element, obj) ? this : t(q4, elementHash, element, shift);
        }
        e<E> J = J(q4);
        e<E> e4 = shift == 30 ? J.e(element) : J.b(elementHash, element, shift + 5);
        return J == e4 ? this : P(q4, e4);
    }

    public final boolean i(int elementHash, E element, int shift) {
        int f4 = 1 << g.f(elementHash, shift);
        if (p(f4)) {
            return false;
        }
        int q4 = q(f4);
        Object obj = this.buffer[q4];
        if (!(obj instanceof e)) {
            return l0.g(element, obj);
        }
        e<E> J = J(q4);
        return shift == 30 ? kotlin.collections.l.s8(J.buffer, element) : J.i(elementHash, element, shift + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(@l e<E> otherNode, int shift) {
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!kotlin.collections.l.s8(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = this.bitmap;
        int i5 = otherNode.bitmap;
        int i6 = i4 & i5;
        if (i6 != i5) {
            return false;
        }
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            int q4 = q(lowestOneBit);
            int q5 = otherNode.q(lowestOneBit);
            Object obj2 = this.buffer[q4];
            Object obj3 = otherNode.buffer[q5];
            boolean z4 = obj2 instanceof e;
            boolean z5 = obj3 instanceof e;
            if (z4 && z5) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                l0.n(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((e) obj2).j((e) obj3, shift + 5)) {
                    return false;
                }
            } else if (z4) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((e) obj2).i(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z5 || !l0.g(obj2, obj3)) {
                return false;
            }
            i6 ^= lowestOneBit;
        }
        return true;
    }

    /* renamed from: m, reason: from getter */
    public final int getBitmap() {
        return this.bitmap;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @m
    /* renamed from: o, reason: from getter */
    public final f0.f getOwnedBy() {
        return this.ownedBy;
    }

    public final int q(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    @l
    public final e<E> u(int elementHash, E element, int shift, @l b<?> mutator) {
        int f4 = 1 << g.f(elementHash, shift);
        if (p(f4)) {
            mutator.j(mutator.b() + 1);
            return w(f4, element, mutator.i());
        }
        int q4 = q(f4);
        Object obj = this.buffer[q4];
        if (obj instanceof e) {
            e<E> J = J(q4);
            e<E> x4 = shift == 30 ? J.x(element, mutator) : J.u(elementHash, element, shift + 5, mutator);
            return J == x4 ? this : I(q4, x4, mutator.i());
        }
        if (l0.g(element, obj)) {
            return this;
        }
        mutator.j(mutator.b() + 1);
        return D(q4, elementHash, element, shift, mutator.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final e<E> v(@l e<E> otherNode, int shift, @l f0.b intersectionSizeRef, @l b<?> mutator) {
        Object[] objArr;
        int i4;
        Object r4;
        e u4;
        if (this == otherNode) {
            intersectionSizeRef.f(intersectionSizeRef.d() + d());
            return this;
        }
        if (shift > 30) {
            return y(otherNode, intersectionSizeRef, mutator.i());
        }
        int i5 = this.bitmap;
        int i6 = otherNode.bitmap | i5;
        e<E> eVar = (i6 == i5 && l0.g(this.ownedBy, mutator.i())) ? this : new e<>(i6, new Object[Integer.bitCount(i6)], mutator.i());
        int i7 = i6;
        int i10 = 0;
        while (i7 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i7);
            int q4 = q(lowestOneBit);
            int q5 = otherNode.q(lowestOneBit);
            Object[] objArr2 = eVar.buffer;
            if (p(lowestOneBit)) {
                r4 = otherNode.buffer[q5];
            } else if (otherNode.p(lowestOneBit)) {
                r4 = this.buffer[q4];
            } else {
                Object obj = this.buffer[q4];
                Object obj2 = otherNode.buffer[q5];
                boolean z4 = obj instanceof e;
                boolean z5 = obj2 instanceof e;
                if (z4 && z5) {
                    l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    r4 = ((e) obj).v((e) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z4) {
                        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        e eVar2 = (e) obj;
                        int b5 = mutator.b();
                        u4 = eVar2.u(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (mutator.b() == b5) {
                            intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                        }
                        k2 k2Var = k2.f75408a;
                    } else if (z5) {
                        l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        e eVar3 = (e) obj2;
                        int b6 = mutator.b();
                        u4 = eVar3.u(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                        if (mutator.b() == b6) {
                            intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                        }
                        k2 k2Var2 = k2.f75408a;
                    } else if (l0.g(obj, obj2)) {
                        intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                        k2 k2Var3 = k2.f75408a;
                        r4 = obj;
                    } else {
                        objArr = objArr2;
                        i4 = lowestOneBit;
                        r4 = r(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator.i());
                        objArr[i10] = r4;
                        i10++;
                        i7 ^= i4;
                    }
                    r4 = u4;
                }
            }
            objArr = objArr2;
            i4 = lowestOneBit;
            objArr[i10] = r4;
            i10++;
            i7 ^= i4;
        }
        return l(eVar) ? this : otherNode.l(eVar) ? otherNode : eVar;
    }

    public e(int i4, @l Object[] objArr) {
        this(i4, objArr, null);
    }
}
