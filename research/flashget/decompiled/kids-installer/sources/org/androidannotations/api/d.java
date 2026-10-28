package org.androidannotations.api;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewDebug;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ViewServer.java */
/* loaded from: classes5.dex */
public class d implements Runnable {
    private static d I = null;

    /* renamed from: x, reason: collision with root package name */
    private static final int f31766x = 4939;

    /* renamed from: y, reason: collision with root package name */
    private static final int f31767y = 10;

    /* renamed from: o, reason: collision with root package name */
    private ServerSocket f31769o;

    /* renamed from: p, reason: collision with root package name */
    private final int f31770p;

    /* renamed from: q, reason: collision with root package name */
    private Thread f31771q;

    /* renamed from: r, reason: collision with root package name */
    private ExecutorService f31772r;

    /* renamed from: s, reason: collision with root package name */
    private final List<e> f31773s;

    /* renamed from: t, reason: collision with root package name */
    private final Map<View, String> f31774t;

    /* renamed from: u, reason: collision with root package name */
    private final ReentrantReadWriteLock f31775u;

    /* renamed from: v, reason: collision with root package name */
    private View f31776v;

    /* renamed from: w, reason: collision with root package name */
    private final ReentrantReadWriteLock f31777w;
    private static final String A = "ViewServer";
    private static final String B = "4";
    private static final String C = "4";
    private static final String D = "PROTOCOL";
    private static final String E = "SERVER";
    private static final String F = "LIST";
    private static final String G = "AUTOLIST";
    private static final String H = "GET_FOCUS";

    /* renamed from: z, reason: collision with root package name */
    private static final String f31768z = "user";

    /* compiled from: ViewServer.java */
    /* loaded from: classes6.dex */
    private static final class b extends d {
        private b() {
            super();
        }

        @Override // org.androidannotations.api.d
        public void h(Activity activity) {
        }

        @Override // org.androidannotations.api.d
        public void i(View view, String str) {
        }

        @Override // org.androidannotations.api.d
        public boolean n() {
            return false;
        }

        @Override // org.androidannotations.api.d
        public void o(Activity activity) {
        }

        @Override // org.androidannotations.api.d
        public void p(View view) {
        }

        @Override // org.androidannotations.api.d
        public void r(Activity activity) {
        }

        @Override // org.androidannotations.api.d, java.lang.Runnable
        public void run() {
        }

        @Override // org.androidannotations.api.d
        public void s(View view) {
        }

        @Override // org.androidannotations.api.d
        public boolean t() throws IOException {
            return false;
        }

        @Override // org.androidannotations.api.d
        public boolean u() {
            return false;
        }

        b(a aVar) {
            super();
        }
    }

    /* compiled from: ViewServer.java */
    private static class c extends OutputStream {

        /* renamed from: o, reason: collision with root package name */
        private final OutputStream f31778o;

        c(OutputStream outputStream) {
            this.f31778o = outputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public boolean equals(Object obj) {
            return this.f31778o.equals(obj);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f31778o.flush();
        }

        public int hashCode() {
            return this.f31778o.hashCode();
        }

        public String toString() {
            return this.f31778o.toString();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i5, int i6) throws IOException {
            this.f31778o.write(bArr, i5, i6);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f31778o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i5) throws IOException {
            this.f31778o.write(i5);
        }
    }

    /* compiled from: ViewServer.java */
    /* renamed from: org.androidannotations.api.d$d, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private class RunnableC0494d implements Runnable, e {

        /* renamed from: o, reason: collision with root package name */
        private Socket f31779o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f31780p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f31781q;

        /* renamed from: r, reason: collision with root package name */
        private final Object[] f31782r;

        private View c(int i5) {
            if (i5 == -1) {
                d.this.f31775u.readLock().lock();
                try {
                    return d.this.f31776v;
                } finally {
                }
            }
            d.this.f31775u.readLock().lock();
            try {
                for (Map.Entry entry : d.this.f31774t.entrySet()) {
                    if (System.identityHashCode(entry.getKey()) == i5) {
                        return (View) entry.getKey();
                    }
                }
                d.this.f31775u.readLock().unlock();
                return null;
            } finally {
            }
        }

        private boolean d(Socket socket) {
            BufferedWriter bufferedWriter;
            boolean z5 = false;
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                d.this.f31777w.readLock().lock();
                try {
                    View view = d.this.f31776v;
                    if (view != null) {
                        d.this.f31775u.readLock().lock();
                        try {
                            String str = (String) d.this.f31774t.get(d.this.f31776v);
                            d.this.f31775u.readLock().unlock();
                            bufferedWriter.write(Integer.toHexString(System.identityHashCode(view)));
                            bufferedWriter.write(32);
                            bufferedWriter.append((CharSequence) str);
                        } catch (Throwable th2) {
                            d.this.f31775u.readLock().unlock();
                            throw th2;
                        }
                    }
                    bufferedWriter.write(10);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    z5 = true;
                } finally {
                    d.this.f31777w.readLock().unlock();
                }
            } catch (Exception unused3) {
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                return z5;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
            return z5;
        }

