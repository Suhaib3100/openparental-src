package com.google.firebase.remoteconfig.internal;

import androidx.annotation.b0;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static final int f17901h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final String f17902i = ProtectedSandApp.s("᥌");

    /* renamed from: j, reason: collision with root package name */
    private static final String f17903j = ProtectedSandApp.s("᥍");

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f17904a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f17905b;

    /* renamed from: c, reason: collision with root package name */
    private final n f17906c;

    /* renamed from: d, reason: collision with root package name */
    private final g f17907d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.d f17908e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f17909f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f17910g = new Random();

    /* compiled from: ConfigAutoFetch.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f17911o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f17912p;

        a(int i5, long j5) {
            this.f17911o = i5;
            this.f17912p = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f17911o, this.f17912p);
        }
    }

    public c(HttpURLConnection httpURLConnection, n nVar, g gVar, Set<com.google.firebase.remoteconfig.d> set, com.google.firebase.remoteconfig.d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f17905b = httpURLConnection;
        this.f17906c = nVar;
        this.f17907d = gVar;
        this.f17904a = set;
        this.f17908e = dVar;
        this.f17909f = scheduledExecutorService;
    }

    private void b(int i5, long j5) {
        if (i5 == 0) {
            k(new FirebaseRemoteConfigServerException(ProtectedSandApp.s("\u1943"), FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f17909f.schedule(new a(i5, j5), this.f17910g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(com.google.firebase.remoteconfig.c cVar) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f17904a.iterator();
        while (it.hasNext()) {
            it.next().b(cVar);
        }
    }

    private static Boolean e(n.a aVar, long j5) {
        if (aVar.e() != null) {
            return Boolean.valueOf(aVar.e().i() >= j5);
        }
        return Boolean.valueOf(aVar.g() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r5.has(r1) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.getBoolean(r1) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r8.f17908e.a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(com.flashget.kidsdownloader.ProtectedSandApp.s("᥈"), com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (g() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r5.has(r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r6 = r8.f17906c.s();
        r4 = r5.getLong(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r4 <= r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "᥄"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r1 = "᥅"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "᥆"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3.<init>(r9, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L1e:
            r4 = r3
        L1f:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L9a
            java.lang.String r4 = androidx.concurrent.futures.b.a(r4, r5)
            java.lang.String r6 = "᥇"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L1f
            java.lang.String r4 = r8.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L40
            goto L1f
        L40:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r5.<init>(r4)     // Catch: org.json.JSONException -> L84
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L64
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L64
            com.google.firebase.remoteconfig.d r4 = r8.f17908e     // Catch: org.json.JSONException -> L84
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L84
            java.lang.String r6 = "᥈"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)     // Catch: org.json.JSONException -> L84
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L84
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L84
            r4.a(r5)     // Catch: org.json.JSONException -> L84
            goto L9a
        L64:
            boolean r4 = r8.g()     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L6b
            goto L9a
        L6b:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L1e
            com.google.firebase.remoteconfig.internal.n r4 = r8.f17906c     // Catch: org.json.JSONException -> L84
            long r6 = r4.s()     // Catch: org.json.JSONException -> L84
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L84
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1e
            r6 = 3
            r8.b(r6, r4)     // Catch: org.json.JSONException -> L84
            goto L1e
        L84:
            r4 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r4 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r6 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r7 = "᥉"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r5.<init>(r7, r4, r6)
            r8.k(r5)
            goto L1e
        L9a:
            r2.close()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.c.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f17904a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task h(Task task, Task task2, long j5, int i5, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("᥊"), task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("᥋"), task2.getException()));
        }
        n.a aVar = (n.a) task.getResult();
        h hVar = (h) task2.getResult();
        if (!e(aVar, j5).booleanValue()) {
            b(i5, j5);
            return Tasks.forResult(null);
        }
        if (aVar.e() == null) {
            return Tasks.forResult(null);
        }
        if (hVar == null) {
            hVar = h.j().a();
        }
        Set<String> e6 = hVar.e(aVar.e());
        if (e6.isEmpty()) {
            return Tasks.forResult(null);
        }
        c(com.google.firebase.remoteconfig.c.a(e6));
        return Tasks.forResult(null);
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f17904a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    @m1
    public synchronized Task<Void> d(int i5, final long j5) {
        final int i6;
        final Task<n.a> n5;
        final Task<h> f6;
        i6 = i5 - 1;
        n5 = this.f17906c.n(n.b.REALTIME, 3 - i6);
        f6 = this.f17907d.f();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{n5, f6}).continueWithTask(this.f17909f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h5;
                h5 = c.this.h(n5, f6, j5, i6, task);
                return h5;
            }
        });
    }

    @m1
    public void i() {
        HttpURLConnection httpURLConnection = this.f17905b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f17905b.disconnect();
            throw th;
        }
        this.f17905b.disconnect();
    }
}
