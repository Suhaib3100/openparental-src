package x9;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
@KeepForSdk
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    @KeepForSdk
    /* renamed from: x9.a$a, reason: collision with other inner class name */
    public interface InterfaceC1405a {
        @KeepForSdk
        void a(String str);
    }

    @KeepForSdk
    String a();

    @q0
    @KeepForSdk
    String b();

    @KeepForSdk
    void c(@o0 String str, @o0 String str2) throws IOException;

    @o0
    @KeepForSdk
    Task<String> d();

    @KeepForSdk
    void e(InterfaceC1405a interfaceC1405a);
}
