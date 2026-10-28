package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.n;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.compose.ui.graphics.f2;
import fg.l;
import kotlin.Metadata;

/* compiled from: ColorResources.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/res/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "id", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroid/content/Context;I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(23)
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f20259a = new a();

    private a() {
    }

    @u
    public final long a(@l Context context, @n int id2) {
        return f2.b(context.getResources().getColor(id2, context.getTheme()));
    }
}
