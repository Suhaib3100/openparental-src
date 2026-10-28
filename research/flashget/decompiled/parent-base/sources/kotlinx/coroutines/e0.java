package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR/\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/e0;", "", "result", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "onCancellation", "<init>", "(Ljava/lang/Object;Lld/l;)V", "a", "()Ljava/lang/Object;", "b", "()Lld/l;", "c", "(Ljava/lang/Object;Lld/l;)Lkotlinx/coroutines/e0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "Lld/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final Object result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final ld.l<Throwable, kotlin.k2> onCancellation;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@fg.m Object obj, @fg.l ld.l<? super Throwable, kotlin.k2> lVar) {
        this.result = obj;
        this.onCancellation = lVar;
    }

    public static e0 d(e0 e0Var, Object obj, ld.l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = e0Var.result;
        }
        if ((i4 & 2) != 0) {
            lVar = e0Var.onCancellation;
        }
        e0Var.getClass();
        return new e0(obj, lVar);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @fg.l
    public final ld.l<Throwable, kotlin.k2> b() {
        return this.onCancellation;
    }

    @fg.l
    public final e0 c(@fg.m Object result, @fg.l ld.l<? super Throwable, kotlin.k2> onCancellation) {
        return new e0(result, onCancellation);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return kotlin.jvm.internal.l0.g(this.result, e0Var.result) && kotlin.jvm.internal.l0.g(this.onCancellation, e0Var.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return this.onCancellation.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蛌\u0001") + this.result + ProtectedSandApp.s("蛍\u0001") + this.onCancellation + ')';
    }
}
