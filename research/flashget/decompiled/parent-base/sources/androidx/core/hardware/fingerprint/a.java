package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.os.f;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: FingerprintManagerCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26327a;

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    class C0415a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f26328a;

        C0415a(c cVar) {
            this.f26328a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i4, CharSequence charSequence) {
            this.f26328a.a(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f26328a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i4, CharSequence charSequence) {
            this.f26328a.c(i4, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f26328a.d(new d(b.f(authenticationResult.getCryptoObject())));
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        @b1("android.permission.USE_FINGERPRINT")
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i4, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i4, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @b1("android.permission.USE_FINGERPRINT")
        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @b1("android.permission.USE_FINGERPRINT")
        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

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
        public void a(int i4, @o0 CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i4, @o0 CharSequence charSequence) {
        }

        public void d(@o0 d dVar) {
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f26329a;

        public d(@o0 e eVar) {
            this.f26329a = eVar;
        }

        @o0
        public e a() {
            return this.f26329a;
        }
    }

    private a(Context context) {
        this.f26327a = context;
    }

    @o0
    public static a c(@o0 Context context) {
        return new a(context);
    }

    @q0
    @x0(23)
    private static FingerprintManager d(@o0 Context context) {
        return b.c(context);
    }

    @x0(23)
    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @x0(23)
    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0415a(cVar);
    }

    @x0(23)
    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    @b1("android.permission.USE_FINGERPRINT")
    public void a(@q0 e eVar, int i4, @q0 CancellationSignal cancellationSignal, @o0 c cVar, @q0 Handler handler) {
        FingerprintManager c5 = b.c(this.f26327a);
        if (c5 != null) {
            c5.authenticate(b.g(eVar), cancellationSignal, i4, new C0415a(cVar), handler);
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @b1("android.permission.USE_FINGERPRINT")
    @Deprecated
    public void b(@q0 e eVar, int i4, @q0 f fVar, @o0 c cVar, @q0 Handler handler) {
        a(eVar, i4, fVar != null ? (CancellationSignal) fVar.b() : null, cVar, handler);
    }

    @b1("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c5 = b.c(this.f26327a);
        return c5 != null && c5.hasEnrolledFingerprints();
    }

    @b1("android.permission.USE_FINGERPRINT")
    public boolean f() {
        FingerprintManager c5 = b.c(this.f26327a);
        return c5 != null && c5.isHardwareDetected();
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f26330a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f26331b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f26332c;

        public e(@o0 Signature signature) {
            this.f26330a = signature;
            this.f26331b = null;
            this.f26332c = null;
        }

        @q0
        public Cipher a() {
            return this.f26331b;
        }

        @q0
        public Mac b() {
            return this.f26332c;
        }

        @q0
        public Signature c() {
            return this.f26330a;
        }

        public e(@o0 Cipher cipher) {
            this.f26331b = cipher;
            this.f26330a = null;
            this.f26332c = null;
        }

        public e(@o0 Mac mac) {
            this.f26332c = mac;
            this.f26331b = null;
            this.f26330a = null;
        }
    }
}
