package com.google.firebase.remoteconfig.internal;

import androidx.annotation.b0;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static final int f60428h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final String f60429i = ProtectedSandApp.s("ͥ\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f60430j = ProtectedSandApp.s("ͦ\u0001");

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Set<com.google.firebase.remoteconfig.d> f60431a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f60432b;

    /* renamed from: c, reason: collision with root package name */
    private final n f60433c;

    /* renamed from: d, reason: collision with root package name */
    private final g f60434d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.d f60435e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f60436f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f60437g = new Random();

    /* compiled from: ConfigAutoFetch.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f60438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f60439c;

        a(int i4, long j4) {
            this.f60438b = i4;
            this.f60439c = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f60438b, this.f60439c);
        }
    }

    public c(HttpURLConnection httpURLConnection, n nVar, g gVar, Set<com.google.firebase.remoteconfig.d> set, com.google.firebase.remoteconfig.d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f60432b = httpURLConnection;
        this.f60433c = nVar;
        this.f60434d = gVar;
        this.f60431a = set;
        this.f60435e = dVar;
        this.f60436f = scheduledExecutorService;
    }

    private void b(int i4, long j4) {
        if (i4 == 0) {
            k(new FirebaseRemoteConfigServerException(ProtectedSandApp.s("ͤ\u0001"), FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f60436f.schedule(new a(i4, j4), this.f60437g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(com.google.firebase.remoteconfig.c cVar) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f60431a.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
    }

    private static Boolean e(n.a aVar, long j4) {
        if (aVar.e() != null) {
            return Boolean.valueOf(aVar.e().k() >= j4);
        }
        return Boolean.valueOf(aVar.g() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r5.has(r1) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.getBoolean(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r8.f60435e.b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(com.flashget.parentalcontrol.ProtectedSandApp.s("ͩ\u0001"), com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r5.has(r0) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r6 = r8.f60433c.s();
        r4 = r5.getLong(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "ͥ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "ͦ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "ͧ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.<init>(r9, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L1e:
            r4 = r3
        L1f:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L9b
            java.lang.String r4 = androidx.compose.runtime.changelist.j.a(r4, r5)
            java.lang.String r6 = "ͨ\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L1f
            java.lang.String r4 = r8.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L40
            goto L1f
        L40:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r5.<init>(r4)     // Catch: org.json.JSONException -> L64
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L64
            if (r4 == 0) goto L66
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L64
            if (r4 == 0) goto L66
            com.google.firebase.remoteconfig.d r4 = r8.f60435e     // Catch: org.json.JSONException -> L64
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L64
            java.lang.String r6 = "ͩ\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: org.json.JSONException -> L64
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L64
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L64
            r4.b(r5)     // Catch: org.json.JSONException -> L64
            goto L9b
        L64:
            r4 = move-exception
            goto L86
        L66:
            boolean r4 = r8.g()     // Catch: org.json.JSONException -> L64
            if (r4 == 0) goto L6d
            goto L9b
        L6d:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L64
            if (r4 == 0) goto L1e
            com.google.firebase.remoteconfig.internal.n r4 = r8.f60433c     // Catch: org.json.JSONException -> L64
            long r6 = r4.s()     // Catch: org.json.JSONException -> L64
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L64
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1e
            r6 = 3
            r8.b(r6, r4)     // Catch: org.json.JSONException -> L64
            goto L1e
        L86:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r4 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r6 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r7 = "ͪ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r5.<init>(r7, r4, r6)
            r8.k(r5)
            goto L1e
        L9b:
            r2.close()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.c.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f60431a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task h(Task task, Task task2, long j4, int i4, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ͫ\u0001"), task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ͬ\u0001"), task2.getException()));
        }
        n.a aVar = (n.a) task.getResult();
        h hVar = (h) task2.getResult();
        if (!e(aVar, j4).booleanValue()) {
            b(i4, j4);
            return Tasks.forResult(null);
        }
        if (aVar.e() == null) {
            return Tasks.forResult(null);
        }
        if (hVar == null) {
            hVar = h.l().a();
        }
        Set<String> f4 = hVar.f(aVar.e());
        if (f4.isEmpty()) {
            return Tasks.forResult(null);
        }
        c(com.google.firebase.remoteconfig.c.a(f4));
        return Tasks.forResult(null);
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<com.google.firebase.remoteconfig.d> it = this.f60431a.iterator();
        while (it.hasNext()) {
            it.next().b(firebaseRemoteConfigException);
        }
    }

    @m1
    public synchronized Task<Void> d(int i4, final long j4) {
        final int i5;
        final Task<n.a> n4;
        final Task<h> f4;
        i5 = i4 - 1;
        n4 = this.f60433c.n(n.b.REALTIME, 3 - i5);
        f4 = this.f60434d.f();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{n4, f4}).continueWithTask(this.f60436f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h4;
                h4 = c.this.h(n4, f4, j4, i5, task);
                return h4;
            }
        });
    }

    @m1
    public void i() {
        HttpURLConnection httpURLConnection = this.f60432b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f60432b.disconnect();
            throw th;
        }
        this.f60432b.disconnect();
    }
}
