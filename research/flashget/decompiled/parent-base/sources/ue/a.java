package ue;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"Lue/a;", "Lue/c;", "Lue/e;", "trustRootIndex", "<init>", "(Lue/e;)V", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lue/e;", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f92764c = 9;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e trustRootIndex;

    public a(@l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("⁵"));
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

    @Override // ue.c
    @l
    public List<Certificate> a(@l List<? extends Certificate> chain, @l String hostname) throws SSLPeerUnverifiedException {
        l0.p(chain, ProtectedSandApp.s("⁶"));
        l0.p(hostname, ProtectedSandApp.s("⁷"));
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l0.o(removeFirst, ProtectedSandApp.s("⁸"));
        arrayList.add(removeFirst);
        boolean z4 = false;
        for (int i4 = 0; i4 < 9; i4++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            String s4 = ProtectedSandApp.s("⁹");
            if (obj == null) {
                throw new NullPointerException(s4);
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a5 = this.trustRootIndex.a(x509Certificate);
            if (a5 == null) {
                Iterator it = arrayDeque.iterator();
                l0.o(it, ProtectedSandApp.s("⁺"));
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException(s4);
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z4) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(ProtectedSandApp.s("⁻") + x509Certificate);
            }
            if (arrayList.size() > 1 || !l0.g(x509Certificate, a5)) {
                arrayList.add(a5);
            }
            if (b(a5, a5)) {
                return arrayList;
            }
            z4 = true;
        }
        throw new SSLPeerUnverifiedException(ProtectedSandApp.s("⁼") + arrayList);
    }

    public boolean equals(@m Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof a) && l0.g(((a) other).trustRootIndex, this.trustRootIndex);
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
