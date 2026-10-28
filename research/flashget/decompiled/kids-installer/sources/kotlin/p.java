package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u001a\r\u0010\u0010\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0007\"!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"stackTrace", "", "Ljava/lang/StackTraceElement;", "", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "suppressedExceptions", "", "getSuppressedExceptions$annotations", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "addSuppressed", "", "exception", "printStackTrace", "stream", "Ljava/io/PrintStream;", "writer", "Ljava/io/PrintWriter;", "stackTraceToString", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* loaded from: classes5.dex */
public class p {
    @HidesMembers
    @SinceKotlin(version = "1.1")
    public static void a(@d5.d Throwable th, @d5.d Throwable th2) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆦"));
        kotlin.jvm.internal.l0.p(th2, ProtectedSandApp.s("䆧"));
        if (th != th2) {
            kotlin.internal.m.f23351a.a(th, th2);
        }
    }

    @d5.d
    public static final StackTraceElement[] b(@d5.d Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆨"));
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.l0.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @d5.d
    public static final List<Throwable> d(@d5.d Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆩"));
        return kotlin.internal.m.f23351a.d(th);
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @InlineOnly
    private static final void f(Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆪"));
        th.printStackTrace();
    }

    @InlineOnly
    private static final void g(Throwable th, PrintStream printStream) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆫"));
        kotlin.jvm.internal.l0.p(printStream, ProtectedSandApp.s("䆬"));
        th.printStackTrace(printStream);
    }

    @InlineOnly
    private static final void h(Throwable th, PrintWriter printWriter) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆭"));
        kotlin.jvm.internal.l0.p(printWriter, ProtectedSandApp.s("䆮"));
        th.printStackTrace(printWriter);
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static String i(@d5.d Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("䆯"));
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.l0.o(stringWriter2, ProtectedSandApp.s("䆰"));
        return stringWriter2;
    }
}
