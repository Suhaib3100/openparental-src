package androidx.compose.ui.text.input;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: VisualTransformation.kt */
@m1
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/k1;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/input/i1;", "a", "(Landroidx/compose/ui/text/e;)Landroidx/compose/ui/text/input/i1;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f21049a;

    /* compiled from: VisualTransformation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/k1$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/k1;", "b", "Landroidx/compose/ui/text/input/k1;", "c", "()Landroidx/compose/ui/text/input/k1;", "d", "None", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.k1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f21049a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final k1 None = new j1();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i1 b(androidx.compose.ui.text.e eVar) {
            return new i1(eVar, p0.INSTANCE.a());
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @fg.l
        public final k1 c() {
            return None;
        }
    }

    @fg.l
    i1 a(@fg.l androidx.compose.ui.text.e text);
}
