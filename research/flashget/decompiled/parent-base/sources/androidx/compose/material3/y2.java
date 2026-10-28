package androidx.compose.material3;

import androidx.compose.material3.u8;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/material3/y2;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/b0;", "Landroidx/compose/material3/db;", "state", "", "autoSwitchToMinute", "<init>", "(Landroidx/compose/material3/db;Z)V", "Landroidx/compose/ui/unit/u;", "size", "Lkotlin/k2;", "l", "(J)V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "()V", "R7", "s", "Landroidx/compose/material3/db;", "t", "Z", "", "u", "F", "offsetX", "v", "offsetY", "Landroidx/compose/ui/input/pointer/v0;", "w", "Landroidx/compose/ui/input/pointer/v0;", "pointerInputTapNode", "x", "pointerInputDragNode", "Q7", "()F", "maxDist", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1843:1\n1#2:1844\n*E\n"})
/* loaded from: classes.dex */
public final class y2 extends androidx.compose.ui.node.l implements androidx.compose.ui.node.u1, androidx.compose.ui.node.h, androidx.compose.ui.node.b0 {

    /* renamed from: y, reason: collision with root package name */
    public static final int f15758y = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private db state;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean autoSwitchToMinute;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float offsetX;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float offsetY;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.v0 pointerInputTapNode = (androidx.compose.ui.input.pointer.v0) y7(androidx.compose.ui.input.pointer.u0.a(new b(null)));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.v0 pointerInputDragNode = (androidx.compose.ui.input.pointer.v0) y7(new androidx.compose.ui.input.pointer.w0(new a(null)));

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", i = {}, l = {1292}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f15765b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15766c;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.y2$a$a, reason: collision with other inner class name */
        static final class C0301a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y2 f15768b;

