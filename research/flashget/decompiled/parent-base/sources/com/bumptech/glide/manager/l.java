package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.o0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC1450w;
import com.bumptech.glide.manager.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes3.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    final Map<AbstractC1450w, com.bumptech.glide.n> f44689a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final o.b f44690b;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    class a implements k {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f44691b;

        a(AbstractC1450w abstractC1450w) {
            this.f44691b = abstractC1450w;
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
            l.this.f44689a.remove(this.f44691b);
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStop() {
        }
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final FragmentManager f44693a;

        b(FragmentManager fragmentManager) {
            this.f44693a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<com.bumptech.glide.n> set) {
            List<Fragment> I0 = fragmentManager.I0();
            int size = I0.size();
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = I0.get(i4);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.n a5 = l.this.a(fragment.getLifecycle());
                if (a5 != null) {
                    set.add(a5);
                }
            }
        }

        @Override // com.bumptech.glide.manager.p
        @o0
        public Set<com.bumptech.glide.n> a() {
            HashSet hashSet = new HashSet();
            b(this.f44693a, hashSet);
            return hashSet;
        }
    }

    l(@o0 o.b bVar) {
        this.f44690b = bVar;
    }

    com.bumptech.glide.n a(AbstractC1450w abstractC1450w) {
        com.bumptech.glide.util.o.b();
        return this.f44689a.get(abstractC1450w);
    }

    com.bumptech.glide.n b(Context context, com.bumptech.glide.c cVar, AbstractC1450w abstractC1450w, FragmentManager fragmentManager, boolean z4) {
        com.bumptech.glide.util.o.b();
        com.bumptech.glide.n a5 = a(abstractC1450w);
        if (a5 != null) {
            return a5;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC1450w);
        com.bumptech.glide.n a6 = this.f44690b.a(cVar, lifecycleLifecycle, new b(fragmentManager), context);
        this.f44689a.put(abstractC1450w, a6);
        lifecycleLifecycle.b(new a(abstractC1450w));
        if (z4) {
            a6.onStart();
        }
        return a6;
    }
}
