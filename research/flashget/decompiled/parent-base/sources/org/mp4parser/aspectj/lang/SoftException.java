package org.mp4parser.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes9.dex */
public class SoftException extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f87678c;

    /* renamed from: b, reason: collision with root package name */
    Throwable f87679b;

    static {
        boolean z4;
        try {
            Class.forName("java.nio.Buffer");
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        f87678c = z4;
    }

    public SoftException(Throwable th) {
        this.f87679b = th;
    }

    public Throwable a() {
        return this.f87679b;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f87679b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th = this.f87679b;
        if (f87678c || th == null) {
            return;
        }
        printStream.print("Caused by: ");
        th.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th = this.f87679b;
        if (f87678c || th == null) {
            return;
        }
        printWriter.print("Caused by: ");
        th.printStackTrace(printWriter);
    }
}
