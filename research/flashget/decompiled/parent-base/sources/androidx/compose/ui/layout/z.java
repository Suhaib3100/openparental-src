package androidx.compose.ui.layout;

import androidx.compose.ui.platform.s5;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LayoutInfo.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0014\u0010&\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\bR\u0014\u0010(\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/z;", "", "", "Landroidx/compose/ui/layout/r0;", "o", "()Ljava/util/List;", "", "getWidth", "()I", "width", "getHeight", "height", "Landroidx/compose/ui/layout/u;", "v", "()Landroidx/compose/ui/layout/u;", "coordinates", "", "l", "()Z", "isPlaced", "n", "()Landroidx/compose/ui/layout/z;", "parentInfo", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "f", "isAttached", "m", "semanticsId", "w", "isDeactivated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface z {
    @fg.l
    /* renamed from: b */
    androidx.compose.ui.unit.d getDensity();

    @fg.l
    /* renamed from: d */
    s5 getViewConfiguration();

    boolean f();

    int getHeight();

    @fg.l
    androidx.compose.ui.unit.w getLayoutDirection();

    int getWidth();

    boolean l();

    /* renamed from: m */
    int getSemanticsId();

    @fg.m
    z n();

    @fg.l
    List<r0> o();

    @fg.l
    u v();

    /* renamed from: w */
    default boolean getIsDeactivated() {
        return false;
    }
}