            /* compiled from: TimePicker.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", i = {}, l = {1296, 1298}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.y2$a$a$a, reason: collision with other inner class name */
            static final class C0302a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f15769b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y2 f15770c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0302a(y2 y2Var, kotlin.coroutines.d<? super C0302a> dVar) {
                    super(2, dVar);
                    this.f15770c = y2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0302a(this.f15770c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f15769b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        int l4 = this.f15770c.state.l();
                        u8.Companion companion = u8.INSTANCE;
                        companion.getClass();
                        if (u8.f(l4, u8.f14967c) && this.f15770c.autoSwitchToMinute) {
                            db dbVar = this.f15770c.state;
                            companion.getClass();
                            dbVar.E(u8.f14968d);
                            db dbVar2 = this.f15770c.state;
                            this.f15769b = 1;
                            if (dbVar2.d(this) == aVar) {
                                return aVar;
                            }
                        } else {
                            int l5 = this.f15770c.state.l();
                            companion.getClass();
                            if (u8.f(l5, u8.f14968d)) {
                                db dbVar3 = this.f15770c.state;
                                this.f15769b = 2;
                                if (dbVar3.F(this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    } else {
                        if (i4 != 1 && i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0302a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0301a(y2 y2Var) {
                super(0);
                this.f15768b = y2Var;
            }

            public final void a() {
                kotlinx.coroutines.k.f(this.f15768b.V6(), null, null, new C0302a(this.f15768b, null), 3, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "<anonymous parameter 0>", "Li0/f;", "dragAmount", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y2 f15771b;

            /* compiled from: TimePicker.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1305}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.y2$a$b$a, reason: collision with other inner class name */
            static final class C0303a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f15772b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y2 f15773c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f15774d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0303a(y2 y2Var, long j4, kotlin.coroutines.d<? super C0303a> dVar) {
                    super(2, dVar);
                    this.f15773c = y2Var;
                    this.f15774d = j4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0303a(this.f15773c, this.f15774d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    float e02;
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f15772b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        y2 y2Var = this.f15773c;
                        y2Var.offsetX = i0.f.p(this.f15774d) + y2Var.offsetX;
                        y2 y2Var2 = this.f15773c;
                        y2Var2.offsetY = i0.f.r(this.f15774d) + y2Var2.offsetY;
                        db dbVar = this.f15773c.state;
                        e02 = bb.e0(this.f15773c.offsetY - androidx.compose.ui.unit.q.o(this.f15773c.state.e()), this.f15773c.offsetX - ((int) (this.f15773c.state.e() >> 32)));
                        this.f15772b = 1;
                        if (db.J(dbVar, e02, false, this, 2, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0303a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y2 y2Var) {
                super(2);
                this.f15771b = y2Var;
            }

            public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
                kotlinx.coroutines.k.f(this.f15771b.V6(), null, null, new C0303a(this.f15771b, j4, null), 3, null);
                this.f15771b.state.u(this.f15771b.offsetX, this.f15771b.offsetY, this.f15771b.Q7());
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
                a(b0Var, fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = y2.this.new a(dVar);
            aVar.f15766c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f15765b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f15766c;
                C0301a c0301a = new C0301a(y2.this);
                b bVar = new b(y2.this);
                this.f15765b = 1;
                if (androidx.compose.foundation.gestures.u.o(k0Var, null, c0301a, null, bVar, this, 5, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", f = "TimePicker.kt", i = {}, l = {1280}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f15775b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15776c;

        /* compiled from: TimePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f15778b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ long f15779c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ y2 f15780d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y2 y2Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f15780d = y2Var;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ Object R(androidx.compose.foundation.gestures.l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return a(l0Var, fVar.getPackedValue(), dVar);
            }

            @fg.m
            public final Object a(@fg.l androidx.compose.foundation.gestures.l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                a aVar = new a(this.f15780d, dVar);
                aVar.f15779c = j4;
                return aVar.invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f15778b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                long j4 = this.f15779c;
                this.f15780d.offsetX = i0.f.p(j4);
                this.f15780d.offsetY = i0.f.r(j4);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.y2$b$b, reason: collision with other inner class name */
        static final class C0304b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y2 f15781b;

            /* compiled from: TimePicker.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1286}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.y2$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f15782b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y2 f15783c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f15784d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(y2 y2Var, long j4, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f15783c = y2Var;
                    this.f15784d = j4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new a(this.f15783c, this.f15784d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f15782b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        db dbVar = this.f15783c.state;
                        float p4 = i0.f.p(this.f15784d);
                        float r4 = i0.f.r(this.f15784d);
                        float Q7 = this.f15783c.Q7();
                        boolean z4 = this.f15783c.autoSwitchToMinute;
                        this.f15782b = 1;
                        if (dbVar.w(p4, r4, Q7, z4, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0304b(y2 y2Var) {
                super(1);
                this.f15781b = y2Var;
            }

            public final void a(long j4) {
                kotlinx.coroutines.k.f(this.f15781b.V6(), null, null, new a(this.f15781b, j4, null), 3, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = y2.this.new b(dVar);
            bVar.f15776c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f15775b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f15776c;
                a aVar2 = new a(y2.this, null);
                C0304b c0304b = new C0304b(y2.this);
                this.f15775b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, aVar2, c0304b, this, 3, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    public y2(@fg.l db dbVar, boolean z4) {
        this.state = dbVar;
        this.autoSwitchToMinute = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Q7() {
        float f4;
        androidx.compose.ui.unit.d n4 = androidx.compose.ui.node.k.n(this);
        f4 = bb.f10006m;
        return n4.v5(f4);
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        this.pointerInputTapNode.E4();
        this.pointerInputDragNode.E4();
    }

    public final void R7(@fg.l db state, boolean autoSwitchToMinute) {
        this.state = state;
        this.autoSwitchToMinute = autoSwitchToMinute;
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        this.pointerInputTapNode.g1(pointerEvent, pass, bounds);
        this.pointerInputDragNode.g1(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.b0
    public void l(long size) {
        this.state.y(androidx.compose.ui.unit.v.b(size));
    }
}
