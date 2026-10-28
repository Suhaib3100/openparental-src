package kotlin.coroutines.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

/* compiled from: ContinuationImpl.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "arity", "", "(I)V", "completion", "Lkotlin/coroutines/Continuation;", "(ILkotlin/coroutines/Continuation;)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.jvm.internal.k, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase<Object>, SuspendFunction {

    /* renamed from: p, reason: collision with root package name */
    private final int f23321p;

    public RestrictedSuspendLambda(int i5, @d5.e Continuation<Object> continuation) {
        super(continuation);
        this.f23321p = i5;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: f, reason: from getter */
    public int getF23323r() {
        return this.f23321p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @d5.d
    public String toString() {
        if (x() != null) {
            return super.toString();
        }
        String w5 = l1.w(this);
        l0.o(w5, ProtectedSandApp.s("綞"));
        return w5;
    }

    public RestrictedSuspendLambda(int i5) {
        this(i5, null);
    }
}
