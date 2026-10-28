package androidx.content.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.content.c1;
import androidx.content.d1;
import androidx.content.f0;
import androidx.content.f1;
import androidx.content.fragment.m;
import androidx.content.i;
import androidx.content.s;
import androidx.content.t0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d0;
import androidx.fragment.app.e;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: DialogFragmentNavigator.kt */
@c1.b("dialog")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*¨\u0006/"}, d2 = {"Landroidx/navigation/fragment/d;", "Landroidx/navigation/c1;", "Landroidx/navigation/fragment/d$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "Landroidx/navigation/s;", "entry", "Lkotlin/k2;", "o", "(Landroidx/navigation/s;)V", "popUpTo", "", "savedState", "j", "(Landroidx/navigation/s;Z)V", "n", "()Landroidx/navigation/fragment/d$b;", "", "entries", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "e", "(Ljava/util/List;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "Landroidx/navigation/f1;", "state", "f", "(Landroidx/navigation/f1;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/b0;", "observer", "g", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends c1<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final FragmentManager fragmentManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final Set<String> restoredTagsAwaitingAttach;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1416b0 observer;

    /* renamed from: h, reason: collision with root package name */
    @l
    @Deprecated
    private static final String f31095h = "DialogFragmentNavigator";

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final a f31094g = new a();

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/fragment/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/navigation/fragment/d$b;", "Landroidx/navigation/f0;", "Landroidx/navigation/i;", "Landroidx/navigation/c1;", "fragmentNavigator", "<init>", "(Landroidx/navigation/c1;)V", "Landroidx/navigation/d1;", "navigatorProvider", "(Landroidx/navigation/d1;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/k2;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "b0", "(Ljava/lang/String;)Landroidx/navigation/fragment/d$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "m", "Ljava/lang/String;", "_className", "a0", "()Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @f0.a(e.class)
    public static class b extends f0 implements i {

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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, m.d.f31119a);
            l0.o(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(m.d.f31120b);
            if (string != null) {
                b0(string);
            }
            obtainAttributes.recycle();
        }

        @l
        public final String a0() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
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

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l d1 navigatorProvider) {
            this((c1<? extends b>) navigatorProvider.e(d.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    public d(@l Context context, @l FragmentManager fragmentManager) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new InterfaceC1416b0() { // from class: androidx.navigation.fragment.b
            @Override // androidx.view.InterfaceC1416b0
            public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                d.p(d.this, interfaceC1423e0, aVar);
            }
        };
    }

    private final void o(s entry) {
        b bVar = (b) entry.getDestination();
        String a02 = bVar.a0();
        if (a02.charAt(0) == '.') {
            a02 = l0.C(this.context.getPackageName(), a02);
        }
        Fragment instantiate = this.fragmentManager.G0().instantiate(this.context.getClassLoader(), a02);
        l0.o(instantiate, "fragmentManager.fragment…ader, className\n        )");
        if (!e.class.isAssignableFrom(instantiate.getClass())) {
            throw new IllegalArgumentException(("Dialog destination " + bVar.a0() + " is not an instance of DialogFragment").toString());
        }
        e eVar = (e) instantiate;
        eVar.setArguments(entry.getArguments());
        eVar.getLifecycle().a(this.observer);
        eVar.show(this.fragmentManager, entry.getId());
        b().i(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d this$0, InterfaceC1423e0 source, AbstractC1450w.a event) {
        s sVar;
        l0.p(this$0, "this$0");
        l0.p(source, "source");
        l0.p(event, "event");
        if (event == AbstractC1450w.a.ON_CREATE) {
            e eVar = (e) source;
            List<s> value = this$0.b().b().getValue();
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (l0.g(((s) it.next()).getId(), eVar.getTag())) {
                        return;
                    }
                }
            }
            eVar.dismiss();
            return;
        }
        if (event == AbstractC1450w.a.ON_STOP) {
            e eVar2 = (e) source;
            if (eVar2.requireDialog().isShowing()) {
                return;
            }
            List<s> value2 = this$0.b().b().getValue();
            ListIterator<s> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    sVar = null;
                    break;
                } else {
                    sVar = listIterator.previous();
                    if (l0.g(sVar.getId(), eVar2.getTag())) {
                        break;
                    }
                }
            }
            if (sVar == null) {
                throw new IllegalStateException(("Dialog " + eVar2 + " has already been popped off of the Navigation back stack").toString());
            }
            s sVar2 = sVar;
            if (!l0.g(kotlin.collections.w.v3(value2), sVar2)) {
                eVar2.toString();
            }
            this$0.j(sVar2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(d this$0, FragmentManager noName_0, Fragment childFragment) {
        l0.p(this$0, "this$0");
        l0.p(noName_0, "$noName_0");
        l0.p(childFragment, "childFragment");
        if (this$0.restoredTagsAwaitingAttach.remove(childFragment.getTag())) {
            childFragment.getLifecycle().a(this$0.observer);
        }
    }

    @Override // androidx.content.c1
    public b a() {
        return new b(this);
    }

    @Override // androidx.content.c1
    public void e(@l List<s> entries, @fg.m t0 navOptions, @fg.m c1.a navigatorExtras) {
        l0.p(entries, "entries");
        if (this.fragmentManager.d1()) {
            return;
        }
        Iterator<s> it = entries.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
    }

    @Override // androidx.content.c1
    public void f(@l f1 state) {
        AbstractC1450w lifecycle;
        l0.p(state, "state");
        super.f(state);
        for (s sVar : state.b().getValue()) {
            e eVar = (e) this.fragmentManager.s0(sVar.getId());
            k2 k2Var = null;
            if (eVar != null && (lifecycle = eVar.getLifecycle()) != null) {
                lifecycle.a(this.observer);
                k2Var = k2.f75408a;
            }
            if (k2Var == null) {
                this.restoredTagsAwaitingAttach.add(sVar.getId());
            }
        }
        this.fragmentManager.o(new d0() { // from class: androidx.navigation.fragment.c
            @Override // androidx.fragment.app.d0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                d.q(d.this, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.content.c1
    public void j(@l s popUpTo, boolean savedState) {
        l0.p(popUpTo, "popUpTo");
        if (this.fragmentManager.d1()) {
            return;
        }
        List<s> value = b().b().getValue();
        Iterator it = kotlin.collections.w.X4(value.subList(value.indexOf(popUpTo), value.size())).iterator();
        while (it.hasNext()) {
            Fragment s02 = this.fragmentManager.s0(((s) it.next()).getId());
            if (s02 != null) {
                s02.getLifecycle().d(this.observer);
                ((e) s02).dismiss();
            }
        }
        b().g(popUpTo, savedState);
    }

    @l
    public b n() {
        return new b(this);
    }
}
