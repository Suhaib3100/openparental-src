package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: GoogleMap.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/google/maps/android/ktx/f;", "Lcom/google/maps/android/ktx/b;", "", "reason", "<init>", "(I)V", "a", "()I", "b", "(I)Lcom/google/maps/android/ktx/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class f extends b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public f(int i4) {
        this.reason = i4;
    }

    public static f c(f fVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = fVar.reason;
        }
        fVar.getClass();
        return new f(i4);
    }

    /* renamed from: a, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    @fg.l
    public final f b(int reason) {
        return new f(reason);
    }

    public final int d() {
        return this.reason;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof f) && this.reason == ((f) other).reason;
    }

    public int hashCode() {
        return Integer.hashCode(this.reason);
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("࡚\u0001")), this.reason, ')');
    }
}
