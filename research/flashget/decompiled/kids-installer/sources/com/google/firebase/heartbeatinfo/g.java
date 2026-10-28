package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.os.c0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes3.dex */
public class g implements j, k {

    /* renamed from: a, reason: collision with root package name */
    private final o2.b<r> f16660a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16661b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.b<com.google.firebase.platforminfo.i> f16662c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<h> f16663d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f16664e;

    private g(final Context context, final String str, Set<h> set, o2.b<com.google.firebase.platforminfo.i> bVar, Executor executor) {
        this((o2.b<r>) new o2.b() { // from class: com.google.firebase.heartbeatinfo.f
            @Override // o2.b
            public final Object get() {
                return new r(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static /* synthetic */ r e(Context context, String str) {
        return new r(context, str);
    }

    @o0
    public static com.google.firebase.components.c<g> g() {
        final b0 b0Var = new b0(b2.a.class, Executor.class);
        return com.google.firebase.components.c.i(g.class, j.class, k.class).b(com.google.firebase.components.r.m(Context.class)).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.q(h.class)).b(com.google.firebase.components.r.o(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.r.l(b0Var)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                g h5;
                h5 = g.h(b0.this, dVar);
                return h5;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g h(b0 b0Var, com.google.firebase.components.d dVar) {
        return new g((Context) dVar.a(Context.class), ((com.google.firebase.g) dVar.a(com.google.firebase.g.class)).t(), (Set<h>) dVar.i(h.class), (o2.b<com.google.firebase.platforminfo.i>) dVar.c(com.google.firebase.platforminfo.i.class), (Executor) dVar.h(b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            r rVar = this.f16660a.get();
            List<s> c6 = rVar.c();
            rVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < c6.size(); i5++) {
                s sVar = c6.get(i5);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProtectedSandApp.s("⪊"), sVar.c());
                jSONObject.put(ProtectedSandApp.s("⪋"), new JSONArray((Collection) sVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ProtectedSandApp.s("⪌"), jSONArray);
            jSONObject2.put(ProtectedSandApp.s("⪍"), ProtectedSandApp.s("⪎"));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(ProtectedSandApp.s("⪏")));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString(ProtectedSandApp.s("⪐"));
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    private static /* synthetic */ r j(Context context, String str) {
        return new r(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.f16660a.get().m(System.currentTimeMillis(), this.f16662c.get().a());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.j
    public Task<String> a() {
        return c0.a(this.f16661b) ^ true ? Tasks.forResult("") : Tasks.call(this.f16664e, new Callable() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i5;
                i5 = g.this.i();
                return i5;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.k
    @o0
    public synchronized k.a b(@o0 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = this.f16660a.get();
        if (!rVar.k(currentTimeMillis)) {
            return k.a.NONE;
        }
        rVar.i();
        return k.a.GLOBAL;
    }

    public Task<Void> l() {
        return this.f16663d.size() <= 0 ? Tasks.forResult(null) : c0.a(this.f16661b) ^ true ? Tasks.forResult(null) : Tasks.call(this.f16664e, new Callable() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k5;
                k5 = g.this.k();
                return k5;
            }
        });
    }

    @m1
    g(o2.b<r> bVar, Set<h> set, Executor executor, o2.b<com.google.firebase.platforminfo.i> bVar2, Context context) {
        this.f16660a = bVar;
        this.f16663d = set;
        this.f16664e = executor;
        this.f16662c = bVar2;
        this.f16661b = context;
    }
}
