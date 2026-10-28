package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/foundation/gestures/e1;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/foundation/gestures/f1;", "state", "Lkotlin/Function1;", "Li0/f;", "", "canPan", "lockRotationOnZoomPan", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/f1;Lld/l;ZZ)V", "Lkotlin/k2;", "P7", "s", "Landroidx/compose/foundation/gestures/f1;", "t", "Lld/l;", "u", "Z", "v", "w", "updatedCanPan", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/a1;", "x", "Lkotlinx/coroutines/channels/l;", "channel", "Landroidx/compose/ui/input/pointer/v0;", "y", "Landroidx/compose/ui/input/pointer/v0;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e1 extends androidx.compose.ui.node.l {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f1 state;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super i0.f, Boolean> canPan;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean lockRotationOnZoomPan;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<i0.f, Boolean> updatedCanPan = new b();

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<a1> channel = kotlinx.coroutines.channels.o.d(Integer.MAX_VALUE, null, null, 6, null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.v0 pointerInputNode = (androidx.compose.ui.input.pointer.v0) y7(androidx.compose.ui.input.pointer.u0.a(new a(null)));

    /* compiled from: Transformable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1", f = "Transformable.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3931b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3932c;

        /* compiled from: Transformable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.e1$a$a, reason: collision with other inner class name */
        static final class C0061a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3934b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f3935c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f3936d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e1 f3937e;

            /* compiled from: Transformable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {158, 161}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch"}, s = {"L$0", "L$1", "L$0"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.e1$a$a$a, reason: collision with other inner class name */
            static final class C0062a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                Object f3938b;

                /* renamed from: c, reason: collision with root package name */
                Object f3939c;

                /* renamed from: d, reason: collision with root package name */
                int f3940d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f3941e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ e1 f3942f;

                /* compiled from: Transformable.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.gestures.e1$a$a$a$a, reason: collision with other inner class name */
                static final class C0063a extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    Object f3943b;

                    /* renamed from: c, reason: collision with root package name */
                    int f3944c;

                    /* renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f3945d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ k1.h<a1> f3946e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ e1 f3947f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0063a(k1.h<a1> hVar, e1 e1Var, kotlin.coroutines.d<? super C0063a> dVar) {
                        super(2, dVar);
                        this.f3946e = hVar;
                        this.f3947f = e1Var;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C0063a) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0063a c0063a = new C0063a(this.f3946e, this.f3947f, dVar);
                        c0063a.f3945d = obj;
                        return c0063a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0058 -> B:5:0x005b). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
                        /*
                            r6 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r1 = r6.f3944c
                            r2 = 1
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r1 = r6.f3943b
                            kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                            java.lang.Object r3 = r6.f3945d
                            androidx.compose.foundation.gestures.c1 r3 = (androidx.compose.foundation.gestures.c1) r3
                            kotlin.a1.n(r7)
                            goto L5b
                        L15:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1d:
                            kotlin.a1.n(r7)
                            java.lang.Object r7 = r6.f3945d
                            androidx.compose.foundation.gestures.c1 r7 = (androidx.compose.foundation.gestures.c1) r7
                            r3 = r7
                        L25:
                            kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.a1> r7 = r6.f3946e
                            T r7 = r7.f75329b
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.a1.c
                            if (r1 != 0) goto L5e
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.a1.a
                            if (r1 == 0) goto L34
                            androidx.compose.foundation.gestures.a1$a r7 = (androidx.compose.foundation.gestures.a1.a) r7
                            goto L35
                        L34:
                            r7 = 0
                        L35:
                            if (r7 == 0) goto L46
                            float r1 = r7.getZoomChange()
                            long r4 = r7.getPanChange()
                            float r7 = r7.getRotationChange()
                            r3.a(r1, r4, r7)
                        L46:
                            kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.a1> r1 = r6.f3946e
                            androidx.compose.foundation.gestures.e1 r7 = r6.f3947f
                            kotlinx.coroutines.channels.l r7 = androidx.compose.foundation.gestures.e1.K7(r7)
                            r6.f3945d = r3
                            r6.f3943b = r1
                            r6.f3944c = r2
                            java.lang.Object r7 = r7.a0(r6)
                            if (r7 != r0) goto L5b
                            return r0
                        L5b:
                            r1.f75329b = r7
                            goto L25
                        L5e:
                            kotlin.k2 r7 = kotlin.k2.f75408a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e1.a.C0061a.C0062a.C0063a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0062a(e1 e1Var, kotlin.coroutines.d<? super C0062a> dVar) {
                    super(2, dVar);
                    this.f3942f = e1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0062a c0062a = new C0062a(this.f3942f, dVar);
                    c0062a.f3941e = obj;
                    return c0062a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:9:0x0034). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
                    /*
                        r9 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r9.f3940d
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2d
                        if (r1 == r3) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r9.f3941e
                        kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                        kotlin.a1.n(r10)     // Catch: java.util.concurrent.CancellationException -> L13
                    L13:
                        r10 = r1
                        goto L34
                    L15:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1d:
                        java.lang.Object r1 = r9.f3939c
                        kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                        java.lang.Object r4 = r9.f3938b
                        kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
                        java.lang.Object r5 = r9.f3941e
                        kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                        kotlin.a1.n(r10)
                        goto L57
                    L2d:
                        kotlin.a1.n(r10)
                        java.lang.Object r10 = r9.f3941e
                        kotlinx.coroutines.r0 r10 = (kotlinx.coroutines.r0) r10
                    L34:
                        boolean r1 = kotlinx.coroutines.s0.k(r10)
                        if (r1 == 0) goto L80
                        kotlin.jvm.internal.k1$h r1 = new kotlin.jvm.internal.k1$h
                        r1.<init>()
                        androidx.compose.foundation.gestures.e1 r4 = r9.f3942f
                        kotlinx.coroutines.channels.l r4 = androidx.compose.foundation.gestures.e1.K7(r4)
                        r9.f3941e = r10
                        r9.f3938b = r1
                        r9.f3939c = r1
                        r9.f3940d = r3
                        java.lang.Object r4 = r4.a0(r9)
                        if (r4 != r0) goto L54
                        return r0
                    L54:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L57:
                        r1.f75329b = r10
                        T r10 = r4.f75329b
                        boolean r10 = r10 instanceof androidx.compose.foundation.gestures.a1.b
                        if (r10 == 0) goto L7e
                        androidx.compose.foundation.gestures.e1 r10 = r9.f3942f     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.gestures.f1 r10 = androidx.compose.foundation.gestures.e1.N7(r10)     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.a2 r1 = androidx.compose.foundation.a2.UserInput     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.gestures.e1$a$a$a$a r6 = new androidx.compose.foundation.gestures.e1$a$a$a$a     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.gestures.e1 r7 = r9.f3942f     // Catch: java.util.concurrent.CancellationException -> L7e
                        r8 = 0
                        r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L7e
                        r9.f3941e = r5     // Catch: java.util.concurrent.CancellationException -> L7e
                        r9.f3938b = r8     // Catch: java.util.concurrent.CancellationException -> L7e
                        r9.f3939c = r8     // Catch: java.util.concurrent.CancellationException -> L7e
                        r9.f3940d = r2     // Catch: java.util.concurrent.CancellationException -> L7e
                        java.lang.Object r10 = r10.a(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L7e
                        if (r10 != r0) goto L7e
                        return r0
                    L7e:
                        r10 = r5
                        goto L34
                    L80:
                        kotlin.k2 r10 = kotlin.k2.f75408a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e1.a.C0061a.C0062a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0062a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: Transformable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.e1$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f3948c;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f3949d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ e1 f3950e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f3951f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(e1 e1Var, kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f3950e = e1Var;
                    this.f3951f = r0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((b) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    b bVar = new b(this.f3950e, this.f3951f, dVar);
                    bVar.f3949d = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f3948c;
                    try {
                        try {
                            if (i4 == 0) {
                                kotlin.a1.n(obj);
                                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f3949d;
                                boolean z4 = this.f3950e.lockRotationOnZoomPan;
                                kotlinx.coroutines.channels.l lVar = this.f3950e.channel;
                                ld.l lVar2 = this.f3950e.updatedCanPan;
                                this.f3948c = 1;
                                if (d1.b(cVar, z4, lVar, lVar2, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a1.n(obj);
                            }
                        } catch (CancellationException e4) {
                            if (!kotlinx.coroutines.s0.k(this.f3951f)) {
                                throw e4;
                            }
                        }
                        return k2.f75408a;
                    } finally {
                        this.f3950e.channel.M(a1.c.f3768a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0061a(androidx.compose.ui.input.pointer.k0 k0Var, e1 e1Var, kotlin.coroutines.d<? super C0061a> dVar) {
                super(2, dVar);
                this.f3936d = k0Var;
                this.f3937e = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0061a c0061a = new C0061a(this.f3936d, this.f3937e, dVar);
                c0061a.f3935c = obj;
                return c0061a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3934b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f3935c;
                    kotlinx.coroutines.k.f(r0Var, null, kotlinx.coroutines.t0.UNDISPATCHED, new C0062a(this.f3937e, null), 1, null);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f3936d;
                    b bVar = new b(this.f3937e, r0Var, null);
                    this.f3934b = 1;
                    if (f0.d(k0Var, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0061a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = e1.this.new a(dVar);
            aVar.f3932c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3931b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f3932c;
                if (!e1.this.enabled) {
                    return k2.f75408a;
                }
                C0061a c0061a = new C0061a(k0Var, e1.this, null);
                this.f3931b = 1;
                if (kotlinx.coroutines.s0.g(c0061a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, Boolean> {
        b() {
            super(1);
        }

        @fg.l
        public final Boolean a(long j4) {
            return (Boolean) e1.this.canPan.invoke(i0.f.d(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(i0.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    public e1(@fg.l f1 f1Var, @fg.l ld.l<? super i0.f, Boolean> lVar, boolean z4, boolean z5) {
        this.state = f1Var;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z4;
        this.enabled = z5;
    }

    public final void P7(@fg.l f1 state, @fg.l ld.l<? super i0.f, Boolean> canPan, boolean lockRotationOnZoomPan, boolean enabled) {
        this.canPan = canPan;
        if (kotlin.jvm.internal.l0.g(this.state, state) && this.enabled == enabled && this.lockRotationOnZoomPan == lockRotationOnZoomPan) {
            return;
        }
        this.state = state;
        this.enabled = enabled;
        this.lockRotationOnZoomPan = lockRotationOnZoomPan;
        this.pointerInputNode.g3();
    }
}
