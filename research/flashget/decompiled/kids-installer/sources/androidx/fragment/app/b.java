package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.q0;
import androidx.core.app.f5;
import androidx.core.os.c;
import androidx.core.view.m3;
import androidx.core.view.r1;
import androidx.core.view.y1;
import androidx.fragment.app.i;
import androidx.fragment.app.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes3.dex */
class b extends m0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8145a;

        static {
            int[] iArr = new int[m0.e.c.values().length];
            f8145a = iArr;
            try {
                iArr[m0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8145a[m0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8145a[m0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8145a[m0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0090b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f8146o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m0.e f8147p;

        RunnableC0090b(List list, m0.e eVar) {
            this.f8146o = list;
            this.f8147p = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8146o.contains(this.f8147p)) {
                this.f8146o.remove(this.f8147p);
                b.this.s(this.f8147p);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0.e f8152d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f8153e;

        c(ViewGroup viewGroup, View view, boolean z5, m0.e eVar, k kVar) {
            this.f8149a = viewGroup;
            this.f8150b = view;
            this.f8151c = z5;
            this.f8152d = eVar;
            this.f8153e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8149a.endViewTransition(this.f8150b);
            if (this.f8151c) {
                this.f8152d.e().applyState(this.f8150b);
            }
            this.f8153e.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8152d);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class d implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f8155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0.e f8156b;

        d(Animator animator, m0.e eVar) {
            this.f8155a = animator;
            this.f8156b = eVar;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f8155a.end();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8156b);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0.e f8158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8160c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f8161d;

        /* compiled from: DefaultSpecialEffectsController.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f8159b.endViewTransition(eVar.f8160c);
                e.this.f8161d.a();
            }
        }

        e(m0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f8158a = eVar;
            this.f8159b = viewGroup;
            this.f8160c = view;
            this.f8161d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f8159b.post(new a());
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8158a);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8158a);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class f implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f8166c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0.e f8167d;

        f(View view, ViewGroup viewGroup, k kVar, m0.e eVar) {
            this.f8164a = view;
            this.f8165b = viewGroup;
            this.f8166c = kVar;
            this.f8167d = eVar;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f8164a.clearAnimation();
            this.f8165b.endViewTransition(this.f8164a);
            this.f8166c.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8167d);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ m0.e f8169o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m0.e f8170p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f8171q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f8172r;

        g(m0.e eVar, m0.e eVar2, boolean z5, androidx.collection.a aVar) {
            this.f8169o = eVar;
            this.f8170p = eVar2;
            this.f8171q = z5;
            this.f8172r = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.a(this.f8169o.f(), this.f8170p.f(), this.f8171q, this.f8172r, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i0 f8174o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f8175p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Rect f8176q;

        h(i0 i0Var, View view, Rect rect) {
            this.f8174o = i0Var;
            this.f8175p = view;
            this.f8176q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8174o.h(this.f8175p, this.f8176q);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f8178o;

        i(ArrayList arrayList) {
            this.f8178o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.e(this.f8178o, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ m f8180o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m0.e f8181p;

        j(m mVar, m0.e eVar) {
            this.f8180o = mVar;
            this.f8181p = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8180o.a();
            if (FragmentManager.W0(2)) {
                Objects.toString(this.f8181p);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f8183c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8184d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        private i.a f8185e;

        k(@androidx.annotation.o0 m0.e eVar, @androidx.annotation.o0 androidx.core.os.c cVar, boolean z5) {
            super(eVar, cVar);
            this.f8184d = false;
            this.f8183c = z5;
        }

        @q0
        i.a e(@androidx.annotation.o0 Context context) {
            if (this.f8184d) {
                return this.f8185e;
            }
            i.a b6 = androidx.fragment.app.i.b(context, b().f(), b().e() == m0.e.c.VISIBLE, this.f8183c);
            this.f8185e = b6;
            this.f8184d = true;
            return b6;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final m0.e f8186a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final androidx.core.os.c f8187b;

        l(@androidx.annotation.o0 m0.e eVar, @androidx.annotation.o0 androidx.core.os.c cVar) {
            this.f8186a = eVar;
            this.f8187b = cVar;
        }

        void a() {
            this.f8186a.d(this.f8187b);
        }

        @androidx.annotation.o0
        m0.e b() {
            return this.f8186a;
        }

        @androidx.annotation.o0
        androidx.core.os.c c() {
            return this.f8187b;
        }

        boolean d() {
            m0.e.c cVar;
            m0.e.c from = m0.e.c.from(this.f8186a.f().mView);
            m0.e.c e6 = this.f8186a.e();
            return from == e6 || !(from == (cVar = m0.e.c.VISIBLE) || e6 == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        @q0
        private final Object f8188c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8189d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        private final Object f8190e;

        m(@androidx.annotation.o0 m0.e eVar, @androidx.annotation.o0 androidx.core.os.c cVar, boolean z5, boolean z6) {
            super(eVar, cVar);
            if (eVar.e() == m0.e.c.VISIBLE) {
                this.f8188c = z5 ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.f8189d = z5 ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.f8188c = z5 ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.f8189d = true;
            }
            if (!z6) {
                this.f8190e = null;
            } else if (z5) {
                this.f8190e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f8190e = eVar.f().getSharedElementEnterTransition();
            }
        }

        @q0
        private i0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            i0 i0Var = g0.f8265a;
            if (i0Var != null && i0Var.e(obj)) {
                return i0Var;
            }
            i0 i0Var2 = g0.f8266b;
            if (i0Var2 != null && i0Var2.e(obj)) {
                return i0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @q0
        i0 e() {
            i0 f6 = f(this.f8188c);
            i0 f7 = f(this.f8190e);
            if (f6 == null || f7 == null || f6 == f7) {
                return f6 != null ? f6 : f7;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f8188c + " which uses a different Transition  type than its shared element transition " + this.f8190e);
        }

        @q0
        public Object g() {
            return this.f8190e;
        }

        @q0
        Object h() {
            return this.f8188c;
        }

        public boolean i() {
            return this.f8190e != null;
        }

        boolean j() {
            return this.f8189d;
        }
    }

    b(@androidx.annotation.o0 ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(@androidx.annotation.o0 List<k> list, @androidx.annotation.o0 List<m0.e> list2, boolean z5, @androidx.annotation.o0 Map<m0.e, Boolean> map) {
        int i5;
        ViewGroup m5 = m();
        Context context = m5.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z6 = false;
        while (true) {
            i5 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                i.a e6 = next.e(context);
                if (e6 == null) {
                    next.a();
                } else {
                    Animator animator = e6.f8285b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        m0.e b6 = next.b();
                        Fragment f6 = b6.f();
                        if (Boolean.TRUE.equals(map.get(b6))) {
                            if (FragmentManager.W0(2)) {
                                Objects.toString(f6);
                            }
                            next.a();
                        } else {
                            boolean z7 = b6.e() == m0.e.c.GONE;
                            if (z7) {
                                list2.remove(b6);
                            }
                            View view = f6.mView;
                            m5.startViewTransition(view);
                            animator.addListener(new c(m5, view, z7, b6, next));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.W0(2)) {
                                b6.toString();
                            }
                            next.c().d(new d(animator, b6));
                            z6 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            m0.e b7 = kVar.b();
            Fragment f7 = b7.f();
            if (z5) {
                if (FragmentManager.W0(i5)) {
                    Objects.toString(f7);
                }
                kVar.a();
            } else if (z6) {
                if (FragmentManager.W0(i5)) {
                    Objects.toString(f7);
                }
                kVar.a();
            } else {
                View view2 = f7.mView;
                i.a e7 = kVar.e(context);
                e7.getClass();
                Animation animation = e7.f8284a;
                animation.getClass();
                if (b7.e() != m0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                } else {
                    m5.startViewTransition(view2);
                    i.b bVar = new i.b(animation, m5, view2);
                    bVar.setAnimationListener(new e(b7, m5, view2, kVar));
                    view2.startAnimation(bVar);
                    i5 = 2;
                    if (FragmentManager.W0(2)) {
                        b7.toString();
                    }
                }
                kVar.c().d(new f(view2, m5, kVar, b7));
            }
        }
    }

    @androidx.annotation.o0
    private Map<m0.e, Boolean> x(@androidx.annotation.o0 List<m> list, @androidx.annotation.o0 List<m0.e> list2, boolean z5, @q0 m0.e eVar, @q0 m0.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        m0.e eVar3;
        m0.e eVar4;
        View view2;
        Object k5;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        b bVar;
        m0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        i0 i0Var;
        m0.e eVar6;
        View view3;
        f5 enterTransitionCallback;
        f5 exitTransitionCallback;
        View view4;
        View orDefault;
        String b6;
        b bVar2 = this;
        boolean z6 = z5;
        m0.e eVar7 = eVar;
        m0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        i0 i0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                i0 e6 = mVar.e();
                if (i0Var2 == null) {
                    i0Var2 = e6;
                } else if (e6 != null && i0Var2 != e6) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (i0Var2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj3 = null;
        View view6 = null;
        boolean z7 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                bVar = bVar2;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                i0Var = i0Var2;
                eVar6 = eVar8;
                view3 = view5;
                view6 = view6;
            } else {
                Object w5 = i0Var2.w(i0Var2.f(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view7 = view6;
                int i5 = 0;
                while (i5 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i5));
                    }
                    i5++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (z6) {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                }
                int i6 = 0;
                for (int size = sharedElementSourceNames.size(); i6 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                    i6++;
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
                bVar2.u(aVar3, eVar.f().mView);
                aVar3.u(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.W0(2)) {
                        eVar.toString();
                    }
                    enterTransitionCallback.d(sharedElementSourceNames, aVar3);
                    for (int size2 = sharedElementSourceNames.size() - 1; size2 >= 0; size2--) {
                        String str = sharedElementSourceNames.get(size2);
                        View orDefault2 = aVar3.getOrDefault(str, null);
                        if (orDefault2 == null) {
                            aVar2.remove(str);
                        } else if (!str.equals(y1.x0(orDefault2))) {
                            aVar2.put(y1.x0(orDefault2), (String) aVar2.remove(str));
                        }
                    }
                } else {
                    aVar2.u(aVar3.keySet());
                }
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                bVar2.u(aVar4, eVar2.f().mView);
                aVar4.u(sharedElementTargetNames2);
                aVar4.u(aVar2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.W0(2)) {
                        eVar2.toString();
                    }
                    exitTransitionCallback.d(sharedElementTargetNames2, aVar4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View orDefault3 = aVar4.getOrDefault(str2, null);
                        if (orDefault3 == null) {
                            String b7 = g0.b(aVar2, str2);
                            if (b7 != null) {
                                aVar2.remove(b7);
                            }
                        } else if (!str2.equals(y1.x0(orDefault3)) && (b6 = g0.b(aVar2, str2)) != null) {
                            aVar2.put(b6, y1.x0(orDefault3));
                        }
                    }
                } else {
                    g0.d(aVar2, aVar4);
                }
                bVar2.v(aVar3, aVar2.keySet());
                bVar2.v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    eVar5 = eVar;
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    bVar = bVar2;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    i0Var = i0Var2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    g0.a(eVar2.f(), eVar.f(), z6, aVar3, true);
                    HashMap hashMap2 = hashMap;
                    View view8 = view5;
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    r1.a(m(), new g(eVar2, eVar, z5, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View orDefault4 = aVar3.getOrDefault(sharedElementSourceNames.get(0), null);
                        i0Var2.r(w5, orDefault4);
                        view6 = orDefault4;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (sharedElementTargetNames2.isEmpty() || (orDefault = aVar4.getOrDefault(sharedElementTargetNames2.get(0), null)) == null) {
                        bVar = this;
                        view4 = view8;
                    } else {
                        bVar = this;
                        r1.a(m(), bVar.new h(i0Var2, orDefault, rect2));
                        view4 = view8;
                        z7 = true;
                    }
                    i0Var2.u(w5, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    i0Var = i0Var2;
                    i0Var2.p(w5, null, null, null, null, w5, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap = hashMap2;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = w5;
                }
            }
            z6 = z5;
            arrayList5 = arrayList4;
            bVar2 = bVar;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            arrayList6 = arrayList3;
            eVar7 = eVar5;
            i0Var2 = i0Var;
        }
        View view9 = view6;
        androidx.collection.a aVar5 = aVar2;
        ArrayList<View> arrayList9 = arrayList6;
        b bVar3 = bVar2;
        m0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        i0 i0Var3 = i0Var2;
        m0.e eVar10 = eVar8;
        View view10 = view5;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it4.hasNext()) {
            m next = it4.next();
            if (next.d()) {
                hashMap.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object f6 = i0Var3.f(next.h());
                m0.e b8 = next.b();
                boolean z8 = obj3 != null && (b8 == eVar9 || b8 == eVar10);
                if (f6 == null) {
                    if (!z8) {
                        hashMap.put(b8, Boolean.FALSE);
                        next.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    it = it4;
                    view = view10;
                    k5 = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    it = it4;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    bVar3.t(arrayList12, b8.f().mView);
                    if (z8) {
                        if (b8 == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        i0Var3.a(f6, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = b8;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        i0Var3.b(f6, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        i0Var3.p(f6, f6, arrayList12, null, null, null, null);
                        if (b8.e() == m0.e.c.GONE) {
                            eVar4 = b8;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.f().mView);
                            i0Var3.o(f6, eVar4.f().mView, arrayList13);
                            r1.a(m(), bVar3.new i(arrayList12));
                        } else {
                            eVar4 = b8;
                        }
                    }
                    if (eVar4.e() == m0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z7) {
                            i0Var3.q(f6, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        i0Var3.r(f6, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next.j()) {
                        obj5 = i0Var3.k(obj2, f6, null);
                        k5 = obj;
                    } else {
                        k5 = i0Var3.k(obj, f6, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = k5;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                it4 = it;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        m0.e eVar11 = eVar10;
        Object j5 = i0Var3.j(obj5, obj4, obj3);
        if (j5 == null) {
            return hashMap;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h5 = mVar4.h();
                m0.e b9 = mVar4.b();
                boolean z9 = obj3 != null && (b9 == eVar9 || b9 == eVar11);
                if (h5 != null || z9) {
                    if (y1.U0(m())) {
                        i0Var3.s(mVar4.b().f(), j5, mVar4.c(), bVar3.new j(mVar4, b9));
                    } else {
                        if (FragmentManager.W0(2)) {
                            Objects.toString(m());
                            Objects.toString(b9);
                        }
                        mVar4.a();
                    }
                }
            }
        }
        if (!y1.U0(m())) {
            return hashMap;
        }
        g0.e(arrayList11, 4);
        ArrayList<String> l5 = i0Var3.l(arrayList14);
        if (FragmentManager.W0(2)) {
            Iterator<View> it5 = arrayList15.iterator();
            while (it5.hasNext()) {
                View next2 = it5.next();
                Objects.toString(next2);
                y1.x0(next2);
            }
            Iterator<View> it6 = arrayList14.iterator();
            while (it6.hasNext()) {
                View next3 = it6.next();
                Objects.toString(next3);
                y1.x0(next3);
            }
        }
        i0Var3.c(m(), j5);
        i0Var3.t(m(), arrayList15, arrayList14, l5, aVar5);
        g0.e(arrayList11, 0);
        i0Var3.v(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    @Override // androidx.fragment.app.m0
    void f(@androidx.annotation.o0 List<m0.e> list, boolean z5) {
        m0.e eVar = null;
        m0.e eVar2 = null;
        for (m0.e eVar3 : list) {
            m0.e.c from = m0.e.c.from(eVar3.f().mView);
            int i5 = a.f8145a[eVar3.e().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                if (from == m0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i5 == 4 && from != m0.e.c.VISIBLE) {
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
        for (m0.e eVar4 : list) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar, z5));
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            eVar4.j(cVar2);
            boolean z6 = false;
            if (z5) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z5, z6));
                    eVar4.a(new RunnableC0090b(arrayList3, eVar4));
                }
                z6 = true;
                arrayList2.add(new m(eVar4, cVar2, z5, z6));
                eVar4.a(new RunnableC0090b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z5, z6));
                    eVar4.a(new RunnableC0090b(arrayList3, eVar4));
                }
                z6 = true;
                arrayList2.add(new m(eVar4, cVar2, z5, z6));
                eVar4.a(new RunnableC0090b(arrayList3, eVar4));
            }
        }
        Map<m0.e, Boolean> x5 = x(arrayList2, arrayList3, z5, eVar, eVar2);
        w(arrayList, arrayList3, x5.containsValue(Boolean.TRUE), x5);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            s((m0.e) it.next());
        }
        arrayList3.clear();
        if (FragmentManager.W0(2)) {
            Objects.toString(eVar);
            Objects.toString(eVar2);
        }
    }

    void s(@androidx.annotation.o0 m0.e eVar) {
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
        if (m3.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, @androidx.annotation.o0 View view) {
        String x02 = y1.x0(view);
        if (x02 != null) {
            map.put(x02, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(@androidx.annotation.o0 androidx.collection.a<String, View> aVar, @androidx.annotation.o0 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(y1.x0(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
