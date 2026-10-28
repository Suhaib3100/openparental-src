package androidx.view;

import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.a;

/* compiled from: OnBackPressedCallback.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/activity/c0;", "", "", "enabled", "<init>", "(Z)V", "Lkotlin/k2;", "remove", "()V", "Landroidx/activity/f;", "backEvent", "handleOnBackStarted", "(Landroidx/activity/f;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/g;", "cancellable", "addCancellable", "(Landroidx/activity/g;)V", "removeCancellable", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "enabledChangedCallback", "Lld/a;", "getEnabledChangedCallback$activity_release", "()Lld/a;", "setEnabledChangedCallback$activity_release", "(Lld/a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class c0 {

    @l
    private final CopyOnWriteArrayList<g> cancellables = new CopyOnWriteArrayList<>();

    @m
    private a<k2> enabledChangedCallback;
    private boolean isEnabled;

    public c0(boolean z4) {
        this.isEnabled = z4;
    }

    @i(name = "addCancellable")
    public final void addCancellable(@l g cancellable) {
        l0.p(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @m
    public final a<k2> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @androidx.annotation.l0
    public void handleOnBackCancelled() {
    }

    @androidx.annotation.l0
    public abstract void handleOnBackPressed();

    @androidx.annotation.l0
    public void handleOnBackProgressed(@l f backEvent) {
        l0.p(backEvent, "backEvent");
    }

    @androidx.annotation.l0
    public void handleOnBackStarted(@l f backEvent) {
        l0.p(backEvent, "backEvent");
    }

    @androidx.annotation.l0
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @androidx.annotation.l0
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((g) it.next()).cancel();
        }
    }

    @i(name = "removeCancellable")
    public final void removeCancellable(@l g cancellable) {
        l0.p(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @androidx.annotation.l0
    public final void setEnabled(boolean z4) {
        this.isEnabled = z4;
        a<k2> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@m a<k2> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
