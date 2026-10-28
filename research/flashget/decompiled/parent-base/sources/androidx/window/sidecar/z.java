package androidx.window.sidecar;

import android.app.Activity;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import ld.p;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/z;", "Landroidx/window/layout/x;", "Landroidx/window/layout/d0;", "windowMetricsCalculator", "Landroidx/window/layout/w;", "windowBackend", "<init>", "(Landroidx/window/layout/d0;Landroidx/window/layout/w;)V", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/i;", "Landroidx/window/layout/b0;", "c", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/i;", "b", "Landroidx/window/layout/d0;", "Landroidx/window/layout/w;", "d", "a", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z implements x {

    /* renamed from: e, reason: collision with root package name */
    private static final int f35875e = 10;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d0 windowMetricsCalculator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final w windowBackend;

    /* compiled from: WindowInfoTrackerImpl.kt */
    @f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "listener", "$this$flow", "listener"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/window/layout/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends o implements p<j<? super b0>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f35878b;

        /* renamed from: c, reason: collision with root package name */
        Object f35879c;

        /* renamed from: d, reason: collision with root package name */
        int f35880d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35881e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f35883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, d<? super b> dVar) {
            super(2, dVar);
            this.f35883g = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.l lVar, b0 info) {
            l0.o(info, "info");
            lVar.M(info);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            b bVar = z.this.new b(this.f35883g, dVar);
            bVar.f35881e = obj;
            return bVar;
        }

        @Override // ld.p
        @m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l j<? super b0> jVar, @m d<? super k2> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007c A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0062, B:14:0x0074, B:16:0x007c, B:25:0x0034, B:27:0x005e), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008e -> B:8:0x001b). Please report as a decompilation issue!!! */
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
                int r1 = r9.f35880d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f35879c
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r9.f35878b
                androidx.core.util.e r4 = (androidx.core.util.e) r4
                java.lang.Object r5 = r9.f35881e
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L1d
            L1b:
                r10 = r5
                goto L62
            L1d:
                r10 = move-exception
                goto L9d
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f35879c
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r9.f35878b
                androidx.core.util.e r4 = (androidx.core.util.e) r4
                java.lang.Object r5 = r9.f35881e
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L1d
                goto L74
            L38:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f35881e
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                kotlinx.coroutines.channels.i r1 = kotlinx.coroutines.channels.i.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                kotlinx.coroutines.channels.l r1 = kotlinx.coroutines.channels.o.d(r5, r1, r6, r4, r6)
                androidx.window.layout.a0 r4 = new androidx.window.layout.a0
                r4.<init>()
                androidx.window.layout.z r5 = androidx.window.sidecar.z.this
                androidx.window.layout.w r5 = androidx.window.sidecar.z.d(r5)
                android.app.Activity r6 = r9.f35883g
                androidx.credentials.k r7 = new androidx.credentials.k
                r7.<init>()
                r5.a(r6, r7, r4)
                kotlinx.coroutines.channels.n r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
            L62:
                r9.f35881e = r10     // Catch: java.lang.Throwable -> L1d
                r9.f35878b = r4     // Catch: java.lang.Throwable -> L1d
                r9.f35879c = r1     // Catch: java.lang.Throwable -> L1d
                r9.f35880d = r3     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r5 = r1.c(r9)     // Catch: java.lang.Throwable -> L1d
                if (r5 != r0) goto L71
                return r0
            L71:
                r8 = r5
                r5 = r10
                r10 = r8
            L74:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1d
                if (r10 == 0) goto L91
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1d
                androidx.window.layout.b0 r10 = (androidx.window.sidecar.b0) r10     // Catch: java.lang.Throwable -> L1d
                r9.f35881e = r5     // Catch: java.lang.Throwable -> L1d
                r9.f35878b = r4     // Catch: java.lang.Throwable -> L1d
                r9.f35879c = r1     // Catch: java.lang.Throwable -> L1d
                r9.f35880d = r2     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r10 = r5.emit(r10, r9)     // Catch: java.lang.Throwable -> L1d
                if (r10 != r0) goto L1b
                return r0
            L91:
                androidx.window.layout.z r10 = androidx.window.sidecar.z.this
                androidx.window.layout.w r10 = androidx.window.sidecar.z.d(r10)
                r10.b(r4)
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            L9d:
                androidx.window.layout.z r0 = androidx.window.sidecar.z.this
                androidx.window.layout.w r0 = androidx.window.sidecar.z.d(r0)
                r0.b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public z(@l d0 windowMetricsCalculator, @l w windowBackend) {
        l0.p(windowMetricsCalculator, "windowMetricsCalculator");
        l0.p(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.sidecar.x
    @l
    public i<b0> c(@l Activity activity) {
        l0.p(activity, "activity");
        return k.J0(new b(activity, null));
    }
}
