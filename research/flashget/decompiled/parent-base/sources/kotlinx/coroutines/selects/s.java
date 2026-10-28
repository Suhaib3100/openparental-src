package kotlinx.coroutines.selects;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.k2;
import kotlin.w0;
import kotlin.z0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* compiled from: SelectOld.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/selects/s;", "R", "Lkotlinx/coroutines/selects/t;", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/d;)V", "", "w0", "()Ljava/lang/Object;", "", "e", "Lkotlin/k2;", "v0", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/q;", "i", "Lkotlinx/coroutines/q;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public final class s<R> extends t<R> {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.q<R> cont;

    /* compiled from: SelectOld.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f81082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<R> f81083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<R> sVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f81083c = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f81083c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f81082b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    s<R> sVar = this.f81083c;
                    this.f81082b = 1;
                    sVar.getClass();
                    obj = t.s0(sVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("裆\u0001"));
                    }
                    a1.n(obj);
                }
                p.c(((s) this.f81083c).cont, obj);
                return k2.f75408a;
            } catch (Throwable th) {
                p.d(((s) this.f81083c).cont, th);
                return k2.f75408a;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public s(@fg.l kotlin.coroutines.d<? super R> dVar) {
        super(dVar.getF75269b());
        this.cont = new kotlinx.coroutines.q<>(kotlin.coroutines.intrinsics.b.e(dVar), 1);
    }

    @w0
    public final void v0(@fg.l Throwable e4) {
        kotlinx.coroutines.q<R> qVar = this.cont;
        z0.Companion companion = z0.INSTANCE;
        qVar.resumeWith(a1.a(e4));
    }

    @fg.m
    @w0
    public final Object w0() {
        if (this.cont.l()) {
            return this.cont.y();
        }
        kotlinx.coroutines.k.f(s0.a(getContext()), null, t0.UNDISPATCHED, new a(this, null), 1, null);
        return this.cont.y();
    }
}
