package androidx.content;

import android.os.Bundle;
import androidx.annotation.i;
import androidx.content.f0;
import dd.e;
import dd.f;
import fg.m;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlin.sequences.p;
import ld.l;

/* compiled from: Navigator.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000b,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R$\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "D", "", "<init>", "()V", "Landroidx/navigation/f1;", "state", "Lkotlin/k2;", "f", "(Landroidx/navigation/f1;)V", "a", "()Landroidx/navigation/f0;", "", "Landroidx/navigation/s;", "entries", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "e", "(Ljava/util/List;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)V", "backStackEntry", "g", "(Landroidx/navigation/s;)V", "destination", "Landroid/os/Bundle;", "args", "d", "(Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)Landroidx/navigation/f0;", "popUpTo", "", "savedState", "j", "(Landroidx/navigation/s;Z)V", "k", "()Z", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "Landroidx/navigation/f1;", "_state", "<set-?>", "b", "Z", "c", "isAttached", "()Landroidx/navigation/f1;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c1<D extends f0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private f1 _state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/c1$a;", "", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/c1$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @e(dd.a.RUNTIME)
    @Retention(RetentionPolicy.RUNTIME)
    @f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS})
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/f0;", "D", "Landroidx/navigation/s;", "backStackEntry", "a", "(Landroidx/navigation/s;)Landroidx/navigation/s;"}, k = 3, mv = {1, 6, 0})
    static final class c extends n0 implements l<s, s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1<D> f31014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f31015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f31016d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c1<D> c1Var, t0 t0Var, a aVar) {
            super(1);
            this.f31014b = c1Var;
            this.f31015c = t0Var;
            this.f31016d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(@fg.l s backStackEntry) {
            f0 d5;
            l0.p(backStackEntry, "backStackEntry");
            f0 destination = backStackEntry.getDestination();
            if (destination == null) {
                destination = null;
            }
            if (destination != null && (d5 = this.f31014b.d(destination, backStackEntry.getArguments(), this.f31015c, this.f31016d)) != null) {
                return l0.g(d5, destination) ? backStackEntry : this.f31014b.b().a(d5, d5.i(backStackEntry.getArguments()));
            }
            return null;
        }
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/f0;", "D", "Landroidx/navigation/u0;", "Lkotlin/k2;", "a", "(Landroidx/navigation/u0;)V"}, k = 3, mv = {1, 6, 0})
    static final class d extends n0 implements l<u0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f31017b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l u0 navOptions) {
            l0.p(navOptions, "$this$navOptions");
            navOptions.m(true);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(u0 u0Var) {
            a(u0Var);
            return k2.f75408a;
        }
    }

    @fg.l
    public abstract D a();

    @fg.l
    protected final f1 b() {
        f1 f1Var = this._state;
        if (f1Var != null) {
            return f1Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @m
    public f0 d(@fg.l D destination, @m Bundle args, @m t0 navOptions, @m a navigatorExtras) {
        l0.p(destination, "destination");
        return destination;
    }

    public void e(@fg.l List<s> entries, @m t0 navOptions, @m a navigatorExtras) {
        l0.p(entries, "entries");
        Iterator it = p.v0(p.k1(w.A1(entries), new c(this, navOptions, navigatorExtras))).iterator();
        while (it.hasNext()) {
            b().i((s) it.next());
        }
    }

    @i
    public void f(@fg.l f1 state) {
        l0.p(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(@fg.l s backStackEntry) {
        l0.p(backStackEntry, "backStackEntry");
        f0 destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        d(destination, null, v0.a(d.f31017b), null);
        b().f(backStackEntry);
    }

    public void h(@fg.l Bundle savedState) {
        l0.p(savedState, "savedState");
    }

    @m
    public Bundle i() {
        return null;
    }

    public void j(@fg.l s popUpTo, boolean savedState) {
        l0.p(popUpTo, "popUpTo");
        List<s> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<s> listIterator = value.listIterator(value.size());
        s sVar = null;
        while (k()) {
            sVar = listIterator.previous();
            if (l0.g(sVar, popUpTo)) {
                break;
            }
        }
        if (sVar != null) {
            b().g(sVar, savedState);
        }
    }

    public boolean k() {
        return true;
    }
}
