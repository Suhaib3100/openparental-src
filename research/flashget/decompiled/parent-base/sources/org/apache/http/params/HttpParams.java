package org.apache.http.params;

@Deprecated
/* loaded from: classes3.dex */
public interface HttpParams {
    HttpParams copy();

    boolean getBooleanParameter(String str, boolean z4);

    double getDoubleParameter(String str, double d5);

    int getIntParameter(String str, int i4);

    long getLongParameter(String str, long j4);

    Object getParameter(String str);

    boolean isParameterFalse(String str);

    boolean isParameterTrue(String str);

    boolean removeParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z4);

    HttpParams setDoubleParameter(String str, double d5);

    HttpParams setIntParameter(String str, int i4);

    HttpParams setLongParameter(String str, long j4);

    HttpParams setParameter(String str, Object obj);
}
