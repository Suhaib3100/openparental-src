package androidx.compose.material3;

import android.content.res.Configuration;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/l6;", "", "<init>", "()V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(24)
/* loaded from: classes.dex */
final class l6 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/l6$a;", "", "<init>", "()V", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "a", "(Landroidx/compose/runtime/t;I)Ljava/util/Locale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/material3/Locale24$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n74#2:52\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/material3/Locale24$Companion\n*L\n47#1:52\n*E\n"})
    /* renamed from: androidx.compose.material3.l6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @androidx.compose.runtime.d3
        @androidx.compose.runtime.i
        public final Locale a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(169072322, i4, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (ActualAndroid.android.kt:45)");
            }
            Locale locale = ((Configuration) tVar.x(androidx.compose.ui.platform.o0.f())).getLocales().get(0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            return locale;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }
}
