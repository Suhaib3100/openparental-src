package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.u1;
import kotlin.m2;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "a", "Lq3/q;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final q3.q<kotlinx.coroutines.flow.j<Object>, Object, Continuation<? super m2>, Object> f28124a = (q3.q) u1.q(a.f28125x, 3);

    /* compiled from: SafeCollector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends h0 implements q3.q<kotlinx.coroutines.flow.j<? super Object>, Object, Continuation<? super m2>, Object>, SuspendFunction {

        /* renamed from: x, reason: collision with root package name */
        public static final a f28125x = new a();

        a() {
            super(3, kotlinx.coroutines.flow.j.class, ProtectedSandApp.s("鄆"), ProtectedSandApp.s("鄇"), 0);
        }

        @d5.e
        public final Object A0(@d5.d kotlinx.coroutines.flow.j<Object> jVar, @d5.e Object obj, @d5.d Continuation<? super m2> continuation) {
            return jVar.b(obj, continuation);
        }

        @Override // q3.q
        public Object G(kotlinx.coroutines.flow.j<? super Object> jVar, Object obj, Continuation<? super m2> continuation) {
            return jVar.b(obj, continuation);
        }
    }

    private static /* synthetic */ void b() {
    }
}
