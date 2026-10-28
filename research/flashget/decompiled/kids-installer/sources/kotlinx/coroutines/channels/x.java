package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u1;
import kotlin.m2;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.internal.r0;

/* compiled from: ConflatedBroadcastChannel.kt */
@d3
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 D*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004*EF\nB\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0011\u001a\u00028\u00002(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010$J\u001f\u0010-\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J&\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lkotlinx/coroutines/channels/x;", "E", "Lkotlinx/coroutines/channels/i;", "Lkotlinx/coroutines/channels/x$d;", "subscriber", "Lkotlin/m2;", "f", "(Lkotlinx/coroutines/channels/x$d;)V", "", "list", "d", "([Lkotlinx/coroutines/channels/x$d;Lkotlinx/coroutines/channels/x$d;)[Lkotlinx/coroutines/channels/x$d;", "n", "", "cause", "k", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/x$a;", "l", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/x$a;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/k0;", "Lkotlin/coroutines/d;", "", "block", "m", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "Lkotlinx/coroutines/channels/g0;", "S", "()Lkotlinx/coroutines/channels/g0;", "", "Q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "v", "(Lq3/l;)V", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "a0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "Y", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "j", "valueOrNull", "c0", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "M", "()Lkotlinx/coroutines/selects/e;", "onSend", "<init>", "(Ljava/lang/Object;)V", "o", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class x<E> implements i<E> {

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27606p;

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27607q;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27608r;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final r0 f27610t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final c<Object> f27611u;

    @d5.d
    private volatile /* synthetic */ Object _state;

    @d5.d
    private volatile /* synthetic */ int _updating;

    @d5.d
    private volatile /* synthetic */ Object onCloseHandler;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private static final b f27605o = new b(null);

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final a f27609s = new a(null);

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/x$a;", "", "", "a", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final Throwable closeCause;

        public a(@d5.e Throwable th) {
            this.closeCause = th;
        }

        @d5.d
        public final Throwable a() {
            Throwable th = this.closeCause;
            return th == null ? new ClosedSendChannelException(ProtectedSandApp.s("島")) : th;
        }

        @d5.d
        public final Throwable b() {
            Throwable th = this.closeCause;
            return th == null ? new IllegalStateException(ProtectedSandApp.s("峷")) : th;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/x$b;", "", "Lkotlinx/coroutines/channels/x$a;", "CLOSED", "Lkotlinx/coroutines/channels/x$a;", "Lkotlinx/coroutines/channels/x$c;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/x$c;", "Lkotlinx/coroutines/internal/r0;", "UNDEFINED", "Lkotlinx/coroutines/internal/r0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class b {
        private b() {
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/x$c;", "E", "", "a", "Ljava/lang/Object;", "value", "", "Lkotlinx/coroutines/channels/x$d;", "b", "[Lkotlinx/coroutines/channels/x$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/x$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class c<E> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final Object value;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final d<E>[] subscribers;

        public c(@d5.e Object obj, @d5.e d<E>[] dVarArr) {
            this.value = obj;
            this.subscribers = dVarArr;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/x$d;", "E", "Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/channels/g0;", "", "wasClosed", "Lkotlin/m2;", "i0", "element", "", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/x;", "t", "Lkotlinx/coroutines/channels/x;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/x;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class d<E> extends y<E> implements g0<E> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final x<E> broadcastChannel;

        public d(@d5.d x<E> xVar) {
            super(null);
            this.broadcastChannel = xVar;
        }

        @Override // kotlinx.coroutines.channels.y, kotlinx.coroutines.channels.c
        @d5.d
        public Object G(E element) {
            return super.G(element);
        }

        @Override // kotlinx.coroutines.channels.y, kotlinx.coroutines.channels.a
        protected void i0(boolean z5) {
            if (z5) {
                this.broadcastChannel.f(this);
            }
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/x$e", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/k0;", "R", "Lkotlinx/coroutines/selects/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "V", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class e implements kotlinx.coroutines.selects.e<E, k0<? super E>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ x<E> f27616o;

        e(x<E> xVar) {
            this.f27616o = xVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void V(@d5.d kotlinx.coroutines.selects.f<? super R> select, E param, @d5.d q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
            this.f27616o.m(select, param, block);
        }
    }

    static {
        r0 r0Var = new r0(ProtectedSandApp.s("邷"));
        f27610t = r0Var;
        f27611u = new c<>(r0Var, null);
        f27606p = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, ProtectedSandApp.s("邸"));
        f27607q = AtomicIntegerFieldUpdater.newUpdater(x.class, ProtectedSandApp.s("邹"));
        f27608r = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, ProtectedSandApp.s("邺"));
    }

    public x() {
        this._state = f27611u;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    private final d<E>[] d(d<E>[] list, d<E> subscriber) {
        Object[] w32;
        if (list == null) {
            return new d[]{subscriber};
        }
        w32 = kotlin.collections.p.w3(list, subscriber);
        return (d[]) w32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(d<E> subscriber) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("邻"), obj));
            }
            c cVar = (c) obj;
            obj2 = cVar.value;
            dVarArr = cVar.subscribers;
            kotlin.jvm.internal.l0.m(dVarArr);
        } while (!androidx.concurrent.futures.d.a(f27606p, this, obj, new c(obj2, n(dVarArr, subscriber))));
    }

    public static /* synthetic */ void i() {
    }

    private final void k(Throwable cause) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = kotlinx.coroutines.channels.b.f27308h) || !androidx.concurrent.futures.d.a(f27608r, this, obj, r0Var)) {
            return;
        }
        ((q3.l) u1.q(obj, 1)).N(cause);
    }

    private final a l(E element) {
        Object obj;
        if (!f27607q.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    return (a) obj;
                }
                if (!(obj instanceof c)) {
                    throw new IllegalStateException((ProtectedSandApp.s("邼") + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!androidx.concurrent.futures.d.a(f27606p, this, obj, new c(element, ((c) obj).subscribers)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.G(element);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void m(kotlinx.coroutines.selects.f<? super R> select, E element, q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
        if (select.t()) {
            a l5 = l(element);
            if (l5 != null) {
                select.j0(l5.a());
            } else {
                q4.b.d(block, this, select.L());
            }
        }
    }

    private final d<E>[] n(d<E>[] list, d<E> subscriber) {
        int If;
        int length = list.length;
        If = kotlin.collections.t.If(list, subscriber);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr = new d[length - 1];
        kotlin.collections.p.K0(list, dVarArr, 0, 0, If, 6, null);
        kotlin.collections.p.K0(list, dVarArr, If, If + 1, 0, 8, null);
        return dVarArr;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public kotlinx.coroutines.selects.e<E, k0<E>> M() {
        return new e(this);
    }

    @Override // kotlinx.coroutines.channels.i
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public boolean a(@d5.e Throwable cause) {
        Object obj;
        int i5;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("邽"), obj));
            }
        } while (!androidx.concurrent.futures.d.a(f27606p, this, obj, cause == null ? f27609s : new a(cause)));
        d<E>[] dVarArr = ((c) obj).subscribers;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.a(cause);
            }
        }
        k(cause);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.i
    @d5.d
    public g0<E> S() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.a(((a) obj).closeCause);
                return dVar;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("邾"), obj));
            }
            cVar = (c) obj;
            Object obj2 = cVar.value;
            if (obj2 != f27610t) {
                dVar.G(obj2);
            }
        } while (!androidx.concurrent.futures.d.a(f27606p, this, obj, new c(cVar.value, d(cVar.subscribers, dVar))));
        return dVar;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public Object Y(E element) {
        a l5 = l(element);
        if (l5 != null) {
            return r.INSTANCE.a(l5.a());
        }
        r.Companion companion = r.INSTANCE;
        m2 m2Var = m2.f23662a;
        companion.getClass();
        return r.c(m2Var);
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.e
    public Object a0(E e6, @d5.d Continuation<? super m2> continuation) {
        a l5 = l(e6);
        if (l5 != null) {
            throw l5.a();
        }
        if (CoroutineSingletons.COROUTINE_SUSPENDED == null) {
            return null;
        }
        return m2.f23662a;
    }

    @Override // kotlinx.coroutines.channels.k0
    public boolean c0() {
        return this._state instanceof a;
    }

    @Override // kotlinx.coroutines.channels.i
    public void e(@d5.e CancellationException cause) {
        a(cause);
    }

    public final E h() {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("郀"), obj));
        }
        E e6 = (E) ((c) obj).value;
        if (e6 != f27610t) {
            return e6;
        }
        throw new IllegalStateException(ProtectedSandApp.s("邿"));
    }

    @d5.e
    public final E j() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("郁"), obj));
        }
        r0 r0Var = f27610t;
        E e6 = (E) ((c) obj).value;
        if (e6 == r0Var) {
            return null;
        }
        return e6;
    }

    @Override // kotlinx.coroutines.channels.k0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e6) {
        return k0.a.c(this, e6);
    }

    @Override // kotlinx.coroutines.channels.k0
    public void v(@d5.d q3.l<? super Throwable, m2> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27608r;
        if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, null, handler)) {
            Object obj = this._state;
            if ((obj instanceof a) && androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, handler, kotlinx.coroutines.channels.b.f27308h)) {
                handler.N(((a) obj).closeCause);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == kotlinx.coroutines.channels.b.f27308h) {
            throw new IllegalStateException(ProtectedSandApp.s("郂"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("郃") + obj2);
    }

    public x(E e6) {
        this();
        f27606p.lazySet(this, new c(e6, null));
    }
}
