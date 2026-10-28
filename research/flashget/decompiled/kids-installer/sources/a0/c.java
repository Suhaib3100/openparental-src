package a0;

import a0.c;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import p3.f;
import p3.n;

/* compiled from: FragmentStrictMode.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u00032'*B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J0\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001eH\u0002J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"La0/c;", "", "Landroidx/fragment/app/Fragment;", "fragment", "La0/c$c;", "d", "", "previousFragmentId", "Lkotlin/m2;", "i", "Landroid/view/ViewGroup;", "container", "j", "o", "k", "", "isVisibleToUser", "q", "violatingFragment", "targetFragment", "", "requestCode", "p", "m", "l", "r", "Landroidx/fragment/app/strictmode/Violation;", "violation", "h", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "u", "e", "Ljava/lang/Runnable;", "runnable", "s", "n", "b", "Ljava/lang/String;", "TAG", "c", "La0/c$c;", "()La0/c$c;", "t", "(La0/c$c;)V", "defaultPolicy", "<init>", "()V", "a", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private static final String TAG = ProtectedSandApp.s("\u0010");

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final c f13a = new c();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private static C0000c defaultPolicy = C0000c.f17e;

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"La0/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0})
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"La0/c$b;", "", "Landroidx/fragment/app/strictmode/Violation;", "violation", "Lkotlin/m2;", "a", "fragment_release"}, k = 1, mv = {1, 6, 0})
    public interface b {
        void a(@d Violation violation);
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0004\tBC\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00150\r¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR4\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001a"}, d2 = {"La0/c$c;", "", "", "La0/c$a;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "flags", "La0/c$b;", "b", "La0/c$b;", "()La0/c$b;", "listener", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "mAllowedViolations", "", "allowedViolations", "<init>", "(Ljava/util/Set;La0/c$b;Ljava/util/Map;)V", "d", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: a0.c$c, reason: collision with other inner class name */
    public static final class C0000c {

        /* renamed from: e, reason: collision with root package name */
        @d
        @f
        public static final C0000c f17e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final Set<a> flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @e
        private final b listener;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0002\u001a\u00020\u0000H\u0007J\b\u0010\u0003\u001a\u00020\u0000H\u0007J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\b\u0010\b\u001a\u00020\u0000H\u0007J\b\u0010\t\u001a\u00020\u0000H\u0007J\b\u0010\n\u001a\u00020\u0000H\u0007J\b\u0010\u000b\u001a\u00020\u0000H\u0007J\b\u0010\f\u001a\u00020\u0000H\u0007J(\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\rH\u0007J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00132\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\rH\u0007J\u0006\u0010\u0016\u001a\u00020\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\r0\u00170\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"La0/c$c$a;", "", "l", "j", "La0/c$b;", "listener", "k", "d", "e", "f", "g", "h", "i", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Landroidx/fragment/app/strictmode/Violation;", "violationClass", "a", "", "b", "La0/c$c;", "c", "", "La0/c$a;", "Ljava/util/Set;", "flags", "La0/c$b;", "", "Ljava/util/Map;", "mAllowedViolations", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: a0.c$c$a */
        public static final class a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @e
            private b listener;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @d
            private final Set<a> flags = new LinkedHashSet();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @d
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a a(@d Class<? extends Fragment> fragmentClass, @d Class<? extends Violation> violationClass) {
                l0.p(fragmentClass, ProtectedSandApp.s("\b"));
                l0.p(violationClass, ProtectedSandApp.s("\t"));
                String name = fragmentClass.getName();
                l0.o(name, ProtectedSandApp.s("\n"));
                return b(name, violationClass);
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a b(@d String fragmentClass, @d Class<? extends Violation> violationClass) {
                l0.p(fragmentClass, ProtectedSandApp.s("\u000b"));
                l0.p(violationClass, ProtectedSandApp.s("\f"));
                Set<Class<? extends Violation>> set = this.mAllowedViolations.get(fragmentClass);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(violationClass);
                this.mAllowedViolations.put(fragmentClass, set);
                return this;
            }

            @d
            public final C0000c c() {
                if (this.listener == null && !this.flags.contains(a.PENALTY_DEATH)) {
                    l();
                }
                return new C0000c(this.flags, this.listener, this.mAllowedViolations);
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a d() {
                this.flags.add(a.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a e() {
                this.flags.add(a.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a f() {
                this.flags.add(a.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a g() {
                this.flags.add(a.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a h() {
                this.flags.add(a.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a i() {
                this.flags.add(a.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a j() {
                this.flags.add(a.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a k(@d b listener) {
                l0.p(listener, ProtectedSandApp.s("\r"));
                this.listener = listener;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @d
            public final a l() {
                this.flags.add(a.PENALTY_LOG);
                return this;
            }
        }

        static {
            Map z5;
            EmptySet emptySet = EmptySet.f23181o;
            z5 = f1.z();
            f17e = new C0000c(emptySet, null, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0000c(@d Set<? extends a> set, @e b bVar, @d Map<String, ? extends Set<Class<? extends Violation>>> map) {
            l0.p(set, ProtectedSandApp.s("\u000e"));
            l0.p(map, ProtectedSandApp.s("\u000f"));
            this.flags = set;
            this.listener = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        @d
        public final Set<a> a() {
            return this.flags;
        }

        @e
        /* renamed from: b, reason: from getter */
        public final b getListener() {
            return this.listener;
        }

        @d
        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.mAllowedViolations;
        }
    }

    private c() {
    }

    private final C0000c d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                l0.o(parentFragmentManager, ProtectedSandApp.s("\u0011"));
                if (parentFragmentManager.P0() != null) {
                    C0000c P0 = parentFragmentManager.P0();
                    l0.m(P0);
                    return P0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void e(final C0000c c0000c, final Violation violation) {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        c0000c.a().contains(a.PENALTY_LOG);
        if (c0000c.getListener() != null) {
            s(fragment, new Runnable() { // from class: a0.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.f(c.C0000c.this, violation);
                }
            });
        }
        if (c0000c.a().contains(a.PENALTY_DEATH)) {
            s(fragment, new Runnable() { // from class: a0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.g(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C0000c c0000c, Violation violation) {
        l0.p(c0000c, ProtectedSandApp.s("\u0012"));
        l0.p(violation, ProtectedSandApp.s("\u0013"));
        c0000c.getListener().a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Violation violation) {
        l0.p(violation, ProtectedSandApp.s("\u0014"));
        throw violation;
    }

    private final void h(Violation violation) {
        if (FragmentManager.W0(3)) {
            violation.getFragment().getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void i(@d Fragment fragment, @d String str) {
        l0.p(fragment, ProtectedSandApp.s("\u0015"));
        l0.p(str, ProtectedSandApp.s("\u0016"));
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        c cVar = f13a;
        cVar.h(fragmentReuseViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.u(d6, fragment.getClass(), fragmentReuseViolation.getClass())) {
            cVar.e(d6, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void j(@d Fragment fragment, @e ViewGroup viewGroup) {
        l0.p(fragment, ProtectedSandApp.s("\u0017"));
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        c cVar = f13a;
        cVar.h(fragmentTagUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.u(d6, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            cVar.e(d6, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void k(@d Fragment fragment) {
        l0.p(fragment, ProtectedSandApp.s("\u0018"));
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        c cVar = f13a;
        cVar.h(getRetainInstanceUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.u(d6, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            cVar.e(d6, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void l(@d Fragment fragment) {
        l0.p(fragment, ProtectedSandApp.s("\u0019"));
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        c cVar = f13a;
        cVar.h(getTargetFragmentRequestCodeUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d6, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            cVar.e(d6, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void m(@d Fragment fragment) {
        l0.p(fragment, ProtectedSandApp.s("\u001a"));
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        c cVar = f13a;
        cVar.h(getTargetFragmentUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d6, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            cVar.e(d6, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void o(@d Fragment fragment) {
        l0.p(fragment, ProtectedSandApp.s("\u001b"));
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        c cVar = f13a;
        cVar.h(setRetainInstanceUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.u(d6, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            cVar.e(d6, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void p(@d Fragment fragment, @d Fragment fragment2, int i5) {
        l0.p(fragment, ProtectedSandApp.s("\u001c"));
        l0.p(fragment2, ProtectedSandApp.s("\u001d"));
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i5);
        c cVar = f13a;
        cVar.h(setTargetFragmentUsageViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d6, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            cVar.e(d6, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void q(@d Fragment fragment, boolean z5) {
        l0.p(fragment, ProtectedSandApp.s("\u001e"));
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z5);
        c cVar = f13a;
        cVar.h(setUserVisibleHintViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.u(d6, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            cVar.e(d6, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1({c1.a.LIBRARY})
    @n
    public static final void r(@d Fragment fragment, @d ViewGroup viewGroup) {
        l0.p(fragment, ProtectedSandApp.s("\u001f"));
        l0.p(viewGroup, ProtectedSandApp.s(" "));
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        c cVar = f13a;
        cVar.h(wrongFragmentContainerViolation);
        C0000c d6 = cVar.d(fragment);
        if (d6.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.u(d6, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            cVar.e(d6, wrongFragmentContainerViolation);
        }
    }

    private final void s(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler k5 = fragment.getParentFragmentManager().J0().k();
        l0.o(k5, ProtectedSandApp.s("!"));
        if (l0.g(k5.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            k5.post(runnable);
        }
    }

    private final boolean u(C0000c policy, Class<? extends Fragment> fragmentClass, Class<? extends Violation> violationClass) {
        boolean W1;
        Set<Class<? extends Violation>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (!l0.g(violationClass.getSuperclass(), Violation.class)) {
            W1 = j0.W1(set, violationClass.getSuperclass());
            if (W1) {
                return false;
            }
        }
        return !set.contains(violationClass);
    }

    @d
    public final C0000c c() {
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final void n(@d Violation violation) {
        l0.p(violation, ProtectedSandApp.s("\""));
        h(violation);
        Fragment fragment = violation.getFragment();
        C0000c d6 = d(fragment);
        if (u(d6, fragment.getClass(), violation.getClass())) {
            e(d6, violation);
        }
    }

    public final void t(@d C0000c c0000c) {
        l0.p(c0000c, ProtectedSandApp.s("#"));
        defaultPolicy = c0000c;
    }
}
