package org.apache.commons.lang3.builder;

import java.util.Collection;

/* compiled from: RecursiveToStringStyle.java */
/* loaded from: classes6.dex */
public class n extends t {
    private static final long E = 1;

    @Override // org.apache.commons.lang3.builder.t
    public void D(StringBuffer stringBuffer, String str, Object obj) {
        if (org.apache.commons.lang3.s.V(obj.getClass()) || String.class.equals(obj.getClass()) || !i1(obj.getClass())) {
            stringBuffer.append(obj);
        } else {
            stringBuffer.append(p.A0(obj, this));
        }
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void E(StringBuffer stringBuffer, String str, Collection<?> collection) {
        s(stringBuffer, collection);
        V(stringBuffer, collection);
        O(stringBuffer, str, collection.toArray());
    }

    protected boolean i1(Class<?> cls) {
        return true;
    }
}
