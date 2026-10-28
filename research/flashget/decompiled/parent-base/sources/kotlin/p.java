package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"", "Lkotlin/k2;", "f", "(Ljava/lang/Throwable;)V", "Ljava/io/PrintWriter;", "writer", "h", "(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V", "Ljava/io/PrintStream;", "stream", "g", "(Ljava/lang/Throwable;Ljava/io/PrintStream;)V", "", "i", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "Ljava/lang/StackTraceElement;", "b", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "c", "stackTrace", "", "d", "(Ljava/lang/Throwable;)Ljava/util/List;", "e", "suppressedExceptions", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* loaded from: classes7.dex */
public class p {
    @kotlin.internal.e
    @c1(version = "1.1")
    public static void a(@fg.l Throwable th, @fg.l Throwable th2) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        kotlin.jvm.internal.l0.p(th2, ProtectedSandApp.s("斆\u0001"));
        if (th != th2) {
            kotlin.internal.m.f75110a.a(th, th2);
        }
    }

    @fg.l
    public static final StackTraceElement[] b(@fg.l Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.l0.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @fg.l
    public static final List<Throwable> d(@fg.l Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        return kotlin.internal.m.f75110a.d(th);
    }

    @c1(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @kotlin.internal.f
    private static final void f(Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        th.printStackTrace();
    }

    @kotlin.internal.f
    private static final void g(Throwable th, PrintStream printStream) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        kotlin.jvm.internal.l0.p(printStream, ProtectedSandApp.s("文\u0001"));
        th.printStackTrace(printStream);
    }

    @kotlin.internal.f
    private static final void h(Throwable th, PrintWriter printWriter) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        kotlin.jvm.internal.l0.p(printWriter, ProtectedSandApp.s("斈\u0001"));
        th.printStackTrace(printWriter);
    }

    @fg.l
    @c1(version = "1.4")
    public static String i(@fg.l Throwable th) {
        kotlin.jvm.internal.l0.p(th, ProtectedSandApp.s("斅\u0001"));
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.l0.o(stringWriter2, ProtectedSandApp.s("斉\u0001"));
        return stringWriter2;
    }
}
