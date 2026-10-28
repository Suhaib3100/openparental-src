package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: h, reason: collision with root package name */
    private static final long f43833h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final StackTraceElement[] f43834i = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    private final List<Throwable> f43835b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.f f43836c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.a f43837d;

    /* renamed from: e, reason: collision with root package name */
    private Class<?> f43838e;

    /* renamed from: f, reason: collision with root package name */
    private String f43839f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private Exception f43840g;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f43835b.iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            appendable.append(ProtectedSandApp.s("ࢍ")).append(String.valueOf(i5)).append(ProtectedSandApp.s("ࢎ")).append(String.valueOf(size)).append(ProtectedSandApp.s("\u088f"));
            Throwable th = list.get(i4);
            if (th instanceof GlideException) {
                ((GlideException) th).i(appendable);
            } else {
                d(th, appendable);
            }
            i4 = i5;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(ProtectedSandApp.s("\u0890")).append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void i(Appendable appendable) {
        d(this, appendable);
        b(this.f43835b, new a(appendable));
    }

    public List<Throwable> e() {
        return this.f43835b;
    }

    @q0
    public Exception f() {
        return this.f43840g;
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
        sb.append(this.f43839f);
        Class<?> cls = this.f43838e;
        String s4 = ProtectedSandApp.s("\u0891");
        sb.append(cls != null ? s4 + this.f43838e : "");
        sb.append(this.f43837d != null ? s4 + this.f43837d : "");
        sb.append(this.f43836c != null ? s4 + this.f43836c : "");
        List<Throwable> g4 = g();
        if (g4.isEmpty()) {
            return sb.toString();
        }
        if (g4.size() == 1) {
            sb.append(ProtectedSandApp.s("\u0892"));
        } else {
            sb.append(ProtectedSandApp.s("\u0893"));
            sb.append(g4.size());
            sb.append(ProtectedSandApp.s("\u0894"));
        }
        for (Throwable th : g4) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append(ProtectedSandApp.s("\u0895"));
        return sb.toString();
    }

    public void h(String str) {
        List<Throwable> g4 = g();
        int size = g4.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            g4.get(i4);
            i4 = i5;
        }
    }

    void j(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar) {
        k(fVar, aVar, null);
    }

    void k(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f43836c = fVar;
        this.f43837d = aVar;
        this.f43838e = cls;
    }

    public void l(@q0 Exception exc) {
        this.f43840g = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        i(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f43839f = str;
        setStackTrace(f43834i);
        this.f43835b = list;
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

        /* renamed from: d, reason: collision with root package name */
        private static final String f43841d = "";

        /* renamed from: e, reason: collision with root package name */
        private static final String f43842e = ProtectedSandApp.s("ࢌ");

        /* renamed from: b, reason: collision with root package name */
        private final Appendable f43843b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43844c = true;

        a(Appendable appendable) {
            this.f43843b = appendable;
        }

        @o0
        private CharSequence a(@q0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c5) throws IOException {
            if (this.f43844c) {
                this.f43844c = false;
                this.f43843b.append(ProtectedSandApp.s("ࢌ"));
            }
            this.f43844c = c5 == '\n';
            this.f43843b.append(c5);
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
        public Appendable append(@q0 CharSequence charSequence, int i4, int i5) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z4 = false;
            if (this.f43844c) {
                this.f43844c = false;
                this.f43843b.append(ProtectedSandApp.s("ࢌ"));
            }
            if (charSequence.length() > 0 && charSequence.charAt(i5 - 1) == '\n') {
                z4 = true;
            }
            this.f43844c = z4;
            this.f43843b.append(charSequence, i4, i5);
            return this;
        }
    }
}
