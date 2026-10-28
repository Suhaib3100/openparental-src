package androidx.view;

import android.annotation.SuppressLint;
import android.support.v4.media.d;
import androidx.annotation.m1;
import androidx.arch.core.executor.c;
import androidx.arch.core.internal.a;
import androidx.compose.runtime.z4;
import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;

/* compiled from: LifecycleRegistry.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002#&B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010-R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010'R&\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\t07j\b\u0012\u0004\u0012\u00020\t`88\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010@\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010>\"\u0004\b?\u0010\rR\u0014\u0010C\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/lifecycle/g0;", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/e0;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/e0;Z)V", "(Landroidx/lifecycle/e0;)V", "Landroidx/lifecycle/w$b;", "next", "Lkotlin/k2;", "p", "(Landroidx/lifecycle/w$b;)V", "Landroidx/lifecycle/d0;", "observer", "g", "(Landroidx/lifecycle/d0;)Landroidx/lifecycle/w$b;", "q", "()V", "state", "r", "lifecycleOwner", "j", "f", "t", "", "methodName", "i", "(Ljava/lang/String;)V", "n", "Landroidx/lifecycle/w$a;", "event", "l", "(Landroidx/lifecycle/w$a;)V", "a", "(Landroidx/lifecycle/d0;)V", "d", "b", "Z", "Landroidx/arch/core/internal/a;", "Landroidx/lifecycle/g0$b;", "c", "Landroidx/arch/core/internal/a;", "observerMap", "Landroidx/lifecycle/w$b;", "Ljava/lang/ref/WeakReference;", "e", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "h", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "m", "()Z", "isSynced", "()Landroidx/lifecycle/w$b;", "s", "currentState", "k", "()I", "observerCount", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class g0 extends AbstractC1450w {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceMainThread;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private a<InterfaceC1421d0, b> observerMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private AbstractC1450w.b state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final WeakReference<InterfaceC1423e0> lifecycleOwner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int addingObserverCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean handlingEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean newEventOccurred;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private ArrayList<AbstractC1450w.b> parentStates;

    /* compiled from: LifecycleRegistry.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/g0$a;", "", "<init>", "()V", "Landroidx/lifecycle/e0;", "owner", "Landroidx/lifecycle/g0;", "a", "(Landroidx/lifecycle/e0;)Landroidx/lifecycle/g0;", "Landroidx/lifecycle/w$b;", "state1", "state2", "b", "(Landroidx/lifecycle/w$b;Landroidx/lifecycle/w$b;)Landroidx/lifecycle/w$b;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.g0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        @m1
        public final g0 a(@l InterfaceC1423e0 owner) {
            l0.p(owner, "owner");
            return new g0(owner, false, null);
        }

        @l
        @n
        public final AbstractC1450w.b b(@l AbstractC1450w.b state1, @m AbstractC1450w.b state2) {
            l0.p(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/g0$b;", "", "Landroidx/lifecycle/d0;", "observer", "Landroidx/lifecycle/w$b;", "initialState", "<init>", "(Landroidx/lifecycle/d0;Landroidx/lifecycle/w$b;)V", "Landroidx/lifecycle/e0;", "owner", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "a", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "Landroidx/lifecycle/w$b;", "c", "()Landroidx/lifecycle/w$b;", "e", "(Landroidx/lifecycle/w$b;)V", "state", "Landroidx/lifecycle/b0;", "b", "Landroidx/lifecycle/b0;", "()Landroidx/lifecycle/b0;", "d", "(Landroidx/lifecycle/b0;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private AbstractC1450w.b state;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private InterfaceC1416b0 lifecycleObserver;

        public b(@m InterfaceC1421d0 interfaceC1421d0, @l AbstractC1450w.b initialState) {
            l0.p(initialState, "initialState");
            l0.m(interfaceC1421d0);
            this.lifecycleObserver = C1431i0.f(interfaceC1421d0);
            this.state = initialState;
        }

        public final void a(@m InterfaceC1423e0 owner, @l AbstractC1450w.a event) {
            l0.p(event, "event");
            AbstractC1450w.b targetState = event.getTargetState();
            this.state = g0.INSTANCE.b(this.state, targetState);
            InterfaceC1416b0 interfaceC1416b0 = this.lifecycleObserver;
            l0.m(owner);
            interfaceC1416b0.f(owner, event);
            this.state = targetState;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final InterfaceC1416b0 getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AbstractC1450w.b getState() {
            return this.state;
        }

        public final void d(@l InterfaceC1416b0 interfaceC1416b0) {
            l0.p(interfaceC1416b0, "<set-?>");
            this.lifecycleObserver = interfaceC1416b0;
        }

        public final void e(@l AbstractC1450w.b bVar) {
            l0.p(bVar, "<set-?>");
            this.state = bVar;
        }
    }

    public /* synthetic */ g0(InterfaceC1423e0 interfaceC1423e0, boolean z4, w wVar) {
        this(interfaceC1423e0, z4);
    }

    private final void f(InterfaceC1423e0 lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC1421d0, b>> descendingIterator = this.observerMap.descendingIterator();
        l0.o(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<InterfaceC1421d0, b> next = descendingIterator.next();
            l0.o(next, "next()");
            InterfaceC1421d0 key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                AbstractC1450w.a a5 = AbstractC1450w.a.INSTANCE.a(value.getState());
                if (a5 == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                r(a5.getTargetState());
                value.a(lifecycleOwner, a5);
                q();
            }
        }
    }

    private final AbstractC1450w.b g(InterfaceC1421d0 observer) {
        b value;
        Map.Entry<InterfaceC1421d0, b> m4 = this.observerMap.m(observer);
        AbstractC1450w.b state = (m4 == null || (value = m4.getValue()) == null) ? null : value.getState();
        AbstractC1450w.b bVar = this.parentStates.isEmpty() ? null : (AbstractC1450w.b) z4.a(this.parentStates, 1);
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state), bVar);
    }

    @l
    @n
    @m1
    public static final g0 h(@l InterfaceC1423e0 interfaceC1423e0) {
        return INSTANCE.a(interfaceC1423e0);
    }

    @SuppressLint({"RestrictedApi"})
    private final void i(String methodName) {
        if (this.enforceMainThread && !c.h().c()) {
            throw new IllegalStateException(d.a("Method ", methodName, " must be called on the main thread").toString());
        }
    }

    private final void j(InterfaceC1423e0 lifecycleOwner) {
        androidx.arch.core.internal.b<InterfaceC1421d0, b>.d f4 = this.observerMap.f();
        l0.o(f4, "observerMap.iteratorWithAdditions()");
        while (f4.hasNext() && !this.newEventOccurred) {
            Map.Entry next = f4.next();
            InterfaceC1421d0 interfaceC1421d0 = (InterfaceC1421d0) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(interfaceC1421d0)) {
                r(bVar.getState());
                AbstractC1450w.a c5 = AbstractC1450w.a.INSTANCE.c(bVar.getState());
                if (c5 == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, c5);
                q();
            }
        }
    }

    private final boolean m() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC1421d0, b> b5 = this.observerMap.b();
        l0.m(b5);
        AbstractC1450w.b state = b5.getValue().getState();
        Map.Entry<InterfaceC1421d0, b> h4 = this.observerMap.h();
        l0.m(h4);
        AbstractC1450w.b state2 = h4.getValue().getState();
        return state == state2 && this.state == state2;
    }

    @l
    @n
    public static final AbstractC1450w.b o(@l AbstractC1450w.b bVar, @m AbstractC1450w.b bVar2) {
        return INSTANCE.b(bVar, bVar2);
    }

    private final void p(AbstractC1450w.b next) {
        AbstractC1450w.b bVar = this.state;
        if (bVar == next) {
            return;
        }
        if (bVar == AbstractC1450w.b.INITIALIZED && next == AbstractC1450w.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        t();
        this.handlingEvent = false;
        if (this.state == AbstractC1450w.b.DESTROYED) {
            this.observerMap = new a<>();
        }
    }

    private final void q() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void r(AbstractC1450w.b state) {
        this.parentStates.add(state);
    }

    private final void t() {
        InterfaceC1423e0 interfaceC1423e0 = this.lifecycleOwner.get();
        if (interfaceC1423e0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m()) {
            this.newEventOccurred = false;
            AbstractC1450w.b bVar = this.state;
            Map.Entry<InterfaceC1421d0, b> b5 = this.observerMap.b();
            l0.m(b5);
            if (bVar.compareTo(b5.getValue().getState()) < 0) {
                f(interfaceC1423e0);
            }
            Map.Entry<InterfaceC1421d0, b> h4 = this.observerMap.h();
            if (!this.newEventOccurred && h4 != null && this.state.compareTo(h4.getValue().getState()) > 0) {
                j(interfaceC1423e0);
            }
        }
        this.newEventOccurred = false;
    }

    @Override // androidx.view.AbstractC1450w
    public void a(@l InterfaceC1421d0 observer) {
        InterfaceC1423e0 interfaceC1423e0;
        l0.p(observer, "observer");
        i("addObserver");
        AbstractC1450w.b bVar = this.state;
        AbstractC1450w.b bVar2 = AbstractC1450w.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1450w.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.j(observer, bVar3) == null && (interfaceC1423e0 = this.lifecycleOwner.get()) != null) {
            boolean z4 = this.addingObserverCounter != 0 || this.handlingEvent;
            AbstractC1450w.b g4 = g(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(g4) < 0 && this.observerMap.contains(observer)) {
                r(bVar3.getState());
                AbstractC1450w.a c5 = AbstractC1450w.a.INSTANCE.c(bVar3.getState());
                if (c5 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(interfaceC1423e0, c5);
                q();
                g4 = g(observer);
            }
            if (!z4) {
                t();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.view.AbstractC1450w
    @l
    /* renamed from: b, reason: from getter */
    public AbstractC1450w.b getState() {
        return this.state;
    }

    @Override // androidx.view.AbstractC1450w
    public void d(@l InterfaceC1421d0 observer) {
        l0.p(observer, "observer");
        i("removeObserver");
        this.observerMap.l(observer);
    }

    public int k() {
        i("getObserverCount");
        return this.observerMap.size();
    }

    public void l(@l AbstractC1450w.a event) {
        l0.p(event, "event");
        i("handleLifecycleEvent");
        p(event.getTargetState());
    }

    @k(message = "Override [currentState].")
    @androidx.annotation.l0
    public void n(@l AbstractC1450w.b state) {
        l0.p(state, "state");
        i("markState");
        s(state);
    }

    public void s(@l AbstractC1450w.b state) {
        l0.p(state, "state");
        i("setCurrentState");
        p(state);
    }

    private g0(InterfaceC1423e0 interfaceC1423e0, boolean z4) {
        this.enforceMainThread = z4;
        this.observerMap = new a<>();
        this.state = AbstractC1450w.b.INITIALIZED;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(interfaceC1423e0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(@l InterfaceC1423e0 provider) {
        this(provider, true);
        l0.p(provider, "provider");
    }
}
