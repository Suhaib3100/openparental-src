package ya;

import androidx.compose.animation.l;
import androidx.core.view.h0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ScalingList.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int[] f93340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f93341b;

    public static f a(com.googlecode.mp4parser.h264.read.b bVar, int i4) throws IOException {
        f fVar = new f();
        fVar.f93340a = new int[i4];
        int i5 = 8;
        int i6 = 0;
        int i7 = 8;
        while (i6 < i4) {
            if (i5 != 0) {
                i5 = ((bVar.t(ProtectedSandApp.s("㤣\u0001")) + i7) + 256) % 256;
                fVar.f93341b = i6 == 0 && i5 == 0;
            }
            int[] iArr = fVar.f93340a;
            if (i5 != 0) {
                i7 = i5;
            }
            iArr[i6] = i7;
            i6++;
        }
        return fVar;
    }

    public void b(za.b bVar) throws IOException {
        boolean z4 = this.f93341b;
        String s4 = ProtectedSandApp.s("㤤\u0001");
        int i4 = 0;
        if (z4) {
            bVar.i(0, s4);
            return;
        }
        int i5 = 8;
        while (true) {
            int[] iArr = this.f93340a;
            if (i4 >= iArr.length) {
                return;
            }
            bVar.i((iArr[i4] - i5) + h0.f27194u, s4);
            i5 = this.f93340a[i4];
            i4++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㤥\u0001"));
        sb.append(this.f93340a);
        sb.append(ProtectedSandApp.s("㤦\u0001"));
        return l.a(sb, this.f93341b, '}');
    }
}
