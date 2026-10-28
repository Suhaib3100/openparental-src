package n2;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    @KeepForSdk
    /* renamed from: n2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0462a {
        @KeepForSdk
        void a(String str);
    }

    @KeepForSdk
    void a(@o0 String str, @o0 String str2) throws IOException;

    @KeepForSdk
    void b(InterfaceC0462a interfaceC0462a);

    @o0
    @KeepForSdk
    Task<String> c();

    @q0
    @KeepForSdk
    String d();

    @KeepForSdk
    String getId();
}
