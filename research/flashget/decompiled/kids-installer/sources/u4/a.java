package u4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BasicCertificateChainCleaner.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0018"}, d2 = {"Lu4/a;", "Lu4/c;", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "hashCode", "", "other", "equals", "Lu4/e;", "Lu4/e;", "trustRootIndex", "<init>", "(Lu4/e;)V", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f33731c = 9;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e trustRootIndex;

    public a(@d5.d e eVar) {
        l0.p(eVar, ProtectedSandApp.s("鑦"));
        this.trustRootIndex = eVar;
    }

    private final boolean b(X509Certificate toVerify, X509Certificate signingCert) {
        if (!l0.g(toVerify.getIssuerDN(), signingCert.getSubjectDN())) {
            return false;
        }
        try {
            toVerify.verify(signingCert.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // u4.c
    @d5.d
    public List<Certificate> a(@d5.d List<? extends Certificate> chain, @d5.d String hostname) throws SSLPeerUnverifiedException {
        l0.p(chain, ProtectedSandApp.s("鑧"));
        l0.p(hostname, ProtectedSandApp.s("鑨"));
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l0.o(removeFirst, ProtectedSandApp.s("鑩"));
        arrayList.add(removeFirst);
        boolean z5 = false;
        for (int i5 = 0; i5 < 9; i5++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            String s5 = ProtectedSandApp.s("鑪");
            if (obj == null) {
                throw new NullPointerException(s5);
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a6 = this.trustRootIndex.a(x509Certificate);
            if (a6 == null) {
                Iterator it = arrayDeque.iterator();
                l0.o(it, ProtectedSandApp.s("鑫"));
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException(s5);
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z5) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(ProtectedSandApp.s("鑬") + x509Certificate);
            }
            if (arrayList.size() > 1 || (!l0.g(x509Certificate, a6))) {
                arrayList.add(a6);
            }
            if (b(a6, a6)) {
                return arrayList;
            }
            z5 = true;
        }
        throw new SSLPeerUnverifiedException(ProtectedSandApp.s("鑭") + arrayList);
    }

    public boolean equals(@d5.e Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof a) && l0.g(((a) other).trustRootIndex, this.trustRootIndex);
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
