package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lld/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "scope", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/internal/d;", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "f", "Lld/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<T> extends f<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<kotlinx.coroutines.channels.b0<? super T>, kotlin.coroutines.d<? super k2>, Object> block;

    /* compiled from: Builders.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {334}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79871b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b<T> f79873d;

        /* renamed from: e, reason: collision with root package name */
        int f79874e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f79873d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79872c = obj;
            this.f79874e |= Integer.MIN_VALUE;
            return this.f79873d.i(null, this);
        }
    }

    public /* synthetic */ b(ld.p pVar, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar, int i5, kotlin.jvm.internal.w wVar) {
        this(pVar, (i5 & 2) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object i(@fg.l kotlinx.coroutines.channels.b0<? super T> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f79874e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79874e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f79872c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79874e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f79871b
            kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
            kotlin.a1.n(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "蛾\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.a1.n(r6)
            r0.f79871b = r5
            r0.f79874e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.f.p(r4, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            boolean r5 = r5.g0()
            if (r5 == 0) goto L4e
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "蛿\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.i(kotlinx.coroutines.channels.b0, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.d
    @fg.l
    protected kotlinx.coroutines.flow.internal.d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@fg.l ld.p<? super kotlinx.coroutines.channels.b0<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        super(pVar, gVar, i4, iVar);
        this.block = pVar;
    }
}
