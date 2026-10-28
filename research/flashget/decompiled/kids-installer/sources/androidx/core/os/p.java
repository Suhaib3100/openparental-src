package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: MessageCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4987a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4988b = true;

    /* compiled from: MessageCompat.java */
    @x0(22)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @androidx.annotation.u
        static void b(Message message, boolean z5) {
            message.setAsynchronous(z5);
        }
    }

    private p() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@o0 Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void b(@o0 Message message, boolean z5) {
        a.b(message, z5);
    }
}
