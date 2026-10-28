package org.apache.http.params;

@Deprecated
/* loaded from: classes3.dex */
public class HttpConnectionParamBean extends HttpAbstractParamBean {
    public HttpConnectionParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setConnectionTimeout(int i4) {
        HttpConnectionParams.setConnectionTimeout(this.params, i4);
    }

    public void setLinger(int i4) {
        HttpConnectionParams.setLinger(this.params, i4);
    }

    public void setSoTimeout(int i4) {
        HttpConnectionParams.setSoTimeout(this.params, i4);
    }

    public void setSocketBufferSize(int i4) {
        HttpConnectionParams.setSocketBufferSize(this.params, i4);
    }

    public void setStaleCheckingEnabled(boolean z4) {
        HttpConnectionParams.setStaleCheckingEnabled(this.params, z4);
    }

    public void setTcpNoDelay(boolean z4) {
        HttpConnectionParams.setTcpNoDelay(this.params, z4);
    }
}
