package top.zibin.luban;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Luban.java */
/* loaded from: classes9.dex */
public class h implements Handler.Callback {

    /* renamed from: j, reason: collision with root package name */
    private static final String f91937j = ProtectedSandApp.s("꙼\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f91938k = ProtectedSandApp.s("ꙻ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final int f91939l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f91940m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f91941n = 2;

    /* renamed from: b, reason: collision with root package name */
    private String f91942b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f91943c;

    /* renamed from: d, reason: collision with root package name */
    private int f91944d;

    /* renamed from: e, reason: collision with root package name */
    private k f91945e;

    /* renamed from: f, reason: collision with root package name */
    private j f91946f;

    /* renamed from: g, reason: collision with root package name */
    private c f91947g;

    /* renamed from: h, reason: collision with root package name */
    private List<g> f91948h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f91949i;

    /* compiled from: Luban.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f91950b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f91951c;

        a(Context context, g gVar) {
            this.f91950b = context;
            this.f91951c = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.this.f91949i.sendMessage(h.this.f91949i.obtainMessage(1));
                h.this.f91949i.sendMessage(h.this.f91949i.obtainMessage(0, h.this.f(this.f91950b, this.f91951c)));
            } catch (Exception e4) {
                h.this.f91949i.sendMessage(h.this.f91949i.obtainMessage(2, e4));
            }
        }
    }

    /* compiled from: Luban.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f91953a;

        /* renamed from: b, reason: collision with root package name */
        private String f91954b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f91955c;

        /* renamed from: e, reason: collision with root package name */
        private k f91957e;

        /* renamed from: f, reason: collision with root package name */
        private j f91958f;

        /* renamed from: g, reason: collision with root package name */
        private top.zibin.luban.c f91959g;

        /* renamed from: d, reason: collision with root package name */
        private int f91956d = 100;

        /* renamed from: h, reason: collision with root package name */
        private List<g> f91960h = new ArrayList();

        /* compiled from: Luban.java */
        class a extends f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f91961b;

            a(File file) {
                this.f91961b = file;
            }

            @Override // top.zibin.luban.f
            public InputStream a() throws IOException {
                return new FileInputStream(this.f91961b);
            }

            @Override // top.zibin.luban.g
            public String getPath() {
                return this.f91961b.getAbsolutePath();
            }
        }

        /* compiled from: Luban.java */
        /* renamed from: top.zibin.luban.h$b$b, reason: collision with other inner class name */
        class C1397b extends f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f91963b;

            C1397b(String str) {
                this.f91963b = str;
            }

            @Override // top.zibin.luban.f
            public InputStream a() throws IOException {
                return new FileInputStream(this.f91963b);
            }

