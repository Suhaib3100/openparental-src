package androidx.view.compose;

import androidx.compose.runtime.i;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.view.b0;
import androidx.view.z;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: ReportDrawn.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\f\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "", "predicate", "Lkotlin/k2;", "c", "(Lld/a;Landroidx/compose/runtime/t;I)V", "a", "(Landroidx/compose/runtime/t;I)V", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "b", "(Lld/l;Landroidx/compose/runtime/t;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f501b = new a(0);

        a() {
            super(0);
        }

        @l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(2);
            this.f502b = i4;
        }

        public final void a(@m t tVar, int i4) {
            p.a(tVar, this.f502b | 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
    static final class c extends o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f503b;

        /* renamed from: c, reason: collision with root package name */
        int f504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super k2>, Object> f506e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(z zVar, ld.l<? super kotlin.coroutines.d<? super k2>, ? extends Object> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f505d = zVar;
            this.f506e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new c(this.f505d, this.f506e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            z zVar;
            Throwable th;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f504c;
            if (i4 == 0) {
                a1.n(obj);
                z zVar2 = this.f505d;
                ld.l<kotlin.coroutines.d<? super k2>, Object> lVar = this.f506e;
                zVar2.c();
                if (!zVar2.e()) {
                    try {
                        this.f503b = zVar2;
                        this.f504c = 1;
                        if (lVar.invoke(this) == aVar) {
                            return aVar;
                        }
                        zVar = zVar2;
                    } catch (Throwable th2) {
                        zVar = zVar2;
                        th = th2;
                        zVar.h();
                        throw th;
                    }
                }
                return k2.f75408a;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) this.f503b;
            try {
                a1.n(obj);
            } catch (Throwable th3) {
                th = th3;
                zVar.h();
                throw th;
            }
            zVar.h();
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super k2>, Object> f507b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f508c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super kotlin.coroutines.d<? super k2>, ? extends Object> lVar, int i4) {
            super(2);
            this.f507b = lVar;
            this.f508c = i4;
        }

        public final void a(@m t tVar, int i4) {
            p.b(this.f507b, tVar, this.f508c | 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super k2>, Object> f509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.l<? super kotlin.coroutines.d<? super k2>, ? extends Object> lVar, int i4) {
            super(2);
            this.f509b = lVar;
            this.f510c = i4;
        }

        public final void a(@m t tVar, int i4) {
            p.b(this.f509b, tVar, this.f510c | 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,176:1\n62#2,5:177\n62#2,5:182\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n135#1:177,5\n138#1:182,5\n*E\n"})
    static final class f extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f512c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n135#2:484\n*E\n"})
        public static final class a implements v0 {
            @Override // androidx.compose.runtime.v0
            public void dispose() {
            }
        }

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"})
        public static final class b implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f513a;

            public b(o oVar) {
                this.f513a = oVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f513a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z zVar, ld.a<Boolean> aVar) {
            super(1);
            this.f511b = zVar;
            this.f512c = aVar;
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@l w0 w0Var) {
            return this.f511b.e() ? new a() : new b(new o(this.f511b, this.f512c));
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f514b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ld.a<Boolean> aVar, int i4) {
            super(2);
            this.f514b = aVar;
            this.f515c = i4;
        }

        public final void a(@m t tVar, int i4) {
            p.c(this.f514b, tVar, this.f515c | 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ld.a<Boolean> aVar, int i4) {
            super(2);
            this.f516b = aVar;
            this.f517c = i4;
        }

        public final void a(@m t tVar, int i4) {
            p.c(this.f516b, tVar, this.f517c | 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @i
    public static final void a(@m t tVar, int i4) {
        t o4 = tVar.o(-1357012904);
        if (i4 == 0 && o4.p()) {
            o4.d0();
        } else {
            c(a.f501b, o4, 6);
        }
        t3 t4 = o4.t();
        if (t4 == null) {
            return;
        }
        t4.a(new b(i4));
    }

    @i
    public static final void b(@l ld.l<? super kotlin.coroutines.d<? super k2>, ? extends Object> lVar, @m t tVar, int i4) {
        z fullyDrawnReporter;
        t o4 = tVar.o(945311272);
        b0 a5 = androidx.view.compose.h.f460a.a(o4, 6);
        if (a5 == null || (fullyDrawnReporter = a5.getFullyDrawnReporter()) == null) {
            t3 t4 = o4.t();
            if (t4 == null) {
                return;
            }
            t4.a(new e(lVar, i4));
            return;
        }
        androidx.compose.runtime.a1.g(lVar, fullyDrawnReporter, new c(fullyDrawnReporter, lVar, null), o4, 584);
        t3 t5 = o4.t();
        if (t5 == null) {
            return;
        }
        t5.a(new d(lVar, i4));
    }

    @i
    public static final void c(@l ld.a<Boolean> aVar, @m t tVar, int i4) {
        int i5;
        z fullyDrawnReporter;
        t o4 = tVar.o(-2047119994);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(aVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            b0 a5 = androidx.view.compose.h.f460a.a(o4, 6);
            if (a5 == null || (fullyDrawnReporter = a5.getFullyDrawnReporter()) == null) {
                t3 t4 = o4.t();
                if (t4 == null) {
                    return;
                }
                t4.a(new h(aVar, i4));
                return;
            }
            androidx.compose.runtime.a1.b(fullyDrawnReporter, aVar, new f(fullyDrawnReporter, aVar), o4, ((i5 << 3) & 112) | 8);
        }
        t3 t5 = o4.t();
        if (t5 == null) {
            return;
        }
        t5.a(new g(aVar, i4));
    }
}
