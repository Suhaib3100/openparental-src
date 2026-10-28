package kotlinx.coroutines.channels;

import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a \u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0013\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fj\u0004\u0018\u0001`\u00122/\b\u0001\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"E", "Lkotlinx/coroutines/channels/d0;", "", "capacity", "Lkotlinx/coroutines/t0;", "start", "Lkotlinx/coroutines/channels/d;", "b", "(Lkotlinx/coroutines/channels/d0;ILkotlinx/coroutines/t0;)Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/t0;Lld/l;Lld/p;)Lkotlinx/coroutines/channels/d;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,202:1\n48#2,4:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n51#1:203,4\n*E\n"})
/* loaded from: classes7.dex */
public final class h {

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/o0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "N", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,110:1\n51#2:111\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements n0 {
        public a(n0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.n0
        public void N(@fg.l kotlin.coroutines.g context, @fg.l Throwable exception) {
        }
    }

    /* compiled from: Broadcast.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<E> f79317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d0<? extends E> d0Var) {
            super(1);
            this.f79317b = d0Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            t.a(this.f79317b, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Broadcast.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {56, 57}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c<E> extends kotlin.coroutines.jvm.internal.o implements ld.p<b0<? super E>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79318b;

        /* renamed from: c, reason: collision with root package name */
        int f79319c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f79320d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0<E> f79321e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d0<? extends E> d0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f79321e = d0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l b0<? super E> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f79321e, dVar);
            cVar.f79320d = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:6:0x0017). Please report as a decompilation issue!!! */
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
                int r1 = r6.f79319c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L19
                java.lang.Object r1 = r6.f79318b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r6.f79320d
                kotlinx.coroutines.channels.b0 r4 = (kotlinx.coroutines.channels.b0) r4
                kotlin.a1.n(r7)
            L17:
                r7 = r4
                goto L3e
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "蘧\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f79318b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r6.f79320d
                kotlinx.coroutines.channels.b0 r4 = (kotlinx.coroutines.channels.b0) r4
                kotlin.a1.n(r7)
                goto L4e
            L31:
                kotlin.a1.n(r7)
                java.lang.Object r7 = r6.f79320d
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlinx.coroutines.channels.d0<E> r1 = r6.f79321e
                kotlinx.coroutines.channels.n r1 = r1.iterator()
            L3e:
                r6.f79320d = r7
                r6.f79318b = r1
                r6.f79319c = r3
                java.lang.Object r4 = r1.c(r6)
                if (r4 != r0) goto L4b
                return r0
            L4b:
                r5 = r4
                r4 = r7
                r7 = r5
            L4e:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L67
                java.lang.Object r7 = r1.next()
                r6.f79320d = r4
                r6.f79318b = r1
                r6.f79319c = r2
                java.lang.Object r7 = r4.f0(r7, r6)
                if (r7 != r0) goto L17
                return r0
            L67:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @fg.l
    @a3
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> d<E> a(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l t0 t0Var, @fg.m ld.l<? super Throwable, k2> lVar, @fg.l @InterfaceC1469b ld.p<? super b0<? super E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        kotlin.coroutines.g e4 = l0.e(r0Var, gVar);
        d a5 = f.a(i4);
        g yVar = t0Var.isLazy() ? new y(e4, a5, pVar) : new g(e4, a5, true);
        if (lVar != null) {
            ((r2) yVar).F(lVar);
        }
        t0Var.invoke(pVar, yVar, (kotlin.coroutines.d) yVar);
        return (d<E>) yVar;
    }

    @fg.l
    @a3
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> d<E> b(@fg.l d0<? extends E> d0Var, int i4, @fg.l t0 t0Var) {
        return c(s0.m(s0.m(b2.f79269b, j1.g()), new a((g.c<?>) n0.INSTANCE)), null, i4, t0Var, new b(d0Var), new c(d0Var, null), 1, null);
    }

    public static /* synthetic */ d c(r0 r0Var, kotlin.coroutines.g gVar, int i4, t0 t0Var, ld.l lVar, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            t0Var = t0.LAZY;
        }
        t0 t0Var2 = t0Var;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return a(r0Var, gVar2, i6, t0Var2, lVar, pVar);
    }

    public static /* synthetic */ d d(d0 d0Var, int i4, t0 t0Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        if ((i5 & 2) != 0) {
            t0Var = t0.LAZY;
        }
        return b(d0Var, i4, t0Var);
    }
}
