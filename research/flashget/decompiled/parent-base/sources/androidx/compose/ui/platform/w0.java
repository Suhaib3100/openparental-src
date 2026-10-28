package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.z0;

/* compiled from: AndroidUiFrameClock.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/w0;", "Landroidx/compose/runtime/a2;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/u0;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/u0;)V", "(Landroid/view/Choreographer;)V", "R", "Lkotlin/Function1;", "", "onFrame", "u", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Landroid/view/Choreographer;", "a", "()Landroid/view/Choreographer;", "c", "Landroidx/compose/ui/platform/u0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,61:1\n314#2,11:62\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:62,11\n*E\n"})
/* loaded from: classes.dex */
public final class w0 implements androidx.compose.runtime.a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20196d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Choreographer choreographer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final u0 dispatcher;

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f20199b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f20200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0 u0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20199b = u0Var;
            this.f20200c = frameCallback;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f20199b.W1(this.f20200c);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f20202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20202c = frameCallback;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            w0.this.getChoreographer().removeFrameCallback(this.f20202c);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Lkotlin/k2;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f20203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f20204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, R> f20205d;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.p<? super R> pVar, w0 w0Var, ld.l<? super Long, ? extends R> lVar) {
            this.f20203b = pVar;
            this.f20204c = w0Var;
            this.f20205d = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j4) {
            Object a5;
            kotlin.coroutines.d dVar = this.f20203b;
            ld.l<Long, R> lVar = this.f20205d;
            try {
                z0.Companion companion = kotlin.z0.INSTANCE;
                a5 = lVar.invoke(Long.valueOf(j4));
            } catch (Throwable th) {
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                a5 = kotlin.a1.a(th);
            }
            dVar.resumeWith(a5);
        }
    }

    public w0(@fg.l Choreographer choreographer, @fg.m u0 u0Var) {
        this.choreographer = choreographer;
        this.dispatcher = u0Var;
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // androidx.compose.runtime.a2
    @fg.m
    public <R> Object u(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        u0 u0Var = this.dispatcher;
        if (u0Var == null) {
            g.b c5 = dVar.getF75269b().c(kotlin.coroutines.e.INSTANCE);
            u0Var = c5 instanceof u0 ? (u0) c5 : null;
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        c cVar = new c(qVar, this, lVar);
        if (u0Var == null || !kotlin.jvm.internal.l0.g(u0Var.getChoreographer(), this.choreographer)) {
            this.choreographer.postFrameCallback(cVar);
            qVar.k0(new b(cVar));
        } else {
            u0Var.T1(cVar);
            qVar.k0(new a(u0Var, cVar));
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    public w0(@fg.l Choreographer choreographer) {
        this(choreographer, null);
    }
}
