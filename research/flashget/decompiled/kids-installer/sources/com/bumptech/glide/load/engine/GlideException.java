package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: u, reason: collision with root package name */
    private static final long f11125u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final StackTraceElement[] f11126v = new StackTraceElement[0];

    /* renamed from: o, reason: collision with root package name */
    private final List<Throwable> f11127o;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.load.f f11128p;

    /* renamed from: q, reason: collision with root package name */
    private com.bumptech.glide.load.a f11129q;

    /* renamed from: r, reason: collision with root package name */
    private Class<?> f11130r;

    /* renamed from: s, reason: collision with root package name */
    private String f11131s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private Exception f11132t;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f11127o.iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            appendable.append(ProtectedSandApp.s("Đ")).append(String.valueOf(i6)).append(ProtectedSandApp.s("đ")).append(String.valueOf(size)).append(ProtectedSandApp.s("Ē"));
            Throwable th = list.get(i5);
            if (th instanceof GlideException) {
                ((GlideException) th).i(appendable);
            } else {
                d(th, appendable);
            }
            i5 = i6;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(ProtectedSandApp.s("ē")).append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void i(Appendable appendable) {
        d(this, appendable);
        b(this.f11127o, new a(appendable));
    }

    public List<Throwable> e() {
        return this.f11127o;
    }

    @q0
    public Exception f() {
        return this.f11132t;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f11131s);
        Class<?> cls = this.f11130r;
        String s5 = ProtectedSandApp.s("Ĕ");
        sb.append(cls != null ? s5 + this.f11130r : "");
        sb.append(this.f11129q != null ? s5 + this.f11129q : "");
        sb.append(this.f11128p != null ? s5 + this.f11128p : "");
        List<Throwable> g5 = g();
        if (g5.isEmpty()) {
            return sb.toString();
        }
        if (g5.size() == 1) {
            sb.append(ProtectedSandApp.s("ĕ"));
        } else {
            sb.append(ProtectedSandApp.s("Ė"));
            sb.append(g5.size());
            sb.append(ProtectedSandApp.s("ė"));
        }
        for (Throwable th : g5) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append(ProtectedSandApp.s("Ę"));
        return sb.toString();
    }

    public void h(String str) {
        List<Throwable> g5 = g();
        int size = g5.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            g5.get(i5);
            i5 = i6;
        }
    }

    void j(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar) {
        k(fVar, aVar, null);
    }

    void k(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f11128p = fVar;
        this.f11129q = aVar;
        this.f11130r = cls;
    }

    public void l(@q0 Exception exc) {
        this.f11132t = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        i(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f11131s = str;
        setStackTrace(f11126v);
        this.f11127o = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: q, reason: collision with root package name */
        private static final String f11133q = "";

        /* renamed from: r, reason: collision with root package name */
        private static final String f11134r = ProtectedSandApp.s("ď");

        /* renamed from: o, reason: collision with root package name */
        private final Appendable f11135o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f11136p = true;

        a(Appendable appendable) {
            this.f11135o = appendable;
        }

        @o0
        private CharSequence a(@q0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c6) throws IOException {
            if (this.f11136p) {
                this.f11136p = false;
                this.f11135o.append(ProtectedSandApp.s("č"));
            }
            this.f11136p = c6 == '\n';
            this.f11135o.append(c6);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@q0 CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            return append(charSequence, 0, charSequence.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@q0 CharSequence charSequence, int i5, int i6) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z5 = false;
            if (this.f11136p) {
                this.f11136p = false;
                this.f11135o.append(ProtectedSandApp.s("Ď"));
            }
            if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == '\n') {
                z5 = true;
            }
            this.f11136p = z5;
            this.f11135o.append(charSequence, i5, i6);
            return this;
        }
    }
}
