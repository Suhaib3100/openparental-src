package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class BasicScopeLimitCredentialProvider implements ScopeLimitCredentialProvider {
    private static final int MAX_CACHE_CREDENTIAL_SIZE = 100;
    private Map<Integer, SessionQCloudCredentials> credentialPairs = new HashMap(100);

    private synchronized void cacheCredentialsAndCleanUp(int i4, SessionQCloudCredentials sessionQCloudCredentials) {
        try {
            Iterator<Map.Entry<Integer, SessionQCloudCredentials>> it = this.credentialPairs.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    it.remove();
                }
            }
            if (this.credentialPairs.size() > 100) {
                int size = this.credentialPairs.size() - 100;
                Iterator<Map.Entry<Integer, SessionQCloudCredentials>> it2 = this.credentialPairs.entrySet().iterator();
                while (it2.hasNext()) {
                    int i5 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it2.remove();
                    size = i5;
                }
            }
            this.credentialPairs.put(Integer.valueOf(i4), sessionQCloudCredentials);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized SessionQCloudCredentials lookupValidCredentials(int i4) {
        SessionQCloudCredentials sessionQCloudCredentials = this.credentialPairs.get(Integer.valueOf(i4));
        if (sessionQCloudCredentials != null) {
            if (sessionQCloudCredentials.isValid()) {
                return sessionQCloudCredentials;
            }
        }
        return null;
    }

    protected abstract SessionQCloudCredentials fetchNewCredentials(STSCredentialScope[] sTSCredentialScopeArr) throws QCloudClientException;

    @Override // com.tencent.qcloud.core.auth.ScopeLimitCredentialProvider
    public SessionQCloudCredentials getCredentials(STSCredentialScope[] sTSCredentialScopeArr) throws QCloudClientException {
        int hashCode = STSCredentialScope.jsonify(sTSCredentialScopeArr).hashCode();
        SessionQCloudCredentials lookupValidCredentials = lookupValidCredentials(hashCode);
        if (lookupValidCredentials != null) {
            return lookupValidCredentials;
        }
        SessionQCloudCredentials fetchNewCredentials = fetchNewCredentials(sTSCredentialScopeArr);
        cacheCredentialsAndCleanUp(hashCode, fetchNewCredentials);
        return fetchNewCredentials;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public void refresh() {
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentialProvider
    public QCloudCredentials getCredentials() throws QCloudClientException {
        throw new UnsupportedOperationException(ProtectedSandApp.s("壇\u0001"));
    }
}