            @Override // top.zibin.luban.g
            public String getPath() {
                return this.f91963b;
            }
        }

        /* compiled from: Luban.java */
        class c extends f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f91965b;

            c(Uri uri) {
                this.f91965b = uri;
            }

            @Override // top.zibin.luban.f
            public InputStream a() throws IOException {
                return b.this.f91953a.getContentResolver().openInputStream(this.f91965b);
            }

            @Override // top.zibin.luban.g
            public String getPath() {
                return this.f91965b.getPath();
            }
        }

        /* compiled from: Luban.java */
        class d extends f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f91967b;

            d(String str) {
                this.f91967b = str;
            }

            @Override // top.zibin.luban.f
            public InputStream a() throws IOException {
                return new FileInputStream(this.f91967b);
            }

            @Override // top.zibin.luban.g
            public String getPath() {
                return this.f91967b;
            }
        }

        b(Context context) {
            this.f91953a = context;
        }

        private h h() {
            return new h(this);
        }

        public b i(top.zibin.luban.c cVar) {
            this.f91959g = cVar;
            return this;
        }

        public File j(String str) throws IOException {
            return h().h(new d(str), this.f91953a);
        }

        public List<e> k() throws IOException {
            return h().i(this.f91953a);
        }

        public b l(int i4) {
            this.f91956d = i4;
            return this;
        }

        public void m() {
            h().n(this.f91953a);
        }

        public b n(Uri uri) {
            this.f91960h.add(new c(uri));
            return this;
        }

        public b o(File file) {
            this.f91960h.add(new a(file));
            return this;
        }

        public b p(String str) {
            this.f91960h.add(new C1397b(str));
            return this;
        }

        public <T> b q(List<T> list) {
            for (T t4 : list) {
                if (t4 instanceof String) {
                    p((String) t4);
                } else if (t4 instanceof File) {
                    o((File) t4);
                } else {
                    if (!(t4 instanceof Uri)) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("ꙺ\u0001"));
                    }
                    n((Uri) t4);
                }
            }
            return this;
        }

        public b r(g gVar) {
            this.f91960h.add(gVar);
            return this;
        }

        public b s(int i4) {
            return this;
        }

        public b t(j jVar) {
            this.f91958f = jVar;
            return this;
        }

        public b u(boolean z4) {
            this.f91955c = z4;
            return this;
        }

        public b v(k kVar) {
            this.f91957e = kVar;
            return this;
        }

        public b w(String str) {
            this.f91954b = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e f(Context context, g gVar) throws IOException {
        try {
            return g(context, gVar);
        } finally {
            gVar.close();
        }
    }

    private e g(Context context, g gVar) throws IOException {
        File file;
        File a5;
        e eVar = new e();
        top.zibin.luban.b bVar = top.zibin.luban.b.SINGLE;
        File l4 = l(context, bVar.extSuffix(gVar, this.f91943c));
        k kVar = this.f91945e;
        if (kVar != null) {
            l4 = m(context, kVar.a(gVar.getPath()));
        }
        c cVar = this.f91947g;
        if (cVar == null) {
            d dVar = new d(gVar, l4, this.f91943c);
            if (bVar.needCompress(this.f91944d, gVar.getPath())) {
                a5 = dVar.a();
                eVar.f91933b = dVar.c()[0];
                eVar.f91934c = dVar.c()[1];
                eVar.f91935d = dVar.c()[2];
            } else {
                file = new File(gVar.getPath());
                a5 = file;
            }
        } else if (cVar.a(gVar.getPath()) && bVar.needCompress(this.f91944d, gVar.getPath())) {
            d dVar2 = new d(gVar, l4, this.f91943c);
            a5 = dVar2.a();
            eVar.f91933b = dVar2.c()[0];
            eVar.f91934c = dVar2.c()[1];
            eVar.f91935d = dVar2.c()[2];
        } else {
            file = new File(gVar.getPath());
            a5 = file;
        }
        eVar.f91932a = a5.getAbsolutePath();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File h(g gVar, Context context) throws IOException {
        try {
            return new d(gVar, l(context, top.zibin.luban.b.SINGLE.extSuffix(gVar, this.f91943c)), this.f91943c).a();
        } finally {
            gVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<e> i(Context context) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f91948h.iterator();
        while (it.hasNext()) {
            arrayList.add(f(context, it.next()));
            it.remove();
        }
        return arrayList;
    }

    public static File j(Context context) {
        return k(context, ProtectedSandApp.s("ꙻ\u0001"));
    }

    private static File k(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            Log.isLoggable(ProtectedSandApp.s("꙼\u0001"), 6);
            return null;
        }
        File file = new File(externalCacheDir, str);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    private File l(Context context, String str) {
        if (TextUtils.isEmpty(this.f91942b)) {
            this.f91942b = k(context, ProtectedSandApp.s("ꙻ\u0001")).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f91942b);
        sb.append(ProtectedSandApp.s("꙽\u0001"));
        sb.append(System.currentTimeMillis());
        sb.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ProtectedSandApp.s("꙾\u0001");
        }
        sb.append(str);
        return new File(sb.toString());
    }

    private File m(Context context, String str) {
        if (TextUtils.isEmpty(this.f91942b)) {
            this.f91942b = k(context, ProtectedSandApp.s("ꙻ\u0001")).getAbsolutePath();
        }
        return new File(k0.a(new StringBuilder(), this.f91942b, ProtectedSandApp.s("꙽\u0001"), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Context context) {
        List<g> list = this.f91948h;
        if (list == null || (list.size() == 0 && this.f91946f != null)) {
            this.f91946f.onError(new NullPointerException(ProtectedSandApp.s("ꙿ\u0001")));
        }
        Iterator<g> it = this.f91948h.iterator();
        while (it.hasNext()) {
            AsyncTask.SERIAL_EXECUTOR.execute(new a(context, it.next()));
            it.remove();
        }
    }

    public static b o(Context context) {
        return new b(context);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        j jVar = this.f91946f;
        if (jVar == null) {
            return false;
        }
        int i4 = message.what;
        if (i4 == 0) {
            jVar.a((e) message.obj);
        } else if (i4 == 1) {
            jVar.onStart();
        } else if (i4 == 2) {
            jVar.onError((Throwable) message.obj);
        }
        return false;
    }

    private h(b bVar) {
        this.f91942b = bVar.f91954b;
        this.f91945e = bVar.f91957e;
        this.f91948h = bVar.f91960h;
        this.f91946f = bVar.f91958f;
        this.f91944d = bVar.f91956d;
        this.f91947g = bVar.f91959g;
        this.f91949i = new Handler(Looper.getMainLooper(), this);
    }
}
