package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: n, reason: collision with root package name */
    public static final long f18288n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final double f18289o = 0.0d;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f18290p = false;

    /* renamed from: r, reason: collision with root package name */
    public static final int f18292r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f18293s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f18294t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f18295u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f18296v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f18297w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f18298x = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f18300a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f18301b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final com.google.firebase.abt.c f18302c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f18303d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f18304e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f18305f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f18306g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.n f18307h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f18308i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.q f18309j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.installations.k f18310k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.r f18311l;

    /* renamed from: y, reason: collision with root package name */
    public static final String f18299y = ProtectedSandApp.s("ᨀ");

    /* renamed from: m, reason: collision with root package name */
    public static final String f18287m = "";

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f18291q = new byte[0];

    p(Context context, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, @q0 com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.g gVar4, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.q qVar, com.google.firebase.remoteconfig.internal.r rVar) {
        this.f18300a = context;
        this.f18301b = gVar;
        this.f18310k = kVar;
        this.f18302c = cVar;
        this.f18303d = executor;
        this.f18304e = gVar2;
        this.f18305f = gVar3;
        this.f18306g = gVar4;
        this.f18307h = nVar;
        this.f18308i = pVar;
        this.f18309j = qVar;
        this.f18311l = rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task A(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.h hVar = (com.google.firebase.remoteconfig.internal.h) task.getResult();
        return (!task2.isSuccessful() || z(hVar, (com.google.firebase.remoteconfig.internal.h) task2.getResult())) ? this.f18305f.m(hVar).continueWith(this.f18303d, new Continuation() { // from class: com.google.firebase.remoteconfig.n
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean I;
                I = p.this.I(task4);
                return Boolean.valueOf(I);
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q B(Task task, Task task2) throws Exception {
        return (q) task.getResult();
    }

    private /* synthetic */ Task E(Void r12) throws Exception {
        return j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void F() throws Exception {
        this.f18305f.d();
        this.f18304e.d();
        this.f18306g.d();
        this.f18309j.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void G(r rVar) throws Exception {
        this.f18309j.n(rVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I(Task<com.google.firebase.remoteconfig.internal.h> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f18304e.d();
        if (task.getResult() == null) {
            return true;
        }
        S(task.getResult().d());
        return true;
    }

    private Task<Void> P(Map<String, String> map) {
        try {
            return this.f18306g.m(com.google.firebase.remoteconfig.internal.h.j().b(map).a()).onSuccessTask(com.google.firebase.concurrent.z.a(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.f
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    forResult = Tasks.forResult(null);
                    return forResult;
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    @m1
    static List<Map<String, String>> R(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @o0
    public static p t() {
        return u(com.google.firebase.g.p());
    }

    @o0
    public static p u(@o0 com.google.firebase.g gVar) {
        return ((x) gVar.l(x.class)).f();
    }

    private static boolean z(com.google.firebase.remoteconfig.internal.h hVar, @q0 com.google.firebase.remoteconfig.internal.h hVar2) {
        return hVar2 == null || !hVar.g().equals(hVar2.g());
    }

    @o0
    public Task<Void> J() {
        return Tasks.call(this.f18303d, new Callable() { // from class: com.google.firebase.remoteconfig.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void F;
                F = p.this.F();
                return F;
            }
        });
    }

    public void K(Runnable runnable) {
        this.f18303d.execute(runnable);
    }

    @o0
    public Task<Void> L(@o0 final r rVar) {
        return Tasks.call(this.f18303d, new Callable() { // from class: com.google.firebase.remoteconfig.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void G;
                G = p.this.G(rVar);
                return G;
            }
        });
    }

    void M(boolean z5) {
        this.f18311l.e(z5);
    }

    @o0
    public Task<Void> N(@o1 int i5) {
        return P(com.google.firebase.remoteconfig.internal.w.a(this.f18300a, i5));
    }

    @o0
    public Task<Void> O(@o0 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return P(hashMap);
    }

    void Q() {
        this.f18305f.f();
        this.f18306g.f();
        this.f18304e.f();
    }

    @m1
    void S(@o0 JSONArray jSONArray) {
        if (this.f18302c == null) {
            return;
        }
        try {
            this.f18302c.m(R(jSONArray));
        } catch (AbtException | JSONException unused) {
        }
    }

    @o0
    public Task<Boolean> j() {
        final Task<com.google.firebase.remoteconfig.internal.h> f6 = this.f18304e.f();
        final Task<com.google.firebase.remoteconfig.internal.h> f7 = this.f18305f.f();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{f6, f7}).continueWithTask(this.f18303d, new Continuation() { // from class: com.google.firebase.remoteconfig.o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task A;
                A = p.this.A(f6, f7, task);
                return A;
            }
        });
    }

    @o0
    public e k(@o0 d dVar) {
        return this.f18311l.b(dVar);
    }

    @o0
    public Task<q> l() {
        Task<com.google.firebase.remoteconfig.internal.h> f6 = this.f18305f.f();
        Task<com.google.firebase.remoteconfig.internal.h> f7 = this.f18306g.f();
        Task<com.google.firebase.remoteconfig.internal.h> f8 = this.f18304e.f();
        final Task call = Tasks.call(this.f18303d, new Callable() { // from class: com.google.firebase.remoteconfig.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.this.s();
            }
        });
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{f6, f7, f8, call, this.f18310k.getId(), this.f18310k.a(false)}).continueWith(this.f18303d, new Continuation() { // from class: com.google.firebase.remoteconfig.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                q B;
                B = p.B(Task.this, task);
                return B;
            }
        });
    }

    @o0
    public Task<Void> m() {
        return this.f18307h.i().onSuccessTask(com.google.firebase.concurrent.z.a(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.i
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                forResult = Tasks.forResult(null);
                return forResult;
            }
        });
    }

    @o0
    public Task<Void> n(long j5) {
        return this.f18307h.j(j5).onSuccessTask(com.google.firebase.concurrent.z.a(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                forResult = Tasks.forResult(null);
                return forResult;
            }
        });
    }

    @o0
    public Task<Boolean> o() {
        return m().onSuccessTask(this.f18303d, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.m
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j5;
                j5 = p.this.j();
                return j5;
            }
        });
    }

    @o0
    public Map<String, s> p() {
        return this.f18308i.d();
    }

    public boolean q(@o0 String str) {
        return this.f18308i.e(str);
    }

    public double r(@o0 String str) {
        return this.f18308i.h(str);
    }

    @o0
    public q s() {
        return this.f18309j.d();
    }

    @o0
    public Set<String> v(@o0 String str) {
        return this.f18308i.k(str);
    }

    public long w(@o0 String str) {
        return this.f18308i.m(str);
    }

    @o0
    public String x(@o0 String str) {
        return this.f18308i.o(str);
    }

    @o0
    public s y(@o0 String str) {
        return this.f18308i.q(str);
    }
}
