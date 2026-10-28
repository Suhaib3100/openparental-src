package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.squareup.picasso.a;
import com.squareup.picasso.a0;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: Picasso.java */
/* loaded from: classes6.dex */
public class w {

    /* renamed from: p, reason: collision with root package name */
    static final String f70968p = "Picasso";

    /* renamed from: q, reason: collision with root package name */
    static final Handler f70969q = new a(Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static volatile w f70970r = null;

    /* renamed from: a, reason: collision with root package name */
    private final d f70971a;

    /* renamed from: b, reason: collision with root package name */
    private final g f70972b;

    /* renamed from: c, reason: collision with root package name */
    private final c f70973c;

    /* renamed from: d, reason: collision with root package name */
    private final List<d0> f70974d;

    /* renamed from: e, reason: collision with root package name */
    final Context f70975e;

    /* renamed from: f, reason: collision with root package name */
    final j f70976f;

    /* renamed from: g, reason: collision with root package name */
    final com.squareup.picasso.e f70977g;

    /* renamed from: h, reason: collision with root package name */
    final f0 f70978h;

    /* renamed from: i, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f70979i;

    /* renamed from: j, reason: collision with root package name */
    final Map<ImageView, i> f70980j;

    /* renamed from: k, reason: collision with root package name */
    final ReferenceQueue<Object> f70981k;

    /* renamed from: l, reason: collision with root package name */
    final Bitmap.Config f70982l;

    /* renamed from: m, reason: collision with root package name */
    boolean f70983m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f70984n;

    /* renamed from: o, reason: collision with root package name */
    boolean f70985o;

    /* compiled from: Picasso.java */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().f70984n) {
                    k0.u("Main", "canceled", aVar.f70719b.e(), "target got garbage collected");
                }
                aVar.f70718a.b(aVar.k());
                return;
            }
            int i5 = 0;
            if (i4 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i5 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i5);
                    cVar.f70789c.g(cVar);
                    i5++;
                }
                return;
            }
            if (i4 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i5 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i5);
                aVar2.f70718a.x(aVar2);
                i5++;
            }
        }
    }

    /* compiled from: Picasso.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f70986a;

        /* renamed from: b, reason: collision with root package name */
        private k f70987b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f70988c;

        /* renamed from: d, reason: collision with root package name */
        private com.squareup.picasso.e f70989d;

        /* renamed from: e, reason: collision with root package name */
        private d f70990e;

        /* renamed from: f, reason: collision with root package name */
        private g f70991f;

        /* renamed from: g, reason: collision with root package name */
        private List<d0> f70992g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap.Config f70993h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f70994i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f70995j;

        public b(@o0 Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f70986a = context.getApplicationContext();
        }

        public b a(@o0 d0 d0Var) {
            if (d0Var == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.f70992g == null) {
                this.f70992g = new ArrayList();
            }
            if (this.f70992g.contains(d0Var)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.f70992g.add(d0Var);
            return this;
        }

        public w b() {
            Context context = this.f70986a;
            if (this.f70987b == null) {
                this.f70987b = new v(context);
            }
            if (this.f70989d == null) {
                this.f70989d = new p(context);
            }
            if (this.f70988c == null) {
                this.f70988c = new y();
            }
            if (this.f70991f == null) {
                this.f70991f = g.f71000a;
            }
            f0 f0Var = new f0(this.f70989d);
            return new w(context, new j(context, this.f70988c, w.f70969q, this.f70987b, this.f70989d, f0Var), this.f70989d, this.f70990e, this.f70991f, this.f70992g, f0Var, this.f70993h, this.f70994i, this.f70995j);
        }

        public b c(@o0 Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.f70993h = config;
            return this;
        }

        public b d(@o0 k kVar) {
            if (kVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f70987b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f70987b = kVar;
            return this;
        }

        public b e(@o0 ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.f70988c != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.f70988c = executorService;
            return this;
        }

        public b f(boolean z4) {
            this.f70994i = z4;
            return this;
        }

        public b g(@o0 d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f70990e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f70990e = dVar;
            return this;
        }

        public b h(boolean z4) {
            this.f70995j = z4;
            return this;
        }

        public b i(@o0 com.squareup.picasso.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.f70989d != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.f70989d = eVar;
            return this;
        }

        public b j(@o0 g gVar) {
            if (gVar == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.f70991f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.f70991f = gVar;
            return this;
        }
    }

    /* compiled from: Picasso.java */
    private static class c extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private final ReferenceQueue<Object> f70996b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f70997c;

        /* compiled from: Picasso.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Exception f70998b;

            a(Exception exc) {
                this.f70998b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f70998b);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f70996b = referenceQueue;
            this.f70997c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        void a() {
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0992a c0992a = (a.C0992a) this.f70996b.remove(1000L);
                    Message obtainMessage = this.f70997c.obtainMessage();
                    if (c0992a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0992a.f70730a;
                        this.f70997c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e4) {
                    this.f70997c.post(new a(e4));
                    return;
                }
            }
        }
    }

    /* compiled from: Picasso.java */
    public interface d {
        void a(w wVar, Uri uri, Exception exc);
    }

    /* compiled from: Picasso.java */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(c1.a.f38447c);

        final int debugColor;

        e(int i4) {
            this.debugColor = i4;
        }
    }

    /* compiled from: Picasso.java */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: Picasso.java */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f71000a = new a();

        /* compiled from: Picasso.java */
        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.w.g
            public b0 a(b0 b0Var) {
                return b0Var;
            }
        }

        b0 a(b0 b0Var);
    }

    w(Context context, j jVar, com.squareup.picasso.e eVar, d dVar, g gVar, List<d0> list, f0 f0Var, Bitmap.Config config, boolean z4, boolean z5) {
        this.f70975e = context;
        this.f70976f = jVar;
        this.f70977g = eVar;
        this.f70971a = dVar;
        this.f70972b = gVar;
        this.f70982l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new e0(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.g(context));
        arrayList.add(new r(context));
        arrayList.add(new h(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new m(context));
        arrayList.add(new u(jVar.f70897d, f0Var));
        this.f70974d = Collections.unmodifiableList(arrayList);
        this.f70978h = f0Var;
        this.f70979i = new WeakHashMap();
        this.f70980j = new WeakHashMap();
        this.f70983m = z4;
        this.f70984n = z5;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f70981k = referenceQueue;
        c cVar = new c(referenceQueue, f70969q);
        this.f70973c = cVar;
        cVar.start();
    }

    public static void B(@o0 w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (w.class) {
            try {
                if (f70970r != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                f70970r = wVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Bitmap bitmap, e eVar, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f70979i.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.f70984n) {
                k0.u("Main", "errored", aVar.f70719b.e(), exc.getMessage());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, eVar);
        if (this.f70984n) {
            k0.u("Main", "completed", aVar.f70719b.e(), "from " + eVar);
        }
    }

    public static w k() {
        if (f70970r == null) {
            synchronized (w.class) {
                try {
                    if (f70970r == null) {
                        Context context = PicassoProvider.f70717b;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f70970r = new b(context).b();
                    }
                } finally {
                }
            }
        }
        return f70970r;
    }

    public void A(boolean z4) {
        this.f70984n = z4;
    }

    public void C() {
        if (this == f70970r) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.f70985o) {
            return;
        }
        this.f70977g.clear();
        this.f70973c.a();
        this.f70978h.n();
        this.f70976f.z();
        Iterator<i> it = this.f70980j.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f70980j.clear();
        this.f70985o = true;
    }

    void D(com.squareup.picasso.a aVar) {
        this.f70976f.j(aVar);
    }

    b0 E(b0 b0Var) {
        b0 a5 = this.f70972b.a(b0Var);
        if (a5 != null) {
            return a5;
        }
        throw new IllegalStateException("Request transformer " + this.f70972b.getClass().getCanonicalName() + " returned null for " + b0Var);
    }

    public boolean a() {
        return this.f70983m;
    }

    void b(Object obj) {
        k0.c();
        com.squareup.picasso.a remove = this.f70979i.remove(obj);
        if (remove != null) {
            remove.a();
            this.f70976f.c(remove);
        }
        if (obj instanceof ImageView) {
            i remove2 = this.f70980j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    public void c(@o0 ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        b(imageView);
    }

    public void d(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4) {
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews cannot be null.");
        }
        b(new a0.c(remoteViews, i4));
    }

    public void e(@o0 h0 h0Var) {
        if (h0Var == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        b(h0Var);
    }

    public void f(@o0 Object obj) {
        k0.c();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancel requests with null tag.");
        }
        ArrayList arrayList = new ArrayList(this.f70979i.values());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) arrayList.get(i4);
            if (obj.equals(aVar.j())) {
                b(aVar.k());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f70980j.values());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            i iVar = (i) arrayList2.get(i5);
            if (obj.equals(iVar.b())) {
                iVar.a();
            }
        }
    }

    void g(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h4 = cVar.h();
        List<com.squareup.picasso.a> i4 = cVar.i();
        boolean z4 = (i4 == null || i4.isEmpty()) ? false : true;
        if (h4 != null || z4) {
            Uri uri = cVar.j().f70750d;
            Exception k4 = cVar.k();
            Bitmap s4 = cVar.s();
            e o4 = cVar.o();
            if (h4 != null) {
                i(s4, o4, h4, k4);
            }
            if (z4) {
                int size = i4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    i(s4, o4, i4.get(i5), k4);
                }
            }
            d dVar = this.f70971a;
            if (dVar == null || k4 == null) {
                return;
            }
            dVar.a(this, uri, k4);
        }
    }

    void h(ImageView imageView, i iVar) {
        if (this.f70980j.containsKey(imageView)) {
            b(imageView);
        }
        this.f70980j.put(imageView, iVar);
    }

    void j(com.squareup.picasso.a aVar) {
        Object k4 = aVar.k();
        if (k4 != null && this.f70979i.get(k4) != aVar) {
            b(k4);
            this.f70979i.put(k4, aVar);
        }
        D(aVar);
    }

    List<d0> l() {
        return this.f70974d;
    }

    public g0 m() {
        return this.f70978h.a();
    }

    public void n(@q0 Uri uri) {
        if (uri != null) {
            this.f70977g.b(uri.toString());
        }
    }

    public void o(@o0 File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        n(Uri.fromFile(file));
    }

    public void p(@q0 String str) {
        if (str != null) {
            n(Uri.parse(str));
        }
    }

    public boolean q() {
        return this.f70984n;
    }

    public c0 r(@androidx.annotation.v int i4) {
        if (i4 != 0) {
            return new c0(this, null, i4);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public c0 s(@q0 Uri uri) {
        return new c0(this, uri, 0);
    }

    public c0 t(@o0 File file) {
        return file == null ? new c0(this, null, 0) : s(Uri.fromFile(file));
    }

    public c0 u(@q0 String str) {
        if (str == null) {
            return new c0(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return s(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void v(@o0 Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f70976f.g(obj);
    }

    Bitmap w(String str) {
        Bitmap bitmap = this.f70977g.get(str);
        if (bitmap != null) {
            this.f70978h.d();
        } else {
            this.f70978h.e();
        }
        return bitmap;
    }

    void x(com.squareup.picasso.a aVar) {
        Bitmap w4 = s.shouldReadFromMemoryCache(aVar.f70722e) ? w(aVar.d()) : null;
        if (w4 == null) {
            j(aVar);
            if (this.f70984n) {
                k0.t("Main", "resumed", aVar.f70719b.e());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        i(w4, eVar, aVar, null);
        if (this.f70984n) {
            k0.u("Main", "completed", aVar.f70719b.e(), "from " + eVar);
        }
    }

    public void y(@o0 Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f70976f.h(obj);
    }

    public void z(boolean z4) {
        this.f70983m = z4;
    }
}
