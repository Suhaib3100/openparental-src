package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u001dB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001d\u001a\u00020\t2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020$2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u0017J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t\u0018\u00010,2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0017R\u0016\u0010B\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00100R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER*\u0010K\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030H\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010P\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u0011\u0010U\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bT\u0010MR\u0011\u0010W\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bV\u0010MR$\u0010Z\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010M\"\u0004\bY\u0010OR$\u0010]\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010M\"\u0004\b\\\u0010OR$\u0010`\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010M\"\u0004\b_\u0010OR$\u0010b\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010M\"\u0004\b0\u0010OR$\u0010e\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010M\"\u0004\bd\u0010OR\u0011\u0010g\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bf\u0010M¨\u0006h"}, d2 = {"Landroidx/compose/runtime/f3;", "Landroidx/compose/runtime/t3;", "Landroidx/compose/runtime/e3;", "Landroidx/compose/runtime/h3;", "owner", "<init>", "(Landroidx/compose/runtime/h3;)V", "Landroidx/compose/runtime/t;", "composer", "Lkotlin/k2;", "j", "(Landroidx/compose/runtime/t;)V", "Landroidx/compose/runtime/tooling/g;", "observer", "Landroidx/compose/runtime/tooling/d;", "z", "(Landroidx/compose/runtime/tooling/g;)Landroidx/compose/runtime/tooling/d;", "", "value", "Landroidx/compose/runtime/s1;", "w", "(Ljava/lang/Object;)Landroidx/compose/runtime/s1;", "B", "()V", "i", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(Lld/p;)V", "token", "M", "(I)V", "D", "instance", "", "A", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/collection/d;", "instances", "y", "(Landroidx/compose/runtime/collection/d;)Z", "C", "Lkotlin/Function1;", "Landroidx/compose/runtime/y;", "k", "(I)Lld/l;", "I", "flags", "b", "Landroidx/compose/runtime/h3;", "Landroidx/compose/runtime/d;", "c", "Landroidx/compose/runtime/d;", "l", "()Landroidx/compose/runtime/d;", "E", "(Landroidx/compose/runtime/d;)V", "anchor", "d", "Lld/p;", "e", "Landroidx/compose/runtime/tooling/g;", "q", "f", "currentToken", "Landroidx/collection/g2;", "g", "Landroidx/collection/g2;", "trackedInstances", "Landroidx/collection/j2;", "Landroidx/compose/runtime/r0;", "h", "Landroidx/collection/j2;", "trackedDependencies", "s", "()Z", "J", "(Z)V", "rereading", "t", "K", "skipped", "v", "valid", "m", "canRecompose", "u", "L", "used", "n", "F", "defaultsInScope", "o", "G", "defaultsInvalid", "r", "requiresRecompose", "p", "H", "forcedRecompose", "x", "isConditional", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,444:1\n82#2:445\n1#3:446\n1726#4,3:447\n401#5,4:450\n373#5,6:454\n383#5,3:461\n386#5,2:465\n406#5,2:467\n389#5,6:469\n408#5:475\n449#5:476\n401#5,4:477\n373#5,6:481\n383#5,3:488\n386#5,2:492\n406#5:494\n450#5,2:495\n407#5:497\n389#5,6:498\n408#5:504\n452#5:505\n1810#6:460\n1672#6:464\n1810#6:487\n1672#6:491\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:445\n353#1:447,3\n371#1:450,4\n371#1:454,6\n371#1:461,3\n371#1:465,2\n371#1:467,2\n371#1:469,6\n371#1:475\n394#1:476\n394#1:477,4\n394#1:481,6\n394#1:488,3\n394#1:492,2\n394#1:494\n394#1:495,2\n394#1:497\n394#1:498,6\n394#1:504\n394#1:505\n371#1:460\n371#1:464\n394#1:487\n394#1:491\n*E\n"})
/* loaded from: classes.dex */
public final class f3 implements t3, e3 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: j, reason: collision with root package name */
    public static final int f16400j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h3 owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super t, ? super Integer, kotlin.k2> block;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.tooling.g observer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.collection.g2<Object> trackedInstances;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.collection.j2<r0<?>, Object> trackedDependencies;

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/f3$a;", "", "<init>", "()V", "Landroidx/compose/runtime/a4;", "slots", "", "Landroidx/compose/runtime/d;", "anchors", "Landroidx/compose/runtime/h3;", "newOwner", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/a4;Ljava/util/List;Landroidx/compose/runtime/h3;)V", "Landroidx/compose/runtime/x3;", "", "b", "(Landroidx/compose/runtime/x3;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,444:1\n33#2,6:445\n93#2,2:451\n33#2,4:453\n95#2,2:457\n38#2:459\n97#2:460\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n429#1:445,6\n439#1:451,2\n439#1:453,4\n439#1:457,2\n439#1:459\n439#1:460\n*E\n"})
    /* renamed from: androidx.compose.runtime.f3$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final void a(@fg.l a4 slots, @fg.l List<d> anchors, @fg.l h3 newOwner) {
            if (anchors.isEmpty()) {
                return;
            }
            int size = anchors.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object p12 = slots.p1(anchors.get(i4), 0);
                f3 f3Var = p12 instanceof f3 ? (f3) p12 : null;
                if (f3Var != null) {
                    f3Var.i(newOwner);
                }
            }
        }

        public final boolean b(@fg.l x3 slots, @fg.l List<d> anchors) {
            if (anchors.isEmpty()) {
                return false;
            }
            int size = anchors.size();
            for (int i4 = 0; i4 < size; i4++) {
                d dVar = anchors.get(i4);
                if (slots.f0(dVar) && (slots.m0(slots.i(dVar), 0) instanceof f3)) {
                    return true;
                }
            }
            return false;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/y;", "composition", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/y;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,444:1\n843#2:445\n845#2,4:459\n849#2:469\n373#3,6:446\n383#3,3:453\n386#3,2:457\n389#3,6:463\n1810#4:452\n1672#4:456\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n400#1:445\n400#1:459,4\n400#1:469\n400#1:446,6\n400#1:453,3\n400#1:457,2\n400#1:463,6\n400#1:452\n400#1:456\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<y, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.g2<Object> f16411d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, androidx.collection.g2<Object> g2Var) {
            super(1);
            this.f16410c = i4;
            this.f16411d = g2Var;
        }

        public final void a(@fg.l y yVar) {
            int i4;
            y yVar2 = yVar;
            if (f3.this.currentToken == this.f16410c && kotlin.jvm.internal.l0.g(this.f16411d, f3.this.trackedInstances) && (yVar2 instanceof b0)) {
                androidx.collection.g2<Object> g2Var = this.f16411d;
                int i5 = this.f16410c;
                f3 f3Var = f3.this;
                long[] jArr = g2Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j4 = jArr[i6];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i10 = 8 - ((~(i6 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((255 & j4) < 128) {
                                    int i12 = (i6 << 3) + i11;
                                    Object obj = g2Var.keys[i12];
                                    boolean z4 = g2Var.values[i12] != i5;
                                    if (z4) {
                                        b0 b0Var = (b0) yVar2;
                                        b0Var.d0(obj, f3Var);
                                        r0<?> r0Var = obj instanceof r0 ? (r0) obj : null;
                                        if (r0Var != null) {
                                            b0Var.c0(r0Var);
                                            androidx.collection.j2 j2Var = f3Var.trackedDependencies;
                                            if (j2Var != null) {
                                                j2Var.k0(r0Var);
                                                if (j2Var._size == 0) {
                                                    f3Var.trackedDependencies = null;
                                                }
                                            }
                                        }
                                    }
                                    if (z4) {
                                        g2Var.j0(i12);
                                    }
                                    i4 = 8;
                                } else {
                                    i4 = i7;
                                }
                                j4 >>= i4;
                                i11++;
                                i7 = i4;
                                yVar2 = yVar;
                            }
                            if (i10 != i7) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        yVar2 = yVar;
                    }
                }
                if (this.f16411d._size == 0) {
                    f3.this.trackedInstances = null;
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(y yVar) {
            a(yVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/f3$c", "Landroidx/compose/runtime/tooling/d;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,444:1\n82#2:445\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$observe$2\n*L\n202#1:445\n*E\n"})
    public static final class c implements androidx.compose.runtime.tooling.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.tooling.g f16413b;

        c(androidx.compose.runtime.tooling.g gVar) {
            this.f16413b = gVar;
        }

        @Override // androidx.compose.runtime.tooling.d
        public void dispose() {
            Object obj;
            obj = g3.f16431k;
            f3 f3Var = f3.this;
            androidx.compose.runtime.tooling.g gVar = this.f16413b;
            synchronized (obj) {
                try {
                    if (kotlin.jvm.internal.l0.g(f3Var.observer, gVar)) {
                        f3Var.observer = null;
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public f3(@fg.m h3 h3Var) {
        this.owner = h3Var;
    }

    private final void J(boolean z4) {
        if (z4) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void K(boolean z4) {
        if (z4) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    @d1
    private static /* synthetic */ void q() {
    }

    private final boolean s() {
        return (this.flags & 32) != 0;
    }

    public final boolean A(@fg.l Object instance) {
        int i4 = 0;
        if (s()) {
            return false;
        }
        androidx.collection.g2<Object> g2Var = this.trackedInstances;
        kotlin.jvm.internal.w wVar = null;
        int i5 = 1;
        if (g2Var == null) {
            g2Var = new androidx.collection.g2<>(i4, i5, wVar);
            this.trackedInstances = g2Var;
        }
        if (g2Var.c0(instance, this.currentToken, -1) == this.currentToken) {
            return true;
        }
        if (instance instanceof r0) {
            androidx.collection.j2<r0<?>, Object> j2Var = this.trackedDependencies;
            if (j2Var == null) {
                j2Var = new androidx.collection.j2<>(i4, i5, wVar);
                this.trackedDependencies = j2Var;
            }
            j2Var.q0(instance, ((r0) instance).P().a());
        }
        return false;
    }

    public final void B() {
        h3 h3Var = this.owner;
        if (h3Var != null) {
            h3Var.c(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        androidx.compose.runtime.tooling.g gVar = this.observer;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void C() {
        androidx.collection.g2<Object> g2Var;
        h3 h3Var = this.owner;
        if (h3Var == null || (g2Var = this.trackedInstances) == null) {
            return;
        }
        J(true);
        try {
            Object[] objArr = g2Var.keys;
            int[] iArr = g2Var.values;
            long[] jArr = g2Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr[i4];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j4) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj = objArr[i7];
                                int i10 = iArr[i7];
                                h3Var.a(obj);
                            }
                            j4 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        } finally {
            J(false);
        }
    }

    public final void D() {
        K(true);
    }

    public final void E(@fg.m d dVar) {
        this.anchor = dVar;
    }

    public final void F(boolean z4) {
        if (z4) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void G(boolean z4) {
        if (z4) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void H(boolean z4) {
        if (z4) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void I(boolean z4) {
        if (z4) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void L(boolean z4) {
        if (z4) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void M(int token) {
        this.currentToken = token;
        K(false);
    }

    @Override // androidx.compose.runtime.t3
    public void a(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> block) {
        this.block = block;
    }

    public final void i(@fg.l h3 owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.runtime.e3
    public void invalidate() {
        h3 h3Var = this.owner;
        if (h3Var != null) {
            h3Var.d(this, null);
        }
    }

    public final void j(@fg.l t composer) {
        kotlin.k2 k2Var;
        ld.p<? super t, ? super Integer, kotlin.k2> pVar = this.block;
        androidx.compose.runtime.tooling.g gVar = this.observer;
        if (gVar != null && pVar != null) {
            gVar.b(this);
            try {
                pVar.invoke(composer, 1);
                return;
            } finally {
                gVar.c(this);
            }
        }
        if (pVar != null) {
            pVar.invoke(composer, 1);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @fg.m
    public final ld.l<y, kotlin.k2> k(int token) {
        androidx.collection.g2<Object> g2Var = this.trackedInstances;
        if (g2Var == null || t()) {
            return null;
        }
        Object[] objArr = g2Var.keys;
        int[] iArr = g2Var.values;
        long[] jArr = g2Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = objArr[i7];
                        if (iArr[i7] != token) {
                            return new b(token, g2Var);
                        }
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return null;
                }
            }
            if (i4 == length) {
                return null;
            }
            i4++;
        }
    }

    @fg.m
    /* renamed from: l, reason: from getter */
    public final d getAnchor() {
        return this.anchor;
    }

    public final boolean m() {
        return this.block != null;
    }

    public final boolean n() {
        return (this.flags & 2) != 0;
    }

    public final boolean o() {
        return (this.flags & 4) != 0;
    }

    public final boolean p() {
        return (this.flags & 64) != 0;
    }

    public final boolean r() {
        return (this.flags & 8) != 0;
    }

    public final boolean t() {
        return (this.flags & 16) != 0;
    }

    public final boolean u() {
        return (this.flags & 1) != 0;
    }

    public final boolean v() {
        if (this.owner == null) {
            return false;
        }
        d dVar = this.anchor;
        return dVar != null ? dVar.b() : false;
    }

    @fg.l
    public final s1 w(@fg.m Object value) {
        s1 d5;
        h3 h3Var = this.owner;
        return (h3Var == null || (d5 = h3Var.d(this, value)) == null) ? s1.IGNORED : d5;
    }

    public final boolean x() {
        return this.trackedDependencies != null;
    }

    public final boolean y(@fg.m androidx.compose.runtime.collection.d<Object> instances) {
        androidx.collection.j2<r0<?>, Object> j2Var;
        if (instances != null && (j2Var = this.trackedDependencies) != null && instances.q()) {
            if (instances.isEmpty()) {
                return false;
            }
            for (Object obj : instances) {
                if (obj instanceof r0) {
                    r0<?> r0Var = (r0) obj;
                    m4<?> e4 = r0Var.e();
                    if (e4 == null) {
                        e4 = s4.c();
                    }
                    if (e4.c(r0Var.P().a(), j2Var.p(r0Var))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @d1
    @fg.l
    public final androidx.compose.runtime.tooling.d z(@fg.l androidx.compose.runtime.tooling.g observer) {
        Object obj;
        obj = g3.f16431k;
        synchronized (obj) {
            this.observer = observer;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
        return new c(observer);
    }
}
