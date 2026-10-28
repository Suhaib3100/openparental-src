package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.util.WeakHashMap;

/* compiled from: DisplayManagerCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4822a;

    /* renamed from: c, reason: collision with root package name */
    public static final String f4821c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, a> f4820b = new WeakHashMap<>();

    /* compiled from: DisplayManagerCompat.java */
    @x0(17)
    /* renamed from: androidx.core.hardware.display.a$a, reason: collision with other inner class name */
    static class C0039a {
        private C0039a() {
        }

        @u
        static Display a(DisplayManager displayManager, int i5) {
            return displayManager.getDisplay(i5);
        }

        @u
        static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    private a(Context context) {
        this.f4822a = context;
    }

    @o0
    public static a d(@o0 Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f4820b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @q0
    public Display a(int i5) {
        return C0039a.a((DisplayManager) this.f4822a.getSystemService("display"), i5);
    }

    @o0
    public Display[] b() {
        return C0039a.b((DisplayManager) this.f4822a.getSystemService("display"));
    }

    @o0
    public Display[] c(@q0 String str) {
        return C0039a.b((DisplayManager) this.f4822a.getSystemService("display"));
    }
}
