package o9;

import androidx.annotation.q0;
import java.util.Stack;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f83753a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83754b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f83755c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    public final e f83756d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, @q0 e eVar) {
        this.f83753a = str;
        this.f83754b = str2;
        this.f83755c = stackTraceElementArr;
        this.f83756d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
