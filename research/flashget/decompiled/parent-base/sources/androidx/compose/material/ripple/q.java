package androidx.compose.material.ripple;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;

/* compiled from: RippleTheme.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0015\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/ripple/q;", "", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "Landroidx/compose/material/ripple/h;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material/ripple/h;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f9378a;

    /* compiled from: RippleTheme.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/ripple/q$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Landroidx/compose/material/ripple/h;", "a", "(JZ)Landroidx/compose/material/ripple/h;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ripple.q$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f9378a = new Companion();

        private Companion() {
        }

        @fg.l
        public final h a(long contentColor, boolean lightTheme) {
            h hVar;
            h hVar2;
            h hVar3;
            if (!lightTheme) {
                hVar = r.f9382d;
                return hVar;
            }
            if (f2.o(contentColor) > 0.5d) {
                hVar3 = r.f9380b;
                return hVar3;
            }
            hVar2 = r.f9381c;
            return hVar2;
        }

        public final long b(long contentColor, boolean lightTheme) {
            float o4 = f2.o(contentColor);
            if (lightTheme || o4 >= 0.5d) {
                return contentColor;
            }
            d2.INSTANCE.getClass();
            return d2.f17770g;
        }
    }

    @androidx.compose.runtime.i
    long a(@fg.m androidx.compose.runtime.t tVar, int i4);

    @fg.l
    @androidx.compose.runtime.i
    h b(@fg.m androidx.compose.runtime.t tVar, int i4);
}
