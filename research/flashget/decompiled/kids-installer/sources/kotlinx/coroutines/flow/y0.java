package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/y0;", "T", "Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "Lkotlinx/coroutines/flow/i0;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "p", "Lq3/p;", "action", "", "c", "()Ljava/util/List;", "replayCache", "<init>", "(Lkotlinx/coroutines/flow/i0;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class y0<T> implements i0<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i0<T> sharedFlow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<j<? super T>, Continuation<? super m2>, Object> action;

    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f28623r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ y0<T> f28624s;

        /* renamed from: t, reason: collision with root package name */
        int f28625t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0<T> y0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f28624s = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28623r = obj;
            this.f28625t |= Integer.MIN_VALUE;
            return this.f28624s.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@d5.d i0<? extends T> i0Var, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        this.sharedFlow = i0Var;
        this.action = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y0$a r0 = (kotlinx.coroutines.flow.y0.a) r0
            int r1 = r0.f28625t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28625t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y0$a r0 = new kotlinx.coroutines.flow.y0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28623r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28625t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "鄪"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.a1.n(r7)
            goto L48
        L33:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.i0<T> r7 = r5.sharedFlow
            kotlinx.coroutines.flow.x0 r2 = new kotlinx.coroutines.flow.x0
            q3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.m2>, java.lang.Object> r4 = r5.action
            r2.<init>(r6, r4)
            r0.f28625t = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.i0
    @d5.d
    public List<T> c() {
        return this.sharedFlow.c();
    }
}
