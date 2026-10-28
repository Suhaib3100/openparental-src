package org.apache.http.params;

import java.util.Set;

@Deprecated
/* loaded from: classes3.dex */
public abstract class AbstractHttpParams implements HttpParams, HttpParamsNames {
    protected AbstractHttpParams() {
    }

    @Override // org.apache.http.params.HttpParams
    public boolean getBooleanParameter(String str, boolean z4) {
        Object parameter = getParameter(str);
        return parameter == null ? z4 : ((Boolean) parameter).booleanValue();
    }

    @Override // org.apache.http.params.HttpParams
    public double getDoubleParameter(String str, double d5) {
        Object parameter = getParameter(str);
        return parameter == null ? d5 : ((Double) parameter).doubleValue();
    }

    @Override // org.apache.http.params.HttpParams
    public int getIntParameter(String str, int i4) {
        Object parameter = getParameter(str);
        return parameter == null ? i4 : ((Integer) parameter).intValue();
    }

    @Override // org.apache.http.params.HttpParams
    public long getLongParameter(String str, long j4) {
        Object parameter = getParameter(str);
        return parameter == null ? j4 : ((Long) parameter).longValue();
    }

    @Override // org.apache.http.params.HttpParamsNames
    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setBooleanParameter(String str, boolean z4) {
        setParameter(str, z4 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setDoubleParameter(String str, double d5) {
        setParameter(str, Double.valueOf(d5));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setIntParameter(String str, int i4) {
        setParameter(str, Integer.valueOf(i4));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setLongParameter(String str, long j4) {
        setParameter(str, Long.valueOf(j4));
        return this;
    }
}
