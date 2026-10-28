package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.os.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.b0;
import com.google.firebase.heartbeatinfo.k;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes6.dex */
public class g implements j, k {

    /* renamed from: a, reason: collision with root package name */
    private final y9.b<q> f59681a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f59682b;

    /* renamed from: c, reason: collision with root package name */
    private final y9.b<com.google.firebase.platforminfo.i> f59683c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<h> f59684d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f59685e;

    private g(final Context context, final String str, Set<h> set, y9.b<com.google.firebase.platforminfo.i> bVar, Executor executor) {
        this((y9.b<q>) new y9.b() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // y9.b
            public final Object get() {
                return new q(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static /* synthetic */ q d(Context context, String str) {
        return new q(context, str);
    }

    @o0
    public static com.google.firebase.components.c<g> g() {
        final b0 b0Var = new b0(l9.a.class, Executor.class);
        return com.google.firebase.components.c.i(g.class, j.class, k.class).b(com.google.firebase.components.r.m(Context.class)).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.q(h.class)).b(com.google.firebase.components.r.o(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.r.l(b0Var)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                g h4;
                h4 = g.h(b0.this, dVar);
                return h4;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g h(b0 b0Var, com.google.firebase.components.d dVar) {
        return new g((Context) dVar.a(Context.class), ((com.google.firebase.g) dVar.a(com.google.firebase.g.class)).t(), (Set<h>) dVar.h(h.class), (y9.b<com.google.firebase.platforminfo.i>) dVar.i(com.google.firebase.platforminfo.i.class), (Executor) dVar.g(b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                q qVar = this.f59681a.get();
                List<r> c5 = qVar.c();
                qVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < c5.size(); i4++) {
                    r rVar = c5.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ProtectedSandApp.s("w\u0001"), rVar.c());
                    jSONObject.put(ProtectedSandApp.s("x\u0001"), new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ProtectedSandApp.s("y\u0001"), jSONArray);
                jSONObject2.put(ProtectedSandApp.s("z\u0001"), ProtectedSandApp.s("{\u0001"));
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(ProtectedSandApp.s("|\u0001")));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(ProtectedSandApp.s("|\u0001"));
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    private static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.f59681a.get().m(System.currentTimeMillis(), this.f59683c.get().a());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.j
    public Task<String> a() {
        return !s0.a(this.f59682b) ? Tasks.forResult("") : Tasks.call(this.f59685e, new Callable() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i4;
                i4 = g.this.i();
                return i4;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.k
    @o0
    public synchronized k.a b(@o0 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = this.f59681a.get();
        if (!qVar.k(currentTimeMillis)) {
            return k.a.NONE;
        }
        qVar.i();
        return k.a.GLOBAL;
    }

    public Task<Void> l() {
        return this.f59684d.size() <= 0 ? Tasks.forResult(null) : !s0.a(this.f59682b) ? Tasks.forResult(null) : Tasks.call(this.f59685e, new Callable() { // from class: com.google.firebase.heartbeatinfo.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k4;
                k4 = g.this.k();
                return k4;
            }
        });
    }

    @m1
    g(y9.b<q> bVar, Set<h> set, Executor executor, y9.b<com.google.firebase.platforminfo.i> bVar2, Context context) {
        this.f59681a = bVar;
        this.f59684d = set;
        this.f59685e = executor;
        this.f59683c = bVar2;
        this.f59682b = context;
    }
}
