package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: Latch.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/v1;", "", "<init>", "()V", "R", "Lkotlin/Function0;", "block", "g", "(Lld/a;)Ljava/lang/Object;", "Lkotlin/k2;", "d", "f", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "Lkotlin/coroutines/d;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n82#2:92\n82#2:93\n82#2:94\n82#2:104\n314#3,9:95\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17256e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<kotlin.coroutines.d<kotlin.k2>> awaiters = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<kotlin.coroutines.d<kotlin.k2>> spareList = new ArrayList();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean _isOpen = true;

    /* compiled from: Latch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,91:1\n82#2:92\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:92\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<kotlin.k2> f17262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p<? super kotlin.k2> pVar) {
            super(1);
            this.f17262c = pVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            Object obj = v1.this.lock;
            v1 v1Var = v1.this;
            kotlinx.coroutines.p<kotlin.k2> pVar = this.f17262c;
            synchronized (obj) {
                v1Var.awaiters.remove(pVar);
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }
    }

    @fg.m
    public final Object c(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (e()) {
            return kotlin.k2.f75408a;
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        synchronized (this.lock) {
            this.awaiters.add(qVar);
        }
        qVar.k0(new a(qVar));
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : kotlin.k2.f75408a;
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this._isOpen;
        }
        return z4;
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                if (e()) {
                    return;
                }
                List<kotlin.coroutines.d<kotlin.k2>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    kotlin.coroutines.d<kotlin.k2> dVar = list.get(i4);
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    dVar.resumeWith(kotlin.k2.f75408a);
                }
                list.clear();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R g(@fg.l ld.a<? extends R> block) {
        d();
        try {
            return block.invoke();
        } finally {
            f();
        }
    }
}
