package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: PointerIcon.kt */
@x4
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/w;", "", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f18846a;

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/w$a;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/w;", "b", "Landroidx/compose/ui/input/pointer/w;", "()Landroidx/compose/ui/input/pointer/w;", "Default", "c", "a", "Crosshair", "d", "Text", "e", "Hand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.w$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18846a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Default = z.d();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Crosshair = z.c();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Text = z.f();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final w Hand = z.e();

        private Companion() {
        }

        @fg.l
        public final w a() {
            return Crosshair;
        }

        @fg.l
        public final w b() {
            return Default;
        }

        @fg.l
        public final w c() {
            return Hand;
        }

        @fg.l
        public final w d() {
            return Text;
        }
    }
}
