package kotlinx.coroutines.channels;

import com.android.internal.telephony.SmsConstants;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "a", "(Lkotlinx/coroutines/channels/b0;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "Lkotlinx/coroutines/channels/d0;", "e", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILld/p;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/t0;", "start", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/t0;Lld/l;Lld/p;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "d", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;Lkotlinx/coroutines/t0;Lld/l;Lld/p;)Lkotlinx/coroutines/channels/d0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
/* loaded from: classes7.dex */
public final class z {

    /* compiled from: Produce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79637b;

        /* renamed from: c, reason: collision with root package name */
        Object f79638c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79639d;

        /* renamed from: e, reason: collision with root package name */
        int f79640e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79639d = obj;
            this.f79640e |= Integer.MIN_VALUE;
            return z.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f79641b = new b(0);

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<k2> f79642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.p<? super k2> pVar) {
            super(1);
            this.f79642b = pVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            kotlinx.coroutines.p<k2> pVar = this.f79642b;
            z0.Companion companion = z0.INSTANCE;
            pVar.resumeWith(k2.f75408a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l kotlinx.coroutines.channels.b0<?> r4, @fg.l ld.a<kotlin.k2> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.z.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.z$a r0 = (kotlinx.coroutines.channels.z.a) r0
            int r1 = r0.f79640e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79640e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.z$a r0 = new kotlinx.coroutines.channels.z$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79639d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79640e
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f79638c
            r5 = r4
            ld.a r5 = (ld.a) r5
            java.lang.Object r4 = r0.f79637b
            kotlinx.coroutines.channels.b0 r4 = (kotlinx.coroutines.channels.b0) r4
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L30
            goto L73
        L30:
            r4 = move-exception
            goto L79
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蚆\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.a1.n(r6)
            kotlin.coroutines.g r6 = r0.getF75269b()
            kotlinx.coroutines.k2$b r2 = kotlinx.coroutines.k2.INSTANCE
            kotlin.coroutines.g$b r6 = r6.c(r2)
            if (r6 != r4) goto L7d
            r0.f79637b = r4     // Catch: java.lang.Throwable -> L30
            r0.f79638c = r5     // Catch: java.lang.Throwable -> L30
            r0.f79640e = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L30
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L30
            r6.e0()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.z$c r2 = new kotlinx.coroutines.channels.z$c     // Catch: java.lang.Throwable -> L30
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L30
            r4.d0(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.y()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L70
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L30
        L70:
            if (r4 != r1) goto L73
            return r1
        L73:
            r5.invoke()
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L79:
            r5.invoke()
            throw r4
        L7d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蚇\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.z.a(kotlinx.coroutines.channels.b0, ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(b0 b0Var, ld.a aVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = b.f79641b;
        }
        return a(b0Var, aVar, dVar);
    }

    @fg.l
    @f2
    public static final <E> d0<E> c(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l t0 t0Var, @fg.m ld.l<? super Throwable, k2> lVar, @fg.l @InterfaceC1469b ld.p<? super b0<? super E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return d(r0Var, gVar, i4, i.SUSPEND, t0Var, lVar, pVar);
    }

    @fg.l
    public static final <E> d0<E> d(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l i iVar, @fg.l t0 t0Var, @fg.m ld.l<? super Throwable, k2> lVar, @fg.l @InterfaceC1469b ld.p<? super b0<? super E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        a0 a0Var = new a0(l0.e(r0Var, gVar), o.d(i4, iVar, null, 4, null), true, true);
        if (lVar != null) {
            a0Var.F(lVar);
        }
        t0Var.invoke(pVar, a0Var, a0Var);
        return a0Var;
    }

    @fg.l
    @z1
    public static final <E> d0<E> e(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l @InterfaceC1469b ld.p<? super b0<? super E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return d(r0Var, gVar, i4, i.SUSPEND, t0.DEFAULT, null, pVar);
    }

    public static d0 f(r0 r0Var, kotlin.coroutines.g gVar, int i4, t0 t0Var, ld.l lVar, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            t0Var = t0.DEFAULT;
        }
        t0 t0Var2 = t0Var;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return d(r0Var, gVar2, i6, i.SUSPEND, t0Var2, lVar, pVar);
    }

    public static /* synthetic */ d0 g(r0 r0Var, kotlin.coroutines.g gVar, int i4, i iVar, t0 t0Var, ld.l lVar, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            iVar = i.SUSPEND;
        }
        i iVar2 = iVar;
        if ((i5 & 8) != 0) {
            t0Var = t0.DEFAULT;
        }
        t0 t0Var2 = t0Var;
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        return d(r0Var, gVar2, i6, iVar2, t0Var2, lVar, pVar);
    }

    public static /* synthetic */ d0 h(r0 r0Var, kotlin.coroutines.g gVar, int i4, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return e(r0Var, gVar, i4, pVar);
    }
}
