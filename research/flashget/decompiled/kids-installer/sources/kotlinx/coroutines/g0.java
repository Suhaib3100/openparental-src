package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/g0;", "", "a", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "b", "result", "onCancellation", "c", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lq3/l;", "<init>", "(Ljava/lang/Object;Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Object result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final q3.l<Throwable, kotlin.m2> onCancellation;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@d5.e Object obj, @d5.d q3.l<? super Throwable, kotlin.m2> lVar) {
        this.result = obj;
        this.onCancellation = lVar;
    }

    public static g0 d(g0 g0Var, Object obj, q3.l lVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = g0Var.result;
        }
        if ((i5 & 2) != 0) {
            lVar = g0Var.onCancellation;
        }
        g0Var.getClass();
        return new g0(obj, lVar);
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @d5.d
    public final q3.l<Throwable, kotlin.m2> b() {
        return this.onCancellation;
    }

    @d5.d
    public final g0 c(@d5.e Object obj, @d5.d q3.l<? super Throwable, kotlin.m2> lVar) {
        return new g0(obj, lVar);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) other;
        return kotlin.jvm.internal.l0.g(this.result, g0Var.result) && kotlin.jvm.internal.l0.g(this.onCancellation, g0Var.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return this.onCancellation.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("巄") + this.result + ProtectedSandApp.s("巅") + this.onCancellation + ')';
    }
}
