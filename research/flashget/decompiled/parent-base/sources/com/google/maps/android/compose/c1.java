package com.google.maps.android.compose;

import android.view.View;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PinConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0080\u0002\u0010!\u001a\u00020\u001d2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u008f\u0002\u0010(\u001a\u00020\u001d2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150#\"\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u001d0%¢\u0006\u0002\b&H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0091\u0002\u0010*\u001a\u00020\u001d2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u001b\b\u0002\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0091\u0002\u0010,\u001a\u00020\u001d2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u001b\b\u0002\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010+\u001aº\u0002\u0010/\u001a\u00020\u001d2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u001b\b\u0002\u0010-\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&2\u001b\b\u0002\u0010.\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u008a\u0002\u00107\u001a\u00020\u001d2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00106\u001a\u000205H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001aÄ\u0002\u00109\u001a\u00020\u001d2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u001b\b\u0002\u0010-\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&2\u001b\b\u0002\u0010.\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a¢\u0006\u0002\b&2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00106\u001a\u000205H\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"", "key", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Lcom/google/maps/android/compose/e1;", "j", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/t;II)Lcom/google/maps/android/compose/e1;", "contentDescription", "state", "", "alpha", "Li0/f;", "anchor", "", "draggable", "flat", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "icon", "infoWindowAnchor", "rotation", "snippet", "", "tag", "title", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "onClick", "Lkotlin/k2;", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "c", "(Ljava/lang/String;Lcom/google/maps/android/compose/e1;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Landroidx/compose/runtime/t;III)V", "", "keys", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "content", "d", "([Ljava/lang/Object;Lcom/google/maps/android/compose/e1;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Lld/p;Landroidx/compose/runtime/t;III)V", "f", "(Lcom/google/maps/android/compose/e1;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Lld/q;Landroidx/compose/runtime/t;III)V", "g", "infoWindow", "infoContent", "e", "(Ljava/lang/String;Lcom/google/maps/android/compose/e1;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Lld/q;Lld/q;Landroidx/compose/runtime/t;III)V", "Lcom/google/android/gms/maps/model/PinConfig;", "pinConfig", "Landroid/view/View;", "iconView", "", "collisionBehavior", "a", "(Lcom/google/maps/android/compose/e1;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Lcom/google/android/gms/maps/model/PinConfig;Landroid/view/View;ILandroidx/compose/runtime/t;III)V", "b", "(Lcom/google/maps/android/compose/e1;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLld/l;Lld/l;Lld/l;Lld/l;Lld/q;Lld/q;Lcom/google/android/gms/maps/model/PinConfig;Landroid/view/View;ILandroidx/compose/runtime/t;IIII)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,727:1\n251#2,10:728\n251#2,10:738\n*S KotlinDebug\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerKt\n*L\n462#1:728,10\n667#1:738,10\n*E\n"})
/* loaded from: classes6.dex */
public final class c1 {

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61112b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ں\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a0 f61113b = new a0(2);

        a0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ڸ\u0001"));
            d1Var.getMarker().setAlpha(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class a1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a1 f61114b = new a1(2);

        a1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m String str) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ڹ\u0001"));
            d1Var.getMarker().setSnippet(str);
            if (d1Var.getMarker().isInfoWindowShown()) {
                d1Var.getMarker().showInfoWindow();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, String str) {
            a(d1Var, str);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/e1;", "a", "()Lcom/google/maps/android/compose/e1;"}, k = 3, mv = {1, 9, 0})
    static final class a2 extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.e1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLng f61115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a2(LatLng latLng) {
            super(0);
            this.f61115b = latLng;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.maps.android.compose.e1 invoke() {
            return new com.google.maps.android.compose.e1(this.f61115b);
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f61116b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڽ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Li0/f;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b0 f61117b = new b0(2);

        b0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, long j4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ڻ\u0001"));
            d1Var.getMarker().setAnchor(i0.f.p(j4), i0.f.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, i0.f fVar) {
            a(d1Var, fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class b1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b1 f61118b = new b1(2);

        b1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ڼ\u0001"));
            d1Var.getMarker().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Object obj) {
            a(d1Var, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f61119b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۀ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class c0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c0 f61120b = new c0(2);

        c0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ھ\u0001"));
            d1Var.getMarker().setDraggable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.google.maps.android.compose.c1$c1, reason: collision with other inner class name */
    static final class C0947c1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0947c1 f61121b = new C0947c1(2);

        C0947c1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m String str) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ڿ\u0001"));
            d1Var.getMarker().setTitle(str);
            if (d1Var.getMarker().isInfoWindowShown()) {
                d1Var.getMarker().showInfoWindow();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, String str) {
            a(d1Var, str);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f61122b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۂ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f61124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61125d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61126e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61127f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61128g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f61129h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f61130i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f61131j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f61132k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f61133l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61134m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61135n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61136o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61137p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61138q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61139r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61140s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ PinConfig f61141t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f61142u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61143v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f61144w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f61145x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f61146y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f61147z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d0(com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, long j5, float f5, String str, Object obj, String str2, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, PinConfig pinConfig, View view, int i4, int i5, int i6, int i7, int i10) {
            super(2);
            this.f61123b = e1Var;
            this.f61124c = f4;
            this.f61125d = j4;
            this.f61126e = z4;
            this.f61127f = z5;
            this.f61128g = j5;
            this.f61129h = f5;
            this.f61130i = str;
            this.f61131j = obj;
            this.f61132k = str2;
            this.f61133l = z6;
            this.f61134m = f6;
            this.f61135n = lVar;
            this.f61136o = lVar2;
            this.f61137p = lVar3;
            this.f61138q = lVar4;
            this.f61139r = qVar;
            this.f61140s = qVar2;
            this.f61141t = pinConfig;
            this.f61142u = view;
            this.f61143v = i4;
            this.f61144w = i5;
            this.f61145x = i6;
            this.f61146y = i7;
            this.f61147z = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.b(this.f61123b, this.f61124c, this.f61125d, this.f61126e, this.f61127f, this.f61128g, this.f61129h, this.f61130i, this.f61131j, this.f61132k, this.f61133l, this.f61134m, this.f61135n, this.f61136o, this.f61137p, this.f61138q, this.f61139r, this.f61140s, this.f61141t, this.f61142u, this.f61143v, tVar, g3.b(this.f61144w | 1), g3.b(this.f61145x), g3.b(this.f61146y), this.f61147z);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class d1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d1 f61148b = new d1(2);

        d1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ہ\u0001"));
            d1Var.getMarker().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f61150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61151d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61152e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f61155h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f61156i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f61157j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f61158k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f61159l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61160m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61161n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61162o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61163p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61164q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ PinConfig f61165r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f61166s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61167t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61168u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61169v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f61170w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, long j5, float f5, String str, Object obj, String str2, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, PinConfig pinConfig, View view, int i4, int i5, int i6, int i7) {
            super(2);
            this.f61149b = e1Var;
            this.f61150c = f4;
            this.f61151d = j4;
            this.f61152e = z4;
            this.f61153f = z5;
            this.f61154g = j5;
            this.f61155h = f5;
            this.f61156i = str;
            this.f61157j = obj;
            this.f61158k = str2;
            this.f61159l = z6;
            this.f61160m = f6;
            this.f61161n = lVar;
            this.f61162o = lVar2;
            this.f61163p = lVar3;
            this.f61164q = lVar4;
            this.f61165r = pinConfig;
            this.f61166s = view;
            this.f61167t = i4;
            this.f61168u = i5;
            this.f61169v = i6;
            this.f61170w = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.a(this.f61149b, this.f61150c, this.f61151d, this.f61152e, this.f61153f, this.f61154g, this.f61155h, this.f61156i, this.f61157j, this.f61158k, this.f61159l, this.f61160m, this.f61161n, this.f61162o, this.f61163p, this.f61164q, this.f61165r, this.f61166s, this.f61167t, tVar, g3.b(this.f61168u | 1), g3.b(this.f61169v), this.f61170w);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class e0 extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.d1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ld.a aVar) {
            super(0);
            this.f61171b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.d1, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final com.google.maps.android.compose.d1 invoke() {
            return this.f61171b.invoke();
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class e1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e1 f61172b = new e1(2);

        e1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۃ\u0001"));
            d1Var.getMarker().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f61173b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۇ\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final f0 f61174b = new f0(1);

        f0() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۄ\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class f1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends Boolean>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f1 f61175b = new f1(2);

        f1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, Boolean> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۅ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ۆ\u0001"));
            d1Var.r(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends Boolean> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f61176b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۋ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g0 f61177b = new g0(1);

        g0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۈ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class g1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g1 f61178b = new g1(2);

        g1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۉ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ۊ\u0001"));
            d1Var.o(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f61179b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۏ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h0 f61180b = new h0(1);

        h0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ی\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class h1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h1 f61181b = new h1(2);

        h1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۍ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ێ\u0001"));
            d1Var.p(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f61182b = new i(1);

        i() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۓ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i0 f61183b = new i0(1);

        i0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ې\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class i1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i1 f61184b = new i1(2);

        i1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۑ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ے\u0001"));
            d1Var.q(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/d1;", "a", "()Lcom/google/maps/android/compose/d1;"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.d1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b0 f61185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdvancedMarkerOptions f61186c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f61187d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z f61188e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61189f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61190g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61191h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61192i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61193j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61194k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61195l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(com.google.maps.android.compose.b0 b0Var, AdvancedMarkerOptions advancedMarkerOptions, Object obj, androidx.compose.runtime.z zVar, com.google.maps.android.compose.e1 e1Var, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2) {
            super(0);
            this.f61185b = b0Var;
            this.f61186c = advancedMarkerOptions;
            this.f61187d = obj;
            this.f61188e = zVar;
            this.f61189f = e1Var;
            this.f61190g = lVar;
            this.f61191h = lVar2;
            this.f61192i = lVar3;
            this.f61193j = lVar4;
            this.f61194k = qVar;
            this.f61195l = qVar2;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.maps.android.compose.d1 invoke() {
            GoogleMap map;
            Marker addMarker;
            com.google.maps.android.compose.b0 b0Var = this.f61185b;
            if (b0Var == null || (map = b0Var.getMap()) == null || (addMarker = map.addMarker(this.f61186c)) == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ە\u0001"));
            }
            addMarker.setTag(this.f61187d);
            return new com.google.maps.android.compose.d1(this.f61188e, addMarker, this.f61189f, this.f61190g, this.f61191h, this.f61192i, this.f61193j, this.f61194k, this.f61195l);
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f61196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f61198d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f61199e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61200f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f61201g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61202h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f61203i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f61204j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f61205k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f61206l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f61207m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f61208n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f61209o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61210p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61211q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61212r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61213s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61214t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61215u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61216v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j0(String str, com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, BitmapDescriptor bitmapDescriptor, long j5, float f5, String str2, Object obj, String str3, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, int i4, int i5, int i6) {
            super(2);
            this.f61196b = str;
            this.f61197c = e1Var;
            this.f61198d = f4;
            this.f61199e = j4;
            this.f61200f = z4;
            this.f61201g = z5;
            this.f61202h = bitmapDescriptor;
            this.f61203i = j5;
            this.f61204j = f5;
            this.f61205k = str2;
            this.f61206l = obj;
            this.f61207m = str3;
            this.f61208n = z6;
            this.f61209o = f6;
            this.f61210p = lVar;
            this.f61211q = lVar2;
            this.f61212r = lVar3;
            this.f61213s = lVar4;
            this.f61214t = i4;
            this.f61215u = i5;
            this.f61216v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.c(this.f61196b, this.f61197c, this.f61198d, this.f61199e, this.f61200f, this.f61201g, this.f61202h, this.f61203i, this.f61204j, this.f61205k, this.f61206l, this.f61207m, this.f61208n, this.f61209o, this.f61210p, this.f61211q, this.f61212r, this.f61213s, tVar, g3.b(this.f61214t | 1), g3.b(this.f61215u), this.f61216v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class j1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j1 f61217b = new j1(2);

        j1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۔\u0001"));
            d1Var.m(qVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2> qVar) {
            a(d1Var, qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f61218b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۘ\u0001"));
            d1Var.getMarker().setFlat(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final k0 f61219b = new k0(1);

        k0() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۖ\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class k1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k1 f61220b = new k1(2);

        k1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۗ\u0001"));
            d1Var.n(qVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2> qVar) {
            a(d1Var, qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Li0/f;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f61221b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, long j4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۛ\u0001"));
            d1Var.getMarker().setInfoWindowAnchor(i0.f.p(j4), i0.f.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, i0.f fVar) {
            a(d1Var, fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l0 f61222b = new l0(1);

        l0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۙ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class l1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l1 f61223b = new l1(2);

        l1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۚ\u0001"));
            d1Var.getMarker().setAlpha(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, LatLng, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f61224b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l LatLng latLng) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۞\u0001"));
            kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("۟\u0001"));
            d1Var.getMarker().setPosition(latLng);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, LatLng latLng) {
            a(d1Var, latLng);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class m0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m0 f61225b = new m0(1);

        m0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۜ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Li0/f;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class m1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m1 f61226b = new m1(2);

        m1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, long j4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("\u06dd\u0001"));
            d1Var.getMarker().setAnchor(i0.f.p(j4), i0.f.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, i0.f fVar) {
            a(d1Var, fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f61227b = new n(2);

        n() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۢ\u0001"));
            d1Var.getMarker().setRotation(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n0 f61228b = new n0(1);

        n0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۠\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class n1 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n1 f61229b = new n1(2);

        n1() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۡ\u0001"));
            d1Var.getMarker().setDraggable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f61230b = new o(2);

        o() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m String str) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۣ\u0001"));
            d1Var.getMarker().setSnippet(str);
            if (d1Var.getMarker().isInfoWindowShown()) {
                d1Var.getMarker().showInfoWindow();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, String str) {
            a(d1Var, str);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f61231b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61232c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f61233d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f61234e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61235f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f61236g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f61237h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f61238i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f61239j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f61240k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f61241l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f61242m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f61243n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61244o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61245p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61246q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61247r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f61248s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61249t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61250u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61251v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o0(Object[] objArr, com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, long j5, float f5, String str, Object obj, String str2, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5, int i6) {
            super(2);
            this.f61231b = objArr;
            this.f61232c = e1Var;
            this.f61233d = f4;
            this.f61234e = j4;
            this.f61235f = z4;
            this.f61236g = z5;
            this.f61237h = j5;
            this.f61238i = f5;
            this.f61239j = str;
            this.f61240k = obj;
            this.f61241l = str2;
            this.f61242m = z6;
            this.f61243n = f6;
            this.f61244o = lVar;
            this.f61245p = lVar2;
            this.f61246q = lVar3;
            this.f61247r = lVar4;
            this.f61248s = pVar;
            this.f61249t = i4;
            this.f61250u = i5;
            this.f61251v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            Object[] objArr = this.f61231b;
            c1.d(Arrays.copyOf(objArr, objArr.length), this.f61232c, this.f61233d, this.f61234e, this.f61235f, this.f61236g, this.f61237h, this.f61238i, this.f61239j, this.f61240k, this.f61241l, this.f61242m, this.f61243n, this.f61244o, this.f61245p, this.f61246q, this.f61247r, this.f61248s, tVar, g3.b(this.f61249t | 1), g3.b(this.f61250u), this.f61251v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o1 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f61252b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f61254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f61255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61256f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f61257g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61258h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f61259i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f61260j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f61261k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f61262l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f61263m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f61264n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f61265o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61266p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61267q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61268r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61269s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61270t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61271u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61272v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f61273w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f61274x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o1(String str, com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, BitmapDescriptor bitmapDescriptor, long j5, float f5, String str2, Object obj, String str3, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5, int i6) {
            super(2);
            this.f61252b = str;
            this.f61253c = e1Var;
            this.f61254d = f4;
            this.f61255e = j4;
            this.f61256f = z4;
            this.f61257g = z5;
            this.f61258h = bitmapDescriptor;
            this.f61259i = j5;
            this.f61260j = f5;
            this.f61261k = str2;
            this.f61262l = obj;
            this.f61263m = str3;
            this.f61264n = z6;
            this.f61265o = f6;
            this.f61266p = lVar;
            this.f61267q = lVar2;
            this.f61268r = lVar3;
            this.f61269s = lVar4;
            this.f61270t = qVar;
            this.f61271u = qVar2;
            this.f61272v = i4;
            this.f61273w = i5;
            this.f61274x = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.e(this.f61252b, this.f61253c, this.f61254d, this.f61255e, this.f61256f, this.f61257g, this.f61258h, this.f61259i, this.f61260j, this.f61261k, this.f61262l, this.f61263m, this.f61264n, this.f61265o, this.f61266p, this.f61267q, this.f61268r, this.f61269s, this.f61270t, this.f61271u, tVar, g3.b(this.f61272v | 1), g3.b(this.f61273w), this.f61274x);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f61275b = new p(2);

        p() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۥ\u0001"));
            d1Var.getMarker().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Object obj) {
            a(d1Var, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
    static final class p0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f61276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p0(ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(2);
            this.f61276b = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(710508096, i4, -1, ProtectedSandApp.s("ۤ\u0001"));
            }
            if (androidx.compose.animation.r.a(0, this.f61276b, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class p1 extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.d1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(ld.a aVar) {
            super(0);
            this.f61277b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.d1, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final com.google.maps.android.compose.d1 invoke() {
            return this.f61277b.invoke();
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f61278b = new q(2);

        q() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m String str) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۨ\u0001"));
            d1Var.getMarker().setTitle(str);
            if (d1Var.getMarker().isInfoWindowShown()) {
                d1Var.getMarker().showInfoWindow();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, String str) {
            a(d1Var, str);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class q0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final q0 f61279b = new q0(1);

        q0() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۦ\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class q1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final q1 f61280b = new q1(1);

        q1() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۧ\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lcom/google/android/gms/maps/model/PinConfig;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lcom/google/android/gms/maps/model/PinConfig;)V"}, k = 3, mv = {1, 9, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, PinConfig, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f61281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PinConfig f61282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(View view, PinConfig pinConfig) {
            super(2);
            this.f61281b = view;
            this.f61282c = pinConfig;
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m PinConfig pinConfig) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۫\u0001"));
            if (this.f61281b == null) {
                Marker marker = d1Var.getMarker();
                PinConfig pinConfig2 = this.f61282c;
                marker.setIcon(pinConfig2 != null ? BitmapDescriptorFactory.fromPinConfig(pinConfig2) : null);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, PinConfig pinConfig) {
            a(d1Var, pinConfig);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class r0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final r0 f61283b = new r0(1);

        r0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۩\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class r1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final r1 f61284b = new r1(1);

        r1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۪\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s f61285b = new s(2);

        s() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۮ\u0001"));
            d1Var.getMarker().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class s0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s0 f61286b = new s0(1);

        s0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۬\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class s1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s1 f61287b = new s1(1);

        s1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۭ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f61288b = new t(2);

        t() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۱\u0001"));
            d1Var.getMarker().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class t0 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t0 f61289b = new t0(1);

        t0() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۯ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class t1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t1 f61290b = new t1(1);

        t1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۰\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends Boolean>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f61291b = new u(2);

        u() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, Boolean> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۳\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("۴\u0001"));
            d1Var.r(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends Boolean> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/d1;", "a", "()Lcom/google/maps/android/compose/d1;"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerKt$MarkerImpl$5\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 MarkerOptions.kt\ncom/google/maps/android/ktx/model/MarkerOptionsKt\n*L\n1#1,727:1\n493#2,2:728\n495#2:733\n28#3,3:730\n*S KotlinDebug\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerKt$MarkerImpl$5\n*L\n464#1:728,2\n464#1:733\n464#1:730,3\n*E\n"})
    static final class u0 extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.d1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b0 f61292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z f61294d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61295e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61296f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61297g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61298h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61299i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61300j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61301k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f61302l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61303m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f61304n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f61305o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f61306p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61307q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f61308r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f61309s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f61310t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f61311u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f61312v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ float f61313w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u0(com.google.maps.android.compose.b0 b0Var, Object obj, androidx.compose.runtime.z zVar, com.google.maps.android.compose.e1 e1Var, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, String str, float f4, long j4, boolean z4, boolean z5, BitmapDescriptor bitmapDescriptor, long j5, float f5, String str2, String str3, boolean z6, float f6) {
            super(0);
            this.f61292b = b0Var;
            this.f61293c = obj;
            this.f61294d = zVar;
            this.f61295e = e1Var;
            this.f61296f = lVar;
            this.f61297g = lVar2;
            this.f61298h = lVar3;
            this.f61299i = lVar4;
            this.f61300j = qVar;
            this.f61301k = qVar2;
            this.f61302l = str;
            this.f61303m = f4;
            this.f61304n = j4;
            this.f61305o = z4;
            this.f61306p = z5;
            this.f61307q = bitmapDescriptor;
            this.f61308r = j5;
            this.f61309s = f5;
            this.f61310t = str2;
            this.f61311u = str3;
            this.f61312v = z6;
            this.f61313w = f6;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.maps.android.compose.d1 invoke() {
            GoogleMap map;
            com.google.maps.android.compose.b0 b0Var = this.f61292b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                String str = this.f61302l;
                float f4 = this.f61303m;
                long j4 = this.f61304n;
                boolean z4 = this.f61305o;
                boolean z5 = this.f61306p;
                BitmapDescriptor bitmapDescriptor = this.f61307q;
                long j5 = this.f61308r;
                com.google.maps.android.compose.e1 e1Var = this.f61295e;
                float f5 = this.f61309s;
                String str2 = this.f61310t;
                String str3 = this.f61311u;
                boolean z6 = this.f61312v;
                float f6 = this.f61313w;
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.contentDescription(str);
                markerOptions.alpha(f4);
                markerOptions.anchor(i0.f.p(j4), i0.f.r(j4));
                markerOptions.draggable(z4);
                markerOptions.flat(z5);
                markerOptions.icon(bitmapDescriptor);
                markerOptions.infoWindowAnchor(i0.f.p(j5), i0.f.r(j5));
                markerOptions.position(e1Var.d());
                markerOptions.rotation(f5);
                markerOptions.snippet(str2);
                markerOptions.title(str3);
                markerOptions.visible(z6);
                markerOptions.zIndex(f6);
                Marker addMarker = map.addMarker(markerOptions);
                if (addMarker != null) {
                    addMarker.setTag(this.f61293c);
                    return new com.google.maps.android.compose.d1(this.f61294d, addMarker, this.f61295e, this.f61296f, this.f61297g, this.f61298h, this.f61299i, this.f61300j, this.f61301k);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("۲\u0001"));
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class u1 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f61315c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61316d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61317e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61318f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61319g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f61320h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f61321i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f61322j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f61323k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f61324l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f61325m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f61326n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61327o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61328p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61329q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61330r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61331s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61332t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61333u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61334v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u1(com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, BitmapDescriptor bitmapDescriptor, long j5, float f5, String str, Object obj, String str2, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, int i4, int i5, int i6) {
            super(2);
            this.f61314b = e1Var;
            this.f61315c = f4;
            this.f61316d = j4;
            this.f61317e = z4;
            this.f61318f = z5;
            this.f61319g = bitmapDescriptor;
            this.f61320h = j5;
            this.f61321i = f5;
            this.f61322j = str;
            this.f61323k = obj;
            this.f61324l = str2;
            this.f61325m = z6;
            this.f61326n = f6;
            this.f61327o = lVar;
            this.f61328p = lVar2;
            this.f61329q = lVar3;
            this.f61330r = lVar4;
            this.f61331s = qVar;
            this.f61332t = i4;
            this.f61333u = i5;
            this.f61334v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.f(this.f61314b, this.f61315c, this.f61316d, this.f61317e, this.f61318f, this.f61319g, this.f61320h, this.f61321i, this.f61322j, this.f61323k, this.f61324l, this.f61325m, this.f61326n, this.f61327o, this.f61328p, this.f61329q, this.f61330r, this.f61331s, tVar, g3.b(this.f61332t | 1), g3.b(this.f61333u), this.f61334v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f61335b = new v(2);

        v() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۷\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("۸\u0001"));
            d1Var.o(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class v0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final v0 f61336b = new v0(2);

        v0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۵\u0001"));
            d1Var.getMarker().setFlat(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Boolean bool) {
            a(d1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class v1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final v1 f61337b = new v1(1);

        v1() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۶\u0001"));
            return Boolean.FALSE;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final w f61338b = new w(2);

        w() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۻ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ۼ\u0001"));
            d1Var.p(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V"}, k = 3, mv = {1, 9, 0})
    static final class w0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, BitmapDescriptor, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final w0 f61339b = new w0(2);

        w0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m BitmapDescriptor bitmapDescriptor) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۹\u0001"));
            d1Var.getMarker().setIcon(bitmapDescriptor);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, BitmapDescriptor bitmapDescriptor) {
            a(d1Var, bitmapDescriptor);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class w1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final w1 f61340b = new w1(1);

        w1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ۺ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class x extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final x f61341b = new x(2);

        x() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("ۿ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("܀\u0001"));
            d1Var.q(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.l<? super Marker, ? extends k2> lVar) {
            a(d1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Li0/f;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class x0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final x0 f61342b = new x0(2);

        x0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, long j4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("۽\u0001"));
            d1Var.getMarker().setInfoWindowAnchor(i0.f.p(j4), i0.f.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, i0.f fVar) {
            a(d1Var, fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class x1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final x1 f61343b = new x1(1);

        x1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("۾\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f61344b = new y(2);

        y() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("܄\u0001"));
            d1Var.m(qVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2> qVar) {
            a(d1Var, qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    static final class y0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, LatLng, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y0 f61345b = new y0(2);

        y0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.l LatLng latLng) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("܁\u0001"));
            kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("܂\u0001"));
            d1Var.getMarker().setPosition(latLng);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, LatLng latLng) {
            a(d1Var, latLng);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class y1 extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y1 f61346b = new y1(1);

        y1() {
            super(1);
        }

        public final void a(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("܃\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
            a(marker);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/d1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "a", "(Lcom/google/maps/android/compose/d1;Lld/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final z f61347b = new z(2);

        z() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, @fg.m ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("܆\u0001"));
            d1Var.n(qVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, ? extends k2> qVar) {
            a(d1Var, qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/d1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/d1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class z0 extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.d1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final z0 f61348b = new z0(2);

        z0() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.d1 d1Var, float f4) {
            kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("܅\u0001"));
            d1Var.getMarker().setRotation(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.d1 d1Var, Float f4) {
            a(d1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class z1 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.e1 f61349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f61350c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61351d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61352e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61353f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61354g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f61355h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f61356i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f61357j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f61358k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f61359l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f61360m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f61361n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f61362o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61363p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61364q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f61365r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.q<Marker, androidx.compose.runtime.t, Integer, k2> f61366s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f61367t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f61368u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f61369v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z1(com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, BitmapDescriptor bitmapDescriptor, long j5, float f5, String str, Object obj, String str2, boolean z6, float f6, ld.l<? super Marker, Boolean> lVar, ld.l<? super Marker, k2> lVar2, ld.l<? super Marker, k2> lVar3, ld.l<? super Marker, k2> lVar4, ld.q<? super Marker, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, int i4, int i5, int i6) {
            super(2);
            this.f61349b = e1Var;
            this.f61350c = f4;
            this.f61351d = j4;
            this.f61352e = z4;
            this.f61353f = z5;
            this.f61354g = bitmapDescriptor;
            this.f61355h = j5;
            this.f61356i = f5;
            this.f61357j = str;
            this.f61358k = obj;
            this.f61359l = str2;
            this.f61360m = z6;
            this.f61361n = f6;
            this.f61362o = lVar;
            this.f61363p = lVar2;
            this.f61364q = lVar3;
            this.f61365r = lVar4;
            this.f61366s = qVar;
            this.f61367t = i4;
            this.f61368u = i5;
            this.f61369v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c1.g(this.f61349b, this.f61350c, this.f61351d, this.f61352e, this.f61353f, this.f61354g, this.f61355h, this.f61356i, this.f61357j, this.f61358k, this.f61359l, this.f61360m, this.f61361n, this.f61362o, this.f61363p, this.f61364q, this.f61365r, this.f61366s, tVar, g3.b(this.f61367t | 1), g3.b(this.f61368u), this.f61369v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0374  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m com.google.maps.android.compose.e1 r57, float r58, long r59, boolean r61, boolean r62, long r63, float r65, @fg.m java.lang.String r66, @fg.m java.lang.Object r67, @fg.m java.lang.String r68, boolean r69, float r70, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r71, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r72, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r73, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r74, @fg.m com.google.android.gms.maps.model.PinConfig r75, @fg.m android.view.View r76, int r77, @fg.m androidx.compose.runtime.t r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.a(com.google.maps.android.compose.e1, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, com.google.android.gms.maps.model.PinConfig, android.view.View, int, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bb  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.google.maps.android.compose.e1 r37, float r38, long r39, boolean r41, boolean r42, long r43, float r45, java.lang.String r46, java.lang.Object r47, java.lang.String r48, boolean r49, float r50, ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r51, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r52, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r53, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r54, ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r55, ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r56, com.google.android.gms.maps.model.PinConfig r57, android.view.View r58, int r59, androidx.compose.runtime.t r60, int r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.b(com.google.maps.android.compose.e1, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, ld.q, ld.q, com.google.android.gms.maps.model.PinConfig, android.view.View, int, androidx.compose.runtime.t, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m java.lang.String r55, @fg.m com.google.maps.android.compose.e1 r56, float r57, long r58, boolean r60, boolean r61, @fg.m com.google.android.gms.maps.model.BitmapDescriptor r62, long r63, float r65, @fg.m java.lang.String r66, @fg.m java.lang.Object r67, @fg.m java.lang.String r68, boolean r69, float r70, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r71, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r72, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r73, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r74, @fg.m androidx.compose.runtime.t r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.c(java.lang.String, com.google.maps.android.compose.e1, float, long, boolean, boolean, com.google.android.gms.maps.model.BitmapDescriptor, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, androidx.compose.runtime.t, int, int, int):void");
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void d(@fg.l Object[] objArr, @fg.m com.google.maps.android.compose.e1 e1Var, float f4, long j4, boolean z4, boolean z5, long j5, float f5, @fg.m String str, @fg.m Object obj, @fg.m String str2, boolean z6, float f6, @fg.m ld.l<? super Marker, Boolean> lVar, @fg.m ld.l<? super Marker, k2> lVar2, @fg.m ld.l<? super Marker, k2> lVar3, @fg.m ld.l<? super Marker, k2> lVar4, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        com.google.maps.android.compose.e1 e1Var2;
        int i7;
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("܋\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("܌\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-552240865);
        if ((i6 & 2) != 0) {
            e1Var2 = j(null, null, o4, 0, 3);
            i7 = i4 & (-113);
        } else {
            e1Var2 = e1Var;
            i7 = i4;
        }
        float f7 = (i6 & 4) != 0 ? 1.0f : f4;
        long a5 = (i6 & 8) != 0 ? i0.g.a(0.5f, 1.0f) : j4;
        boolean z7 = (i6 & 16) != 0 ? false : z4;
        boolean z10 = (i6 & 32) != 0 ? false : z5;
        long a6 = (i6 & 64) != 0 ? i0.g.a(0.5f, 0.0f) : j5;
        float f10 = (i6 & 128) != 0 ? 0.0f : f5;
        String str3 = (i6 & 256) != 0 ? null : str;
        Object obj2 = (i6 & 512) != 0 ? null : obj;
        String str4 = (i6 & 1024) != 0 ? null : str2;
        boolean z11 = (i6 & 2048) != 0 ? true : z6;
        float f11 = (i6 & 4096) != 0 ? 0.0f : f6;
        ld.l<? super Marker, Boolean> lVar5 = (i6 & 8192) != 0 ? k0.f61219b : lVar;
        ld.l<? super Marker, k2> lVar6 = (i6 & 16384) != 0 ? l0.f61222b : lVar2;
        ld.l<? super Marker, k2> lVar7 = (32768 & i6) != 0 ? m0.f61225b : lVar3;
        ld.l<? super Marker, k2> lVar8 = (65536 & i6) != 0 ? n0.f61228b : lVar4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-552240865, i7, i5, ProtectedSandApp.s("܍\u0001"));
        }
        int i10 = i7 << 3;
        int i11 = i5 << 3;
        com.google.maps.android.compose.e1 e1Var3 = e1Var2;
        float f12 = f7;
        long j6 = a5;
        boolean z12 = z7;
        boolean z13 = z10;
        long j7 = a6;
        float f13 = f10;
        String str5 = str3;
        Object obj3 = obj2;
        String str6 = str4;
        boolean z14 = z11;
        float f14 = f11;
        ld.l<? super Marker, Boolean> lVar9 = lVar5;
        ld.l<? super Marker, k2> lVar10 = lVar6;
        ld.l<? super Marker, k2> lVar11 = lVar7;
        ld.l<? super Marker, k2> lVar12 = lVar8;
        e(null, e1Var3, f12, j6, z12, z13, com.google.maps.android.compose.m1.c(Arrays.copyOf(objArr, objArr.length), androidx.compose.runtime.internal.c.b(o4, 710508096, true, new p0(pVar)), o4, 56), j7, f13, str5, obj3, str6, z14, f14, lVar9, lVar10, lVar11, lVar12, null, null, o4, (i7 & 112) | 2097152 | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (57344 & i11) | (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 786433);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new o0(objArr, e1Var2, f7, a5, z7, z10, a6, f10, str3, obj2, str4, z11, f11, lVar5, lVar6, lVar7, lVar8, pVar, i4, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c0  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r55, com.google.maps.android.compose.e1 r56, float r57, long r58, boolean r60, boolean r61, com.google.android.gms.maps.model.BitmapDescriptor r62, long r63, float r65, java.lang.String r66, java.lang.Object r67, java.lang.String r68, boolean r69, float r70, ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r71, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r72, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r73, ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r74, ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r75, ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r76, androidx.compose.runtime.t r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.e(java.lang.String, com.google.maps.android.compose.e1, float, long, boolean, boolean, com.google.android.gms.maps.model.BitmapDescriptor, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, ld.q, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028e  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.m com.google.maps.android.compose.e1 r55, float r56, long r57, boolean r59, boolean r60, @fg.m com.google.android.gms.maps.model.BitmapDescriptor r61, long r62, float r64, @fg.m java.lang.String r65, @fg.m java.lang.Object r66, @fg.m java.lang.String r67, boolean r68, float r69, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r70, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r71, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r72, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r73, @fg.m ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r74, @fg.m androidx.compose.runtime.t r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.f(com.google.maps.android.compose.e1, float, long, boolean, boolean, com.google.android.gms.maps.model.BitmapDescriptor, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a  */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@fg.m com.google.maps.android.compose.e1 r57, float r58, long r59, boolean r61, boolean r62, @fg.m com.google.android.gms.maps.model.BitmapDescriptor r63, long r64, float r66, @fg.m java.lang.String r67, @fg.m java.lang.Object r68, @fg.m java.lang.String r69, boolean r70, float r71, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r72, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r73, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r74, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r75, @fg.m ld.q<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r76, @fg.m androidx.compose.runtime.t r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.c1.g(com.google.maps.android.compose.e1, float, long, boolean, boolean, com.google.android.gms.maps.model.BitmapDescriptor, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, ld.l, ld.l, ld.l, ld.l, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final com.google.maps.android.compose.e1 j(@fg.m String str, @fg.m LatLng latLng, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-665345564);
        if ((i5 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i5 & 2) != 0) {
            latLng = new LatLng(com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-665345564, i4, -1, ProtectedSandApp.s("ܑ\u0001"));
        }
        com.google.maps.android.compose.e1.INSTANCE.getClass();
        com.google.maps.android.compose.e1 e1Var = (com.google.maps.android.compose.e1) androidx.compose.runtime.saveable.d.d(new Object[0], com.google.maps.android.compose.e1.f61436f, str2, new a2(latLng), tVar, ((i4 << 6) & 896) | 72, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e1Var;
    }
}
