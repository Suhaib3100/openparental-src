package androidx.fragment.app;

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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.IntentSenderRequest;
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
import v1.a;
import w1.c;

/* loaded from: classes3.dex */
public abstract class FragmentManager implements g0 {
    private static boolean X = false;
    public static final int Z = 1;
    private androidx.view.result.h<Intent> D;
    private androidx.view.result.h<IntentSenderRequest> E;
    private androidx.view.result.h<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.b> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private c0 P;
    private c.C1402c Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29781b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.b> f29783d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f29784e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f29786g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<o> f29792m;

    /* renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.o<?> f29801v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.l f29802w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f29803x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.q0
    Fragment f29804y;
    static final String S = "android:support:fragments";
    static final String T = "state";
    static final String U = "result_";
    static final String V = "state";
    static final String W = "fragment_";

    @c1({c1.a.LIBRARY})
    public static final String Y = "FragmentManager";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f29779a0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f29780a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final j0 f29782c = new j0();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.r f29785f = new androidx.fragment.app.r(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.view.c0 f29787h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f29788i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, BackStackState> f29789j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Bundle> f29790k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, n> f29791l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final androidx.fragment.app.s f29793n = new androidx.fragment.app.s(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList<d0> f29794o = new CopyOnWriteArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.util.e<Configuration> f29795p = new androidx.core.util.e() { // from class: androidx.fragment.app.t
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.this.f1((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final androidx.core.util.e<Integer> f29796q = new androidx.core.util.e() { // from class: androidx.fragment.app.u
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.this.g1((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final androidx.core.util.e<androidx.core.app.w> f29797r = new androidx.core.util.e() { // from class: androidx.fragment.app.v
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.this.h1((androidx.core.app.w) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final androidx.core.util.e<androidx.core.app.s0> f29798s = new androidx.core.util.e() { // from class: androidx.fragment.app.w
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.this.i1((androidx.core.app.s0) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final androidx.core.view.t0 f29799t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f29800u = -1;

    /* renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.n f29805z = null;
    private androidx.fragment.app.n A = new d();
    private v0 B = null;
    private v0 C = new e();
    ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    private Runnable R = new f();

    class a implements androidx.view.result.a<Map<String, Boolean>> {
        a() {
        }

        @Override // androidx.view.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f29810b;
            int i5 = pollFirst.f29811c;
            Fragment i6 = FragmentManager.this.f29782c.i(str);
            if (i6 == null) {
                return;
            }
            i6.onRequestPermissionsResult(i5, strArr, iArr);
        }
    }

    class b extends androidx.view.c0 {
        b(boolean z4) {
            super(z4);
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            FragmentManager.this.S0();
        }
    }

    class c implements androidx.core.view.t0 {
        c() {
        }

        @Override // androidx.core.view.t0
        public void a(@androidx.annotation.o0 Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // androidx.core.view.t0
        public void b(@androidx.annotation.o0 Menu menu) {
            FragmentManager.this.W(menu);
        }

        @Override // androidx.core.view.t0
        public boolean c(@androidx.annotation.o0 MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }

        @Override // androidx.core.view.t0
        public void d(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }
    }

    class d extends androidx.fragment.app.n {
        d() {
        }

        @Override // androidx.fragment.app.n
        @androidx.annotation.o0
        public Fragment instantiate(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
            return FragmentManager.this.J0().b(FragmentManager.this.J0().f(), str, null);
        }
    }

    class e implements v0 {
        e() {
        }

        @Override // androidx.fragment.app.v0
        @androidx.annotation.o0
        public u0 a(@androidx.annotation.o0 ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    class g implements d0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f29818b;

        g(Fragment fragment) {
            this.f29818b = fragment;
        }

        @Override // androidx.fragment.app.d0
        public void a(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
            this.f29818b.onAttachFragment(fragment);
        }
    }

    class h implements androidx.view.result.a<ActivityResult> {
        h() {
        }

        @Override // androidx.view.result.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f29810b;
            int i4 = pollFirst.f29811c;
            Fragment i5 = FragmentManager.this.f29782c.i(str);
            if (i5 == null) {
                return;
            }
            i5.onActivityResult(i4, activityResult.b(), activityResult.a());
        }
    }

    class i implements androidx.view.result.a<ActivityResult> {
        i() {
        }

        @Override // androidx.view.result.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f29810b;
            int i4 = pollFirst.f29811c;
            Fragment i5 = FragmentManager.this.f29782c.i(str);
            if (i5 == null) {
                return;
            }
            i5.onActivityResult(i4, activityResult.b(), activityResult.a());
        }
    }

    public interface j {
        int a();

        @androidx.annotation.q0
        @Deprecated
        CharSequence c();

        @g1
        @Deprecated
        int d();

        @g1
        @Deprecated
        int e();

        @androidx.annotation.q0
        @Deprecated
        CharSequence f();

        @androidx.annotation.q0
        String getName();
    }

    private class k implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f29822a;

        k(@androidx.annotation.o0 String str) {
            this.f29822a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.f29822a);
        }
    }

    static class l extends b.a<IntentSenderRequest, ActivityResult> {
        l() {
        }

        @Override // b.a
        @androidx.annotation.o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@androidx.annotation.o0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
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
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i4, @androidx.annotation.q0 Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void a(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle) {
        }

        public void b(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Context context) {
        }

        public void c(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle) {
        }

        public void d(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void e(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void f(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void g(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Context context) {
        }

        public void h(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 Bundle bundle) {
        }

        public void i(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void j(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Bundle bundle) {
        }

        public void k(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void l(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }

        public void m(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 View view, @androidx.annotation.q0 Bundle bundle) {
        }

        public void n(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
        }
    }

    private static class n implements f0 {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1450w f29824a;

        /* renamed from: b, reason: collision with root package name */
        private final f0 f29825b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1416b0 f29826c;

