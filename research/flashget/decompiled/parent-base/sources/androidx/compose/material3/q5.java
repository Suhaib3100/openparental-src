package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.m;
import androidx.constraintlayout.core.motion.utils.w;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material3/q5;", "", "Landroidx/compose/ui/unit/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/h;", "d", "(Landroidx/compose/foundation/interaction/h;)F", "Lkotlin/k2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "(FFFFLkotlin/coroutines/d;)Ljava/lang/Object;", "to", "b", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/b5;", "c", "()Landroidx/compose/runtime/b5;", "a", "F", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/b;", "animatable", "Landroidx/compose/foundation/interaction/h;", "lastTargetInteraction", "g", "targetInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float focusedElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> animatable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.h lastTargetInteraction;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.h targetInteraction;

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {623}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f13659b;

        /* renamed from: c, reason: collision with root package name */
        Object f13660c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f13661d;

        /* renamed from: f, reason: collision with root package name */
        int f13663f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f13661d = obj;
            this.f13663f |= Integer.MIN_VALUE;
            return q5.this.b(null, this);
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {w.e.f22501y}, m = "snapElevation", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f13664b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f13665c;

        /* renamed from: e, reason: collision with root package name */
        int f13667e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f13665c = obj;
            this.f13667e |= Integer.MIN_VALUE;
            return q5.this.e(this);
        }
    }

    public /* synthetic */ q5(float f4, float f5, float f6, float f7, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7);
    }

    private final float d(androidx.compose.foundation.interaction.h hVar) {
        return hVar instanceof m.b ? this.pressedElevation : hVar instanceof f.a ? this.hoveredElevation : hVar instanceof d.a ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.q5.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.q5$b r0 = (androidx.compose.material3.q5.b) r0
            int r1 = r0.f13667e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13667e = r1
            goto L18
        L13:
            androidx.compose.material3.q5$b r0 = new androidx.compose.material3.q5$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13665c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f13667e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f13664b
            androidx.compose.material3.q5 r0 = (androidx.compose.material3.q5) r0
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L62
        L2b:
            r5 = move-exception
            goto L69
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.a1.n(r5)
            androidx.compose.foundation.interaction.h r5 = r4.targetInteraction
            float r5 = r4.d(r5)
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> r2 = r4.animatable
            java.lang.Object r2 = r2.s()
            androidx.compose.ui.unit.h r2 = (androidx.compose.ui.unit.h) r2
            float r2 = r2.u()
            boolean r2 = androidx.compose.ui.unit.h.l(r2, r5)
            if (r2 != 0) goto L6e
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> r2 = r4.animatable     // Catch: java.lang.Throwable -> L67
            androidx.compose.ui.unit.h r5 = androidx.compose.ui.unit.h.d(r5)     // Catch: java.lang.Throwable -> L67
            r0.f13664b = r4     // Catch: java.lang.Throwable -> L67
            r0.f13667e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r2.C(r5, r0)     // Catch: java.lang.Throwable -> L67
            if (r5 != r1) goto L61
            return r1
        L61:
            r0 = r4
        L62:
            androidx.compose.foundation.interaction.h r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L6e
        L67:
            r5 = move-exception
            r0 = r4
        L69:
            androidx.compose.foundation.interaction.h r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L6e:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q5.e(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@fg.m androidx.compose.foundation.interaction.h r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.q5.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.q5$a r0 = (androidx.compose.material3.q5.a) r0
            int r1 = r0.f13663f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13663f = r1
            goto L18
        L13:
            androidx.compose.material3.q5$a r0 = new androidx.compose.material3.q5$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13661d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f13663f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f13660c
            androidx.compose.foundation.interaction.h r6 = (androidx.compose.foundation.interaction.h) r6
            java.lang.Object r0 = r0.f13659b
            androidx.compose.material3.q5 r0 = (androidx.compose.material3.q5) r0
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L6e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r7)
            float r7 = r5.d(r6)
            r5.targetInteraction = r6
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> r2 = r5.animatable     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.s()     // Catch: java.lang.Throwable -> L65
            androidx.compose.ui.unit.h r2 = (androidx.compose.ui.unit.h) r2     // Catch: java.lang.Throwable -> L65
            float r2 = r2.u()     // Catch: java.lang.Throwable -> L65
            boolean r2 = androidx.compose.ui.unit.h.l(r2, r7)     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L68
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> r2 = r5.animatable     // Catch: java.lang.Throwable -> L65
            androidx.compose.foundation.interaction.h r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L65
            r0.f13659b = r5     // Catch: java.lang.Throwable -> L65
            r0.f13660c = r6     // Catch: java.lang.Throwable -> L65
            r0.f13663f = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r7 = androidx.compose.material3.b5.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L65
            if (r7 != r1) goto L68
            return r1
        L65:
            r7 = move-exception
            r0 = r5
            goto L6e
        L68:
            r0 = r5
        L69:
            r0.lastTargetInteraction = r6
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L6e:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q5.b(androidx.compose.foundation.interaction.h, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public final androidx.compose.runtime.b5<androidx.compose.ui.unit.h> c() {
        return this.animatable.j();
    }

    @fg.m
    public final Object f(float f4, float f5, float f6, float f7, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.hoveredElevation = f6;
        this.focusedElevation = f7;
        Object e4 = e(dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    private q5(float f4, float f5, float f6, float f7) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.hoveredElevation = f6;
        this.focusedElevation = f7;
        this.animatable = new androidx.compose.animation.core.b<>(androidx.compose.ui.unit.h.d(this.defaultElevation), androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
    }
}
