package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0011\u0010/\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlinx/coroutines/c0;", "", "result", "Lkotlinx/coroutines/n;", "cancelHandler", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lld/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/q;", "cont", "i", "(Lkotlinx/coroutines/q;Ljava/lang/Throwable;)V", "a", "()Ljava/lang/Object;", "b", "()Lkotlinx/coroutines/n;", "c", "()Lld/l;", "d", "e", "()Ljava/lang/Throwable;", "f", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lld/l;Ljava/lang/Object;Ljava/lang/Throwable;)Lkotlinx/coroutines/c0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "Lkotlinx/coroutines/n;", "Lld/l;", "Ljava/lang/Throwable;", "h", "()Z", "cancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
/* loaded from: classes7.dex */
final /* data */ class c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final Object result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final n cancelHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final ld.l<Throwable, kotlin.k2> onCancellation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final Object idempotentResume;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@fg.m Object obj, @fg.m n nVar, @fg.m ld.l<? super Throwable, kotlin.k2> lVar, @fg.m Object obj2, @fg.m Throwable th) {
        this.result = obj;
        this.cancelHandler = nVar;
        this.onCancellation = lVar;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }

    public static c0 g(c0 c0Var, Object obj, n nVar, ld.l lVar, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = c0Var.result;
        }
        if ((i4 & 2) != 0) {
            nVar = c0Var.cancelHandler;
        }
        n nVar2 = nVar;
        if ((i4 & 4) != 0) {
            lVar = c0Var.onCancellation;
        }
        ld.l lVar2 = lVar;
        if ((i4 & 8) != 0) {
            obj2 = c0Var.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = c0Var.cancelCause;
        }
        c0Var.getClass();
        return new c0(obj, nVar2, lVar2, obj4, th);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final n getCancelHandler() {
        return this.cancelHandler;
    }

    @fg.m
    public final ld.l<Throwable, kotlin.k2> c() {
        return this.onCancellation;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final Object getIdempotentResume() {
        return this.idempotentResume;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final Throwable getCancelCause() {
        return this.cancelCause;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return kotlin.jvm.internal.l0.g(this.result, c0Var.result) && kotlin.jvm.internal.l0.g(this.cancelHandler, c0Var.cancelHandler) && kotlin.jvm.internal.l0.g(this.onCancellation, c0Var.onCancellation) && kotlin.jvm.internal.l0.g(this.idempotentResume, c0Var.idempotentResume) && kotlin.jvm.internal.l0.g(this.cancelCause, c0Var.cancelCause);
    }

    @fg.l
    public final c0 f(@fg.m Object result, @fg.m n cancelHandler, @fg.m ld.l<? super Throwable, kotlin.k2> onCancellation, @fg.m Object idempotentResume, @fg.m Throwable cancelCause) {
        return new c0(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public final boolean h() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.cancelHandler;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        ld.l<Throwable, kotlin.k2> lVar = this.onCancellation;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@fg.l q<?> cont, @fg.l Throwable cause) {
        n nVar = this.cancelHandler;
        if (nVar != null) {
            cont.k(nVar, cause);
        }
        ld.l<Throwable, kotlin.k2> lVar = this.onCancellation;
        if (lVar != null) {
            cont.o(lVar, cause);
        }
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("薥\u0001") + this.result + ProtectedSandApp.s("薦\u0001") + this.cancelHandler + ProtectedSandApp.s("薧\u0001") + this.onCancellation + ProtectedSandApp.s("薨\u0001") + this.idempotentResume + ProtectedSandApp.s("薩\u0001") + this.cancelCause + ')';
    }

    public /* synthetic */ c0(Object obj, n nVar, ld.l lVar, Object obj2, Throwable th, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, (i4 & 2) != 0 ? null : nVar, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
