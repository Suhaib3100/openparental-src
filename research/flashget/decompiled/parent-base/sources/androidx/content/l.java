package androidx.content;

import android.os.Bundle;
import androidx.annotation.d0;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: NavAction.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/navigation/l;", "", "", "destinationId", "Landroidx/navigation/t0;", "navOptions", "Landroid/os/Bundle;", "defaultArguments", "<init>", "(ILandroidx/navigation/t0;Landroid/os/Bundle;)V", "a", "I", "b", "()I", "Landroidx/navigation/t0;", "c", "()Landroidx/navigation/t0;", "e", "(Landroidx/navigation/t0;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "d", "(Landroid/os/Bundle;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d0
    private final int destinationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private t0 navOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle defaultArguments;

    @j
    public l(@d0 int i4) {
        this(i4, null, null, 6, null);
    }

    @m
    /* renamed from: a, reason: from getter */
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    /* renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final t0 getNavOptions() {
        return this.navOptions;
    }

    public final void d(@m Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void e(@m t0 t0Var) {
        this.navOptions = t0Var;
    }

    @j
    public l(@d0 int i4, @m t0 t0Var) {
        this(i4, t0Var, null, 4, null);
    }

    @j
    public l(@d0 int i4, @m t0 t0Var, @m Bundle bundle) {
        this.destinationId = i4;
        this.navOptions = t0Var;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ l(int i4, t0 t0Var, Bundle bundle, int i5, w wVar) {
        this(i4, (i5 & 2) != 0 ? null : t0Var, (i5 & 4) != 0 ? null : bundle);
    }
}
