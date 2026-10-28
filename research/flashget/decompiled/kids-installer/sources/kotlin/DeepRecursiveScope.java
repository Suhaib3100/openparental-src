package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;

/* compiled from: DeepRecursive.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\u0007J2\u0010\u0005\u001a\u0002H\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\b*\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u0006\u001a\u0002H\tH¦@¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0087\u0002\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/DeepRecursiveScope;", "T", "R", "", "()V", "callRecursive", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "U", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "", "Lkotlin/DeepRecursiveScopeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.7")
@RestrictsSuspension
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
/* renamed from: kotlin.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class DeepRecursiveScope<T, R> {
    private DeepRecursiveScope() {
    }

    @d5.e
    public abstract Object b(T t5, @d5.d Continuation<? super R> continuation);

    @d5.e
    public abstract <U, S> Object c(@d5.d DeepRecursiveFunction<U, S> deepRecursiveFunction, U u5, @d5.d Continuation<? super S> continuation);

    @Deprecated(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @ReplaceWith(expression = "this.callRecursive(value)", imports = {}))
    @d5.d
    public final Void e(@d5.d DeepRecursiveFunction<?, ?> deepRecursiveFunction, @d5.e Object obj) {
        kotlin.jvm.internal.l0.p(deepRecursiveFunction, ProtectedSandApp.s("㽄"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("㽅"));
    }

    public DeepRecursiveScope(kotlin.jvm.internal.w wVar) {
    }
}
