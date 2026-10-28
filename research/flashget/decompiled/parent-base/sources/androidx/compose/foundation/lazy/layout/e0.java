package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.p3;
import androidx.compose.ui.layout.r1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutPrefetcher.android.kt */
@z0
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002%'B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010\u001cJ\u000f\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010)\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010>\u001a\n ;*\u0004\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/lazy/layout/e0;", "Landroidx/compose/runtime/p3;", "Landroidx/compose/foundation/lazy/layout/d0$b;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Landroidx/compose/ui/layout/r1;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/q;", "itemContentFactory", "Landroid/view/View;", "view", "<init>", "(Landroidx/compose/foundation/lazy/layout/d0;Landroidx/compose/ui/layout/r1;Landroidx/compose/foundation/lazy/layout/q;Landroid/view/View;)V", "", "now", "nextFrame", "average", "", "h", "(JJJ)Z", "new", "current", "g", "(JJ)J", "Lkotlin/k2;", "run", "()V", "frameTimeNanos", "doFrame", "(J)V", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d0$a;", "a", "(IJ)Landroidx/compose/foundation/lazy/layout/d0$a;", "b", "d", "c", "Landroidx/compose/foundation/lazy/layout/d0;", "Landroidx/compose/ui/layout/r1;", "Landroidx/compose/foundation/lazy/layout/q;", "e", "Landroid/view/View;", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/foundation/lazy/layout/e0$b;", "f", "Landroidx/compose/runtime/collection/g;", "prefetchRequests", "J", "averagePrecomposeTimeNs", "averagePremeasureTimeNs", "i", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "j", "Landroid/view/Choreographer;", "choreographer", "k", "isActive", "l", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1208#2:320\n1187#2,2:321\n523#3:323\n26#4,5:324\n26#4,5:330\n1#5:329\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:320\n122#1:321,2\n160#1:323\n165#1:324,5\n187#1:330,5\n*E\n"})
/* loaded from: classes.dex */
public final class e0 implements p3, d0.b, Runnable, Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: m, reason: collision with root package name */
    public static final int f5945m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static long f5946n;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 prefetchState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.r1 subcomposeLayoutState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q itemContentFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long averagePrecomposeTimeNs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long averagePremeasureTimeNs;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchScheduled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<b> prefetchRequests = new androidx.compose.runtime.collection.g<>(new b[16], 0);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer = Choreographer.getInstance();

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/e0$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lkotlin/k2;", "b", "(Landroid/view/View;)V", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.e0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r5 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.e0.e()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.e0.f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.e0.Companion.b(android.view.View):void");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b \u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/layout/e0$b;", "Landroidx/compose/foundation/lazy/layout/d0$a;", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(IJLkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "cancel", "()V", "a", "I", "c", "()I", "b", "J", "()J", "Landroidx/compose/ui/layout/r1$a;", "Landroidx/compose/ui/layout/r1$a;", "e", "()Landroidx/compose/ui/layout/r1$a;", "h", "(Landroidx/compose/ui/layout/r1$a;)V", "precomposeHandle", "", "d", "Z", "()Z", "f", "(Z)V", "canceled", "g", "measured", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements d0.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private r1.a precomposeHandle;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean canceled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean measured;

        public /* synthetic */ b(int i4, long j4, kotlin.jvm.internal.w wVar) {
            this(i4, j4);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getCanceled() {
            return this.canceled;
        }

        /* renamed from: b, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @Override // androidx.compose.foundation.lazy.layout.d0.a
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            r1.a aVar = this.precomposeHandle;
            if (aVar != null) {
                aVar.dispose();
            }
            this.precomposeHandle = null;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getMeasured() {
            return this.measured;
        }

        @fg.m
        /* renamed from: e, reason: from getter */
        public final r1.a getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void f(boolean z4) {
            this.canceled = z4;
        }

        public final void g(boolean z4) {
            this.measured = z4;
        }

        public final void h(@fg.m r1.a aVar) {
            this.precomposeHandle = aVar;
        }

        private b(int i4, long j4) {
            this.index = i4;
            this.constraints = j4;
        }
    }

    public e0(@fg.l d0 d0Var, @fg.l androidx.compose.ui.layout.r1 r1Var, @fg.l q qVar, @fg.l View view) {
        this.prefetchState = d0Var;
        this.subcomposeLayoutState = r1Var;
        this.itemContentFactory = qVar;
        this.view = view;
        INSTANCE.b(view);
    }

    private final long g(long r5, long current) {
        if (current == 0) {
            return r5;
        }
        long j4 = 4;
        return (r5 / j4) + ((current / j4) * 3);
    }

    private final boolean h(long now, long nextFrame, long average) {
        return now + average < nextFrame;
    }

    @Override // androidx.compose.foundation.lazy.layout.d0.b
    @fg.l
    public d0.a a(int index, long constraints) {
        b bVar = new b(index, constraints, null);
        this.prefetchRequests.b(bVar);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return bVar;
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
        this.prefetchState.c(this);
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        this.isActive = false;
        this.prefetchState.c(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.U() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + f5946n;
        boolean z4 = System.nanoTime() > nanos;
        boolean z5 = false;
        while (this.prefetchRequests.V() && !z5) {
            b bVar = this.prefetchRequests.L()[0];
            s invoke = this.itemContentFactory.d().invoke();
            if (!bVar.getCanceled()) {
                int b5 = invoke.b();
                int index = bVar.getIndex();
                if (index >= 0 && index < b5) {
                    if (bVar.getPrecomposeHandle() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (!h(nanoTime, nanos, this.averagePrecomposeTimeNs) && !z4) {
                                z5 = true;
                                k2 k2Var = k2.f75408a;
                            }
                            Object d5 = invoke.d(bVar.getIndex());
                            bVar.h(this.subcomposeLayoutState.i(d5, this.itemContentFactory.b(bVar.getIndex(), d5, invoke.e(bVar.getIndex()))));
                            this.averagePrecomposeTimeNs = g(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                            z4 = false;
                            k2 k2Var2 = k2.f75408a;
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        if (bVar.getMeasured()) {
                            throw new IllegalStateException("request already measured");
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (!h(nanoTime2, nanos, this.averagePremeasureTimeNs) && !z4) {
                                k2 k2Var3 = k2.f75408a;
                                z5 = true;
                            }
                            r1.a precomposeHandle = bVar.getPrecomposeHandle();
                            kotlin.jvm.internal.l0.m(precomposeHandle);
                            int a5 = precomposeHandle.a();
                            for (int i4 = 0; i4 < a5; i4++) {
                                precomposeHandle.b(i4, bVar.getConstraints());
                            }
                            this.averagePremeasureTimeNs = g(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                            this.prefetchRequests.n0(0);
                            z4 = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.prefetchRequests.n0(0);
        }
        if (z5) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }
}
