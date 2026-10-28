package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MapClickListeners.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B8\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R-\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\n\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/compose/d0;", "", "L", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lkotlin/Function2;", "Lkotlin/k2;", "Lkotlin/u;", "setter", "listener", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lld/p;Ljava/lang/Object;)V", "listenerOrNull", "d", "(Ljava/lang/Object;)V", "a", "()V", "c", "b", "Lcom/google/android/gms/maps/GoogleMap;", "Lld/p;", "Ljava/lang/Object;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d0<L> implements o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f61409d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final GoogleMap map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<GoogleMap, L, k2> setter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final L listener;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@fg.l GoogleMap googleMap, @fg.l ld.p<? super GoogleMap, ? super L, k2> pVar, @fg.l L l4) {
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ܣ\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("ܤ\u0001"));
        kotlin.jvm.internal.l0.p(l4, ProtectedSandApp.s("ܥ\u0001"));
        this.map = googleMap;
        this.setter = pVar;
        this.listener = l4;
    }

    private final void d(L listenerOrNull) {
        this.setter.invoke(this.map, listenerOrNull);
    }

    @Override // com.google.maps.android.compose.o0
    public void a() {
        d(this.listener);
    }

    @Override // com.google.maps.android.compose.o0
    public void b() {
        d(null);
    }

    @Override // com.google.maps.android.compose.o0
    public void c() {
        d(null);
    }
}
