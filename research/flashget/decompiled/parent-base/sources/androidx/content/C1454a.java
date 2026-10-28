package androidx.content;

import android.os.Bundle;
import androidx.view.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ActionOnlyNavDirections.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/navigation/a;", "Landroidx/navigation/i0;", "", "actionId", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "b", "(I)Landroidx/navigation/a;", "I", "d", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: androidx.navigation.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C1454a implements i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int actionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Bundle arguments = new Bundle();

    public C1454a(int i4) {
        this.actionId = i4;
    }

    public static C1454a e(C1454a c1454a, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = c1454a.actionId;
        }
        c1454a.getClass();
        return new C1454a(i4);
    }

    /* renamed from: a, reason: from getter */
    public final int getActionId() {
        return this.actionId;
    }

    @l
    public final C1454a b(int actionId) {
        return new C1454a(actionId);
    }

    @Override // androidx.content.i0
    @l
    /* renamed from: c, reason: from getter */
    public Bundle getArguments() {
        return this.arguments;
    }

    @Override // androidx.content.i0
    public int d() {
        return this.actionId;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        return other != null && l0.g(C1454a.class, other.getClass()) && this.actionId == ((C1454a) other).actionId;
    }

    public int hashCode() {
        return 31 + this.actionId;
    }

    @l
    public String toString() {
        return e.a(new StringBuilder("ActionOnlyNavDirections(actionId="), this.actionId, ')');
    }
}
