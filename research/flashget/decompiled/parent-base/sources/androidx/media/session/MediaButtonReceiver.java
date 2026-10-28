package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.c1;
import androidx.appcompat.view.g;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30939a = "MediaButtonReceiver";

    private static class a extends MediaBrowserCompat.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Context f30940a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f30941b;

        /* renamed from: c, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f30942c;

        /* renamed from: d, reason: collision with root package name */
        private MediaBrowserCompat f30943d;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f30940a = context;
            this.f30941b = intent;
            this.f30942c = pendingResult;
        }

        private void a() {
            this.f30943d.disconnect();
            this.f30942c.finish();
        }

        void b(MediaBrowserCompat mediaBrowserCompat) {
            this.f30943d = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            try {
                new MediaControllerCompat(this.f30940a, this.f30943d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f30941b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            a();
        }
    }

    public static PendingIntent a(Context context, long j4) {
        ComponentName c5 = c(context);
        if (c5 == null) {
            return null;
        }
        return b(context, c5, j4);
    }

    public static PendingIntent b(Context context, ComponentName componentName, long j4) {
        int keyCode;
        if (componentName == null || (keyCode = PlaybackStateCompat.toKeyCode(j4)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        return PendingIntent.getBroadcast(context, keyCode, intent, 0);
    }

    @c1({c1.a.LIBRARY})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder a5 = g.a("Expected 1 service that handles ", str, ", found ");
        a5.append(queryIntentServices.size());
        throw new IllegalStateException(a5.toString());
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    private static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName d5 = d(context, "android.intent.action.MEDIA_BUTTON");
        if (d5 != null) {
            intent.setComponent(d5);
            f(context, intent);
            return;
        }
        ComponentName d6 = d(context, "android.media.browse.MediaBrowserService");
        if (d6 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        a aVar = new a(applicationContext, intent, goAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d6, aVar, null);
        aVar.b(mediaBrowserCompat);
        mediaBrowserCompat.connect();
    }
}
