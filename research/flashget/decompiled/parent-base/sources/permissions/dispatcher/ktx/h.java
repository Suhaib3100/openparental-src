package permissions.dispatcher.ktx;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import permissions.dispatcher.ktx.g;

/* compiled from: PermissionRequestType.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\n\r\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lpermissions/dispatcher/ktx/h;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Lpermissions/dispatcher/ktx/g;", "b", "([Ljava/lang/String;)Lpermissions/dispatcher/ktx/g;", "c", "Lpermissions/dispatcher/ktx/h$a;", "Lpermissions/dispatcher/ktx/h$b;", "Lpermissions/dispatcher/ktx/h$c;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class h {

    /* compiled from: PermissionRequestType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpermissions/dispatcher/ktx/h$a;", "Lpermissions/dispatcher/ktx/h;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Lpermissions/dispatcher/ktx/g;", "b", "([Ljava/lang/String;)Lpermissions/dispatcher/ktx/g;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f88784a = new a(null);

        private a() {
            super(null);
        }

        @Override // permissions.dispatcher.ktx.h
        public boolean a(@fg.l Context context, @fg.l String[] permissions2) {
            l0.p(context, ProtectedSandApp.s("ꕫ\u0001"));
            l0.p(permissions2, ProtectedSandApp.s("ꕬ\u0001"));
            return og.g.b(context, (String[]) Arrays.copyOf(permissions2, permissions2.length));
        }

        @Override // permissions.dispatcher.ktx.h
        @fg.l
        public g b(@fg.l String[] permissions2) {
            l0.p(permissions2, ProtectedSandApp.s("ꕬ\u0001"));
            return g.a.INSTANCE.a(permissions2);
        }
    }

    /* compiled from: PermissionRequestType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpermissions/dispatcher/ktx/h$b;", "Lpermissions/dispatcher/ktx/h;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Lpermissions/dispatcher/ktx/g;", "b", "([Ljava/lang/String;)Lpermissions/dispatcher/ktx/g;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f88785a = new b(null);

        private b() {
            super(null);
        }

        @Override // permissions.dispatcher.ktx.h
        public boolean a(@fg.l Context context, @fg.l String[] permissions2) {
            l0.p(context, ProtectedSandApp.s("ꕭ\u0001"));
            l0.p(permissions2, ProtectedSandApp.s("ꕮ\u0001"));
            return Settings.canDrawOverlays(context);
        }

        @Override // permissions.dispatcher.ktx.h
        @fg.l
        @x0(23)
        public g b(@fg.l String[] permissions2) {
            l0.p(permissions2, ProtectedSandApp.s("ꕮ\u0001"));
            return g.b.INSTANCE.a(ProtectedSandApp.s("ꕯ\u0001"));
        }
    }

    /* compiled from: PermissionRequestType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpermissions/dispatcher/ktx/h$c;", "Lpermissions/dispatcher/ktx/h;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Lpermissions/dispatcher/ktx/g;", "b", "([Ljava/lang/String;)Lpermissions/dispatcher/ktx/g;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final c f88786a = new c(null);

        private c() {
            super(null);
        }

        @Override // permissions.dispatcher.ktx.h
        public boolean a(@fg.l Context context, @fg.l String[] permissions2) {
            l0.p(context, ProtectedSandApp.s("ꕰ\u0001"));
            l0.p(permissions2, ProtectedSandApp.s("ꕱ\u0001"));
            return Settings.System.canWrite(context);
        }

        @Override // permissions.dispatcher.ktx.h
        @fg.l
        @x0(23)
        public g b(@fg.l String[] permissions2) {
            l0.p(permissions2, ProtectedSandApp.s("ꕱ\u0001"));
            return g.b.INSTANCE.a(ProtectedSandApp.s("ꕲ\u0001"));
        }
    }

    public /* synthetic */ h(w wVar) {
        this();
    }

    public abstract boolean a(@fg.l Context context, @fg.l String[] permissions2);

    @fg.l
    public abstract g b(@fg.l String[] permissions2);

    private h() {
    }
}
