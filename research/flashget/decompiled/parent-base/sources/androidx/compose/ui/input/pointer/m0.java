package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PointerInteropFilter.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@androidx.compose.ui.k
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/m0;", "Landroidx/compose/ui/input/pointer/i0;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "b", "Lld/l;", "c", "()Lld/l;", "g", "(Lld/l;)V", "onTouchEvent", "Landroidx/compose/ui/input/pointer/t0;", "value", "Landroidx/compose/ui/input/pointer/t0;", "d", "()Landroidx/compose/ui/input/pointer/t0;", "h", "(Landroidx/compose/ui/input/pointer/t0;)V", "requestDisallowInterceptTouchEvent", "Z", "()Z", "e", "(Z)V", "disallowIntercept", "Landroidx/compose/ui/input/pointer/h0;", "Landroidx/compose/ui/input/pointer/h0;", "T4", "()Landroidx/compose/ui/input/pointer/h0;", "pointerInputFilter", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 implements i0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18783f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ld.l<? super MotionEvent, Boolean> onTouchEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private t0 requestDisallowInterceptTouchEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 pointerInputFilter = new b();

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/m0$a;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/input/pointer/m0$b", "Landroidx/compose/ui/input/pointer/h0;", "Lkotlin/k2;", "m", "()V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "l", "(Landroidx/compose/ui/input/pointer/p;)V", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "h", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "g", "Landroidx/compose/ui/input/pointer/m0$a;", "d", "Landroidx/compose/ui/input/pointer/m0$a;", "state", "", "c", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,352:1\n101#2,2:353\n33#2,6:355\n103#2:361\n86#2,2:362\n33#2,6:364\n88#2:370\n101#2,2:371\n33#2,6:373\n103#2:379\n33#2,6:380\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:353,2\n223#1:355,6\n223#1:361\n238#1:362,2\n238#1:364,6\n238#1:370\n280#1:371,2\n280#1:373,6\n280#1:379\n314#1:380,6\n*E\n"})
    public static final class b extends h0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private a state = a.Unknown;

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/k2;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<MotionEvent, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f18790b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var) {
                super(1);
                this.f18790b = m0Var;
            }

            public final void a(@fg.l MotionEvent motionEvent) {
                this.f18790b.c().invoke(motionEvent);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return k2.f75408a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/k2;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.input.pointer.m0$b$b, reason: collision with other inner class name */
        static final class C0337b extends kotlin.jvm.internal.n0 implements ld.l<MotionEvent, k2> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m0 f18792c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0337b(m0 m0Var) {
                super(1);
                this.f18792c = m0Var;
            }

            public final void a(@fg.l MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f18792c.c().invoke(motionEvent);
                } else {
                    b.this.state = this.f18792c.c().invoke(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return k2.f75408a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/k2;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<MotionEvent, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f18793b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m0 m0Var) {
                super(1);
                this.f18793b = m0Var;
            }

            public final void a(@fg.l MotionEvent motionEvent) {
                this.f18793b.c().invoke(motionEvent);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return k2.f75408a;
            }
        }

        b() {
        }

        private final void l(p pointerEvent) {
            List<b0> e4 = pointerEvent.e();
            int size = e4.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (e4.get(i4).D()) {
                    if (this.state == a.Dispatching) {
                        androidx.compose.ui.layout.u layoutCoordinates = getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        i0.f.INSTANCE.getClass();
                        o0.c(pointerEvent, layoutCoordinates.r0(i0.f.f74147c), new a(m0.this));
                    }
                    this.state = a.NotDispatching;
                    return;
                }
            }
            androidx.compose.ui.layout.u layoutCoordinates2 = getLayoutCoordinates();
            if (layoutCoordinates2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            i0.f.INSTANCE.getClass();
            o0.d(pointerEvent, layoutCoordinates2.r0(i0.f.f74147c), new C0337b(m0.this));
            if (this.state == a.Dispatching) {
                int size2 = e4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    e4.get(i5).a();
                }
                h internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.f(!m0.this.getDisallowIntercept());
            }
        }

        private final void m() {
            this.state = a.Unknown;
            m0.this.e(false);
        }

        @Override // androidx.compose.ui.input.pointer.h0
        public boolean c() {
            return true;
        }

        @Override // androidx.compose.ui.input.pointer.h0
        public void g() {
            if (this.state == a.Dispatching) {
                o0.a(SystemClock.uptimeMillis(), new c(m0.this));
                m();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // androidx.compose.ui.input.pointer.h0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(@fg.l androidx.compose.ui.input.pointer.p r5, @fg.l androidx.compose.ui.input.pointer.r r6, long r7) {
            /*
                r4 = this;
                java.util.List r7 = r5.e()
                androidx.compose.ui.input.pointer.m0 r8 = androidx.compose.ui.input.pointer.m0.this
                boolean r8 = r8.getDisallowIntercept()
                r0 = 0
                if (r8 != 0) goto L2c
                int r8 = r7.size()
                r1 = r0
            L12:
                if (r1 >= r8) goto L2a
                java.lang.Object r2 = r7.get(r1)
                androidx.compose.ui.input.pointer.b0 r2 = (androidx.compose.ui.input.pointer.b0) r2
                boolean r3 = androidx.compose.ui.input.pointer.q.c(r2)
                if (r3 != 0) goto L2c
                boolean r2 = androidx.compose.ui.input.pointer.q.e(r2)
                if (r2 == 0) goto L27
                goto L2c
            L27:
                int r1 = r1 + 1
                goto L12
            L2a:
                r8 = r0
                goto L2d
            L2c:
                r8 = 1
            L2d:
                androidx.compose.ui.input.pointer.m0$a r1 = r4.state
                androidx.compose.ui.input.pointer.m0$a r2 = androidx.compose.ui.input.pointer.m0.a.NotDispatching
                if (r1 == r2) goto L45
                androidx.compose.ui.input.pointer.r r1 = androidx.compose.ui.input.pointer.r.Initial
                if (r6 != r1) goto L3c
                if (r8 == 0) goto L3c
                r4.l(r5)
            L3c:
                androidx.compose.ui.input.pointer.r r1 = androidx.compose.ui.input.pointer.r.Final
                if (r6 != r1) goto L45
                if (r8 != 0) goto L45
                r4.l(r5)
            L45:
                androidx.compose.ui.input.pointer.r r5 = androidx.compose.ui.input.pointer.r.Final
                if (r6 != r5) goto L62
                int r5 = r7.size()
            L4d:
                if (r0 >= r5) goto L5f
                java.lang.Object r6 = r7.get(r0)
                androidx.compose.ui.input.pointer.b0 r6 = (androidx.compose.ui.input.pointer.b0) r6
                boolean r6 = androidx.compose.ui.input.pointer.q.e(r6)
                if (r6 != 0) goto L5c
                goto L62
            L5c:
                int r0 = r0 + 1
                goto L4d
            L5f:
                r4.m()
            L62:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.m0.b.h(androidx.compose.ui.input.pointer.p, androidx.compose.ui.input.pointer.r, long):void");
        }
    }

    @Override // androidx.compose.ui.input.pointer.i0
    @fg.l
    /* renamed from: T4, reason: from getter */
    public h0 getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    @fg.l
    public final ld.l<MotionEvent, Boolean> c() {
        ld.l lVar = this.onTouchEvent;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.l0.S("onTouchEvent");
        return null;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final t0 getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void e(boolean z4) {
        this.disallowIntercept = z4;
    }

    public final void g(@fg.l ld.l<? super MotionEvent, Boolean> lVar) {
        this.onTouchEvent = lVar;
    }

    public final void h(@fg.m t0 t0Var) {
        t0 t0Var2 = this.requestDisallowInterceptTouchEvent;
        if (t0Var2 != null) {
            t0Var2.c(null);
        }
        this.requestDisallowInterceptTouchEvent = t0Var;
        if (t0Var == null) {
            return;
        }
        t0Var.c(this);
    }
}
