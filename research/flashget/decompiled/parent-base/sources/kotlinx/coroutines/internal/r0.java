package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.z0;

/* compiled from: StackTraceRecovery.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00170\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0081\b¢\u0006\u0004\b!\u0010\u0004\u001a!\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\"\u0010\u0004\u001a%\u0010#\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010&\u001a\u00020%*\u00060\u0011j\u0002`\u0012H\u0000¢\u0006\u0004\b&\u0010'\u001a%\u0010+\u001a\u00020**\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,\u001a#\u0010-\u001a\u00020%*\u00060\u0011j\u0002`\u00122\n\u0010\u0014\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u0010/\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00103\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102\"\u0014\u00108\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001c\u0010:\u001a\n 9*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102\"\u001c\u0010;\u001a\n 9*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00102*\f\b\u0000\u0010<\"\u00020\n2\u00020\n*\f\b\u0000\u0010=\"\u00020\u00112\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"", "E", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q", "Lkotlin/coroutines/d;", "continuation", "p", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "n", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/e;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "e", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/q0;", "", "d", "(Ljava/lang/Throwable;)Lkotlin/q0;", "recoveredStacktrace", "Lkotlin/k2;", "k", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "l", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "s", "f", "(Lkotlin/coroutines/jvm/internal/e;)Ljava/util/ArrayDeque;", "", "j", "(Ljava/lang/StackTraceElement;)Z", "", "methodName", "", "h", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "g", "(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", "i", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "baseContinuationImplClass", "b", "stackTraceRecoveryClass", "c", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "kotlin.jvm.PlatformType", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1735#2,6:217\n12744#2,2:225\n1627#2,6:229\n12744#2,2:235\n1627#2,6:238\n37#3,2:223\n26#4:227\n26#4:228\n1#5:237\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:217,6\n131#1:225,2\n141#1:229,6\n173#1:235,2\n194#1:238,6\n106#1:223,2\n133#1:227\n135#1:228\n*E\n"})
/* loaded from: classes7.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f80809a = ProtectedSandApp.s("蠉\u0001");

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f80810b = ProtectedSandApp.s("蠊\u0001");

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final StackTraceElement f80811c = new _COROUTINE.a().a();

    /* renamed from: d, reason: collision with root package name */
    private static final String f80812d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f80813e;

    static {
        Object a5;
        Object a6;
        try {
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5 = kotlin.coroutines.jvm.internal.a.class.getCanonicalName();
        } catch (Throwable th) {
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            a5 = kotlin.a1.a(th);
        }
        if (kotlin.z0.e(a5) != null) {
            a5 = ProtectedSandApp.s("蠉\u0001");
        }
        f80812d = (String) a5;
        try {
            z0.Companion companion3 = kotlin.z0.INSTANCE;
            a6 = r0.class.getCanonicalName();
        } catch (Throwable th2) {
            z0.Companion companion4 = kotlin.z0.INSTANCE;
            a6 = kotlin.a1.a(th2);
        }
        if (kotlin.z0.e(a6) != null) {
            a6 = ProtectedSandApp.s("蠊\u0001");
        }
        f80813e = (String) a6;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    private static final <E extends Throwable> kotlin.q0<E, StackTraceElement[]> d(E e4) {
        kotlin.q0<E, StackTraceElement[]> q0Var;
        Throwable cause = e4.getCause();
        if (cause == null || !kotlin.jvm.internal.l0.g(cause.getClass(), e4.getClass())) {
            q0Var = new kotlin.q0<>(e4, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = e4.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (j(stackTraceElement)) {
                    return new kotlin.q0<>(cause, stackTrace);
                }
            }
            q0Var = new kotlin.q0<>(e4, new StackTraceElement[0]);
        }
        return q0Var;
    }

    private static final <E extends Throwable> E e(E e4, E e5, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f80811c);
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int h4 = h(stackTrace, f80812d);
        int i4 = 0;
        if (h4 == -1) {
            e5.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e5;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + h4];
        for (int i5 = 0; i5 < h4; i5++) {
            stackTraceElementArr[i5] = stackTrace[i5];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i4 + h4] = it.next();
            i4++;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    private static final ArrayDeque<StackTraceElement> f(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean g(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.l0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int h(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (kotlin.jvm.internal.l0.g(str, stackTraceElementArr[i4].getClassName())) {
                return i4;
            }
        }
        return -1;
    }

    public static final void i(@fg.l Throwable th, @fg.l Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean j(@fg.l StackTraceElement stackTraceElement) {
        return kotlin.text.v.s2(stackTraceElement.getClassName(), _COROUTINE.b.c(), false, 2, null);
    }

    private static final void k(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (j(stackTraceElementArr[i4])) {
                break;
            } else {
                i4++;
            }
        }
        int i5 = i4 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i5 > length2) {
            return;
        }
        while (true) {
            if (g(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i5) {
                return;
            } else {
                length2--;
            }
        }
    }

    @fg.m
    public static final Object l(@fg.l Throwable th, @fg.l kotlin.coroutines.d<?> dVar) {
        throw th;
    }

    private static final Object m(Throwable th, kotlin.coroutines.d<?> dVar) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E n(E e4, kotlin.coroutines.jvm.internal.e eVar) {
        kotlin.q0 d5 = d(e4);
        Throwable th = (Throwable) d5.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) d5.b();
        Throwable g4 = n.g(th);
        if (g4 == null) {
            return e4;
        }
        ArrayDeque<StackTraceElement> f4 = f(eVar);
        if (f4.isEmpty()) {
            return e4;
        }
        if (th != e4) {
            k(stackTraceElementArr, f4);
        }
        return (E) e(th, g4, f4);
    }

    @fg.l
    public static final <E extends Throwable> E o(@fg.l E e4) {
        return e4;
    }

    @fg.l
    public static final <E extends Throwable> E p(@fg.l E e4, @fg.l kotlin.coroutines.d<?> dVar) {
        return e4;
    }

    private static final <E extends Throwable> E q(E e4) {
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i4 = length2 - 1;
                if (kotlin.jvm.internal.l0.g(f80813e, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length2 = i4;
            }
        }
        length2 = -1;
        int i5 = length2 + 1;
        int h4 = h(stackTrace, f80812d);
        int i6 = 0;
        int i7 = (length - length2) - (h4 == -1 ? 0 : length - h4);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i7];
        while (i6 < i7) {
            stackTraceElementArr[i6] = i6 == 0 ? f80811c : stackTrace[(i5 + i6) - 1];
            i6++;
        }
        e4.setStackTrace(stackTraceElementArr);
        return e4;
    }

    @fg.l
    @kotlin.w0
    public static final <E extends Throwable> E r(@fg.l E e4) {
        return e4;
    }

    @fg.l
    @kotlin.w0
    public static final <E extends Throwable> E s(@fg.l E e4) {
        E e5 = (E) e4.getCause();
        if (e5 != null && kotlin.jvm.internal.l0.g(e5.getClass(), e4.getClass())) {
            for (StackTraceElement stackTraceElement : e4.getStackTrace()) {
                if (j(stackTraceElement)) {
                    return e5;
                }
            }
        }
        return e4;
    }
}
