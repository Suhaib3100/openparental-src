package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.e0;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.impl.utils.p;
import androidx.work.impl.workers.CombineContinuationsWorker;
import androidx.work.s;
import androidx.work.u;
import androidx.work.w;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class g extends e0 {

    /* renamed from: j, reason: collision with root package name */
    private static final String f36210j = s.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final j f36211a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36212b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.k f36213c;

    /* renamed from: d, reason: collision with root package name */
    private final List<? extends i0> f36214d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f36215e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f36216f;

    /* renamed from: g, reason: collision with root package name */
    private final List<g> f36217g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36218h;

    /* renamed from: i, reason: collision with root package name */
    private w f36219i;

    public g(@o0 j workManagerImpl, @o0 List<? extends i0> work) {
        this(workManagerImpl, null, androidx.work.k.KEEP, work, null);
    }

    @c1({c1.a.LIBRARY_GROUP})
    private static boolean p(@o0 g continuation, @o0 Set<String> visited) {
        visited.addAll(continuation.j());
        Set<String> s4 = s(continuation);
        Iterator<String> it = visited.iterator();
        while (it.hasNext()) {
            if (s4.contains(it.next())) {
                return true;
            }
        }
        List<g> l4 = continuation.l();
        if (l4 != null && !l4.isEmpty()) {
            Iterator<g> it2 = l4.iterator();
            while (it2.hasNext()) {
                if (p(it2.next(), visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.j());
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Set<String> s(g continuation) {
        HashSet hashSet = new HashSet();
        List<g> l4 = continuation.l();
        if (l4 != null && !l4.isEmpty()) {
            Iterator<g> it = l4.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().j());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.e0
    @o0
    protected e0 b(@o0 List<e0> continuations) {
        u b5 = new u.a(CombineContinuationsWorker.class).t(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList = new ArrayList(continuations.size());
        Iterator<e0> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((g) it.next());
        }
        return new g(this.f36211a, null, androidx.work.k.KEEP, Collections.singletonList(b5), arrayList);
    }

    @Override // androidx.work.e0
    @o0
    public w c() {
        if (this.f36218h) {
            s.c().h(f36210j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f36215e)), new Throwable[0]);
        } else {
            androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this);
            this.f36211a.O().b(bVar);
            this.f36219i = bVar.d();
        }
        return this.f36219i;
    }

    @Override // androidx.work.e0
    @o0
    public ListenableFuture<List<f0>> d() {
        p<List<f0>> a5 = p.a(this.f36211a, this.f36216f);
        this.f36211a.O().b(a5);
        return a5.f();
    }

    @Override // androidx.work.e0
    @o0
    public LiveData<List<f0>> e() {
        return this.f36211a.N(this.f36216f);
    }

    @Override // androidx.work.e0
    @o0
    public e0 g(@o0 List<u> work) {
        return work.isEmpty() ? this : new g(this.f36211a, this.f36212b, androidx.work.k.KEEP, work, Collections.singletonList(this));
    }

    public List<String> h() {
        return this.f36216f;
    }

    public androidx.work.k i() {
        return this.f36213c;
    }

    @o0
    public List<String> j() {
        return this.f36215e;
    }

    @q0
    public String k() {
        return this.f36212b;
    }

    public List<g> l() {
        return this.f36217g;
    }

    @o0
    public List<? extends i0> m() {
        return this.f36214d;
    }

    @o0
    public j n() {
        return this.f36211a;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean o() {
        return p(this, new HashSet());
    }

    public boolean q() {
        return this.f36218h;
    }

    public void r() {
        this.f36218h = true;
    }

    public g(@o0 j workManagerImpl, @q0 String name, @o0 androidx.work.k existingWorkPolicy, @o0 List<? extends i0> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    public g(@o0 j workManagerImpl, @q0 String name, @o0 androidx.work.k existingWorkPolicy, @o0 List<? extends i0> work, @q0 List<g> parents) {
        this.f36211a = workManagerImpl;
        this.f36212b = name;
        this.f36213c = existingWorkPolicy;
        this.f36214d = work;
        this.f36217g = parents;
        this.f36215e = new ArrayList(work.size());
        this.f36216f = new ArrayList();
        if (parents != null) {
            Iterator<g> it = parents.iterator();
            while (it.hasNext()) {
                this.f36216f.addAll(it.next().f36216f);
            }
        }
        for (int i4 = 0; i4 < work.size(); i4++) {
            String b5 = work.get(i4).b();
            this.f36215e.add(b5);
            this.f36216f.add(b5);
        }
    }
}
