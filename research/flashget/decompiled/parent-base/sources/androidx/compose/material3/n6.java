package androidx.compose.material3;

import androidx.compose.foundation.interaction.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MappedInteractionSource.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/n6;", "Landroidx/compose/foundation/interaction/i;", "underlyingInteractionSource", "Li0/f;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/i;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/m$b;", "press", "f", "(Landroidx/compose/foundation/interaction/m$b;)Landroidx/compose/foundation/interaction/m$b;", "a", "J", "", "b", "Ljava/util/Map;", "mappedPresses", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/foundation/interaction/h;", "c", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "interactions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,65:1\n53#2:66\n55#2:70\n50#3:67\n55#3:69\n106#4:68\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n35#1:66\n35#1:70\n35#1:67\n35#1:69\n35#1:68\n*E\n"})
/* loaded from: classes.dex */
public final class n6 implements androidx.compose.foundation.interaction.i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f12675d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long delta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<m.b, m.b> mappedPresses;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> interactions;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f12679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n6 f12680c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n1#1,222:1\n54#2:223\n36#3,23:224\n*E\n"})
        /* renamed from: androidx.compose.material3.n6$a$a, reason: collision with other inner class name */
        public static final class C0274a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f12681b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n6 f12682c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.jvm.internal.r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: androidx.compose.material3.n6$a$a$a, reason: collision with other inner class name */
            public static final class C0275a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f12683b;

                /* renamed from: c, reason: collision with root package name */
                int f12684c;

                /* renamed from: d, reason: collision with root package name */
                Object f12685d;

                public C0275a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f12683b = obj;
                    this.f12684c |= Integer.MIN_VALUE;
                    return C0274a.this.emit(null, this);
                }
            }

            public C0274a(kotlinx.coroutines.flow.j jVar, n6 n6Var) {
                this.f12681b = jVar;
                this.f12682c = n6Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.interaction.m$b, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.foundation.interaction.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.foundation.interaction.m$c] */
            /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.foundation.interaction.m$c] */
            /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.foundation.interaction.m$a] */
            /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.foundation.interaction.m$a] */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @fg.l kotlin.coroutines.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.material3.n6.a.C0274a.C0275a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.compose.material3.n6$a$a$a r0 = (androidx.compose.material3.n6.a.C0274a.C0275a) r0
                    int r1 = r0.f12684c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12684c = r1
                    goto L18
                L13:
                    androidx.compose.material3.n6$a$a$a r0 = new androidx.compose.material3.n6$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f12683b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f12684c
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L28
                    kotlin.a1.n(r7)
                    goto L95
                L28:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L30:
                    kotlin.a1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f12681b
                    androidx.compose.foundation.interaction.h r6 = (androidx.compose.foundation.interaction.h) r6
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.m.b
                    if (r2 == 0) goto L4f
                    androidx.compose.material3.n6 r2 = r5.f12682c
                    r4 = r6
                    androidx.compose.foundation.interaction.m$b r4 = (androidx.compose.foundation.interaction.m.b) r4
                    androidx.compose.foundation.interaction.m$b r2 = androidx.compose.material3.n6.e(r2, r4)
                    androidx.compose.material3.n6 r4 = r5.f12682c
                    java.util.Map r4 = androidx.compose.material3.n6.d(r4)
                    r4.put(r6, r2)
                    r6 = r2
                    goto L8c
                L4f:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.m.a
                    if (r2 == 0) goto L6e
                    androidx.compose.material3.n6 r2 = r5.f12682c
                    java.util.Map r2 = androidx.compose.material3.n6.d(r2)
                    androidx.compose.foundation.interaction.m$a r6 = (androidx.compose.foundation.interaction.m.a) r6
                    androidx.compose.foundation.interaction.m$b r4 = r6.getPress()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.m$b r2 = (androidx.compose.foundation.interaction.m.b) r2
                    if (r2 != 0) goto L68
                    goto L8c
                L68:
                    androidx.compose.foundation.interaction.m$a r6 = new androidx.compose.foundation.interaction.m$a
                    r6.<init>(r2)
                    goto L8c
                L6e:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.m.c
                    if (r2 == 0) goto L8c
                    androidx.compose.material3.n6 r2 = r5.f12682c
                    java.util.Map r2 = androidx.compose.material3.n6.d(r2)
                    androidx.compose.foundation.interaction.m$c r6 = (androidx.compose.foundation.interaction.m.c) r6
                    androidx.compose.foundation.interaction.m$b r4 = r6.getPress()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.m$b r2 = (androidx.compose.foundation.interaction.m.b) r2
                    if (r2 != 0) goto L87
                    goto L8c
                L87:
                    androidx.compose.foundation.interaction.m$c r6 = new androidx.compose.foundation.interaction.m$c
                    r6.<init>(r2)
                L8c:
                    r0.f12684c = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L95
                    return r1
                L95:
                    kotlin.k2 r6 = kotlin.k2.f75408a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n6.a.C0274a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, n6 n6Var) {
            this.f12679b = iVar;
            this.f12680c = n6Var;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super androidx.compose.foundation.interaction.h> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f12679b.a(new C0274a(jVar, this.f12680c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ n6(androidx.compose.foundation.interaction.i iVar, long j4, kotlin.jvm.internal.w wVar) {
        this(iVar, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.b f(m.b press) {
        return new m.b(i0.f.u(press.getPressPosition(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.i
    @fg.l
    public kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c() {
        return this.interactions;
    }

    private n6(androidx.compose.foundation.interaction.i iVar, long j4) {
        this.delta = j4;
        this.mappedPresses = new LinkedHashMap();
        this.interactions = new a(iVar.c(), this);
    }
}
