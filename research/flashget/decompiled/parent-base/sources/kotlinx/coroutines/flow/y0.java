package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.k2;
import org.apache.http.HttpStatus;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R>\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/y0;", "T", "Lkotlinx/coroutines/flow/i0;", "sharedFlow", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "action", "<init>", "(Lkotlinx/coroutines/flow/i0;Lld/p;)V", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/i0;", "c", "Lld/p;", "", "e", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class y0<T> implements i0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0<T> sharedFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<j<? super T>, kotlin.coroutines.d<? super k2>, Object> action;

    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {HttpStatus.SC_CONFLICT}, m = "collect", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f80669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0<T> f80670c;

        /* renamed from: d, reason: collision with root package name */
        int f80671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0<T> y0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f80670c = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80669b = obj;
            this.f80671d |= Integer.MIN_VALUE;
            return this.f80670c.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@fg.l i0<? extends T> i0Var, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.sharedFlow = i0Var;
        this.action = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y0$a r0 = (kotlinx.coroutines.flow.y0.a) r0
            int r1 = r0.f80671d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80671d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y0$a r0 = new kotlinx.coroutines.flow.y0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f80669b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80671d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "螳\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.a1.n(r7)
            goto L48
        L33:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.i0<T> r7 = r5.sharedFlow
            kotlinx.coroutines.flow.x0 r2 = new kotlinx.coroutines.flow.x0
            ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r4 = r5.action
            r2.<init>(r6, r4)
            r0.f80671d = r3
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
    @fg.l
    public List<T> e() {
        return this.sharedFlow.e();
    }
}
