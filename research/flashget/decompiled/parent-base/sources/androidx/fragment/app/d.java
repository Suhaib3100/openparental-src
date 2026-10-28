package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.f;
import androidx.core.view.g1;
import androidx.core.view.x1;
import androidx.fragment.app.k;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes3.dex */
class d extends u0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29882a;

        static {
            int[] iArr = new int[u0.e.c.values().length];
            f29882a = iArr;
            try {
                iArr[u0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29882a[u0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29882a[u0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29882a[u0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f29883b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0.e f29884c;

        b(List list, u0.e eVar) {
            this.f29883b = list;
            this.f29884c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29883b.contains(this.f29884c)) {
                this.f29883b.remove(this.f29884c);
                d.this.s(this.f29884c);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class c extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u0.e f29889e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f29890f;

        c(ViewGroup viewGroup, View view, boolean z4, u0.e eVar, k kVar) {
            this.f29886b = viewGroup;
            this.f29887c = view;
            this.f29888d = z4;
            this.f29889e = eVar;
            this.f29890f = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29886b.endViewTransition(this.f29887c);
            if (this.f29888d) {
                this.f29889e.e().applyState(this.f29887c);
            }
            this.f29890f.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29889e);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0482d implements f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f29892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.e f29893b;

        C0482d(Animator animator, u0.e eVar) {
            this.f29892a = animator;
            this.f29893b = eVar;
        }

        @Override // androidx.core.os.f.a
        public void onCancel() {
            this.f29892a.end();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29893b);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.e f29895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f29898d;

        /* compiled from: DefaultSpecialEffectsController.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f29896b.endViewTransition(eVar.f29897c);
                e.this.f29898d.a();
            }
        }

        e(u0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f29895a = eVar;
            this.f29896b = viewGroup;
            this.f29897c = view;
            this.f29898d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f29896b.post(new a());
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29895a);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29895a);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class f implements f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f29903c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0.e f29904d;

        f(View view, ViewGroup viewGroup, k kVar, u0.e eVar) {
            this.f29901a = view;
            this.f29902b = viewGroup;
            this.f29903c = kVar;
            this.f29904d = eVar;
        }

        @Override // androidx.core.os.f.a
        public void onCancel() {
            this.f29901a.clearAnimation();
            this.f29902b.endViewTransition(this.f29901a);
            this.f29903c.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29904d);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.e f29906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0.e f29907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29908d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f29909e;

        g(u0.e eVar, u0.e eVar2, boolean z4, androidx.collection.a aVar) {
            this.f29906b = eVar;
            this.f29907c = eVar2;
            this.f29908d = z4;
            this.f29909e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.a(this.f29906b.f(), this.f29907c.f(), this.f29908d, this.f29909e, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f29911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29912c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f29913d;

        h(p0 p0Var, View view, Rect rect) {
            this.f29911b = p0Var;
            this.f29912c = view;
            this.f29913d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29911b.h(this.f29912c, this.f29913d);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29915b;

        i(ArrayList arrayList) {
            this.f29915b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.e(this.f29915b, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class j implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f29917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0.e f29918c;

        j(m mVar, u0.e eVar) {
            this.f29917b = mVar;
            this.f29918c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29917b.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f29918c);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f29920c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29921d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private k.a f29922e;

        k(@androidx.annotation.o0 u0.e eVar, @androidx.annotation.o0 androidx.core.os.f fVar, boolean z4) {
            super(eVar, fVar);
            this.f29921d = false;
            this.f29920c = z4;
        }

        @androidx.annotation.q0
        k.a e(@androidx.annotation.o0 Context context) {
            if (this.f29921d) {
                return this.f29922e;
            }
            k.a b5 = androidx.fragment.app.k.b(context, b().f(), b().e() == u0.e.c.VISIBLE, this.f29920c);
            this.f29922e = b5;
            this.f29921d = true;
            return b5;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final u0.e f29923a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final androidx.core.os.f f29924b;

        l(@androidx.annotation.o0 u0.e eVar, @androidx.annotation.o0 androidx.core.os.f fVar) {
            this.f29923a = eVar;
            this.f29924b = fVar;
        }

        void a() {
            this.f29923a.d(this.f29924b);
        }

        @androidx.annotation.o0
        u0.e b() {
            return this.f29923a;
        }

        @androidx.annotation.o0
        androidx.core.os.f c() {
            return this.f29924b;
        }

        boolean d() {
            u0.e.c cVar;
            u0.e.c from = u0.e.c.from(this.f29923a.f().mView);
            u0.e.c e4 = this.f29923a.e();
            return from == e4 || !(from == (cVar = u0.e.c.VISIBLE) || e4 == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final Object f29925c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f29926d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private final Object f29927e;

        m(@androidx.annotation.o0 u0.e eVar, @androidx.annotation.o0 androidx.core.os.f fVar, boolean z4, boolean z5) {
            super(eVar, fVar);
            if (eVar.e() == u0.e.c.VISIBLE) {
                this.f29925c = z4 ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.f29926d = z4 ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.f29925c = z4 ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.f29926d = true;
            }
            if (!z5) {
                this.f29927e = null;
            } else if (z4) {
                this.f29927e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f29927e = eVar.f().getSharedElementEnterTransition();
            }
        }

        @androidx.annotation.q0
        private p0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            p0 p0Var = n0.f30020a;
            if (p0Var != null && p0Var.e(obj)) {
                return p0Var;
            }
            p0 p0Var2 = n0.f30021b;
            if (p0Var2 != null && p0Var2.e(obj)) {
                return p0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @androidx.annotation.q0
        p0 e() {
            p0 f4 = f(this.f29925c);
            p0 f5 = f(this.f29927e);
            if (f4 == null || f5 == null || f4 == f5) {
                return f4 != null ? f4 : f5;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f29925c + " which uses a different Transition  type than its shared element transition " + this.f29927e);
        }

        @androidx.annotation.q0
        public Object g() {
            return this.f29927e;
        }

        @androidx.annotation.q0
        Object h() {
            return this.f29925c;
        }

        public boolean i() {
            return this.f29927e != null;
        }

        boolean j() {
            return this.f29926d;
        }
    }

    d(@androidx.annotation.o0 ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(@androidx.annotation.o0 List<k> list, @androidx.annotation.o0 List<u0.e> list2, boolean z4, @androidx.annotation.o0 Map<u0.e, Boolean> map) {
        int i4;
        ViewGroup m4 = m();
        Context context = m4.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z5 = false;
        while (true) {
            i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                k.a e4 = next.e(context);
                if (e4 == null) {
                    next.a();
                } else {
                    Animator animator = e4.f29978b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        u0.e b5 = next.b();
                        Fragment f4 = b5.f();
                        if (Boolean.TRUE.equals(map.get(b5))) {
                            if (FragmentManager.W0(2)) {
                                Objects.toString(f4);
                            }
                            next.a();
                        } else {
                            boolean z6 = b5.e() == u0.e.c.GONE;
                            if (z6) {
                                list2.remove(b5);
                            }
                            View view = f4.mView;
                            m4.startViewTransition(view);
                            animator.addListener(new c(m4, view, z6, b5, next));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.W0(2)) {
                                b5.toString();
                            }
                            next.c().d(new C0482d(animator, b5));
                            z5 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            u0.e b6 = kVar.b();
            Fragment f5 = b6.f();
            if (z4) {
                if (FragmentManager.W0(i4)) {
                    Objects.toString(f5);
                }
                kVar.a();
            } else if (z5) {
                if (FragmentManager.W0(i4)) {
                    Objects.toString(f5);
                }
                kVar.a();
            } else {
                View view2 = f5.mView;
                k.a e5 = kVar.e(context);
                e5.getClass();
                Animation animation = e5.f29977a;
                animation.getClass();
                if (b6.e() != u0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                } else {
                    m4.startViewTransition(view2);
                    k.b bVar = new k.b(animation, m4, view2);
                    bVar.setAnimationListener(new e(b6, m4, view2, kVar));
                    view2.startAnimation(bVar);
                    i4 = 2;
                    if (FragmentManager.W0(2)) {
                        b6.toString();
                    }
                }
                kVar.c().d(new f(view2, m4, kVar, b6));
            }
        }
    }

    @androidx.annotation.o0
    private Map<u0.e, Boolean> x(@androidx.annotation.o0 List<m> list, @androidx.annotation.o0 List<u0.e> list2, boolean z4, @androidx.annotation.q0 u0.e eVar, @androidx.annotation.q0 u0.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        u0.e eVar3;
        u0.e eVar4;
        View view2;
        Object k4;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        d dVar;
        u0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        p0 p0Var;
        u0.e eVar6;
        View view3;
        androidx.core.app.w0 enterTransitionCallback;
        androidx.core.app.w0 exitTransitionCallback;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String b5;
        ArrayList<String> arrayList6;
        d dVar2 = this;
        boolean z5 = z4;
        u0.e eVar7 = eVar;
        u0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        p0 p0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                p0 e4 = mVar.e();
                if (p0Var2 == null) {
                    p0Var2 = e4;
                } else if (e4 != null && p0Var2 != e4) {
                    StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(mVar.b().f());
                    sb.append(" returned Transition ");
                    throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, mVar.h(), " which uses a different Transition  type than other Fragments."));
                }
            }
        }
        if (p0Var2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj3 = null;
        View view7 = null;
        boolean z6 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList8;
                dVar = dVar2;
                eVar5 = eVar7;
                arrayList4 = arrayList7;
                rect = rect2;
                p0Var = p0Var2;
                eVar6 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object w4 = p0Var2.w(p0Var2.f(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view8 = view7;
                int i4 = 0;
                while (i4 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i4));
                    }
                    i4++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (z5) {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                }
                int i5 = 0;
                for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                    i5++;
                }
                if (FragmentManager.W0(2)) {
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    Iterator<String> it3 = sharedElementSourceNames.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                dVar2.u(aVar3, eVar.f().mView);
                aVar3.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.W0(2)) {
                        eVar.toString();
                    }
                    enterTransitionCallback.d(sharedElementSourceNames, aVar3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = aVar3.get(str);
                        if (view9 == null) {
                            aVar2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(x1.A0(view9))) {
                                aVar2.put(x1.A0(view9), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    aVar2.retainAll(aVar3.keySet());
                }
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                dVar2.u(aVar4, eVar2.f().mView);
                aVar4.retainAll(sharedElementTargetNames2);
                aVar4.retainAll(aVar2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.W0(2)) {
                        eVar2.toString();
                    }
                    exitTransitionCallback.d(sharedElementTargetNames2, aVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = aVar4.get(str2);
                        if (view10 == null) {
                            String b6 = n0.b(aVar2, str2);
                            if (b6 != null) {
                                aVar2.remove(b6);
                            }
                        } else if (!str2.equals(x1.A0(view10)) && (b5 = n0.b(aVar2, str2)) != null) {
                            aVar2.put(b5, x1.A0(view10));
                        }
                    }
                } else {
                    n0.d(aVar2, aVar4);
                }
                dVar2.v(aVar3, aVar2.keySet());
                dVar2.v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    eVar5 = eVar;
                    aVar = aVar2;
                    arrayList3 = arrayList8;
                    dVar = dVar2;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    p0Var = p0Var2;
                    view7 = view8;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    n0.a(eVar2.f(), eVar.f(), z5, aVar3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap hashMap2 = hashMap;
                    View view11 = view6;
                    aVar = aVar2;
                    ArrayList<View> arrayList11 = arrayList8;
                    g1.a(m(), new g(eVar2, eVar, z4, aVar4));
                    arrayList7.addAll(aVar3.values());
                    if (arrayList10.isEmpty()) {
                        view7 = view8;
                    } else {
                        view7 = aVar3.get(arrayList10.get(0));
                        p0Var2.r(w4, view7);
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(aVar4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = aVar4.get(sharedElementTargetNames2.get(0))) == null) {
                        dVar = this;
                        view4 = view11;
                    } else {
                        dVar = this;
                        g1.a(m(), dVar.new h(p0Var2, view5, rect2));
                        view4 = view11;
                        z6 = true;
                    }
                    p0Var2.u(w4, view4, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    p0Var = p0Var2;
                    p0Var2.p(w4, null, null, null, null, w4, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap = hashMap2;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = w4;
                }
            }
            z5 = z4;
            arrayList7 = arrayList4;
            dVar2 = dVar;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            arrayList8 = arrayList3;
            eVar7 = eVar5;
            p0Var2 = p0Var;
        }
        View view12 = view7;
        androidx.collection.a aVar5 = aVar2;
        ArrayList<View> arrayList12 = arrayList8;
        d dVar3 = dVar2;
        u0.e eVar9 = eVar7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        p0 p0Var3 = p0Var2;
        u0.e eVar10 = eVar8;
        View view13 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it4.hasNext()) {
            m next = it4.next();
            if (next.d()) {
                hashMap.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object f4 = p0Var3.f(next.h());
                u0.e b7 = next.b();
                boolean z7 = obj3 != null && (b7 == eVar9 || b7 == eVar10);
                if (f4 == null) {
                    if (!z7) {
                        hashMap.put(b7, Boolean.FALSE);
                        next.a();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it4;
                    view = view13;
                    k4 = obj4;
                    eVar3 = eVar10;
                    view2 = view12;
                } else {
                    it = it4;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj6 = obj4;
                    dVar3.t(arrayList15, b7.f().mView);
                    if (z7) {
                        if (b7 == eVar9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        p0Var3.a(f4, view13);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view13;
                        eVar4 = b7;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        p0Var3.b(f4, arrayList15);
                        view = view13;
                        obj = obj6;
                        arrayList = arrayList13;
                        obj2 = obj5;
                        arrayList2 = arrayList12;
                        eVar3 = eVar10;
                        p0Var3.p(f4, f4, arrayList15, null, null, null, null);
                        if (b7.e() == u0.e.c.GONE) {
                            eVar4 = b7;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(eVar4.f().mView);
                            p0Var3.o(f4, eVar4.f().mView, arrayList16);
                            g1.a(m(), dVar3.new i(arrayList15));
                        } else {
                            eVar4 = b7;
                        }
                    }
                    if (eVar4.e() == u0.e.c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z6) {
                            p0Var3.q(f4, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        p0Var3.r(f4, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next.j()) {
                        obj5 = p0Var3.k(obj2, f4, null);
                        k4 = obj;
                    } else {
                        k4 = p0Var3.k(obj, f4, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = k4;
                view12 = view2;
                view13 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it4 = it;
            }
        }
        ArrayList<View> arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        u0.e eVar11 = eVar10;
        Object j4 = p0Var3.j(obj5, obj4, obj3);
        if (j4 == null) {
            return hashMap;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h4 = mVar4.h();
                u0.e b10 = mVar4.b();
                boolean z10 = obj3 != null && (b10 == eVar9 || b10 == eVar11);
                if (h4 != null || z10) {
                    if (x1.Y0(m())) {
                        p0Var3.s(mVar4.b().f(), j4, mVar4.c(), dVar3.new j(mVar4, b10));
                    } else {
                        if (FragmentManager.W0(2)) {
                            Objects.toString(m());
                            Objects.toString(b10);
                        }
                        mVar4.a();
                    }
                }
            }
        }
        if (!x1.Y0(m())) {
            return hashMap;
        }
        n0.e(arrayList14, 4);
        ArrayList<String> l4 = p0Var3.l(arrayList17);
        if (FragmentManager.W0(2)) {
            Iterator<View> it5 = arrayList18.iterator();
            while (it5.hasNext()) {
                View next2 = it5.next();
                Objects.toString(next2);
                x1.A0(next2);
            }
            Iterator<View> it6 = arrayList17.iterator();
            while (it6.hasNext()) {
                View next3 = it6.next();
                Objects.toString(next3);
                x1.A0(next3);
            }
        }
        p0Var3.c(m(), j4);
        p0Var3.t(m(), arrayList18, arrayList17, l4, aVar5);
        n0.e(arrayList14, 0);
        p0Var3.v(obj3, arrayList18, arrayList17);
        return hashMap;
    }

    private void y(@androidx.annotation.o0 List<u0.e> list) {
        Fragment f4 = ((u0.e) androidx.appcompat.view.menu.d.a(list, 1)).f();
        for (u0.e eVar : list) {
            eVar.f().mAnimationInfo.f29753c = f4.mAnimationInfo.f29753c;
            eVar.f().mAnimationInfo.f29754d = f4.mAnimationInfo.f29754d;
            eVar.f().mAnimationInfo.f29755e = f4.mAnimationInfo.f29755e;
            eVar.f().mAnimationInfo.f29756f = f4.mAnimationInfo.f29756f;
        }
    }

    @Override // androidx.fragment.app.u0
    void f(@androidx.annotation.o0 List<u0.e> list, boolean z4) {
        u0.e eVar = null;
        u0.e eVar2 = null;
        for (u0.e eVar3 : list) {
            u0.e.c from = u0.e.c.from(eVar3.f().mView);
            int i4 = a.f29882a[eVar3.e().ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                if (from == u0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i4 == 4 && from != u0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (FragmentManager.W0(2)) {
            Objects.toString(eVar);
            Objects.toString(eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        for (u0.e eVar4 : list) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            eVar4.j(fVar);
            arrayList.add(new k(eVar4, fVar, z4));
            androidx.core.os.f fVar2 = new androidx.core.os.f();
            eVar4.j(fVar2);
            boolean z5 = false;
            if (z4) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, fVar2, z4, z5));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z5 = true;
                arrayList2.add(new m(eVar4, fVar2, z4, z5));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, fVar2, z4, z5));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z5 = true;
                arrayList2.add(new m(eVar4, fVar2, z4, z5));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<u0.e, Boolean> x4 = x(arrayList2, arrayList3, z4, eVar, eVar2);
        w(arrayList, arrayList3, x4.containsValue(Boolean.TRUE), x4);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            s((u0.e) it.next());
        }
        arrayList3.clear();
        if (FragmentManager.W0(2)) {
            Objects.toString(eVar);
            Objects.toString(eVar2);
        }
    }

    void s(@androidx.annotation.o0 u0.e eVar) {
        eVar.e().applyState(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, @androidx.annotation.o0 View view) {
        String A0 = x1.A0(view);
        if (A0 != null) {
            map.put(A0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(@androidx.annotation.o0 androidx.collection.a<String, View> aVar, @androidx.annotation.o0 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(x1.A0(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
