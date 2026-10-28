package org.apache.http;

import java.io.Serializable;
import org.apache.http.annotation.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class HttpVersion extends ProtocolVersion implements Serializable {
    public static final String HTTP = "HTTP";
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int i4, int i5) {
        super("HTTP", i4, i5);
    }

    @Override // org.apache.http.ProtocolVersion
    public ProtocolVersion forVersion(int i4, int i5) {
        if (i4 == this.major && i5 == this.minor) {
            return this;
        }
        if (i4 == 1) {
            if (i5 == 0) {
                return HTTP_1_0;
            }
            if (i5 == 1) {
                return HTTP_1_1;
            }
        }
        return (i4 == 0 && i5 == 9) ? HTTP_0_9 : new HttpVersion(i4, i5);
    }
}
