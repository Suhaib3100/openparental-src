package androidx.content.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.content.c1;
import androidx.content.d1;
import androidx.content.f0;
import androidx.content.fragment.m;
import androidx.content.s;
import androidx.content.t0;
import androidx.core.os.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.k2;
import kotlin.q0;

/* compiled from: FragmentNavigator.kt */
@c1.b("fragment")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0007\b\u0017\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000345*B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Landroidx/navigation/fragment/i;", "Landroidx/navigation/c1;", "Landroidx/navigation/fragment/i$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "Landroidx/navigation/s;", "entry", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "Lkotlin/k2;", "n", "(Landroidx/navigation/s;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "popUpTo", "", "savedState", "j", "(Landroidx/navigation/s;Z)V", "l", "()Landroidx/navigation/fragment/i$b;", "", "className", "Landroid/os/Bundle;", "args", "Landroidx/fragment/app/Fragment;", "m", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", "entries", "e", "(Ljava/util/List;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "I", "", "f", "Ljava/util/Set;", "savedIds", "g", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class i extends c1<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final FragmentManager fragmentManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int containerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final Set<String> savedIds;

    /* renamed from: h, reason: collision with root package name */
    @l
    @Deprecated
    private static final String f31104h = "FragmentNavigator";

    /* renamed from: i, reason: collision with root package name */
    @l
    @Deprecated
    private static final String f31105i = "androidx-nav-fragment:navigator:savedIds";

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final a f31103g = new a();

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/i$a;", "", "<init>", "()V", "", "KEY_SAVED_IDS", "Ljava/lang/String;", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/navigation/fragment/i$b;", "Landroidx/navigation/f0;", "Landroidx/navigation/c1;", "fragmentNavigator", "<init>", "(Landroidx/navigation/c1;)V", "Landroidx/navigation/d1;", "navigatorProvider", "(Landroidx/navigation/d1;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/k2;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "b0", "(Ljava/lang/String;)Landroidx/navigation/fragment/i$b;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "m", "Ljava/lang/String;", "_className", "a0", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @f0.a(Fragment.class)
    public static class b extends f0 {

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @m
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l c1<? extends b> fragmentNavigator) {
            super(fragmentNavigator);
            l0.p(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.content.f0
        @androidx.annotation.i
        public void L(@l Context context, @l AttributeSet attrs) {
            l0.p(context, "context");
            l0.p(attrs, "attrs");
            super.L(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, m.d.f31121c);
            l0.o(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(m.d.f31122d);
            if (string != null) {
                b0(string);
            }
            k2 k2Var = k2.f75408a;
            obtainAttributes.recycle();
        }

        @l
        public final String a0() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        @l
        public final b b0(@l String className) {
            l0.p(className, "className");
            this._className = className;
            return this;
        }

        @Override // androidx.content.f0
        public boolean equals(@fg.m Object other) {
            return other != null && (other instanceof b) && super.equals(other) && l0.g(this._className, ((b) other)._className);
        }

        @Override // androidx.content.f0
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // androidx.content.f0
        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l d1 navigatorProvider) {
            this((c1<? extends b>) navigatorProvider.e(i.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R0\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/navigation/fragment/i$c;", "Landroidx/navigation/c1$a;", "", "Landroid/view/View;", "", "sharedElements", "<init>", "(Ljava/util/Map;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", "_sharedElements", "()Ljava/util/Map;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c implements c1.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final LinkedHashMap<View, String> _sharedElements;

        /* compiled from: FragmentNavigator.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0011j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/navigation/fragment/i$c$a;", "", "<init>", "()V", "", "Landroid/view/View;", "", "sharedElements", "b", "(Ljava/util/Map;)Landroidx/navigation/fragment/i$c$a;", "sharedElement", "name", "a", "(Landroid/view/View;Ljava/lang/String;)Landroidx/navigation/fragment/i$c$a;", "Landroidx/navigation/fragment/i$c;", "c", "()Landroidx/navigation/fragment/i$c;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "_sharedElements", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            @l
            public final a a(@l View sharedElement, @l String name) {
                l0.p(sharedElement, "sharedElement");
                l0.p(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            @l
            public final a b(@l Map<View, String> sharedElements) {
                l0.p(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @l
            public final c c() {
                return new c(this._sharedElements);
            }
        }

        public c(@l Map<View, String> sharedElements) {
            l0.p(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @l
        public final Map<View, String> a() {
            return z0.D0(this._sharedElements);
        }
    }

    public i(@l Context context, @l FragmentManager fragmentManager, int i4) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i4;
        this.savedIds = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(androidx.content.s r12, androidx.content.t0 r13, androidx.navigation.c1.a r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.fragment.i.n(androidx.navigation.s, androidx.navigation.t0, androidx.navigation.c1$a):void");
    }

    @Override // androidx.content.c1
    public void e(@l List<s> entries, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        l0.p(entries, "entries");
        if (this.fragmentManager.d1()) {
            return;
        }
        Iterator<s> it = entries.iterator();
        while (it.hasNext()) {
            n(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.content.c1
    public void h(@l Bundle savedState) {
        l0.p(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            kotlin.collections.w.q0(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.content.c1
    @fg.m
    public Bundle i() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return e.b(new q0("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    @Override // androidx.content.c1
    public void j(@l s popUpTo, boolean savedState) {
        l0.p(popUpTo, "popUpTo");
        if (this.fragmentManager.d1()) {
            return;
        }
        if (savedState) {
            List<s> value = b().b().getValue();
            s sVar = (s) kotlin.collections.w.B2(value);
            for (s sVar2 : kotlin.collections.w.X4(value.subList(value.indexOf(popUpTo), value.size()))) {
                if (l0.g(sVar2, sVar)) {
                    l0.C("FragmentManager cannot save the state of the initial destination ", sVar2);
                } else {
                    this.fragmentManager.R1(sVar2.getId());
                    this.savedIds.add(sVar2.getId());
                }
            }
        } else {
            this.fragmentManager.u1(popUpTo.getId(), 1);
        }
        b().g(popUpTo, savedState);
    }

    @Override // androidx.content.c1
    @l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @l
    @k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment m(@l Context context, @l FragmentManager fragmentManager, @l String className, @fg.m Bundle args) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        l0.p(className, "className");
        Fragment instantiate = fragmentManager.G0().instantiate(context.getClassLoader(), className);
        l0.o(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        return instantiate;
    }
}
