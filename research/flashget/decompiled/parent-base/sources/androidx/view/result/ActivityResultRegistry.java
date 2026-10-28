package androidx.view.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.e;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.random.f;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: h, reason: collision with root package name */
    private static final String f577h = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: i, reason: collision with root package name */
    private static final String f578i = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: j, reason: collision with root package name */
    private static final String f579j = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f580k = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: l, reason: collision with root package name */
    private static final String f581l = "ActivityResultRegistry";

    /* renamed from: m, reason: collision with root package name */
    private static final int f582m = 65536;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f583a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map<String, Integer> f584b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, d> f585c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    ArrayList<String> f586d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    final transient Map<String, c<?>> f587e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    final Map<String, Object> f588f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Bundle f589g = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends h<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f595b;

        a(String str, b.a aVar) {
            this.f594a = str;
            this.f595b = aVar;
        }

        @Override // androidx.view.result.h
        @o0
        public b.a<I, ?> a() {
            return this.f595b;
        }

        @Override // androidx.view.result.h
        public void c(I i4, @q0 e eVar) {
            Integer num = ActivityResultRegistry.this.f584b.get(this.f594a);
            if (num != null) {
                ActivityResultRegistry.this.f586d.add(this.f594a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f595b, i4, eVar);
                    return;
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f586d.remove(this.f594a);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f595b + " and input " + i4 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.view.result.h
        public void d() {
            ActivityResultRegistry.this.l(this.f594a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class b<I> extends h<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f598b;

        b(String str, b.a aVar) {
            this.f597a = str;
            this.f598b = aVar;
        }

        @Override // androidx.view.result.h
        @o0
        public b.a<I, ?> a() {
            return this.f598b;
        }

        @Override // androidx.view.result.h
        public void c(I i4, @q0 e eVar) {
            Integer num = ActivityResultRegistry.this.f584b.get(this.f597a);
            if (num != null) {
                ActivityResultRegistry.this.f586d.add(this.f597a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f598b, i4, eVar);
                    return;
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f586d.remove(this.f597a);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f598b + " and input " + i4 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.view.result.h
        public void d() {
            ActivityResultRegistry.this.l(this.f597a);
        }
    }

    private static class c<O> {

        /* renamed from: a, reason: collision with root package name */
        final androidx.view.result.a<O> f600a;

        /* renamed from: b, reason: collision with root package name */
        final b.a<?, O> f601b;

        c(androidx.view.result.a<O> aVar, b.a<?, O> aVar2) {
            this.f600a = aVar;
            this.f601b = aVar2;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1450w f602a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<InterfaceC1416b0> f603b = new ArrayList<>();

        d(@o0 AbstractC1450w abstractC1450w) {
            this.f602a = abstractC1450w;
        }

        void a(@o0 InterfaceC1416b0 interfaceC1416b0) {
            this.f602a.a(interfaceC1416b0);
            this.f603b.add(interfaceC1416b0);
        }

        void b() {
            Iterator<InterfaceC1416b0> it = this.f603b.iterator();
            while (it.hasNext()) {
                this.f602a.d(it.next());
            }
            this.f603b.clear();
        }
    }

    private void a(int i4, String str) {
        this.f583a.put(Integer.valueOf(i4), str);
        this.f584b.put(str, Integer.valueOf(i4));
    }

    private <O> void d(String str, int i4, @q0 Intent intent, @q0 c<O> cVar) {
        if (cVar == null || cVar.f600a == null || !this.f586d.contains(str)) {
            this.f588f.remove(str);
            this.f589g.putParcelable(str, new ActivityResult(i4, intent));
        } else {
            cVar.f600a.onActivityResult(cVar.f601b.parseResult(i4, intent));
            this.f586d.remove(str);
        }
    }

    private int e() {
        int m4 = f.INSTANCE.m(2147418112);
        while (true) {
            int i4 = m4 + 65536;
            if (!this.f583a.containsKey(Integer.valueOf(i4))) {
                return i4;
            }
            m4 = f.INSTANCE.m(2147418112);
        }
    }

    private void k(String str) {
        if (this.f584b.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @l0
    public final boolean b(int i4, int i5, @q0 Intent intent) {
        String str = this.f583a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        d(str, i5, intent, this.f587e.get(str));
        return true;
    }

    @l0
    public final <O> boolean c(int i4, @SuppressLint({"UnknownNullness"}) O o4) {
        androidx.view.result.a<?> aVar;
        String str = this.f583a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f587e.get(str);
        if (cVar == null || (aVar = cVar.f600a) == null) {
            this.f589g.remove(str);
            this.f588f.put(str, o4);
            return true;
        }
        if (!this.f586d.remove(str)) {
            return true;
        }
        aVar.onActivityResult(o4);
        return true;
    }

    @l0
    public abstract <I, O> void f(int i4, @o0 b.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i5, @q0 e eVar);

    public final void g(@q0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f586d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f589g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
            String str = stringArrayList.get(i4);
            if (this.f584b.containsKey(str)) {
                Integer remove = this.f584b.remove(str);
                if (!this.f589g.containsKey(str)) {
                    this.f583a.remove(remove);
                }
            }
            a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
        }
    }

    public final void h(@o0 Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f584b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f584b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f586d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f589g.clone());
    }

    @o0
    public final <I, O> h<I> i(@o0 final String str, @o0 InterfaceC1423e0 interfaceC1423e0, @o0 final b.a<I, O> aVar, @o0 final androidx.view.result.a<O> aVar2) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        if (lifecycle.b().isAtLeast(AbstractC1450w.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC1423e0 + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f585c.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new InterfaceC1416b0() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.view.InterfaceC1416b0
            public void f(@o0 InterfaceC1423e0 interfaceC1423e02, @o0 AbstractC1450w.a aVar3) {
                if (!AbstractC1450w.a.ON_START.equals(aVar3)) {
                    if (AbstractC1450w.a.ON_STOP.equals(aVar3)) {
                        ActivityResultRegistry.this.f587e.remove(str);
                        return;
                    } else {
                        if (AbstractC1450w.a.ON_DESTROY.equals(aVar3)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f587e.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f588f.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f588f.get(str);
                    ActivityResultRegistry.this.f588f.remove(str);
                    aVar2.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f589g.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f589g.remove(str);
                    aVar2.onActivityResult(aVar.parseResult(activityResult.b(), activityResult.a()));
                }
            }
        });
        this.f585c.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public final <I, O> h<I> j(@o0 String str, @o0 b.a<I, O> aVar, @o0 androidx.view.result.a<O> aVar2) {
        k(str);
        this.f587e.put(str, new c<>(aVar2, aVar));
        if (this.f588f.containsKey(str)) {
            Object obj = this.f588f.get(str);
            this.f588f.remove(str);
            aVar2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f589g.getParcelable(str);
        if (activityResult != null) {
            this.f589g.remove(str);
            aVar2.onActivityResult(aVar.parseResult(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    @l0
    final void l(@o0 String str) {
        Integer remove;
        if (!this.f586d.contains(str) && (remove = this.f584b.remove(str)) != null) {
            this.f583a.remove(remove);
        }
        this.f587e.remove(str);
        if (this.f588f.containsKey(str)) {
            Objects.toString(this.f588f.get(str));
            this.f588f.remove(str);
        }
        if (this.f589g.containsKey(str)) {
            Objects.toString(this.f589g.getParcelable(str));
            this.f589g.remove(str);
        }
        d dVar = this.f585c.get(str);
        if (dVar != null) {
            dVar.b();
            this.f585c.remove(str);
        }
    }
}
