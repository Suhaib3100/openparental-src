package com.kizitonwose.calendar.view.internal;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.j0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroid/view/ViewGroup;", "", "layoutRes", "", "attachToRoot", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;IZ)Landroid/view/View;", "Landroid/graphics/Rect;", "other", "c", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "", "field", "d", "(Ljava/lang/String;)Ljava/lang/String;", "I", "NO_INDEX", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f66755a = -1;

    @fg.l
    public static final View a(@fg.l ViewGroup viewGroup, @j0 int i4, boolean z4) {
        l0.p(viewGroup, ProtectedSandApp.s("ᓼ\u0001"));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, z4);
        l0.o(inflate, ProtectedSandApp.s("ᓽ\u0001"));
        return inflate;
    }

    public static /* synthetic */ View b(ViewGroup viewGroup, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return a(viewGroup, i4, z4);
    }

    public static final boolean c(@fg.l Rect rect, @fg.l Rect rect2) {
        l0.p(rect, ProtectedSandApp.s("ᓼ\u0001"));
        l0.p(rect2, ProtectedSandApp.s("ᓾ\u0001"));
        if (rect.isEmpty() || rect2.isEmpty()) {
            return false;
        }
        return Rect.intersects(rect, rect2);
    }

    @fg.l
    public static final String d(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("ᓿ\u0001"));
        return ProtectedSandApp.s("ᔀ\u0001") + str + ProtectedSandApp.s("ᔁ\u0001");
    }
}
