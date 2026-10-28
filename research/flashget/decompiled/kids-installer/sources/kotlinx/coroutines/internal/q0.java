package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.i2;

/* compiled from: StackTraceRecovery.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u0010/\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\"\u0014\u00102\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00101\"\u001c\u00107\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00101\"\u001c\u00108\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00101*\f\b\u0000\u00109\"\u00020\n2\u00020\n*\f\b\u0000\u0010:\"\u00020\u00122\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"", "E", "exception", "p", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "r", "Lkotlin/coroutines/d;", "continuation", "q", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/e;)Ljava/lang/Throwable;", "s", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/q0;", "", "e", "(Ljava/lang/Throwable;)Lkotlin/q0;", "recoveredStacktrace", "Lkotlin/m2;", "l", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "m", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "u", "g", "", "message", "d", "", "k", "methodName", "", "i", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "h", "j", "a", "Ljava/lang/String;", "baseContinuationImplClass", "b", "stackTraceRecoveryClass", "kotlin.jvm.PlatformType", "c", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final String f28742a = ProtectedSandApp.s("已");

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f28743b = ProtectedSandApp.s("巳");

    /* renamed from: c, reason: collision with root package name */
    private static final String f28744c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f28745d;

    static {
        Object a6;
        Object a7;
        try {
            Result.a aVar = Result.f27242p;
            a6 = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = kotlin.a1.a(th);
        }
        if (Result.e(a6) != null) {
            a6 = ProtectedSandApp.s("巴");
        }
        f28744c = (String) a6;
        try {
            Result.a aVar3 = Result.f27242p;
            a7 = q0.class.getCanonicalName();
        } catch (Throwable th2) {
            Result.a aVar4 = Result.f27242p;
            a7 = kotlin.a1.a(th2);
        }
        if (Result.e(a7) != null) {
            a7 = ProtectedSandApp.s("巵");
        }
        f28745d = (String) a7;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @d5.d
    @i2
    public static final StackTraceElement d(@d5.d String str) {
        String a6 = androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("巶"), str);
        String s5 = ProtectedSandApp.s("巷");
        return new StackTraceElement(a6, s5, s5, -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> e(E e6) {
        Pair<E, StackTraceElement[]> pair;
        boolean z5;
        Throwable cause = e6.getCause();
        if (cause == null || !kotlin.jvm.internal.l0.g(cause.getClass(), e6.getClass())) {
            pair = new Pair<>(e6, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = e6.getStackTrace();
            int length = stackTrace.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z5 = false;
                    break;
                }
                if (k(stackTrace[i5])) {
                    z5 = true;
                    break;
                }
                i5++;
            }
            if (z5) {
                return new Pair<>(cause, stackTrace);
            }
            pair = new Pair<>(e6, new StackTraceElement[0]);
        }
        return pair;
    }

    private static final <E extends Throwable> E f(E e6, E e7, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d(ProtectedSandApp.s("巸")));
        StackTraceElement[] stackTrace = e6.getStackTrace();
        int i5 = i(stackTrace, f28744c);
        int i6 = 0;
        if (i5 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("巹"));
            }
            e7.setStackTrace((StackTraceElement[]) array);
            return e7;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i5];
        for (int i7 = 0; i7 < i5; i7++) {
            stackTraceElementArr[i7] = stackTrace[i7];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i6 + i5] = it.next();
            i6++;
        }
        e7.setStackTrace(stackTraceElementArr);
        return e7;
    }

    private static final ArrayDeque<StackTraceElement> g(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.l0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (kotlin.jvm.internal.l0.g(str, stackTraceElementArr[i5].getClassName())) {
                return i5;
            }
        }
        return -1;
    }

    public static final void j(@d5.d Throwable th, @d5.d Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@d5.d StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = kotlin.text.e0.s2(stackTraceElement.getClassName(), ProtectedSandApp.s("巺"), false, 2, null);
        return s22;
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (k(stackTraceElementArr[i5])) {
                break;
            } else {
                i5++;
            }
        }
        int i6 = i5 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i6 > length2) {
            return;
        }
        while (true) {
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i6) {
                return;
            } else {
                length2--;
            }
        }
    }

    @d5.e
    public static final Object m(@d5.d Throwable th, @d5.d Continuation<?> continuation) {
        throw th;
    }

    private static final Object n(Throwable th, Continuation<?> continuation) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E o(E e6, CoroutineStackFrame coroutineStackFrame) {
        Pair e7 = e(e6);
        Throwable th = (Throwable) e7.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e7.b();
        Throwable s5 = s(th);
        if (s5 == null) {
            return e6;
        }
        ArrayDeque<StackTraceElement> g5 = g(coroutineStackFrame);
        if (g5.isEmpty()) {
            return e6;
        }
        if (th != e6) {
            l(stackTraceElementArr, g5);
        }
        return (E) f(th, s5, g5);
    }

    @d5.d
    public static final <E extends Throwable> E p(@d5.d E e6) {
        return e6;
    }

    @d5.d
    public static final <E extends Throwable> E q(@d5.d E e6, @d5.d Continuation<?> continuation) {
        return e6;
    }

    private static final <E extends Throwable> E r(E e6) {
        StackTraceElement[] stackTrace = e6.getStackTrace();
        int length = stackTrace.length;
        int i5 = i(stackTrace, f28745d);
        int i6 = i5 + 1;
        int i7 = i(stackTrace, f28744c);
        int i8 = 0;
        int i9 = (length - i5) - (i7 == -1 ? 0 : length - i7);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i9];
        while (i8 < i9) {
            stackTraceElementArr[i8] = i8 == 0 ? d(ProtectedSandApp.s("巻")) : stackTrace[(i6 + i8) - 1];
            i8++;
        }
        e6.setStackTrace(stackTraceElementArr);
        return e6;
    }

    private static final <E extends Throwable> E s(E e6) {
        E e7 = (E) n.h(e6);
        if (e7 == null) {
            return null;
        }
        if ((e6 instanceof kotlinx.coroutines.m0) || kotlin.jvm.internal.l0.g(e7.getMessage(), e6.getMessage())) {
            return e7;
        }
        return null;
    }

    @d5.d
    public static final <E extends Throwable> E t(@d5.d E e6) {
        return e6;
    }

    @d5.d
    public static final <E extends Throwable> E u(@d5.d E e6) {
        E e7 = (E) e6.getCause();
        if (e7 != null && kotlin.jvm.internal.l0.g(e7.getClass(), e6.getClass())) {
            StackTraceElement[] stackTrace = e6.getStackTrace();
            int length = stackTrace.length;
            boolean z5 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (k(stackTrace[i5])) {
                    z5 = true;
                    break;
                }
                i5++;
            }
            if (z5) {
                return e7;
            }
        }
        return e6;
    }
}
