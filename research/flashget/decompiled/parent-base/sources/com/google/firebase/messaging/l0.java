package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: ImageDownload.java */
/* loaded from: classes6.dex */
public class l0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f60212e = 1048576;

    /* renamed from: b, reason: collision with root package name */
    private final URL f60213b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private volatile Future<?> f60214c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private Task<Bitmap> f60215d;

    private l0(URL url) {
        this.f60213b = url;
    }

    private byte[] c() throws IOException {
        URLConnection openConnection = this.f60213b.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException(ProtectedSandApp.s("ɽ\u0001"));
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] e4 = c.e(new c.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(ProtectedSandApp.s("ɻ\u0001"), 2)) {
                int length = e4.length;
                Objects.toString(this.f60213b);
            }
            if (e4.length <= 1048576) {
                return e4;
            }
            throw new IOException(ProtectedSandApp.s("ɼ\u0001"));
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @androidx.annotation.q0
    public static l0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new l0(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    public Bitmap b() throws IOException {
        String s4 = ProtectedSandApp.s("ɻ\u0001");
        if (Log.isLoggable(s4, 4)) {
            Objects.toString(this.f60213b);
        }
        byte[] c5 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c5, 0, c5.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(s4, 3)) {
                Objects.toString(this.f60213b);
            }
            return decodeByteArray;
        }
        throw new IOException(ProtectedSandApp.s("ɾ\u0001") + this.f60213b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f60214c.cancel(true);
    }

    public Task<Bitmap> e() {
        return (Task) Preconditions.checkNotNull(this.f60215d);
    }

    public void g(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f60214c = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.k0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.f(taskCompletionSource);
            }
        });
        this.f60215d = taskCompletionSource.getTask();
    }
}
