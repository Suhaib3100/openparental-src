package ya;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AspectRatio.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f93294b = new a(255);

    /* renamed from: a, reason: collision with root package name */
    private int f93295a;

    private a(int i4) {
        this.f93295a = i4;
    }

    public static a a(int i4) {
        a aVar = f93294b;
        return i4 == aVar.f93295a ? aVar : new a(i4);
    }

    public int b() {
        return this.f93295a;
    }

    public String toString() {
        return androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("㣝\u0001")), this.f93295a, '}');
    }
}
