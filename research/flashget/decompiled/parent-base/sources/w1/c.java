package w1;

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
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kd.f;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.w;
import kotlin.collections.z0;
import w1.c;

/* compiled from: FragmentStrictMode.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003<36B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0013J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J7\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00062\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0'H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b2\u0010%R\u0014\u00105\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lw1/c;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Lw1/c$c;", "d", "(Landroidx/fragment/app/Fragment;)Lw1/c$c;", "", "previousFragmentId", "Lkotlin/k2;", "i", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "j", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/Fragment;)V", "k", "", "isVisibleToUser", "q", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", "", "requestCode", "p", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "m", "l", "r", "Landroidx/fragment/app/strictmode/Violation;", "violation", "h", "(Landroidx/fragment/app/strictmode/Violation;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "u", "(Lw1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "e", "(Lw1/c$c;Landroidx/fragment/app/strictmode/Violation;)V", "Ljava/lang/Runnable;", "runnable", "s", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "n", "b", "Ljava/lang/String;", "TAG", "c", "Lw1/c$c;", "()Lw1/c$c;", "t", "(Lw1/c$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final String TAG = "FragmentStrictMode";

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f92871a = new c();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private static C1402c defaultPolicy = C1402c.f92875e;

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lw1/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw1/c$b;", "", "Landroidx/fragment/app/strictmode/Violation;", "violation", "Lkotlin/k2;", "a", "(Landroidx/fragment/app/strictmode/Violation;)V", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b {
        void a(@l Violation violation);
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0002\u000f\u0012BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R4\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, d2 = {"Lw1/c$c;", "", "", "Lw1/c$a;", "flags", "Lw1/c$b;", "listener", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;Lw1/c$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Lw1/c$b;", "()Lw1/c$b;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "mAllowedViolations", "d", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: w1.c$c, reason: collision with other inner class name */
    public static final class C1402c {

        /* renamed from: e, reason: collision with root package name */
        @l
        @f
        public static final C1402c f92875e = new C1402c(l0.f74939b, null, z0.z());

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Set<a> flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final b listener;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0005J/\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R.\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00110\u001e0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006&"}, d2 = {"Lw1/c$c$a;", "", "<init>", "()V", "l", "()Lw1/c$c$a;", "j", "Lw1/c$b;", "listener", "k", "(Lw1/c$b;)Lw1/c$c$a;", "d", "e", "f", "g", "h", "i", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Landroidx/fragment/app/strictmode/Violation;", "violationClass", "a", "(Ljava/lang/Class;Ljava/lang/Class;)Lw1/c$c$a;", "", "b", "(Ljava/lang/String;Ljava/lang/Class;)Lw1/c$c$a;", "Lw1/c$c;", "c", "()Lw1/c$c;", "", "Lw1/c$a;", "Ljava/util/Set;", "flags", "Lw1/c$b;", "", "Ljava/util/Map;", "mAllowedViolations", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: w1.c$c$a */
        public static final class a {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @m
            private b listener;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final Set<a> flags = new LinkedHashSet();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a a(@l Class<? extends Fragment> fragmentClass, @l Class<? extends Violation> violationClass) {
                kotlin.jvm.internal.l0.p(fragmentClass, "fragmentClass");
                kotlin.jvm.internal.l0.p(violationClass, "violationClass");
                String fragmentClassString = fragmentClass.getName();
                kotlin.jvm.internal.l0.o(fragmentClassString, "fragmentClassString");
                return b(fragmentClassString, violationClass);
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a b(@l String fragmentClass, @l Class<? extends Violation> violationClass) {
                kotlin.jvm.internal.l0.p(fragmentClass, "fragmentClass");
                kotlin.jvm.internal.l0.p(violationClass, "violationClass");
                Set<Class<? extends Violation>> set = this.mAllowedViolations.get(fragmentClass);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(violationClass);
                this.mAllowedViolations.put(fragmentClass, set);
                return this;
            }

            @l
            public final C1402c c() {
                if (this.listener == null && !this.flags.contains(a.PENALTY_DEATH)) {
                    l();
                }
                return new C1402c(this.flags, this.listener, this.mAllowedViolations);
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a d() {
                this.flags.add(a.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a e() {
                this.flags.add(a.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a f() {
                this.flags.add(a.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a g() {
                this.flags.add(a.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a h() {
                this.flags.add(a.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a i() {
                this.flags.add(a.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a j() {
                this.flags.add(a.PENALTY_DEATH);
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a k(@l b listener) {
                kotlin.jvm.internal.l0.p(listener, "listener");
                this.listener = listener;
                return this;
            }

            @l
            @SuppressLint({"BuilderSetStyle"})
            public final a l() {
                this.flags.add(a.PENALTY_LOG);
                return this;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1402c(@l Set<? extends a> flags, @m b bVar, @l Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            kotlin.jvm.internal.l0.p(flags, "flags");
            kotlin.jvm.internal.l0.p(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        @l
        public final Set<a> a() {
            return this.flags;
        }

        @m
        /* renamed from: b, reason: from getter */
        public final b getListener() {
            return this.listener;
        }

        @l
        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.mAllowedViolations;
        }
    }

    private c() {
    }

    private final C1402c d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                kotlin.jvm.internal.l0.o(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.P0() != null) {
                    C1402c P0 = parentFragmentManager.P0();
                    kotlin.jvm.internal.l0.m(P0);
                    return P0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void e(final C1402c policy, final Violation violation) {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        policy.a().contains(a.PENALTY_LOG);
        if (policy.getListener() != null) {
            s(fragment, new Runnable() { // from class: w1.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.f(c.C1402c.this, violation);
                }
            });
        }
        if (policy.a().contains(a.PENALTY_DEATH)) {
            s(fragment, new Runnable() { // from class: w1.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.g(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C1402c policy, Violation violation) {
        kotlin.jvm.internal.l0.p(policy, "$policy");
        kotlin.jvm.internal.l0.p(violation, "$violation");
        policy.getListener().a(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Violation violation) {
        kotlin.jvm.internal.l0.p(violation, "$violation");
        throw violation;
    }

    private final void h(Violation violation) {
        if (FragmentManager.W0(3)) {
            violation.getFragment().getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void i(@l Fragment fragment, @l String previousFragmentId) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        kotlin.jvm.internal.l0.p(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        c cVar = f92871a;
        cVar.h(fragmentReuseViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.u(d5, fragment.getClass(), fragmentReuseViolation.getClass())) {
            cVar.e(d5, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void j(@l Fragment fragment, @m ViewGroup container) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, container);
        c cVar = f92871a;
        cVar.h(fragmentTagUsageViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.u(d5, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            cVar.e(d5, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void k(@l Fragment fragment) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        c cVar = f92871a;
        cVar.h(getRetainInstanceUsageViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.u(d5, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            cVar.e(d5, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void l(@l Fragment fragment) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        c cVar = f92871a;
        cVar.h(getTargetFragmentRequestCodeUsageViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d5, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            cVar.e(d5, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void m(@l Fragment fragment) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        c cVar = f92871a;
        cVar.h(getTargetFragmentUsageViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d5, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            cVar.e(d5, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void o(@l Fragment fragment) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        c cVar = f92871a;
        cVar.h(setRetainInstanceUsageViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.u(d5, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            cVar.e(d5, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void p(@l Fragment violatingFragment, @l Fragment targetFragment, int requestCode) {
        kotlin.jvm.internal.l0.p(violatingFragment, "violatingFragment");
        kotlin.jvm.internal.l0.p(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, requestCode);
        c cVar = f92871a;
        cVar.h(setTargetFragmentUsageViolation);
        C1402c d5 = cVar.d(violatingFragment);
        if (d5.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.u(d5, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            cVar.e(d5, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void q(@l Fragment fragment, boolean isVisibleToUser) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, isVisibleToUser);
        c cVar = f92871a;
        cVar.h(setUserVisibleHintViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.u(d5, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            cVar.e(d5, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @c1({c1.a.LIBRARY})
    public static final void r(@l Fragment fragment, @l ViewGroup container) {
        kotlin.jvm.internal.l0.p(fragment, "fragment");
        kotlin.jvm.internal.l0.p(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        c cVar = f92871a;
        cVar.h(wrongFragmentContainerViolation);
        C1402c d5 = cVar.d(fragment);
        if (d5.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.u(d5, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            cVar.e(d5, wrongFragmentContainerViolation);
        }
    }

    private final void s(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler g4 = fragment.getParentFragmentManager().J0().g();
        kotlin.jvm.internal.l0.o(g4, "fragment.parentFragmentManager.host.handler");
        if (kotlin.jvm.internal.l0.g(g4.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g4.post(runnable);
        }
    }

    private final boolean u(C1402c policy, Class<? extends Fragment> fragmentClass, Class<? extends Violation> violationClass) {
        Set<Class<? extends Violation>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (kotlin.jvm.internal.l0.g(violationClass.getSuperclass(), Violation.class) || !w.W1(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }

    @l
    public final C1402c c() {
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final void n(@l Violation violation) {
        kotlin.jvm.internal.l0.p(violation, "violation");
        h(violation);
        Fragment fragment = violation.getFragment();
        C1402c d5 = d(fragment);
        if (u(d5, fragment.getClass(), violation.getClass())) {
            e(d5, violation);
        }
    }

    public final void t(@l C1402c c1402c) {
        kotlin.jvm.internal.l0.p(c1402c, "<set-?>");
        defaultPolicy = c1402c;
    }
}
