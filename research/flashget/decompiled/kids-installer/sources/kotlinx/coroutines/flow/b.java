package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/m2;", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/d;", "i", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "s", "Lq3/p;", "block", "<init>", "(Lq3/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class b<T> extends f<T> {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<kotlinx.coroutines.channels.e0<? super T>, Continuation<? super m2>, Object> block;

    /* compiled from: Builders.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27840r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27841s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ b<T> f27842t;

        /* renamed from: u, reason: collision with root package name */
        int f27843u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f27842t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27841s = obj;
            this.f27843u |= Integer.MIN_VALUE;
            return this.f27842t.h(null, this);
        }
    }

    public /* synthetic */ b(q3.p pVar, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, kotlin.jvm.internal.w wVar) {
        this(pVar, (i6 & 2) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object h(@d5.d kotlinx.coroutines.channels.e0<? super T> r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f27843u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27843u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27841s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27843u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f27840r
            kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
            kotlin.a1.n(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "郭"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.a1.n(r6)
            r0.f27840r = r5
            r0.f27843u = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.f.p(r4, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            boolean r5 = r5.c0()
            if (r5 == 0) goto L4e
            kotlin.m2 r5 = kotlin.m2.f23662a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "郮"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.h(kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @d5.d
    protected kotlinx.coroutines.flow.internal.d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@d5.d q3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(pVar, coroutineContext, i5, mVar);
        this.block = pVar;
    }
}
