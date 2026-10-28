package androidx.fragment.app;

import a0.c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.C0536c;
import android.view.InterfaceC0538e;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.OnBackPressedDispatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.h1;
import android.view.i1;
import android.view.result.ActivityResult;
import android.view.result.ActivityResultRegistry;
import android.view.result.IntentSenderRequest;
import android.view.t;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.q0;
import androidx.core.app.m4;
import androidx.core.app.v3;
import androidx.core.app.x3;
import androidx.core.view.e1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import b.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import z.a;

/* loaded from: classes3.dex */
public abstract class FragmentManager implements a0 {
    private static boolean X = false;
    public static final int Z = 1;
    private android.view.result.c<Intent> D;
    private android.view.result.c<IntentSenderRequest> E;
    private android.view.result.c<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private w P;
    private c.C0000c Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8057b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f8059d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f8060e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f8062g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<o> f8068m;

    /* renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.m<?> f8077v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.j f8078w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f8079x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    Fragment f8080y;
    static final String S = "android:support:fragments";
    static final String T = "state";
    static final String U = "result_";
    static final String V = "state";
    static final String W = "fragment_";

    @c1({c1.a.LIBRARY})
    public static final String Y = "FragmentManager";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f8055a0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f8056a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final d0 f8058c = new d0();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.n f8061f = new androidx.fragment.app.n(this);

    /* renamed from: h, reason: collision with root package name */
    private final android.view.g f8063h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f8064i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, BackStackState> f8065j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Bundle> f8066k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, n> f8067l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final androidx.fragment.app.o f8069n = new androidx.fragment.app.o(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList<x> f8070o = new CopyOnWriteArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.util.c<Configuration> f8071p = new androidx.core.util.c() { // from class: androidx.fragment.app.p
        @Override // androidx.core.util.c
        public final void accept(Object obj) {
            FragmentManager.this.e1((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final androidx.core.util.c<Integer> f8072q = new androidx.core.util.c() { // from class: androidx.fragment.app.q
        @Override // androidx.core.util.c
        public final void accept(Object obj) {
            FragmentManager.this.f1((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final androidx.core.util.c<androidx.core.app.y> f8073r = new androidx.core.util.c() { // from class: androidx.fragment.app.r
        @Override // androidx.core.util.c
        public final void accept(Object obj) {
            FragmentManager.this.g1((androidx.core.app.y) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final androidx.core.util.c<m4> f8074s = new androidx.core.util.c() { // from class: androidx.fragment.app.s
        @Override // androidx.core.util.c
        public final void accept(Object obj) {
            FragmentManager.this.h1((m4) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final e1 f8075t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f8076u = -1;

    /* renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.l f8081z = null;
    private androidx.fragment.app.l A = new d();
    private n0 B = null;
    private n0 C = new e();
    ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    private Runnable R = new f();

    class a implements android.view.result.a<Map<String, Boolean>> {
        a() {
        }

        @Override // android.view.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f8086o;
            int i6 = pollFirst.f8087p;
            Fragment i7 = FragmentManager.this.f8058c.i(str);
            if (i7 == null) {
                return;
            }
            i7.onRequestPermissionsResult(i6, strArr, iArr);
        }
    }

    class b extends android.view.g {
        b(boolean z5) {
            super(z5);
        }

        @Override // android.view.g
        public void b() {
            FragmentManager.this.S0();
        }
    }

    class c implements e1 {
        c() {
        }

        @Override // androidx.core.view.e1
        public boolean a(@androidx.annotation.o0 MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }

        @Override // androidx.core.view.e1
        public void b(@androidx.annotation.o0 Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // androidx.core.view.e1
        public void c(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }

        @Override // androidx.core.view.e1
        public void d(@androidx.annotation.o0 Menu menu) {
            FragmentManager.this.W(menu);
        }
    }

    class d extends androidx.fragment.app.l {
        d() {
        }

        @Override // androidx.fragment.app.l
        @androidx.annotation.o0
        public Fragment a(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
            return FragmentManager.this.J0().c(FragmentManager.this.J0().j(), str, null);
        }
    }

    class e implements n0 {
        e() {
        }

        @Override // androidx.fragment.app.n0
        @androidx.annotation.o0
        public m0 a(@androidx.annotation.o0 ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    class g implements x {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Fragment f8094o;

        g(Fragment fragment) {
            this.f8094o = fragment;
        }

        @Override // androidx.fragment.app.x
        public void b(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
            this.f8094o.onAttachFragment(fragment);
        }
    }

    class h implements android.view.result.a<ActivityResult> {
        h() {
        }

        @Override // android.view.result.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f8086o;
            int i5 = pollFirst.f8087p;
            Fragment i6 = FragmentManager.this.f8058c.i(str);
            if (i6 == null) {
                return;
            }
            i6.onActivityResult(i5, activityResult.b(), activityResult.a());
        }
    }

    class i implements android.view.result.a<ActivityResult> {
        i() {
        }

        @Override // android.view.result.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f8086o;
            int i5 = pollFirst.f8087p;
            Fragment i6 = FragmentManager.this.f8058c.i(str);
            if (i6 == null) {
                return;
            }
            i6.onActivityResult(i5, activityResult.b(), activityResult.a());
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        @q0
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @g1
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @q0
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @g1
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @q0
        String getName();
    }

    private class k implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f8098a;

        k(@androidx.annotation.o0 String str) {
            this.f8098a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.f8098a);
        }
    }

    static class l extends b.a<IntentSenderRequest, ActivityResult> {
        l() {
        }

        @Override // b.a
        @androidx.annotation.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@androidx.annotation.o0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a6 = intentSenderRequest.a();
            if (a6 != null && (bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.W0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // b.a
        @androidx.annotation.o0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i5, @q0 Intent intent) {
            return new ActivityResult(i5, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public void a(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle) {
        }

        public void b(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Context context) {
        }

        public void c(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle) {
        }

        public void d(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void e(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void f(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void g(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Context context) {
        }

        public void h(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @q0 Bundle bundle) {
        }

        public void i(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void j(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Bundle bundle) {
        }

        public void k(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void l(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void m(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 View view, @q0 Bundle bundle) {
        }

        public void n(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }
    }

    private static class n implements z {

        /* renamed from: a, reason: collision with root package name */
        private final android.view.t f8100a;

        /* renamed from: b, reason: collision with root package name */
        private final z f8101b;

        /* renamed from: c, reason: collision with root package name */
        private final android.view.w f8102c;

        n(@androidx.annotation.o0 android.view.t tVar, @androidx.annotation.o0 z zVar, @androidx.annotation.o0 android.view.w wVar) {
            this.f8100a = tVar;
            this.f8101b = zVar;
            this.f8102c = wVar;
        }

        @Override // androidx.fragment.app.z
        public void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 Bundle bundle) {
            this.f8101b.a(str, bundle);
        }

        public boolean b(t.c cVar) {
            return this.f8100a.b().isAtLeast(cVar);
        }

        public void c() {
            this.f8100a.c(this.f8102c);
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        @androidx.annotation.l0
        void onBackStackChanged();
    }

    /* loaded from: classes.dex */
    interface p {
        boolean a(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2);
    }

    private class q implements p {

        /* renamed from: a, reason: collision with root package name */
        final String f8103a;

        /* renamed from: b, reason: collision with root package name */
        final int f8104b;

        /* renamed from: c, reason: collision with root package name */
        final int f8105c;

        q(@q0 String str, int i5, int i6) {
            this.f8103a = str;
            this.f8104b = i5;
            this.f8105c = i6;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f8080y;
            if (fragment == null || this.f8104b >= 0 || this.f8103a != null || !fragment.getChildFragmentManager().u1()) {
                return FragmentManager.this.y1(arrayList, arrayList2, this.f8103a, this.f8104b, this.f8105c);
            }
            return false;
        }
    }

    private class r implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f8107a;

        r(@androidx.annotation.o0 String str) {
            this.f8107a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.J1(arrayList, arrayList2, this.f8107a);
        }
    }

    private class s implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f8109a;

        s(@androidx.annotation.o0 String str) {
            this.f8109a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean a(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.R1(arrayList, arrayList2, this.f8109a);
        }
    }

    private void A() {
        androidx.fragment.app.m<?> mVar = this.f8077v;
        if (mVar instanceof i1 ? this.f8058c.q().q() : mVar.j() instanceof Activity ? !((Activity) this.f8077v.j()).isChangingConfigurations() : true) {
            Iterator<BackStackState> it = this.f8065j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f8006o.iterator();
                while (it2.hasNext()) {
                    this.f8058c.q().i(it2.next());
                }
            }
        }
    }

    private Set<m0> B() {
        HashSet hashSet = new HashSet();
        Iterator<b0> it = this.f8058c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(m0.o(viewGroup, O0()));
            }
        }
        return hashSet;
    }

    private Set<m0> C(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, int i5, int i6) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i5 < i6) {
            Iterator<f0.a> it = arrayList.get(i5).f8238c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f8256b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(m0.n(viewGroup, this));
                }
            }
            i5++;
        }
        return hashSet;
    }

    @androidx.annotation.o0
    private w C0(@androidx.annotation.o0 Fragment fragment) {
        return this.P.l(fragment);
    }

    private void E1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (!arrayList.get(i5).f8253r) {
                if (i6 != i5) {
                    m0(arrayList, arrayList2, i6, i5);
                }
                i6 = i5 + 1;
                if (arrayList2.get(i5).booleanValue()) {
                    while (i6 < size && arrayList2.get(i6).booleanValue() && !arrayList.get(i6).f8253r) {
                        i6++;
                    }
                }
                m0(arrayList, arrayList2, i5, i6);
                i5 = i6 - 1;
            }
            i5++;
        }
        if (i6 != size) {
            m0(arrayList, arrayList2, i6, size);
        }
    }

    private ViewGroup F0(@androidx.annotation.o0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f8078w.f()) {
            View d6 = this.f8078w.d(fragment.mContainerId);
            if (d6 instanceof ViewGroup) {
                return (ViewGroup) d6;
            }
        }
        return null;
    }

    private void G1() {
        if (this.f8068m != null) {
            for (int i5 = 0; i5 < this.f8068m.size(); i5++) {
                this.f8068m.get(i5).onBackStackChanged();
            }
        }
    }

    static int N1(int i5) {
        int i6 = f0.I;
        if (i5 == 4097) {
            return 8194;
        }
        if (i5 != 8194) {
            i6 = f0.M;
            if (i5 == 8197) {
                return f0.L;
            }
            if (i5 == 4099) {
                return f0.K;
            }
            if (i5 != 4100) {
                return 0;
            }
        }
        return i6;
    }

    @q0
    static Fragment Q0(@androidx.annotation.o0 View view) {
        Object tag = view.getTag(a.c.f34375a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void T(@q0 Fragment fragment) {
        if (fragment == null || !fragment.equals(o0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    @c1({c1.a.LIBRARY})
    public static boolean W0(int i5) {
        return X || Log.isLoggable("FragmentManager", i5);
    }

    private boolean X0(@androidx.annotation.o0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.v();
    }

    private void a0(int i5) {
        try {
            this.f8057b = true;
            this.f8058c.d(i5);
            l1(i5, false);
            Iterator<m0> it = B().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.f8057b = false;
            j0(true);
        } catch (Throwable th) {
            this.f8057b = false;
            throw th;
        }
    }

    private void a2(@androidx.annotation.o0 Fragment fragment) {
        ViewGroup F0 = F0(fragment);
        if (F0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i5 = a.c.f34377c;
        if (F0.getTag(i5) == null) {
            F0.setTag(i5, fragment);
        }
        ((Fragment) F0.getTag(i5)).setPopDirection(fragment.getPopDirection());
    }

    private void c2() {
        Iterator<b0> it = this.f8058c.l().iterator();
        while (it.hasNext()) {
            p1(it.next());
        }
    }

    private void d0() {
        if (this.L) {
            this.L = false;
            c2();
        }
    }

    private void d2(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
        androidx.fragment.app.m<?> mVar = this.f8077v;
        try {
            if (mVar != null) {
                mVar.l("  ", null, printWriter, new String[0]);
            } else {
                e0("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    @Deprecated
    public static void f0(boolean z5) {
        X = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(Integer num) {
        if (num.intValue() == 80) {
            N();
        }
    }

    private void f2() {
        synchronized (this.f8056a) {
            if (this.f8056a.isEmpty()) {
                this.f8063h.f(B0() > 0 && a1(this.f8079x));
            } else {
                this.f8063h.f(true);
            }
        }
    }

    private void g0() {
        Iterator<m0> it = B().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(androidx.core.app.y yVar) {
        O(yVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(m4 m4Var) {
        V(m4Var.b());
    }

    private void i0(boolean z5) {
        if (this.f8057b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8077v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8077v.k().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5) {
            w();
        }
        if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    private static void l0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, int i5, int i6) {
        while (i5 < i6) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue()) {
                aVar.Q(-1);
                aVar.W();
            } else {
                aVar.Q(1);
                aVar.V();
            }
            i5++;
        }
    }

    private void m0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, int i5, int i6) {
        boolean z5 = arrayList.get(i5).f8253r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f8058c.p());
        Fragment N0 = N0();
        boolean z6 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            N0 = !arrayList2.get(i7).booleanValue() ? aVar.X(this.O, N0) : aVar.Z(this.O, N0);
            z6 = z6 || aVar.f8244i;
        }
        this.O.clear();
        if (!z5 && this.f8076u >= 1) {
            for (int i8 = i5; i8 < i6; i8++) {
                Iterator<f0.a> it = arrayList.get(i8).f8238c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f8256b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f8058c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i5, i6);
        boolean booleanValue = arrayList2.get(i6 - 1).booleanValue();
        for (int i9 = i5; i9 < i6; i9++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i9);
            if (booleanValue) {
                for (int size = aVar2.f8238c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f8238c.get(size).f8256b;
                    if (fragment2 != null) {
                        D(fragment2).m();
                    }
                }
            } else {
                Iterator<f0.a> it2 = aVar2.f8238c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f8256b;
                    if (fragment3 != null) {
                        D(fragment3).m();
                    }
                }
            }
        }
        l1(this.f8076u, true);
        for (m0 m0Var : C(arrayList, i5, i6)) {
            m0Var.r(booleanValue);
            m0Var.p();
            m0Var.g();
        }
        while (i5 < i6) {
            androidx.fragment.app.a aVar3 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && aVar3.P >= 0) {
                aVar3.P = -1;
            }
            aVar3.Y();
            i5++;
        }
        if (z6) {
            G1();
        }
    }

    private int p0(@q0 String str, int i5, boolean z5) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f8059d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i5 < 0) {
            if (z5) {
                return 0;
            }
            return this.f8059d.size() - 1;
        }
        int size = this.f8059d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f8059d.get(size);
            if ((str != null && str.equals(aVar.f8246k)) || (i5 >= 0 && i5 == aVar.P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z5) {
            if (size == this.f8059d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f8059d.get(size - 1);
            if ((str == null || !str.equals(aVar2.f8246k)) && (i5 < 0 || i5 != aVar2.P)) {
                return size;
            }
            size--;
        }
        return size;
    }

    @androidx.annotation.o0
    public static <F extends Fragment> F q0(@androidx.annotation.o0 View view) {
        F f6 = (F) v0(view);
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @androidx.annotation.o0
    static FragmentManager u0(@androidx.annotation.o0 View view) {
        FragmentActivity fragmentActivity;
        Fragment v02 = v0(view);
        if (v02 != null) {
            if (v02.isAdded()) {
                return v02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + v02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.Y();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @q0
    private static Fragment v0(@androidx.annotation.o0 View view) {
        while (view != null) {
            Fragment Q0 = Q0(view);
            if (Q0 != null) {
                return Q0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void w() {
        if (c1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void w0() {
        Iterator<m0> it = B().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private void x() {
        this.f8057b = false;
        this.N.clear();
        this.M.clear();
    }

    private boolean x0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f8056a) {
            if (this.f8056a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f8056a.size();
                boolean z5 = false;
                for (int i5 = 0; i5 < size; i5++) {
                    z5 |= this.f8056a.get(i5).a(arrayList, arrayList2);
                }
                return z5;
            } finally {
                this.f8056a.clear();
                this.f8077v.k().removeCallbacks(this.R);
            }
        }
    }

    private boolean x1(@q0 String str, int i5, int i6) {
        j0(false);
        i0(true);
        Fragment fragment = this.f8080y;
        if (fragment != null && i5 < 0 && str == null && fragment.getChildFragmentManager().u1()) {
            return true;
        }
        boolean y12 = y1(this.M, this.N, str, i5, i6);
        if (y12) {
            this.f8057b = true;
            try {
                E1(this.M, this.N);
            } finally {
                x();
            }
        }
        f2();
        d0();
        this.f8058c.b();
        return y12;
    }

    @androidx.annotation.o0
    public j A0(int i5) {
        return this.f8059d.get(i5);
    }

    public void A1(@androidx.annotation.o0 m mVar, boolean z5) {
        this.f8069n.o(mVar, z5);
    }

    public int B0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f8059d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void B1(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
            int i5 = fragment.mBackStackNesting;
        }
        boolean z5 = !fragment.isInBackStack();
        if (!fragment.mDetached || z5) {
            this.f8058c.v(fragment);
            if (X0(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            a2(fragment);
        }
    }

    public void C1(@androidx.annotation.o0 x xVar) {
        this.f8070o.remove(xVar);
    }

    @androidx.annotation.o0
    b0 D(@androidx.annotation.o0 Fragment fragment) {
        b0 o5 = this.f8058c.o(fragment.mWho);
        if (o5 != null) {
            return o5;
        }
        b0 b0Var = new b0(this.f8069n, this.f8058c, fragment);
        b0Var.o(this.f8077v.j().getClassLoader());
        b0Var.u(this.f8076u);
        return b0Var;
    }

    @androidx.annotation.o0
    androidx.fragment.app.j D0() {
        return this.f8078w;
    }

    public void D1(@androidx.annotation.o0 o oVar) {
        ArrayList<o> arrayList = this.f8068m;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    void E(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (W0(2)) {
                fragment.toString();
            }
            this.f8058c.v(fragment);
            if (X0(fragment)) {
                this.H = true;
            }
            a2(fragment);
        }
    }

    @q0
    public Fragment E0(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o02 = o0(string);
        if (o02 == null) {
            d2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return o02;
    }

    void F() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(4);
    }

    void F1(@androidx.annotation.o0 Fragment fragment) {
        this.P.r(fragment);
    }

    void G() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(0);
    }

    @androidx.annotation.o0
    public androidx.fragment.app.l G0() {
        androidx.fragment.app.l lVar = this.f8081z;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f8079x;
        return fragment != null ? fragment.mFragmentManager.G0() : this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void e1(@androidx.annotation.o0 Configuration configuration) {
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    @androidx.annotation.o0
    d0 H0() {
        return this.f8058c;
    }

    void H1(@q0 Parcelable parcelable, @q0 v vVar) {
        if (this.f8077v instanceof i1) {
            d2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.s(vVar);
        L1(parcelable);
    }

    boolean I(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.f8076u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.o0
    public List<Fragment> I0() {
        return this.f8058c.p();
    }

    public void I1(@androidx.annotation.o0 String str) {
        h0(new r(str), false);
    }

    void J() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(1);
    }

    @c1({c1.a.LIBRARY})
    @androidx.annotation.o0
    public androidx.fragment.app.m<?> J0() {
        return this.f8077v;
    }

    boolean J1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        BackStackState remove = this.f8065j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.a> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a next = it.next();
            if (next.Q) {
                Iterator<f0.a> it2 = next.f8238c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f8256b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.a> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z5 = false;
            while (it3.hasNext()) {
                if (it3.next().a(arrayList, arrayList2) || z5) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    boolean K(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        if (this.f8076u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z5 = false;
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null && Z0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z5 = true;
            }
        }
        if (this.f8060e != null) {
            for (int i5 = 0; i5 < this.f8060e.size(); i5++) {
                Fragment fragment2 = this.f8060e.get(i5);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f8060e = arrayList;
        return z5;
    }

    @androidx.annotation.o0
    LayoutInflater.Factory2 K0() {
        return this.f8061f;
    }

    void K1(@q0 Parcelable parcelable) {
        if (this.f8077v instanceof InterfaceC0538e) {
            d2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        L1(parcelable);
    }

    void L() {
        this.K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        Object obj = this.f8077v;
        if (obj instanceof androidx.core.content.n) {
            ((androidx.core.content.n) obj).n(this.f8072q);
        }
        Object obj2 = this.f8077v;
        if (obj2 instanceof androidx.core.content.m) {
            ((androidx.core.content.m) obj2).w(this.f8071p);
        }
        Object obj3 = this.f8077v;
        if (obj3 instanceof v3) {
            ((v3) obj3).F(this.f8073r);
        }
        Object obj4 = this.f8077v;
        if (obj4 instanceof x3) {
            ((x3) obj4).m(this.f8074s);
        }
        Object obj5 = this.f8077v;
        if (obj5 instanceof androidx.core.view.l0) {
            ((androidx.core.view.l0) obj5).e(this.f8075t);
        }
        this.f8077v = null;
        this.f8078w = null;
        this.f8079x = null;
        if (this.f8062g != null) {
            this.f8063h.d();
            this.f8062g = null;
        }
        android.view.result.c<Intent> cVar = this.D;
        if (cVar != null) {
            cVar.d();
            this.E.d();
            this.F.d();
        }
    }

    @androidx.annotation.o0
    androidx.fragment.app.o L0() {
        return this.f8069n;
    }

    void L1(@q0 Parcelable parcelable) {
        b0 b0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8077v.j().getClassLoader());
                this.f8066k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8077v.j().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f8058c.y(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f8058c.w();
        Iterator<String> it = fragmentManagerState.f8111o.iterator();
        while (it.hasNext()) {
            FragmentState C = this.f8058c.C(it.next(), null);
            if (C != null) {
                Fragment k5 = this.P.k(C.f8120p);
                if (k5 != null) {
                    if (W0(2)) {
                        k5.toString();
                    }
                    b0Var = new b0(this.f8069n, this.f8058c, k5, C);
                } else {
                    b0Var = new b0(this.f8069n, this.f8058c, this.f8077v.j().getClassLoader(), G0(), C);
                }
                Fragment k6 = b0Var.k();
                k6.mFragmentManager = this;
                if (W0(2)) {
                    k6.toString();
                }
                b0Var.o(this.f8077v.j().getClassLoader());
                this.f8058c.s(b0Var);
                b0Var.u(this.f8076u);
            }
        }
        for (Fragment fragment : this.P.n()) {
            if (!this.f8058c.c(fragment.mWho)) {
                if (W0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f8111o);
                }
                this.P.r(fragment);
                fragment.mFragmentManager = this;
                b0 b0Var2 = new b0(this.f8069n, this.f8058c, fragment);
                b0Var2.u(1);
                b0Var2.m();
                fragment.mRemoving = true;
                b0Var2.m();
            }
        }
        this.f8058c.x(fragmentManagerState.f8112p);
        if (fragmentManagerState.f8113q != null) {
            this.f8059d = new ArrayList<>(fragmentManagerState.f8113q.length);
            int i5 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f8113q;
                if (i5 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a b6 = backStackRecordStateArr[i5].b(this);
                if (W0(2)) {
                    int i6 = b6.P;
                    b6.toString();
                    PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
                    b6.U("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8059d.add(b6);
                i5++;
            }
        } else {
            this.f8059d = null;
        }
        this.f8064i.set(fragmentManagerState.f8114r);
        String str3 = fragmentManagerState.f8115s;
        if (str3 != null) {
            Fragment o02 = o0(str3);
            this.f8080y = o02;
            T(o02);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f8116t;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                this.f8065j.put(arrayList2.get(i7), fragmentManagerState.f8117u.get(i7));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.f8118v);
    }

    void M() {
        a0(1);
    }

    @q0
    Fragment M0() {
        return this.f8079x;
    }

    @Deprecated
    v M1() {
        if (this.f8077v instanceof i1) {
            d2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.o();
    }

    void N() {
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    @q0
    public Fragment N0() {
        return this.f8080y;
    }

    void O(boolean z5) {
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z5);
            }
        }
    }

    @androidx.annotation.o0
    n0 O0() {
        n0 n0Var = this.B;
        if (n0Var != null) {
            return n0Var;
        }
        Fragment fragment = this.f8079x;
        return fragment != null ? fragment.mFragmentManager.O0() : this.C;
    }

    Parcelable O1() {
        if (this.f8077v instanceof InterfaceC0538e) {
            d2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle d12 = d1();
        if (d12.isEmpty()) {
            return null;
        }
        return d12;
    }

    void P(@androidx.annotation.o0 Fragment fragment) {
        Iterator<x> it = this.f8070o.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    @q0
    public c.C0000c P0() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.o0
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public Bundle d1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.I = true;
        this.P.t(true);
        ArrayList<String> z5 = this.f8058c.z();
        ArrayList<FragmentState> n5 = this.f8058c.n();
        if (n5.isEmpty()) {
            W0(2);
        } else {
            ArrayList<String> A = this.f8058c.A();
            ArrayList<androidx.fragment.app.a> arrayList = this.f8059d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i5 = 0; i5 < size; i5++) {
                    backStackRecordStateArr[i5] = new BackStackRecordState(this.f8059d.get(i5));
                    if (W0(2)) {
                        Objects.toString(this.f8059d.get(i5));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f8111o = z5;
            fragmentManagerState.f8112p = A;
            fragmentManagerState.f8113q = backStackRecordStateArr;
            fragmentManagerState.f8114r = this.f8064i.get();
            Fragment fragment = this.f8080y;
            if (fragment != null) {
                fragmentManagerState.f8115s = fragment.mWho;
            }
            fragmentManagerState.f8116t.addAll(this.f8065j.keySet());
            fragmentManagerState.f8117u.addAll(this.f8065j.values());
            fragmentManagerState.f8118v = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f8066k.keySet()) {
                bundle.putBundle(androidx.constraintlayout.motion.widget.g.a("result_", str), this.f8066k.get(str));
            }
            Iterator<FragmentState> it = n5.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.f8120p, bundle2);
            }
        }
        return bundle;
    }

    void Q() {
        for (Fragment fragment : this.f8058c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Q();
            }
        }
    }

    public void Q1(@androidx.annotation.o0 String str) {
        h0(new s(str), false);
    }

    boolean R(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.f8076u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.o0
    h1 R0(@androidx.annotation.o0 Fragment fragment) {
        return this.P.p(fragment);
    }

    boolean R1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        int i5;
        int p02 = p0(str, -1, true);
        if (p02 < 0) {
            return false;
        }
        for (int i6 = p02; i6 < this.f8059d.size(); i6++) {
            androidx.fragment.app.a aVar = this.f8059d.get(i6);
            if (!aVar.f8253r) {
                d2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i7 = p02; i7 < this.f8059d.size(); i7++) {
            androidx.fragment.app.a aVar2 = this.f8059d.get(i7);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<f0.a> it = aVar2.f8238c.iterator();
            while (it.hasNext()) {
                f0.a next = it.next();
                Fragment fragment = next.f8256b;
                if (fragment != null) {
                    if (!next.f8257c || (i5 = next.f8255a) == 1 || i5 == 2 || i5 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i8 = next.f8255a;
                    if (i8 == 1 || i8 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder a6 = androidx.appcompat.view.g.a("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                a6.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                a6.append(" in ");
                a6.append(aVar2);
                a6.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                d2(new IllegalArgumentException(a6.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder a7 = androidx.appcompat.view.g.a("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                a7.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                a7.append("fragment ");
                a7.append(fragment2);
                d2(new IllegalArgumentException(a7.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.z0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f8059d.size() - p02);
        for (int i9 = p02; i9 < this.f8059d.size(); i9++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f8059d.size() - 1; size >= p02; size--) {
            androidx.fragment.app.a remove = this.f8059d.remove(size);
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
            aVar3.R();
            arrayList4.set(size - p02, new BackStackRecordState(aVar3));
            remove.Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f8065j.put(str, backStackState);
        return true;
    }

    void S(@androidx.annotation.o0 Menu menu) {
        if (this.f8076u < 1) {
            return;
        }
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void S0() {
        j0(true);
        if (this.f8063h.c()) {
            u1();
        } else {
            this.f8062g.e();
        }
    }

    @q0
    public Fragment.SavedState S1(@androidx.annotation.o0 Fragment fragment) {
        b0 o5 = this.f8058c.o(fragment.mWho);
        if (o5 == null || !o5.k().equals(fragment)) {
            d2(new IllegalStateException(androidx.fragment.app.d.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        return o5.r();
    }

    void T0(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        a2(fragment);
    }

    void T1() {
        synchronized (this.f8056a) {
            boolean z5 = true;
            if (this.f8056a.size() != 1) {
                z5 = false;
            }
            if (z5) {
                this.f8077v.k().removeCallbacks(this.R);
                this.f8077v.k().post(this.R);
                f2();
            }
        }
    }

    void U() {
        a0(5);
    }

    void U0(@androidx.annotation.o0 Fragment fragment) {
        if (fragment.mAdded && X0(fragment)) {
            this.H = true;
        }
    }

    void U1(@androidx.annotation.o0 Fragment fragment, boolean z5) {
        ViewGroup F0 = F0(fragment);
        if (F0 == null || !(F0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) F0).c(!z5);
    }

    void V(boolean z5) {
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z5);
            }
        }
    }

    public boolean V0() {
        return this.K;
    }

    public void V1(@androidx.annotation.o0 androidx.fragment.app.l lVar) {
        this.f8081z = lVar;
    }

    boolean W(@androidx.annotation.o0 Menu menu) {
        boolean z5 = false;
        if (this.f8076u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null && Z0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z5 = true;
            }
        }
        return z5;
    }

    void W1(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 t.c cVar) {
        if (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void X() {
        f2();
        T(this.f8080y);
    }

    void X1(@q0 Fragment fragment) {
        if (fragment == null || (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f8080y;
            this.f8080y = fragment;
            T(fragment2);
            T(this.f8080y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void Y() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(7);
    }

    boolean Y0(@q0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void Y1(@androidx.annotation.o0 n0 n0Var) {
        this.B = n0Var;
    }

    void Z() {
        this.I = false;
        this.J = false;
        this.P.t(false);
        a0(5);
    }

    boolean Z0(@q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void Z1(@q0 c.C0000c c0000c) {
        this.Q = c0000c;
    }

    @Override // androidx.fragment.app.a0
    public final void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 Bundle bundle) {
        n nVar = this.f8067l.get(str);
        if (nVar == null || !nVar.b(t.c.STARTED)) {
            this.f8066k.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (W0(2)) {
            Objects.toString(bundle);
        }
    }

    boolean a1(@q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.N0()) && a1(fragmentManager.f8079x);
    }

    @Override // androidx.fragment.app.a0
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@androidx.annotation.o0 final String str, @androidx.annotation.o0 android.view.a0 a0Var, @androidx.annotation.o0 final z zVar) {
        final android.view.t lifecycle = a0Var.getLifecycle();
        if (lifecycle.b() == t.c.DESTROYED) {
            return;
        }
        android.view.w wVar = new android.view.w() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // android.view.w
            public void h(@androidx.annotation.o0 android.view.a0 a0Var2, @androidx.annotation.o0 t.b bVar) {
                Bundle bundle;
                if (bVar == t.b.ON_START && (bundle = (Bundle) FragmentManager.this.f8066k.get(str)) != null) {
                    zVar.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (bVar == t.b.ON_DESTROY) {
                    lifecycle.c(this);
                    FragmentManager.this.f8067l.remove(str);
                }
            }
        };
        lifecycle.a(wVar);
        n put = this.f8067l.put(str, new n(lifecycle, zVar, wVar));
        if (put != null) {
            put.c();
        }
        if (W0(2)) {
            lifecycle.toString();
            Objects.toString(zVar);
        }
    }

    void b0() {
        this.J = true;
        this.P.t(true);
        a0(4);
    }

    boolean b1(int i5) {
        return this.f8076u >= i5;
    }

    void b2(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @Override // androidx.fragment.app.a0
    public final void c(@androidx.annotation.o0 String str) {
        n remove = this.f8067l.remove(str);
        if (remove != null) {
            remove.c();
        }
        W0(2);
    }

    void c0() {
        a0(2);
    }

    public boolean c1() {
        return this.I || this.J;
    }

    @Override // androidx.fragment.app.a0
    public final void d(@androidx.annotation.o0 String str) {
        this.f8066k.remove(str);
        W0(2);
    }

    public void e0(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
        int size;
        int size2;
        String a6 = androidx.concurrent.futures.b.a(str, "    ");
        this.f8058c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f8060e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment = this.f8060e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f8059d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.a aVar = this.f8059d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.U(a6, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8064i.get());
        synchronized (this.f8056a) {
            int size3 = this.f8056a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i7 = 0; i7 < size3; i7++) {
                    p pVar = this.f8056a.get(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i7);
                    printWriter.print(": ");
                    printWriter.println(pVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8077v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8078w);
        if (this.f8079x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8079x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8076u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public void e2(@androidx.annotation.o0 m mVar) {
        this.f8069n.p(mVar);
    }

    void h0(@androidx.annotation.o0 p pVar, boolean z5) {
        if (!z5) {
            if (this.f8077v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            w();
        }
        synchronized (this.f8056a) {
            if (this.f8077v == null) {
                if (!z5) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f8056a.add(pVar);
                T1();
            }
        }
    }

    void i1(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 String[] strArr, int i5) {
        if (this.F == null) {
            this.f8077v.v(fragment, strArr, i5);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i5));
        this.F.b(strArr);
    }

    boolean j0(boolean z5) {
        i0(z5);
        boolean z6 = false;
        while (x0(this.M, this.N)) {
            z6 = true;
            this.f8057b = true;
            try {
                E1(this.M, this.N);
            } finally {
                x();
            }
        }
        f2();
        d0();
        this.f8058c.b();
        return z6;
    }

    void j1(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i5, @q0 Bundle bundle) {
        if (this.D == null) {
            this.f8077v.B(fragment, intent, i5, bundle);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i5));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.b(intent);
    }

    void k0(@androidx.annotation.o0 p pVar, boolean z5) {
        if (z5 && (this.f8077v == null || this.K)) {
            return;
        }
        i0(z5);
        if (pVar.a(this.M, this.N)) {
            this.f8057b = true;
            try {
                E1(this.M, this.N);
            } finally {
                x();
            }
        }
        f2();
        d0();
        this.f8058c.b();
    }

    void k1(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8, @q0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E == null) {
            this.f8077v.G(fragment, intentSender, i5, intent, i6, i7, i8, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (W0(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest a6 = new IntentSenderRequest.b(intentSender).b(intent2).c(i7, i6).a();
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i5));
        if (W0(2)) {
            fragment.toString();
        }
        this.E.b(a6);
    }

    void l1(int i5, boolean z5) {
        androidx.fragment.app.m<?> mVar;
        if (this.f8077v == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i5 != this.f8076u) {
            this.f8076u = i5;
            this.f8058c.u();
            c2();
            if (this.H && (mVar = this.f8077v) != null && this.f8076u == 7) {
                mVar.H();
                this.H = false;
            }
        }
    }

    void m(androidx.fragment.app.a aVar) {
        if (this.f8059d == null) {
            this.f8059d = new ArrayList<>();
        }
        this.f8059d.add(aVar);
    }

    void m1() {
        if (this.f8077v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.t(false);
        for (Fragment fragment : this.f8058c.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    b0 n(@androidx.annotation.o0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            a0.c.i(fragment, str);
        }
        if (W0(2)) {
            fragment.toString();
        }
        b0 D = D(fragment);
        fragment.mFragmentManager = this;
        this.f8058c.s(D);
        if (!fragment.mDetached) {
            this.f8058c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (X0(fragment)) {
                this.H = true;
            }
        }
        return D;
    }

    public boolean n0() {
        boolean j02 = j0(true);
        w0();
        return j02;
    }

    void n1(@androidx.annotation.o0 FragmentContainerView fragmentContainerView) {
        View view;
        for (b0 b0Var : this.f8058c.l()) {
            Fragment k5 = b0Var.k();
            if (k5.mContainerId == fragmentContainerView.getId() && (view = k5.mView) != null && view.getParent() == null) {
                k5.mContainer = fragmentContainerView;
                b0Var.b();
            }
        }
    }

    public void o(@androidx.annotation.o0 x xVar) {
        this.f8070o.add(xVar);
    }

    @q0
    Fragment o0(@androidx.annotation.o0 String str) {
        return this.f8058c.f(str);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @Deprecated
    public f0 o1() {
        return u();
    }

    public void p(@androidx.annotation.o0 o oVar) {
        if (this.f8068m == null) {
            this.f8068m = new ArrayList<>();
        }
        this.f8068m.add(oVar);
    }

    void p1(@androidx.annotation.o0 b0 b0Var) {
        Fragment k5 = b0Var.k();
        if (k5.mDeferStart) {
            if (this.f8057b) {
                this.L = true;
            } else {
                k5.mDeferStart = false;
                b0Var.m();
            }
        }
    }

    void q(@androidx.annotation.o0 Fragment fragment) {
        this.P.g(fragment);
    }

    public void q1() {
        h0(new q(null, -1, 0), false);
    }

    int r() {
        return this.f8064i.getAndIncrement();
    }

    @q0
    public Fragment r0(@androidx.annotation.d0 int i5) {
        return this.f8058c.g(i5);
    }

    public void r1(int i5, int i6) {
        s1(i5, i6, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void s(@androidx.annotation.o0 androidx.fragment.app.m<?> mVar, @androidx.annotation.o0 androidx.fragment.app.j jVar, @q0 Fragment fragment) {
        if (this.f8077v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8077v = mVar;
        this.f8078w = jVar;
        this.f8079x = fragment;
        if (fragment != null) {
            o(new g(fragment));
        } else if (mVar instanceof x) {
            o((x) mVar);
        }
        if (this.f8079x != null) {
            f2();
        }
        if (mVar instanceof android.view.h) {
            android.view.h hVar = (android.view.h) mVar;
            OnBackPressedDispatcher onBackPressedDispatcher = hVar.getOnBackPressedDispatcher();
            this.f8062g = onBackPressedDispatcher;
            android.view.a0 a0Var = hVar;
            if (fragment != null) {
                a0Var = fragment;
            }
            onBackPressedDispatcher.b(a0Var, this.f8063h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.C0(fragment);
        } else if (mVar instanceof i1) {
            this.P = w.m(((i1) mVar).getViewModelStore());
        } else {
            this.P = new w(false);
        }
        this.P.t(c1());
        this.f8058c.B(this.P);
        Object obj = this.f8077v;
        if ((obj instanceof InterfaceC0538e) && fragment == null) {
            C0536c savedStateRegistry = ((InterfaceC0538e) obj).getSavedStateRegistry();
            savedStateRegistry.j("android:support:fragments", new C0536c.InterfaceC0117c() { // from class: androidx.fragment.app.t
                @Override // android.view.C0536c.InterfaceC0117c
                public final Bundle a() {
                    Bundle d12;
                    d12 = FragmentManager.this.d1();
                    return d12;
                }
            });
            Bundle b6 = savedStateRegistry.b("android:support:fragments");
            if (b6 != null) {
                L1(b6);
            }
        }
        Object obj2 = this.f8077v;
        if (obj2 instanceof android.view.result.d) {
            ActivityResultRegistry r5 = ((android.view.result.d) obj2).r();
            String a6 = androidx.constraintlayout.motion.widget.g.a("FragmentManager:", fragment != null ? androidx.concurrent.futures.a.a(new StringBuilder(), fragment.mWho, ":") : "");
            this.D = r5.j(androidx.concurrent.futures.b.a(a6, "StartActivityForResult"), new b.k(), new h());
            this.E = r5.j(androidx.concurrent.futures.b.a(a6, "StartIntentSenderForResult"), new l(), new i());
            this.F = r5.j(androidx.concurrent.futures.b.a(a6, "RequestPermissions"), new b.i(), new a());
        }
        Object obj3 = this.f8077v;
        if (obj3 instanceof androidx.core.content.m) {
            ((androidx.core.content.m) obj3).h(this.f8071p);
        }
        Object obj4 = this.f8077v;
        if (obj4 instanceof androidx.core.content.n) {
            ((androidx.core.content.n) obj4).A(this.f8072q);
        }
        Object obj5 = this.f8077v;
        if (obj5 instanceof v3) {
            ((v3) obj5).s(this.f8073r);
        }
        Object obj6 = this.f8077v;
        if (obj6 instanceof x3) {
            ((x3) obj6).q(this.f8074s);
        }
        Object obj7 = this.f8077v;
        if ((obj7 instanceof androidx.core.view.l0) && fragment == null) {
            ((androidx.core.view.l0) obj7).D(this.f8075t);
        }
    }

    @q0
    public Fragment s0(@q0 String str) {
        return this.f8058c.h(str);
    }

    void s1(int i5, int i6, boolean z5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Bad id: ", i5));
        }
        h0(new q(null, i5, i6), z5);
    }

    void t(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f8058c.a(fragment);
            if (W0(2)) {
                fragment.toString();
            }
            if (X0(fragment)) {
                this.H = true;
            }
        }
    }

    Fragment t0(@androidx.annotation.o0 String str) {
        return this.f8058c.i(str);
    }

    public void t1(@q0 String str, int i5) {
        h0(new q(str, -1, i5), false);
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f8079x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8079x)));
            sb.append("}");
        } else {
            androidx.fragment.app.m<?> mVar = this.f8077v;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f8077v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @androidx.annotation.o0
    public f0 u() {
        return new androidx.fragment.app.a(this);
    }

    public boolean u1() {
        return x1(null, -1, 0);
    }

    boolean v() {
        boolean z5 = false;
        for (Fragment fragment : this.f8058c.m()) {
            if (fragment != null) {
                z5 = X0(fragment);
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    public boolean v1(int i5, int i6) {
        if (i5 >= 0) {
            return x1(null, i5, i6);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Bad id: ", i5));
    }

    public boolean w1(@q0 String str, int i5) {
        return x1(str, -1, i5);
    }

    public void y(@androidx.annotation.o0 String str) {
        h0(new k(str), false);
    }

    int y0() {
        return this.f8058c.k();
    }

    boolean y1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @q0 String str, int i5, int i6) {
        int p02 = p0(str, i5, (i6 & 1) != 0);
        if (p02 < 0) {
            return false;
        }
        for (int size = this.f8059d.size() - 1; size >= p02; size--) {
            arrayList.add(this.f8059d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    boolean z(@androidx.annotation.o0 ArrayList<androidx.fragment.app.a> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        if (J1(arrayList, arrayList2, str)) {
            return y1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    @androidx.annotation.o0
    List<Fragment> z0() {
        return this.f8058c.m();
    }

    public void z1(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str, @androidx.annotation.o0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            d2(new IllegalStateException(androidx.fragment.app.d.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        String f8086o;

        /* renamed from: p, reason: collision with root package name */
        int f8087p;

        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i5) {
                return new LaunchedFragmentInfo[i5];
            }
        }

        LaunchedFragmentInfo(@androidx.annotation.o0 String str, int i5) {
            this.f8086o = str;
            this.f8087p = i5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeString(this.f8086o);
            parcel.writeInt(this.f8087p);
        }

        LaunchedFragmentInfo(@androidx.annotation.o0 Parcel parcel) {
            this.f8086o = parcel.readString();
            this.f8087p = parcel.readInt();
        }
    }
}
