package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.ui.platform.ComposeView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.k2;

/* compiled from: RememberComposeBitmapDescriptor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\b\u001a\u00020\u00072\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u0017\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"", "", "keys", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "c", "([Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "Landroid/view/ViewGroup;", "parent", "Landroidx/compose/runtime/z;", "compositionContext", "e", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/z;Lld/p;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "currentContent", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRememberComposeBitmapDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberComposeBitmapDescriptor.kt\ncom/google/maps/android/compose/RememberComposeBitmapDescriptorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,70:1\n74#2:71\n83#3,3:72\n1116#4,6:75\n1#5:81\n43#6,3:82\n81#7:85\n*S KotlinDebug\n*F\n+ 1 RememberComposeBitmapDescriptor.kt\ncom/google/maps/android/compose/RememberComposeBitmapDescriptorKt\n*L\n24#1:71\n28#1:72,3\n28#1:75,6\n64#1:82,3\n26#1:85\n*E\n"})
/* loaded from: classes6.dex */
public final class m1 {
    public static final ld.p a(b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }

    @fg.l
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final BitmapDescriptor c(@fg.l Object[] objArr, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("\u07b5\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("\u07b6\u0001"));
        tVar.P(1029749567);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1029749567, i4, -1, ProtectedSandApp.s("\u07b7\u0001"));
        }
        Object x4 = tVar.x(androidx.compose.ui.platform.o0.k());
        kotlin.jvm.internal.l0.n(x4, ProtectedSandApp.s("\u07b8\u0001"));
        ViewGroup viewGroup = (ViewGroup) x4;
        androidx.compose.runtime.z u4 = androidx.compose.runtime.p.u(tVar, 0);
        b5 u5 = o4.u(pVar, tVar, (i4 >> 3) & 14);
        s1 s1Var = new s1(4);
        s1Var.a(viewGroup);
        s1Var.a(u4);
        s1Var.a((ld.p) u5.getValue());
        s1Var.b(objArr);
        Object[] d5 = s1Var.d(new Object[s1Var.c()]);
        tVar.P(-568225417);
        boolean z4 = false;
        for (Object obj : d5) {
            z4 |= tVar.q0(obj);
        }
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = e(viewGroup, u4, (ld.p) u5.getValue());
            tVar.E(Q);
        }
        tVar.p0();
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return bitmapDescriptor;
    }

    private static final ld.p<androidx.compose.runtime.t, Integer, k2> d(b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final BitmapDescriptor e(ViewGroup viewGroup, androidx.compose.runtime.z zVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
        Canvas canvas = new Canvas();
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.l0.o(context, ProtectedSandApp.s("\u07b9\u0001"));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.t(zVar);
        composeView.z(pVar);
        viewGroup.addView(composeView);
        composeView.draw(canvas);
        composeView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.l0.o(createBitmap, ProtectedSandApp.s("\u07ba\u0001"));
        composeView.draw(new Canvas(createBitmap));
        viewGroup.removeView(composeView);
        BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(createBitmap);
        kotlin.jvm.internal.l0.o(fromBitmap, ProtectedSandApp.s("\u07bb\u0001"));
        return fromBitmap;
    }
}