        private boolean e(Socket socket) {
            BufferedWriter bufferedWriter;
            boolean z5 = false;
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    d.this.f31775u.readLock().lock();
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                for (Map.Entry entry : d.this.f31774t.entrySet()) {
                    bufferedWriter.write(Integer.toHexString(System.identityHashCode(entry.getKey())));
                    bufferedWriter.write(32);
                    bufferedWriter.append((CharSequence) entry.getValue());
                    bufferedWriter.write(10);
                }
                bufferedWriter.write("DONE.\n");
                bufferedWriter.flush();
                d.this.f31775u.readLock().unlock();
                bufferedWriter.close();
                z5 = true;
            } catch (Exception unused3) {
                bufferedWriter2 = bufferedWriter;
                d.this.f31775u.readLock().unlock();
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                return z5;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                d.this.f31775u.readLock().unlock();
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
            return z5;
        }

        private boolean f(Socket socket, String str, String str2) {
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    int indexOf = str2.indexOf(32);
                    if (indexOf == -1) {
                        indexOf = str2.length();
                    }
                    int parseLong = (int) Long.parseLong(str2.substring(0, indexOf), 16);
                    String substring = indexOf < str2.length() ? str2.substring(indexOf + 1) : "";
                    View c6 = c(parseLong);
                    if (c6 == null) {
                        return false;
                    }
                    Method declaredMethod = ViewDebug.class.getDeclaredMethod("dispatchCommand", View.class, String.class, String.class, OutputStream.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, c6, str, substring, new c(socket.getOutputStream()));
                    if (!socket.isOutputShutdown()) {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        try {
                            bufferedWriter2.write("DONE\n");
                            bufferedWriter2.flush();
                            bufferedWriter = bufferedWriter2;
                        } catch (Exception unused) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter == null) {
                                return false;
                            }
                            bufferedWriter.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    return true;
                } catch (IOException unused3) {
                    return false;
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private boolean g() {
            boolean z5;
            boolean z6;
            boolean z7;
            d.this.j(this);
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(this.f31779o.getOutputStream()));
                    while (!Thread.interrupted()) {
                        try {
                            synchronized (this.f31782r) {
                                while (true) {
                                    z5 = this.f31780p;
                                    if (z5 || this.f31781q) {
                                        break;
                                    }
                                    this.f31782r.wait();
                                }
                                z6 = false;
                                if (z5) {
                                    this.f31780p = false;
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (this.f31781q) {
                                    this.f31781q = false;
                                    z6 = true;
                                }
                            }
                            if (z7) {
                                bufferedWriter2.write("LIST UPDATE\n");
                                bufferedWriter2.flush();
                            }
                            if (z6) {
                                bufferedWriter2.write("FOCUS UPDATE\n");
                                bufferedWriter2.flush();
                            }
                        } catch (Exception unused) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            d.this.q(this);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused2) {
                                }
                            }
                            d.this.q(this);
                            throw th;
                        }
                    }
                    bufferedWriter2.close();
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
            d.this.q(this);
            return true;
        }

        @Override // org.androidannotations.api.d.e
        public void a() {
            synchronized (this.f31782r) {
                this.f31780p = true;
                this.f31782r.notifyAll();
            }
        }

        @Override // org.androidannotations.api.d.e
        public void b() {
            synchronized (this.f31782r) {
                this.f31781q = true;
                this.f31782r.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BufferedReader bufferedReader;
            Throwable th;
            String substring;
            Socket socket;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(this.f31779o.getInputStream()), 1024);
                    try {
                        String readLine = bufferedReader.readLine();
                        int indexOf = readLine.indexOf(32);
                        if (indexOf == -1) {
                            substring = "";
                        } else {
                            String substring2 = readLine.substring(0, indexOf);
                            substring = readLine.substring(indexOf + 1);
                            readLine = substring2;
                        }
                        if ("PROTOCOL".equalsIgnoreCase(readLine)) {
                            d.v(this.f31779o, "4");
                        } else if ("SERVER".equalsIgnoreCase(readLine)) {
                            d.v(this.f31779o, "4");
                        } else if ("LIST".equalsIgnoreCase(readLine)) {
                            e(this.f31779o);
                        } else if ("GET_FOCUS".equalsIgnoreCase(readLine)) {
                            d(this.f31779o);
                        } else if ("AUTOLIST".equalsIgnoreCase(readLine)) {
                            g();
                        } else {
                            f(this.f31779o, readLine, substring);
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        socket = this.f31779o;
                    } catch (IOException unused) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        Socket socket2 = this.f31779o;
                        if (socket2 != null) {
                            socket2.close();
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        Socket socket3 = this.f31779o;
                        if (socket3 == null) {
                            throw th;
                        }
                        try {
                            socket3.close();
                            throw th;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
            if (socket != null) {
                socket.close();
            }
        }

        private RunnableC0494d(Socket socket) {
            this.f31782r = new Object[0];
            this.f31779o = socket;
            this.f31780p = false;
            this.f31781q = false;
        }
    }

    /* compiled from: ViewServer.java */
    private interface e {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar) {
        if (this.f31773s.contains(eVar)) {
            return;
        }
        this.f31773s.add(eVar);
    }

    private void k() {
        Iterator<e> it = this.f31773s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void l() {
        Iterator<e> it = this.f31773s.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static d m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!"user".equals(Build.TYPE) || (applicationInfo.flags & 2) == 0) {
            I = new b(null);
        } else {
            if (I == null) {
                I = new d(f31766x);
            }
            if (!I.n()) {
                try {
                    I.t();
                } catch (IOException unused) {
                }
            }
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(e eVar) {
        this.f31773s.remove(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Socket socket, String str) {
        BufferedWriter bufferedWriter;
        boolean z5 = false;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            } catch (IOException unused) {
            }
            try {
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
                bufferedWriter.close();
                z5 = true;
            } catch (Exception unused2) {
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                return z5;
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return z5;
    }

    public void h(Activity activity) {
        String sb;
        String charSequence = activity.getTitle().toString();
        if (TextUtils.isEmpty(charSequence)) {
            sb = activity.getClass().getCanonicalName() + "/0x" + System.identityHashCode(activity);
        } else {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(charSequence, "(");
            a6.append(activity.getClass().getCanonicalName());
            a6.append(")");
            sb = a6.toString();
        }
        i(activity.getWindow().getDecorView(), sb);
    }

    public void i(View view, String str) {
        this.f31775u.writeLock().lock();
        try {
            this.f31774t.put(view.getRootView(), str);
            this.f31775u.writeLock().unlock();
            l();
        } catch (Throwable th) {
            this.f31775u.writeLock().unlock();
            throw th;
        }
    }

    public boolean n() {
        Thread thread = this.f31771q;
        return thread != null && thread.isAlive();
    }

    public void o(Activity activity) {
        p(activity.getWindow().getDecorView());
    }

    public void p(View view) {
        this.f31775u.writeLock().lock();
        try {
            View rootView = view.getRootView();
            this.f31774t.remove(rootView);
            this.f31775u.writeLock().unlock();
            this.f31777w.writeLock().lock();
            try {
                if (this.f31776v == rootView) {
                    this.f31776v = null;
                }
                this.f31777w.writeLock().unlock();
                l();
            } catch (Throwable th) {
                this.f31777w.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f31775u.writeLock().unlock();
            throw th2;
        }
    }

    public void r(Activity activity) {
        s(activity.getWindow().getDecorView());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x000f -> B:3:0x000f). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f31769o = new ServerSocket(this.f31770p, 10, InetAddress.getLocalHost());
        } catch (Exception unused) {
        }
        while (this.f31769o != null && Thread.currentThread() == this.f31771q) {
            Socket accept = this.f31769o.accept();
            ExecutorService executorService = this.f31772r;
            if (executorService != null) {
                executorService.submit(new RunnableC0494d(accept));
            } else {
                try {
                    accept.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public void s(View view) {
        View rootView;
        this.f31777w.writeLock().lock();
        if (view == null) {
            rootView = null;
        } else {
            try {
                rootView = view.getRootView();
            } catch (Throwable th) {
                this.f31777w.writeLock().unlock();
                throw th;
            }
        }
        this.f31776v = rootView;
        this.f31777w.writeLock().unlock();
        k();
    }

    public boolean t() throws IOException {
        if (this.f31771q != null) {
            return false;
        }
        this.f31771q = new Thread(this, androidx.constraintlayout.solver.e.a(new StringBuilder("Local View Server [port="), this.f31770p, "]"));
        this.f31772r = Executors.newFixedThreadPool(10);
        this.f31771q.start();
        return true;
    }

    public boolean u() {
        Thread thread = this.f31771q;
        if (thread != null) {
            thread.interrupt();
            ExecutorService executorService = this.f31772r;
            if (executorService != null) {
                try {
                    executorService.shutdownNow();
                } catch (SecurityException unused) {
                }
            }
            this.f31772r = null;
            this.f31771q = null;
            try {
                this.f31769o.close();
                this.f31769o = null;
                return true;
            } catch (IOException unused2) {
            }
        }
        this.f31775u.writeLock().lock();
        try {
            this.f31774t.clear();
            this.f31775u.writeLock().unlock();
            this.f31777w.writeLock().lock();
            try {
                this.f31776v = null;
                this.f31777w.writeLock().unlock();
                return false;
            } catch (Throwable th) {
                this.f31777w.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f31775u.writeLock().unlock();
            throw th2;
        }
    }

    private d() {
        this.f31773s = new CopyOnWriteArrayList();
        this.f31774t = new HashMap();
        this.f31775u = new ReentrantReadWriteLock();
        this.f31777w = new ReentrantReadWriteLock();
        this.f31770p = -1;
    }

    private d(int i5) {
        this.f31773s = new CopyOnWriteArrayList();
        this.f31774t = new HashMap();
        this.f31775u = new ReentrantReadWriteLock();
        this.f31777w = new ReentrantReadWriteLock();
        this.f31770p = i5;
    }
}
