package androidx.content;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.content.c1;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NoOpNavigator.kt */
@c1.b("NoOp")
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/navigation/g1;", "Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "<init>", "()V", "a", "()Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "d", "(Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)Landroidx/navigation/f0;", "", "k", "()Z", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g1 extends c1<f0> {
    @Override // androidx.content.c1
    @l
    public f0 a() {
        return new f0(this);
    }

    @Override // androidx.content.c1
    @l
    public f0 d(@l f0 destination, @m Bundle args, @m t0 navOptions, @m c1.a navigatorExtras) {
        l0.p(destination, "destination");
        return destination;
    }

    @Override // androidx.content.c1
    public boolean k() {
        return true;
    }
}
