package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: FingerprintManagerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4823a;

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    class C0040a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4824a;

        C0040a(c cVar) {
            this.f4824a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i5, CharSequence charSequence) {
            this.f4824a.a(i5, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f4824a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i5, CharSequence charSequence) {
            this.f4824a.c(i5, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f4824a.d(new d(b.f(b.b(authenticationResult))));
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        @u
        @b1("android.permission.USE_FINGERPRINT")
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i5, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i5, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @u
        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @u
        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @u
        @b1("android.permission.USE_FINGERPRINT")
        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @u
        @b1("android.permission.USE_FINGERPRINT")
        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @u
        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        @u
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static abstract class c {
        public void a(int i5, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i5, CharSequence charSequence) {
        }

        public void d(d dVar) {
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f4825a;

        public d(e eVar) {
            this.f4825a = eVar;
        }

        public e a() {
            return this.f4825a;
        }
    }

    private a(Context context) {
        this.f4823a = context;
    }

    @o0
    public static a b(@o0 Context context) {
        return new a(context);
    }

    @q0
    @x0(23)
    private static FingerprintManager c(@o0 Context context) {
        return b.c(context);
    }

    @x0(23)
    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @x0(23)
    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0040a(cVar);
    }

    @x0(23)
    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    @b1("android.permission.USE_FINGERPRINT")
    public void a(@q0 e eVar, int i5, @q0 androidx.core.os.c cVar, @o0 c cVar2, @q0 Handler handler) {
        FingerprintManager c6 = b.c(this.f4823a);
        if (c6 != null) {
            b.a(c6, b.g(eVar), cVar != null ? (CancellationSignal) cVar.b() : null, i5, new C0040a(cVar2), handler);
        }
    }

    @b1("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager c6 = b.c(this.f4823a);
        return c6 != null && b.d(c6);
    }

    @b1("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c6 = b.c(this.f4823a);
        return c6 != null && b.e(c6);
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f4826a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f4827b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f4828c;

        public e(@o0 Signature signature) {
            this.f4826a = signature;
            this.f4827b = null;
            this.f4828c = null;
        }

        @q0
        public Cipher a() {
            return this.f4827b;
        }

        @q0
        public Mac b() {
            return this.f4828c;
        }

        @q0
        public Signature c() {
            return this.f4826a;
        }

        public e(@o0 Cipher cipher) {
            this.f4827b = cipher;
            this.f4826a = null;
            this.f4828c = null;
        }

        public e(@o0 Mac mac) {
            this.f4828c = mac;
            this.f4827b = null;
            this.f4826a = null;
        }
    }
}
