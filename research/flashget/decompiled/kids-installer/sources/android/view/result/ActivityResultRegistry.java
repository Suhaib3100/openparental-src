package android.view.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.a0;
import android.view.t;
import android.view.w;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: i, reason: collision with root package name */
    private static final String f102i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: j, reason: collision with root package name */
    private static final String f103j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f104k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: l, reason: collision with root package name */
    private static final String f105l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: m, reason: collision with root package name */
    private static final String f106m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: n, reason: collision with root package name */
    private static final String f107n = "ActivityResultRegistry";

    /* renamed from: o, reason: collision with root package name */
    private static final int f108o = 65536;

    /* renamed from: a, reason: collision with root package name */
    private Random f109a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f110b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, Integer> f111c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, d> f112d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<String> f113e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    final transient Map<String, c<?>> f114f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map<String, Object> f115g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f116h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes2.dex */
    class a<I> extends android.view.result.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f122b;

        a(String str, b.a aVar) {
            this.f121a = str;
            this.f122b = aVar;
        }

        @Override // android.view.result.c
        @o0
        public b.a<I, ?> a() {
            return this.f122b;
        }

        @Override // android.view.result.c
        public void c(I i5, @q0 i iVar) {
            Integer num = ActivityResultRegistry.this.f111c.get(this.f121a);
            if (num != null) {
                ActivityResultRegistry.this.f113e.add(this.f121a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f122b, i5, iVar);
                    return;
                } catch (Exception e6) {
                    ActivityResultRegistry.this.f113e.remove(this.f121a);
                    throw e6;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f122b + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // android.view.result.c
        public void d() {
            ActivityResultRegistry.this.l(this.f121a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes2.dex */
    class b<I> extends android.view.result.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f125b;

        b(String str, b.a aVar) {
            this.f124a = str;
            this.f125b = aVar;
        }

        @Override // android.view.result.c
        @o0
        public b.a<I, ?> a() {
            return this.f125b;
        }

        @Override // android.view.result.c
        public void c(I i5, @q0 i iVar) {
            Integer num = ActivityResultRegistry.this.f111c.get(this.f124a);
            if (num != null) {
                ActivityResultRegistry.this.f113e.add(this.f124a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f125b, i5, iVar);
                    return;
                } catch (Exception e6) {
                    ActivityResultRegistry.this.f113e.remove(this.f124a);
                    throw e6;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f125b + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // android.view.result.c
        public void d() {
            ActivityResultRegistry.this.l(this.f124a);
        }
    }

    private static class c<O> {

        /* renamed from: a, reason: collision with root package name */
        final android.view.result.a<O> f127a;

        /* renamed from: b, reason: collision with root package name */
        final b.a<?, O> f128b;

        c(android.view.result.a<O> aVar, b.a<?, O> aVar2) {
            this.f127a = aVar;
            this.f128b = aVar2;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final t f129a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<w> f130b = new ArrayList<>();

        d(@o0 t tVar) {
            this.f129a = tVar;
        }

        void a(@o0 w wVar) {
            this.f129a.a(wVar);
            this.f130b.add(wVar);
        }

        void b() {
            Iterator<w> it = this.f130b.iterator();
            while (it.hasNext()) {
                this.f129a.c(it.next());
            }
            this.f130b.clear();
        }
    }

    private void a(int i5, String str) {
        this.f110b.put(Integer.valueOf(i5), str);
        this.f111c.put(str, Integer.valueOf(i5));
    }

    private <O> void d(String str, int i5, @q0 Intent intent, @q0 c<O> cVar) {
        if (cVar == null || cVar.f127a == null || !this.f113e.contains(str)) {
            this.f115g.remove(str);
            this.f116h.putParcelable(str, new ActivityResult(i5, intent));
        } else {
            cVar.f127a.a(cVar.f128b.c(i5, intent));
            this.f113e.remove(str);
        }
    }

    private int e() {
        int nextInt = this.f109a.nextInt(2147418112);
        while (true) {
            int i5 = nextInt + 65536;
            if (!this.f110b.containsKey(Integer.valueOf(i5))) {
                return i5;
            }
            nextInt = this.f109a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f111c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @l0
    public final boolean b(int i5, int i6, @q0 Intent intent) {
        String str = this.f110b.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        d(str, i6, intent, this.f114f.get(str));
        return true;
    }

    @l0
    public final <O> boolean c(int i5, @SuppressLint({"UnknownNullness"}) O o5) {
        android.view.result.a<?> aVar;
        String str = this.f110b.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f114f.get(str);
        if (cVar == null || (aVar = cVar.f127a) == null) {
            this.f116h.remove(str);
            this.f115g.put(str, o5);
            return true;
        }
        if (!this.f113e.remove(str)) {
            return true;
        }
        aVar.a(o5);
        return true;
    }

    @l0
    public abstract <I, O> void f(int i5, @o0 b.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i6, @q0 i iVar);

    public final void g(@q0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f113e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f109a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f116h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
            String str = stringArrayList.get(i5);
            if (this.f111c.containsKey(str)) {
                Integer remove = this.f111c.remove(str);
                if (!this.f116h.containsKey(str)) {
                    this.f110b.remove(remove);
                }
            }
            a(integerArrayList.get(i5).intValue(), stringArrayList.get(i5));
        }
    }

    public final void h(@o0 Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f111c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f111c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f113e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f116h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f109a);
    }

    @o0
    public final <I, O> android.view.result.c<I> i(@o0 final String str, @o0 a0 a0Var, @o0 final b.a<I, O> aVar, @o0 final android.view.result.a<O> aVar2) {
        t lifecycle = a0Var.getLifecycle();
        if (lifecycle.b().isAtLeast(t.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + a0Var + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f112d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new w() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // android.view.w
            public void h(@o0 a0 a0Var2, @o0 t.b bVar) {
                if (!t.b.ON_START.equals(bVar)) {
                    if (t.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f114f.remove(str);
                        return;
                    } else {
                        if (t.b.ON_DESTROY.equals(bVar)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f114f.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f115g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f115g.get(str);
                    ActivityResultRegistry.this.f115g.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f116h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f116h.remove(str);
                    aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                }
            }
        });
        this.f112d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public final <I, O> android.view.result.c<I> j(@o0 String str, @o0 b.a<I, O> aVar, @o0 android.view.result.a<O> aVar2) {
        k(str);
        this.f114f.put(str, new c<>(aVar2, aVar));
        if (this.f115g.containsKey(str)) {
            Object obj = this.f115g.get(str);
            this.f115g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f116h.getParcelable(str);
        if (activityResult != null) {
            this.f116h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    @l0
    final void l(@o0 String str) {
        Integer remove;
        if (!this.f113e.contains(str) && (remove = this.f111c.remove(str)) != null) {
            this.f110b.remove(remove);
        }
        this.f114f.remove(str);
        if (this.f115g.containsKey(str)) {
            Objects.toString(this.f115g.get(str));
            this.f115g.remove(str);
        }
        if (this.f116h.containsKey(str)) {
            Objects.toString(this.f116h.getParcelable(str));
            this.f116h.remove(str);
        }
        d dVar = this.f112d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f112d.remove(str);
        }
    }
}
