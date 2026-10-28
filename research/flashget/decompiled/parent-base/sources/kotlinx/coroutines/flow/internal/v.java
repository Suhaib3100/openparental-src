package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.w0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2/\b\u0005\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/internal/t;", "Lkotlin/coroutines/g;", "currentContext", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/internal/t;Lkotlin/coroutines/g;)V", "Lkotlinx/coroutines/k2;", "collectJob", "b", "(Lkotlinx/coroutines/k2;Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "c", "(Lld/p;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/g$b;", "element", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<Integer, g.b, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t<?> f80159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<?> tVar) {
            super(2);
            this.f80159b = tVar;
        }

        @fg.l
        public final Integer a(int i4, @fg.l g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b c5 = this.f80159b.collectContext.c(key);
            if (key != k2.INSTANCE) {
                return Integer.valueOf(bVar != c5 ? Integer.MIN_VALUE : i4 + 1);
            }
            k2 k2Var = (k2) c5;
            l0.n(bVar, ProtectedSandApp.s("蜴\u0001"));
            k2 b5 = v.b((k2) bVar, k2Var);
            if (b5 == k2Var) {
                if (k2Var != null) {
                    i4++;
                }
                return Integer.valueOf(i4);
            }
            throw new IllegalStateException((ProtectedSandApp.s("蜵\u0001") + b5 + ProtectedSandApp.s("蜶\u0001") + k2Var + ProtectedSandApp.s("蜷\u0001")).toString());
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n*L\n1#1,113:1\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f80160b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80161b;

            /* renamed from: d, reason: collision with root package name */
            int f80163d;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80161b = obj;
                this.f80163d |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
            this.f80160b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            Object invoke = this.f80160b.invoke(jVar, dVar);
            return invoke == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? invoke : kotlin.k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            new a(dVar);
            this.f80160b.invoke(jVar, dVar);
            return kotlin.k2.f75408a;
        }
    }

    @kd.i(name = "checkContext")
    public static final void a(@fg.l t<?> tVar, @fg.l kotlin.coroutines.g gVar) {
        if (((Number) gVar.g(0, new a(tVar))).intValue() == tVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("蜸\u0001") + tVar.collectContext + ProtectedSandApp.s("蜹\u0001") + gVar + ProtectedSandApp.s("蜺\u0001")).toString());
    }

    @fg.m
    public static final k2 b(@fg.m k2 k2Var, @fg.m k2 k2Var2) {
        while (k2Var != null) {
            if (k2Var == k2Var2) {
                return k2Var;
            }
            if (!(k2Var instanceof o0)) {
                return k2Var;
            }
            k2Var = k2Var.getParent();
        }
        return null;
    }

    @fg.l
    @w0
    public static final <T> kotlinx.coroutines.flow.i<T> c(@fg.l @InterfaceC1469b ld.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
        return new b(pVar);
    }
}