        n(@androidx.annotation.o0 AbstractC1450w abstractC1450w, @androidx.annotation.o0 f0 f0Var, @androidx.annotation.o0 InterfaceC1416b0 interfaceC1416b0) {
            this.f29824a = abstractC1450w;
            this.f29825b = f0Var;
            this.f29826c = interfaceC1416b0;
        }

        @Override // androidx.fragment.app.f0
        public void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 Bundle bundle) {
            this.f29825b.a(str, bundle);
        }

        public boolean b(AbstractC1450w.b bVar) {
            return this.f29824a.getState().isAtLeast(bVar);
        }

        public void c() {
            this.f29824a.d(this.f29826c);
        }
    }

    public interface o {
        @androidx.annotation.l0
        void a();
    }

    interface p {
        boolean b(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2);
    }

    private class q implements p {

        /* renamed from: a, reason: collision with root package name */
        final String f29827a;

        /* renamed from: b, reason: collision with root package name */
        final int f29828b;

        /* renamed from: c, reason: collision with root package name */
        final int f29829c;

        q(@androidx.annotation.q0 String str, int i4, int i5) {
            this.f29827a = str;
            this.f29828b = i4;
            this.f29829c = i5;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f29804y;
            if (fragment == null || this.f29828b >= 0 || this.f29827a != null || !fragment.getChildFragmentManager().v1()) {
                return FragmentManager.this.z1(arrayList, arrayList2, this.f29827a, this.f29828b, this.f29829c);
            }
            return false;
        }
    }

    private class r implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f29831a;

        r(@androidx.annotation.o0 String str) {
            this.f29831a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.K1(arrayList, arrayList2, this.f29831a);
        }
    }

    private class s implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f29833a;

        s(@androidx.annotation.o0 String str) {
            this.f29833a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public boolean b(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.S1(arrayList, arrayList2, this.f29833a);
        }
    }

    private void A() {
        androidx.fragment.app.o<?> oVar = this.f29801v;
        if (oVar instanceof o1 ? this.f29782c.q().l() : oVar.f() instanceof Activity ? !((Activity) this.f29801v.f()).isChangingConfigurations() : true) {
            Iterator<BackStackState> it = this.f29789j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f29730b.iterator();
                while (it2.hasNext()) {
                    this.f29782c.q().d(it2.next());
                }
            }
        }
    }

    private Set<u0> B() {
        HashSet hashSet = new HashSet();
        Iterator<h0> it = this.f29782c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(u0.o(viewGroup, O0()));
            }
        }
        return hashSet;
    }

    private Set<u0> C(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator<l0.a> it = arrayList.get(i4).f29993c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f30011b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(u0.n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    @androidx.annotation.o0
    private c0 C0(@androidx.annotation.o0 Fragment fragment) {
        return this.P.g(fragment);
    }

    private ViewGroup F0(@androidx.annotation.o0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f29802w.d()) {
            View c5 = this.f29802w.c(fragment.mContainerId);
            if (c5 instanceof ViewGroup) {
                return (ViewGroup) c5;
            }
        }
        return null;
    }

    private void F1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!arrayList.get(i4).f30008r) {
                if (i5 != i4) {
                    m0(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (arrayList2.get(i4).booleanValue()) {
                    while (i5 < size && arrayList2.get(i5).booleanValue() && !arrayList.get(i5).f30008r) {
                        i5++;
                    }
                }
                m0(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            m0(arrayList, arrayList2, i5, size);
        }
    }

    private void H1() {
        if (this.f29792m != null) {
            for (int i4 = 0; i4 < this.f29792m.size(); i4++) {
                this.f29792m.get(i4).a();
            }
        }
    }

    static int O1(int i4) {
        int i5 = l0.I;
        if (i4 == 4097) {
            return 8194;
        }
        if (i4 != 8194) {
            i5 = l0.M;
            if (i4 == 8197) {
                return l0.L;
            }
            if (i4 == 4099) {
                return l0.K;
            }
            if (i4 != 4100) {
                return 0;
            }
        }
        return i5;
    }

    @androidx.annotation.q0
    static Fragment Q0(@androidx.annotation.o0 View view) {
        Object tag = view.getTag(a.c.f92819a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void T(@androidx.annotation.q0 Fragment fragment) {
        if (fragment == null || !fragment.equals(o0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    @c1({c1.a.LIBRARY})
    public static boolean W0(int i4) {
        return X || Log.isLoggable("FragmentManager", i4);
    }

    private boolean X0(@androidx.annotation.o0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.v();
    }

    private boolean Y0() {
        Fragment fragment = this.f29803x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f29803x.getParentFragmentManager().Y0();
    }

    private void a0(int i4) {
        try {
            this.f29781b = true;
            this.f29782c.d(i4);
            m1(i4, false);
            Iterator<u0> it = B().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.f29781b = false;
            j0(true);
        } catch (Throwable th) {
            this.f29781b = false;
            throw th;
        }
    }

    private void b2(@androidx.annotation.o0 Fragment fragment) {
        ViewGroup F0 = F0(fragment);
        if (F0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i4 = a.c.f92821c;
        if (F0.getTag(i4) == null) {
            F0.setTag(i4, fragment);
        }
        ((Fragment) F0.getTag(i4)).setPopDirection(fragment.getPopDirection());
    }

    private void d0() {
        if (this.L) {
            this.L = false;
            d2();
        }
    }

    private void d2() {
        Iterator<h0> it = this.f29782c.l().iterator();
        while (it.hasNext()) {
            q1(it.next());
        }
    }

    private void e2(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new t0("FragmentManager"));
        androidx.fragment.app.o<?> oVar = this.f29801v;
        try {
            if (oVar != null) {
                oVar.h("  ", null, printWriter, new String[0]);
            } else {
                e0("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    @Deprecated
    public static void f0(boolean z4) {
        X = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(Configuration configuration) {
        if (Y0()) {
            H(configuration, false);
        }
    }

    private void g0() {
        Iterator<u0> it = B().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(Integer num) {
        if (Y0() && num.intValue() == 80) {
            N(false);
        }
    }

    private void g2() {
        synchronized (this.f29780a) {
            try {
                if (this.f29780a.isEmpty()) {
                    this.f29787h.setEnabled(B0() > 0 && b1(this.f29803x));
                } else {
                    this.f29787h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(androidx.core.app.w wVar) {
        if (Y0()) {
            O(wVar.getIsInMultiWindowMode(), false);
        }
    }

    private void i0(boolean z4) {
        if (this.f29781b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f29801v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f29801v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4) {
            w();
        }
        if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(androidx.core.app.s0 s0Var) {
        if (Y0()) {
            V(s0Var.getIsInPictureInPictureMode(), false);
        }
    }

    private static void l0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, int i4, int i5) {
        while (i4 < i5) {
            androidx.fragment.app.b bVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                bVar.V(-1);
                bVar.b0();
            } else {
                bVar.V(1);
                bVar.a0();
            }
            i4++;
        }
    }

    private void m0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, int i4, int i5) {
        boolean z4 = arrayList.get(i4).f30008r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f29782c.p());
        Fragment N0 = N0();
        boolean z5 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            androidx.fragment.app.b bVar = arrayList.get(i6);
            N0 = !arrayList2.get(i6).booleanValue() ? bVar.c0(this.O, N0) : bVar.e0(this.O, N0);
            z5 = z5 || bVar.f29999i;
        }
        this.O.clear();
        if (!z4 && this.f29800u >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                Iterator<l0.a> it = arrayList.get(i7).f29993c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f30011b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f29782c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i4, i5);
        boolean booleanValue = arrayList2.get(i5 - 1).booleanValue();
        for (int i10 = i4; i10 < i5; i10++) {
            androidx.fragment.app.b bVar2 = arrayList.get(i10);
            if (booleanValue) {
                for (int size = bVar2.f29993c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = bVar2.f29993c.get(size).f30011b;
                    if (fragment2 != null) {
                        D(fragment2).m();
                    }
                }
            } else {
                Iterator<l0.a> it2 = bVar2.f29993c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f30011b;
                    if (fragment3 != null) {
                        D(fragment3).m();
                    }
                }
            }
        }
        m1(this.f29800u, true);
        for (u0 u0Var : C(arrayList, i4, i5)) {
            u0Var.r(booleanValue);
            u0Var.p();
            u0Var.g();
        }
        while (i4 < i5) {
            androidx.fragment.app.b bVar3 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && bVar3.P >= 0) {
                bVar3.P = -1;
            }
            bVar3.d0();
            i4++;
        }
        if (z5) {
            H1();
        }
    }

    private int p0(@androidx.annotation.q0 String str, int i4, boolean z4) {
        ArrayList<androidx.fragment.app.b> arrayList = this.f29783d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i4 < 0) {
            if (z4) {
                return 0;
            }
            return this.f29783d.size() - 1;
        }
        int size = this.f29783d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.b bVar = this.f29783d.get(size);
            if ((str != null && str.equals(bVar.f30001k)) || (i4 >= 0 && i4 == bVar.P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z4) {
            if (size == this.f29783d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.b bVar2 = this.f29783d.get(size - 1);
            if ((str == null || !str.equals(bVar2.f30001k)) && (i4 < 0 || i4 != bVar2.P)) {
                return size;
            }
            size--;
        }
        return size;
    }

    @androidx.annotation.o0
    public static <F extends Fragment> F q0(@androidx.annotation.o0 View view) {
        F f4 = (F) v0(view);
        if (f4 != null) {
            return f4;
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
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @androidx.annotation.q0
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
        if (d1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void w0() {
        Iterator<u0> it = B().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private void x() {
        this.f29781b = false;
        this.N.clear();
        this.M.clear();
    }

    private boolean x0(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f29780a) {
            if (this.f29780a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f29780a.size();
                boolean z4 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    z4 |= this.f29780a.get(i4).b(arrayList, arrayList2);
                }
                return z4;
            } finally {
                this.f29780a.clear();
                this.f29801v.g().removeCallbacks(this.R);
            }
        }
    }

    private boolean y1(@androidx.annotation.q0 String str, int i4, int i5) {
        j0(false);
        i0(true);
        Fragment fragment = this.f29804y;
        if (fragment != null && i4 < 0 && str == null && fragment.getChildFragmentManager().v1()) {
            return true;
        }
        boolean z12 = z1(this.M, this.N, str, i4, i5);
        if (z12) {
            this.f29781b = true;
            try {
                F1(this.M, this.N);
            } finally {
                x();
            }
        }
        g2();
        d0();
        this.f29782c.b();
        return z12;
    }

    @androidx.annotation.o0
    public j A0(int i4) {
        return this.f29783d.get(i4);
    }

    public void A1(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str, @androidx.annotation.o0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            e2(new IllegalStateException(androidx.fragment.app.f.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public int B0() {
        ArrayList<androidx.fragment.app.b> arrayList = this.f29783d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void B1(@androidx.annotation.o0 m mVar, boolean z4) {
        this.f29793n.o(mVar, z4);
    }

    void C1(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
            int i4 = fragment.mBackStackNesting;
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        this.f29782c.v(fragment);
        if (X0(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        b2(fragment);
    }

    @androidx.annotation.o0
    h0 D(@androidx.annotation.o0 Fragment fragment) {
        h0 o4 = this.f29782c.o(fragment.mWho);
        if (o4 != null) {
            return o4;
        }
        h0 h0Var = new h0(this.f29793n, this.f29782c, fragment);
        h0Var.o(this.f29801v.f().getClassLoader());
        h0Var.u(this.f29800u);
        return h0Var;
    }

    @androidx.annotation.o0
    androidx.fragment.app.l D0() {
        return this.f29802w;
    }

    public void D1(@androidx.annotation.o0 d0 d0Var) {
        this.f29794o.remove(d0Var);
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
            this.f29782c.v(fragment);
            if (X0(fragment)) {
                this.H = true;
            }
            b2(fragment);
        }
    }

    @androidx.annotation.q0
    public Fragment E0(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o02 = o0(string);
        if (o02 == null) {
            e2(new IllegalStateException(y.a("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return o02;
    }

    public void E1(@androidx.annotation.o0 o oVar) {
        ArrayList<o> arrayList = this.f29792m;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    void F() {
        this.I = false;
        this.J = false;
        this.P.o(false);
        a0(4);
    }

    void G() {
        this.I = false;
        this.J = false;
        this.P.o(false);
        a0(0);
    }

    @androidx.annotation.o0
    public androidx.fragment.app.n G0() {
        androidx.fragment.app.n nVar = this.f29805z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f29803x;
        return fragment != null ? fragment.mFragmentManager.G0() : this.A;
    }

    void G1(@androidx.annotation.o0 Fragment fragment) {
        this.P.m(fragment);
    }

    void H(@androidx.annotation.o0 Configuration configuration, boolean z4) {
        if (z4 && (this.f29801v instanceof androidx.core.content.c0)) {
            e2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z4) {
                    fragment.mChildFragmentManager.H(configuration, true);
                }
            }
        }
    }

    @androidx.annotation.o0
    j0 H0() {
        return this.f29782c;
    }

    boolean I(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.f29800u < 1) {
            return false;
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.o0
    public List<Fragment> I0() {
        return this.f29782c.p();
    }

    void I1(@androidx.annotation.q0 Parcelable parcelable, @androidx.annotation.q0 b0 b0Var) {
        if (this.f29801v instanceof o1) {
            e2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.n(b0Var);
        M1(parcelable);
    }

    void J() {
        this.I = false;
        this.J = false;
        this.P.o(false);
        a0(1);
    }

    @c1({c1.a.LIBRARY})
    @androidx.annotation.o0
    public androidx.fragment.app.o<?> J0() {
        return this.f29801v;
    }

    public void J1(@androidx.annotation.o0 String str) {
        h0(new r(str), false);
    }

    boolean K(@androidx.annotation.o0 Menu menu, @androidx.annotation.o0 MenuInflater menuInflater) {
        if (this.f29800u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z4 = false;
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null && a1(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z4 = true;
            }
        }
        if (this.f29784e != null) {
            for (int i4 = 0; i4 < this.f29784e.size(); i4++) {
                Fragment fragment2 = this.f29784e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f29784e = arrayList;
        return z4;
    }

    @androidx.annotation.o0
    LayoutInflater.Factory2 K0() {
        return this.f29785f;
    }

    boolean K1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        BackStackState remove = this.f29789j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.b> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.b next = it.next();
            if (next.Q) {
                Iterator<l0.a> it2 = next.f29993c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f30011b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.b> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z4 = false;
            while (it3.hasNext()) {
                if (it3.next().b(arrayList, arrayList2) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    void L() {
        this.K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        Object obj = this.f29801v;
        if (obj instanceof androidx.core.content.d0) {
            ((androidx.core.content.d0) obj).removeOnTrimMemoryListener(this.f29796q);
        }
        Object obj2 = this.f29801v;
        if (obj2 instanceof androidx.core.content.c0) {
            ((androidx.core.content.c0) obj2).removeOnConfigurationChangedListener(this.f29795p);
        }
        Object obj3 = this.f29801v;
        if (obj3 instanceof androidx.core.app.l0) {
            ((androidx.core.app.l0) obj3).removeOnMultiWindowModeChangedListener(this.f29797r);
        }
        Object obj4 = this.f29801v;
        if (obj4 instanceof androidx.core.app.n0) {
            ((androidx.core.app.n0) obj4).removeOnPictureInPictureModeChangedListener(this.f29798s);
        }
        Object obj5 = this.f29801v;
        if ((obj5 instanceof androidx.core.view.n0) && this.f29803x == null) {
            ((androidx.core.view.n0) obj5).removeMenuProvider(this.f29799t);
        }
        this.f29801v = null;
        this.f29802w = null;
        this.f29803x = null;
        if (this.f29786g != null) {
            this.f29787h.remove();
            this.f29786g = null;
        }
        androidx.view.result.h<Intent> hVar = this.D;
        if (hVar != null) {
            hVar.d();
            this.E.d();
            this.F.d();
        }
    }

    @androidx.annotation.o0
    androidx.fragment.app.s L0() {
        return this.f29793n;
    }

    void L1(@androidx.annotation.q0 Parcelable parcelable) {
        if (this.f29801v instanceof InterfaceC1461e) {
            e2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        M1(parcelable);
    }

    void M() {
        a0(1);
    }

    @androidx.annotation.q0
    Fragment M0() {
        return this.f29803x;
    }

    void M1(@androidx.annotation.q0 Parcelable parcelable) {
        h0 h0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f29801v.f().getClassLoader());
                this.f29790k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f29801v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f29782c.y(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f29782c.w();
        Iterator<String> it = fragmentManagerState.f29835b.iterator();
        while (it.hasNext()) {
            FragmentState C = this.f29782c.C(it.next(), null);
            if (C != null) {
                Fragment f4 = this.P.f(C.f29844c);
                if (f4 != null) {
                    if (W0(2)) {
                        f4.toString();
                    }
                    h0Var = new h0(this.f29793n, this.f29782c, f4, C);
                } else {
                    h0Var = new h0(this.f29793n, this.f29782c, this.f29801v.f().getClassLoader(), G0(), C);
                }
                Fragment k4 = h0Var.k();
                k4.mFragmentManager = this;
                if (W0(2)) {
                    k4.toString();
                }
                h0Var.o(this.f29801v.f().getClassLoader());
                this.f29782c.s(h0Var);
                h0Var.u(this.f29800u);
            }
        }
        for (Fragment fragment : this.P.i()) {
            if (!this.f29782c.c(fragment.mWho)) {
                if (W0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f29835b);
                }
                this.P.m(fragment);
                fragment.mFragmentManager = this;
                h0 h0Var2 = new h0(this.f29793n, this.f29782c, fragment);
                h0Var2.u(1);
                h0Var2.m();
                fragment.mRemoving = true;
                h0Var2.m();
            }
        }
        this.f29782c.x(fragmentManagerState.f29836c);
        if (fragmentManagerState.f29837d != null) {
            this.f29783d = new ArrayList<>(fragmentManagerState.f29837d.length);
            int i4 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f29837d;
                if (i4 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.b b5 = backStackRecordStateArr[i4].b(this);
                if (W0(2)) {
                    int i5 = b5.P;
                    b5.toString();
                    PrintWriter printWriter = new PrintWriter(new t0("FragmentManager"));
                    b5.Z("  ", printWriter, false);
                    printWriter.close();
                }
                this.f29783d.add(b5);
                i4++;
            }
        } else {
            this.f29783d = null;
        }
        this.f29788i.set(fragmentManagerState.f29838e);
        String str3 = fragmentManagerState.f29839f;
        if (str3 != null) {
            Fragment o02 = o0(str3);
            this.f29804y = o02;
            T(o02);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f29840g;
        if (arrayList2 != null) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                this.f29789j.put(arrayList2.get(i6), fragmentManagerState.f29841h.get(i6));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.f29842i);
    }

    void N(boolean z4) {
        if (z4 && (this.f29801v instanceof androidx.core.content.d0)) {
            e2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z4) {
                    fragment.mChildFragmentManager.N(true);
                }
            }
        }
    }

    @androidx.annotation.q0
    public Fragment N0() {
        return this.f29804y;
    }

    @Deprecated
    b0 N1() {
        if (this.f29801v instanceof o1) {
            e2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.j();
    }

    void O(boolean z4, boolean z5) {
        if (z5 && (this.f29801v instanceof androidx.core.app.l0)) {
            e2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.O(z4, true);
                }
            }
        }
    }

    @androidx.annotation.o0
    v0 O0() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var;
        }
        Fragment fragment = this.f29803x;
        return fragment != null ? fragment.mFragmentManager.O0() : this.C;
    }

    void P(@androidx.annotation.o0 Fragment fragment) {
        Iterator<d0> it = this.f29794o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @androidx.annotation.q0
    public c.C1402c P0() {
        return this.Q;
    }

    Parcelable P1() {
        if (this.f29801v instanceof InterfaceC1461e) {
            e2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle e12 = e1();
        if (e12.isEmpty()) {
            return null;
        }
        return e12;
    }

    void Q() {
        for (Fragment fragment : this.f29782c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.o0
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public Bundle e1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.I = true;
        this.P.o(true);
        ArrayList<String> z4 = this.f29782c.z();
        ArrayList<FragmentState> n4 = this.f29782c.n();
        if (n4.isEmpty()) {
            W0(2);
        } else {
            ArrayList<String> A = this.f29782c.A();
            ArrayList<androidx.fragment.app.b> arrayList = this.f29783d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i4 = 0; i4 < size; i4++) {
                    backStackRecordStateArr[i4] = new BackStackRecordState(this.f29783d.get(i4));
                    if (W0(2)) {
                        Objects.toString(this.f29783d.get(i4));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f29835b = z4;
            fragmentManagerState.f29836c = A;
            fragmentManagerState.f29837d = backStackRecordStateArr;
            fragmentManagerState.f29838e = this.f29788i.get();
            Fragment fragment = this.f29804y;
            if (fragment != null) {
                fragmentManagerState.f29839f = fragment.mWho;
            }
            fragmentManagerState.f29840g.addAll(this.f29789j.keySet());
            fragmentManagerState.f29841h.addAll(this.f29789j.values());
            fragmentManagerState.f29842i = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f29790k.keySet()) {
                bundle.putBundle(androidx.constraintlayout.core.motion.key.c.a("result_", str), this.f29790k.get(str));
            }
            Iterator<FragmentState> it = n4.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.f29844c, bundle2);
            }
        }
        return bundle;
    }

    boolean R(@androidx.annotation.o0 MenuItem menuItem) {
        if (this.f29800u < 1) {
            return false;
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.o0
    n1 R0(@androidx.annotation.o0 Fragment fragment) {
        return this.P.k(fragment);
    }

    public void R1(@androidx.annotation.o0 String str) {
        h0(new s(str), false);
    }

    void S(@androidx.annotation.o0 Menu menu) {
        if (this.f29800u < 1) {
            return;
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void S0() {
        j0(true);
        if (this.f29787h.getIsEnabled()) {
            v1();
        } else {
            this.f29786g.p();
        }
    }

    boolean S1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        int i4;
        int p02 = p0(str, -1, true);
        if (p02 < 0) {
            return false;
        }
        for (int i5 = p02; i5 < this.f29783d.size(); i5++) {
            androidx.fragment.app.b bVar = this.f29783d.get(i5);
            if (!bVar.f30008r) {
                e2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + bVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i6 = p02; i6 < this.f29783d.size(); i6++) {
            androidx.fragment.app.b bVar2 = this.f29783d.get(i6);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<l0.a> it = bVar2.f29993c.iterator();
            while (it.hasNext()) {
                l0.a next = it.next();
                Fragment fragment = next.f30011b;
                if (fragment != null) {
                    if (!next.f30012c || (i4 = next.f30010a) == 1 || i4 == 2 || i4 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i7 = next.f30010a;
                    if (i7 == 1 || i7 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder a5 = androidx.appcompat.view.g.a("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                a5.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                a5.append(" in ");
                a5.append(bVar2);
                a5.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                e2(new IllegalArgumentException(a5.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder a6 = androidx.appcompat.view.g.a("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                a6.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                a6.append("fragment ");
                a6.append(fragment2);
                e2(new IllegalArgumentException(a6.toString()));
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
        ArrayList arrayList4 = new ArrayList(this.f29783d.size() - p02);
        for (int i10 = p02; i10 < this.f29783d.size(); i10++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f29783d.size() - 1; size >= p02; size--) {
            androidx.fragment.app.b remove = this.f29783d.remove(size);
            androidx.fragment.app.b bVar3 = new androidx.fragment.app.b(remove);
            bVar3.W();
            arrayList4.set(size - p02, new BackStackRecordState(bVar3));
            remove.Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f29789j.put(str, backStackState);
        return true;
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
        b2(fragment);
    }

    @androidx.annotation.q0
    public Fragment.SavedState T1(@androidx.annotation.o0 Fragment fragment) {
        h0 o4 = this.f29782c.o(fragment.mWho);
        if (o4 == null || !o4.k().equals(fragment)) {
            e2(new IllegalStateException(androidx.fragment.app.f.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        return o4.r();
    }

    void U() {
        a0(5);
    }

    void U0(@androidx.annotation.o0 Fragment fragment) {
        if (fragment.mAdded && X0(fragment)) {
            this.H = true;
        }
    }

    void U1() {
        synchronized (this.f29780a) {
            try {
                if (this.f29780a.size() == 1) {
                    this.f29801v.g().removeCallbacks(this.R);
                    this.f29801v.g().post(this.R);
                    g2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void V(boolean z4, boolean z5) {
        if (z5 && (this.f29801v instanceof androidx.core.app.n0)) {
            e2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.V(z4, true);
                }
            }
        }
    }

    public boolean V0() {
        return this.K;
    }

    void V1(@androidx.annotation.o0 Fragment fragment, boolean z4) {
        ViewGroup F0 = F0(fragment);
        if (F0 == null || !(F0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) F0).c(!z4);
    }

    boolean W(@androidx.annotation.o0 Menu menu) {
        boolean z4 = false;
        if (this.f29800u < 1) {
            return false;
        }
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null && a1(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    public void W1(@androidx.annotation.o0 androidx.fragment.app.n nVar) {
        this.f29805z = nVar;
    }

    void X() {
        g2();
        T(this.f29804y);
    }

    void X1(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 AbstractC1450w.b bVar) {
        if (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void Y() {
        this.I = false;
        this.J = false;
        this.P.o(false);
        a0(7);
    }

    void Y1(@androidx.annotation.q0 Fragment fragment) {
        if (fragment == null || (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f29804y;
            this.f29804y = fragment;
            T(fragment2);
            T(this.f29804y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void Z() {
        this.I = false;
        this.J = false;
        this.P.o(false);
        a0(5);
    }

    boolean Z0(@androidx.annotation.q0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void Z1(@androidx.annotation.o0 v0 v0Var) {
        this.B = v0Var;
    }

    @Override // androidx.fragment.app.g0
    public final void a(@androidx.annotation.o0 String str, @androidx.annotation.o0 Bundle bundle) {
        n nVar = this.f29791l.get(str);
        if (nVar == null || !nVar.b(AbstractC1450w.b.STARTED)) {
            this.f29790k.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (W0(2)) {
            Objects.toString(bundle);
        }
    }

    boolean a1(@androidx.annotation.q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void a2(@androidx.annotation.q0 c.C1402c c1402c) {
        this.Q = c1402c;
    }

    @Override // androidx.fragment.app.g0
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@androidx.annotation.o0 final String str, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 final f0 f0Var) {
        final AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
            return;
        }
        InterfaceC1416b0 interfaceC1416b0 = new InterfaceC1416b0() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.view.InterfaceC1416b0
            public void f(@androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e02, @androidx.annotation.o0 AbstractC1450w.a aVar) {
                Bundle bundle;
                if (aVar == AbstractC1450w.a.ON_START && (bundle = (Bundle) FragmentManager.this.f29790k.get(str)) != null) {
                    f0Var.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (aVar == AbstractC1450w.a.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f29791l.remove(str);
                }
            }
        };
        n put = this.f29791l.put(str, new n(lifecycle, f0Var, interfaceC1416b0));
        if (put != null) {
            put.c();
        }
        if (W0(2)) {
            lifecycle.toString();
            Objects.toString(f0Var);
        }
        lifecycle.a(interfaceC1416b0);
    }

    void b0() {
        this.J = true;
        this.P.o(true);
        a0(4);
    }

    boolean b1(@androidx.annotation.q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.N0()) && b1(fragmentManager.f29803x);
    }

    @Override // androidx.fragment.app.g0
    public final void c(@androidx.annotation.o0 String str) {
        n remove = this.f29791l.remove(str);
        if (remove != null) {
            remove.c();
        }
        W0(2);
    }

    void c0() {
        a0(2);
    }

    boolean c1(int i4) {
        return this.f29800u >= i4;
    }

    void c2(@androidx.annotation.o0 Fragment fragment) {
        if (W0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void d(@androidx.annotation.o0 String str) {
        this.f29790k.remove(str);
        W0(2);
    }

    public boolean d1() {
        return this.I || this.J;
    }

    public void e0(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
        int size;
        int size2;
        String a5 = androidx.compose.runtime.changelist.j.a(str, "    ");
        this.f29782c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f29784e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                Fragment fragment = this.f29784e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.b> arrayList2 = this.f29783d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                androidx.fragment.app.b bVar = this.f29783d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.Z(a5, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f29788i.get());
        synchronized (this.f29780a) {
            try {
                int size3 = this.f29780a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size3; i6++) {
                        p pVar = this.f29780a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f29801v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f29802w);
        if (this.f29803x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f29803x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f29800u);
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

    public void f2(@androidx.annotation.o0 m mVar) {
        this.f29793n.p(mVar);
    }

    void h0(@androidx.annotation.o0 p pVar, boolean z4) {
        if (!z4) {
            if (this.f29801v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            w();
        }
        synchronized (this.f29780a) {
            try {
                if (this.f29801v == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f29780a.add(pVar);
                    U1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean j0(boolean z4) {
        i0(z4);
        boolean z5 = false;
        while (x0(this.M, this.N)) {
            z5 = true;
            this.f29781b = true;
            try {
                F1(this.M, this.N);
            } finally {
                x();
            }
        }
        g2();
        d0();
        this.f29782c.b();
        return z5;
    }

    void j1(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 String[] strArr, int i4) {
        if (this.F == null) {
            this.f29801v.m(fragment, strArr, i4);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        this.F.b(strArr);
    }

    void k0(@androidx.annotation.o0 p pVar, boolean z4) {
        if (z4 && (this.f29801v == null || this.K)) {
            return;
        }
        i0(z4);
        if (pVar.b(this.M, this.N)) {
            this.f29781b = true;
            try {
                F1(this.M, this.N);
            } finally {
                x();
            }
        }
        g2();
        d0();
        this.f29782c.b();
    }

    void k1(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        if (this.D == null) {
            this.f29801v.q(fragment, intent, i4, bundle);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.b(intent);
    }

    void l1(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E == null) {
            this.f29801v.r(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
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
        IntentSenderRequest a5 = new IntentSenderRequest.a(intentSender).b(intent2).c(i6, i5).a();
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (W0(2)) {
            fragment.toString();
        }
        this.E.b(a5);
    }

    void m(androidx.fragment.app.b bVar) {
        if (this.f29783d == null) {
            this.f29783d = new ArrayList<>();
        }
        this.f29783d.add(bVar);
    }

    void m1(int i4, boolean z4) {
        androidx.fragment.app.o<?> oVar;
        if (this.f29801v == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i4 != this.f29800u) {
            this.f29800u = i4;
            this.f29782c.u();
            d2();
            if (this.H && (oVar = this.f29801v) != null && this.f29800u == 7) {
                oVar.s();
                this.H = false;
            }
        }
    }

    h0 n(@androidx.annotation.o0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            w1.c.i(fragment, str);
        }
        if (W0(2)) {
            fragment.toString();
        }
        h0 D = D(fragment);
        fragment.mFragmentManager = this;
        this.f29782c.s(D);
        if (!fragment.mDetached) {
            this.f29782c.a(fragment);
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

    void n1() {
        if (this.f29801v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.o(false);
        for (Fragment fragment : this.f29782c.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void o(@androidx.annotation.o0 d0 d0Var) {
        this.f29794o.add(d0Var);
    }

    @androidx.annotation.q0
    Fragment o0(@androidx.annotation.o0 String str) {
        return this.f29782c.f(str);
    }

    void o1(@androidx.annotation.o0 FragmentContainerView fragmentContainerView) {
        View view;
        for (h0 h0Var : this.f29782c.l()) {
            Fragment k4 = h0Var.k();
            if (k4.mContainerId == fragmentContainerView.getId() && (view = k4.mView) != null && view.getParent() == null) {
                k4.mContainer = fragmentContainerView;
                h0Var.b();
            }
        }
    }

    public void p(@androidx.annotation.o0 o oVar) {
        if (this.f29792m == null) {
            this.f29792m = new ArrayList<>();
        }
        this.f29792m.add(oVar);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @Deprecated
    public l0 p1() {
        return u();
    }

    void q(@androidx.annotation.o0 Fragment fragment) {
        this.P.b(fragment);
    }

    void q1(@androidx.annotation.o0 h0 h0Var) {
        Fragment k4 = h0Var.k();
        if (k4.mDeferStart) {
            if (this.f29781b) {
                this.L = true;
            } else {
                k4.mDeferStart = false;
                h0Var.m();
            }
        }
    }

    int r() {
        return this.f29788i.getAndIncrement();
    }

    @androidx.annotation.q0
    public Fragment r0(@androidx.annotation.d0 int i4) {
        return this.f29782c.g(i4);
    }

    public void r1() {
        h0(new q(null, -1, 0), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void s(@androidx.annotation.o0 androidx.fragment.app.o<?> oVar, @androidx.annotation.o0 androidx.fragment.app.l lVar, @androidx.annotation.q0 Fragment fragment) {
        if (this.f29801v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f29801v = oVar;
        this.f29802w = lVar;
        this.f29803x = fragment;
        if (fragment != null) {
            o(new g(fragment));
        } else if (oVar instanceof d0) {
            o((d0) oVar);
        }
        if (this.f29803x != null) {
            g2();
        }
        if (oVar instanceof androidx.view.f0) {
            androidx.view.f0 f0Var = (androidx.view.f0) oVar;
            OnBackPressedDispatcher onBackPressedDispatcher = f0Var.getOnBackPressedDispatcher();
            this.f29786g = onBackPressedDispatcher;
            InterfaceC1423e0 interfaceC1423e0 = f0Var;
            if (fragment != null) {
                interfaceC1423e0 = fragment;
            }
            onBackPressedDispatcher.i(interfaceC1423e0, this.f29787h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.P.g(fragment);
        } else if (oVar instanceof o1) {
            this.P = c0.h(((o1) oVar).getViewModelStore());
        } else {
            this.P = new c0(false);
        }
        this.P.o(d1());
        this.f29782c.B(this.P);
        Object obj = this.f29801v;
        if ((obj instanceof InterfaceC1461e) && fragment == null) {
            C1459c savedStateRegistry = ((InterfaceC1461e) obj).getSavedStateRegistry();
            savedStateRegistry.j("android:support:fragments", new C1459c.InterfaceC0615c() { // from class: androidx.fragment.app.x
                @Override // androidx.view.C1459c.InterfaceC0615c
                public final Bundle a() {
                    Bundle e12;
                    e12 = FragmentManager.this.e1();
                    return e12;
                }
            });
            Bundle b5 = savedStateRegistry.b("android:support:fragments");
            if (b5 != null) {
                M1(b5);
            }
        }
        Object obj2 = this.f29801v;
        if (obj2 instanceof androidx.view.result.j) {
            ActivityResultRegistry activityResultRegistry = ((androidx.view.result.j) obj2).getActivityResultRegistry();
            String a5 = androidx.constraintlayout.core.motion.key.c.a("FragmentManager:", fragment != null ? android.support.v4.media.c.a(new StringBuilder(), fragment.mWho, ":") : "");
            this.D = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(a5, "StartActivityForResult"), new b.m(), new h());
            this.E = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(a5, "StartIntentSenderForResult"), new l(), new i());
            this.F = activityResultRegistry.j(androidx.compose.runtime.changelist.j.a(a5, "RequestPermissions"), new b.k(), new a());
        }
        Object obj3 = this.f29801v;
        if (obj3 instanceof androidx.core.content.c0) {
            ((androidx.core.content.c0) obj3).addOnConfigurationChangedListener(this.f29795p);
        }
        Object obj4 = this.f29801v;
        if (obj4 instanceof androidx.core.content.d0) {
            ((androidx.core.content.d0) obj4).addOnTrimMemoryListener(this.f29796q);
        }
        Object obj5 = this.f29801v;
        if (obj5 instanceof androidx.core.app.l0) {
            ((androidx.core.app.l0) obj5).addOnMultiWindowModeChangedListener(this.f29797r);
        }
        Object obj6 = this.f29801v;
        if (obj6 instanceof androidx.core.app.n0) {
            ((androidx.core.app.n0) obj6).addOnPictureInPictureModeChangedListener(this.f29798s);
        }
        Object obj7 = this.f29801v;
        if ((obj7 instanceof androidx.core.view.n0) && fragment == null) {
            ((androidx.core.view.n0) obj7).addMenuProvider(this.f29799t);
        }
    }

    @androidx.annotation.q0
    public Fragment s0(@androidx.annotation.q0 String str) {
        return this.f29782c.h(str);
    }

    public void s1(int i4, int i5) {
        t1(i4, i5, false);
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
            this.f29782c.a(fragment);
            if (W0(2)) {
                fragment.toString();
            }
            if (X0(fragment)) {
                this.H = true;
            }
        }
    }

    Fragment t0(@androidx.annotation.o0 String str) {
        return this.f29782c.i(str);
    }

    void t1(int i4, int i5, boolean z4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Bad id: ", i4));
        }
        h0(new q(null, i4, i5), z4);
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, "FragmentManager{");
        a5.append(Integer.toHexString(System.identityHashCode(this)));
        a5.append(" in ");
        Fragment fragment = this.f29803x;
        if (fragment != null) {
            a5.append(fragment.getClass().getSimpleName());
            a5.append("{");
            a5.append(Integer.toHexString(System.identityHashCode(this.f29803x)));
            a5.append("}");
        } else {
            androidx.fragment.app.o<?> oVar = this.f29801v;
            if (oVar != null) {
                a5.append(oVar.getClass().getSimpleName());
                a5.append("{");
                a5.append(Integer.toHexString(System.identityHashCode(this.f29801v)));
                a5.append("}");
            } else {
                a5.append("null");
            }
        }
        a5.append("}}");
        return a5.toString();
    }

    @androidx.annotation.o0
    public l0 u() {
        return new androidx.fragment.app.b(this);
    }

    public void u1(@androidx.annotation.q0 String str, int i4) {
        h0(new q(str, -1, i4), false);
    }

    boolean v() {
        boolean z4 = false;
        for (Fragment fragment : this.f29782c.m()) {
            if (fragment != null) {
                z4 = X0(fragment);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public boolean v1() {
        return y1(null, -1, 0);
    }

    public boolean w1(int i4, int i5) {
        if (i4 >= 0) {
            return y1(null, i4, i5);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Bad id: ", i4));
    }

    public boolean x1(@androidx.annotation.q0 String str, int i4) {
        return y1(str, -1, i4);
    }

    public void y(@androidx.annotation.o0 String str) {
        h0(new k(str), false);
    }

    int y0() {
        return this.f29782c.k();
    }

    boolean z(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.o0 String str) {
        if (K1(arrayList, arrayList2, str)) {
            return z1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    @androidx.annotation.o0
    List<Fragment> z0() {
        return this.f29782c.m();
    }

    boolean z1(@androidx.annotation.o0 ArrayList<androidx.fragment.app.b> arrayList, @androidx.annotation.o0 ArrayList<Boolean> arrayList2, @androidx.annotation.q0 String str, int i4, int i5) {
        int p02 = p0(str, i4, (i5 & 1) != 0);
        if (p02 < 0) {
            return false;
        }
        for (int size = this.f29783d.size() - 1; size >= p02; size--) {
            arrayList.add(this.f29783d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        String f29810b;

        /* renamed from: c, reason: collision with root package name */
        int f29811c;

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
            public LaunchedFragmentInfo[] newArray(int i4) {
                return new LaunchedFragmentInfo[i4];
            }
        }

        LaunchedFragmentInfo(@androidx.annotation.o0 String str, int i4) {
            this.f29810b = str;
            this.f29811c = i4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f29810b);
            parcel.writeInt(this.f29811c);
        }

        LaunchedFragmentInfo(@androidx.annotation.o0 Parcel parcel) {
            this.f29810b = parcel.readString();
            this.f29811c = parcel.readInt();
        }
    }
}
