package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/y1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/LeftCompositionCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,497:1\n26#2:498\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/LeftCompositionCancellationException\n*L\n395#1:498\n*E\n"})
/* loaded from: classes.dex */
final class y1 extends CancellationException {
    public y1() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    @fg.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
