package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.k2;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001e\u001a\u00020\u00152'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020\u00152\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010\u0001\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0001\u0010\u000fJ\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b,\u0010-J8\u0010/\u001a\u00020.2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001cH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u00103JZ\u00108\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010(2\u0006\u0010\n\u001a\u00020\t2#\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\b\u00107\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b8\u00109JH\u0010:\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u00010(2\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0002¢\u0006\u0004\b:\u0010;JJ\u0010=\u001a\u0004\u0018\u00010<2\b\u00105\u001a\u0004\u0018\u00010(2\b\u00107\u001a\u0004\u0018\u00010(2#\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020?2\b\u00105\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0015H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0015H\u0016¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\rH\u0001¢\u0006\u0004\bE\u0010\u000fJ\u0017\u0010H\u001a\n\u0018\u00010Fj\u0004\u0018\u0001`GH\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010(H\u0010¢\u0006\u0004\bJ\u0010KJ!\u0010M\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010(2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020.2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bR\u0010SJ8\u0010T\u001a\u00020\u00152!\u00106\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bT\u0010\u001fJ\u0017\u0010W\u001a\u00020\u00102\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0011\u0010Y\u001a\u0004\u0018\u00010(H\u0001¢\u0006\u0004\bY\u0010KJ\u000f\u0010Z\u001a\u00020\u0015H\u0000¢\u0006\u0004\bZ\u0010CJ \u0010]\u001a\u00020\u00152\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010*J<\u0010_\u001a\u00020\u00152\u0006\u0010^\u001a\u00028\u00002#\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0016¢\u0006\u0004\b_\u0010`J#\u0010b\u001a\u00020\u00152\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010a\u001a\u00020\tH\u0016¢\u0006\u0004\bb\u0010cJ8\u0010d\u001a\u00020\u00152'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001cH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0015H\u0000¢\u0006\u0004\bf\u0010CJ#\u0010g\u001a\u0004\u0018\u00010(2\u0006\u0010^\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\bg\u0010hJH\u0010i\u001a\u0004\u0018\u00010(2\u0006\u0010^\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u00010(2#\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010(2\u0006\u0010k\u001a\u00020\u0010H\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00152\u0006\u0010n\u001a\u00020(H\u0016¢\u0006\u0004\bo\u0010*J\u001b\u0010q\u001a\u00020\u0015*\u00020p2\u0006\u0010^\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u0015*\u00020p2\u0006\u0010k\u001a\u00020\u0010H\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010+\u001a\u0004\u0018\u00010(H\u0010¢\u0006\u0004\bu\u0010vJ\u001b\u0010w\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010(H\u0010¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020yH\u0014¢\u0006\u0004\b|\u0010{R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010}\u001a\u0004\b~\u0010\u007fR\u001f\u0010\u0084\u0001\u001a\u00030\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bO\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010'R\u0016\u0010\u0088\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010{R\u0017\u0010+\u001a\u0004\u0018\u00010(8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010KR\u0016\u0010\u008a\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u000fR\u0016\u0010\u008c\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u000fR\u0016\u0010\u008d\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u000fR\u001f\u0010\u0090\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\r\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004R\u0015\u0010\u0094\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010%0\u0093\u00018\u0002X\u0082\u0004R\u0015\u0010\u0095\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010(0\u0093\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0096\u0001"}, d2 = {"Lkotlinx/coroutines/q;", "T", "Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/p;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/y3;", "Lkotlin/coroutines/d;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/d;I)V", "", "E", "()Z", "", "cause", "r", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "n", "(Lld/a;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "m", "(Lld/l;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "q", "(Lkotlinx/coroutines/internal/p0;Ljava/lang/Throwable;)V", "V", "Lkotlinx/coroutines/m1;", "C", "()Lkotlinx/coroutines/m1;", "", "D", "(Ljava/lang/Object;)V", "state", "I", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n;", "H", "(Lld/l;)Lkotlinx/coroutines/n;", "mode", "u", "(I)V", "Lkotlinx/coroutines/z2;", "proposedUpdate", "onCancellation", "idempotent", "R", "(Lkotlinx/coroutines/z2;Ljava/lang/Object;ILld/l;Ljava/lang/Object;)Ljava/lang/Object;", "P", "(Ljava/lang/Object;ILld/l;)V", "Lkotlinx/coroutines/internal/s0;", "U", "(Ljava/lang/Object;Ljava/lang/Object;Lld/l;)Lkotlinx/coroutines/internal/s0;", "", "j", "(Ljava/lang/Object;)Ljava/lang/Void;", "t", "()V", "e0", "O", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "i", "()Ljava/lang/Object;", "takenState", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "f", "M", "(Ljava/lang/Throwable;)V", "k", "(Lkotlinx/coroutines/n;Ljava/lang/Throwable;)V", "o", "Lkotlinx/coroutines/k2;", "parent", "w", "(Lkotlinx/coroutines/k2;)Ljava/lang/Throwable;", "y", "N", "Lkotlin/z0;", "result", "resumeWith", "value", "W", "(Ljava/lang/Object;Lld/l;)V", "index", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "k0", "(Lld/l;)V", "s", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "i0", "(Ljava/lang/Object;Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "exception", "v", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "l0", "Lkotlinx/coroutines/m0;", "Z", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "A", "(Lkotlinx/coroutines/m0;Ljava/lang/Throwable;)V", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "L", "Lkotlin/coroutines/d;", "d", "()Lkotlin/coroutines/d;", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "x", "parentHandle", "B", "stateDebugRepresentation", "z", "isActive", "l", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
@kotlin.jvm.internal.r1({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* loaded from: classes7.dex */
public class q<T> extends g1<T> implements p<T>, kotlin.coroutines.jvm.internal.e, y3 {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80877g = AtomicIntegerFieldUpdater.newUpdater(q.class, ProtectedSandApp.s("蠷\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80878h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, ProtectedSandApp.s("蠸\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80879i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, ProtectedSandApp.s("蠹\u0001"));

    @kd.x
    private volatile int _decisionAndIndex;

    @fg.m
    @kd.x
    private volatile Object _parentHandle;

    @fg.m
    @kd.x
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<T> delegate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g context;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@fg.l kotlin.coroutines.d<? super T> dVar, int i4) {
        super(i4);
        this.delegate = dVar;
        this.context = dVar.getF75054b();
        this._decisionAndIndex = 536870911;
        this._state = d.f79643b;
    }

    private final String B() {
        Object obj = f80878h.get(this);
        return obj instanceof z2 ? ProtectedSandApp.s("蠺\u0001") : obj instanceof t ? ProtectedSandApp.s("蠻\u0001") : ProtectedSandApp.s("蠼\u0001");
    }

    private final m1 C() {
        k2 k2Var = (k2) getF75054b().c(k2.INSTANCE);
        if (k2Var == null) {
            return null;
        }
        m1 g4 = k2.a.g(k2Var, true, false, new u(this), 2, null);
        androidx.concurrent.futures.c.a(f80879i, this, null, g4);
        return g4;
    }

    private final void D(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof d)) {
                if (obj instanceof n ? true : obj instanceof kotlinx.coroutines.internal.p0) {
                    I(handler, obj);
                } else {
                    if (obj instanceof d0) {
                        d0 d0Var = (d0) obj;
                        if (!d0Var.b()) {
                            I(handler, obj);
                        }
                        if (obj instanceof t) {
                            if (!(obj instanceof d0)) {
                                d0Var = null;
                            }
                            Throwable th = d0Var != null ? d0Var.cause : null;
                            if (handler instanceof n) {
                                k((n) handler, th);
                                return;
                            } else {
                                kotlin.jvm.internal.l0.n(handler, ProtectedSandApp.s("蠽\u0001"));
                                q((kotlinx.coroutines.internal.p0) handler, th);
                                return;
                            }
                        }
                        return;
                    }
                    boolean z4 = obj instanceof c0;
                    String s4 = ProtectedSandApp.s("蠾\u0001");
                    if (z4) {
                        c0 c0Var = (c0) obj;
                        if (c0Var.cancelHandler != null) {
                            I(handler, obj);
                        }
                        if (handler instanceof kotlinx.coroutines.internal.p0) {
                            return;
                        }
                        kotlin.jvm.internal.l0.n(handler, s4);
                        n nVar = (n) handler;
                        if (c0Var.h()) {
                            k(nVar, c0Var.cancelCause);
                            return;
                        } else {
                            if (androidx.concurrent.futures.c.a(f80878h, this, obj, c0.g(c0Var, null, nVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (handler instanceof kotlinx.coroutines.internal.p0) {
                            return;
                        }
                        kotlin.jvm.internal.l0.n(handler, s4);
                        if (androidx.concurrent.futures.c.a(f80878h, this, obj, new c0(obj, (n) handler, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.c.a(f80878h, this, obj, handler)) {
                return;
            }
        }
    }

    private final boolean E() {
        if (h1.d(this.resumeMode)) {
            kotlin.coroutines.d<T> dVar = this.delegate;
            kotlin.jvm.internal.l0.n(dVar, ProtectedSandApp.s("蠿\u0001"));
            if (((kotlinx.coroutines.internal.l) dVar).q()) {
                return true;
            }
        }
        return false;
    }

    private final void F(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void G(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final n H(ld.l<? super Throwable, kotlin.k2> handler) {
        return handler instanceof n ? (n) handler : new h2(handler);
    }

    private final void I(Object handler, Object state) {
        throw new IllegalStateException((ProtectedSandApp.s("血\u0001") + handler + ProtectedSandApp.s("衁\u0001") + state).toString());
    }

    private final void P(Object proposedUpdate, int resumeMode, ld.l<? super Throwable, kotlin.k2> onCancellation) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z2)) {
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    if (tVar.c()) {
                        if (onCancellation != null) {
                            o(onCancellation, tVar.cause);
                            return;
                        }
                        return;
                    }
                }
                j(proposedUpdate);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.c.a(f80878h, this, obj, R((z2) obj, proposedUpdate, resumeMode, onCancellation, null)));
        t();
        u(resumeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void Q(q qVar, Object obj, int i4, ld.l lVar, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("衂\u0001"));
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        qVar.P(obj, i4, lVar);
    }

    private final Object R(z2 state, Object proposedUpdate, int resumeMode, ld.l<? super Throwable, kotlin.k2> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof d0) {
            return proposedUpdate;
        }
        if (!h1.c(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation == null && !(state instanceof n) && idempotent == null) {
            return proposedUpdate;
        }
        return new c0(proposedUpdate, state instanceof n ? (n) state : null, onCancellation, idempotent, null, 16, null);
    }

    private final boolean T() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80877g;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("衃\u0001"));
            }
        } while (!f80877g.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
        return true;
    }

    private final kotlinx.coroutines.internal.s0 U(Object proposedUpdate, Object idempotent, ld.l<? super Throwable, kotlin.k2> onCancellation) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z2)) {
                if ((obj instanceof c0) && idempotent != null && ((c0) obj).idempotentResume == idempotent) {
                    return r.f80897g;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.c.a(f80878h, this, obj, R((z2) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        t();
        return r.f80897g;
    }

    private final boolean V() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80877g;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("衄\u0001"));
            }
        } while (!f80877g.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        return true;
    }

    private final void X(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, Integer> lVar, Object obj) {
        int i4;
        do {
            i4 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i4, lVar.invoke(Integer.valueOf(i4)).intValue()));
    }

    private final Void j(Object proposedUpdate) {
        throw new IllegalStateException((ProtectedSandApp.s("衅\u0001") + proposedUpdate).toString());
    }

    private final void m(ld.l<? super Throwable, kotlin.k2> handler, Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (Throwable th) {
            o0.b(getF75054b(), new CompletionHandlerException(ProtectedSandApp.s("衆\u0001") + this, th));
        }
    }

    private final void n(ld.a<kotlin.k2> block) {
        try {
            block.invoke();
        } catch (Throwable th) {
            o0.b(getF75054b(), new CompletionHandlerException(ProtectedSandApp.s("衆\u0001") + this, th));
        }
    }

    private final void q(kotlinx.coroutines.internal.p0<?> segment, Throwable cause) {
        int i4 = f80877g.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException(ProtectedSandApp.s("衇\u0001"));
        }
        try {
            segment.q(i4, cause, getF75054b());
        } catch (Throwable th) {
            o0.b(getF75054b(), new CompletionHandlerException(ProtectedSandApp.s("衆\u0001") + this, th));
        }
    }

    private final boolean r(Throwable cause) {
        if (!E()) {
            return false;
        }
        kotlin.coroutines.d<T> dVar = this.delegate;
        kotlin.jvm.internal.l0.n(dVar, ProtectedSandApp.s("蠿\u0001"));
        return ((kotlinx.coroutines.internal.l) dVar).s(cause);
    }

    private final void t() {
        if (E()) {
            return;
        }
        s();
    }

    private final void u(int mode) {
        if (T()) {
            return;
        }
        h1.a(this, mode);
    }

    private final m1 x() {
        return (m1) f80879i.get(this);
    }

    @Override // kotlinx.coroutines.p
    public void A(@fg.l m0 m0Var, @fg.l Throwable th) {
        kotlin.coroutines.d<T> dVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        Q(this, new d0(th, false, 2, null), (lVar != null ? lVar.dispatcher : null) == m0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @fg.l
    protected String L() {
        return ProtectedSandApp.s("衈\u0001");
    }

    public final void M(@fg.l Throwable cause) {
        if (r(cause)) {
            return;
        }
        f(cause);
        t();
    }

    public final void N() {
        Throwable y4;
        kotlin.coroutines.d<T> dVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        if (lVar == null || (y4 = lVar.y(this)) == null) {
            return;
        }
        s();
        f(y4);
    }

    @kd.i(name = "resetStateReusable")
    public final boolean O() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof c0) && ((c0) obj).idempotentResume != null) {
            s();
            return false;
        }
        f80877g.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f79643b);
        return true;
    }

    @Override // kotlinx.coroutines.p
    public void W(T value, @fg.m ld.l<? super Throwable, kotlin.k2> onCancellation) {
        P(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.p
    public void Z(@fg.l m0 m0Var, T t4) {
        kotlin.coroutines.d<T> dVar = this.delegate;
        kotlinx.coroutines.internal.l lVar = dVar instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) dVar : null;
        Q(this, t4, (lVar != null ? lVar.dispatcher : null) == m0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.y3
    public void a(@fg.l kotlinx.coroutines.internal.p0<?> segment, int index) {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80877g;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException(ProtectedSandApp.s("衉\u0001"));
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + index));
        D(segment);
    }

    @Override // kotlinx.coroutines.g1
    public void c(@fg.m Object takenState, @fg.l Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z2) {
                throw new IllegalStateException(ProtectedSandApp.s("衋\u0001"));
            }
            if (obj instanceof d0) {
                return;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (c0Var.h()) {
                    throw new IllegalStateException(ProtectedSandApp.s("衊\u0001"));
                }
                if (androidx.concurrent.futures.c.a(f80878h, this, obj, c0.g(c0Var, null, null, null, null, cause, 15, null))) {
                    c0Var.i(this, cause);
                    return;
                }
            } else if (androidx.concurrent.futures.c.a(f80878h, this, obj, new c0(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.g1
    @fg.l
    public final kotlin.coroutines.d<T> d() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.g1
    @fg.m
    public Throwable e(@fg.m Object state) {
        Throwable e4 = super.e(state);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    @Override // kotlinx.coroutines.p
    public void e0() {
        m1 C = C();
        if (C != null && l()) {
            C.dispose();
            f80879i.set(this, y2.f81204b);
        }
    }

    @Override // kotlinx.coroutines.p
    public boolean f(@fg.m Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80878h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.c.a(f80878h, this, obj, new t(this, cause, (obj instanceof n) || (obj instanceof kotlinx.coroutines.internal.p0))));
        z2 z2Var = (z2) obj;
        if (z2Var instanceof n) {
            k((n) obj, cause);
        } else if (z2Var instanceof kotlinx.coroutines.internal.p0) {
            q((kotlinx.coroutines.internal.p0) obj, cause);
        }
        t();
        u(this.resumeMode);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.g1
    public <T> T g(@fg.m Object state) {
        return state instanceof c0 ? (T) ((c0) state).result : state;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.delegate;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    /* renamed from: getContext, reason: from getter */
    public kotlin.coroutines.g getF75054b() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.g1
    @fg.m
    public Object i() {
        return f80878h.get(this);
    }

    @Override // kotlinx.coroutines.p
    @fg.m
    public Object i0(T value, @fg.m Object idempotent, @fg.m ld.l<? super Throwable, kotlin.k2> onCancellation) {
        return U(value, idempotent, onCancellation);
    }

    @Override // kotlinx.coroutines.p
    public boolean isActive() {
        return f80878h.get(this) instanceof z2;
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
        return f80878h.get(this) instanceof t;
    }

    public final void k(@fg.l n handler, @fg.m Throwable cause) {
        try {
            handler.n(cause);
        } catch (Throwable th) {
            o0.b(getF75054b(), new CompletionHandlerException(ProtectedSandApp.s("衆\u0001") + this, th));
        }
    }

    @Override // kotlinx.coroutines.p
    public void k0(@fg.l ld.l<? super Throwable, kotlin.k2> handler) {
        D(H(handler));
    }

    @Override // kotlinx.coroutines.p
    public boolean l() {
        return !(f80878h.get(this) instanceof z2);
    }

    @Override // kotlinx.coroutines.p
    public void l0(@fg.l Object token) {
        u(this.resumeMode);
    }

    public final void o(@fg.l ld.l<? super Throwable, kotlin.k2> onCancellation, @fg.l Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th) {
            o0.b(getF75054b(), new CompletionHandlerException(ProtectedSandApp.s("行\u0001") + this, th));
        }
    }

    @Override // kotlinx.coroutines.p
    @fg.m
    public Object p(T value, @fg.m Object idempotent) {
        return U(value, idempotent, null);
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@fg.l Object result) {
        Q(this, i0.b(result, this), this.resumeMode, null, 4, null);
    }

    public final void s() {
        m1 x4 = x();
        if (x4 == null) {
            return;
        }
        x4.dispose();
        f80879i.set(this, y2.f81204b);
    }

    @fg.l
    public String toString() {
        return L() + '(' + w0.c(this.delegate) + ProtectedSandApp.s("衍\u0001") + B() + ProtectedSandApp.s("衎\u0001") + w0.b(this);
    }

    @Override // kotlinx.coroutines.p
    @fg.m
    public Object v(@fg.l Throwable exception) {
        return U(new d0(exception, false, 2, null), null, null);
    }

    @fg.l
    public Throwable w(@fg.l k2 parent) {
        return parent.x();
    }

    @fg.m
    @kotlin.w0
    public final Object y() {
        k2 k2Var;
        boolean E = E();
        if (V()) {
            if (x() == null) {
                C();
            }
            if (E) {
                N();
            }
            return kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        }
        if (E) {
            N();
        }
        Object obj = f80878h.get(this);
        if (obj instanceof d0) {
            throw ((d0) obj).cause;
        }
        if (!h1.c(this.resumeMode) || (k2Var = (k2) getF75054b().c(k2.INSTANCE)) == null || k2Var.isActive()) {
            return g(obj);
        }
        CancellationException x4 = k2Var.x();
        c(obj, x4);
        throw x4;
    }

    @fg.m
    public final Object z() {
        return f80878h.get(this);
    }
}
