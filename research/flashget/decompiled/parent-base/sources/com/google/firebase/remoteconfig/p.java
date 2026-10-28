package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.o1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class p {

    /* renamed from: o, reason: collision with root package name */
    public static final long f60678o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final double f60679p = 0.0d;

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f60680q = false;

    /* renamed from: s, reason: collision with root package name */
    public static final int f60682s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f60683t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f60684u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f60685v = -1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f60686w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f60687x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f60688y = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f60690a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f60691b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final com.google.firebase.abt.c f60692c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f60693d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f60694e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f60695f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.g f60696g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.n f60697h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f60698i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.q f60699j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.installations.k f60700k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.r f60701l;

    /* renamed from: m, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.rollouts.e f60702m;

    /* renamed from: z, reason: collision with root package name */
    public static final String f60689z = ProtectedSandApp.s("Ѓ\u0001");

    /* renamed from: n, reason: collision with root package name */
    public static final String f60677n = "";

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f60681r = new byte[0];

    p(Context context, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, @q0 com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.g gVar4, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.q qVar, com.google.firebase.remoteconfig.internal.r rVar, com.google.firebase.remoteconfig.internal.rollouts.e eVar) {
        this.f60690a = context;
        this.f60691b = gVar;
        this.f60700k = kVar;
        this.f60692c = cVar;
        this.f60693d = executor;
        this.f60694e = gVar2;
        this.f60695f = gVar3;
        this.f60696g = gVar4;
        this.f60697h = nVar;
        this.f60698i = pVar;
        this.f60699j = qVar;
        this.f60701l = rVar;
        this.f60702m = eVar;
    }

    private static boolean A(com.google.firebase.remoteconfig.internal.h hVar, @q0 com.google.firebase.remoteconfig.internal.h hVar2) {
        return hVar2 == null || !hVar.h().equals(hVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task B(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.h hVar = (com.google.firebase.remoteconfig.internal.h) task.getResult();
        return (!task2.isSuccessful() || A(hVar, (com.google.firebase.remoteconfig.internal.h) task2.getResult())) ? this.f60695f.m(hVar).continueWith(this.f60693d, new Continuation() { // from class: com.google.firebase.remoteconfig.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                boolean J;
                J = p.this.J(task4);
                return Boolean.valueOf(J);
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    private static /* synthetic */ q C(Task task, Task task2) throws Exception {
        return (q) task.getResult();
    }

    private /* synthetic */ Task F(Void r12) throws Exception {
        return j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void G() throws Exception {
        this.f60695f.d();
        this.f60694e.d();
        this.f60696g.d();
        this.f60699j.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void H(r rVar) throws Exception {
        this.f60699j.n(rVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J(Task<com.google.firebase.remoteconfig.internal.h> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f60694e.d();
        com.google.firebase.remoteconfig.internal.h result = task.getResult();
        if (result == null) {
            return true;
        }
        T(result.e());
        this.f60702m.g(result);
        return true;
    }

    private Task<Void> Q(Map<String, String> map) {
        try {
            return this.f60696g.m(com.google.firebase.remoteconfig.internal.h.l().b(map).a()).onSuccessTask(com.google.firebase.concurrent.z.a(), new g());
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    @m1
    static List<Map<String, String>> S(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ q d(Task task, Task task2) {
        return (q) task.getResult();
    }

    @o0
    public static p t() {
        return u(com.google.firebase.g.p());
    }

    @o0
    public static p u(@o0 com.google.firebase.g gVar) {
        return ((x) gVar.l(x.class)).g();
    }

    @o0
    public Task<Void> K() {
        return Tasks.call(this.f60693d, new Callable() { // from class: com.google.firebase.remoteconfig.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void G;
                G = p.this.G();
                return G;
            }
        });
    }

    public void L(Runnable runnable) {
        this.f60693d.execute(runnable);
    }

    @o0
    public Task<Void> M(@o0 final r rVar) {
        return Tasks.call(this.f60693d, new Callable() { // from class: com.google.firebase.remoteconfig.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void H;
                H = p.this.H(rVar);
                return H;
            }
        });
    }

    void N(boolean z4) {
        this.f60701l.e(z4);
    }

    @o0
    public Task<Void> O(@o1 int i4) {
        return Q(com.google.firebase.remoteconfig.internal.w.a(this.f60690a, i4));
    }

    @o0
    public Task<Void> P(@o0 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return Q(hashMap);
    }

    void R() {
        this.f60695f.f();
        this.f60696g.f();
        this.f60694e.f();
    }

    @m1
    void T(@o0 JSONArray jSONArray) {
        if (this.f60692c == null) {
            return;
        }
        try {
            this.f60692c.m(S(jSONArray));
        } catch (AbtException | JSONException unused) {
        }
    }

    @o0
    public Task<Boolean> j() {
        final Task<com.google.firebase.remoteconfig.internal.h> f4 = this.f60694e.f();
        final Task<com.google.firebase.remoteconfig.internal.h> f5 = this.f60695f.f();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{f4, f5}).continueWithTask(this.f60693d, new Continuation() { // from class: com.google.firebase.remoteconfig.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task B;
                B = p.this.B(f4, f5, task);
                return B;
            }
        });
    }

    @o0
    public e k(@o0 d dVar) {
        return this.f60701l.b(dVar);
    }

    @o0
    public Task<q> l() {
        Task<com.google.firebase.remoteconfig.internal.h> f4 = this.f60695f.f();
        Task<com.google.firebase.remoteconfig.internal.h> f5 = this.f60696g.f();
        Task<com.google.firebase.remoteconfig.internal.h> f6 = this.f60694e.f();
        final Task call = Tasks.call(this.f60693d, new Callable() { // from class: com.google.firebase.remoteconfig.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.this.s();
            }
        });
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{f4, f5, f6, call, this.f60700k.a(), this.f60700k.c(false)}).continueWith(this.f60693d, new Continuation() { // from class: com.google.firebase.remoteconfig.m
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return p.d(Task.this, task);
            }
        });
    }

    @o0
    public Task<Void> m() {
        return this.f60697h.i().onSuccessTask(com.google.firebase.concurrent.z.a(), new o());
    }

    @o0
    public Task<Void> n(long j4) {
        return this.f60697h.j(j4).onSuccessTask(com.google.firebase.concurrent.z.a(), new i());
    }

    @o0
    public Task<Boolean> o() {
        return m().onSuccessTask(this.f60693d, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.n
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j4;
                j4 = p.this.j();
                return j4;
            }
        });
    }

    @o0
    public Map<String, s> p() {
        return this.f60698i.d();
    }

    public boolean q(@o0 String str) {
        return this.f60698i.e(str);
    }

    public double r(@o0 String str) {
        return this.f60698i.h(str);
    }

    @o0
    public q s() {
        return this.f60699j.d();
    }

    @o0
    public Set<String> v(@o0 String str) {
        return this.f60698i.k(str);
    }

    public long w(@o0 String str) {
        return this.f60698i.m(str);
    }

    com.google.firebase.remoteconfig.internal.rollouts.e x() {
        return this.f60702m;
    }

    @o0
    public String y(@o0 String str) {
        return this.f60698i.o(str);
    }

    @o0
    public s z(@o0 String str) {
        return this.f60698i.q(str);
    }
}
