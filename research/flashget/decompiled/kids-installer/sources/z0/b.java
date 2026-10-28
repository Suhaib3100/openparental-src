package z0;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.u3;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.flashget.kidsdownloader.utils.f0;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.apache.log4j.Logger;

/* compiled from: SandNotificationChannelManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/flashget/kid/common/ui/notification/SandNotificationChannelManager;", "", "()V", "Companion", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final Logger f34386b;

    /* renamed from: c, reason: collision with root package name */
    @d
    public static final String f34387c = ProtectedSandApp.s("ᮻ");

    /* renamed from: d, reason: collision with root package name */
    @d
    public static final String f34388d = ProtectedSandApp.s("ᮼ");

    /* renamed from: e, reason: collision with root package name */
    @d
    public static final String f34389e = ProtectedSandApp.s("ᮽ");

    /* renamed from: f, reason: collision with root package name */
    @d
    public static final String f34390f = ProtectedSandApp.s("ᮾ");

    /* renamed from: g, reason: collision with root package name */
    @d
    public static final String f34391g = ProtectedSandApp.s("ᮿ");

    /* renamed from: h, reason: collision with root package name */
    @d
    public static final String f34392h = ProtectedSandApp.s("ᯀ");

    /* renamed from: i, reason: collision with root package name */
    @d
    public static final String f34393i = ProtectedSandApp.s("ᯁ");

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f34385a = new a(null);

    /* compiled from: SandNotificationChannelManager.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J \u0010\u001a\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/flashget/kid/common/ui/notification/SandNotificationChannelManager$Companion;", "", "()V", "NOTIFICATION_COMMON_ID", "", "NOTIFICATION_CONNECTED_ID", "NOTIFICATION_CONNECTED_ID_QUIET", "NOTIFICATION_CONNECTION_ID", "NOTIFICATION_CONNECTION_ID_HIGH", "NOTIFICATION_FEATURE_ID", "NOTIFICATION_FEATURE_ID_SILENT", "logger", "Lorg/apache/log4j/Logger;", "getLogger", "()Lorg/apache/log4j/Logger;", "createConnectionChannel", "", "context", "Landroid/content/Context;", "is_show", "", "createHighChannel", "is_sound", "createLowChannel", "getChannelName", "id", "initChannels", "isHideNotificationChannel", "channel", "toHideNotificationChannel", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSandNotificationChannelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SandNotificationChannelManager.kt\ncom/flashget/kid/common/ui/notification/SandNotificationChannelManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a {
        private a() {
        }

        private final void a(Context context, boolean z5) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel(ProtectedSandApp.s("ᮩ"), "", 3);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        private final void c(Context context, boolean z5) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel(ProtectedSandApp.s("᮪"), "", 2);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        private final String d(Context context, String str) {
            return "";
        }

        public final void b(@d Context context, boolean z5) {
            l0.p(context, ProtectedSandApp.s("᮫"));
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(new NotificationChannel(ProtectedSandApp.s("ᮬ"), "", 4));
            notificationManager.createNotificationChannel(new NotificationChannel(ProtectedSandApp.s("ᮭ"), "", 4));
        }

        @d
        public final Logger e() {
            return b.f34386b;
        }

        public final void f(@e Context context, boolean z5, boolean z6) {
            b.f34386b.debug(ProtectedSandApp.s("ᮮ") + context + ProtectedSandApp.s("ᮯ") + z5 + ProtectedSandApp.s("᮰") + z6);
            if (context == null || !f0.l()) {
                return;
            }
            b(context, z6);
            c(context, z5);
            a(context, z5);
        }

        public final boolean g(@d Context context, @d String str) {
            Integer num;
            int importance;
            int importance2;
            l0.p(context, ProtectedSandApp.s("᮱"));
            l0.p(str, ProtectedSandApp.s("᮲"));
            u3 p5 = u3.p(context);
            l0.o(p5, ProtectedSandApp.s("᮳"));
            NotificationChannel s5 = p5.s(str);
            Logger logger = b.f34386b;
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("᮴"));
            sb.append(p5.a());
            sb.append(ProtectedSandApp.s("᮵"));
            Integer num2 = null;
            if (s5 != null) {
                importance2 = s5.getImportance();
                num = Integer.valueOf(importance2);
            } else {
                num = null;
            }
            sb.append(num);
            logger.debug(sb.toString());
            if (s5 != null) {
                importance = s5.getImportance();
                num2 = Integer.valueOf(importance);
            }
            return (num2 != null && num2.intValue() == 0) || !p5.a();
        }

        public final void h(@d Context context, @d String str) {
            l0.p(context, ProtectedSandApp.s("᮶"));
            l0.p(str, ProtectedSandApp.s("᮷"));
            Intent intent = new Intent(ProtectedSandApp.s("᮸"));
            intent.putExtra(ProtectedSandApp.s("᮹"), context.getPackageName());
            intent.putExtra(ProtectedSandApp.s("ᮺ"), str);
            context.startActivity(intent);
        }

        public a(w wVar) {
        }
    }

    static {
        Logger logger = Logger.getLogger(ProtectedSandApp.s("ᯂ"));
        l0.o(logger, ProtectedSandApp.s("ᯃ"));
        f34386b = logger;
    }
}
