package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
public class h0 implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    private static final int f17297r = 1048576;

    /* renamed from: o, reason: collision with root package name */
    private final URL f17298o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.q0
    private volatile Future<?> f17299p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.q0
    private Task<Bitmap> f17300q;

    private h0(URL url) {
        this.f17298o = url;
    }

    private byte[] c() throws IOException {
        URLConnection openConnection = this.f17298o.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException(ProtectedSandApp.s("᠗"));
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] e6 = c.e(new c.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(ProtectedSandApp.s("᠕"), 2)) {
                int length = e6.length;
                Objects.toString(this.f17298o);
            }
            if (e6.length <= 1048576) {
                return e6;
            }
            throw new IOException(ProtectedSandApp.s("᠖"));
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
    public static h0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new h0(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e6) {
            taskCompletionSource.setException(e6);
        }
    }

    public Bitmap b() throws IOException {
        String s5 = ProtectedSandApp.s("᠘");
        if (Log.isLoggable(s5, 4)) {
            Objects.toString(this.f17298o);
        }
        byte[] c6 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c6, 0, c6.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(s5, 3)) {
                Objects.toString(this.f17298o);
            }
            return decodeByteArray;
        }
        throw new IOException(ProtectedSandApp.s("᠙") + this.f17298o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17299p.cancel(true);
    }

    public Task<Bitmap> e() {
        return (Task) Preconditions.checkNotNull(this.f17300q);
    }

    public void j(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f17299p = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.g(taskCompletionSource);
            }
        });
        this.f17300q = taskCompletionSource.getTask();
    }
}
