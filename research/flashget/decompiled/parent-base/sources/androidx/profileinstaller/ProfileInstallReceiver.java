package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.profileinstaller.i;

/* loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @o0
    public static final String f32718a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* renamed from: b, reason: collision with root package name */
    @o0
    public static final String f32719b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* renamed from: c, reason: collision with root package name */
    @o0
    public static final String f32720c = "androidx.profileinstaller.action.SKIP_FILE";

    /* renamed from: d, reason: collision with root package name */
    @o0
    public static final String f32721d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* renamed from: e, reason: collision with root package name */
    @o0
    private static final String f32722e = "EXTRA_SKIP_FILE_OPERATION";

    /* renamed from: f, reason: collision with root package name */
    @o0
    private static final String f32723f = "WRITE_SKIP_FILE";

    /* renamed from: g, reason: collision with root package name */
    @o0
    private static final String f32724g = "DELETE_SKIP_FILE";

    /* renamed from: h, reason: collision with root package name */
    @o0
    private static final String f32725h = "EXTRA_BENCHMARK_OPERATION";

    /* renamed from: i, reason: collision with root package name */
    @o0
    private static final String f32726i = "DROP_SHADER_CACHE";

    class a implements i.d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i4, @q0 Object obj) {
            i.f32769h.a(i4, obj);
            ProfileInstallReceiver.this.setResultCode(i4);
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i4, @q0 Object obj) {
            i.f32769h.b(i4, obj);
        }
    }

    static void a(@o0 i.d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@o0 Context context, @q0 Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            i.n(context, new androidx.credentials.k(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    i.o(context, new androidx.credentials.k(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        i.d(context, new androidx.credentials.k(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
