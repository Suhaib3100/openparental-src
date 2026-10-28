package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR1\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/e0;", "", "Lkotlinx/coroutines/s;", "cont", "", "cause", "Lkotlin/m2;", "i", "a", "Lkotlinx/coroutines/o;", "b", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "c", "d", "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lkotlinx/coroutines/o;", "Lq3/l;", "Ljava/lang/Throwable;", "h", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/o;Lq3/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final /* data */ class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Object result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final o cancelHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final q3.l<Throwable, kotlin.m2> onCancellation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Object idempotentResume;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@d5.e Object obj, @d5.e o oVar, @d5.e q3.l<? super Throwable, kotlin.m2> lVar, @d5.e Object obj2, @d5.e Throwable th) {
        this.result = obj;
        this.cancelHandler = oVar;
        this.onCancellation = lVar;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }

    public static /* synthetic */ e0 g(e0 e0Var, Object obj, o oVar, q3.l lVar, Object obj2, Throwable th, int i5, Object obj3) {
        if ((i5 & 1) != 0) {
            obj = e0Var.result;
        }
        if ((i5 & 2) != 0) {
            oVar = e0Var.cancelHandler;
        }
        o oVar2 = oVar;
        if ((i5 & 4) != 0) {
            lVar = e0Var.onCancellation;
        }
        q3.l lVar2 = lVar;
        if ((i5 & 8) != 0) {
            obj2 = e0Var.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i5 & 16) != 0) {
            th = e0Var.cancelCause;
        }
        return e0Var.f(obj, oVar2, lVar2, obj4, th);
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final o getCancelHandler() {
        return this.cancelHandler;
    }

    @d5.e
    public final q3.l<Throwable, kotlin.m2> c() {
        return this.onCancellation;
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final Object getIdempotentResume() {
        return this.idempotentResume;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final Throwable getCancelCause() {
        return this.cancelCause;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return kotlin.jvm.internal.l0.g(this.result, e0Var.result) && kotlin.jvm.internal.l0.g(this.cancelHandler, e0Var.cancelHandler) && kotlin.jvm.internal.l0.g(this.onCancellation, e0Var.onCancellation) && kotlin.jvm.internal.l0.g(this.idempotentResume, e0Var.idempotentResume) && kotlin.jvm.internal.l0.g(this.cancelCause, e0Var.cancelCause);
    }

    @d5.d
    public final e0 f(@d5.e Object obj, @d5.e o oVar, @d5.e q3.l<? super Throwable, kotlin.m2> lVar, @d5.e Object obj2, @d5.e Throwable th) {
        return new e0(obj, oVar, lVar, obj2, th);
    }

    public final boolean h() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        o oVar = this.cancelHandler;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        q3.l<Throwable, kotlin.m2> lVar = this.onCancellation;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@d5.d s<?> sVar, @d5.d Throwable th) {
        o oVar = this.cancelHandler;
        if (oVar != null) {
            sVar.n(oVar, th);
        }
        q3.l<Throwable, kotlin.m2> lVar = this.onCancellation;
        if (lVar != null) {
            sVar.q(lVar, th);
        }
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("崵") + this.result + ProtectedSandApp.s("崶") + this.cancelHandler + ProtectedSandApp.s("崷") + this.onCancellation + ProtectedSandApp.s("崸") + this.idempotentResume + ProtectedSandApp.s("崹") + this.cancelCause + ')';
    }

    public /* synthetic */ e0(Object obj, o oVar, q3.l lVar, Object obj2, Throwable th, int i5, kotlin.jvm.internal.w wVar) {
        this(obj, (i5 & 2) != 0 ? null : oVar, (i5 & 4) != 0 ? null : lVar, (i5 & 8) != 0 ? null : obj2, (i5 & 16) != 0 ? null : th);
    }
}
