package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJB\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010\u000eR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/l0;", "", "Landroidx/compose/foundation/text/selection/o;", "selectable", "h", "(Landroidx/compose/foundation/text/selection/o;)Landroidx/compose/foundation/text/selection/o;", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/text/selection/o;)V", "", "a", "()J", "selectableId", "c", "(J)V", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Li0/f;", "startPosition", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "", "isInTouchMode", "i", "(Landroidx/compose/ui/layout/u;JLandroidx/compose/foundation/text/selection/w;Z)V", "j", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "f", "(Landroidx/compose/ui/layout/u;JJZLandroidx/compose/foundation/text/selection/w;Z)Z", "g", "()V", "e", "", "Landroidx/compose/foundation/text/selection/q;", "b", "()Ljava/util/Map;", "subselections", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f8058a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8057b = 0;

    /* compiled from: SelectionRegistrar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/selection/l0$a;", "", "<init>", "()V", "", "b", "J", "InvalidSelectableId", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.l0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8058a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    long a();

    @fg.l
    Map<Long, q> b();

    void c(long selectableId);

    void d(@fg.l o selectable);

    void e(long selectableId);

    boolean f(@fg.l androidx.compose.ui.layout.u layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @fg.l w adjustment, boolean isInTouchMode);

    void g();

    @fg.l
    o h(@fg.l o selectable);

    void i(@fg.l androidx.compose.ui.layout.u layoutCoordinates, long startPosition, @fg.l w adjustment, boolean isInTouchMode);

    void j(long selectableId, boolean isInTouchMode);
}
