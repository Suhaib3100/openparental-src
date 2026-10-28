package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f18037a;

    /* renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f18039c;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f18043g;

    /* renamed from: h, reason: collision with root package name */
    private final n f18044h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.g f18045i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.installations.k f18046j;

    /* renamed from: k, reason: collision with root package name */
    g f18047k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f18048l;

    /* renamed from: m, reason: collision with root package name */
    private final String f18049m;

    /* renamed from: p, reason: collision with root package name */
    private final q f18052p;

    /* renamed from: s, reason: collision with root package name */
    private static final String f18031s = ProtectedSandApp.s("ᦡ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f18032t = ProtectedSandApp.s("ᦢ");

    /* renamed from: u, reason: collision with root package name */
    private static final String f18033u = ProtectedSandApp.s("ᦣ");

    /* renamed from: v, reason: collision with root package name */
    private static final String f18034v = ProtectedSandApp.s("ᦤ");

    /* renamed from: w, reason: collision with root package name */
    private static final String f18035w = ProtectedSandApp.s("ᦥ");

    /* renamed from: x, reason: collision with root package name */
    private static final String f18036x = ProtectedSandApp.s("ᦦ");

    /* renamed from: q, reason: collision with root package name */
    @m1
    static final int[] f18029q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f18030r = Pattern.compile(ProtectedSandApp.s("ᦧ"));

    /* renamed from: f, reason: collision with root package name */
    private final int f18042f = 8;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private boolean f18038b = false;

    /* renamed from: n, reason: collision with root package name */
    private final Random f18050n = new Random();

    /* renamed from: o, reason: collision with root package name */
    private final Clock f18051o = DefaultClock.getInstance();

    /* renamed from: d, reason: collision with root package name */
    @b0("this")
    private boolean f18040d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18041e = false;

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
    /* loaded from: classes3.dex */
    class b implements com.google.firebase.remoteconfig.d {
        b() {
        }

        @Override // com.google.firebase.remoteconfig.d
        public void a(@o0 FirebaseRemoteConfigException firebaseRemoteConfigException) {
            u.this.j();
            u.this.w(firebaseRemoteConfigException);
        }

        @Override // com.google.firebase.remoteconfig.d
        public void b(@o0 com.google.firebase.remoteconfig.c cVar) {
        }
    }

    public u(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, n nVar, g gVar2, Context context, String str, Set<com.google.firebase.remoteconfig.d> set, q qVar, ScheduledExecutorService scheduledExecutorService) {
        this.f18037a = set;
        this.f18043g = scheduledExecutorService;
        this.f18039c = Math.max(8 - qVar.j().b(), 1);
        this.f18045i = gVar;
        this.f18044h = nVar;
        this.f18046j = kVar;
        this.f18047k = gVar2;
        this.f18048l = context;
        this.f18049m = str;
        this.f18052p = qVar;
    }

    private synchronized void A(boolean z5) {
        this.f18038b = z5;
    }

    private void F(Date date) {
        int b6 = this.f18052p.j().b() + 1;
        this.f18052p.r(b6, new Date(date.getTime() + o(b6)));
    }

    private synchronized boolean f() {
        boolean z5;
        if (!this.f18037a.isEmpty() && !this.f18038b && !this.f18040d) {
            z5 = this.f18041e ? false : true;
        }
        return z5;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("ᦨ"), k(this.f18045i.s().j()));
        hashMap.put(ProtectedSandApp.s("ᦩ"), this.f18049m);
        hashMap.put(ProtectedSandApp.s("ᦪ"), Long.toString(this.f18044h.s()));
        hashMap.put(ProtectedSandApp.s("ᦫ"), this.f18045i.s().j());
        hashMap.put(ProtectedSandApp.s("\u19ac"), ProtectedSandApp.s("\u19ad"));
        hashMap.put(ProtectedSandApp.s("\u19ae"), str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.f18040d = true;
    }

    private static String k(String str) {
        Matcher matcher = f18030r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String m() {
        try {
            Context context = this.f18048l;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f18048l.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f18048l.getPackageName();
            return null;
        }
    }

    private long o(int i5) {
        int length = f18029q.length;
        if (i5 >= length) {
            i5 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i5 - 1]) / 2) + this.f18050n.nextInt((int) r0);
    }

    private String p(String str) {
        return String.format(ProtectedSandApp.s("\u19af"), k(this.f18045i.s().j()), str);
    }

    private URL q() {
        try {
            return new URL(p(this.f18049m));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private boolean r(int i5) {
        return i5 == 408 || i5 == 429 || i5 == 502 || i5 == 503 || i5 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task s(Task task, Task task2) throws Exception {
        Integer num;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z5;
        String s5 = ProtectedSandApp.s("ᦰ");
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
            num = Integer.valueOf(httpURLConnection.getResponseCode());
            try {
                if (num.intValue() == 200) {
                    x();
                    this.f18052p.l();
                    D(httpURLConnection).i();
                }
                g(httpURLConnection);
                A(false);
                z5 = r(num.intValue());
                if (z5) {
                    F(new Date(this.f18051o.currentTimeMillis()));
                }
            } catch (IOException unused2) {
                g(httpURLConnection);
                A(false);
                boolean z6 = num == null || r(num.intValue());
                if (z6) {
                    F(new Date(this.f18051o.currentTimeMillis()));
                }
                if (!z6 && num.intValue() != 200) {
                    String format = String.format(s5, num);
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
                boolean z7 = num == null || r(num.intValue());
                if (z7) {
                    F(new Date(this.f18051o.currentTimeMillis()));
                }
                if (z7 || num.intValue() == 200) {
                    y();
                } else {
                    String format2 = String.format(s5, num);
                    if (num.intValue() == 403) {
                        format2 = v(httpURLConnection.getErrorStream());
                    }
                    w(new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
        } catch (IOException unused3) {
            num = null;
        } catch (Throwable th4) {
            num = null;
            th = th4;
        }
        if (!z5 && num.intValue() != 200) {
            String format3 = String.format(s5, num);
            if (num.intValue() == 403) {
                format3 = v(httpURLConnection.getErrorStream());
            }
            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num.intValue(), format3, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
            w(firebaseRemoteConfigServerException);
            return Tasks.forResult(null);
        }
        y();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᦱ"), task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᦲ"), task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) q().openConnection();
            C(httpURLConnection, (String) task2.getResult(), ((com.google.firebase.installations.o) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e6) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᦳ"), e6));
        }
    }

    private synchronized void u(long j5) {
        if (f()) {
            int i5 = this.f18039c;
            if (i5 > 0) {
                this.f18039c = i5 - 1;
                this.f18043g.schedule(new a(), j5, TimeUnit.MILLISECONDS);
            } else if (!this.f18041e) {
                w(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᦴ"), FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
            }
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
                return ProtectedSandApp.s("ᦵ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f18037a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    private synchronized void x() {
        this.f18039c = 8;
    }

    private void z(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦶ"), str);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦷ"), this.f18045i.s().i());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦸ"), this.f18048l.getPackageName());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦹ"), m());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦺ"), ProtectedSandApp.s("ᦻ"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᦼ"), ProtectedSandApp.s("ᦽ"));
        String s5 = ProtectedSandApp.s("ᦾ");
        String s6 = ProtectedSandApp.s("ᦿ");
        httpURLConnection.setRequestProperty(s5, s6);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᧀ"), s6);
    }

    void B(boolean z5) {
        this.f18041e = z5;
    }

    @SuppressLint({"VisibleForTests"})
    public void C(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("ᧁ"));
        z(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes(ProtectedSandApp.s("ᧂ"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized c D(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f18044h, this.f18047k, this.f18037a, new b(), this.f18043g);
    }

    public void E() {
        u(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (f()) {
            if (new Date(this.f18051o.currentTimeMillis()).before(this.f18052p.j().a())) {
                y();
            } else {
                final Task<HttpURLConnection> h5 = h();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{h5}).continueWith(this.f18043g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.s
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Task s5;
                        s5 = u.this.s(h5, task);
                        return s5;
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
        final Task<com.google.firebase.installations.o> a6 = this.f18046j.a(false);
        final Task<String> id = this.f18046j.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{a6, id}).continueWithTask(this.f18043g, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.t
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task t5;
                t5 = u.this.t(a6, id, task);
                return t5;
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public Date l() {
        return this.f18052p.j().a();
    }

    @SuppressLint({"VisibleForTests"})
    public int n() {
        return this.f18052p.j().b();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void y() {
        u(Math.max(0L, this.f18052p.j().a().getTime() - new Date(this.f18051o.currentTimeMillis()).getTime()));
    }
}
