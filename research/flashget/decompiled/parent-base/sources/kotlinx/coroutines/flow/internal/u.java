package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.k2;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "a", "Lld/q;", "b", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.q<kotlinx.coroutines.flow.j<Object>, Object, kotlin.coroutines.d<? super k2>, Object> f80157a;

    /* compiled from: SafeCollector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends h0 implements ld.q<kotlinx.coroutines.flow.j<? super Object>, Object, kotlin.coroutines.d<? super k2>, Object>, kotlin.coroutines.jvm.internal.n {

        /* renamed from: d, reason: collision with root package name */
        public static final a f80158d = new a();

        a() {
            super(3, kotlinx.coroutines.flow.j.class, ProtectedSandApp.s("蜲\u0001"), ProtectedSandApp.s("蜱\u0001"), 0);
        }

        @Override // ld.q
        public Object R(kotlinx.coroutines.flow.j<? super Object> jVar, Object obj, kotlin.coroutines.d<? super k2> dVar) {
            return jVar.emit(obj, dVar);
        }

        @fg.m
        public final Object Z(@fg.l kotlinx.coroutines.flow.j<Object> jVar, @fg.m Object obj, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            return jVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f80158d;
        l0.n(aVar, ProtectedSandApp.s("蜳\u0001"));
        f80157a = (ld.q) u1.q(aVar, 3);
    }

    private static /* synthetic */ void b() {
    }
}
