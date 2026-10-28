package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/l;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/l;Landroidx/lifecycle/b0;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "b", "Landroidx/lifecycle/l;", "c", "Landroidx/lifecycle/b0;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1436l defaultLifecycleObserver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final InterfaceC1416b0 lifecycleEventObserver;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30152a;

        static {
            int[] iArr = new int[AbstractC1450w.a.values().length];
            try {
                iArr[AbstractC1450w.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1450w.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1450w.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1450w.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1450w.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1450w.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1450w.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f30152a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@l InterfaceC1436l defaultLifecycleObserver, @m InterfaceC1416b0 interfaceC1416b0) {
        l0.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = interfaceC1416b0;
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, "source");
        l0.p(event, "event");
        switch (a.f30152a[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.c(source);
                break;
            case 2:
                this.defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                this.defaultLifecycleObserver.l(source);
                break;
            case 4:
                this.defaultLifecycleObserver.n(source);
                break;
            case 5:
                this.defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                this.defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1416b0 interfaceC1416b0 = this.lifecycleEventObserver;
        if (interfaceC1416b0 != null) {
            interfaceC1416b0.f(source, event);
        }
    }
}
