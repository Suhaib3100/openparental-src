package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes6.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f60583a;

    /* renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f60585c;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f60589g;

    /* renamed from: h, reason: collision with root package name */
    private final n f60590h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.g f60591i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.installations.k f60592j;

    /* renamed from: k, reason: collision with root package name */
    g f60593k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f60594l;

    /* renamed from: m, reason: collision with root package name */
    private final String f60595m;

    /* renamed from: p, reason: collision with root package name */
    private final q f60598p;

    /* renamed from: s, reason: collision with root package name */
    private static final String f60577s = ProtectedSandApp.s("Π\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f60578t = ProtectedSandApp.s("Ρ\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f60579u = ProtectedSandApp.s("\u03a2\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f60580v = ProtectedSandApp.s("Σ\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f60581w = ProtectedSandApp.s("Τ\u0001");

    /* renamed from: x, reason: collision with root package name */
    private static final String f60582x = ProtectedSandApp.s("Υ\u0001");

    /* renamed from: q, reason: collision with root package name */
    @m1
    static final int[] f60575q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f60576r = Pattern.compile(ProtectedSandApp.s("Φ\u0001"));

    /* renamed from: f, reason: collision with root package name */
    private final int f60588f = 8;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private boolean f60584b = false;

    /* renamed from: n, reason: collision with root package name */
    private final Random f60596n = new Random();

    /* renamed from: o, reason: collision with root package name */
    private final Clock f60597o = DefaultClock.getInstance();

    /* renamed from: d, reason: collision with root package name */
    @b0("this")
    private boolean f60586d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60587e = false;

    /* compiled from: ConfigRealtimeHttpClient.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.e();
        }
    }

    /* compiled from: ConfigRealtimeHttpClient.java */
    class b implements com.google.firebase.remoteconfig.d {
        b() {
        }

        @Override // com.google.firebase.remoteconfig.d
        public void a(@o0 com.google.firebase.remoteconfig.c cVar) {
        }

        @Override // com.google.firebase.remoteconfig.d
        public void b(@o0 FirebaseRemoteConfigException firebaseRemoteConfigException) {
            u.this.j();
            u.this.w(firebaseRemoteConfigException);
        }
    }

    public u(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, n nVar, g gVar2, Context context, String str, Set<com.google.firebase.remoteconfig.d> set, q qVar, ScheduledExecutorService scheduledExecutorService) {
        this.f60583a = set;
        this.f60589g = scheduledExecutorService;
        this.f60585c = Math.max(8 - qVar.j().b(), 1);
        this.f60591i = gVar;
        this.f60590h = nVar;
        this.f60592j = kVar;
        this.f60593k = gVar2;
        this.f60594l = context;
        this.f60595m = str;
        this.f60598p = qVar;
    }

    private synchronized void A(boolean z4) {
        this.f60584b = z4;
    }

    private void F(Date date) {
        int b5 = this.f60598p.j().b() + 1;
        this.f60598p.r(b5, new Date(date.getTime() + o(b5)));
    }

    private synchronized boolean f() {
        boolean z4;
        if (!this.f60583a.isEmpty() && !this.f60584b && !this.f60586d) {
            z4 = this.f60587e ? false : true;
        }
        return z4;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("Χ\u0001"), k(this.f60591i.s().j()));
        hashMap.put(ProtectedSandApp.s("Ψ\u0001"), this.f60595m);
        hashMap.put(ProtectedSandApp.s("Ω\u0001"), Long.toString(this.f60590h.s()));
        hashMap.put(ProtectedSandApp.s("Ϊ\u0001"), this.f60591i.s().j());
        hashMap.put(ProtectedSandApp.s("Ϋ\u0001"), ProtectedSandApp.s("ά\u0001"));
        hashMap.put(ProtectedSandApp.s("έ\u0001"), str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.f60586d = true;
    }

    private static String k(String str) {
        Matcher matcher = f60576r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String m() {
        try {
            Context context = this.f60594l;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f60594l.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f60594l.getPackageName();
            return null;
        }
    }

    private long o(int i4) {
        int length = f60575q.length;
        if (i4 >= length) {
            i4 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i4 - 1]) / 2) + this.f60596n.nextInt((int) r0);
    }

    private String p(String str) {
        return String.format(ProtectedSandApp.s("ή\u0001"), k(this.f60591i.s().j()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f60595m));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private boolean r(int i4) {
        return i4 == 408 || i4 == 429 || i4 == 502 || i4 == 503 || i4 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task s(Task task, Task task2) throws Exception {
        Integer num;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        boolean r4;
        String s4 = ProtectedSandApp.s("ί\u0001");
        boolean z4 = true;
        try {
        } catch (IOException unused) {
            httpURLConnection = null;
            num = null;
        } catch (Throwable th2) {
            num = null;
            th = th2;
            httpURLConnection = null;
        }
        if (!task.isSuccessful()) {
            throw new IOException(task.getException());
        }
        A(true);
        httpURLConnection = (HttpURLConnection) task.getResult();
        try {
            responseCode = httpURLConnection.getResponseCode();
            num = Integer.valueOf(responseCode);
            if (responseCode == 200) {
                try {
                    x();
                    this.f60598p.l();
                    D(httpURLConnection).i();
                } catch (IOException unused2) {
                    g(httpURLConnection);
                    A(false);
                    if (num != null && !r(num.intValue())) {
                        z4 = false;
                    }
                    if (z4) {
                        F(new Date(this.f60597o.currentTimeMillis()));
                    }
                    if (!z4 && num.intValue() != 200) {
                        String format = String.format(s4, num);
                        if (num.intValue() == 403) {
                            format = v(httpURLConnection.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num.intValue(), format, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                        w(firebaseRemoteConfigServerException);
                        return Tasks.forResult(null);
                    }
                    y();
                    return Tasks.forResult(null);
                } catch (Throwable th3) {
                    th = th3;
                    g(httpURLConnection);
                    A(false);
                    if (num != null && !r(num.intValue())) {
                        z4 = false;
                    }
                    if (z4) {
                        F(new Date(this.f60597o.currentTimeMillis()));
                    }
                    if (z4 || num.intValue() == 200) {
                        y();
                    } else {
                        String format2 = String.format(s4, num);
                        if (num.intValue() == 403) {
                            format2 = v(httpURLConnection.getErrorStream());
                        }
                        w(new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                    }
                    throw th;
                }
            }
            g(httpURLConnection);
            A(false);
            r4 = r(responseCode);
            if (r4) {
                F(new Date(this.f60597o.currentTimeMillis()));
            }
        } catch (IOException unused3) {
            num = null;
        } catch (Throwable th4) {
            num = null;
            th = th4;
        }
        if (!r4 && responseCode != 200) {
            String format3 = String.format(s4, num);
            if (responseCode == 403) {
                format3 = v(httpURLConnection.getErrorStream());
            }
            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, format3, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
            w(firebaseRemoteConfigServerException);
            return Tasks.forResult(null);
        }
        y();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task t(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ΰ\u0001"), task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("α\u0001"), task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) q().openConnection();
            C(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.o) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e4) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("β\u0001"), e4));
        }
    }

    private synchronized void u(long j4) {
        try {
            if (f()) {
                int i4 = this.f60585c;
                if (i4 > 0) {
                    this.f60585c = i4 - 1;
                    this.f60589g.schedule(new a(), j4, TimeUnit.MILLISECONDS);
                } else if (!this.f60587e) {
                    w(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("γ\u0001"), FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String v(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return ProtectedSandApp.s("δ\u0001");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f60583a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    private synchronized void x() {
        this.f60585c = 8;
    }

    private void z(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Τ\u0001"), str);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Π\u0001"), this.f60591i.s().i());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Ρ\u0001"), this.f60594l.getPackageName());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("\u03a2\u0001"), m());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Σ\u0001"), ProtectedSandApp.s("ε\u0001"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("Υ\u0001"), ProtectedSandApp.s("ζ\u0001"));
        String s4 = ProtectedSandApp.s("η\u0001");
        String s5 = ProtectedSandApp.s("θ\u0001");
        httpURLConnection.setRequestProperty(s4, s5);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ι\u0001"), s5);
    }

    void B(boolean z4) {
        this.f60587e = z4;
    }

    @SuppressLint({"VisibleForTests"})
    public void C(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("κ\u0001"));
        z(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes(ProtectedSandApp.s("λ\u0001"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized c D(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f60590h, this.f60593k, this.f60583a, new b(), this.f60589g);
    }

    public void E() {
        u(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (f()) {
            if (new Date(this.f60597o.currentTimeMillis()).before(this.f60598p.j().a())) {
                y();
            } else {
                final Task<HttpURLConnection> h4 = h();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{h4}).continueWith(this.f60589g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.t
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Task s4;
                        s4 = u.this.s(h4, task);
                        return s4;
                    }
                });
            }
        }
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> h() {
        final Task<com.google.firebase.installations.o> c5 = this.f60592j.c(false);
        final Task<String> a5 = this.f60592j.a();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{c5, a5}).continueWithTask(this.f60589g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.s
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task t4;
                t4 = u.this.t(c5, a5, task);
                return t4;
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public Date l() {
        return this.f60598p.j().a();
    }

    @SuppressLint({"VisibleForTests"})
    public int n() {
        return this.f60598p.j().b();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void y() {
        u(Math.max(0L, this.f60598p.j().a().getTime() - new Date(this.f60597o.currentTimeMillis()).getTime()));
    }
}
