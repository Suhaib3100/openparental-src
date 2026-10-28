package b1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: DisplayManagerCompat.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f36695b = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a, reason: collision with root package name */
    private final Context f36696a;

    private a(Context context) {
        this.f36696a = context;
    }

    @o0
    public static a d(@o0 Context context) {
        return new a(context);
    }

    @q0
    public Display a(int i4) {
        return ((DisplayManager) this.f36696a.getSystemService("display")).getDisplay(i4);
    }

    @o0
    public Display[] b() {
        return ((DisplayManager) this.f36696a.getSystemService("display")).getDisplays();
    }

    @o0
    public Display[] c(@q0 String str) {
        return ((DisplayManager) this.f36696a.getSystemService("display")).getDisplays();
    }
}
