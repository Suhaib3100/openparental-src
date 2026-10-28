package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.internal.u;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.maps.android.compose.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: StreetViewPanoramaApplier.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/maps/android/compose/streetview/e;", "Landroidx/compose/runtime/a;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "streetViewPanorama", "<init>", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "Lkotlin/k2;", "n", "()V", "", "index", "instance", "r", "(ILcom/google/maps/android/compose/o0;)V", "s", "from", "to", "count", "c", "(III)V", "a", "(II)V", "e", "Lcom/google/android/gms/maps/StreetViewPanorama;", "q", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class e extends androidx.compose.runtime.a<o0> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f62161f = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final StreetViewPanorama streetViewPanorama;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@fg.l StreetViewPanorama streetViewPanorama) {
        super(g.f62168a);
        l0.p(streetViewPanorama, ProtectedSandApp.s("ࠪ\u0001"));
        this.streetViewPanorama = streetViewPanorama;
    }

    @Override // androidx.compose.runtime.e
    public void a(int index, int count) {
    }

    @Override // androidx.compose.runtime.e
    public void c(int from, int to, int count) {
    }

    @Override // androidx.compose.runtime.a
    protected void n() {
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final StreetViewPanorama getStreetViewPanorama() {
        return this.streetViewPanorama;
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(int index, @fg.l o0 instance) {
        l0.p(instance, ProtectedSandApp.s("ࠫ\u0001"));
        instance.a();
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void e(int index, @fg.l o0 instance) {
        l0.p(instance, ProtectedSandApp.s("ࠫ\u0001"));
    }
}
