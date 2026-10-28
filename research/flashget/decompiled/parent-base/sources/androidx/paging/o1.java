package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;
import kotlin.z0;

/* compiled from: SimpleChannelFlow.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\u00122#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040,8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/paging/o1;", "T", "Landroidx/paging/n1;", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/e0;", "scope", "channel", "<init>", "(Lkotlinx/coroutines/r0;Lkotlinx/coroutines/channels/e0;)V", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "handler", "d0", "(Lld/l;)V", "b0", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "block", "y", "(Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/channels/e0;", "a", "()Lkotlinx/coroutines/channels/e0;", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "g0", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "r", "()Lkotlinx/coroutines/selects/i;", "onSend", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class o1<T> implements n1<T>, kotlinx.coroutines.r0, kotlinx.coroutines.channels.e0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.e0<T> channel;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.r0 f32157c;

    /* compiled from: SimpleChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0, 0}, l = {97}, m = "awaitClose", n = {"block", "job"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32158b;

        /* renamed from: c, reason: collision with root package name */
        Object f32159c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32160d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o1<T> f32161e;

        /* renamed from: f, reason: collision with root package name */
        int f32162f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1<T> o1Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f32161e = o1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32160d = obj;
            this.f32162f |= Integer.MIN_VALUE;
            return this.f32161e.y(null, this);
        }
    }

    /* compiled from: SimpleChannelFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<k2> f32163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.p<? super k2> pVar) {
            super(1);
            this.f32163b = pVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            kotlinx.coroutines.p<k2> pVar = this.f32163b;
            k2 k2Var = k2.f75408a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(k2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o1(@fg.l kotlinx.coroutines.r0 scope, @fg.l kotlinx.coroutines.channels.e0<? super T> channel) {
        kotlin.jvm.internal.l0.p(scope, "scope");
        kotlin.jvm.internal.l0.p(channel, "channel");
        this.channel = channel;
        this.f32157c = scope;
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(T element) {
        return this.channel.M(element);
    }

    @Override // androidx.paging.n1
    @fg.l
    public kotlinx.coroutines.channels.e0<T> a() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        return this.channel.b0(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlinx.coroutines.z1
    public void d0(@fg.l ld.l<? super Throwable, k2> handler) {
        kotlin.jvm.internal.l0.p(handler, "handler");
        this.channel.d0(handler);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return this.channel.f0(t4, dVar);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean g0() {
        return this.channel.g0();
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.WARNING, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T element) {
        return this.channel.offer(element);
    }

    @Override // kotlinx.coroutines.r0
    @fg.l
    /* renamed from: q */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.f32157c.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<T, kotlinx.coroutines.channels.e0<T>> r() {
        return this.channel.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.paging.n1
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(@fg.l ld.a<kotlin.k2> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.o1.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.o1$a r0 = (androidx.paging.o1.a) r0
            int r1 = r0.f32162f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32162f = r1
            goto L18
        L13:
            androidx.paging.o1$a r0 = new androidx.paging.o1$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f32160d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32162f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f32159c
            kotlinx.coroutines.k2 r6 = (kotlinx.coroutines.k2) r6
            java.lang.Object r6 = r0.f32158b
            ld.a r6 = (ld.a) r6
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r7 = move-exception
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r7)
            kotlinx.coroutines.r0 r7 = r5.f32157c     // Catch: java.lang.Throwable -> L2f
            kotlin.coroutines.g r7 = r7.getCoroutineContext()     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.k2$b r2 = kotlinx.coroutines.k2.INSTANCE     // Catch: java.lang.Throwable -> L2f
            kotlin.coroutines.g$b r7 = r7.c(r2)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L78
            kotlinx.coroutines.k2 r7 = (kotlinx.coroutines.k2) r7     // Catch: java.lang.Throwable -> L2f
            r0.f32158b = r6     // Catch: java.lang.Throwable -> L2f
            r0.f32159c = r7     // Catch: java.lang.Throwable -> L2f
            r0.f32162f = r3     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.q r2 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L2f
            kotlin.coroutines.d r4 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L2f
            r2.e0()     // Catch: java.lang.Throwable -> L2f
            androidx.paging.o1$b r3 = new androidx.paging.o1$b     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r7.F(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r2.y()     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L6f
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L2f
        L6f:
            if (r7 != r1) goto L72
            return r1
        L72:
            r6.invoke()
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L78:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L80:
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.o1.y(ld.a, kotlin.coroutines.d):java.lang.Object");
    }
}
